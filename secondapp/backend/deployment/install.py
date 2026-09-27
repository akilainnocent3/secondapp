"""Install this backend on the inspected Debian host; run as root.

Usage: .venv/bin/python deployment/install.py /path/to/private/bootstrap.env
The database password belongs in the private input file, never in this script.
"""

import os
import pwd
import secrets
import shutil
import subprocess
import sys
from datetime import datetime, timezone
from pathlib import Path

from psycopg import sql

SOURCE = Path(__file__).resolve().parents[1]
ROOT = Path('/srv/soccerarena')
PYTHON = ROOT / 'venv/bin/python'
ENV_PATH = Path('/etc/soccerarena/backend.env')


def run(args, **kwargs):
    return subprocess.run([str(arg) for arg in args], check=True, **kwargs)


def psql(statement):
    result = subprocess.run(['runuser', '-u', 'postgres', '--', 'psql', '-X', '-v',
        'ON_ERROR_STOP=1', '-d', 'postgres', '-At'], input=statement, text=True,
        capture_output=True)
    if result.returncode:
        raise RuntimeError('Database provisioning failed; inspect PostgreSQL logs.')
    return result.stdout.strip()


def read_env(path):
    return dict(line.split('=', 1) for line in path.read_text().splitlines() if line and not line.startswith('#'))


def main():
    if os.geteuid() != 0:
        raise SystemExit('Run as root.')
    bootstrap = Path(sys.argv[1])
    try:
        pwd.getpwnam('soccerarena')
    except KeyError:
        run(['useradd', '--system', '--user-group', '--no-create-home', '--home-dir', ROOT, '--shell', '/usr/sbin/nologin', 'soccerarena'])
    release = ROOT / 'releases' / datetime.now(timezone.utc).strftime('%Y%m%dT%H%M%SZ')
    release.parent.mkdir(parents=True, exist_ok=True)
    shutil.copytree(SOURCE, release, ignore=shutil.ignore_patterns('.git', '.agents', '.codex', '.venv', '.env', '*.sqlite3', '__pycache__', 'staticfiles'))
    run(['/usr/bin/python3', '-m', 'venv', ROOT / 'venv'])
    run([PYTHON, '-m', 'pip', 'install', '--disable-pip-version-check', '--no-cache-dir', '-r', release / 'requirements.txt'])
    run([PYTHON, '-m', 'pip', 'check'])

    ENV_PATH.parent.mkdir(mode=0o700, parents=True, exist_ok=True)
    if not ENV_PATH.exists():
        descriptor = os.open(ENV_PATH, os.O_WRONLY | os.O_CREAT | os.O_EXCL, 0o600)
        with os.fdopen(descriptor, 'w') as handle:
            handle.write(bootstrap.read_text())
    env = {**os.environ, **read_env(ENV_PATH), 'PYTHONDONTWRITEBYTECODE': '1'}
    if not psql("SELECT 1 FROM pg_roles WHERE rolname='soccerarena';"):
        psql(sql.SQL('CREATE ROLE soccerarena LOGIN NOSUPERUSER NOCREATEDB NOCREATEROLE PASSWORD {};').format(sql.Literal(env['PGPASSWORD'])).as_string())
    if not psql("SELECT 1 FROM pg_database WHERE datname='soccerarena';"):
        psql('CREATE DATABASE soccerarena OWNER soccerarena;')

    # Exercise row locks and refresh races against a disposable PostgreSQL DB.
    # The production role never receives CREATEDB or superuser privileges.
    test_role = 'soccerarena_test_' + secrets.token_hex(4)
    test_password = secrets.token_urlsafe(32)
    psql(sql.SQL('CREATE ROLE {} LOGIN CREATEDB PASSWORD {};').format(sql.Identifier(test_role), sql.Literal(test_password)).as_string())
    test_env = {**env, 'DEBUG': '1', 'SECURE_SSL_REDIRECT': '0', 'DJANGO_SECRET_KEY': secrets.token_urlsafe(64),
        'PGUSER': test_role, 'PGPASSWORD': test_password, 'PGDATABASE': test_role,
        'ALLOWED_HOSTS': 'testserver,localhost,127.0.0.1,api.soccerarena.org'}
    try:
        psql(sql.SQL('CREATE DATABASE {} OWNER {};').format(sql.Identifier(test_role), sql.Identifier(test_role)).as_string())
        run([PYTHON, 'manage.py', 'test', '--settings=config.test_settings', '--noinput', '--verbosity=1'], cwd=release, env=test_env)
    finally:
        psql(sql.SQL('DROP DATABASE IF EXISTS {};').format(sql.Identifier('test_' + test_role)).as_string())
        psql(sql.SQL('DROP DATABASE IF EXISTS {};').format(sql.Identifier(test_role)).as_string())
        psql(sql.SQL('DROP ROLE {};').format(sql.Identifier(test_role)).as_string())

    def manage(*args, extra_env=None):
        run(['runuser', '-u', 'soccerarena', '--preserve-environment', '--', PYTHON,
            'manage.py', *args], cwd=release, env={**env, **(extra_env or {})})

    manage('check')
    manage('makemigrations', '--check', '--dry-run')
    manage('migrate', '--noinput')
    manage('createcachetable')
    # Collect as root; the application/static tree remains read-only to workers.
    run([PYTHON, 'manage.py', 'collectstatic', '--noinput'], cwd=release, env=env)
    manage('check', '--deploy', extra_env={'SECURE_SSL_REDIRECT': '1'})

    current = ROOT / 'current'
    next_link = ROOT / 'current.next'
    next_link.symlink_to(release)
    next_link.replace(current)
    deployment = release / 'deployment'
    for unit in ['soccerarena.service', 'soccerarena-https.service', 'soccerarena-https.timer']:
        shutil.copyfile(deployment / unit, Path('/etc/systemd/system') / unit)
    snippet = Path('/etc/nginx/snippets/soccerarena-proxy.conf')
    shutil.copyfile(deployment / 'soccerarena-proxy.conf', snippet)
    site = Path('/etc/nginx/sites-available/api.soccerarena.org')
    tls_ready = Path('/etc/letsencrypt/live/api.soccerarena.org/fullchain.pem').exists()
    shutil.copyfile(deployment / ('nginx-https.conf' if tls_ready else 'nginx-http.conf'), site)
    enabled = Path('/etc/nginx/sites-enabled/api.soccerarena.org')
    if not enabled.exists():
        enabled.symlink_to(site)
    Path('/var/www/soccerarena-acme').mkdir(mode=0o755, parents=True, exist_ok=True)
    hook = Path('/etc/letsencrypt/renewal-hooks/deploy/soccerarena-reload-nginx')
    hook.parent.mkdir(parents=True, exist_ok=True)
    hook.write_text('#!/bin/sh\nset -eu\n/usr/sbin/nginx -t\n/usr/bin/systemctl reload nginx\n')
    hook.chmod(0o755)
    (deployment / 'manage').chmod(0o755)
    run(['systemd-analyze', 'verify', '/etc/systemd/system/soccerarena.service'])
    run(['nginx', '-t'])
    run(['systemctl', 'daemon-reload'])
    run(['systemctl', 'enable', 'soccerarena.service'])
    run(['systemctl', 'restart', 'soccerarena.service'])
    run(['systemctl', 'reload', 'nginx'])
    if not tls_ready:
        run(['systemctl', 'enable', '--now', 'soccerarena-https.timer'])
        run(['systemctl', 'start', '--no-block', 'soccerarena-https.service'])
    run(['systemctl', 'enable', '--now', 'certbot.timer'])
    print(f'Deployed release: {release}', flush=True)


if __name__ == '__main__':
    main()

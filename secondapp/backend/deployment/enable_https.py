"""Run as root. Issue/activate TLS only when the API's public DNS is ready."""

import json
import subprocess
from pathlib import Path
from urllib.request import urlopen

DOMAIN = 'api.soccerarena.org'
IP = '139.59.93.218'
ENV = Path('/etc/soccerarena/backend.env')
SITE = Path('/etc/nginx/sites-available/api.soccerarena.org')
HERE = Path(__file__).resolve().parent


def run(*args):
    subprocess.run(args, check=True)


def ready():
    # Check public DNS independently of cached local NXDOMAIN answers.
    try:
        for record_type in ['A', 'AAAA']:
            with urlopen(f'https://dns.google/resolve?name={DOMAIN}&type={record_type}', timeout=15) as response:
                data = json.load(response)
            if data['Status'] != 0:
                return False
            records = [answer['data'] for answer in data.get('Answer', []) if answer['type'] == (1 if record_type == 'A' else 28)]
            if record_type == 'A' and set(records) != {IP}:
                return False
            # This server has no public IPv6 address; an AAAA record breaks ACME.
            if record_type == 'AAAA' and records:
                return False
        return True
    except (OSError, ValueError, KeyError) as error:
        print(f'DNS not ready: {type(error).__name__}', flush=True)
        return False


def main():
    if not ready():
        print(f'Waiting for {DOMAIN} A={IP} with no conflicting AAAA record.', flush=True)
        return
    cert = Path(f'/etc/letsencrypt/live/{DOMAIN}/fullchain.pem')
    if not cert.exists():
        run('certbot', 'certonly', '--webroot', '-w', '/var/www/soccerarena-acme',
            '-d', DOMAIN, '--cert-name', DOMAIN, '--non-interactive', '--agree-tos',
            '--register-unsafely-without-email')
    previous_site = SITE.read_text()
    previous_env = ENV.read_text()
    try:
        SITE.write_text((HERE / 'nginx-https.conf').read_text())
        run('nginx', '-t')
        # Serve TLS before redirecting Django requests to it.
        run('systemctl', 'reload', 'nginx')
        ENV.write_text(previous_env.replace('SECURE_SSL_REDIRECT=0', 'SECURE_SSL_REDIRECT=1'))
        run('systemctl', 'restart', 'soccerarena.service')
        run('curl', '--retry', '5', '--retry-connrefused', '--retry-delay', '1',
            '--fail', '--silent', '--show-error', '--resolve', f'{DOMAIN}:443:127.0.0.1',
            f'https://{DOMAIN}/health/')
    except Exception:
        SITE.write_text(previous_site)
        ENV.write_text(previous_env)
        run('nginx', '-t')
        run('systemctl', 'reload', 'nginx')
        run('systemctl', 'restart', 'soccerarena.service')
        raise
    run('systemctl', 'disable', '--now', 'soccerarena-https.timer')
    print('\nHTTPS active; the existing certbot timer handles renewals.', flush=True)


if __name__ == '__main__':
    main()

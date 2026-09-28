"""Run live checks with a password prompt instead of credentials in shell history."""

import argparse
import getpass
import json
import os
from pathlib import Path
import subprocess


def main():
    parser = argparse.ArgumentParser(
        description=(
            "Test the local Flutter web build against the live SoccerArena API. "
            "Login may start the account's trial. The logout test revokes all "
            "sessions for the supplied account. No account is created or deleted."
        )
    )
    parser.add_argument("username")
    args = parser.parse_args()
    credentials = {"username": args.username, "password": getpass.getpass("Password: ")}
    script = Path(__file__).with_suffix(".cjs")
    env = dict(os.environ)
    result = subprocess.run(
        ["node", str(script)],
        input=json.dumps(credentials),
        text=True,
        env=env,
        check=False,
    )
    credentials.clear()
    return result.returncode


if __name__ == "__main__":
    raise SystemExit(main())

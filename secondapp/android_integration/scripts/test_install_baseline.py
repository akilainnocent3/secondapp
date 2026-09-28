"""Exercise the phone-protection refusal paths without connecting a device."""
import unittest
from unittest.mock import patch
from pathlib import Path
import install_baseline as installer


class ProtectionTests(unittest.TestCase):
    def responses(self, *, abi="arm64-v8a,armeabi-v7a", installed=False,
                  secondary=False, bad_users=False):
        def fake(command):
            tail = command[3:]
            if tail == ["get-state"]:
                return "device"
            if tail == ["shell", "getprop", "ro.product.cpu.abilist"]:
                return abi
            if tail == ["shell", "getprop", "ro.build.version.sdk"]:
                return "36"
            if tail == ["shell", "pm", "list", "users"]:
                return "denied" if bad_users else "Users:\n UserInfo{0:Owner:13}\n UserInfo{10:Work:30}"
            if tail[:6] == ["shell", "pm", "list", "packages", "-u", "--user"]:
                found = installed or (secondary and tail[-1] == "10")
                return "package:android\n" + (f"package:{installer.PACKAGE}" if found else "package:com.example")
            self.fail(f"Unexpected or mutating command: {command}")
        return fake

    def test_existing_app_refused(self):
        with patch.object(installer, "run", side_effect=self.responses(installed=True)):
            with self.assertRaisesRegex(RuntimeError, "Working or retained"):
                installer.inspect_device(["adb", "-s", "test"])

    def test_other_user_app_refused(self):
        with patch.object(installer, "run", side_effect=self.responses(secondary=True)):
            with self.assertRaisesRegex(RuntimeError, "Working or retained"):
                installer.inspect_device(["adb", "-s", "test"])

    def test_x86_refused(self):
        with patch.object(installer, "run", side_effect=self.responses(abi="x86_64")):
            with self.assertRaisesRegex(RuntimeError, "ARM64"):
                installer.inspect_device(["adb", "-s", "test"])

    def test_user_inspection_failure_refused(self):
        with patch.object(installer, "run", side_effect=self.responses(bad_users=True)):
            with self.assertRaisesRegex(RuntimeError, "Cannot enumerate"):
                installer.inspect_device(["adb", "-s", "test"])

    def test_empty_device_preflight_is_read_only(self):
        with patch.object(installer, "run", side_effect=self.responses()):
            self.assertEqual(installer.inspect_device(["adb", "-s", "test"])["users_checked"], ["0", "10"])

    def test_install_explicitly_disallows_replacement(self):
        with patch("sys.argv", ["install_baseline.py", "--adb", "adb", "--serial", "test", "--install-on-empty-device"]), \
                patch.object(installer, "verify_files"), \
                patch.object(installer, "inspect_device", return_value={}), \
                patch.object(installer, "run", return_value="Success") as command:
            installer.main()
            args = command.call_args.args[0]
            self.assertEqual(args[:6], ["adb", "-s", "test", "install-multiple", "-R", "--no-incremental"])
            self.assertEqual([Path(p).name for p in args[6:]], list(installer.NAMES))

    def test_main_does_not_install_on_preflight_refusal(self):
        with patch("sys.argv", ["install_baseline.py", "--adb", "adb", "--serial", "test", "--install-on-empty-device"]), \
                patch.object(installer, "verify_files"), \
                patch.object(installer, "inspect_device", side_effect=RuntimeError("Working app")), \
                patch.object(installer, "run") as command:
            with self.assertRaisesRegex(RuntimeError, "Working app"):
                installer.main()
            command.assert_not_called()


if __name__ == "__main__":
    unittest.main()

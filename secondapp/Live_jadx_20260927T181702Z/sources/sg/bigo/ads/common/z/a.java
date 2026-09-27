package sg.bigo.ads.common.z;

import android.os.Build;
import com.ironsource.G5;
import fk.i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String[] f133724a = {"/dev/socket/qemud", "/dev/qemu_pipe"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f133725b = {"/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String[] f133726c = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String[] f133727d = {i.f84794b};

    public static int a() {
        try {
            return (e() || d() || f() || g()) ? 1 : 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String b() {
        return " Build.BOARD = " + Build.BOARD + ", Build.BOOTLOADER = " + Build.BOOTLOADER + ", Build.BRAND = " + Build.BRAND + ", Build.DEVICE = " + Build.DEVICE + ", Build.DISPLAY = " + Build.DISPLAY + ", Build.FINGERPRINT = " + Build.FINGERPRINT + ", Build.HARDWARE = " + Build.HARDWARE + ", Build.HOST = " + Build.HOST + ", Build.MANUFACTURER = " + Build.MANUFACTURER + ", Build.MODEL = " + Build.MODEL + ", Build.PRODUCT = " + Build.PRODUCT + ", Build.TIME = " + Build.TIME + ", Build.TYPE = " + Build.TYPE + ", Build.ID = " + Build.USER + ", Build.VERSION.CODENAME = " + Build.VERSION.CODENAME + ", Build.VERSION.INCREMENTAL = " + Build.VERSION.INCREMENTAL + ", Build.VERSION.RELEASE = " + Build.VERSION.RELEASE + ", Build.VERSION.SDK_INT = " + Build.VERSION.SDK_INT + ",";
    }

    public static String c() {
        try {
            Process processStart = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            StringBuilder sb2 = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream(), G5.N));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return sb2.toString().toLowerCase();
                }
                sb2.append(line);
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean d() {
        try {
            for (String str : f133725b) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean e() {
        try {
            for (String str : f133724a) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean f() {
        try {
            for (String str : f133726c) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean g() {
        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
        for (int i10 = 0; i10 < 2; i10++) {
            File file = fileArr[i10];
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[1024];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                String str = new String(bArr);
                for (String str2 : f133727d) {
                    if (str.contains(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

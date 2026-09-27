package sg.bigo.ads.common.aa;

import androidx.media3.session.fe;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f132863a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f132864b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f132865c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f132866d;

    /* JADX INFO: renamed from: sg.bigo.ads.common.aa.a$a, reason: collision with other inner class name */
    public final class C1339a implements FileFilter {
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i10 = 3; i10 < name.length(); i10++) {
                if (!Character.isDigit(name.charAt(i10))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int a() {
        if (f132863a) {
            return f132865c;
        }
        int iA = sg.bigo.ads.common.x.a.a();
        f132865c = iA;
        if (iA != 0) {
            f132863a = true;
            return iA;
        }
        try {
            f132865c = new File(yb.b.f159151c).listFiles(new C1339a()).length;
        } catch (Throwable unused) {
        }
        if (f132865c <= 1) {
            f132865c = Runtime.getRuntime().availableProcessors();
        }
        f132863a = true;
        sg.bigo.ads.common.x.a.a(f132865c);
        return f132865c;
    }

    public static long b() {
        if (f132864b) {
            long j10 = f132866d;
            if (j10 != 0) {
                return j10;
            }
        }
        long jB = sg.bigo.ads.common.x.a.b();
        f132866d = jB;
        if (jB != 0) {
            f132864b = true;
            return jB;
        }
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < a(); i12++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i13 = 0;
                        while (Character.isDigit(bArr[i13]) && i13 < 128) {
                            i13++;
                        }
                        int i14 = Integer.parseInt(new String(bArr, 0, i13));
                        if (i14 > i11) {
                            i11 = i14;
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th2) {
                        fileInputStream.close();
                        throw th2;
                    }
                    fileInputStream.close();
                }
            } catch (Exception unused2) {
            }
        }
        if (i11 == -1) {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String[] strArrSplit = line.split(":", 2);
                    if ("cpu MHz".equals(strArrSplit[0].replaceAll("[\\t\\n\\r]", ""))) {
                        int i15 = (strArrSplit[1].contains(fe.F) ? (int) Double.parseDouble(strArrSplit[1]) : Integer.parseInt(strArrSplit[1])) * 1000;
                        if (i15 > i11) {
                            i11 = i15;
                        }
                    }
                } catch (Exception unused3) {
                } catch (Throwable th3) {
                    fileReader.close();
                    bufferedReader.close();
                    throw th3;
                }
            }
            fileReader.close();
            bufferedReader.close();
        }
        i10 = i11;
        f132864b = true;
        long j11 = i10 / 1000;
        f132866d = j11;
        sg.bigo.ads.common.x.a.a(j11);
        return f132866d;
    }
}

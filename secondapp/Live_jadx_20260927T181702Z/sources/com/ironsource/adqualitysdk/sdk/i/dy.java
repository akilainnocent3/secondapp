package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.signals.SignalKey;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class dy {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1891 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1892;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1895;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private d f1896;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f1897;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1894 = {':'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1893 = -4020653531021365266L;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum d {
        f1908,
        f1910,
        f1906,
        f1909,
        f1907,
        f1905,
        f1902,
        f1904;


        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static long f1898 = 0;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f1899 = 0;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f1900 = 1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static char[] f1903;

        static {
            m2086();
            f1899 = (f1900 + 47) % 128;
        }

        public static d valueOf(String str) {
            int i10 = f1900 + 63;
            f1899 = i10 % 128;
            if (i10 % 2 == 0) {
                return (d) Enum.valueOf(d.class, str);
            }
            Enum.valueOf(d.class, str);
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            f1899 = (f1900 + 3) % 128;
            d[] dVarArr = (d[]) values().clone();
            f1899 = (f1900 + 29) % 128;
            return dVarArr;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static void m2086() {
            f1903 = new char[]{'K', 27119, 54029, 15529, 42727, 4096, 31160, 'I', 27118, 54033, 15536, 42748, 4123, 31162, 58351, 19733, 46760, 'O', 27130, 54033, 15532, 42729, 4102, 31155, 58356, 35968, 58669, 24533, 45156, 10805, 40134, 'I', 27108, 54016, 15547, 42735, 4119, 31150, 'D', 27109, 54017, 15548, 42724, 4119, 10707, 16500, 64138, 5411, 36732, 14722, 20515, 12478, 22811, 58344, 3152, 38406};
            f1898 = 5818881436904352170L;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2087(int i10, char c10, int i11) {
            String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1653) {
                try {
                    char[] cArr = new char[i11];
                    com.ironsource.adqualitysdk.sdk.i.d.f1652 = 0;
                    while (true) {
                        int i12 = com.ironsource.adqualitysdk.sdk.i.d.f1652;
                        if (i12 < i11) {
                            cArr[i12] = (char) ((((long) f1903[i10 + i12]) ^ (((long) i12) * f1898)) ^ ((long) c10));
                            com.ironsource.adqualitysdk.sdk.i.d.f1652 = i12 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }
    }

    public dy(d dVar, String str, int i10) {
        this.f1896 = dVar;
        this.f1895 = str;
        this.f1897 = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1896);
        sb2.append(m2072(ViewConfiguration.getTapTimeout() >> 16, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1 - View.resolveSize(0, 0)).intern());
        sb2.append(this.f1895);
        String string = sb2.toString();
        f1892 = (f1891 + 87) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public final boolean m2073() {
        int i10 = f1891 + 69;
        f1892 = i10 % 128;
        if (i10 % 2 != 0) {
            m2081();
            d dVar = d.f1908;
            throw null;
        }
        if (m2081() == d.f1908) {
            return true;
        }
        int i11 = f1892 + 49;
        f1891 = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final boolean m2074() {
        int i10 = f1892 + 79;
        f1891 = i10 % 128;
        if (i10 % 2 == 0) {
            m2081();
            d dVar = d.f1910;
            throw null;
        }
        if (m2081() != d.f1910) {
            return false;
        }
        f1892 = (f1891 + 7) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m2075() {
        if (m2081() != d.f1902) {
            return false;
        }
        int i10 = (f1892 + 7) % 128;
        f1891 = i10;
        f1892 = (i10 + 29) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m2076() {
        f1892 = (f1891 + 77) % 128;
        if (m2081() == d.f1906) {
            f1891 = (f1892 + 59) % 128;
            return true;
        }
        f1891 = (f1892 + 33) % 128;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (m2081() == com.ironsource.adqualitysdk.sdk.i.dy.d.f1905) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (m2081() == com.ironsource.adqualitysdk.sdk.i.dy.d.f1905) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.dy.f1891 = (com.ironsource.adqualitysdk.sdk.i.dy.f1892 + 9) % 128;
     */
    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2077() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.dy.f1892
            int r0 = r0 + 105
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dy.f1891 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L19
            com.ironsource.adqualitysdk.sdk.i.dy$d r0 = r4.m2081()
            com.ironsource.adqualitysdk.sdk.i.dy$d r2 = com.ironsource.adqualitysdk.sdk.i.dy.d.f1905
            r3 = 87
            int r3 = r3 / r1
            if (r0 != r2) goto L2b
            goto L21
        L19:
            com.ironsource.adqualitysdk.sdk.i.dy$d r0 = r4.m2081()
            com.ironsource.adqualitysdk.sdk.i.dy$d r2 = com.ironsource.adqualitysdk.sdk.i.dy.d.f1905
            if (r0 != r2) goto L2b
        L21:
            int r0 = com.ironsource.adqualitysdk.sdk.i.dy.f1892
            int r0 = r0 + 9
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dy.f1891 = r0
            r0 = 1
            return r0
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dy.m2077():boolean");
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m2078() {
        int i10 = f1892 + 21;
        f1891 = i10 % 128;
        if (i10 % 2 == 0) {
            m2081();
            d dVar = d.f1904;
            throw null;
        }
        if (m2081() != d.f1904) {
            return false;
        }
        int i11 = f1892 + 19;
        f1891 = i11 % 128;
        return i11 % 2 != 0;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m2079() {
        f1891 = (f1892 + 99) % 128;
        if (m2081() == d.f1907) {
            return true;
        }
        int i10 = f1891 + 11;
        f1892 = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2080() {
        f1892 = (f1891 + 105) % 128;
        if (!m2084()) {
            f1891 = (f1892 + 73) % 128;
            if (!m2079() && !m2077()) {
                int i10 = f1891 + 19;
                f1892 = i10 % 128;
                if (i10 % 2 != 0) {
                    m2075();
                    throw null;
                }
                if (!m2075()) {
                    return false;
                }
            }
        }
        f1891 = (f1892 + 19) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final d m2081() {
        int i10 = f1892;
        int i11 = i10 + 105;
        f1891 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        d dVar = this.f1896;
        int i12 = i10 + 81;
        f1891 = i12 % 128;
        if (i12 % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2082() {
        int i10 = (f1892 + 69) % 128;
        f1891 = i10;
        String str = this.f1895;
        int i11 = i10 + 97;
        f1892 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m2083() {
        int i10 = f1892;
        int i11 = this.f1897;
        int i12 = i10 + SignalKey.EVENT_ID;
        f1891 = i12 % 128;
        if (i12 % 2 != 0) {
            return i11;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m2085(String str) {
        f1891 = (f1892 + 13) % 128;
        boolean zEquals = this.f1895.equals(str);
        int i10 = f1891 + 95;
        f1892 = i10 % 128;
        if (i10 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m2084() {
        f1892 = (f1891 + 71) % 128;
        if (m2081() == d.f1909) {
            int i10 = f1891 + 125;
            f1892 = i10 % 128;
            return i10 % 2 == 0;
        }
        int i11 = f1892 + 27;
        f1891 = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2072(int i10, char c10, int i11) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1653) {
            try {
                char[] cArr = new char[i11];
                com.ironsource.adqualitysdk.sdk.i.d.f1652 = 0;
                while (true) {
                    int i12 = com.ironsource.adqualitysdk.sdk.i.d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1894[i10 + i12]) ^ (((long) i12) * f1893)) ^ ((long) c10));
                        com.ironsource.adqualitysdk.sdk.i.d.f1652 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}

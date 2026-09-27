package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum hl {
    f2345(-1),
    f2344(0),
    f2347(1),
    f2346(2),
    f2348(3),
    f2343(4),
    f2340(5),
    f2342(6),
    f2341(7);


    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f2336 = 1;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int[] f2338;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2339;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final int f2349;

    static {
        m2216();
        f2339 = (f2336 + 125) % 128;
    }

    hl(int i10) {
        this.f2349 = i10;
    }

    public static hl valueOf(String str) {
        int i10 = f2339 + 111;
        f2336 = i10 % 128;
        int i11 = i10 % 2;
        hl hlVar = (hl) Enum.valueOf(hl.class, str);
        if (i11 == 0) {
            int i12 = 48 / 0;
        }
        f2339 = (f2336 + 87) % 128;
        return hlVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static hl[] valuesCustom() {
        f2339 = (f2336 + 15) % 128;
        hl[] hlVarArr = (hl[]) values().clone();
        int i10 = f2339 + 41;
        f2336 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 83 / 0;
        }
        return hlVarArr;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2216() {
        f2338 = new int[]{67978153, 1678506698, 1602214626, -387060140, -1144243397, 891040089, 1050767598, -1522593851, 764895373, 248285869, 1933620196, -394887603, 997376652, 1439982257, -26799701, 1103817601, -1984906157, -1649952337};
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2217(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2338.clone();
                e.f1913 = 0;
                while (true) {
                    int i11 = e.f1913;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        e.f1915 = (c10 << 16) + c11;
                        e.f1914 = (c12 << 16) + c13;
                        e.m2090(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = e.f1915 ^ iArr2[i13];
                            e.f1915 = i14;
                            e.f1914 = e.m2089(i14) ^ e.f1914;
                            int i15 = e.f1915;
                            e.f1915 = e.f1914;
                            e.f1914 = i15;
                        }
                        int i16 = e.f1915;
                        e.f1915 = e.f1914;
                        e.f1914 = i16;
                        e.f1914 = i16 ^ iArr2[16];
                        e.f1915 ^= iArr2[17];
                        int i17 = e.f1914;
                        int i18 = e.f1915;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = e.f1914;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        e.m2090(iArr2);
                        int i20 = e.f1913;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        e.f1913 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m2218() {
        int i10 = f2339 + 53;
        int i11 = i10 % 128;
        f2336 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i12 = this.f2349;
        f2339 = (i11 + 59) % 128;
        return i12;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static hl m2215(int i10) {
        int i11 = (f2339 + 97) % 128;
        f2336 = i11;
        switch (i10) {
            case -1:
                return f2345;
            case 0:
                return f2344;
            case 1:
                return f2347;
            case 2:
                return f2346;
            case 3:
                hl hlVar = f2348;
                int i12 = i11 + 121;
                f2339 = i12 % 128;
                if (i12 % 2 == 0) {
                    return hlVar;
                }
                throw null;
            case 4:
                return f2343;
            case 5:
                return f2340;
            case 6:
                return f2342;
            case 7:
                return f2341;
            default:
                return null;
        }
    }
}

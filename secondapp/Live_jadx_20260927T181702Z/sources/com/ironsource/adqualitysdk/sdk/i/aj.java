package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.view.ViewConfiguration;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class aj {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f291 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f292 = {'a', 'd', 'q', '_', 'i', 'n', 't', 'b', 'l', 'o', 'c', 'e', 'f', 'g', 'h', 'j'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f293 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f294 = 4;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m377(String str) {
        f293 = (f291 + 123) % 128;
        boolean zEquals = m381("\u0001\u0002\u0003\u0000\u0005\u0006\u0005\u0007\u0007\u000b\t\nº", Drawable.resolveOpacity(0, 0) + 13, (byte) (87 - Process.getGidForName(""))).intern().equals(str);
        f293 = (f291 + 103) % 128;
        return zEquals;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m378(String str, String str2) {
        if (kc.m2817(str, 64)) {
            f293 = (f291 + 79) % 128;
            if (kc.m2817(str2, 64)) {
                int i10 = f291 + 83;
                f293 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 33 / 0;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r2.size() < ((m379(r2) ? 1 : 0) + 5)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2.containsKey(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r2.containsKey(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.aj.f293 = (com.ironsource.adqualitysdk.sdk.i.aj.f291 + 123) % 128;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m380(java.util.Map<java.lang.String, java.lang.String> r2, java.lang.String r3) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.aj.f293
            int r0 = r0 + 95
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.aj.f291 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L17
            boolean r3 = r2.containsKey(r3)
            r0 = 22
            int r0 = r0 / r1
            if (r3 == 0) goto L26
            goto L1d
        L17:
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L26
        L1d:
            int r2 = com.ironsource.adqualitysdk.sdk.i.aj.f291
            int r2 = r2 + 123
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.aj.f293 = r2
            return r1
        L26:
            int r3 = r2.size()
            boolean r2 = m379(r2)
            int r2 = r2 + 5
            if (r3 < r2) goto L34
            r2 = 1
            return r2
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.aj.m380(java.util.Map, java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m381(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            try {
                char[] cArr2 = f292;
                char c10 = f294;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    g.f2134 = 0;
                    while (true) {
                        int i11 = g.f2134;
                        if (i11 >= i10) {
                            break;
                        }
                        g.f2133 = cArr[i11];
                        g.f2131 = cArr[g.f2134 + 1];
                        if (g.f2133 == g.f2131) {
                            cArr3[g.f2134] = (char) (g.f2133 - b10);
                            cArr3[g.f2134 + 1] = (char) (g.f2131 - b10);
                        } else {
                            g.f2132 = g.f2133 / c10;
                            g.f2130 = g.f2133 % c10;
                            g.f2135 = g.f2131 / c10;
                            g.f2128 = g.f2131 % c10;
                            if (g.f2130 == g.f2128) {
                                g.f2132 = ((g.f2132 + c10) - 1) % c10;
                                g.f2135 = ((g.f2135 + c10) - 1) % c10;
                                int i12 = (g.f2132 * c10) + g.f2130;
                                int i13 = (g.f2135 * c10) + g.f2128;
                                int i14 = g.f2134;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (g.f2132 == g.f2135) {
                                g.f2130 = ((g.f2130 + c10) - 1) % c10;
                                g.f2128 = ((g.f2128 + c10) - 1) % c10;
                                int i15 = (g.f2132 * c10) + g.f2130;
                                int i16 = (g.f2135 * c10) + g.f2128;
                                int i17 = g.f2134;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (g.f2132 * c10) + g.f2128;
                                int i19 = (g.f2135 * c10) + g.f2130;
                                int i20 = g.f2134;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        g.f2134 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m379(Map<String, String> map) {
        f291 = (f293 + 19) % 128;
        boolean zContainsKey = map.containsKey(m381("\u0001\u0002\u0003\u0000\u0005\u0006\u0005\u0007\u0007\u000b\t\nº", Color.rgb(0, 0, 0) + 16777229, (byte) (88 - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern());
        int i10 = f293 + 33;
        f291 = i10 % 128;
        if (i10 % 2 != 0) {
            return zContainsKey;
        }
        throw null;
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import com.amazon.device.ads.DTBAdRequest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class fy extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2118 = 5;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2119 = {'c', 'o', 'm', kj.e.f102543c, 'a', 'z', 'n', 'd', 'e', 'v', 'i', 's', 'D', 'T', 'B', 'A', 'R', 'q', fw.b.f85389p, 't', 'p', 'f', 'g', 'h', 'j'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2120 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2121 = 1;

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2153() {
        bm bmVar = new bm(mo2156());
        int i10 = f2120 + 105;
        f2121 = i10 % 128;
        if (i10 % 2 != 0) {
            return bmVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2154() {
        int iAlpha;
        byte mirror;
        int i10 = f2120 + 17;
        f2121 = i10 % 128;
        if (i10 % 2 == 0) {
            iAlpha = 105 - Color.alpha(0);
            mirror = (byte) (5 / AndroidCharacter.getMirror('c'));
        } else {
            iAlpha = Color.alpha(0) + 34;
            mirror = (byte) (AndroidCharacter.getMirror('0') + 5);
        }
        return m2161("\u0001\u0002\u0003\u0004\u0000\u0003\u0000\t\u0006\u000b\u0002\b\t\u0005\u000f\u0005\r\b\u0002\t\r\u0001\r\u000e\n\u0013\u0006\u0011\u0007\u0012\u0017\r\u000e\u0010", iAlpha, mirror).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2155() {
        int i10 = f2121;
        f2120 = (i10 + 55) % 128;
        f2120 = (i10 + 7) % 128;
        return DTBAdRequest.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2156() {
        f2121 = (f2120 + 89) % 128;
        String strIntern = m2161("\u0000\u0003\u0000\t\u0006\u000b\u0000\u0018¤", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 49)).intern();
        f2121 = (f2120 + 37) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2161(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            try {
                char[] cArr2 = f2119;
                char c10 = f2118;
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
}

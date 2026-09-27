package com.facebook.ads.redexgen.core;

import android.graphics.Color;
import f6.q;
import java.io.Serializable;
import java.util.Arrays;
import l3.a;
import org.json.JSONObject;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2158Na implements Serializable {
    public static byte[] A0A = null;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final long serialVersionUID = 8946536326456653736L;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0A = new byte[]{110, 125, 126, 125, -126, 125, -111, 121, -118, -72, -118, -68, -117, -116, -77, a.f103493v7, a.f103436o7, a.f103493v7, -60, a.f103493v7, -13, -113, -46, -94, -46, -93, -46, -91, -128, a.f103460r7, a.f103460r7, -111, -115, -107, -115, a.f103460r7, a.f103460r7, a.f103436o7, a.f103452q7, a.f103452q7, -60, a.f103520y7, -45, -66, a.f103452q7, a.f103529z7, a.f103511x7, a.f103529z7, -47, c.B, c.G, c.f161647y, c.C, 37, 34, 37, 40, c.f161648z, 35, c.B, 45, 19, c.A, 35, 32, 35, 38, c.E, 44, c.C, c.A, c.E, 39, 36, 39, 42, c.f161638p, 31, c.f161636n, 10, c.f161638p, c.D, c.A, c.D, c.G, 10, c.D, 33, c.f161640r, c.G, 10, c.B, c.f161640r, c.f161639q, c.f161646x, c.f161636n, 17, 34, c.f161639q, 13, c.f161643u, 39, 28, c.f161639q, c.E, c.A, 17, 13, 17, c.G, c.D, c.G, 32, -16, 1, -18, -20, 1, q.f83622z, 5, 1, -20, -16, -4, -7, -4, -1, 32, 49, c.H, 28, 49, 34, 53, 49, 28, 32, 44, 41, 44, 47, 28, 44, 51, 34, 47, 28, 42, 34, 33, 38, c.H, 28, c.H, c.f161635m, c.G, c.f161643u, c.G, c.f161647y, c.f161638p, 8, c.f161636n, c.B, c.f161647y, c.B, c.E, 41, c.H, 41, 33, c.D, c.f161646x, c.B, 36, 33, 36, 39};
    }

    static {
        A03();
        A0B = Color.parseColor(A02(14, 7, 76));
        A0C = Color.parseColor(A02(7, 7, 18));
        A0D = Color.parseColor(A02(21, 7, 40));
        String strA02 = A02(28, 9, 25);
        A0E = Color.parseColor(strA02);
        A0F = Color.parseColor(A02(0, 7, 7));
        A0G = Color.parseColor(strA02);
    }

    public C2158Na(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.A00 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A03 = i13;
        this.A04 = i14;
        this.A05 = i15;
        this.A07 = i16;
        this.A08 = i17;
        this.A09 = i18;
        this.A06 = i19;
    }

    public static int A00(JSONObject jSONObject, String str, int i10) {
        if (jSONObject != null && jSONObject.has(str)) {
            return Color.parseColor(jSONObject.optString(str));
        }
        return i10;
    }

    public static C2158Na A01(JSONObject jSONObject) {
        return new C2158Na(A00(jSONObject, A02(37, 12, 27), A0B), A00(jSONObject, A02(57, 10, 112), A0C), A00(jSONObject, A02(152, 14, 101), -16777216), A00(jSONObject, A02(49, 8, 114), A0D), A00(jSONObject, A02(67, 9, 116), A0E), A00(jSONObject, A02(76, 20, 103), -1), A00(jSONObject, A02(113, 14, 73), -1), A00(jSONObject, A02(127, 25, 121), A0G), A00(jSONObject, A02(166, 11, 113), -16777216), A00(jSONObject, A02(96, 17, 106), A0E));
    }

    public final int A04() {
        return this.A06;
    }

    public final int A05(boolean z10) {
        if (z10) {
            return -1;
        }
        return this.A00;
    }

    public final int A06(boolean z10) {
        if (z10) {
            return -1;
        }
        return this.A01;
    }

    public final int A07(boolean z10) {
        if (z10) {
            return -1;
        }
        return this.A02;
    }

    public final int A08(boolean z10) {
        return z10 ? A0F : this.A03;
    }

    public final int A09(boolean z10) {
        return z10 ? this.A05 : this.A04;
    }

    public final int A0A(boolean z10) {
        return z10 ? this.A08 : this.A07;
    }

    public final int A0B(boolean z10) {
        if (z10) {
            return -1;
        }
        return this.A09;
    }
}

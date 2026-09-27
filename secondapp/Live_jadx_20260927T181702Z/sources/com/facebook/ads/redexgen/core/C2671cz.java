package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import f6.q;
import java.util.Arrays;
import l3.a;
import org.json.JSONException;
import org.json.JSONObject;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2671cz {
    public static byte[] A03;
    public final int A00;
    public final String A01;
    public final String A02;

    static {
        A03();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-88, -73, -80, -80, -45, a.f103511x7, a.f103511x7, a.f103493v7, -42, -74, a.A7, a.f103452q7, a.f103460r7, a.f103520y7, a.f103476t7, -127, -43, -48, -127, -60, -45, a.f103476t7, a.f103452q7, -43, a.f103476t7, -127, a.f103452q7, a.f103468s7, a.f103468s7, a.f103502w7, -43, a.f103502w7, -48, a.A7, a.f103452q7, a.f103520y7, -86, a.A7, a.f103484u7, -48, -28, -25, -30, -26, -11, q.B, -28, -9, -20, -7, q.B, -30, -9, -4, -13, q.B, -44, -41, -46, a.E7, -30, -27, -32, -44, -25, -46, -25, -20, -29, a.f103428n7, c.f161640r, 19, c.f161638p, 33, c.f161646x, 32, 36, c.f161646x, 34, 35, c.f161638p, c.B, 19, -26, -11, -18, a.E7, -35, -47, -41, -43, -6, -19, q.B, -23, -13};
    }

    public C2671cz(String str, String str2, int i10) {
        String strA01;
        this.A02 = str;
        this.A00 = i10;
        if (!TextUtils.isEmpty(str2)) {
            strA01 = A01(91, 5, 56);
        } else {
            strA01 = A01(86, 5, 36);
        }
        this.A01 = strA01;
    }

    private C2313Te A00(String str) {
        C2313Te c2313Te = new C2313Te(str);
        c2313Te.A07(A02());
        c2313Te.A05(1);
        return c2313Te;
    }

    private JSONObject A02() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(56, 14, 39), this.A00);
            jSONObject.put(A01(70, 13, 99), this.A02);
            jSONObject.put(A01(40, 16, 55), this.A01);
        } catch (JSONException e10) {
            Log.w(A01(0, 9, 24), A01(9, 31, 21), e10);
        }
        return jSONObject;
    }

    public final void A04(int i10, String str) {
        C2896ge sdkContext = T7.A00();
        if (sdkContext != null) {
            sdkContext.A08().ABC(A01(83, 3, 54), i10, A00(str));
        }
    }
}

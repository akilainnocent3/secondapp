package com.facebook.ads.redexgen.core;

import com.google.android.gms.cast.MediaError;
import com.vungle.ads.internal.protos.Sdk;
import f6.q;
import java.util.Arrays;
import l3.a;
import org.json.JSONObject;
import qb.d;
import r7.i1;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2171Nn {
    public static byte[] A00;

    static {
        A0H();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0H() {
        A00 = new byte[]{c.f161639q, 56, 59, 63, 49, -20, 13, 48, 57, 101, q.f83619w, 106, 95, q.f83619w, 107, 91, c.f161648z, 77, 87, 106, 89, 94, 95, q.f83619w, 93, 1, 45, 44, 50, 39, 44, 51, 35, -34, 39, 44, -34, c.C, 49, 35, 33, 49, c.E, -34, 50, 45, -34, c.C, 31, 46, 46, c.E, 0, 44, 43, 49, 38, 43, 50, 34, -35, 49, 44, -35, c.B, c.H, 45, 45, c.D, a.f103428n7, 4, 3, 9, -2, 3, 10, -6, -75, c.f161636n, -10, 9, -8, -3, -2, 3, -4, -75, 9, 4, -75, 7, -6, -8, -6, -2, c.f161635m, -6, -75, -10, 3, -75, -2, 3, a.f103452q7, -4, -10, 2, -6, -75, 7, -6, c.f161636n, -10, 7, -7, -65, -21, -22, -16, -27, -22, -15, a.C7, -100, -13, -35, -16, -33, -28, -27, -22, -29, -100, -16, -21, -100, -18, a.C7, -33, a.C7, -27, q.f83622z, a.C7, -100, -9, -19, -15, -35, -22, -16, -27, -16, -11, -7, -9, -33, -15, -18, -18, a.C7, -22, -33, -11, -7, -42, -9, -20, -11, -16, -11, -18, -89, -16, -11, -89, -30, -6, -20, -22, -6, -28, -6, 40, 73, 62, 71, 66, 71, 64, -7, 66, 71, 7, 7, 7, q.B, -5, 13, -9, 8, -6, -74, -1, 4, -74, -15, 9, -5, -7, 9, -13, 9, c.D, 50, 48, 55, 68, 92, 90, 97, 17, 82, 85, c.f161639q, 39, 37, 44, -36, c.G, 32, -36, 37, 42, -36, c.A, 47, 33, 31, 47, c.C, 41, 70, 69, 68, 73, 69, 72, 59, 58, 45, 65, 64, 59, 47, 56, 53, 47, 55, 43, 53, 58, 43, 68, 4, c.B, c.A, c.f161643u, 6, c.f161639q, c.f161636n, 6, c.f161638p, 2, c.f161643u, 19, 8, 17, c.f161636n, 17, 10, 65, 74, 77, 81, 67, yr.a.f159811k, 63, 66, -23, -11, -12, -6, -17, -12, -5, -21, -27, -6, -11, -27, -25, -10, -10, a.C7, -19, -20, q.f83622z, -25, -20, -13, -29, -35, q.f83622z, -19, -35, -33, -18, -18, -35, -25, -20, -35, -10, c.f161638p, c.D, c.C, 31, c.f161646x, c.C, 32, c.f161640r, 10, 34, c.f161636n, 31, c.f161638p, 19, c.f161646x, c.C, c.f161643u, 32, 44, 43, 49, 38, 43, 50, 34, 28, 52, c.H, 49, 32, 37, 38, 43, 36, 28, 35, 44, 47, 28, 47, 34, 52, c.H, 47, 33, 95, 93, 102, 93, 106, 97, 91, 87, 106, 93, 111, 89, 106, 92, 17, c.f161639q, c.B, c.f161639q, 28, 19, 13, 9, c.H, c.f161639q, 34, c.H, -8, -2, -18, -23, -13, -19, -7, -8, -23, -3, -2, 3, -10, -17, 88, 94, 78, 73, 94, 79, 98, 94, 98, 85, 103, 81, 98, 84, 79, 89, 94, 79, 104, 1, -7, -9, -2, -6, q.f83622z, -16, -9, -26, q.B, -21, 68, 60, 58, 65, 48, 58, 63, 48, 73, 44, 41, 40, 39, 44, 40, 43, c.H, c.G};
    }

    public static C2167Nj A00(JSONObject jSONObject) {
        return new C2166Ni().A06(A0A(jSONObject)).A07(A09(jSONObject)).A05(A0B(jSONObject)).A04(A06(jSONObject)).A08();
    }

    public static C2176Ns A01(JSONObject jSONObject) {
        return new C2175Nr().A0F(A0D(jSONObject)).A0J(A0G(jSONObject)).A0I(A0F(jSONObject)).A0H(A0E(jSONObject)).A0E(A08(jSONObject)).A0D(A07(jSONObject)).A0A(jSONObject.optInt(A02(394, 14, 17), 0)).A0G(A0C(jSONObject)).A0C(A05(jSONObject)).A0B(A04(jSONObject)).A0K();
    }

    public static String A03(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String strA02 = A02(240, 9, 93);
        return jSONObjectOptJSONObject == null ? strA02 : jSONObjectOptJSONObject.optString(A02(447, 9, 64), strA02);
    }

    public static String A04(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String strA02 = A02(164, 18, 14);
        return jSONObjectOptJSONObject == null ? strA02 : jSONObjectOptJSONObject.optString(A02(d.f122118j, 14, 83), strA02);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String strA02 = A02(182, 13, 96);
        return jSONObjectOptJSONObject == null ? strA02 : jSONObjectOptJSONObject.optString(A02(i1.d.HandlerC1208d.f123899n, 17, 42), strA02);
    }

    public static String A06(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String strA02 = A02(0, 8, 83);
        return jSONObjectOptJSONObject == null ? strA02 : jSONObjectOptJSONObject.optString(A02(280, 8, 101), strA02);
    }

    public static String A07(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String strA02 = A02(25, 27, 69);
        return jSONObjectOptJSONObject == null ? strA02 : jSONObjectOptJSONObject.optString(A02(303, 20, 5), strA02);
    }

    public static String A08(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String strA02 = A02(52, 17, 68);
        return jSONObjectOptJSONObject == null ? strA02 : jSONObjectOptJSONObject.optString(A02(288, 15, 13), strA02);
    }

    public static String A09(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String strA02 = A02(115, 49, 3);
        return jSONObjectOptJSONObject == null ? strA02 : jSONObjectOptJSONObject.optString(A02(340, 28, 68), strA02);
    }

    public static String A0A(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String strA02 = A02(69, 46, 28);
        return jSONObjectOptJSONObject == null ? strA02 : jSONObjectOptJSONObject.optString(A02(368, 14, 127), strA02);
    }

    public static String A0B(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String strA02 = A02(8, 17, 125);
        return jSONObjectOptJSONObject == null ? strA02 : jSONObjectOptJSONObject.optString(A02(323, 17, 50), strA02);
    }

    public static String A0C(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String strA02 = A02(0, 0, 60);
        return jSONObjectOptJSONObject == null ? strA02 : jSONObjectOptJSONObject.optString(A02(408, 8, 113), strA02);
    }

    public static String A0D(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String strA02 = A02(195, 17, 29);
        return jSONObjectOptJSONObject == null ? strA02 : jSONObjectOptJSONObject.optString(A02(416, 11, 119), strA02);
    }

    public static String A0E(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String strA02 = A02(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 17, 67);
        return jSONObjectOptJSONObject == null ? strA02 : jSONObjectOptJSONObject.optString(A02(438, 9, 88), strA02);
    }

    public static String A0F(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String strA02 = A02(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 7, 120);
        return jSONObjectOptJSONObject == null ? strA02 : jSONObjectOptJSONObject.optString(A02(MediaError.DetailedErrorCode.SMOOTH_MANIFEST, 7, 14), strA02);
    }

    public static String A0G(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(382, 12, 49));
        String strA02 = A02(Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, 4, 78);
        return jSONObjectOptJSONObject == null ? strA02 : jSONObjectOptJSONObject.optString(A02(427, 4, 21), strA02);
    }
}

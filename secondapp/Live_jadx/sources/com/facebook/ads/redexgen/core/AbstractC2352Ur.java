package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import f6.q;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import rg.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2352Ur {
    public static byte[] A00;
    public static String[] A01 = {"Z5CDeKIRbdSSRSQIrVuvkRGSoBqaj2vD", "vAYmZT8ASJMB3FzzuSGq4ydCUrxXwpoH", "w5gGutYUngeqRFsCKcvWOvxRavdUOOsS", "yOEODZsyHWLZAvoEgSYJGhZTBHDJn", "rt7Bq94iIT4vcXtoKSYLP1d4W6MwPUTJ", "NG6XHFEJ7LlyPEQHkLbosD3XyF7yGiUv", "J0QPPK8CgABCN6AkZrLHMYAzYl1dWHal", "XBXEBoD0FueyJiRlgHiLQagWcf9HuHXl"};

    public static String A0L(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0N() {
        A00 = new byte[]{80, 28, 62, 49, a.f127263w, 43, 127, 47, 62, 45, 44, 58, 127, 44, 62, 50, 47, 51, 54, 49, 56, q.A, 52, 50, c.A, c.f161643u, c.f161643u, 31, 2, 31, c.C, c.B, c.A, c.D, 41, c.f161643u, 19, c.f161646x, 3, 17, 41, c.D, c.C, 17, 17, 31, c.B, 17, 41, c.f161646x, c.D, c.A, c.f161647y, c.G, 41, c.D, 31, 5, 2, 10, c.f161639q, c.f161639q, 2, 31, 2, 4, 5, 10, 7, 52, c.f161639q, c.f161638p, 9, c.H, c.f161636n, 52, 7, 4, c.f161636n, c.f161636n, 2, 5, c.f161636n, 52, 9, 7, 10, 8, 0, 52, 7, 2, c.B, 31, 52, c.E, c.f161638p, c.C, 8, c.f161638p, 5, 31, 10, c.f161636n, c.f161638p, 39, 34, 34, 47, 50, 47, 41, 40, 39, 42, c.C, 34, 35, 36, 51, 33, c.C, 42, 41, 33, 33, 47, 40, 33, c.C, 53, 39, 43, 54, 42, 47, 40, 33, c.C, 54, 35, 52, 37, 35, 40, 50, 39, 33, 35, 84, 81, 91, 66, 106, 84, 81, 81, 92, 65, 92, 90, 91, 84, 89, 106, 89, 90, 82, 82, 92, 91, 82, 106, 71, 80, 65, 71, 76, 106, 89, 92, 88, 92, 65, c.f161636n, 9, 3, c.D, 50, c.f161636n, 9, 9, 4, c.C, 4, 2, 3, c.f161636n, 1, 50, 1, 2, 10, 10, 4, 3, 10, 50, c.B, c.H, 8, 50, c.C, 8, 0, c.G, 50, c.f161635m, 4, 1, 8, 50, c.f161635m, 2, 31, 50, 31, 8, c.D, 31, 4, c.C, 8, 112, 117, 127, 102, 78, 112, 127, 117, 99, 126, a.f127263w, 117, 78, 112, 125, 102, 112, 104, 98, 78, 125, 126, 118, 78, 114, 126, 99, 116, 78, 119, q.f83619w, 127, 127, 116, 125, 78, 116, 103, 116, 127, 101, 98, 70, 67, 73, 80, a.f127263w, 70, 73, 67, 85, 72, 78, 67, a.f127263w, 68, 70, 68, 79, 66, a.f127263w, 67, 66, 69, 82, 64, a.f127263w, 66, 81, 66, 73, 83, 84, a.f127263w, 84, 70, 74, 87, 75, 78, 73, 64, a.f127263w, 85, 70, 83, 66, c.f161636n, 9, 3, c.D, 50, c.f161636n, 3, 9, 31, 2, 4, 9, 50, 9, 4, c.H, c.G, c.f161636n, c.C, c.f161638p, 5, 8, 31, 50, 4, 3, 4, c.C, 4, c.f161636n, 1, 50, 31, 8, c.C, 31, c.f161646x, 50, 9, 8, 1, c.f161636n, c.f161646x, 50, 0, c.H, 83, 86, 92, 69, 109, 83, 92, 86, 64, 93, 91, 86, 109, 86, 91, 65, 66, 83, 70, 81, 90, 87, 64, 109, 95, 83, 74, 109, 64, 87, 70, 64, 75, 109, 81, 93, 71, 92, 70, 48, 53, 63, 38, c.f161638p, 48, 63, 53, 35, 62, 56, 53, c.f161638p, 55, 36, 63, 63, 52, yr.a.f159811k, c.f161638p, 53, 52, 51, 36, 54, c.f161638p, 52, 39, 52, 63, 37, 34, c.f161638p, 34, 48, 60, 33, yr.a.f159811k, 56, 63, 54, c.f161638p, 35, 48, 37, 52, 68, 65, 75, 82, 122, 68, 75, 65, 87, 74, 76, 65, 122, 76, 85, 70, 122, 65, 64, 71, 80, 66, 122, 64, 83, 64, 75, 81, 86, 122, 86, 68, 72, 85, 73, 76, 75, 66, 122, 87, 68, 81, 64, 54, 51, 57, 32, 8, 54, 57, 51, 37, 56, 62, 51, 8, 59, 56, 52, 54, 59, 8, 52, 56, 34, 57, 35, 50, 37, 36, 8, 36, 54, 58, 39, 59, 62, 57, 48, 8, 37, 54, 35, 50, 77, 72, 66, 91, 115, 77, 66, 72, 94, 67, 69, 72, 115, 66, 77, 88, 69, 90, 73, 115, 90, 69, 73, 91, 77, 78, 69, 64, 69, 88, 85, 115, 68, 69, 95, 88, 67, 94, 85, 115, 95, 77, 65, 92, 64, 69, 66, 75, 115, 94, 77, 88, 73, 91, 94, 84, 77, 101, 91, 84, 94, 72, 85, 83, 94, 101, 84, 95, 78, 77, 85, 72, 81, 101, 94, 95, 88, 79, 93, 101, 95, 76, 95, 84, 78, 73, 101, 73, 91, 87, 74, 86, 83, 84, 93, 101, 72, 91, 78, 95, 76, 73, 67, 90, 114, 76, 67, 73, 95, 66, 68, 73, 114, 88, 94, 72, 114, 65, 66, 78, 76, 65, 114, 78, 66, 88, 67, 89, 72, 95, 94, 123, 126, 116, 109, 69, 126, 127, a.f127263w, 111, 125, 69, 118, 117, 125, 69, 124, 115, 118, 127, 69, 105, 115, 96, 127, 69, 118, 115, 119, 115, 110, 69, a.f127263w, 99, 110, 127, 105, 73, 76, 70, 95, 119, 76, 77, 74, 93, 79, 119, 68, 71, 79, 79, 65, 70, 79, a.f127263w, 125, 119, 110, 70, 125, 124, 123, 108, 126, 70, 117, 118, 126, 126, 112, 119, 126, 70, 124, 111, 124, 119, 109, 70, 117, 112, 116, 112, 109, 19, c.f161648z, 28, 5, 45, c.H, c.G, c.f161647y, 45, 19, c.f161648z, c.f161648z, c.E, 6, c.E, c.G, 28, 19, c.H, 45, c.H, c.G, c.f161647y, c.f161647y, c.E, 28, c.f161647y, 45, c.A, 4, c.A, 28, 6, 1, 45, c.H, c.E, 31, c.E, 6, 53, 48, 58, 35, c.f161635m, 56, 59, 51, c.f161635m, 53, 48, 48, yr.a.f159811k, 32, yr.a.f159811k, 59, 58, 53, 56, c.f161635m, 56, 59, 51, 51, yr.a.f159811k, 58, 51, c.f161635m, yr.a.f159811k, 58, c.f161635m, 57, 49, 57, 59, 38, 45, c.f161635m, 49, 34, 49, 58, 32, 39, c.f161635m, 56, yr.a.f159811k, 57, yr.a.f159811k, 32, 73, 76, 70, 95, 119, 68, 71, 79, 119, 73, 76, 76, 65, 92, 65, 71, 70, 73, 68, 119, 68, 71, 79, 79, 65, 70, 79, 119, 91, 77, 91, 91, 65, 71, 70, 119, 77, 94, 77, 70, 92, 91, 119, 73, 68, 95, 73, 81, 91, 48, 53, 63, 38, c.f161638p, 34, 52, 63, 53, c.f161638p, 48, 53, 53, 56, 37, 56, 62, 63, 48, yr.a.f159811k, c.f161638p, 53, 52, 51, 36, 54, c.f161638p, yr.a.f159811k, 62, 54, 54, 56, 63, 54, c.f161638p, 34, 37, 48, 50, 58, 37, 35, 48, 50, 52, 122, 127, 117, 108, 68, 104, 115, 116, 110, 119, 127, 68, 110, 104, 126, 68, 125, 114, 119, 126, 68, 121, 122, 104, 126, 127, 68, 105, 126, a.f127263w, 116, 105, 127, 68, 127, 122, 111, 122, 121, 122, 104, 126, 32, 37, 47, 54, c.H, 52, 50, 36, c.H, 50, 41, 46, 51, 53, c.H, 36, 47, 55, c.H, 37, 32, 53, 32, c.H, 
        39, 46, 51, c.H, 32, 37, 37, 40, 53, 40, 46, 47, 32, 45, c.H, 45, 46, 38, 38, 40, 47, 38, 122, 124, 71, 124, 121, 108, 121, 71, 116, 119, 127, 127, q.A, 118, 127, 71, 116, q.A, 117, q.A, 108, c.f161635m, c.f161640r, c.A, c.B, c.A, c.E, c.D, 33, c.f161643u, 17, c.C, c.C, c.A, c.f161640r, c.C, 33, c.D, c.A, 13, c.f161638p, 31, 10, c.G, c.f161648z, 33, c.A, c.f161640r, 10, c.E, c.f161636n, 8, 31, c.f161643u, 33, 13, c.E, c.G, 17, c.f161640r, c.D, 13, 66, 89, 94, 81, 94, 82, 83, 104, 91, 88, 80, 80, 94, 89, 80, 104, 82, 65, 82, 89, 67, 104, 91, 94, 90, 94, 67, 3, c.B, 31, c.f161640r, 31, 19, c.f161643u, 41, c.D, c.C, 17, 17, 31, c.B, 17, 41, 31, c.E, c.E, 19, c.f161643u, 31, c.A, 2, 19, 41, c.f161643u, 19, c.D, c.A, c.f161639q, 41, c.E, 5, 102, 125, 122, 117, 122, 118, 119, 76, 127, 124, 116, 116, 122, 125, 116, 76, 97, 118, 103, 97, 106, 76, 127, 122, 126, 122, 103};
    }

    static {
        A0N();
    }

    public static int A00(Context context) {
        return C2350Up.A0V(context).A32(A0L(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, 40, 73), 10);
    }

    public static int A01(Context context) {
        return C2350Up.A0V(context).A32(A0L(790, 50, 111), 50);
    }

    public static int A02(Context context) {
        return C2350Up.A0V(context).A32(A0L(149, 35, 14), 1);
    }

    public static int A03(Context context) {
        return A0H(context, A0L(59, 46, 80), 0);
    }

    public static int A04(Context context) {
        return A0H(context, A0L(105, 44, 125), 0);
    }

    public static int A05(Context context) {
        return C2350Up.A0V(context).A32(A0L(1022, 21, 35), 10);
    }

    public static int A06(Context context) {
        return C2350Up.A0V(context).A32(A0L(275, 45, 28), 0);
    }

    public static int A07(Context context) {
        return C2350Up.A0V(context).A32(A0L(TTAdConstant.STYLE_SIZE_RADIO_2_3, 36, 33), 10485760);
    }

    public static int A08(Context context) {
        return C2350Up.A0V(context).A32(A0L(720, 30, 34), 30);
    }

    public static int A09(Context context) {
        return C2350Up.A0V(context).A32(A0L(366, 39, 9), 5);
    }

    public static int A0A(Context context) {
        return C2350Up.A0V(context).A32(A0L(405, 46, 106), 0);
    }

    public static int A0B(Context context) {
        return C2350Up.A0V(context).A32(A0L(451, 43, 30), 0);
    }

    public static int A0C(Context context) {
        return C2350Up.A0V(context).A32(A0L(494, 41, 108), 0);
    }

    public static int A0D(Context context) {
        return C2350Up.A0V(context).A32(A0L(535, 53, 23), 0);
    }

    public static int A0E(Context context) {
        return C2350Up.A0V(context).A32(A0L(588, 47, 1), 0);
    }

    public static int A0F(Context context) {
        return C2350Up.A0V(context).A32(A0L(1084, 27, 12), 30);
    }

    public static int A0G(Context context) {
        return C2350Up.A0V(context).A32(A0L(1145, 27, 40), 20);
    }

    public static int A0H(Context context, String str, int i10) {
        int iA32 = C2350Up.A0V(context).A32(str, i10);
        if (iA32 >= 0 && iA32 < 101) {
            return iA32;
        }
        return i10;
    }

    public static long A0I(Context context) {
        return C2350Up.A0V(context).A33(A0L(320, 46, 86), 2000L);
    }

    public static long A0J(Context context) {
        return ((long) C2350Up.A0V(context).A32(A0L(IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED, 41, 69), 300)) * 1000;
    }

    public static long A0K(Context context) {
        return C2350Up.A0V(context).A33(A0L(1111, 34, 77), 500L);
    }

    public static HashMap<String, Integer> A0M(Context context) throws JSONException {
        String blackListString = C2350Up.A0V(context).A34(A0L(24, 35, 77), A0L(22, 2, 84));
        HashMap<String, Integer> map = new HashMap<>();
        JSONArray jSONArray = new JSONArray(blackListString);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String strOptString = jSONArray.optString(i10);
            if (!TextUtils.isEmpty(strOptString)) {
                String strA0L = A0L(0, 1, 85);
                if (strOptString.contains(strA0L)) {
                    String[] strArrSplit = strOptString.split(strA0L);
                    String blackListString2 = strArrSplit[1];
                    try {
                        int i11 = Integer.parseInt(blackListString2);
                        String str = strArrSplit[0];
                        Integer numValueOf = Integer.valueOf(i11);
                        String[] strArr = A01;
                        if (strArr[1].charAt(19) == strArr[6].charAt(19)) {
                            throw new RuntimeException();
                        }
                        A01[2] = "wzhVBTrm4NHLde2dsMQb3id1wgsCAtfS";
                        map.put(str, numValueOf);
                    } catch (NumberFormatException unused) {
                        throw new JSONException(A0L(1, 21, 100));
                    }
                } else {
                    String[] strArr2 = A01;
                    if (strArr2[1].charAt(19) != strArr2[6].charAt(19)) {
                        String[] strArr3 = A01;
                        strArr3[5] = "lVwzbqekYbQANiPk50jGeH7RXXU9rAeI";
                        strArr3[7] = "4HLNgzBPZBjDavwa2VUT1a0cI7AwYTVO";
                        map.put(strOptString, -1);
                    } else {
                        map.put(strOptString, -1);
                    }
                }
            }
        }
        return map;
    }

    public static boolean A0O(Context context) {
        return C2350Up.A0V(context).A38(A0L(184, 49, 86), true);
    }

    public static boolean A0P(Context context) {
        return C2350Up.A0V(context).A38(A0L(702, 18, 19), false);
    }

    public static boolean A0Q(Context context) {
        return C2350Up.A0V(context).A38(A0L(840, 49, 19), true);
    }

    public static boolean A0R(Context context) {
        return C2350Up.A0V(context).A38(A0L(889, 45, 106), false);
    }

    public static boolean A0S(Context context) {
        return C2350Up.A0V(context).A38(A0L(233, 42, 42), true);
    }

    public static boolean A0T(Context context) {
        return C2350Up.A0V(context).A38(A0L(934, 42, 32), false);
    }

    public static boolean A0U(Context context) {
        return C2350Up.A0V(context).A38(A0L(635, 31, 22), false);
    }

    public static boolean A0V(Context context) {
        return C2350Up.A0V(context).A38(A0L(976, 46, 122), true);
    }
}

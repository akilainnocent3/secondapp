package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;
import f6.q;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import jj.c;
import l3.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2353Us {
    public static byte[] A00;
    public static String[] A01 = {"QTcAMu2NTOnQYBZmZwc1s5", "djg1XP0D7NXFeZ0NOExGmhJDpZKI4dpr", "ihQhkuhtHB3Nrh2mtKDZtHhTCWsAfOgS", "rKuldGKjFGgUg8", "leLR2vmDgK1cO2", "qW6uohj2RnSHed6NlIulLWXBUQuwa2BT", "fEb7DtRuRt", "Zqv9"};
    public static final AtomicBoolean A02;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{124, 127, -119, -110, 122, -115, -115, 122, 124, 127, 122, 126, -121, -114, 122, -118, -119, 122, 127, -124, -114, 126, -36, -33, -23, q.f83622z, a.B7, -19, -19, a.B7, -36, -33, a.B7, -19, -32, -20, -16, -32, -18, -17, a.B7, -17, -28, q.B, -32, -22, -16, -17, 112, 115, 125, -122, 110, -127, -127, 110, q.A, -125, 110, 119, 112, 125, 115, -126, 119, 112, 122, 116, 110, 116, 125, 112, q.A, 123, 116, 115, -28, -25, -15, -6, -30, -11, -11, -30, q.B, -15, -28, -27, -17, q.B, -25, -65, a.f103452q7, -52, -43, -67, -48, -48, -67, -60, a.f103444p7, -67, a.f103460r7, -42, a.f103529z7, a.f103484u7, -48, -65, -46, a.f103484u7, a.f103520y7, -52, -67, -46, a.f103484u7, a.f103511x7, a.f103460r7, a.f103520y7, -45, -46, -105, -102, -92, -83, -107, -88, -88, -107, -98, -105, -92, -102, -87, -98, -105, -95, -101, -107, -101, -92, -105, -104, -94, -101, -102, -89, -86, -76, -67, -91, -72, -72, -91, -82, -89, -76, -86, -71, -82, -89, -79, -85, -91, -70, -81, -77, -85, -75, -69, -70, -124, -121, -111, -102, -126, -107, -107, -126, -116, -111, -105, -126, -120, -111, -124, -123, -113, -120, -121, a.f103493v7, -52, -42, -33, a.f103484u7, a.B7, a.B7, a.f103484u7, a.B7, -44, -52, a.f103484u7, -44, a.f103511x7, -44, a.f103476t7, a.f103493v7, -45, -36, -60, -41, -41, -60, -41, -37, -60, a.f103502w7, -45, a.f103476t7, a.f103484u7, -47, a.f103502w7, a.f103493v7, 115, 118, -128, -119, q.A, -124, -124, q.A, -123, 119, -128, 118, q.A, 116, -122, q.A, 119, -118, -122, -124, 115, -123, 115, 118, -128, -119, q.A, -124, -124, q.A, -123, 119, -128, 118, q.A, 117, -127, -128, rg.a.f127263w, 123, 121, q.A, -122, -123, -96, -84, -86, 107, -93, -98, -96, -94, -97, -84, -84, -88, 107, -88, -98, -79, -98, -85, -98, -106, -94, -96, 97, -103, -108, -106, -104, -107, -94, -94, -98, 97, -86, -108, -98, -100, -83, -108, -90, -101, -100, -42, -42, a.f103460r7, a.f103493v7, -46, a.f103468s7, a.f103476t7, -48, a.f103493v7, -56};
    }

    static {
        A06();
        A02 = new AtomicBoolean(false);
    }

    public static int A00(Context context) {
        return C2350Up.A0V(context).A32(A04(22, 26, 108), 10000);
    }

    public static int A01(Context context) {
        return C2350Up.A0V(context).A32(A04(145, 25, 55), 30000);
    }

    public static long A02(Context context) {
        return C2350Up.A0V(context).A33(A04(91, 29, 79), 86400000L);
    }

    public static Boolean A03(JSONObject jSONObject) throws JSONException {
        String strA04 = A04(307, 10, 85);
        if (jSONObject.has(strA04)) {
            return Boolean.valueOf(jSONObject.optBoolean(strA04, false));
        }
        return null;
    }

    public static String A05(boolean z10) {
        return z10 ? A04(285, 22, 36) : A04(266, 19, 46);
    }

    public static void A07(Context context) {
        C2350Up.A0V(context).A35(A04(76, 15, 116));
    }

    public static boolean A08(Context context) {
        return C2350Up.A0V(context).A38(A04(0, 22, 12), true);
    }

    public static boolean A09(Context context) {
        return A02.get() || A0K(context);
    }

    public static boolean A0A(Context context) {
        return C2350Up.A0V(context).A38(A04(c.f100514f, 19, 20), true);
    }

    public static boolean A0B(Context context) {
        return C2350Up.A0V(context).A38(A04(204, 18, 86), true);
    }

    public static boolean A0C(Context context) {
        return C2350Up.A0V(context).A38(A04(189, 15, 89), true);
    }

    public static boolean A0D(Context context) {
        return C2350Up.A0V(context).A38(A04(244, 22, 3), true);
    }

    public static boolean A0E(Context context) {
        return C2350Up.A1d(context) || A0H(context);
    }

    public static boolean A0F(Context context) {
        return A02.get() || A0I(context);
    }

    public static boolean A0G(Context context) {
        return C2350Up.A0V(context).A38(A04(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 22, 3), false);
    }

    public static boolean A0H(Context context) {
        if (!A0K(context)) {
            return false;
        }
        C2350Up c2350UpA0V = C2350Up.A0V(context);
        if (A01[5].charAt(3) != 'u') {
            throw new RuntimeException();
        }
        A01[1] = "s8XR5C0JhaykpGlf4kHqosaURTbELCS3";
        return c2350UpA0V.A38(A04(120, 25, 39), false);
    }

    public static boolean A0I(Context context) {
        return A0K(context) && C2350Up.A0V(context).A38(A04(48, 28, 0), false);
    }

    public static boolean A0J(Context context) {
        return A0B(context) || A0A(context);
    }

    public static boolean A0K(Context context) {
        return C2350Up.A0V(context).A38(A04(76, 15, 116), false) && A0J(context) && !A0L(context, A02(context));
    }

    public static boolean A0L(Context context, long j10) {
        long lastUpdateTime = System.currentTimeMillis();
        long currentTime = C2350Up.A0U(context);
        return lastUpdateTime - currentTime > j10;
    }

    public static boolean A0M(String str) {
        if (str != null) {
            try {
                JSONObject bidPayloadJson = new JSONObject(str);
                Boolean boolA03 = A03(bidPayloadJson);
                if (boolA03 != null) {
                    return boolA03.booleanValue();
                }
                return true;
            } catch (JSONException unused) {
                return true;
            }
        }
        return true;
    }
}

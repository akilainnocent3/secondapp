package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalKey;
import f6.q;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC2792ey {
    A04(A00(147, 33, 22)),
    A05(A00(180, 36, 110)),
    A06(A00(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 29, SignalKey.EVENT_ID)),
    A03(A00(78, 32, 92)),
    A07(A00(110, 37, 90));

    public static byte[] A01;
    public String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{c.f161646x, 7, c.D, c.f161639q, 28, c.f161635m, 37, 7, 10, 37, 9, c.f161643u, c.f161639q, 9, 17, a.f103444p7, -76, a.f103484u7, -68, a.f103493v7, -72, -46, -74, a.f103452q7, a.f103436o7, a.f103460r7, -65, -72, a.f103484u7, -72, -35, -48, -29, a.f103428n7, -27, -44, -18, -44, -35, -45, -18, -48, -46, -29, a.f103428n7, -27, a.f103428n7, -29, q.B, -35, -48, -29, a.f103428n7, -27, -44, -18, -44, a.C7, a.C7, -34, a.C7, a.E7, -52, -33, -44, a.C7, -48, -22, -44, a.f103428n7, -37, -35, -48, -34, -34, -44, a.B7, a.E7, 41, 53, 51, -12, 44, 39, 41, 43, 40, 53, 53, 49, -12, 39, 42, 57, -12, 52, 39, 58, 47, 60, 43, -12, 39, 42, 37, 41, 50, 47, 41, 49, 39, 51, 49, q.f83622z, 42, 37, 39, 41, 38, 51, 51, 47, q.f83622z, 37, 40, 55, q.f83622z, 50, 37, 56, 45, 58, 41, q.f83622z, 37, 40, 35, 45, 49, 52, 54, 41, 55, 55, 45, 51, 50, -29, -17, -19, -82, -26, a.C7, -29, -27, -30, -17, -17, -21, -82, a.C7, -28, -13, -82, -18, a.C7, -12, -23, -10, -27, -82, -29, -17, -19, -16, -20, -27, -12, -27, -28, 59, 71, 69, 6, 62, 57, 59, yr.a.f159811k, 58, 71, 71, 67, 6, 57, 60, 75, 6, 70, 57, 76, 65, 78, yr.a.f159811k, 6, yr.a.f159811k, 70, 60, 55, 57, 59, 76, 65, 78, 65, 76, 81, 56, 68, 66, 3, 59, 54, 56, 58, 55, 68, 68, 64, 3, 54, 57, 72, 3, 67, 54, 73, 62, 75, 58, 3, 58, 71, 71, 68, 71};
    }

    static {
        A01();
    }

    EnumC2792ey(String str) {
        this.A00 = str;
    }

    public final String A03() {
        return this.A00;
    }
}

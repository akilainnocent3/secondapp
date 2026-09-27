package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalKey;
import f6.q;
import java.util.Arrays;
import l3.a;
import qb.d;
import r1.o;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3286nS implements EP {
    public static byte[] A00;
    public static String[] A01 = {"RZM4uVKUom5lpktBJEyc25x7FZDN3vpb", "gyiT966obFesLv2pc6lrzZfv63yxEjKJ", "VIDunhCfmmrKAvVQDuOofVowNsnrOYKS", "mSpbf5NAYyyPHT1f9KFsrup9mcKoYOHE", "zbmZ0JzF4Zq1L7424UboTB7UCymQSbun", "dFdj", "MzILoqUyJ5XWrj98JXnqdIxQxE4zJ", "8Kz26tJHiwFUzLhIg6rooXB"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 94);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-34, 17, 17, 2, 10, 13, 17, 2, 1, -67, 17, c.f161636n, -67, 0, c.f161639q, 2, -2, 17, 2, -67, 1, 2, 0, c.f161636n, 1, 2, c.f161639q, -67, 3, c.f161636n, c.f161639q, -67, c.f161643u, c.f161635m, c.f161640r, c.f161643u, 13, 13, c.f161636n, c.f161639q, 17, 2, 1, -67, -22, -26, -22, -30, -67, 17, c.f161648z, 13, 2, -41, -67, 19, 34, 34, c.H, c.E, c.f161647y, 19, 38, c.E, 33, 32, a.C7, c.f161647y, c.A, 19, -33, q.B, -30, -22, c.G, 44, 44, 40, 37, 31, c.G, 48, 37, 43, 42, -21, 31, 33, c.G, -23, -13, -20, -12, -56, -41, -41, -45, -48, a.f103502w7, -56, -37, -48, -42, -43, -106, a.f103511x7, -35, a.f103493v7, a.B7, -36, a.f103493v7, a.B7, -3, c.f161636n, c.f161636n, 8, 5, -1, -3, c.f161640r, 5, c.f161635m, 10, a.f103511x7, c.f161636n, 3, c.f161639q, 59, 74, 74, 70, 67, yr.a.f159811k, 59, 78, 67, 73, 72, 9, 78, 78, 71, 70, 5, 82, 71, 70, -35, -20, -20, q.B, -27, -33, -35, -16, -27, -21, -22, -85, -12, -87, -23, -20, -80, -87, -33, a.C7, -35, -87, -78, -84, -76, c.f161639q, c.H, c.H, c.D, c.A, 17, c.f161639q, 34, c.A, c.G, 28, -35, 38, -37, c.E, c.H, -30, -37, 36, 34, 34, -32, -17, -17, -21, q.B, -30, -32, -13, q.B, -18, -19, -82, -9, -84, -16, -12, q.B, -30, -22, -13, q.B, -20, -28, -84, -13, -9, -78, -26, a.f103493v7, a.f103428n7, a.f103428n7, -44, -47, a.f103511x7, a.f103493v7, -36, -47, -41, -42, -105, -32, -107, -37, -35, a.f103502w7, a.B7, -47, a.f103428n7, -16, a.C7, -12, -16, -85, q.f83622z, -16, -16, yr.a.f159811k, 46, 65, yr.a.f159811k, -8, 65, -10, 46, 65, 56, 57, 53, 42, 66, 46, 59, -10, 44, 62, 46, 60, -45, -60, -41, -45, -114, -41, -116, -46, -46, a.f103436o7};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.core.EP
    public final InterfaceC3199lq A5K(C3460qI c3460qI) {
        byte b10;
        String str = c3460qI.A0W;
        if (str != null) {
            switch (str.hashCode()) {
                case 1201784583:
                    String mimeType = A00(d.f122118j, 21, SignalKey.EVENT_ID);
                    if (str.equals(mimeType)) {
                        b10 = 0;
                        break;
                    }
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    return new C9k();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        String mimeType2 = A00(0, 55, 63);
        throw new IllegalArgumentException(sb2.append(mimeType2).append(str).toString());
    }

    @Override // com.facebook.ads.redexgen.core.EP
    public final boolean AKN(C3460qI c3460qI) {
        String str = c3460qI.A0W;
        String mimeType = A00(241, 8, 30);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(com.google.android.material.bottomappbar.d.f50281j, 10, 1);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(127, 20, 124);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(172, 21, 80);
                    if (!mimeType4.equals(str)) {
                        String[] strArr = A01;
                        String str2 = strArr[6];
                        String mimeType5 = strArr[7];
                        if (str2.length() != mimeType5.length()) {
                            A01[4] = "ilKJ2fcQQU31mDfBW0rq4wTAOnRwqntF";
                            String mimeType6 = A00(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 20, 10);
                            if (!mimeType6.equals(str)) {
                                String mimeType7 = A00(o.f123455u, 28, 33);
                                if (!mimeType7.equals(str)) {
                                    String mimeType8 = A00(55, 19, 84);
                                    boolean zEquals = mimeType8.equals(str);
                                    String mimeType9 = A01[5];
                                    if (mimeType9.length() == 4) {
                                        String[] strArr2 = A01;
                                        strArr2[3] = "zagSEBYMwAryKt6uIWB8fghbt3YyxLCs";
                                        strArr2[0] = "njnOkrTqvKyYsDLdiJrWbCfOV0ebYkea";
                                        if (!zEquals) {
                                            String mimeType10 = A00(147, 25, 30);
                                            if (!mimeType10.equals(str)) {
                                                String mimeType11 = A00(74, 19, 94);
                                                if (!mimeType11.equals(str)) {
                                                    String mimeType12 = A00(93, 19, 9);
                                                    if (!mimeType12.equals(str)) {
                                                        String mimeType13 = A00(112, 15, 62);
                                                        if (!mimeType13.equals(str)) {
                                                            String mimeType14 = A00(d.f122118j, 21, SignalKey.EVENT_ID);
                                                            if (!mimeType14.equals(str)) {
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new RuntimeException();
                    }
                }
            }
        }
        return true;
    }
}

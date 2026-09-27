package com.facebook.ads.redexgen.core;

import android.content.Intent;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.vungle.ads.internal.protos.Sdk;
import f6.q;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2272Ro {
    public static byte[] A07;
    public static String[] A08 = {"WrVVpIlV0mVOOesXyJjac9RJgGDEsYiy", "55KqVxwk4ItPenJ0PbzoYHpl7VLiDDoF", "", "85Uc86a0UVsoWW8LIwye7frNycSrKuPv", "TRaam", "0wWSnm1p2XMm3vcxH", "", "BPzoua9RAnM56oYN7Gpf0cmvKga9OU"};
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AudienceNetworkActivity A04;
    public final AudienceNetworkActivityApi A05;
    public final C2900gi A06;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-78, -19, -7, -9, -72, -16, -21, -19, -17, -20, -7, -7, -11, -72, -21, -18, -3, -72, -21, -18, -4, -17, -6, -7, -4, -2, -13, -8, -15, -72, -48, -45, a.f103428n7, -45, -35, -46, -23, a.f103511x7, a.f103529z7, -23, -36, a.A7, a.B7, a.E7, -36, -34, -45, a.f103428n7, -47, -23, -48, -42, a.E7, a.C7, 28, 40, 38, -25, 31, c.D, 28, c.H, c.E, 40, 40, 36, -25, c.D, c.G, 44, -25, 34, 39, 45, c.H, 43, 44, 45, 34, 45, 34, c.D, 37, -25, c.D, 28, 45, 34, 47, 34, 45, 50, c.B, c.G, c.H, 44, 45, 43, 40, 50, c.H, c.G, c.f161640r, 28, c.D, -37, 19, c.f161638p, c.f161640r, c.f161643u, c.f161639q, 28, 28, c.B, -37, c.f161638p, 17, 32, -37, c.f161648z, c.E, 33, c.f161643u, 31, 32, 33, c.f161648z, 33, c.f161648z, c.f161638p, c.C, -37, 17, c.f161648z, 32, c.D, c.f161648z, 32, 32, c.f161643u, 17, 46, 58, 56, -7, 49, 44, 46, 48, 45, 58, 58, 54, -7, 44, 47, 62, -7, 52, 57, 63, 48, yr.a.f159811k, 62, 63, 52, 63, 52, 44, 55, -7, 48, yr.a.f159811k, yr.a.f159811k, 58, yr.a.f159811k, a.E7, -27, -29, -92, -36, -41, a.E7, -37, a.f103428n7, -27, -27, a.C7, -92, -41, a.B7, -23, -92, -33, -28, -22, -37, q.B, -23, -22, -33, -22, -33, -41, -30, -92, -36, -33, -28, -33, -23, -34, -43, -41, a.E7, -22, -33, -20, -33, -22, -17, -4, 8, 6, a.f103484u7, -1, -6, -4, -2, -5, 8, 8, 4, a.f103484u7, -6, -3, c.f161636n, a.f103484u7, 2, 7, 13, -2, c.f161635m, c.f161636n, 13, 2, 13, 2, -6, 5, a.f103484u7, 2, 6, 9, c.f161635m, -2, c.f161636n, c.f161636n, 2, 8, 7, a.f103484u7, 5, 8, 0, 0, -2, -3, c.f161638p, 31, c.f161638p, c.A, c.G};
    }

    static {
        A01();
    }

    public C2272Ro(AudienceNetworkActivityApi audienceNetworkActivityApi, C2900gi c2900gi, AudienceNetworkActivity audienceNetworkActivity) {
        this.A05 = audienceNetworkActivityApi;
        this.A06 = c2900gi;
        this.A04 = audienceNetworkActivity;
    }

    private final void A02(boolean z10) {
        this.A03 = z10;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[RETURN, SYNTHETIC] */
    private final boolean A03(WK wk2) {
        if (wk2 != WK.A0I && wk2 != WK.A0H) {
            WK wk3 = WK.A08;
            String[] strArr = A08;
            if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "QK9lt";
            strArr2[5] = "71ldustRCfnIbk6ZF";
            if (wk2 != wk3 && wk2 != WK.A05 && wk2 != WK.A0G) {
                WK wk4 = WK.A0J;
                String[] strArr3 = A08;
                if (strArr3[6].length() != strArr3[2].length()) {
                    String[] strArr4 = A08;
                    strArr4[4] = "n7dEG";
                    strArr4[5] = "EMW1RUsZodH5Xcp8C";
                    if (wk2 != wk4) {
                        return false;
                    }
                } else {
                    String[] strArr5 = A08;
                    strArr5[6] = "";
                    strArr5[2] = "";
                    if (wk2 != wk4) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final void A04(WK wk2, String str) {
        boolean z10 = !this.A03 || C2350Up.A23(this.A06);
        boolean shouldCallOnDestroy = this.A02;
        if (!shouldCallOnDestroy && z10) {
            boolean shouldCallOnDestroy2 = A03(wk2);
            if (shouldCallOnDestroy2) {
                A09(EnumC2793ez.A03.A03(), str);
            } else {
                A09(A00(54, 48, 103), str);
            }
            this.A02 = true;
        }
    }

    public final void A05(WK wk2, String str) {
        if (A03(wk2)) {
            A09(EnumC2793ez.A09.A03(), str);
        } else {
            A09(A00(141, 35, 121), str);
        }
    }

    public final void A06(WK wk2, String str) {
        if (A03(wk2)) {
            A09(EnumC2793ez.A05.A03(), str);
        } else {
            A09(A00(102, 39, 91), str);
        }
        A02(true);
        A04(wk2, str);
    }

    public final void A07(WK wk2, String str) {
        if (C2350Up.A1x(this.A06) && !this.A01 && !this.A00) {
            InterfaceC2126Lt interfaceC2126LtA0F = this.A06.A0F();
            String[] strArr = A08;
            if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "ERQ6CJuvlb3tCwq1OYCzpUpdhNPz9IsE";
            strArr2[0] = "fdli8mgwNbZyMwMFsZ54k8DyiigEG2Sx";
            interfaceC2126LtA0F.ACd();
            A05(wk2, str);
        }
    }

    public final void A08(String str, UL ul2, String str2) {
        Intent intent = new Intent(str + A00(0, 1, 38) + str2);
        if (ul2 != null) {
            intent.putExtra(A00(268, 5, 87), ul2);
        }
        P2.A00(this.A04).A07(intent);
    }

    public final void A09(String str, String str2) {
        if (A00(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 47, 71).equals(str) || EnumC2793ez.A0A.A03().equals(str)) {
            this.A01 = true;
        }
        boolean zEquals = A00(141, 35, 121).equals(str);
        if (A08[7].length() == 29) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "q8Yu3i76ZTlYqxP4qtQeXX4gnui9AJbb";
        strArr[0] = "UYbwc2QJiguNdyXAgiRTefqPyIZvniQg";
        if (zEquals || EnumC2793ez.A09.A03().equals(str)) {
            this.A00 = true;
        }
        if (A00(1, 53, 56).equals(str)) {
            this.A05.finish(9);
        } else if (A00(176, 45, 36).equals(str)) {
            this.A05.finish(10);
        } else {
            A08(str, null, str2);
        }
    }
}

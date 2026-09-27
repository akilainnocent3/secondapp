package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalKey;
import f6.q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import l3.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class WA {
    public static byte[] A0C;
    public static String[] A0D = {"u7auSF2QbA7keT455OtLfVATNnMuonV2", "9Ni6xyVwZaeKacoBimRjslH6Dei", "NGE2fLmKrMN6Gw2Fz9z7jAXvyfAydpGl", "srT3S5MN", "jMoNZ8Vk", "oZZQeSbHWWSZcPAQallJMC7N5h2", "GNfhbJ55AYf3nQ2lY9fIFOrmofPjrLRg", "qccEv4BxkjzqCatZiOtTgryF8DF84JXr"};
    public int A00;
    public T8 A01;
    public EnumC2375Vq A02;
    public C2421Xn A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final U3 A09;
    public final AdPlacementType A0A;
    public final C2379Vu A0B;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{-34, -95, -105, -102, -75, -101, -82, -90, -101, -88, -97, -101, -92, -103, -101, -75, -86, -81, -90, -101, -52, a.A7, -22, -35, -48, -37, a.B7, -35, -33, -44, a.E7, -46, -22, a.f103529z7, a.B7, a.E7, -47, -44, -46, -22, -41, -52, -34, -33, -22, -32, -37, a.A7, -52, -33, -48, -22, -33, -44, a.f103428n7, -48, c.f161635m, c.f161643u, 13, 40, c.f161643u, 13, -29, -22, -27, 0, -11, -22, -18, -26, 0, -11, -16, -20, -26, -17, -105, -96, -99, -103, -94, -88, -77, -90, -103, -91, -87, -103, -89, -88, -77, -99, -104, -109, -97, -96, -96, -111, a.f103468s7, a.f103476t7, a.f103529z7, -48, -32, a.f103452q7, a.f103468s7, -32, a.f103502w7, a.f103468s7, -74, a.f103493v7, a.f103468s7, a.f103460r7, -78, -48, -71, -70, -65, a.f103468s7, -60, -9, -12, -8, -10, -9, 3, -74, -79, -77, -82, a.f103502w7, a.f103468s7, a.f103484u7, a.f103452q7, -32, a.f103484u7, a.f103520y7, a.f103452q7, -56, -92, -82, -70, -88, -80, -89, -81, -92, -70, -100, -97, -70, -96, -77, -85, -96, -83, -92, -96, -87, -98, -96, 4, 0, c.B, c.f161635m, -2, c.f161636n, 13, c.f161635m, 2, -4, 13, -2, -3, -34, -45, -27, -26, -15, -27, -45, q.B, -41, -42, -15, -34, a.C7, -43, -45, -34, -41, -28, -21, -29, -11, -41, a.B7, -23, -11, q.B, -37, -25, -21, -37, -23, -22, -37, a.B7, -77, -81, -92, -90, -88, -80, -88, -79, -73, a.f103452q7, -84, -89, a.f103529z7, a.f103502w7, -65, a.f103444p7, a.f103460r7, a.f103511x7, a.f103460r7, -52, -46, -35, -46, -41, a.f103529z7, a.f103460r7, c.f161647y, 8, c.f161646x, c.B, 8, c.f161648z, c.A, 34, c.A, c.f161636n, c.f161640r, 8, -4, -3, -22, -20, -12, 8, -3, -5, -22, -20, -18, -7, -22, q.f83622z, -11, -15, -26, -7, -22, 4, -18, -23, a.f103476t7, -73, a.f103468s7, a.f103476t7, -47, -65, a.f103444p7, -74, -73, -13, -27, -32, -16, -28};
    }

    static {
        A02();
    }

    public WA(T8 t10, String str, C2421Xn c2421Xn, EnumC2375Vq enumC2375Vq, int i10, C2379Vu c2379Vu, String str2, String str3, String str4, U3 u10) {
        this.A01 = t10;
        this.A06 = str;
        this.A03 = c2421Xn;
        this.A02 = enumC2375Vq;
        this.A00 = i10;
        this.A0B = c2379Vu;
        this.A0A = enumC2375Vq.A05(this.A01);
        this.A07 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A09 = u10;
    }

    private long A00() {
        SharedPreferences sharedPreferencesA00 = WN.A00(this.A01);
        String strA01 = A01(0, 0, 79);
        String strA02 = A01(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 17, 68);
        String lastSavedLocale = sharedPreferencesA00.getString(strA02, strA01);
        if (lastSavedLocale == null) {
            return 0L;
        }
        if (lastSavedLocale.equals(Locale.getDefault().toString())) {
            return AbstractC2191Oh.A00(this.A01.A02()).A09();
        }
        sharedPreferencesA00.edit().putString(strA02, Locale.getDefault().toString()).apply();
        return 0L;
    }

    private void A03(Map<String, String> params, String str, String str2) {
        params.put(str, str2);
    }

    public final int A04() {
        return this.A00;
    }

    public final U3 A05() {
        return this.A09;
    }

    public final AdPlacementType A06() {
        return this.A0A;
    }

    public final EnumC2375Vq A07() {
        return this.A02;
    }

    public final C2421Xn A08() {
        return this.A03;
    }

    public final String A09() {
        return this.A06;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0157  */
    /* JADX WARN: Code duplicated, block: B:36:0x0197  */
    public final Map<String, String> A0A(Map<String, String> map) {
        String strA01;
        HashMap map2 = new HashMap(map);
        A03(map2, A01(125, 4, 31), SZ.A00().A03());
        if (SZ.A00().A04()) {
            strA01 = A01(0, 1, 96);
        } else {
            strA01 = A01(1, 1, 34);
        }
        A03(map2, A01(129, 9, 51), strA01);
        A03(map2, A01(93, 5, 2), String.valueOf(this.A09.AAa()));
        String idfaFlag = A01(207, 12, 21);
        A03(map2, idfaFlag, this.A06);
        if (this.A0A != AdPlacementType.UNKNOWN) {
            A03(map2, A01(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 14, 48), this.A0A.toString().toLowerCase());
        }
        if (this.A03 != null) {
            A03(map2, A01(276, 5, 78), String.valueOf(this.A03.A01()));
            A03(map2, A01(119, 6, 97), String.valueOf(this.A03.A00()));
        }
        EnumC2375Vq enumC2375Vq = this.A02;
        String[] strArr = A0D;
        String idfaFlag2 = strArr[3];
        if (idfaFlag2.length() == strArr[4].length()) {
            String[] strArr2 = A0D;
            strArr2[1] = "MtgCRt6raT7lLAmxmnhZWRhCoK6";
            strArr2[5] = "TefOAifnH3N8w6fQm3K3ucYxLzr";
            if (enumC2375Vq != null) {
                String strValueOf = String.valueOf(this.A02.A04());
                String[] strArr3 = A0D;
                String idfaFlag3 = strArr3[1];
                if (idfaFlag3.length() == strArr3[5].length()) {
                    String[] strArr4 = A0D;
                    strArr4[2] = "oEScE6GwBx0T7gd10O4WpCDAWbiGO08C";
                    strArr4[6] = "F3x5JK4fAwlkZj0maRZJGdAXlKAKJxnY";
                    A03(map2, A01(256, 11, 87), strValueOf);
                }
            }
            if (this.A09.isTestMode(this.A01)) {
                A03(map2, A01(267, 9, 36), A01(1, 1, 34));
            }
            U3 u10 = this.A09;
            String[] strArr5 = A0D;
            if (strArr5[2].charAt(1) != strArr5[6].charAt(1)) {
                String[] strArr6 = A0D;
                strArr6[1] = "P1GrzNsZRgJooEVm5vEQxHxZ4Z0";
                strArr6[5] = "F8cEJY3nZiqqQFAmyopMZkDj7B2";
                if (u10.A9G() != null) {
                    A03(map2, A01(98, 10, 51), this.A09.A9G());
                }
            } else if (u10.A9G() != null) {
                A03(map2, A01(98, 10, 51), this.A09.A9G());
            }
            if (this.A00 != 0) {
                A03(map2, A01(190, 17, 72), String.valueOf(this.A00));
            }
            boolean z10 = this.A08;
            String[] strArr7 = A0D;
            if (strArr7[1].length() == strArr7[5].length()) {
                String[] strArr8 = A0D;
                strArr8[2] = "uWxLBVxijt65dRlk9T2Hn2WYlcbw5EIA";
                strArr8[6] = "gJEIMXTCWTN9wPxeCuHJDhMtmXZzR3hI";
                if (z10) {
                    A03(map2, A01(138, 22, 13), String.valueOf(this.A08));
                }
            } else if (z10) {
                A03(map2, A01(138, 22, 13), String.valueOf(this.A08));
            }
            A03(map2, A01(160, 13, SignalKey.EVENT_ID), String.valueOf(YC.A02(this.A01)));
            A03(map2, A01(233, 12, 117), Y1.A06(System.currentTimeMillis()));
            if (this.A0B.A06() && this.A0B.A04() != null) {
                A03(map2, A01(56, 6, 123), this.A0B.A04());
            }
            String strA05 = this.A0B.A05();
            if (!TextUtils.isEmpty(strA05)) {
                A03(map2, A01(62, 14, 83), strA05);
            }
            if (this.A07 != null) {
                A03(map2, A01(245, 11, 91), this.A07);
            }
            A03(map2, A01(76, 17, 6), UUID.randomUUID().toString());
            String strA07 = Y1.A07(A00());
            String[] strArr9 = A0D;
            if (strArr9[3].length() != strArr9[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr10 = A0D;
            strArr10[2] = "NkXVy20xQPZxPDFffPbPKKxnGzq6Q1tn";
            strArr10[6] = "9D5jR9gI4cGNuuYNFYJ1hn06wNsfKLn7";
            A03(map2, A01(20, 36, 61), strA07);
            if (this.A05 != null) {
                A03(map2, A01(108, 11, 35), this.A05);
            }
            if (this.A04 != null) {
                A03(map2, A01(2, 18, 8), this.A04);
            }
            return map2;
        }
        throw new RuntimeException();
    }
}

package com.facebook.ads.redexgen.core;

import com.google.android.gms.cast.MediaError;
import com.vungle.ads.internal.signals.SignalKey;
import f6.q;
import java.util.Arrays;
import l3.a;
import r7.i1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class EnumC2689dH {
    public static byte[] A01;
    public static String[] A02 = {"7eCrAZGCjapRaLUbK9QRGJs0olrSOuKs", "ySZlw7xE2mJZGUobjeP0sD0O3cTwGa8X", "XGkq56ugg4rIrrrN3BI0SeRXJOu8cnXg", "EhbVD2npYjMN4Lpqgy2TDazDwa0P1ZFY", "GxzPigdu3bGRa23YdvFpU3mIsN0rCQhK", "nJ0CacvfsZFNuLFGVLMdvF7ct8TNyFNR", "5gEoeYtHKqdKxvGOrBFQEkCXLQc4JGvi", "KvAzUjsGuu6UHJoTOmt3i913MHVvWe2E"};
    public static final /* synthetic */ EnumC2689dH[] A03;
    public static final EnumC2689dH A04;
    public static final EnumC2689dH A05;
    public static final EnumC2689dH A06;
    public static final EnumC2689dH A07;
    public static final EnumC2689dH A08;
    public static final EnumC2689dH A09;
    public static final EnumC2689dH A0A;
    public static final EnumC2689dH A0B;
    public static final EnumC2689dH A0C;
    public static final EnumC2689dH A0D;
    public static final EnumC2689dH A0E;
    public static final EnumC2689dH A0F;
    public static final EnumC2689dH A0G;
    public static final EnumC2689dH A0H;
    public static final EnumC2689dH A0I;
    public static final EnumC2689dH A0J;
    public static final EnumC2689dH A0K;
    public static final EnumC2689dH A0L;
    public static final EnumC2689dH A0M;
    public static final EnumC2689dH A0N;
    public static final EnumC2689dH A0O;
    public static final EnumC2689dH A0P;
    public static final EnumC2689dH A0Q;
    public final String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-78, -69, -66, a.f103452q7, -76, a.f103529z7, -79, a.f103444p7, -66, a.f103476t7, a.f103452q7, -76, a.f103444p7, 126, 127, 124, -113, -127, -89, -84, -74, -92, -91, -81, -88, a.f103452q7, -91, -92, -90, -82, a.f103452q7, -91, -72, -73, -73, -78, -79, -77, -68, -81, -80, -70, -77, a.f103520y7, -80, -81, -79, -71, a.f103520y7, -80, a.f103460r7, a.f103452q7, a.f103452q7, -67, -68, -112, -99, -99, -102, -99, -121, -106, -115, -115, -108, -124, -109, -122, -122, -113, -99, -84, -91, -91, -100, -93, 119, 112, 125, 115, 123, 116, -114, 114, -125, 112, -106, -113, -100, -110, -102, -109, -83, -108, -112, -96, -92, -72, -71, -76, -75, a.A7, a.f103476t7, -71, -76, -75, -65, -79, -75, -72, -70, -83, -69, -69, -79, -73, -74, -56, -67, -47, a.f103502w7, -65, -60, -37, -67, a.f103436o7, -37, a.f103529z7, a.f103444p7, -52, a.f103511x7, a.f103529z7, -48, a.f103468s7, a.f103502w7, a.f103460r7, -126, -123, 125, -79, -71, -72, -87, a.f103460r7, -70, -83, -88, -87, -77, -105, -114, -96, -88, -113, -98, -105, -105, -114, -107, a.f103476t7, a.f103484u7, -68, a.f103468s7, -42, a.f103460r7, a.f103436o7, a.f103468s7, a.f103452q7, 91, 76, 96, 94, 80, 106, 97, 84, 79, 80, 90, -47, a.f103520y7, a.f103452q7, a.B7, -32, -41, a.f103502w7, a.f103468s7, a.f103476t7, -48, a.f103529z7, a.f103444p7, -67, a.f103436o7, -37, a.A7, -48, a.f103529z7, a.f103468s7, a.f103502w7, a.f103460r7, -68, -81, a.f103444p7, -85, -68, -82, a.f103493v7, -83, -71, -73, -70, -74, -81, -66, -81, -78, -86, -88, -81, -66, -75, -88, -93, -92, -82, -109, -116, -119, -116, -115, -107, -116, 118, q.A, 104, 115, q.f83619w, 126, 114, 115, q.A, 104, 109, 102, 109, 118, 121, 125, 111, 105, 108, 124, 121, -127, 125, 111, 124, -77, -76, -79, -60, -74, -65, -60, a.f103529z7, -68, -67, a.f103484u7, a.f103436o7, -70, -67, -68, -66, a.f103476t7, -70, -67, -48, a.A7, a.A7, a.f103502w7, a.f103493v7, -80, -71, -84, -83, -73, -80, -86, -83, -84, -82, -74, -86, -83, a.f103436o7, -65, -65, -70, -71, -47, -34, -34, -37, -34, 118, -123, 126, 126, 117, 124, -95, -102, -89, -99, -91, -98, -104, -100, -83, -102, 118, 111, 124, 114, 122, 115, 109, 116, 112, -128, -124, a.A7, -48, a.f103511x7, -52, a.f103476t7, -35, -48, a.f103511x7, -52, -42, -67, a.f103444p7, -60, a.f103476t7, -71, a.f103484u7, a.f103484u7, -67, a.f103460r7, a.f103452q7, -68, -79, a.f103468s7, -66, -77, -72, -81, -79, -76, -81, a.f103452q7, -75, a.f103436o7, -65, a.f103452q7, -60, -71, -66, -73, -81, -74, -68, -65, a.f103484u7, -99, -96, -104, -17, -9, -10, -25, a.C7, -8, -21, -26, -25, -15, -42, a.f103520y7, -33, a.f103484u7, a.f103529z7, -35, -42, -42, a.f103520y7, -44, -26, -25, -36, -27, -42, -29, -32, -27, -30, -113, -128, -108, -110, -124, 126, -107, -120, -125, -124, -114, a.f103493v7, a.f103468s7, -70, -46, -72, a.A7, a.f103452q7, -67, -66, -56, a.f103493v7, a.f103511x7, -66, -52, -66, a.f103484u7, a.f103520y7, -72, -65, a.f103529z7, a.f103468s7, a.f103468s7, -52, -68, a.f103511x7, -66, -66, a.f103484u7, -44, a.f103484u7, a.f103460r7, a.f103476t7, a.f103444p7, -43, -42, -44, a.f103511x7, -48, a.f103493v7, -101, -114, -96, -118, -101, -115, -120, -116, -104, -106, -103, -107, -114, -99, -114, a.f103511x7, a.f103460r7, a.f103444p7, -56, -73, a.f103529z7, a.f103444p7, -68, -67, a.f103484u7, -124, 127, 118, -127, 114, 108, -128, -127, 127, 118, 123, 116};
    }

    static {
        A02();
        A0B = new EnumC2689dH(A01(76, 10, 43), 0, A01(310, 10, 53));
        A0F = new EnumC2689dH(A01(117, 19, 120), 1, A01(351, 24, 76));
        A04 = new EnumC2689dH(A01(0, 13, SignalKey.EVENT_ID), 2, A01(244, 13, 6));
        A07 = new EnumC2689dH(A01(37, 18, 106), 3, A01(281, 18, 71));
        A06 = new EnumC2689dH(A01(18, 19, 95), 4, A01(i1.d.HandlerC1208d.f123898m, 19, 87));
        A0E = new EnumC2689dH(A01(SignalKey.EVENT_ID, 10, 100), 5, A01(341, 10, 80));
        A0G = new EnumC2689dH(A01(136, 3, 50), 6, A01(375, 3, 45));
        A05 = new EnumC2689dH(A01(13, 5, 54), 7, A01(257, 5, 75));
        A0A = new EnumC2689dH(A01(70, 6, 83), 8, A01(304, 6, 12));
        A0I = new EnumC2689dH(A01(149, 10, 69), 9, A01(388, 10, 100));
        A0N = new EnumC2689dH(A01(200, 15, 102), 10, A01(457, 15, 37));
        A08 = new EnumC2689dH(A01(55, 5, 71), 11, A01(299, 5, 104));
        A0H = new EnumC2689dH(A01(139, 10, 96), 12, A01(378, 10, 126));
        A0D = new EnumC2689dH(A01(97, 10, 108), 13, A01(MediaError.DetailedErrorCode.SMOOTH_NETWORK, 10, 99));
        A0O = new EnumC2689dH(A01(215, 10, 91), 14, A01(472, 10, 84));
        A0L = new EnumC2689dH(A01(179, 10, 125), 15, A01(418, 10, 85));
        A0K = new EnumC2689dH(A01(168, 11, 7), 16, A01(407, 11, 27));
        A0Q = new EnumC2689dH(A01(232, 12, 27), 17, A01(482, 12, 9));
        A0M = new EnumC2689dH(A01(189, 11, 120), 18, A01(446, 11, 94));
        A0C = new EnumC2689dH(A01(86, 11, 74), 19, A01(320, 11, 10));
        A09 = new EnumC2689dH(A01(60, 10, 61), 20, A01(428, 18, 85));
        A0J = new EnumC2689dH(A01(159, 9, 115), 21, A01(398, 9, 115));
        A0P = new EnumC2689dH(A01(225, 7, 58), 22, A01(0, 0, 60));
        A03 = A03();
    }

    public EnumC2689dH(String str, int i10, String str2) {
        super(str, i10);
        this.A00 = str2;
    }

    public static EnumC2689dH A00(String str) {
        for (EnumC2689dH enumC2689dH : values()) {
            if (enumC2689dH.A00.equalsIgnoreCase(str)) {
                return enumC2689dH;
            }
        }
        EnumC2689dH enumC2689dH2 = A0P;
        String[] strArr = A02;
        if (strArr[5].charAt(11) != strArr[3].charAt(11)) {
            throw new RuntimeException();
        }
        A02[1] = "FXbZWXffVyaneTw3kEwIh8dxCOHwnV6P";
        return enumC2689dH2;
    }

    public static /* synthetic */ EnumC2689dH[] A03() {
        EnumC2689dH[] enumC2689dHArr = new EnumC2689dH[23];
        enumC2689dHArr[0] = A0B;
        String[] strArr = A02;
        if (strArr[0].charAt(12) != strArr[4].charAt(12)) {
            throw new RuntimeException();
        }
        A02[6] = "5YohDqwhZisgRi0et8gjdsLiIOixczu5";
        enumC2689dHArr[1] = A0F;
        enumC2689dHArr[2] = A04;
        enumC2689dHArr[3] = A07;
        enumC2689dHArr[4] = A06;
        enumC2689dHArr[5] = A0E;
        enumC2689dHArr[6] = A0G;
        enumC2689dHArr[7] = A05;
        enumC2689dHArr[8] = A0A;
        enumC2689dHArr[9] = A0I;
        enumC2689dHArr[10] = A0N;
        enumC2689dHArr[11] = A08;
        enumC2689dHArr[12] = A0H;
        enumC2689dHArr[13] = A0D;
        enumC2689dHArr[14] = A0O;
        enumC2689dHArr[15] = A0L;
        enumC2689dHArr[16] = A0K;
        enumC2689dHArr[17] = A0Q;
        enumC2689dHArr[18] = A0M;
        enumC2689dHArr[19] = A0C;
        enumC2689dHArr[20] = A09;
        enumC2689dHArr[21] = A0J;
        enumC2689dHArr[22] = A0P;
        return enumC2689dHArr;
    }

    public static EnumC2689dH valueOf(String str) {
        return (EnumC2689dH) Enum.valueOf(EnumC2689dH.class, str);
    }

    public static EnumC2689dH[] values() {
        return (EnumC2689dH[]) A03.clone();
    }
}

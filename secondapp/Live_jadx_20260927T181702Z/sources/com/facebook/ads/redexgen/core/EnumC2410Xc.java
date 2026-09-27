package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.NativeAdBase;
import f6.q;
import java.util.Arrays;
import javax.annotation.Nullable;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC2410Xc {
    A0I(0),
    A0H(1),
    A0G(2),
    A0K(3),
    A0J(4),
    A0A(5, NativeAdBase.NativeComponentTag.AD_ICON),
    A0F(6, NativeAdBase.NativeComponentTag.AD_TITLE),
    A09(7, NativeAdBase.NativeComponentTag.AD_COVER_IMAGE),
    A0E(8, NativeAdBase.NativeComponentTag.AD_SUBTITLE),
    A06(9, NativeAdBase.NativeComponentTag.AD_BODY),
    A07(10, NativeAdBase.NativeComponentTag.AD_CALL_TO_ACTION),
    A0D(11, NativeAdBase.NativeComponentTag.AD_SOCIAL_CONTEXT),
    A08(12, NativeAdBase.NativeComponentTag.AD_CHOICES_ICON),
    A0B(13, NativeAdBase.NativeComponentTag.AD_MEDIA),
    A0C(12, NativeAdBase.NativeComponentTag.AD_OPTIONS_VIEW);

    public static int A02;
    public static byte[] A03;
    public static String[] A04 = {"mm8FkjmxkAn0ntAt6yMmjJOmEmwUFxWQ", "VQVAUr8hHMqZVaEwe8OtAk0HCVwVuT9q", "oClOzaysC8x4DOGoit7i4h3Gpfb0OXMF", "fuZWqRC62r9MuSCVvwKu5U60eWbDLskj", "2DvdeCnwUfm17kN5FHRDQx8hBER6C2qU", "K4oeerNs7A1VEBeDem7X4xZbHtBFCQWn", "JTXeDaIbilWka07jjSO5NeC2nexU0fdc", "Pjq84j8K1toDwE9n24Yhtzr00ksRVLD1"};
    public final int A00;

    @Nullable
    public final NativeAdBase.NativeComponentTag A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-22, -17, -11, -26, -13, -17, -30, -19, 0, -30, -27, 0, -29, -16, -27, -6, c.f161646x, c.C, 31, c.f161640r, c.G, c.C, c.f161636n, c.A, 42, c.f161636n, c.f161639q, 42, c.f161638p, c.f161636n, c.A, c.A, 42, 31, c.D, 42, c.f161636n, c.f161638p, 31, c.f161646x, c.D, c.C, -52, -47, -41, -56, -43, -47, -60, a.A7, -30, -60, a.f103484u7, -30, a.f103476t7, a.f103511x7, -46, -52, a.f103476t7, -56, -42, -30, -52, a.f103476t7, -46, -47, -103, -98, -92, -107, -94, -98, -111, -100, -81, -111, -108, -81, -109, -97, -90, -107, -94, -81, -103, -99, -111, -105, -107, -1, 4, 10, -5, 8, 4, -9, 2, c.f161647y, -9, -6, c.f161647y, -1, -7, 5, 4, -99, -94, -88, -103, -90, -94, -107, -96, -77, -107, -104, -77, -95, -103, -104, -99, -107, 0, 5, c.f161635m, -4, 9, 5, -8, 3, c.f161648z, -8, -5, c.f161648z, 6, 7, c.f161635m, 0, 6, 5, 10, c.f161648z, 13, 0, -4, c.f161638p, a.f103493v7, a.f103529z7, -44, a.f103468s7, -46, a.f103529z7, a.f103444p7, -52, -33, a.f103444p7, -60, -33, -45, a.A7, a.f103460r7, a.f103493v7, a.f103444p7, -52, -33, a.f103460r7, a.A7, a.f103529z7, -44, a.f103468s7, a.f103428n7, -44, a.f103529z7, -45, a.E7, a.f103502w7, -41, -45, a.f103476t7, -47, -28, a.f103476t7, a.f103493v7, -28, a.f103428n7, a.B7, a.f103484u7, a.E7, a.f103529z7, a.E7, -47, a.f103502w7, -12, -7, -1, -16, -3, -7, -20, -9, 10, -20, -17, 10, -1, -12, -1, -9, -16, -89, -84, -78, -93, -80, -84, -97, -86, -67, -97, -82, -89, -67, -78, -83, -83, -67, -86, -83, -75, -20, -15, -9, q.B, -11, -15, -28, -17, 2, -15, q.f83622z, 2, -26, -17, -20, -26, -18, 17, c.f161648z, 28, 13, c.D, c.f161648z, 9, c.f161646x, 39, c.f161648z, c.A, 39, 28, 9, c.f161639q, 17, c.f161648z, 28, 13, c.D, c.f161648z, 9, c.f161646x, 39, c.f161648z, c.G, c.f161646x, c.f161646x, 39, c.H, 17, 13, 31, -4, 1, 7, -8, 5, 1, -12, -1, c.f161643u, 10, 5, 2, 1, -6, c.f161643u, 7, -12, -6, c.f161643u, -10, -1, -12, 6, 6};
        String[] strArr = A04;
        if (strArr[0].charAt(5) != strArr[7].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "5kHbeeIehC4HjRV2XKp0gKWNT0mjCFu0";
        strArr2[5] = "V77oNHMbviq5SbxHHLaqMPGHTmS2Clc8";
        A03 = bArr;
    }

    static {
        A02();
        A02 = -1593835521;
    }

    EnumC2410Xc(int i10) {
        this.A00 = i10;
        this.A01 = null;
    }

    EnumC2410Xc(int i10, NativeAdBase.NativeComponentTag nativeComponentTag) {
        this.A00 = i10;
        this.A01 = nativeComponentTag;
    }

    @Nullable
    public static EnumC2410Xc A00(NativeAdBase.NativeComponentTag nativeComponentTag) {
        for (EnumC2410Xc enumC2410Xc : values()) {
            if (enumC2410Xc.A01 == nativeComponentTag) {
                return enumC2410Xc;
            }
        }
        return null;
    }

    public static void A03(@Nullable View view, NativeAdBase.NativeComponentTag nativeComponentTag) {
        EnumC2410Xc internalTag = A00(nativeComponentTag);
        if (view != null && internalTag != null) {
            view.setTag(A02, nativeComponentTag);
        }
    }

    public static void A04(@Nullable View view, @Nullable EnumC2410Xc enumC2410Xc) {
        if (view != null && enumC2410Xc != null) {
            view.setTag(A02, enumC2410Xc);
        }
    }

    public final int A06() {
        return this.A00;
    }
}

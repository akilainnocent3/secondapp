package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class EnumC2192Oi {
    public static byte[] A01;
    public static String[] A02 = {"VujXzvSFrlMAu4R1I5vUAWLnq57AsPWM", "eCB4AeZNNUxNJOW0xCQdVSKErAFKyRUE", "SxM7TzuiGj5mLkDPau1usW4gOWoxs80M", "JPSotx28OKEE72Qpgvn7eDCIGwp5uNVo", "DEnf6Zvbz7peiDJpz513nqQn8JHSiM1H", "gOyBV6cEPVg9ZlKZ082v3gM", "JzQKQqAcA3MWJuXBOCM1CdL45YEfwdQ5", "kFuiftK6CrUjCipoQAB5otHUPyyIQR1T"};
    public static final /* synthetic */ EnumC2192Oi[] A03;
    public static final EnumC2192Oi A04;
    public static final EnumC2192Oi A05;
    public static final EnumC2192Oi A06;
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{124, 125, 112, q.A, 70, 71, 70, 77, 82, 69, 80, 79, 82, 84, 74, 75, 70, 71, 101, q.f83619w, 101, 110, 44, 59, 46, 49, 44, 42};
    }

    static {
        A01();
        A06 = new EnumC2192Oi(A00(8, 6, 62), 0, A00(22, 6, 96));
        A04 = new EnumC2192Oi(A00(0, 4, 10), 1, A00(14, 4, 28));
        A05 = new EnumC2192Oi(A00(4, 4, 54), 2, A00(18, 4, 53));
        A03 = A02();
    }

    public EnumC2192Oi(String str, int i10, String str2) {
        super(str, i10);
        this.A00 = str2;
    }

    public static /* synthetic */ EnumC2192Oi[] A02() {
        EnumC2192Oi[] enumC2192OiArr = new EnumC2192Oi[3];
        enumC2192OiArr[0] = A06;
        EnumC2192Oi enumC2192Oi = A04;
        String[] strArr = A02;
        if (strArr[0].charAt(31) != strArr[2].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "cigJDFmR8APB9TZFazKvkLU6eV5xdG1z";
        strArr2[7] = "bxChofFJf2xaRn9PIbRGfpqcGnLInP10";
        enumC2192OiArr[1] = enumC2192Oi;
        enumC2192OiArr[2] = A05;
        return enumC2192OiArr;
    }

    public final String A03() {
        return this.A00;
    }

    public static EnumC2192Oi valueOf(String str) {
        return (EnumC2192Oi) Enum.valueOf(EnumC2192Oi.class, str);
    }

    public static EnumC2192Oi[] values() {
        return (EnumC2192Oi[]) A03.clone();
    }
}

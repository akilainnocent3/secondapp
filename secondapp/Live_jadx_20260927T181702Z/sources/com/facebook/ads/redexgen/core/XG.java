package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import rg.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class XG {
    public static byte[] A00;
    public static String[] A01 = {"NoYeCqw0NuwsBVSvR8aiyPnoj7", "APA6ODPEmALJh8xHCjcwQdd6vsoZzjc", "og2YXunKDp8EqsbnYhzdu6qR", "YLuKSEsrRIdzXIjkloLmDmBrtZDR6KFi", "8qSAHAaIpnwwIsCvL7AfoFTJYv1h46H2", "PXVMr", "05SrQOor", "5yYP5"};
    public static final Map<EnumC2374Vp, EnumC2375Vq> A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{104, 74, 69, c.f161636n, 95, c.f161635m, 72, 89, 78, 74, 95, 78, c.f161635m, 106, 79, a.f127263w, 66, 81, 78, c.f161635m, 94, 88, 66, 69, 76, c.f161635m, 95, 67, 66, 88, c.f161635m, 92, 66, 79, 95, 67, c.f161635m, 74, 69, 79, c.f161635m, 67, 78, 66, 76, 67, 95, 5, 50, 9, c.f161636n, 9, 8, c.f161640r, 9, 71, 38, 3, 52, c.f161638p, c.G, 2, 71, 19, c.H, c.A, 2, 73};
    }

    static {
        A07();
        A02 = new HashMap();
        A02.put(EnumC2374Vp.A09, EnumC2375Vq.A0D);
        A02.put(EnumC2374Vp.A07, EnumC2375Vq.A0F);
        A02.put(EnumC2374Vp.A06, EnumC2375Vq.A0E);
    }

    public static AdSize A00(EnumC2374Vp enumC2374Vp) {
        return AdSize.fromWidthAndHeight(enumC2374Vp.A04(), enumC2374Vp.A03());
    }

    public static AdSize A01(EnumC2375Vq enumC2375Vq) {
        for (Map.Entry<EnumC2374Vp, EnumC2375Vq> entry : A02.entrySet()) {
            if (entry.getValue() == enumC2375Vq) {
                EnumC2374Vp key = entry.getKey();
                if (A01[3].charAt(31) == 'z') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[5] = "vUJqh";
                strArr[7] = "m1G2X";
                return A00(key);
            }
        }
        return AdSize.BANNER_320_50;
    }

    public static EnumC2374Vp A02(int i10) {
        switch (i10) {
            case 4:
                return EnumC2374Vp.A05;
            case 5:
                return EnumC2374Vp.A06;
            case 6:
                return EnumC2374Vp.A07;
            case 7:
                return EnumC2374Vp.A09;
            case 100:
                return EnumC2374Vp.A08;
            default:
                throw new IllegalArgumentException(A06(48, 20, 117));
        }
    }

    public static EnumC2374Vp A03(int i10, int i11) {
        if (EnumC2374Vp.A08.A03() == i11 && EnumC2374Vp.A08.A04() == i10) {
            return EnumC2374Vp.A08;
        }
        if (EnumC2374Vp.A05.A03() == i11) {
            int iA04 = EnumC2374Vp.A05.A04();
            String[] strArr = A01;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[3] = "mZi1y4qoTe3Eq90wST2K5ufjmqQARasa";
            if (iA04 == i10) {
                return EnumC2374Vp.A05;
            }
        }
        if (EnumC2374Vp.A06.A03() == i11 && EnumC2374Vp.A06.A04() == i10) {
            return EnumC2374Vp.A06;
        }
        if (EnumC2374Vp.A07.A03() == i11 && EnumC2374Vp.A07.A04() == i10) {
            return EnumC2374Vp.A07;
        }
        if (EnumC2374Vp.A09.A03() == i11) {
            EnumC2374Vp enumC2374Vp = EnumC2374Vp.A09;
            String[] strArr2 = A01;
            if (strArr2[6].length() == strArr2[0].length()) {
                throw new RuntimeException();
            }
            A01[3] = "Hv8n5Vk5MDnKIrkb6r8Yx0AFcMxyPOg2";
            if (enumC2374Vp.A04() == i10) {
                return EnumC2374Vp.A09;
            }
        }
        throw new IllegalArgumentException(A06(0, 48, 57));
    }

    public static EnumC2374Vp A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static EnumC2375Vq A05(EnumC2374Vp enumC2374Vp) {
        EnumC2375Vq adTemplate = A02.get(enumC2374Vp);
        if (adTemplate == null) {
            return EnumC2375Vq.A0G;
        }
        return adTemplate;
    }
}

package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import l3.a;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C8I extends AbstractC3121kY<EnumC2124Lr> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, a.A7, a.f103476t7, a.f103476t7};
    }

    public C8I(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3121kY
    /* JADX INFO: renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C2132Lz A04(EnumC2124Lr enumC2124Lr) {
        return new C2132Lz(this, enumC2124Lr == null ? A00(0, 4, 46) : A00(0, 0, 18) + enumC2124Lr.A03());
    }
}

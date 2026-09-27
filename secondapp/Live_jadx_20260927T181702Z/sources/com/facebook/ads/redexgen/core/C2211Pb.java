package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import l3.a;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2211Pb implements InterfaceC2542au {
    public static byte[] A01;
    public final /* synthetic */ PZ A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -19, -33, -20, a.E7, -36, -17, -32, -32, -33, -20, -33, -34, a.E7, -35, -26, -29, -35, -27, a.E7, -29, -37, -36, a.E7, -33, q.f83622z, -18, -33, -20, q.B, -37, -26, a.E7, q.B, -37, -16, -29, a.C7, -37, -18, -29, -23, q.B};
    }

    public C2211Pb(PZ pz) {
        this.A00 = pz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2542au
    public final void ADO() {
        this.A00.A0H();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2542au
    public final void AF0() {
        this.A00.A0I(A00(0, 43, 56));
    }
}

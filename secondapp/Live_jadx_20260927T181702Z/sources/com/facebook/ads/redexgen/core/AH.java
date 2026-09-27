package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AH implements InterfaceC3396pF {
    public static byte[] A03;
    public final int A00;
    public final AbstractC16653d A01;
    public final InterfaceC3396pF A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{1, 3, 0, -12, -10, -10, -11, -32, 3, -27, -7, 3, 0, 8};
    }

    public AH(InterfaceC3396pF interfaceC3396pF, AbstractC16653d abstractC16653d, int i10) {
        this.A02 = (InterfaceC3396pF) AbstractC16843y.A01(interfaceC3396pF);
        AbstractC16843y.A01(abstractC16653d);
        this.A01 = null;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3396pF
    public final void A43(InterfaceC17315t interfaceC17315t) {
        AbstractC16843y.A01(interfaceC17315t);
        this.A02.A43(interfaceC17315t);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3396pF
    public final Map<String, List<String>> A8t() {
        return this.A02.A8t();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3396pF
    public final Uri A9P() {
        return this.A02.A9P();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3396pF
    public final long AGi(C17205i c17205i) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3396pF
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC16402c
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }
}

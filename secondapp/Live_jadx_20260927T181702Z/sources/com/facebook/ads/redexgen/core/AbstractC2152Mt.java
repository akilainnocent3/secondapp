package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2152Mt {
    public static byte[] A04;
    public InterfaceC2150Mr A00;
    public final C2900gi A01;
    public final VA A02;
    public final String A03;

    static {
        A0D();
    }

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A04 = new byte[]{84, 69, 69, 106, 84, 81, 108, 105, 110, 107, 95, 99, 108, 105, 99, 107, 112, 102, 115, q.f83619w, 111, 88, 102, 105, 99, 88, 101, 117, 104, 112, 116, 98};
    }

    public abstract EnumC2149Mq A0G(String str);

    public AbstractC2152Mt(C2900gi c2900gi, VA va2, String str) {
        this.A01 = c2900gi;
        this.A02 = va2;
        this.A03 = str;
    }

    public static String A0A() {
        return A0B(16, 16, 125);
    }

    public static String A0C(AbstractC2152Mt abstractC2152Mt) {
        if (abstractC2152Mt instanceof AnonymousClass84) {
            return A0B(6, 10, 122);
        }
        return A0B(0, 6, 79);
    }

    public final InterfaceC2150Mr A0E() {
        return this.A00;
    }

    public final void A0F(InterfaceC2150Mr interfaceC2150Mr) {
        this.A00 = interfaceC2150Mr;
    }
}

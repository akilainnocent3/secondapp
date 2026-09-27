package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import java.util.Locale;
import l3.a;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class UU {
    public static byte[] A02;
    public final int A00;
    public final int A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-85, -48, a.f103428n7, a.f103460r7, a.f103529z7, a.f103511x7, a.f103476t7, -126, a.f103511x7, -48, a.f103476t7, a.f103484u7, a.B7, -90, a.f103484u7, a.f103529z7, -42, a.f103460r7, -126, -118, -121, a.f103476t7, -114, -126, a.f103511x7, -48, a.f103476t7, a.f103484u7, a.B7, -126, -97, -126, -121, a.f103476t7, -117, -56, a.f103511x7, a.f103529z7, a.f103484u7, -126, -118, -121, a.f103476t7, -117, -126, -98, -126, -113, -109, -12, -9, -6, -13, -82, a.f103511x7, -82, -77, q.f83622z, -82, -76, -76, -82, -9, -4, q.f83622z, -13, 6, -82, a.f103511x7, -82, -77, q.f83622z, -47, -44, -41, -48, -117, -88, -88, -117, -104, -100, -117, -111, -111, -117, -44, a.E7, a.A7, -48, -29, -117, -88, -117, -112, a.A7};
    }

    public UU() {
        this(-1, -1);
    }

    public UU(int i10, int i11) {
        if (i10 < -1) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(35, 14, 64), Integer.valueOf(i10)));
        }
        if (i10 >= 0 && i11 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(49, 23, 108), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        if (i10 == -1 && i11 != -1) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(72, 24, 73), Integer.valueOf(i11)));
        }
        this.A00 = i10;
        this.A01 = i11;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final int A04(UU uu2) {
        if (this.A00 != uu2.A00) {
            return this.A00 - uu2.A00;
        }
        return this.A01 - uu2.A01;
    }

    public final UU A05(int i10) {
        if (this.A01 + i10 >= 0) {
            return new UU(this.A00, this.A01 + i10);
        }
        throw new IllegalArgumentException(String.format(Locale.US, A00(0, 35, 64), Integer.valueOf(i10), Integer.valueOf(this.A01)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UU)) {
            return false;
        }
        UU uu2 = (UU) obj;
        return uu2.A00 == this.A00 && uu2.A01 == this.A01;
    }

    public final int hashCode() {
        return (this.A00 * 2) + (this.A01 * 3);
    }
}

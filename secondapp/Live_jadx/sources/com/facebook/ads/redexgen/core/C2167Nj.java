package com.facebook.ads.redexgen.core;

import f6.q;
import java.io.Serializable;
import java.util.Arrays;
import l3.a;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2167Nj implements Serializable {
    public static byte[] A04 = null;
    public static final long serialVersionUID = 351643298236575729L;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-124, -2, -26, -8, -11, -11, q.B, -15, -26, -4, 0, -36, -46, -42, a.f103452q7, a.A7, -43, a.f103502w7, -43, a.B7, -34};
    }

    public C2167Nj(C2166Ni c2166Ni) {
        this.A02 = c2166Ni.A02;
        this.A03 = c2166Ni.A03;
        this.A00 = c2166Ni.A00;
        this.A01 = c2166Ni.A01;
    }

    public static String A01(String str, String str2, int i10) {
        String strReplace = str.replace(A00(1, 10, 68), str2);
        String strA00 = A00(0, 0, 39);
        if (i10 > 0) {
            StringBuilder sbAppend = new StringBuilder().append(i10);
            String updatedString = A00(0, 1, 37);
            strA00 = sbAppend.append(updatedString).toString();
        }
        String updatedString2 = A00(11, 10, 34);
        return strReplace.replace(updatedString2, strA00);
    }

    public final String A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A02;
    }

    public final String A06(String str, int i10) {
        return A01(this.A03, str, i10);
    }
}

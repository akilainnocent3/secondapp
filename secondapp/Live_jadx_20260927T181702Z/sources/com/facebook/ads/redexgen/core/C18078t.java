package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import f6.q;
import java.util.Arrays;
import yr.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C18078t extends Exception {
    public static byte[] A03;
    public final int A00;
    public final C3460qI A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{60, 127, 119, 45, 58, 60, 48, 41, 58, 45, 62, a.f159811k, 51, 58, 118, 123, 126, 114, 60, 39, 63, c.G, 52, 19, 39, 54, 59, a.f159811k, 6, 32, 51, 49, 57, 19, 62, 62, a.f159811k, 49, 51, 38, 55, 54, 111, 42, 38, 86, 98, 115, 126, rg.a.f127263w, 67, 101, 118, 116, 124, 55, 126, 121, 126, 99, 55, q.A, 118, 126, 123, 114, 115, 55, 44, 0, 1, 9, 6, 8, 71};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "D23918943: Monitor the audio track usage")
    public C18078t(int i10, int i11, int i12, int i13, C3460qI c3460qI, boolean z10, Exception exc, int i14) {
        StringBuilder sbAppend = new StringBuilder().append(A00(45, 23, 86)).append(i10);
        String strA00 = A00(0, 1, 93);
        StringBuilder sbAppend2 = sbAppend.append(strA00).append(A00(68, 7, 46)).append(i11);
        String strA01 = A00(43, 2, 71);
        super(sbAppend2.append(strA01).append(i12).append(strA01).append(i13).append(A00(15, 28, 19)).append(i14).append(strA00).append(c3460qI).append(z10 ? A00(1, 14, 30) : A00(0, 0, 74)).toString(), exc);
        this.A00 = i10;
        this.A02 = z10;
        this.A01 = c3460qI;
    }
}

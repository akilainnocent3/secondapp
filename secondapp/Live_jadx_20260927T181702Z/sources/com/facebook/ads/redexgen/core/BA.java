package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import java.util.Arrays;
import yr.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class BA extends Exception {
    public static byte[] A05;
    public final B3 A00;
    public final BA A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    static {
        A05();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{0, c.f161636n, 49, c.f161640r, c.f161648z, c.D, 17, c.f161640r, 7, 85, 28, c.E, 28, 1, 85, 19, c.f161646x, 28, c.C, c.f161640r, 17, 79, 85, 101, 68, 66, 78, 69, 68, 83, 1, 72, 79, 72, 85, 1, 71, 64, 72, 77, 68, 69, c.E, 1, 122, 63, 78, 66, c.G, 17, 19, 80, c.B, 31, c.G, c.E, 28, 17, 17, c.f161647y, 80, 31, c.D, 13, 80, 31, c.f161640r, c.D, c.f161636n, 17, c.A, c.D, 6, 80, 19, c.E, c.D, c.A, 31, 77, 80, c.E, 6, 17, c.f161638p, c.f161643u, 31, 7, c.E, c.f161636n, 80, 19, c.E, c.D, c.A, 31, c.G, 17, c.D, c.E, c.G, 80, 51, c.E, c.D, c.A, 31, a.f159811k, 17, c.D, c.E, c.G, 44, c.E, c.f161640r, c.D, c.E, c.f161636n, c.E, c.f161636n, 33, 36, 47, 45, c.f161647y};
    }

    public BA(C3460qI c3460qI, Throwable th2, boolean z10, int i10) {
        this(A03(23, 22, 80) + i10 + A03(45, 3, 19) + c3460qI, th2, c3460qI.A0W, z10, null, A02(i10), null);
    }

    public BA(C3460qI c3460qI, Throwable th2, boolean z10, B3 b10) {
        this(A03(2, 21, 4) + b10.A03 + A03(0, 2, 93) + c3460qI, th2, c3460qI.A0W, z10, b10, C5C.A02 >= 21 ? A04(th2) : null, null);
    }

    public BA(String str, Throwable th2, String str2, boolean z10, B3 b10, String str3, BA ba2) {
        super(str, th2);
        this.A03 = str2;
        this.A04 = z10;
        this.A00 = b10;
        this.A02 = str3;
        this.A01 = ba2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BA A00(BA ba2) {
        return new BA(getMessage(), getCause(), this.A03, this.A04, this.A00, this.A02, ba2);
    }

    public static String A02(int i10) {
        String strA03 = i10 < 0 ? A03(121, 4, 59) : A03(0, 0, 98);
        StringBuilder sb2 = new StringBuilder();
        String sign = A03(48, 73, 15);
        return sb2.append(sign).append(strA03).append(Math.abs(i10)).toString();
    }

    public static String A04(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}

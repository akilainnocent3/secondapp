package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import android.os.Build;
import f6.q;
import java.io.IOException;
import java.util.Arrays;
import javax.annotation.Nullable;
import yr.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3025iq {

    @Nullable
    public static Boolean A00;
    public static byte[] A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{106, 77, 69, 64, 73, 72, c.f161636n, 88, 67, c.f161636n, 75, 73, 88, c.f161636n, 65, 73, 72, 69, 77, c.f161636n, 111, 67, 72, 73, 79, 7, 42, a.f159811k, 32, 10, 55, 32, c.D, 59, 38, 35, 97, 114, 121, 115, rg.a.f127263w, 101, 57, q.f83619w, 114, 116, 58, 118, 126, q.A, 101, 116, 58, 99, 101, 118, 121, q.f83619w, q.A, 114, 101, 58, 101, 114, 102, 98, 114, q.f83619w, 99, 57, 97, 118, 123, 98, 114, 65, 94, 83, 82, 88, c.B, 86, 65, 84};
    }

    static {
        A01();
        A00 = null;
    }

    public static boolean A02() {
        if (A00 != null) {
            return A00.booleanValue();
        }
        A00 = false;
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(A00(75, 9, 74));
                for (String param : mediaCodecCreateDecoderByType.getSupportedVendorParameters()) {
                    if (param.equals(A00(36, 39, 106))) {
                        A00 = true;
                        break;
                    }
                }
                mediaCodecCreateDecoderByType.release();
            }
        } catch (IOException e10) {
            String param2 = A00(25, 11, 50);
            AbstractC2957hd.A02(param2, A00(0, 25, 81), e10);
        }
        return A00.booleanValue();
    }

    public static boolean A03(int i10, int i11) {
        if (i10 >= 480 && i11 >= 480 && i10 <= 3840 && i11 <= 2160) {
            return true;
        }
        return false;
    }
}

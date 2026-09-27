package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization
public enum MN {
    A05,
    A04,
    A06,
    A03;

    public static byte[] A00;
    public static String[] A01 = {"YGvusjMOvw", "XxhXqbssDzTPx8cD", "v5f5FK7FNpA1cfN1ohQEtzmA1XlLSzXE", "dOnhpxcme8C8DMHJdbJ1zsQXlaw", "o8NFvW23E6YML82dyv2qOnj4D0AhAt32", "sFvB7Juf2T", "FilLqBnJ3Dc1fTgDAzXDzQr78D6tohNx", "1sAmBYm9v"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            String[] strArr = A01;
            if (strArr[7].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A01[1] = "k0Ctdizy0CSYjdQTYuro";
            bArrCopyOfRange[i13] = (byte) ((b10 - i12) - 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{c.f161635m, c.f161640r, c.f161635m, c.f161648z, 33, c.f161647y, 7, 9, c.f161639q, 7, c.f161640r, c.f161648z, -27, a.C7, -42, -18, -41, -42, a.f103428n7, -32, a.E7, -37, a.f103529z7, a.A7, a.f103529z7, -35, -52, -47, -10, -17, -20, -17, -16, -8, -17};
    }

    static {
        A01();
    }
}

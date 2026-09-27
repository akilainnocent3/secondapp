package com.facebook.ads.redexgen.core;

import c2.j;
import com.facebook.ads.internal.util.process.ProcessUtils;
import f6.q;
import java.util.Arrays;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2191Oh {
    public static C2190Og A00;
    public static byte[] A01;
    public static String[] A02 = {"g", j.f22221a, "XC0Rp", "xmnbF", "ZVN1dtOIFAKzm8JTATZerxuQP9zv55g", "kSPLn3WG70", "", ""};

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] ^ i12;
            String[] strArr = A02;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "w";
            strArr2[0] = "P";
            bArrCopyOfRange[i13] = (byte) (i14 ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{86, 90, 88, c.E, 83, 84, 86, 80, 87, 90, 90, 94, c.E, 84, 81, 70, c.E, 116, q.A, 106, 103, 112, 101, 122, 103, 97, 124, 123, 114, 106, 118, 122, 123, 115, 124, 114};
    }

    static {
        A02();
    }

    public static C2190Og A00(C2896ge c2896ge) {
        if (A00 == null) {
            synchronized (C2190Og.class) {
                if (A00 == null) {
                    A00 = new C2190Og(new C2988iB(c2896ge.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 105), c2896ge), 0)));
                }
            }
        }
        return A00;
    }
}

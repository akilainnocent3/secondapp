package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.signals.SignalKey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import l3.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class U8 {
    public static HashMap<String, String> A00;
    public static byte[] A01;
    public static String[] A02 = {"iAmMZEnTjRyKTNBZ", "vq5cthhr", "805H8tMQ6F09oxi1Jl38UficVRLMtQ", "JBRmxZg7", "Cn5UKxgX5LOr", "xwoZ6hhdKgqxJaNY", "yguqyABz11m3k", "UOBi89mTAaMo"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[5].length() != 16) {
                throw new RuntimeException();
            }
            A02[0] = "gDribvuqSsGNU0u3";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 70);
            i13++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-69, a.f103502w7, a.f103502w7, -68, a.A7, a.f103460r7, a.f103476t7, -66, -60, -45, -45, -47, -60, -48, -56, 6, c.f161647y, c.f161647y, c.E, 10, c.A, c.B, -15, 4, -3, -13, -5, -12, a.B7, -36, -47, -46, a.E7, -34, -30, 0, 4, 7, -10, 3, 4, 8, -7, 0, a.f103520y7, -66, a.f103468s7, a.E7, -48, -65, -52, a.f103520y7, a.f103460r7, a.f103493v7, -56, a.C7, -45, a.C7, a.C7, -41, -35, -36, -19, -41, -46, a.f103502w7, -41, a.f103520y7, -37, a.f103428n7, -46, a.f103520y7};
    }

    static {
        A02();
    }

    public static synchronized Map<String, String> A01(T8 t10) {
        if (A00 != null) {
            return new HashMap(A00);
        }
        A00 = new HashMap<>();
        A00.put(A00(22, 6, 105), t10.getPackageName());
        A03(t10, A00, null);
        return new HashMap(A00);
    }

    public static synchronized void A03(T8 t10, Map<String, String> map, String str) {
        map.put(A00(41, 3, 111), A00(65, 7, 35));
        map.put(A00(44, 11, 52), t10.A05().A9T());
        map.put(A00(33, 2, 73), t10.A05().A9S());
        map.put(A00(35, 6, SignalKey.EVENT_ID), C2323To.A04);
        C2323To c2323To = new C2323To(t10, str);
        map.put(A00(15, 7, 127), c2323To.A06());
        map.put(A00(8, 7, 61), c2323To.A05());
        map.put(A00(0, 8, 52), String.valueOf(c2323To.A04()));
        map.put(A00(28, 5, 71), c2323To.A0A());
        map.put(A00(55, 10, 72), t10.A09().A02());
    }
}

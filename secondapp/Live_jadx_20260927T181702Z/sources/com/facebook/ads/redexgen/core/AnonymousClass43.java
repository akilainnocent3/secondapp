package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.IBinder;
import f6.q;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import rg.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.43, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AnonymousClass43 {
    public static Method A00;
    public static byte[] A01;
    public static String[] A02 = {"rt6CjKtQUOFxarnmkWqgGWje", "3nuh3b0J3kR9pkmWbi6mdwRc069ydG03", "vgqSEb59pwcvKw9WdixQFoz3Va18KFsr", "h35Isj3aZViVWltuKEoucz22tQqncTnx", "yJGJRoZVng69n9xQNPvqaXzNAukE8cwJ", "ZigbL863Rtw4tWoi2mLflUon", "c977rkHkuANnZfYHmbWrwArrI1mgRqhG", "I5ankwGA25juUPMFKSRh1H9yjdqc0trO"};

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{107, 92, 71, 77, 69, 76, 124, 93, 64, 69, 44, c.f161635m, 3, 6, c.f161639q, c.f161638p, 74, c.H, 5, 74, 3, 4, 28, 5, 1, c.f161639q, 74, 13, c.f161639q, c.H, 35, 40, 3, 4, c.f161638p, c.f161639q, c.B, 74, 28, 3, c.f161635m, 74, c.B, c.f161639q, c.f161636n, 6, c.f161639q, 9, c.H, 3, 5, 4, 99, 68, 76, 73, 64, 65, 5, 81, 74, 5, 87, 64, 81, 87, 76, 64, 83, 64, 5, 66, 64, 81, 108, 103, 76, 75, 65, 64, 87, 5, 72, 64, 81, 77, 74, 65, a.f127263w, 122, 107, 86, 93, 118, q.A, 123, 122, 109};
    }

    static {
        A03();
    }

    public static IBinder A00(Bundle bundle, String str) {
        if (C5C.A02 >= 18) {
            return bundle.getBinder(str);
        }
        IBinder iBinderA01 = A01(bundle, str);
        if (A02[7].charAt(19) == 'S') {
            throw new RuntimeException();
        }
        A02[7] = "R1pRDUJQUvAtWdszhYbqbgNcOgXvgcSI";
        return iBinderA01;
    }

    public static IBinder A01(Bundle bundle, String str) {
        Method method = A00;
        String strA02 = A02(0, 10, 89);
        if (method == null) {
            try {
                Method getIBinder = Bundle.class.getMethod(A02(88, 10, 111), String.class);
                A00 = getIBinder;
                Method getIBinder2 = A00;
                getIBinder2.setAccessible(true);
                method = A00;
            } catch (NoSuchMethodException e10) {
                AbstractC16924g.A09(strA02, A02(52, 36, 85), e10);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            AbstractC16924g.A09(strA02, A02(10, 42, 26), e11);
            return null;
        }
    }
}

package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.view.View;
import f6.q;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2244Qm {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final R2 A02;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-6, -1, 7, q.f83622z, -3, -6, -11, -79, 0, 3, -6, -10, -1, 5, q.f83622z, 5, -6, 0, -1};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i10);

    public AbstractC2244Qm(R2 r10) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = new Rect();
        this.A02 = r10;
    }

    public /* synthetic */ AbstractC2244Qm(R2 r10, C2968hp c2968hp) {
        this(r10);
    }

    public static C2968hp A00(R2 r10) {
        return new C2968hp(r10);
    }

    public static C2967ho A01(R2 r10) {
        return new C2967ho(r10);
    }

    public static AbstractC2244Qm A02(R2 r10, int i10) {
        switch (i10) {
            case 0:
                return A00(r10);
            case 1:
                return A01(r10);
            default:
                throw new IllegalArgumentException(A03(0, 19, 19));
        }
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}

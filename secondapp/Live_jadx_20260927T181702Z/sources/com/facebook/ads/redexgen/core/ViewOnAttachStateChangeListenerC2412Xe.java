package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ViewOnAttachStateChangeListenerC2412Xe extends AbstractC3507rL implements View.OnAttachStateChangeListener {
    public static byte[] A02;
    public final View A00;
    public final C2896ge A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{127, 64, 76, 94, 89, 70, 64, 71, 93, 9, 127, 64, 76, 94, 9, 69, 64, 79, 76, 74, 80, 74, 69, 76, 9, 74, 91, 72, 90, 65, 64, 71, 78, 9, 90, 93, 72, 91, 93, 122, 74, 72, 71, 9, 9, c.f161635m, 52, 56, 42, 45, 50, 52, 51, 41, 125, c.f161635m, 52, 56, 42, 125, 49, 52, 59, 56, 62, 36, 62, 49, 56, 125, 62, 47, 60, 46, 53, 52, 51, 58, 125, 46, 41, 60, 47, 41, c.f161638p, 62, 60, 51, 19, 50, 42, 125, 125, 103, 88, 84, 70, 65, 94, 88, 95, 69, 17, 103, 88, 84, 70, 17, 93, 88, 87, 84, 82, 72, 82, 93, 84, 17, 82, 67, 80, 66, 89, 88, 95, 86, 17, 66, 69, 94, 65, 98, 82, 80, 95, 17, 17, 8, c.H, c.B, c.f161646x, c.f161647y, 31, 36, c.B, 19, c.D, c.f161647y, c.f161647y, c.H, c.A};
    }

    public ViewOnAttachStateChangeListenerC2412Xe(View view, C2896ge c2896ge) {
        this.A00 = view;
        this.A01 = c2896ge;
        this.A00.addOnAttachStateChangeListener(this);
        if (A05()) {
            try {
                A00();
            } catch (Throwable th2) {
                this.A01.A08().ABC(A00(137, 14, 83), 3600, new C2313Te(A00(0, 45, 1) + th2.getMessage()));
            }
        }
    }

    public final void A04() {
        try {
            A00();
        } catch (Throwable th2) {
            this.A01.A08().ABC(A00(137, 14, 83), 3600, new C2313Te(A00(45, 48, 117) + th2.getMessage()));
        }
    }

    public final boolean A05() {
        return Ph.A0H(this.A00);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        try {
            A00();
        } catch (Throwable th2) {
            this.A01.A08().ABC(A00(137, 14, 83), 3600, new C2313Te(A00(0, 45, 1) + th2.getMessage()));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        try {
            A02();
        } catch (Throwable th2) {
            this.A01.A08().ABC(A00(137, 14, 83), 3600, new C2313Te(A00(93, 44, 25) + th2.getMessage()));
        }
    }
}

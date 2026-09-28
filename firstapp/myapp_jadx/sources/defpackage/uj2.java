package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class uj2 {
    public static final boolean a(View view, View view2, View view3) {
        return view.getVisibility() == 0 || view2.getVisibility() == 0 || view3.getVisibility() == 0;
    }

    public static final boolean b(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, boolean z5, boolean z6, z83 z83Var) {
        if (z2 || z3 || z4 || str.length() <= 0 || str2.length() <= 0 || z) {
            return false;
        }
        if (z5) {
            return true;
        }
        return z6 && z83Var != z83.c;
    }

    public static final boolean c(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, boolean z5, boolean z6) {
        return z && !z2 && !z3 && z4 && str.length() > 0 && str2.length() > 0 && !z5 && !z6;
    }

    public static final boolean d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return (z || !z2 || z3 || z4 || z5) ? false : true;
    }

    public static final boolean e(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return (z || !z2 || z3 || z4 || z5) ? false : true;
    }

    public static final void f(tcf tcfVar, int i, long j, float f, float f2) {
        if (i == 1) {
            float f3 = f / 2.0f;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (tcfVar.d() >> 32)) - f3) - f2;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) / 2.0f;
            tcf.n0(tcfVar, j, f3, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))), 0.0f, null, 120);
            return;
        }
        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (tcfVar.d() >> 32)) - f) - f2;
        float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) - f) / 2.0f;
        tcf.m0(tcfVar, j, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f))), 0.0f, null, 0, 120);
    }

    public static final boolean g(View view) {
        view.getClass();
        return view.getVisibility() == 0 && view.isEnabled() && view.isClickable() && view.getAlpha() >= 0.99f;
    }

    public static boolean h(AtomicReference atomicReference, pse pseVar, Class cls) {
        yby.b(pseVar, "next is null");
        while (!atomicReference.compareAndSet(null, pseVar)) {
            if (atomicReference.get() != null) {
                pseVar.dispose();
                if (atomicReference.get() == xse.a) {
                    return false;
                }
                String name = cls.getName();
                o760.b(new e730(tx5.a("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
                return false;
            }
        }
        return true;
    }
}

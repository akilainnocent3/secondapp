package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xff0 {
    public static void a(ijf0 ijf0Var, bff0 bff0Var, ukf0 ukf0Var, urr urrVar, dkf0 dkf0Var, boolean z, mly mlyVar) {
        lk40 lk40VarB;
        if (z) {
            int iB = mlyVar.b(ulf0.e(ijf0Var.b));
            String str = yff0.a;
            if (iB < ukf0Var.a.a.b.length()) {
                lk40VarB = ukf0Var.b(iB);
            } else {
                lk40VarB = iB != 0 ? ukf0Var.b(iB - 1) : new lk40(0.0f, 0.0f, 1.0f, (int) (yff0.a(bff0Var.b, bff0Var.g, bff0Var.h, yff0.a, 1) & 4294967295L));
            }
            float f = lk40VarB.b;
            float f2 = lk40VarB.a;
            long jI0 = urrVar.i0((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            lk40 lk40VarB2 = pk40.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jI0 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jI0 >> 32)))) << 32), (((long) Float.floatToRawIntBits(lk40VarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(lk40VarB.d - f)) & 4294967295L));
            if (Intrinsics.g(dkf0Var.a.b.get(), dkf0Var)) {
                dkf0Var.b.f(lk40VarB2);
            }
        }
    }
}

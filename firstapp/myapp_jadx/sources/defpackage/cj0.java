package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cj0 {
    public static aj0 a(int i, float f, float f2) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new aj0(gjs.b, Float.valueOf(f), new ij0(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static aj0 b(aj0 aj0Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) ((x5a0) aj0Var.b).getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((ij0) aj0Var.c).a;
        }
        return new aj0(aj0Var.a, Float.valueOf(f), new ij0(f2), aj0Var.d, aj0Var.e, aj0Var.f);
    }
}

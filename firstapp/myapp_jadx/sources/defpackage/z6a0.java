package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class z6a0 {
    public final d7a0 a;
    public final l7a0 b;
    public float c;
    public float d = 1.0f;
    public float e;
    public float f;
    public float g;
    public float h;

    public z6a0(d7a0 d7a0Var, l7a0 l7a0Var) {
        this.a = d7a0Var;
        this.b = l7a0Var;
    }

    public final void a(Float f) {
        p4 p4Var;
        float fD;
        int i;
        int i2;
        float fD2;
        d7a0 d7a0Var = this.a;
        float f2 = d7a0Var.h;
        l7a0 l7a0Var = this.b;
        int iOrdinal = l7a0Var.ordinal();
        if (iOrdinal == 0) {
            lx30.INSTANCE.getClass();
            p4Var = lx30.b;
            fD = p4Var.d();
            i = d7a0Var.e;
            i2 = d7a0Var.d;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            lx30.INSTANCE.getClass();
            p4Var = lx30.b;
            fD = p4Var.d();
            i = d7a0Var.g;
            i2 = d7a0Var.f;
        }
        this.c = (fD * (i - i2)) + i2;
        double dG = (((double) p4Var.g(-15, 16)) * 3.141592653589793d) / 180.0d;
        this.g = (float) (Math.sin(dG) * ((double) f2));
        this.h = (float) (Math.cos(dG) * ((double) f2));
        int iOrdinal2 = l7a0Var.ordinal();
        if (iOrdinal2 == 0) {
            fD2 = p4Var.d() < 0.7f ? 0.8f : (p4Var.d() * 0.7f) + 0.1f;
        } else {
            if (iOrdinal2 != 1) {
                uhc.a();
                return;
            }
            fD2 = 1.0f;
        }
        this.d = fD2;
        this.e = p4Var.d() * d7a0Var.a;
        this.f = f != null ? f.floatValue() : (-this.c) - (p4Var.d() * d7a0Var.b);
    }
}

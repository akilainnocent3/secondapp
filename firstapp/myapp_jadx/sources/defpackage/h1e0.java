package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h1e0 extends t5w {
    public final i1e0 a;
    public gkd0 b;
    public g1e0 c;

    public h1e0() {
        i1e0 i1e0Var = new i1e0();
        i1e0Var.k = false;
        this.a = i1e0Var;
        this.c = i1e0Var;
    }

    @Override // defpackage.t5w
    public final float a() {
        return this.c.a();
    }

    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        i1e0 i1e0Var = this.a;
        this.c = i1e0Var;
        i1e0Var.l = f;
        boolean z = f > f2;
        i1e0Var.k = z;
        if (z) {
            i1e0Var.d(-f3, f - f2, f5, f6, f4);
        } else {
            i1e0Var.d(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}

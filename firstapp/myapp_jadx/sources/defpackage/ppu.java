package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ppu extends vlf {
    public final float a;

    public ppu(float f) {
        this.a = f - 0.001f;
    }

    @Override // defpackage.vlf
    public final void b(float f, float f2, float f3, hy80 hy80Var) {
        double d = this.a;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(fSqrt, 2.0d));
        hy80Var.e(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2, 270.0f, 0.0f);
        hy80Var.d(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        hy80Var.d(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
    }
}

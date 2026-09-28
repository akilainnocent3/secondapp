package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class a45 extends vlf implements Cloneable {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;

    @Override // defpackage.vlf
    public final void b(float f, float f2, float f3, hy80 hy80Var) {
        float f4;
        float f5;
        float f6 = this.c;
        if (f6 == 0.0f) {
            hy80Var.d(f, 0.0f);
            return;
        }
        float f7 = ((this.b * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.a;
        float f9 = f2 + this.e;
        float fA = hxa.a(1.0f, f3, f7, this.d * f3);
        if (fA / f7 >= 1.0f) {
            hy80Var.d(f, 0.0f);
            return;
        }
        float f10 = this.f;
        float f11 = f10 * f3;
        boolean z = f10 == -1.0f || Math.abs((f10 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = fA;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f12 = f7 + f8;
        float f13 = f4 + f8;
        float fSqrt = (float) Math.sqrt((f12 * f12) - (f13 * f13));
        float f14 = f9 - fSqrt;
        float f15 = f9 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f13));
        float f16 = (90.0f - degrees) + f5;
        hy80Var.d(f14, 0.0f);
        float f17 = f14 - f8;
        float f18 = f14 + f8;
        float f19 = f8 * 2.0f;
        hy80Var.a(f17, 0.0f, f18, f19, 270.0f, degrees);
        if (z) {
            hy80Var.a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f16, (f16 * 2.0f) - 180.0f);
        } else {
            float f20 = this.b;
            float f21 = f11 * 2.0f;
            float f22 = f20 + f21;
            float f23 = f9 - f7;
            float f24 = f11 + f20;
            hy80Var.a(f23, -f24, f22 + f23, f24, 180.0f - f16, ((f16 * 2.0f) - 180.0f) / 2.0f);
            float f25 = f9 + f7;
            float f26 = this.b;
            hy80Var.d(f25 - ((f26 / 2.0f) + f11), f26 + f11);
            float f27 = this.b;
            float f28 = f11 + f27;
            hy80Var.a(f25 - (f21 + f27), -f28, f25, f28, 90.0f, f16 - 90.0f);
        }
        hy80Var.a(f15 - f8, 0.0f, f15 + f8, f19, 270.0f - degrees, degrees);
        hy80Var.d(f, 0.0f);
    }

    public final void c(float f) {
        if (f >= 0.0f) {
            this.d = f;
        } else {
            hb5.a("cradleVerticalOffset must be positive.");
        }
    }
}

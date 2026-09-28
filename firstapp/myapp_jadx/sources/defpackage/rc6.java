package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rc6 {
    public final /* synthetic */ qc6.b a;

    public rc6(qc6.b bVar) {
        this.a = bVar;
    }

    public static void c(rc6 rc6Var, float f, float f2, int i) {
        if ((i & 4) != 0) {
            f = Float.intBitsToFloat((int) (rc6Var.d() >> 32));
        }
        float f3 = f;
        if ((i & 8) != 0) {
            f2 = Float.intBitsToFloat((int) (rc6Var.d() & 4294967295L));
        }
        rc6Var.b(0.0f, 0.0f, f3, f2, 1);
    }

    public final void a(bxz bxzVar, int i) {
        this.a.a().o(bxzVar, i);
    }

    public final void b(float f, float f2, float f3, float f4, int i) {
        this.a.a().d(f, f2, f3, f4, i);
    }

    public final long d() {
        return this.a.d();
    }

    public final void e(float f, float f2, float f3, float f4) {
        qc6.b bVar = this.a;
        lc6 lc6VarA = bVar.a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.d() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            vkn.a("Width and height must be greater than or equal to zero");
        }
        bVar.h(jFloatToRawIntBits);
        lc6VarA.e(f, f2);
    }

    public final void f(float f, long j) {
        lc6 lc6VarA = this.a.a();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        lc6VarA.e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        lc6VarA.n(f);
        lc6VarA.e(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public final void g(float f, float f2, long j) {
        lc6 lc6VarA = this.a.a();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        lc6VarA.e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        lc6VarA.a(f, f2);
        lc6VarA.e(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public final void h(float[] fArr) {
        this.a.a().r(fArr);
    }

    public final void i(float f, float f2) {
        this.a.a().e(f, f2);
    }
}

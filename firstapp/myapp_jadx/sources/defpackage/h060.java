package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h060 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;
    public final float h;
    public long i;

    public h060(long j, long j2, long j3, w4b w4bVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        long jC = a020.c(a020.f(j, j2));
        this.d = jC;
        long jC2 = a020.c(a020.f(j3, j2));
        this.e = jC2;
        float f = w4bVar != null ? w4bVar.a : 0.0f;
        this.f = f;
        this.g = w4bVar != null ? w4bVar.b : 0.0f;
        float fB = a020.b(jC, jC2);
        float f2 = csh0.b;
        float fSqrt = (float) Math.sqrt(1.0f - (fB * fB));
        this.h = ((double) fSqrt) > 0.001d ? ((fB + 1.0f) * f) / fSqrt : 0.0f;
        this.i = ywh.a(0.0f, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0092  */
    public static e4c b(float f, float f2, long j, long j2, long j3, long j4, long j5, float f3) {
        ywh ywhVar;
        long jC = a020.c(a020.f(j2, j));
        long jH = a020.h(j, a020.i(1.0f + f2, a020.i(f, jC)));
        long jA = a020.a(2.0f, a020.h(j3, j4));
        long jA2 = ywh.a(csh0.c(a020.d(j3), a020.d(jA), f2), csh0.c(a020.e(j3), a020.e(jA), f2));
        long jH2 = a020.h(j5, a020.i(f3, csh0.b(a020.d(jA2) - a020.d(j5), a020.e(jA2) - a020.e(j5))));
        long jF = a020.f(jH2, j5);
        long jA3 = ywh.a(-a020.e(jF), a020.d(jF));
        long jA4 = ywh.a(-a020.e(jA3), a020.d(jA3));
        float fB = a020.b(jC, jA4);
        if (Math.abs(fB) < 1.0E-4f) {
            ywhVar = null;
        } else {
            float fB2 = a020.b(a020.f(jH2, j2), jA4);
            if (Math.abs(fB) < Math.abs(fB2) * 1.0E-4f) {
                ywhVar = null;
            } else {
                ywhVar = new ywh(a020.h(j2, a020.i(fB2 / fB, jC)));
            }
        }
        long j6 = ywhVar != null ? ywhVar.a : j3;
        long jA5 = a020.a(3.0f, a020.h(jH, a020.i(2.0f, j6)));
        return new e4c(new float[]{a020.d(jH), a020.e(jH), a020.d(jA5), a020.e(jA5), a020.d(j6), a020.e(j6), a020.d(jH2), a020.e(jH2)});
    }

    public final float a(float f) {
        float fC = c();
        float f2 = this.g;
        if (f > fC) {
            return f2;
        }
        float f3 = this.h;
        if (f > f3) {
            return ((f - f3) * f2) / (c() - f3);
        }
        return 0.0f;
    }

    public final float c() {
        return (1.0f + this.g) * this.h;
    }
}

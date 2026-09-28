package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z3g0 {
    public final i3z a;
    public long b;

    public z3g0(long j, i3z i3zVar) {
        this.a = i3zVar;
        this.b = j;
    }

    public final long a(m020 m020Var, float f) {
        long jF = gly.f(this.b, gly.e(m020Var.c, m020Var.g));
        this.b = jF;
        i3z i3zVar = this.a;
        if ((i3zVar == null ? gly.d(jF) : Math.abs(b(jF))) < f) {
            return 9205357640488583168L;
        }
        long j = this.b;
        if (i3zVar == null) {
            float fD = gly.d(j);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / fD;
            return gly.e(this.b, gly.g(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / fD)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)));
        }
        float fB = b(j) - (Math.signum(b(this.b)) * f);
        long j2 = this.b;
        i3z i3zVar2 = i3z.b;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (i3zVar == i3zVar2 ? j2 & 4294967295L : j2 >> 32));
        if (i3zVar == i3zVar2) {
            return (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.a == i3z.b ? j >> 32 : j & 4294967295L));
    }
}

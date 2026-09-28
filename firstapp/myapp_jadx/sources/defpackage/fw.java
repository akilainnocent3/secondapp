package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class fw extends nxf0<Float> {
    public final float d;
    public final float e;

    public fw(long j, long j2) {
        this(1.0f, 0.0f, j, j2);
    }

    @Override // defpackage.q12
    public final Object b(long j, long j2) {
        long j3 = this.b;
        float f = this.d;
        if (j < j3) {
            return Float.valueOf(f);
        }
        long j4 = this.c;
        float f2 = this.e;
        if (j > j4) {
            return Float.valueOf(f2);
        }
        return Float.valueOf((((j - j3) / (j4 - j3)) * (f2 - f)) + f);
    }

    public fw(float f, float f2, long j, long j2) {
        super(j, j2);
        this.d = f;
        this.e = f2;
    }
}

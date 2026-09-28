package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class zy60 extends nxf0<Float> {
    public final float d;

    public zy60(float f, long j, long j2) {
        super(j, j2);
        this.d = f;
    }

    @Override // defpackage.q12
    public final Object b(long j, long j2) {
        long j3 = this.b;
        if (j < j3) {
            return Float.valueOf(1.0f);
        }
        long j4 = this.c;
        float f = this.d;
        if (j > j4) {
            return Float.valueOf(f);
        }
        return Float.valueOf((((j - j3) / (j4 - j3)) * (f - 1.0f)) + 1.0f);
    }
}

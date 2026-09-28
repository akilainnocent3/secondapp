package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ew extends q12<Float> {
    public final long b;
    public final long c;
    public final long d;

    public ew(long j, long j2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // defpackage.q12
    public final Float b(long j, long j2) {
        Float fValueOf = Float.valueOf(0.0f);
        long j3 = this.b;
        if (j < j3) {
            return fValueOf;
        }
        long j4 = this.c;
        if (j <= j4) {
            return Float.valueOf((((j - j3) / (j4 - j3)) * 1.0f) + 0.0f);
        }
        long j5 = this.d;
        return j <= j5 ? Float.valueOf((((j - j4) / (j5 - j4)) * (-1.0f)) + 1.0f) : fValueOf;
    }
}

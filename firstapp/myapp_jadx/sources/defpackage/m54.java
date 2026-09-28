package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m54 implements ht {
    public final float a;

    public static final class a implements ht.b {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        @Override // ht.b
        public final int a(int i, int i2, asr asrVar) {
            return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return h70.a(new StringBuilder("Horizontal(bias="), this.a, ')');
        }
    }

    public m54(float f) {
        this.a = f;
    }

    @Override // defpackage.ht
    public final long a(long j, long j2, asr asrVar) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        return (((long) Math.round((1.0f + this.a) * (((int) (j3 >> 32)) / 2.0f))) << 32) | (((long) Math.round(0.0f * (((int) (j3 & 4294967295L)) / 2.0f))) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m54) && Float.compare(this.a, ((m54) obj).a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wi1.a(this.a, ", verticalBias=-1.0)", new StringBuilder("BiasAbsoluteAlignment(horizontalBias="));
    }
}

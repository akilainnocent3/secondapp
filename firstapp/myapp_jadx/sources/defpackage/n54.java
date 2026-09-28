package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n54 implements ht {
    public final float a;
    public final float b;

    public static final class a implements ht.b {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        @Override // ht.b
        public final int a(int i, int i2, asr asrVar) {
            float f = (i2 - i) / 2.0f;
            asr asrVar2 = asr.a;
            float f2 = this.a;
            if (asrVar != asrVar2) {
                f2 *= -1.0f;
            }
            return Math.round((1.0f + f2) * f);
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

    public static final class b implements ht.c {
        public final float a;

        public b(float f) {
            this.a = f;
        }

        @Override // ht.c
        public final int a(int i, int i2) {
            return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return h70.a(new StringBuilder("Vertical(bias="), this.a, ')');
        }
    }

    public n54(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.ht
    public final long a(long j, long j2, asr asrVar) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        asr asrVar2 = asr.a;
        float f3 = this.a;
        if (asrVar != asrVar2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n54)) {
            return false;
        }
        n54 n54Var = (n54) obj;
        return Float.compare(this.a, n54Var.a) == 0 && Float.compare(this.b, n54Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return h70.a(sb, this.b, ')');
    }
}

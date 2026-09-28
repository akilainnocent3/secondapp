package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vvh {
    public final float a;
    public final mmd b;
    public final float c;

    public static final class a {
        public final float a;
        public final float b;
        public final long c;

        public a(float f, float f2, long j) {
            this.a = f;
            this.b = f2;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + tvh.a(this.b, Float.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingInfo(initialVelocity=");
            sb.append(this.a);
            sb.append(", distance=");
            sb.append(this.b);
            sb.append(", duration=");
            return uvh.a(sb, this.c, ')');
        }
    }

    public vvh(float f, mmd mmdVar) {
        this.a = f;
        this.b = mmdVar;
        float density = mmdVar.getDensity();
        float f2 = wvh.a;
        this.c = density * 386.0878f * 160.0f * 0.84f;
    }

    public final a a(float f) {
        double dB = b(f);
        double d = wvh.a;
        double d2 = d - 1.0d;
        return new a(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.c))), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = i70.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.c)));
    }
}

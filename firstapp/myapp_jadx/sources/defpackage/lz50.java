package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lz50 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        bys.d(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public lz50(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz50)) {
            return false;
        }
        lz50 lz50Var = (lz50) obj;
        return Float.compare(this.a, lz50Var.a) == 0 && Float.compare(this.b, lz50Var.b) == 0 && Float.compare(this.c, lz50Var.c) == 0 && Float.compare(this.d, lz50Var.d) == 0 && v4b.a(this.e, lz50Var.e) && v4b.a(this.f, lz50Var.f) && v4b.a(this.g, lz50Var.g) && v4b.a(this.h, lz50Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + f87.a(f87.a(f87.a(tvh.a(this.d, tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        String str = jjf.a(this.a) + ", " + jjf.a(this.b) + ", " + jjf.a(this.c) + ", " + jjf.a(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zA = v4b.a(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zA || !v4b.a(j2, j3) || !v4b.a(j3, j4)) {
            StringBuilder sbA = he.a("RoundRect(rect=", str, ", topLeft=");
            sbA.append((Object) v4b.b(j));
            sbA.append(", topRight=");
            sbA.append((Object) v4b.b(j2));
            sbA.append(", bottomRight=");
            sbA.append((Object) v4b.b(j3));
            sbA.append(", bottomLeft=");
            sbA.append((Object) v4b.b(j4));
            sbA.append(')');
            return sbA.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbA2 = he.a("RoundRect(rect=", str, ", radius=");
            sbA2.append(jjf.a(Float.intBitsToFloat(i)));
            sbA2.append(')');
            return sbA2.toString();
        }
        StringBuilder sbA3 = he.a("RoundRect(rect=", str, ", x=");
        sbA3.append(jjf.a(Float.intBitsToFloat(i)));
        sbA3.append(", y=");
        sbA3.append(jjf.a(Float.intBitsToFloat(i2)));
        sbA3.append(')');
        return sbA3.toString();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lk40 {
    public static final lk40 e = new lk40(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public lk40(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static lk40 b(lk40 lk40Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = lk40Var.a;
        }
        float f3 = lk40Var.b;
        if ((i & 4) != 0) {
            f2 = lk40Var.c;
        }
        return new lk40(f, f3, f2, lk40Var.d);
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        float fA = g70.a(f, f2, 2.0f, f2);
        float f3 = this.b;
        float fA2 = g70.a(this.d, f3, 2.0f, f3);
        return (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & 4294967295L);
    }

    public final long d() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long e() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk40)) {
            return false;
        }
        lk40 lk40Var = (lk40) obj;
        return Float.compare(this.a, lk40Var.a) == 0 && Float.compare(this.b, lk40Var.b) == 0 && Float.compare(this.c, lk40Var.c) == 0 && Float.compare(this.d, lk40Var.d) == 0;
    }

    public final lk40 f(lk40 lk40Var) {
        return new lk40(Math.max(this.a, lk40Var.a), Math.max(this.b, lk40Var.b), Math.min(this.c, lk40Var.c), Math.min(this.d, lk40Var.d));
    }

    public final boolean g() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean h(lk40 lk40Var) {
        return (this.a < lk40Var.c) & (lk40Var.a < this.c) & (this.b < lk40Var.d) & (lk40Var.b < this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final lk40 i(float f, float f2) {
        return new lk40(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final lk40 j(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new lk40(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + jjf.a(this.a) + ", " + jjf.a(this.b) + ", " + jjf.a(this.c) + ", " + jjf.a(this.d) + ')';
    }
}

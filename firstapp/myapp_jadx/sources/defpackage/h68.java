package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class h68 {
    public final String a;
    public final long b;
    public final int c;

    public h68(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            hb5.a("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            hb5.a("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i);

    public abstract float c(int i);

    public boolean d() {
        return false;
    }

    public long e(float f, float f2, float f3) {
        float[] fArrF = f(new float[]{f, f2, f3});
        return (((long) Float.floatToRawIntBits(fArrF[0])) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fArrF[1])));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h68 h68Var = (h68) obj;
        if (this.c == h68Var.c && this.a.equals(h68Var.a)) {
            return w58.a(this.b, h68Var.b);
        }
        return false;
    }

    public abstract float[] f(float[] fArr);

    public float g(float f, float f2, float f3) {
        return f(new float[]{f, f2, f3})[2];
    }

    public long h(float f, float f2, float f3, float f4, h68 h68Var) {
        float[] fArr = new float[(int) (this.b >> 32)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        float[] fArrA = a(fArr);
        return r58.a(fArrA[0], fArrA[1], fArrA[2], f4, h68Var);
    }

    public int hashCode() {
        return f87.a(this.a.hashCode() * 31, this.b, 31) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) w58.b(this.b)) + ')';
    }
}

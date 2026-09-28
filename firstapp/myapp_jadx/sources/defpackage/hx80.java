package defpackage;

import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class hx80 {
    public final float a;
    public final float b;
    public final long c;
    public final int d;
    public final long e;
    public final float f;

    public hx80(float f, float f2, long j, long j2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = f.d(f3, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx80)) {
            return false;
        }
        hx80 hx80Var = (hx80) obj;
        if (!g7f.b(this.a, hx80Var.a) || !g7f.b(this.b, hx80Var.b) || !j7f.b(this.c, hx80Var.c) || this.f != hx80Var.f || this.d != hx80Var.d) {
            return false;
        }
        long j = hx80Var.e;
        int i = j58.n;
        return nbh0.a(this.e, j);
    }

    public final int hashCode() {
        int iA = gpp.a(this.d, tvh.a(this.f, f87.a(tvh.a(this.b, Float.hashCode(this.a) * 31, 31), this.c, 31), 31), 31);
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return f87.a(iA, this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowParams(radius=");
        k35.a(this.a, ", spread=", sb);
        k35.a(this.b, ", offset=", sb);
        sb.append((Object) j7f.e(this.c));
        sb.append(", alpha=");
        sb.append(this.f);
        sb.append(", blendMode=");
        sb.append((Object) ff4.a(this.d));
        sb.append(", color=");
        sb.append((Object) j58.i(this.e));
        sb.append(", brush=null)");
        return sb.toString();
    }

    public hx80(long j, int i, long j2, float f) {
        this(f, j, 0.0f, j2, 1.0f, 3);
    }

    public hx80(float f, long j, float f2, long j2, float f3, int i) {
        this(f, f2, j2, j == 16 ? j58.b : j, f3, i);
    }
}

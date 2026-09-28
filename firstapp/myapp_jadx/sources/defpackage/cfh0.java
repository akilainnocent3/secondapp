package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class cfh0 {
    public final int a;
    public final float b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;

    public cfh0(int i, float f, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.a = i;
        this.b = f;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfh0)) {
            return false;
        }
        cfh0 cfh0Var = (cfh0) obj;
        if (this.a != cfh0Var.a || Float.compare(this.b, cfh0Var.b) != 0 || this.c != cfh0Var.c) {
            return false;
        }
        long j = cfh0Var.d;
        int i = j58.n;
        return nbh0.a(this.d, j) && nbh0.a(this.e, cfh0Var.e) && nbh0.a(this.f, cfh0Var.f) && this.g == cfh0Var.g && this.h == cfh0Var.h;
    }

    public final int hashCode() {
        int iA = f87.a(tvh.a(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31);
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Boolean.hashCode(this.h) + mtg0.a(f87.a(f87.a(f87.a(iA, this.d, 31), this.e, 31), this.f, 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnitOfProgressConfiguration(animationDuration=");
        sb.append(this.a);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", startDelayMillis=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        ofz.a(this.d, ", progressColor=", sb);
        ofz.a(this.e, ", innerShadowColor=", sb);
        ofz.a(this.f, ", hasLeftCornerRadius=", sb);
        sb.append(this.g);
        sb.append(", hasRightCornerRadius=");
        return ruw.a(sb, this.h, ')');
    }
}

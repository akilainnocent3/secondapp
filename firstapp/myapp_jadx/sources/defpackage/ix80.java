package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ix80 {
    public static final ix80 d = new ix80(0, 7, 0, 0.0f);
    public final long a;
    public final long b;
    public final float c;

    public ix80(long j, int i, long j2, float f) {
        this((i & 4) != 0 ? 0.0f : f, (i & 1) != 0 ? r58.d(4278190080L) : j, (i & 2) != 0 ? 0L : j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix80)) {
            return false;
        }
        ix80 ix80Var = (ix80) obj;
        long j = ix80Var.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && gly.c(this.b, ix80Var.b) && this.c == ix80Var.c;
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Float.hashCode(this.c) + f87.a(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        ofz.a(this.a, ", offset=", sb);
        sb.append((Object) gly.h(this.b));
        sb.append(", blurRadius=");
        return h70.a(sb, this.c, ')');
    }

    public ix80(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class r28 {
    public final long a;
    public final float b;
    public final float c;

    public r28(float f, float f2, long j) {
        this.a = j;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r28)) {
            return false;
        }
        r28 r28Var = (r28) obj;
        return gly.c(this.a, r28Var.a) && Float.compare(this.b, r28Var.b) == 0 && Float.compare(this.c, r28Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + tvh.a(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoinFlightFrame(position=");
        sb.append((Object) gly.h(this.a));
        sb.append(", scale=");
        sb.append(this.b);
        sb.append(", alpha=");
        return h70.a(sb, this.c, ')');
    }
}

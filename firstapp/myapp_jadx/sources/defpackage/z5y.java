package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class z5y {
    public final long a;
    public final int b;

    public z5y(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5y)) {
            return false;
        }
        z5y z5yVar = (z5y) obj;
        long j = z5yVar.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && this.b == z5yVar.b;
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NumberTextStyle(color=");
        ofz.a(this.a, ", weight=", sb);
        return rr1.b(sb, this.b, ')');
    }
}

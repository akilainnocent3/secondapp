package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bmf0 {
    public final long a;
    public final long b;

    public bmf0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmf0)) {
            return false;
        }
        bmf0 bmf0Var = (bmf0) obj;
        long j = bmf0Var.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, bmf0Var.b);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        ofz.a(this.a, ", selectionBackgroundColor=", sb);
        sb.append((Object) j58.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}

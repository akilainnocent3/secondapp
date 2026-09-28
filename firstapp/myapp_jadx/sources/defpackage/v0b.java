package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v0b {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public v0b(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v0b)) {
            return false;
        }
        v0b v0bVar = (v0b) obj;
        long j = v0bVar.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, v0bVar.b) && nbh0.a(this.c, v0bVar.c) && nbh0.a(this.d, v0bVar.d) && nbh0.a(this.e, v0bVar.e);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.e) + f87.a(f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        ofz.a(this.a, ", textColor=", sb);
        ofz.a(this.b, ", iconColor=", sb);
        ofz.a(this.c, ", disabledTextColor=", sb);
        ofz.a(this.d, ", disabledIconColor=", sb);
        sb.append((Object) j58.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}

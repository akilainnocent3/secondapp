package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class byh {
    public final long a;
    public final String b;

    public byh(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byh)) {
            return false;
        }
        byh byhVar = (byh) obj;
        return this.a == byhVar.a && this.b.equals(byhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FloatingEmoji(id=");
        sb.append(this.a);
        sb.append(", emoji=");
        return j26.a(sb, this.b, ')');
    }
}

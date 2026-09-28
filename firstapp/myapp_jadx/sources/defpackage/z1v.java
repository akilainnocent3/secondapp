package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class z1v {
    public final a2v a;

    public z1v(a2v a2vVar) {
        this.a = a2vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1v) && this.a == ((z1v) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MatchEventDetailResult(action=" + this.a + ")";
    }
}

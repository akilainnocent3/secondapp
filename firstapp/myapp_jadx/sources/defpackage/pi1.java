package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pi1 extends g7n {
    public final Object a;

    public pi1(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.g7n
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g7n) {
            return this.a.equals(((g7n) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.a + "}";
    }
}

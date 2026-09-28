package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h3 {
    public final bj1 a;

    public h3(bj1 bj1Var) {
        this.a = bj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h3) {
            return this.a.equals(((h3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return getClass().getSimpleName() + "{descriptor=" + this.a + '}';
    }
}

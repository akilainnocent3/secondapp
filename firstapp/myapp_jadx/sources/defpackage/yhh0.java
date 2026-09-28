package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class yhh0 {
    public final zuy a;
    public final avy b;

    public yhh0(zuy zuyVar, avy avyVar) {
        this.a = zuyVar;
        this.b = avyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhh0)) {
            return false;
        }
        yhh0 yhh0Var = (yhh0) obj;
        return this.a == yhh0Var.a && this.b == yhh0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpPageToggleState(mode=" + this.a + ", status=" + this.b + ")";
    }
}

package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class l130 {
    public final int a;
    public final k130 b;

    public l130(int i, k130 k130Var) {
        this.a = i;
        this.b = k130Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l130)) {
            return false;
        }
        l130 l130Var = (l130) obj;
        return this.a == l130Var.a && this.b == l130Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ProfileTabItem(title=" + this.a + ", tab=" + this.b + ")";
    }
}

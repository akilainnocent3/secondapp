package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class tx70 {
    public final pz70 a;
    public final boolean b;

    public tx70(pz70 pz70Var, boolean z) {
        pz70Var.getClass();
        this.a = pz70Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx70)) {
            return false;
        }
        tx70 tx70Var = (tx70) obj;
        return this.a == tx70Var.a && this.b == tx70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SearchResultTag(tag=" + this.a + ", isSelected=" + this.b + ")";
    }
}

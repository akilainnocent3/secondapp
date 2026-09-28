package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class qfa0 {
    public final rfa0 a;
    public final int b;

    public qfa0(rfa0 rfa0Var, int i) {
        this.a = rfa0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfa0)) {
            return false;
        }
        qfa0 qfa0Var = (qfa0) obj;
        return this.a == qfa0Var.a && this.b == qfa0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SocialNetworkTabViewState(tab=" + this.a + ", title=" + this.b + ")";
    }
}

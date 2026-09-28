package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class qac0 {
    public final bh2 a;
    public final ii2 b;

    public qac0(bh2 bh2Var, ii2 ii2Var) {
        this.a = bh2Var;
        this.b = ii2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qac0)) {
            return false;
        }
        qac0 qac0Var = (qac0) obj;
        return this.a.equals(qac0Var.a) && this.b.equals(qac0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportyLegendsBetBuilderState(headerUiState=" + this.a + ", contentUiState=" + this.b + ")";
    }
}

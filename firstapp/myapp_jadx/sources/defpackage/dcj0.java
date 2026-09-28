package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class dcj0 {
    public final cdj0 a;
    public final cdj0 b;

    public dcj0(cdj0 cdj0Var, cdj0 cdj0Var2) {
        cdj0Var.getClass();
        cdj0Var2.getClass();
        this.a = cdj0Var;
        this.b = cdj0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcj0)) {
            return false;
        }
        dcj0 dcj0Var = (dcj0) obj;
        return this.a == dcj0Var.a && this.b == dcj0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WinningPopupDoubleOrNothingActionRequestState(cashoutRequestStatus=" + this.a + ", takeTheShotRequestStatus=" + this.b + ")";
    }
}

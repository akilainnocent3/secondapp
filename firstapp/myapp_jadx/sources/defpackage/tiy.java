package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class tiy {
    public final gt7 a;
    public final lhy b;

    public tiy(gt7 gt7Var, lhy lhyVar) {
        this.a = gt7Var;
        this.b = lhyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tiy)) {
            return false;
        }
        tiy tiyVar = (tiy) obj;
        return this.a.equals(tiyVar.a) && this.b == tiyVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Risky(range=" + this.a + ", selectionState=" + this.b + ")";
    }
}

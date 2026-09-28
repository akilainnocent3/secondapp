package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class uiy {
    public final gt7 a;
    public final lhy b;

    public uiy(gt7 gt7Var, lhy lhyVar) {
        this.a = gt7Var;
        this.b = lhyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uiy)) {
            return false;
        }
        uiy uiyVar = (uiy) obj;
        return this.a.equals(uiyVar.a) && this.b == uiyVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Simple(range=" + this.a + ", selectionState=" + this.b + ")";
    }
}

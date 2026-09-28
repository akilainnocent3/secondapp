package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class fk1 extends nw40 {
    public final cj1 a;
    public final nl1 b;
    public final bjb0 c;
    public final int d;
    public final eqa0 e;

    public fk1(cj1 cj1Var, nl1 nl1Var, bjb0 bjb0Var, int i, eqa0 eqa0Var) {
        if (cj1Var == null) {
            bmy.a("Null instrumentSelector");
            throw null;
        }
        this.a = cj1Var;
        if (nl1Var == null) {
            bmy.a("Null view");
            throw null;
        }
        this.b = nl1Var;
        this.c = bjb0Var;
        this.d = i;
        if (eqa0Var != null) {
            this.e = eqa0Var;
        } else {
            bmy.a("Null viewSourceInfo");
            throw null;
        }
    }

    @Override // defpackage.nw40
    public final int a() {
        return this.d;
    }

    @Override // defpackage.nw40
    public final cj1 b() {
        return this.a;
    }

    @Override // defpackage.nw40
    public final nl1 c() {
        return this.b;
    }

    @Override // defpackage.nw40
    public final bjb0 d() {
        return this.c;
    }

    @Override // defpackage.nw40
    public final eqa0 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nw40)) {
            return false;
        }
        nw40 nw40Var = (nw40) obj;
        return this.a.equals(nw40Var.b()) && this.b.equals(nw40Var.c()) && this.c.equals(nw40Var.d()) && this.d == nw40Var.a() && this.e.equals(nw40Var.e());
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003);
    }
}

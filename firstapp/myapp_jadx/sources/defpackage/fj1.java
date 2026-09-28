package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fj1 extends nbp.a {
    public final wj1 a;
    public final h8n.g b;

    public fj1(wj1 wj1Var, h8n.g gVar) {
        if (wj1Var == null) {
            bmy.a("Null packet");
            throw null;
        }
        this.a = wj1Var;
        this.b = gVar;
    }

    @Override // nbp.a
    public final h8n.g a() {
        return this.b;
    }

    @Override // nbp.a
    public final wj1 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nbp.a)) {
            return false;
        }
        nbp.a aVar = (nbp.a) obj;
        return this.a.equals(aVar.b()) && this.b.equals(aVar.a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "In{packet=" + this.a + ", outputFileOptions=" + this.b + "}";
    }
}

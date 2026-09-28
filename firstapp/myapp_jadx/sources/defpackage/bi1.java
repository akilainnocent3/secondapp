package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bi1 extends vff {
    public final sj1 a;
    public final sj1 b;

    public bi1(sj1 sj1Var, sj1 sj1Var2) {
        this.a = sj1Var;
        this.b = sj1Var2;
    }

    @Override // defpackage.vff
    public final v7z a() {
        return this.a;
    }

    @Override // defpackage.vff
    public final v7z b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vff)) {
            return false;
        }
        vff vffVar = (vff) obj;
        return this.a.equals(vffVar.a()) && this.b.equals(vffVar.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}

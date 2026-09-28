package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mg1 extends be4.b {
    public final wj1 a;
    public final int b;

    public mg1(wj1 wj1Var, int i) {
        if (wj1Var == null) {
            bmy.a("Null packet");
            throw null;
        }
        this.a = wj1Var;
        this.b = i;
    }

    @Override // be4.b
    public final int a() {
        return this.b;
    }

    @Override // be4.b
    public final wj1 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof be4.b)) {
            return false;
        }
        be4.b bVar = (be4.b) obj;
        return this.a.equals(bVar.b()) && this.b == bVar.a();
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.a);
        sb.append(", jpegQuality=");
        return zk1.a(this.b, "}", sb);
    }
}

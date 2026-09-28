package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qi1 extends t7n.a {
    public final wj1 a;
    public final int b;

    public qi1(wj1 wj1Var, int i) {
        if (wj1Var == null) {
            bmy.a("Null packet");
            throw null;
        }
        this.a = wj1Var;
        this.b = i;
    }

    @Override // t7n.a
    public final int a() {
        return this.b;
    }

    @Override // t7n.a
    public final wj1 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t7n.a)) {
            return false;
        }
        t7n.a aVar = (t7n.a) obj;
        return this.a.equals(aVar.b()) && this.b == aVar.a();
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

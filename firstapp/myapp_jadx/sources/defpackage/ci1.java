package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ci1 extends ggf.b {
    public final ehe0 a;
    public final ehe0 b;
    public final List<vff> c;

    public ci1(ehe0 ehe0Var, ehe0 ehe0Var2, List<vff> list) {
        if (ehe0Var == null) {
            bmy.a("Null primarySurfaceEdge");
            throw null;
        }
        this.a = ehe0Var;
        if (ehe0Var2 == null) {
            bmy.a("Null secondarySurfaceEdge");
            throw null;
        }
        this.b = ehe0Var2;
        if (list != null) {
            this.c = list;
        } else {
            bmy.a("Null outConfigs");
            throw null;
        }
    }

    @Override // ggf.b
    public final List<vff> a() {
        return this.c;
    }

    @Override // ggf.b
    public final ehe0 b() {
        return this.a;
    }

    @Override // ggf.b
    public final ehe0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ggf.b)) {
            return false;
        }
        ggf.b bVar = (ggf.b) obj;
        return this.a.equals(bVar.b()) && this.b.equals(bVar.c()) && this.c.equals(bVar.a());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{primarySurfaceEdge=");
        sb.append(this.a);
        sb.append(", secondarySurfaceEdge=");
        sb.append(this.b);
        sb.append(", outConfigs=");
        return ng1.a(sb, this.c, "}");
    }
}

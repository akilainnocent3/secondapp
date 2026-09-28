package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ak1 extends ry20.a {
    public final zkf<ry20.b> a;
    public final zkf<ry20.b> b;
    public final int c;
    public final List<Integer> d;

    public ak1(zkf<ry20.b> zkfVar, zkf<ry20.b> zkfVar2, int i, List<Integer> list) {
        this.a = zkfVar;
        this.b = zkfVar2;
        this.c = i;
        if (list != null) {
            this.d = list;
        } else {
            bmy.a("Null outputFormats");
            throw null;
        }
    }

    @Override // ry20.a
    public final zkf<ry20.b> a() {
        return this.a;
    }

    @Override // ry20.a
    public final int b() {
        return this.c;
    }

    @Override // ry20.a
    public final List<Integer> c() {
        return this.d;
    }

    @Override // ry20.a
    public final zkf<ry20.b> d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ry20.a)) {
            return false;
        }
        ry20.a aVar = (ry20.a) obj;
        return this.a.equals(aVar.a()) && this.b.equals(aVar.d()) && this.c == aVar.b() && this.d.equals(aVar.c());
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{edge=");
        sb.append(this.a);
        sb.append(", postviewEdge=");
        sb.append(this.b);
        sb.append(", inputFormat=");
        sb.append(this.c);
        sb.append(", outputFormats=");
        return ng1.a(sb, this.d, "}");
    }
}

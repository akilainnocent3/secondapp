package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class kh1 extends ktb.e.d.a.b {
    public final List<ktb.e.d.a.b.AbstractC0788d> a;
    public final ktb.e.d.a.b.AbstractC0787b b;
    public final ktb.a c;
    public final nh1 d;
    public final List<ktb.e.d.a.b.AbstractC0786a> e;

    public kh1(List list, mh1 mh1Var, ktb.a aVar, nh1 nh1Var, List list2) {
        this.a = list;
        this.b = mh1Var;
        this.c = aVar;
        this.d = nh1Var;
        this.e = list2;
    }

    @Override // ktb.e.d.a.b
    public final ktb.a a() {
        return this.c;
    }

    @Override // ktb.e.d.a.b
    public final List<ktb.e.d.a.b.AbstractC0786a> b() {
        return this.e;
    }

    @Override // ktb.e.d.a.b
    public final ktb.e.d.a.b.AbstractC0787b c() {
        return this.b;
    }

    @Override // ktb.e.d.a.b
    public final ktb.e.d.a.b.c d() {
        return this.d;
    }

    @Override // ktb.e.d.a.b
    public final List<ktb.e.d.a.b.AbstractC0788d> e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ktb.e.d.a.b)) {
            return false;
        }
        ktb.e.d.a.b bVar = (ktb.e.d.a.b) obj;
        List<ktb.e.d.a.b.AbstractC0788d> list = this.a;
        if (list == null) {
            if (bVar.e() != null) {
                return false;
            }
        } else if (!list.equals(bVar.e())) {
            return false;
        }
        ktb.e.d.a.b.AbstractC0787b abstractC0787b = this.b;
        if (abstractC0787b == null) {
            if (bVar.c() != null) {
                return false;
            }
        } else if (!abstractC0787b.equals(bVar.c())) {
            return false;
        }
        ktb.a aVar = this.c;
        if (aVar == null) {
            if (bVar.a() != null) {
                return false;
            }
        } else if (!aVar.equals(bVar.a())) {
            return false;
        }
        return this.d.equals(bVar.d()) && this.e.equals(bVar.b());
    }

    public final int hashCode() {
        List<ktb.e.d.a.b.AbstractC0788d> list = this.a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        ktb.e.d.a.b.AbstractC0787b abstractC0787b = this.b;
        int iHashCode2 = (iHashCode ^ (abstractC0787b == null ? 0 : abstractC0787b.hashCode())) * 1000003;
        ktb.a aVar = this.c;
        return this.e.hashCode() ^ (((((aVar != null ? aVar.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.a);
        sb.append(", exception=");
        sb.append(this.b);
        sb.append(", appExitInfo=");
        sb.append(this.c);
        sb.append(", signal=");
        sb.append(this.d);
        sb.append(", binaries=");
        return ng1.a(sb, this.e, "}");
    }
}

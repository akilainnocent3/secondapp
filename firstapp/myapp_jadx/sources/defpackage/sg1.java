package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sg1 extends ff6.b {
    public final Size f;
    public final int g;
    public final ArrayList h;
    public final boolean i;
    public final kan j;
    public final zj1 k;
    public final zkf<sy20> l;
    public final zkf<h4f0.a> m;

    public sg1(Size size, int i, ArrayList arrayList, boolean z, kan kanVar, zj1 zj1Var, zkf zkfVar, zkf zkfVar2) {
        this.a = new ff6.b.a();
        this.e = null;
        if (size == null) {
            bmy.a("Null size");
            throw null;
        }
        this.f = size;
        this.g = i;
        this.h = arrayList;
        this.i = z;
        this.j = kanVar;
        this.k = zj1Var;
        this.l = zkfVar;
        this.m = zkfVar2;
    }

    @Override // ff6.b
    public final zkf<h4f0.a> a() {
        return this.m;
    }

    @Override // ff6.b
    public final kan b() {
        return this.j;
    }

    @Override // ff6.b
    public final int c() {
        return this.g;
    }

    @Override // ff6.b
    public final List<Integer> d() {
        return this.h;
    }

    @Override // ff6.b
    public final zj1 e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ff6.b)) {
            return false;
        }
        ff6.b bVar = (ff6.b) obj;
        if (!this.f.equals(bVar.g()) || this.g != bVar.c() || !this.h.equals(bVar.d()) || this.i != bVar.h()) {
            return false;
        }
        kan kanVar = this.j;
        if (kanVar == null) {
            if (bVar.b() != null) {
                return false;
            }
        } else if (!kanVar.equals(bVar.b())) {
            return false;
        }
        zj1 zj1Var = this.k;
        if (zj1Var == null) {
            if (bVar.e() != null) {
                return false;
            }
        } else if (!zj1Var.equals(bVar.e())) {
            return false;
        }
        return this.l.equals(bVar.f()) && this.m.equals(bVar.a());
    }

    @Override // ff6.b
    public final zkf<sy20> f() {
        return this.l;
    }

    @Override // ff6.b
    public final Size g() {
        return this.f;
    }

    @Override // ff6.b
    public final boolean h() {
        return this.i;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003;
        kan kanVar = this.j;
        int iHashCode2 = (iHashCode ^ (kanVar == null ? 0 : kanVar.hashCode())) * 1000003;
        zj1 zj1Var = this.k;
        return this.m.hashCode() ^ ((((iHashCode2 ^ (zj1Var != null ? zj1Var.hashCode() : 0)) * 1000003) ^ this.l.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{size=" + this.f + ", inputFormat=" + this.g + ", outputFormats=" + this.h + ", virtualCamera=" + this.i + ", imageReaderProxyProvider=" + this.j + ", postviewSettings=" + this.k + ", requestEdge=" + this.l + ", errorEdge=" + this.m + "}";
    }
}

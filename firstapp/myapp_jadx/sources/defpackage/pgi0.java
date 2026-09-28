package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pgi0 {
    public final vki0 a;
    public final qcn<vki0> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final aii0 f;
    public final iki0 g;

    public pgi0(vki0 vki0Var, uf00 uf00Var, boolean z, boolean z2, boolean z3, aii0 aii0Var, iki0 iki0Var) {
        vki0Var.getClass();
        uf00Var.getClass();
        aii0Var.getClass();
        this.a = vki0Var;
        this.b = uf00Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = aii0Var;
        this.g = iki0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgi0)) {
            return false;
        }
        pgi0 pgi0Var = (pgi0) obj;
        return Intrinsics.g(this.a, pgi0Var.a) && Intrinsics.g(this.b, pgi0Var.b) && this.c == pgi0Var.c && this.d == pgi0Var.d && this.e == pgi0Var.e && Intrinsics.g(this.f, pgi0Var.f) && Intrinsics.g(this.g, pgi0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + mtg0.a(mtg0.a(mtg0.a(shu.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualLobbyContentState(selectedTab=");
        sb.append(this.a);
        sb.append(", tabs=");
        sb.append(this.b);
        sb.append(", showTabView=");
        nng.a(", showGiftRedDot=", ", showBuildAndGo=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", game=");
        sb.append(this.f);
        sb.append(", mission=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}

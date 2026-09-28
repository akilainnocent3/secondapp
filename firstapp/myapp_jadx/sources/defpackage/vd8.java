package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vd8 implements wvt {
    public final uf00<uyt> a;
    public final boolean b;
    public final tyt c;

    /* JADX WARN: Multi-variable type inference failed */
    public vd8(uf00<? extends uyt> uf00Var, boolean z, tyt tytVar) {
        uf00Var.getClass();
        this.a = uf00Var;
        this.b = z;
        this.c = tytVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd8)) {
            return false;
        }
        vd8 vd8Var = (vd8) obj;
        return Intrinsics.g(this.a, vd8Var.a) && this.b == vd8Var.b && this.c.equals(vd8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "LoyaltyTabContent(content=" + this.a + ", isDiamond=" + this.b + ", tab=" + this.c + ")";
    }
}

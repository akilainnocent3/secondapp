package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class dih0 {
    public final rhh0 a;
    public final Set<phh0> b;
    public final Set<phh0> c;
    public final Set<phh0> d;
    public final Set<phh0> e;

    public dih0(rhh0 rhh0Var, ph80 ph80Var, ph80 ph80Var2, Set set, ph80 ph80Var3) {
        ph80Var.getClass();
        ph80Var2.getClass();
        set.getClass();
        ph80Var3.getClass();
        this.a = rhh0Var;
        this.b = ph80Var;
        this.c = ph80Var2;
        this.d = set;
        this.e = ph80Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dih0)) {
            return false;
        }
        dih0 dih0Var = (dih0) obj;
        return this.a == dih0Var.a && Intrinsics.g(this.b, dih0Var.b) && Intrinsics.g(this.c, dih0Var.c) && Intrinsics.g(this.d, dih0Var.d) && Intrinsics.g(this.e, dih0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "UpSelectionSupport(family=" + this.a + ", reachableCases=" + this.b + ", supportedCases=" + this.c + ", allowedCases=" + this.d + ", activatedCases=" + this.e + ")";
    }
}

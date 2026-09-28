package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class es1 {
    public final boolean a;
    public final boolean b;
    public final Function0<Unit> c;

    public es1(boolean z, boolean z2, Function0<Unit> function0) {
        function0.getClass();
        this.a = z;
        this.b = z2;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es1)) {
            return false;
        }
        es1 es1Var = (es1) obj;
        return this.a == es1Var.a && this.b == es1Var.b && Intrinsics.g(this.c, es1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("BackToTopState(isVisible=", ", isScrollInProgress=", ", onClick=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}

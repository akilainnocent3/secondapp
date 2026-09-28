package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x95 {
    public final String a;
    public final Function0<Unit> b;

    public x95(String str) {
        this.a = str;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x95)) {
            return false;
        }
        x95 x95Var = (x95) obj;
        return Intrinsics.g(this.a, x95Var.a) && Intrinsics.g(this.b, x95Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Function0<Unit> function0 = this.b;
        return iHashCode + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        return "BreadcrumbItem(label=" + this.a + ", onClick=" + this.b + ")";
    }

    public x95(String str, Function0<Unit> function0) {
        this.a = str;
        this.b = function0;
    }
}

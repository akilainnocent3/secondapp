package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t1g0 {
    public final String a;
    public final String b;
    public final List<equ> c;

    public t1g0(String str, String str2, List<equ> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1g0)) {
            return false;
        }
        t1g0 t1g0Var = (t1g0) obj;
        return this.a.equals(t1g0Var.a) && this.b.equals(t1g0Var.b) && Intrinsics.g(this.c, t1g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ng1.a(ux5.a("TopMarkets(desc=", this.a, ", title=", this.b, ", items="), this.c, ")");
    }
}

package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hcc0 {
    public final ygc0 a;
    public final List<icc0> b;
    public final jmc0 c;

    public hcc0(ygc0 ygc0Var, List<icc0> list, jmc0 jmc0Var) {
        list.getClass();
        this.a = ygc0Var;
        this.b = list;
        this.c = jmc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcc0)) {
            return false;
        }
        hcc0 hcc0Var = (hcc0) obj;
        return this.a.equals(hcc0Var.a) && Intrinsics.g(this.b, hcc0Var.b) && Intrinsics.g(this.c, hcc0Var.c);
    }

    public final int hashCode() {
        int iA = ai50.a(this.a.a.hashCode() * 31, 31, this.b);
        jmc0 jmc0Var = this.c;
        return iA + (jmc0Var == null ? 0 : jmc0Var.hashCode());
    }

    public final String toString() {
        return "SportyLegendsDetails(roundInfo=" + this.a + ", events=" + this.b + ", stats=" + this.c + ")";
    }
}

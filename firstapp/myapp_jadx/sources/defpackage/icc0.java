package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class icc0 {
    public final String a;
    public final knc0 b;
    public final knc0 c;
    public final List<sdc0> d;

    public icc0(String str, knc0 knc0Var, knc0 knc0Var2, List<sdc0> list) {
        list.getClass();
        this.a = str;
        this.b = knc0Var;
        this.c = knc0Var2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icc0)) {
            return false;
        }
        icc0 icc0Var = (icc0) obj;
        return this.a.equals(icc0Var.a) && this.b.equals(icc0Var.b) && this.c.equals(icc0Var.c) && Intrinsics.g(this.d, icc0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SportyLegendsEvent(id=" + this.a + ", leftTeam=" + this.b + ", rightTeam=" + this.c + ", markets=" + this.d + ")";
    }
}

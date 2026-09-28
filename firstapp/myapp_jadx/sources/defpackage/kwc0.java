package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kwc0 {
    public final a0d0 a;
    public final List<lwc0> b;
    public final l4d0 c;

    public kwc0(a0d0 a0d0Var, List<lwc0> list, l4d0 l4d0Var) {
        list.getClass();
        this.a = a0d0Var;
        this.b = list;
        this.c = l4d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwc0)) {
            return false;
        }
        kwc0 kwc0Var = (kwc0) obj;
        return this.a.equals(kwc0Var.a) && Intrinsics.g(this.b, kwc0Var.b) && Intrinsics.g(this.c, kwc0Var.c);
    }

    public final int hashCode() {
        int iA = ai50.a(this.a.a.hashCode() * 31, 31, this.b);
        l4d0 l4d0Var = this.c;
        return iA + (l4d0Var == null ? 0 : l4d0Var.hashCode());
    }

    public final String toString() {
        return "SportyPenaltyDetails(roundInfo=" + this.a + ", events=" + this.b + ", stats=" + this.c + ")";
    }
}

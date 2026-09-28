package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sb00 {
    public final boolean a;
    public final Integer b;
    public final List<ib00> c;
    public final jb00 d;

    public sb00(boolean z, Integer num, List<ib00> list, jb00 jb00Var) {
        list.getClass();
        this.a = z;
        this.b = num;
        this.c = list;
        this.d = jb00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb00)) {
            return false;
        }
        sb00 sb00Var = (sb00) obj;
        return this.a == sb00Var.a && Intrinsics.g(this.b, sb00Var.b) && Intrinsics.g(this.c, sb00Var.c) && this.d == sb00Var.d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        int iA = ai50.a((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        jb00 jb00Var = this.d;
        return iA + (jb00Var != null ? jb00Var.hashCode() : 0);
    }

    public final String toString() {
        return "PendingDepositsDialogState(isVisible=" + this.a + ", maxPendingDeposits=" + this.b + ", pendingDeposits=" + this.c + ", button=" + this.d + ")";
    }

    public sb00(int i) {
        this(false, null, m2g.a, null);
    }

    public sb00() {
        this(0);
    }
}

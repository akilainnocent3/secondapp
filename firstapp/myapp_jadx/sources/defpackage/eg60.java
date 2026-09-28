package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class eg60 {
    public final se60 a;
    public final rc60 b;

    public eg60(se60 se60Var, rc60 rc60Var) {
        se60Var.getClass();
        rc60Var.getClass();
        this.a = se60Var;
        this.b = rc60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg60)) {
            return false;
        }
        eg60 eg60Var = (eg60) obj;
        return Intrinsics.g(this.a, eg60Var.a) && Intrinsics.g(this.b, eg60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SBState(loadingState=" + this.a + ", dialogState=" + this.b + ')';
    }

    public eg60() {
        this(0);
    }

    public /* synthetic */ eg60(int i) {
        this(new se60.a(0), rc60.c.a);
    }
}

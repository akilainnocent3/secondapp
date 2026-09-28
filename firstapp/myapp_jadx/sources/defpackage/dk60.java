package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class dk60<EVENT> {
    public final iph0 a;
    public final String b;
    public final uf00<be90<EVENT>> c;

    /* JADX WARN: Multi-variable type inference failed */
    public dk60(iph0 iph0Var, String str, uf00<? extends be90<EVENT>> uf00Var) {
        iph0Var.getClass();
        str.getClass();
        uf00Var.getClass();
        this.a = iph0Var;
        this.b = str;
        this.c = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk60)) {
            return false;
        }
        dk60 dk60Var = (dk60) obj;
        return Intrinsics.g(this.a, dk60Var.a) && Intrinsics.g(this.b, dk60Var.b) && Intrinsics.g(this.c, dk60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "SGSidePanelState(userInfo=" + this.a + ", gameName=" + this.b + ", list=" + this.c + ')';
    }

    public dk60() {
        this(0);
    }

    public dk60(int i) {
        this(new iph0(0), "", n1a0.c);
    }
}

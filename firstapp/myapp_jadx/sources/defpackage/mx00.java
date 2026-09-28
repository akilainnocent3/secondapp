package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class mx00 {
    public final String a;
    public final String b;
    public final uf00<tw00> c;

    public mx00(uf00 uf00Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        uf00Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx00)) {
            return false;
        }
        mx00 mx00Var = (mx00) obj;
        return Intrinsics.g(this.a, mx00Var.a) && Intrinsics.g(this.b, mx00Var.b) && Intrinsics.g(this.c, mx00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "PiggyBashSidePanelState(nickname=" + this.a + ", avatar=" + this.b + ", list=" + this.c + ')';
    }

    public mx00(int i) {
        this(n1a0.c, "", "");
    }

    public mx00() {
        this(0);
    }
}

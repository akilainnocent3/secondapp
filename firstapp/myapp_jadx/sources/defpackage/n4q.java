package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n4q {
    public final String a;
    public final qcn<j58> b;

    public n4q(String str, uf00 uf00Var) {
        str.getClass();
        uf00Var.getClass();
        this.a = str;
        this.b = uf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4q)) {
            return false;
        }
        n4q n4qVar = (n4q) obj;
        return Intrinsics.g(this.a, n4qVar.a) && Intrinsics.g(this.b, n4qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LNColor(id=" + this.a + ", schemas=" + this.b + ")";
    }
}

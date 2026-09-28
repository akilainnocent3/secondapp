package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mea0 {
    public final qcn<d9a0> a;
    public final qcn<d9a0> b;
    public final qcn<d9a0> c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public mea0(qcn<d9a0> qcnVar, qcn<d9a0> qcnVar2, qcn<d9a0> qcnVar3, String str, boolean z, boolean z2) {
        qcnVar.getClass();
        qcnVar2.getClass();
        qcnVar3.getClass();
        this.a = qcnVar;
        this.b = qcnVar2;
        this.c = qcnVar3;
        this.d = str;
        this.e = z;
        this.f = z2;
    }

    public static mea0 a(mea0 mea0Var, uf00 uf00Var, uf00 uf00Var2, String str, boolean z, int i) {
        qcn<d9a0> qcnVar = uf00Var;
        if ((i & 1) != 0) {
            qcnVar = mea0Var.a;
        }
        qcn<d9a0> qcnVar2 = qcnVar;
        qcn<d9a0> qcnVar3 = uf00Var2;
        if ((i & 2) != 0) {
            qcnVar3 = mea0Var.b;
        }
        qcn<d9a0> qcnVar4 = qcnVar3;
        qcn<d9a0> qcnVar5 = mea0Var.c;
        if ((i & 8) != 0) {
            str = mea0Var.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = mea0Var.e;
        }
        boolean z2 = z;
        boolean z3 = (i & 32) != 0 ? mea0Var.f : false;
        mea0Var.getClass();
        qcnVar2.getClass();
        qcnVar4.getClass();
        qcnVar5.getClass();
        str2.getClass();
        return new mea0(qcnVar2, qcnVar4, qcnVar5, str2, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mea0)) {
            return false;
        }
        mea0 mea0Var = (mea0) obj;
        return Intrinsics.g(this.a, mea0Var.a) && Intrinsics.g(this.b, mea0Var.b) && Intrinsics.g(this.c, mea0Var.c) && Intrinsics.g(this.d, mea0Var.d) && this.e == mea0Var.e && this.f == mea0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + mtg0.a(gmf0.a(shu.a(this.c, shu.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialNetworkSearchUI(suggestedAccountsList=");
        sb.append(this.a);
        sb.append(", highWinPlayersList=");
        sb.append(this.b);
        sb.append(", searchResults=");
        sb.append(this.c);
        sb.append(", searchQuery=");
        sb.append(this.d);
        sb.append(", isLoading=");
        return lng.a(", showEmpty=", ")", sb, this.e, this.f);
    }

    public mea0() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mea0(int i) {
        n1a0 n1a0Var = n1a0.c;
        this(n1a0Var, n1a0Var, n1a0Var, "", true, false);
    }
}

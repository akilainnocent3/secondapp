package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qvq {
    public final boolean a;
    public final int b;
    public final String c;
    public final qcn<Integer> d;
    public final qcn<Integer> e;
    public final String f;

    public qvq(boolean z, int i, String str, uf00 uf00Var, uf00 uf00Var2, String str2) {
        str.getClass();
        uf00Var.getClass();
        uf00Var2.getClass();
        str2.getClass();
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = uf00Var;
        this.e = uf00Var2;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvq)) {
            return false;
        }
        qvq qvqVar = (qvq) obj;
        return this.a == qvqVar.a && this.b == qvqVar.b && Intrinsics.g(this.c, qvqVar.c) && Intrinsics.g(this.d, qvqVar.d) && Intrinsics.g(this.e, qvqVar.e) && Intrinsics.g(this.f, qvqVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + shu.a(this.e, shu.a(this.d, gmf0.a(gpp.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = zug0.a("LNMyNumberItem(enable=", ", id=", ", title=", this.b, this.a);
        sbA.append(this.c);
        sbA.append(", mainNumbers=");
        sbA.append(this.d);
        sbA.append(", bonusNumbers=");
        sbA.append(this.e);
        sbA.append(", createTime=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}

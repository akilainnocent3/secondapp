package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xxq {
    public final qcn<j58> a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public xxq(qcn<j58> qcnVar, String str, String str2, boolean z, String str3) {
        str.getClass();
        str3.getClass();
        this.a = qcnVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxq)) {
            return false;
        }
        xxq xxqVar = (xxq) obj;
        return Intrinsics.g(this.a, xxqVar.a) && Intrinsics.g(this.b, xxqVar.b) && this.c.equals(xxqVar.c) && this.d == xxqVar.d && Intrinsics.g(this.e, xxqVar.e);
    }

    public final int hashCode() {
        qcn<j58> qcnVar = this.a;
        return this.e.hashCode() + mtg0.a(gmf0.a(gmf0.a((qcnVar == null ? 0 : qcnVar.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LNOtherViewState(colors=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", odds=");
        uts.b(this.c, ", isSelected=", ", outcomeId=", sb, this.d);
        return uf80.a(sb, this.e, ")");
    }
}

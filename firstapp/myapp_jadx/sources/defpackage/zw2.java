package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zw2 {
    public final qcn<ez2> a;
    public final sw b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final xw2 g;

    public zw2(qcn<ez2> qcnVar, sw swVar, String str, String str2, boolean z, boolean z2, xw2 xw2Var) {
        qcnVar.getClass();
        str.getClass();
        str2.getClass();
        xw2Var.getClass();
        this.a = qcnVar;
        this.b = swVar;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = xw2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw2)) {
            return false;
        }
        zw2 zw2Var = (zw2) obj;
        return Intrinsics.g(this.a, zw2Var.a) && Intrinsics.g(this.b, zw2Var.b) && Intrinsics.g(this.c, zw2Var.c) && Intrinsics.g(this.d, zw2Var.d) && this.e == zw2Var.e && this.f == zw2Var.f && Intrinsics.g(this.g, zw2Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + mtg0.a(mtg0.a(gmf0.a(gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "BetPanelUIState(amountSelectionList=" + this.a + ", amountInputState=" + this.b + ", minAmount=" + this.c + ", maxAmount=" + this.d + ", hasGift=" + this.e + ", giftAvailable=" + this.f + ", dialog=" + this.g + ')';
    }

    public zw2() {
        this(0);
    }

    public zw2(int i) {
        this(n1a0.c, new sw.a(new omn.b("0"), true, true, true, true), "", "", false, true, xw2.c.a);
    }
}

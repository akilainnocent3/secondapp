package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gv1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final zsp e;
    public final zu1 f;

    public /* synthetic */ gv1(int i) {
        this((i & 1) != 0, false, false, "", new zsp(null, 7), new zu1(false, false, (Integer) null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv1)) {
            return false;
        }
        gv1 gv1Var = (gv1) obj;
        return this.a == gv1Var.a && this.b == gv1Var.b && this.c == gv1Var.c && Intrinsics.g(this.d, gv1Var.d) && Intrinsics.g(this.e, gv1Var.e) && Intrinsics.g(this.f, gv1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + gmf0.a(mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("BalanceState(showBalance=", ", showBalanceControls=", ", isInconsistent=", this.a, this.b);
        mng.a(", balance=", this.d, ", kycHintState=", sbA, this.c);
        sbA.append(this.e);
        sbA.append(", kycUiState=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }

    public gv1(boolean z, boolean z2, boolean z3, String str, zsp zspVar, zu1 zu1Var) {
        str.getClass();
        zspVar.getClass();
        zu1Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = zspVar;
        this.f = zu1Var;
    }
}

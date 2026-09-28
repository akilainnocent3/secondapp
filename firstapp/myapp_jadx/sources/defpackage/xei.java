package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xei implements obi {
    public final qcn<jfi> a;
    public final String b;
    public final boolean c;
    public final cfi d;
    public final qcn<qfi> e;
    public final String f;

    public xei(uf00 uf00Var, String str, boolean z, cfi cfiVar, qcn qcnVar, String str2) {
        uf00Var.getClass();
        this.a = uf00Var;
        this.b = str;
        this.c = z;
        this.d = cfiVar;
        this.e = qcnVar;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xei)) {
            return false;
        }
        xei xeiVar = (xei) obj;
        return Intrinsics.g(this.a, xeiVar.a) && this.b.equals(xeiVar.b) && this.c == xeiVar.c && this.d.equals(xeiVar.d) && Intrinsics.g(this.e, xeiVar.e) && this.f.equals(xeiVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        qcn<qfi> qcnVar = this.e;
        return this.f.hashCode() + ((iHashCode + (qcnVar == null ? 0 : qcnVar.hashCode())) * 31);
    }

    public final String toString() {
        return "FootballFamilySettlementSummaryContentState(tabStates=" + this.a + ", selectedTabId=" + this.b + ", shouldDisplayShowOffBanner=" + this.c + ", tabContentState=" + this.d + ", ticketStates=" + this.e + ", totalReturnWithCurrencyText=" + this.f + ")";
    }
}

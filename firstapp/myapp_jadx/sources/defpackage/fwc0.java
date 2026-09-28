package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fwc0 {
    public final l5d0 a;
    public final f5d0 b;
    public final boolean c;
    public final viy d;
    public final String e;
    public final qcn<jxc0> f;
    public final qcn<axc0> g;
    public final hm3 h;
    public final yc30 i;
    public final cw3 j;

    public fwc0(l5d0 l5d0Var, f5d0 f5d0Var, boolean z, viy viyVar, String str, qcn<jxc0> qcnVar, qcn<axc0> qcnVar2, hm3 hm3Var, yc30 yc30Var, cw3 cw3Var) {
        this.a = l5d0Var;
        this.b = f5d0Var;
        this.c = z;
        this.d = viyVar;
        this.e = str;
        this.f = qcnVar;
        this.g = qcnVar2;
        this.h = hm3Var;
        this.i = yc30Var;
        this.j = cw3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwc0)) {
            return false;
        }
        fwc0 fwc0Var = (fwc0) obj;
        return this.a.equals(fwc0Var.a) && Intrinsics.g(this.b, fwc0Var.b) && this.c == fwc0Var.c && Intrinsics.g(this.d, fwc0Var.d) && this.e.equals(fwc0Var.e) && this.f.equals(fwc0Var.f) && this.g.equals(fwc0Var.g) && this.h.equals(fwc0Var.h) && Intrinsics.g(this.i, fwc0Var.i) && Intrinsics.g(this.j, fwc0Var.j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        f5d0 f5d0Var = this.b;
        int iA = mtg0.a((iHashCode + (f5d0Var == null ? 0 : f5d0Var.hashCode())) * 31, 31, this.c);
        viy viyVar = this.d;
        int iA2 = gpp.a(this.h.a, shu.a(this.g, shu.a(this.f, gmf0.a((iA + (viyVar == null ? 0 : viyVar.hashCode())) * 31, 31, this.e), 31), 31), 31);
        yc30 yc30Var = this.i;
        int iHashCode2 = (iA2 + (yc30Var == null ? 0 : yc30Var.hashCode())) * 31;
        cw3 cw3Var = this.j;
        return iHashCode2 + (cw3Var != null ? cw3Var.hashCode() : 0);
    }

    public final String toString() {
        return "SportyPenaltyContentState(teamInfoState=" + this.a + ", statsState=" + this.b + ", isStatsExpanded=" + this.c + ", oddsFilterState=" + this.d + ", selectedMarketCategoryId=" + this.e + ", marketCategoryTabStates=" + this.f + ", marketCategoryInfoStates=" + this.g + ", betslipButtonState=" + this.h + ", quickBetState=" + this.i + ", betslipState=" + this.j + ")";
    }
}

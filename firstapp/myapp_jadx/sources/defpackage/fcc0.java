package defpackage;

import com.sporty.android.permission.location.KN.qUnCRF;
import com.sportybet.android.instantwin.newtork.model.response.Outcome;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fcc0 {
    public final bnc0 a;
    public final String b;
    public final String c;
    public final xnc0 d;
    public final qcn<mec0> e;
    public final qcn<dec0> f;
    public final qcn<cdc0> g;
    public final qcn<bdc0> h;
    public final jqc0 i;
    public final qac0 j;
    public final boolean k;
    public final qcn<Outcome> l;
    public final hm3 m;
    public final yc30 n;
    public final cw3 o;
    public final uhc0 p;

    /* JADX WARN: Multi-variable type inference failed */
    public fcc0(bnc0 bnc0Var, String str, String str2, xnc0 xnc0Var, qcn<mec0> qcnVar, qcn<dec0> qcnVar2, qcn<cdc0> qcnVar3, qcn<bdc0> qcnVar4, jqc0 jqc0Var, qac0 qac0Var, boolean z, qcn<? extends Outcome> qcnVar5, hm3 hm3Var, yc30 yc30Var, cw3 cw3Var, uhc0 uhc0Var) {
        uhc0Var.getClass();
        this.a = bnc0Var;
        this.b = str;
        this.c = str2;
        this.d = xnc0Var;
        this.e = qcnVar;
        this.f = qcnVar2;
        this.g = qcnVar3;
        this.h = qcnVar4;
        this.i = jqc0Var;
        this.j = qac0Var;
        this.k = z;
        this.l = qcnVar5;
        this.m = hm3Var;
        this.n = yc30Var;
        this.o = cw3Var;
        this.p = uhc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcc0)) {
            return false;
        }
        fcc0 fcc0Var = (fcc0) obj;
        return Intrinsics.g(this.a, fcc0Var.a) && this.b.equals(fcc0Var.b) && this.c.equals(fcc0Var.c) && this.d.equals(fcc0Var.d) && this.e.equals(fcc0Var.e) && this.f.equals(fcc0Var.f) && this.g.equals(fcc0Var.g) && this.h.equals(fcc0Var.h) && this.i.equals(fcc0Var.i) && Intrinsics.g(this.j, fcc0Var.j) && this.k == fcc0Var.k && this.l.equals(fcc0Var.l) && this.m.equals(fcc0Var.m) && Intrinsics.g(this.n, fcc0Var.n) && Intrinsics.g(this.o, fcc0Var.o) && this.p == fcc0Var.p;
    }

    public final int hashCode() {
        bnc0 bnc0Var = this.a;
        int iHashCode = (this.i.hashCode() + shu.a(this.h, shu.a(this.g, shu.a(this.f, shu.a(this.e, (this.d.hashCode() + gmf0.a(gmf0.a((bnc0Var == null ? 0 : bnc0Var.hashCode()) * 31, 31, this.b), 31, this.c)) * 31, 31), 31), 31), 31)) * 31;
        qac0 qac0Var = this.j;
        int iA = gpp.a(this.m.a, shu.a(this.l, mtg0.a((iHashCode + (qac0Var == null ? 0 : qac0Var.hashCode())) * 31, 31, this.k), 31), 31);
        yc30 yc30Var = this.n;
        int iHashCode2 = (iA + (yc30Var == null ? 0 : yc30Var.hashCode())) * 31;
        cw3 cw3Var = this.o;
        return this.p.hashCode() + ((iHashCode2 + (cw3Var != null ? cw3Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return qUnCRF.CnpiWcdzmG + this.a + ", selectedMarketCategoryId=" + this.b + ", selectedLeagueCategoryId=" + this.c + ", teamSelectionState=" + this.d + ", marketCategoryTabStates=" + this.e + ", marketCategoryInfoStates=" + this.f + ", leagueCategoryTabStates=" + this.g + ", leagueCategoryInfoStates=" + this.h + ", tutorialState=" + this.i + ", betBuilderState=" + this.j + ", isOddsFilterVisible=" + this.k + ", oddsFilterOutcomes=" + this.l + ", betslipButtonState=" + this.m + ", quickBetState=" + this.n + ", betslipState=" + this.o + YAzniTbXHYQ.HSuGWTWVblkwx + this.p + ")";
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ztn {
    public final int a;
    public final u2o b;
    public final String c;
    public final qcn<axn> d;
    public final qcn<yyn> e;
    public final hm3 f;
    public final yc30 g;
    public final cw3 h;

    /* JADX WARN: Multi-variable type inference failed */
    public ztn(int i, u2o u2oVar, String str, qcn<axn> qcnVar, qcn<? extends yyn> qcnVar2, hm3 hm3Var, yc30 yc30Var, cw3 cw3Var) {
        this.a = i;
        this.b = u2oVar;
        this.c = str;
        this.d = qcnVar;
        this.e = qcnVar2;
        this.f = hm3Var;
        this.g = yc30Var;
        this.h = cw3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztn)) {
            return false;
        }
        ztn ztnVar = (ztn) obj;
        return this.a == ztnVar.a && this.b.equals(ztnVar.b) && this.c.equals(ztnVar.c) && this.d.equals(ztnVar.d) && this.e.equals(ztnVar.e) && this.f.equals(ztnVar.f) && Intrinsics.g(this.g, ztnVar.g) && Intrinsics.g(this.h, ztnVar.h);
    }

    public final int hashCode() {
        int iA = gpp.a(this.f.a, shu.a(this.e, shu.a(this.d, gmf0.a((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31), 31), 31);
        yc30 yc30Var = this.g;
        int iHashCode = (iA + (yc30Var == null ? 0 : yc30Var.hashCode())) * 31;
        cw3 cw3Var = this.h;
        return iHashCode + (cw3Var != null ? cw3Var.hashCode() : 0);
    }

    public final String toString() {
        return "InstantRacingEventContentState(racerCarouselCurrentIndex=" + this.a + ", racerCarouselState=" + this.b + ", selectedMarketCategoryId=" + this.c + ", marketCategoryTabStates=" + this.d + ", marketLayoutStates=" + this.e + ", betslipButtonState=" + this.f + ", quickBetState=" + this.g + ", betslipState=" + this.h + ")";
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h370 {
    public final qcn<String> a;
    public final qcn<c870> b;
    public final String c;
    public final boolean d;
    public final qcn<w270> e;
    public final String f;
    public final hm3 g;
    public final yc30 h;
    public final cw3 i;
    public final lni0 j;

    /* JADX WARN: Multi-variable type inference failed */
    public h370(qcn<String> qcnVar, qcn<c870> qcnVar2, String str, boolean z, qcn<? extends w270> qcnVar3, String str2, hm3 hm3Var, yc30 yc30Var, cw3 cw3Var, lni0 lni0Var) {
        qcnVar.getClass();
        qcnVar2.getClass();
        this.a = qcnVar;
        this.b = qcnVar2;
        this.c = str;
        this.d = z;
        this.e = qcnVar3;
        this.f = str2;
        this.g = hm3Var;
        this.h = yc30Var;
        this.i = cw3Var;
        this.j = lni0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h370)) {
            return false;
        }
        h370 h370Var = (h370) obj;
        return Intrinsics.g(this.a, h370Var.a) && Intrinsics.g(this.b, h370Var.b) && this.c.equals(h370Var.c) && this.d == h370Var.d && Intrinsics.g(this.e, h370Var.e) && Intrinsics.g(this.f, h370Var.f) && this.g.equals(h370Var.g) && Intrinsics.g(this.h, h370Var.h) && Intrinsics.g(this.i, h370Var.i) && this.j == h370Var.j;
    }

    public final int hashCode() {
        int iA = mtg0.a(gmf0.a(shu.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        qcn<w270> qcnVar = this.e;
        int iHashCode = (iA + (qcnVar == null ? 0 : qcnVar.hashCode())) * 31;
        String str = this.f;
        int iA2 = gpp.a(this.g.a, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        yc30 yc30Var = this.h;
        int iHashCode2 = (iA2 + (yc30Var == null ? 0 : yc30Var.hashCode())) * 31;
        cw3 cw3Var = this.i;
        return this.j.hashCode() + ((iHashCode2 + (cw3Var != null ? cw3Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduledFootballContentState(timelineLottieUrls=");
        sb.append(this.a);
        sb.append(", leagueTabStates=");
        sb.append(this.b);
        sb.append(", selectedLeagueId=");
        uts.b(this.c, ", overviewStatsEnabled=", ", cellStates=", sb, this.d);
        sb.append(this.e);
        sb.append(", openBetsButtonCountText=");
        sb.append(this.f);
        sb.append(", betslipButtonState=");
        sb.append(this.g);
        sb.append(", quickBetState=");
        sb.append(this.h);
        sb.append(", betslipState=");
        sb.append(this.i);
        sb.append(", ticketCreatedSnackbarVisibilityState=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}

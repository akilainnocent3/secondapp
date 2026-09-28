package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n470 {
    public final String a;
    public final c470 b;
    public final tsa0 c;
    public final bta0 d;
    public final qcn<da70> e;
    public final u670 f;

    public n470(String str, c470 c470Var, tsa0 tsa0Var, bta0 bta0Var, qcn<da70> qcnVar, u670 u670Var) {
        qcnVar.getClass();
        this.a = str;
        this.b = c470Var;
        this.c = tsa0Var;
        this.d = bta0Var;
        this.e = qcnVar;
        this.f = u670Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n470)) {
            return false;
        }
        n470 n470Var = (n470) obj;
        return this.a.equals(n470Var.a) && this.b.equals(n470Var.b) && Intrinsics.g(this.c, n470Var.c) && Intrinsics.g(this.d, n470Var.d) && Intrinsics.g(this.e, n470Var.e) && Intrinsics.g(this.f, n470Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        tsa0 tsa0Var = this.c;
        int iHashCode2 = (iHashCode + (tsa0Var == null ? 0 : tsa0Var.hashCode())) * 31;
        bta0 bta0Var = this.d;
        int iA = shu.a(this.e, (iHashCode2 + (bta0Var == null ? 0 : bta0Var.hashCode())) * 31, 31);
        u670 u670Var = this.f;
        return iA + (u670Var != null ? u670Var.hashCode() : 0);
    }

    public final String toString() {
        return "ScheduledFootballEventOddsRowState(eventId=" + this.a + ", eventInfoState=" + this.b + ", specifierButtonState=" + this.c + ", specifierDropdownMenuState=" + this.d + ", oddsButtonStates=" + this.e + ", headToHeadStatsState=" + this.f + ")";
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zk70 {
    public final fqo a;
    public final i370 b;
    public final zs c;
    public final kd70 d;
    public final ufo e;
    public final al70 f;
    public final ysa g;
    public final lni0 h;
    public final zs i;
    public final zs j;
    public final zs k;
    public final xro l;

    public zk70(fqo fqoVar, i370 i370Var, zs zsVar, kd70 kd70Var, ufo ufoVar, al70 al70Var, ysa ysaVar, lni0 lni0Var, zs zsVar2, zs zsVar3, zs zsVar4, xro xroVar) {
        i370Var.getClass();
        zsVar.getClass();
        zsVar2.getClass();
        zsVar3.getClass();
        zsVar4.getClass();
        this.a = fqoVar;
        this.b = i370Var;
        this.c = zsVar;
        this.d = kd70Var;
        this.e = ufoVar;
        this.f = al70Var;
        this.g = ysaVar;
        this.h = lni0Var;
        this.i = zsVar2;
        this.j = zsVar3;
        this.k = zsVar4;
        this.l = xroVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk70)) {
            return false;
        }
        zk70 zk70Var = (zk70) obj;
        return this.a.equals(zk70Var.a) && Intrinsics.g(this.b, zk70Var.b) && Intrinsics.g(this.c, zk70Var.c) && Intrinsics.g(this.d, zk70Var.d) && Intrinsics.g(this.e, zk70Var.e) && Intrinsics.g(this.f, zk70Var.f) && Intrinsics.g(this.g, zk70Var.g) && this.h == zk70Var.h && Intrinsics.g(this.i, zk70Var.i) && Intrinsics.g(this.j, zk70Var.j) && Intrinsics.g(this.k, zk70Var.k) && Intrinsics.g(this.l, zk70Var.l);
    }

    public final int hashCode() {
        int iA = sco.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        kd70 kd70Var = this.d;
        int iHashCode = (iA + (kd70Var == null ? 0 : kd70Var.hashCode())) * 31;
        ufo ufoVar = this.e;
        int iHashCode2 = (iHashCode + (ufoVar == null ? 0 : ufoVar.hashCode())) * 31;
        al70 al70Var = this.f;
        int iHashCode3 = (iHashCode2 + (al70Var == null ? 0 : al70Var.hashCode())) * 31;
        ysa ysaVar = this.g;
        int iA2 = sco.a(this.k, sco.a(this.j, sco.a(this.i, (this.h.hashCode() + ((iHashCode3 + (ysaVar == null ? 0 : ysaVar.hashCode())) * 31)) * 31, 31), 31), 31);
        xro xroVar = this.l;
        return iA2 + (xroVar != null ? xroVar.hashCode() : 0);
    }

    public final String toString() {
        return "ScheduledFootballUiState(topAppBarState=" + this.a + ", contentStatus=" + this.b + ", sportInactiveDialogState=" + this.c + ", overviewStatsBottomSheetState=" + this.d + ", marketGuideBottomSheetState=" + this.e + ", universalSpecifierBottomSheetState=" + this.f + ", confirmDialogState=" + this.g + ", submittingDialogVisibilityState=" + this.h + ", createTicketErrorDialogState=" + this.i + ", noSelectionDialogState=" + this.j + ", removeAllSelectionDialogState=" + this.k + ", winningDialogUiState=" + this.l + ")";
    }
}

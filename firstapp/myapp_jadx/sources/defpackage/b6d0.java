package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b6d0 {
    public final fqo a;
    public final gwc0 b;
    public final ufo c;
    public final ysa d;
    public final lni0 e;
    public final zs f;
    public final zs g;
    public final zs h;
    public final zs i;
    public final boolean j;
    public final ink k;

    public b6d0(fqo fqoVar, gwc0 gwc0Var, ufo ufoVar, ysa ysaVar, lni0 lni0Var, zs zsVar, zs zsVar2, zs zsVar3, zs zsVar4, boolean z, ink inkVar) {
        gwc0Var.getClass();
        zsVar.getClass();
        zsVar2.getClass();
        zsVar3.getClass();
        zsVar4.getClass();
        inkVar.getClass();
        this.a = fqoVar;
        this.b = gwc0Var;
        this.c = ufoVar;
        this.d = ysaVar;
        this.e = lni0Var;
        this.f = zsVar;
        this.g = zsVar2;
        this.h = zsVar3;
        this.i = zsVar4;
        this.j = z;
        this.k = inkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6d0)) {
            return false;
        }
        b6d0 b6d0Var = (b6d0) obj;
        return this.a.equals(b6d0Var.a) && Intrinsics.g(this.b, b6d0Var.b) && Intrinsics.g(this.c, b6d0Var.c) && Intrinsics.g(this.d, b6d0Var.d) && this.e == b6d0Var.e && Intrinsics.g(this.f, b6d0Var.f) && Intrinsics.g(this.g, b6d0Var.g) && Intrinsics.g(this.h, b6d0Var.h) && Intrinsics.g(this.i, b6d0Var.i) && this.j == b6d0Var.j && Intrinsics.g(this.k, b6d0Var.k);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ufo ufoVar = this.c;
        int iHashCode2 = (iHashCode + (ufoVar == null ? 0 : ufoVar.hashCode())) * 31;
        ysa ysaVar = this.d;
        return this.k.hashCode() + mtg0.a(sco.a(this.i, sco.a(this.h, sco.a(this.g, sco.a(this.f, (this.e.hashCode() + ((iHashCode2 + (ysaVar != null ? ysaVar.hashCode() : 0)) * 31)) * 31, 31), 31), 31), 31), 31, this.j);
    }

    public final String toString() {
        return "SportyPenaltyUiState(topAppBarState=" + this.a + ", contentStatus=" + this.b + ", marketGuideDialogState=" + this.c + ", confirmDialogState=" + this.d + ", submittingDialogState=" + this.e + ", createTicketErrorDialogState=" + this.f + ", noSelectionDialogState=" + this.g + ", removeAllSelectionDialogState=" + this.h + ", sportInactiveDialogState=" + this.i + ", shouldShowExploreMoreBottomSheet=" + this.j + ", giftHintUiState=" + this.k + ")";
    }
}

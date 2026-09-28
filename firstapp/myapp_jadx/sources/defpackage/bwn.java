package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bwn {
    public final fqo a;
    public final aun b;
    public final ysa c;
    public final lni0 d;
    public final zs e;
    public final zs f;
    public final zs g;
    public final zs h;
    public final boolean i;
    public final ink j;

    public bwn(fqo fqoVar, aun aunVar, ysa ysaVar, lni0 lni0Var, zs zsVar, zs zsVar2, zs zsVar3, zs zsVar4, boolean z, ink inkVar) {
        aunVar.getClass();
        zsVar.getClass();
        zsVar2.getClass();
        zsVar3.getClass();
        zsVar4.getClass();
        inkVar.getClass();
        this.a = fqoVar;
        this.b = aunVar;
        this.c = ysaVar;
        this.d = lni0Var;
        this.e = zsVar;
        this.f = zsVar2;
        this.g = zsVar3;
        this.h = zsVar4;
        this.i = z;
        this.j = inkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwn)) {
            return false;
        }
        bwn bwnVar = (bwn) obj;
        return this.a.equals(bwnVar.a) && Intrinsics.g(this.b, bwnVar.b) && Intrinsics.g(this.c, bwnVar.c) && this.d == bwnVar.d && Intrinsics.g(this.e, bwnVar.e) && Intrinsics.g(this.f, bwnVar.f) && Intrinsics.g(this.g, bwnVar.g) && Intrinsics.g(this.h, bwnVar.h) && this.i == bwnVar.i && Intrinsics.g(this.j, bwnVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ysa ysaVar = this.c;
        return this.j.hashCode() + mtg0.a(sco.a(this.h, sco.a(this.g, sco.a(this.f, sco.a(this.e, (this.d.hashCode() + ((iHashCode + (ysaVar == null ? 0 : ysaVar.hashCode())) * 31)) * 31, 31), 31), 31), 31), 31, this.i);
    }

    public final String toString() {
        return "InstantRacingEventUiState(topAppBarState=" + this.a + ", contentStatus=" + this.b + ", confirmDialogState=" + this.c + ", submittingDialogState=" + this.d + ", createTicketErrorDialogState=" + this.e + ", noSelectionDialogState=" + this.f + ", removeAllSelectionDialogState=" + this.g + ", sportInactiveDialogState=" + this.h + ", shouldShowExploreMoreBottomSheet=" + this.i + ", giftHintUiState=" + this.j + ")";
    }
}

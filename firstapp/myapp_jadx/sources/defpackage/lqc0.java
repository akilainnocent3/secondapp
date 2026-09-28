package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lqc0 {
    public final fqo a;
    public final gcc0 b;
    public final UiText c;
    public final ufo d;
    public final ysa e;
    public final lni0 f;
    public final zs g;
    public final zs h;
    public final zs i;
    public final zs j;
    public final zs k;
    public final zs l;
    public final zs m;
    public final boolean n;
    public final ink o;
    public final ei2 p;
    public final xnc0 q;
    public final boolean r;

    public lqc0(fqo fqoVar, gcc0 gcc0Var, UiText uiText, ufo ufoVar, ysa ysaVar, lni0 lni0Var, zs zsVar, zs zsVar2, zs zsVar3, zs zsVar4, zs zsVar5, zs zsVar6, zs zsVar7, boolean z, ink inkVar, ei2 ei2Var, xnc0 xnc0Var, boolean z2) {
        gcc0Var.getClass();
        zsVar.getClass();
        zsVar2.getClass();
        zsVar3.getClass();
        zsVar4.getClass();
        zsVar5.getClass();
        zsVar6.getClass();
        zsVar7.getClass();
        inkVar.getClass();
        ei2Var.getClass();
        this.a = fqoVar;
        this.b = gcc0Var;
        this.c = uiText;
        this.d = ufoVar;
        this.e = ysaVar;
        this.f = lni0Var;
        this.g = zsVar;
        this.h = zsVar2;
        this.i = zsVar3;
        this.j = zsVar4;
        this.k = zsVar5;
        this.l = zsVar6;
        this.m = zsVar7;
        this.n = z;
        this.o = inkVar;
        this.p = ei2Var;
        this.q = xnc0Var;
        this.r = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqc0)) {
            return false;
        }
        lqc0 lqc0Var = (lqc0) obj;
        return this.a.equals(lqc0Var.a) && Intrinsics.g(this.b, lqc0Var.b) && Intrinsics.g(this.c, lqc0Var.c) && Intrinsics.g(this.d, lqc0Var.d) && Intrinsics.g(this.e, lqc0Var.e) && this.f == lqc0Var.f && Intrinsics.g(this.g, lqc0Var.g) && Intrinsics.g(this.h, lqc0Var.h) && Intrinsics.g(this.i, lqc0Var.i) && Intrinsics.g(this.j, lqc0Var.j) && Intrinsics.g(this.k, lqc0Var.k) && Intrinsics.g(this.l, lqc0Var.l) && Intrinsics.g(this.m, lqc0Var.m) && this.n == lqc0Var.n && Intrinsics.g(this.o, lqc0Var.o) && Intrinsics.g(this.p, lqc0Var.p) && Intrinsics.g(this.q, lqc0Var.q) && this.r == lqc0Var.r;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        UiText uiText = this.c;
        int iHashCode2 = (iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31;
        ufo ufoVar = this.d;
        int iHashCode3 = (iHashCode2 + (ufoVar == null ? 0 : ufoVar.hashCode())) * 31;
        ysa ysaVar = this.e;
        int iHashCode4 = (this.p.hashCode() + ((this.o.hashCode() + mtg0.a(sco.a(this.m, sco.a(this.l, sco.a(this.k, sco.a(this.j, sco.a(this.i, sco.a(this.h, sco.a(this.g, (this.f.hashCode() + ((iHashCode3 + (ysaVar == null ? 0 : ysaVar.hashCode())) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.n)) * 31)) * 31;
        xnc0 xnc0Var = this.q;
        return Boolean.hashCode(this.r) + ((iHashCode4 + (xnc0Var != null ? xnc0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SportyLegendsUiState(topAppBarState=" + this.a + ", contentStatus=" + this.b + ", teamSelectScreenSnackbarUiText=" + this.c + ", marketGuideDialogState=" + this.d + ", confirmDialogState=" + this.e + ", submittingDialogState=" + this.f + ", createTicketErrorDialogState=" + this.g + ", genericErrorDialogState=" + this.h + ", noSelectionDialogState=" + this.i + ", removeAllSelectionDialogState=" + this.j + ", sportInactiveDialogState=" + this.k + ", unsavedBetBuilderDialogState=" + this.l + ", betslipChangeTeamDialogState=" + this.m + ", shouldShowExploreMoreBottomSheet=" + this.n + ", giftHintUiState=" + this.o + ", betBuilderTutorialBottomSheetState=" + this.p + ", matchingAnimationState=" + this.q + ", isHeadToHeadStatsButtonClicked=" + this.r + ")";
    }
}

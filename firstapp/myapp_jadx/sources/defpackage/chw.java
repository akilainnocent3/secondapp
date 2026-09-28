package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class chw {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final c330 h;
    public final dfw i;
    public final boolean j;
    public final c330 k;
    public final boolean l;

    public chw(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, c330 c330Var, dfw dfwVar, boolean z6, c330 c330Var2, boolean z7) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = c330Var;
        this.i = dfwVar;
        this.j = z6;
        this.k = c330Var2;
        this.l = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chw)) {
            return false;
        }
        chw chwVar = (chw) obj;
        return Intrinsics.g(this.a, chwVar.a) && Intrinsics.g(this.b, chwVar.b) && this.c == chwVar.c && this.d == chwVar.d && this.e == chwVar.e && this.f == chwVar.f && this.g == chwVar.g && Intrinsics.g(this.h, chwVar.h) && Intrinsics.g(this.i, chwVar.i) && this.j == chwVar.j && Intrinsics.g(this.k, chwVar.k) && this.l == chwVar.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + ((this.k.hashCode() + mtg0.a((this.i.hashCode() + ((this.h.hashCode() + mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31, 31, this.j)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("MultiMakerFooterUiState(selectionNum=", this.a, ", oddsNum=", this.b, ", isSpinEnabled=");
        nng.a(", isRemoveAllEnabled=", ", isLockOrUnlockAllEnabled=", sbA, this.c, this.d);
        nng.a(", isShowLockAll=", ", isAddSelectionsEnabled=", sbA, this.e, this.f);
        sbA.append(this.g);
        sbA.append(", addSelectionsButtonUiState=");
        sbA.append(this.h);
        sbA.append(", addSelectionsInputUiState=");
        sbA.append(this.i);
        sbA.append(", shouldShowHighLiabilityMsg=");
        sbA.append(this.j);
        sbA.append(", addToBetslipButtonUiState=");
        sbA.append(this.k);
        sbA.append(", isInfoAndActionsVisible=");
        sbA.append(this.l);
        sbA.append(")");
        return sbA.toString();
    }
}

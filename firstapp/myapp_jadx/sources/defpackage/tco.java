package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tco {
    public final fqo a;
    public final xao b;
    public final y9o c;
    public final lni0 d;
    public final lni0 e;
    public final zs f;
    public final rco g;

    public tco(fqo fqoVar, xao xaoVar, y9o y9oVar, lni0 lni0Var, lni0 lni0Var2, zs zsVar, rco rcoVar) {
        y9oVar.getClass();
        zsVar.getClass();
        this.a = fqoVar;
        this.b = xaoVar;
        this.c = y9oVar;
        this.d = lni0Var;
        this.e = lni0Var2;
        this.f = zsVar;
        this.g = rcoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tco)) {
            return false;
        }
        tco tcoVar = (tco) obj;
        return Intrinsics.g(this.a, tcoVar.a) && Intrinsics.g(this.b, tcoVar.b) && Intrinsics.g(this.c, tcoVar.c) && this.d == tcoVar.d && this.e == tcoVar.e && Intrinsics.g(this.f, tcoVar.f) && Intrinsics.g(this.g, tcoVar.g);
    }

    public final int hashCode() {
        fqo fqoVar = this.a;
        int iHashCode = (fqoVar == null ? 0 : fqoVar.hashCode()) * 31;
        xao xaoVar = this.b;
        int iA = sco.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (xaoVar == null ? 0 : xaoVar.hashCode())) * 31)) * 31)) * 31)) * 31, 31);
        rco rcoVar = this.g;
        return iA + (rcoVar != null ? rcoVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "InstantWinBetHistoryUiState(topAppBarState=" + this.a + ", filterBarState=" + this.b + ", contentStatus=" + this.c + ", moreDialogVisibilityState=" + this.d + ", kickOffLoadingVisibilityState=" + this.e + ", kickOffErrorDialogState=" + this.f + ", skipToResultState=" + this.g + ")";
    }
}

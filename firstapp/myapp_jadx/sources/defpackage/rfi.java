package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rfi {
    public final fqo a;
    public final obi b;
    public final xro c;

    public rfi(fqo fqoVar, obi obiVar, xro xroVar) {
        this.a = fqoVar;
        this.b = obiVar;
        this.c = xroVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfi)) {
            return false;
        }
        rfi rfiVar = (rfi) obj;
        return this.a.equals(rfiVar.a) && Intrinsics.g(this.b, rfiVar.b) && Intrinsics.g(this.c, rfiVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        obi obiVar = this.b;
        int iHashCode2 = (iHashCode + (obiVar == null ? 0 : obiVar.hashCode())) * 31;
        xro xroVar = this.c;
        return iHashCode2 + (xroVar != null ? xroVar.hashCode() : 0);
    }

    public final String toString() {
        return "FootballFamilySettlementUiState(topAppBarState=" + this.a + ", contentState=" + this.b + ", winningDialogUiState=" + this.c + ")";
    }
}

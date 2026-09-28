package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vmo implements koo {
    public final int a;
    public final gno b;
    public final poo c;
    public final loo d;

    public vmo(int i, gno gnoVar, poo pooVar, loo looVar) {
        this.a = i;
        this.b = gnoVar;
        this.c = pooVar;
        this.d = looVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmo)) {
            return false;
        }
        vmo vmoVar = (vmo) obj;
        return this.a == vmoVar.a && Intrinsics.g(this.b, vmoVar.b) && this.c.equals(vmoVar.c) && Intrinsics.g(this.d, vmoVar.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        gno gnoVar = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (gnoVar == null ? 0 : gnoVar.hashCode())) * 31)) * 31;
        loo looVar = this.d;
        return iHashCode2 + (looVar != null ? looVar.hashCode() : 0);
    }

    public final String toString() {
        return "InstantWinTicketDetailCommonSelectionContentState(backgroundColorResId=" + this.a + ", watermarkDrawable=" + this.b + ", itemState=" + this.c + ", descriptionState=" + this.d + ")";
    }
}

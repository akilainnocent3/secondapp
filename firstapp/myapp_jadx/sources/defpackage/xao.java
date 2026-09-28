package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xao {
    public final qcn<qco> a;
    public final pco b;
    public final yao c;
    public final boolean d;
    public final String e;

    public xao(qcn<qco> qcnVar, pco pcoVar, yao yaoVar, boolean z, String str) {
        qcnVar.getClass();
        pcoVar.getClass();
        this.a = qcnVar;
        this.b = pcoVar;
        this.c = yaoVar;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xao)) {
            return false;
        }
        xao xaoVar = (xao) obj;
        return Intrinsics.g(this.a, xaoVar.a) && this.b == xaoVar.b && Intrinsics.g(this.c, xaoVar.c) && this.d == xaoVar.d && Intrinsics.g(this.e, xaoVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        yao yaoVar = this.c;
        int iA = mtg0.a((iHashCode + (yaoVar == null ? 0 : yaoVar.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return iA + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantWinBetHistoryFilterBarState(settlementTypeButtonStates=");
        sb.append(this.a);
        sb.append(", selectedSettlementType=");
        sb.append(this.b);
        sb.append(", filterWinningState=");
        sb.append(this.c);
        sb.append(", shouldShowMoreIcon=");
        sb.append(this.d);
        sb.append(", dateRangeText=");
        return uf80.a(sb, this.e, ")");
    }
}

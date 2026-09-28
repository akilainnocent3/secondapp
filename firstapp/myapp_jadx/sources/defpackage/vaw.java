package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vaw {
    public final boolean a;
    public final Double b;
    public final int c;
    public final boolean d;

    public vaw(boolean z, Double d, int i, boolean z2) {
        this.a = z;
        this.b = d;
        this.c = i;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vaw)) {
            return false;
        }
        vaw vawVar = (vaw) obj;
        return this.a == vawVar.a && Intrinsics.g(this.b, vawVar.b) && this.c == vawVar.c && this.d == vawVar.d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Double d = this.b;
        return Boolean.hashCode(this.d) + gpp.a(this.c, (iHashCode + (d == null ? 0 : d.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "MultiLevelBetContainerBonusUiResult(multiLevelBonusRoundUiActive=" + this.a + ", stakeAmountMaxOverride=" + this.b + ", multiLevelBonusPercentageForBetUi=" + this.c + ", multiLevelBonusRoundBetLocked=" + this.d + ")";
    }
}

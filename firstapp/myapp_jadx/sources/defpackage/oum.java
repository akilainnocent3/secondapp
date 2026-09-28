package defpackage;

import com.sporty.android.core.model.loyalty.LoyaltyAggregateHintData;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class oum {
    public final boolean a;
    public final boolean b;
    public final krf0 c;
    public final LoyaltyAggregateHintData d;
    public final boolean e;
    public final boolean f;

    public oum(boolean z, boolean z2, krf0 krf0Var, LoyaltyAggregateHintData loyaltyAggregateHintData, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = krf0Var;
        this.d = loyaltyAggregateHintData;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oum)) {
            return false;
        }
        oum oumVar = (oum) obj;
        return this.a == oumVar.a && this.b == oumVar.b && this.c == oumVar.c && Intrinsics.g(this.d, oumVar.d) && this.e == oumVar.e && this.f == oumVar.f;
    }

    public final int hashCode() {
        int iA = mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        krf0 krf0Var = this.c;
        int iHashCode = (iA + (krf0Var == null ? 0 : krf0Var.hashCode())) * 31;
        LoyaltyAggregateHintData loyaltyAggregateHintData = this.d;
        return Boolean.hashCode(this.f) + mtg0.a((iHashCode + (loyaltyAggregateHintData != null ? loyaltyAggregateHintData.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("LoyaltyState(isEnabled=", ", isNew=", ", currentTier=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(", aggregateHintData=");
        sbA.append(this.d);
        sbA.append(", showMissionDialog=");
        return lng.a(oLsIjJCWb.hkfpOFfNYdmqDdG, ")", sbA, this.e, this.f);
    }
}

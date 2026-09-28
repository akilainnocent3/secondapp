package defpackage;

import com.sporty.android.core.model.loyalty.LoyaltyTierConfig;
import com.sporty.android.core.model.loyalty.UserTier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n0u {
    public final LoyaltyTierConfig a;
    public final UserTier b;

    public n0u(LoyaltyTierConfig loyaltyTierConfig, UserTier userTier) {
        loyaltyTierConfig.getClass();
        userTier.getClass();
        this.a = loyaltyTierConfig;
        this.b = userTier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0u)) {
            return false;
        }
        n0u n0uVar = (n0u) obj;
        return Intrinsics.g(this.a, n0uVar.a) && Intrinsics.g(this.b, n0uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LoyaltyTierInfo(allTiersConfig=" + this.a + ", currentUserTier=" + this.b + ")";
    }
}

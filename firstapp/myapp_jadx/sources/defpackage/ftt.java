package defpackage;

import com.sporty.android.core.model.loyalty.LoyaltyTierConfig;
import com.sporty.android.core.model.loyalty.UserTier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ftt {
    public final LoyaltyTierConfig a;
    public final UserTier b;

    public ftt(LoyaltyTierConfig loyaltyTierConfig, UserTier userTier) {
        loyaltyTierConfig.getClass();
        userTier.getClass();
        this.a = loyaltyTierConfig;
        this.b = userTier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftt)) {
            return false;
        }
        ftt fttVar = (ftt) obj;
        return Intrinsics.g(this.a, fttVar.a) && Intrinsics.g(this.b, fttVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LoyaltyHomeData(loyaltyTierConfig=" + this.a + ", userTier=" + this.b + ")";
    }
}

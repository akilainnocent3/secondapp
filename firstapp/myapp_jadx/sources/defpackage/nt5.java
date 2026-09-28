package defpackage;

import com.sporty.android.core.model.loyalty.LoyaltyTierConfig;
import com.sporty.android.core.model.loyalty.TierConfig;
import com.sporty.android.core.model.loyalty.UserTier;
import java.math.BigDecimal;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class nt5 {

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public final float a;
        public final boolean b;

        public a(float f, boolean z) {
            this.a = f;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "ProgressResult(progress=" + this.a + ", isUpgrade=" + this.b + ")";
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    public static a a(n0u n0uVar) {
        Object next;
        Object next2;
        boolean z;
        Long minLifeTimeWager;
        Long minMonthWager;
        n0uVar.getClass();
        LoyaltyTierConfig loyaltyTierConfig = n0uVar.a;
        UserTier userTier = n0uVar.b;
        boolean z2 = true;
        int currentTier = userTier.getCurrentTier() + 1;
        Iterator<T> it = loyaltyTierConfig.getTierConfigList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((TierConfig) next).getTier() != currentTier);
        TierConfig tierConfig = (TierConfig) next;
        if (tierConfig == null) {
            return new a(1.0f, false);
        }
        int currentTier2 = userTier.getCurrentTier();
        Iterator<T> it2 = loyaltyTierConfig.getTierConfigList().iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((TierConfig) next2).getTier() != currentTier2);
        TierConfig tierConfig2 = (TierConfig) next2;
        BigDecimal bigDecimalH = s5y.h(Long.valueOf(userTier.getPeriodWager()));
        Long minMonthWager2 = tierConfig.getMinMonthWager();
        BigDecimal bigDecimalH2 = minMonthWager2 != null ? s5y.h(minMonthWager2) : null;
        BigDecimal bigDecimalH3 = (tierConfig2 == null || (minMonthWager = tierConfig2.getMinMonthWager()) == null) ? null : s5y.h(minMonthWager);
        float fG = s5y.g(bigDecimalH, bigDecimalH2);
        if (bigDecimalH3 == null) {
            z = true;
        } else {
            if (userTier.getCurrentTier() == 0) {
                bigDecimalH3 = null;
            }
            if (bigDecimalH3 == null || bigDecimalH.compareTo(bigDecimalH3) >= 0 || !userTier.isProbation()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!userTier.getCcfEnough()) {
            fG = Math.min(fG, 0.95f);
        }
        BigDecimal bigDecimalH4 = s5y.h(Long.valueOf(userTier.getLifeWager()));
        Long minLifeTimeWager2 = tierConfig.getMinLifeTimeWager();
        BigDecimal bigDecimalH5 = minLifeTimeWager2 != null ? s5y.h(minLifeTimeWager2) : null;
        BigDecimal bigDecimalH6 = (tierConfig2 == null || (minLifeTimeWager = tierConfig2.getMinLifeTimeWager()) == null) ? null : s5y.h(minLifeTimeWager);
        if (bigDecimalH6 != null) {
            BigDecimal bigDecimal = userTier.getCurrentTier() != 0 ? bigDecimalH6 : null;
            if (bigDecimal != null && bigDecimalH4.compareTo(bigDecimal) < 0 && userTier.isProbation()) {
                z2 = false;
            }
        }
        float fG2 = s5y.g(bigDecimalH4, bigDecimalH5);
        float fMin = Math.min(fG, fG2);
        if (fG > fG2) {
            z = z2;
        }
        return new a(fMin, z);
    }
}

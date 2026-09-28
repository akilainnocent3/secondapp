package defpackage;

import com.sporty.android.core.model.EligibleActivity;
import com.sporty.android.core.model.PaydayPromoModalVariantDomain;
import com.sporty.android.core.model.marketingactivities.ActivityReward;
import com.sporty.android.core.model.marketingactivities.ActivityRewardGift;
import com.sporty.android.core.model.marketingactivities.EligibleActivityResponse;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class y5k {
    public static final EligibleActivity.PaydayGift a(EligibleActivityResponse eligibleActivityResponse, q500 q500Var) {
        ActivityReward activityReward;
        Object next;
        PaydayPromoModalVariantDomain paydayPromoModalVariantDomain;
        if (q500Var != q500.CONTROL && (activityReward = (ActivityReward) CollectionsKt.firstOrNull(eligibleActivityResponse.getRewardList())) != null) {
            Iterator<T> it = activityReward.getGifts().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ActivityRewardGift) next).getKind() != 3);
            ActivityRewardGift activityRewardGift = (ActivityRewardGift) next;
            if (activityRewardGift != null) {
                String minDepositCurrency = activityReward.getMinDepositCurrency();
                long minDepositAmount = activityReward.getMinDepositAmount();
                String currency = activityRewardGift.getCurrency();
                long value = activityRewardGift.getValue();
                long activityEndTime = eligibleActivityResponse.getActivityEndTime();
                int iOrdinal = q500Var.ordinal();
                if (iOrdinal == 1) {
                    paydayPromoModalVariantDomain = PaydayPromoModalVariantDomain.VARIANT_A;
                } else {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return null;
                    }
                    paydayPromoModalVariantDomain = PaydayPromoModalVariantDomain.VARIANT_B;
                }
                return new EligibleActivity.PaydayGift(minDepositCurrency, minDepositAmount, currency, value, activityEndTime, paydayPromoModalVariantDomain);
            }
        }
        return null;
    }
}

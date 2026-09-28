package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.loyalty.DobRewardType;
import com.sporty.android.core.model.loyalty.TierDobConfig;
import com.sporty.android.core.model.loyalty.TierDobReward;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class u5k {
    public static final /* synthetic */ int a = 0;

    public static final StringUiText a(TierDobConfig tierDobConfig, DobRewardType dobRewardType) {
        Object next;
        Iterator<T> it = tierDobConfig.getTierDobRewardList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((TierDobReward) next).getMappedDobRewardType() != dobRewardType);
        TierDobReward tierDobReward = (TierDobReward) next;
        if (tierDobReward == null) {
            return vch0.a;
        }
        String strA = oxc.a(tierDobReward.getCurrency(), " ", s5y.d(Double.valueOf(tierDobReward.getRewardAmount())));
        StringUiText stringUiText = vch0.a;
        return new StringUiText(strA);
    }
}

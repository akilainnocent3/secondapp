package defpackage;

import android.app.Activity;
import android.os.Parcelable;
import com.sporty.android.core.model.gift.GiftPurposeType;
import com.sporty.android.core.model.gift.GiftUsablePushData;
import com.sportybet.core.domain.model.ApplicableCategoryIds;
import com.sportybet.core.gift.domain.DobGift;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class xue {
    public final wue a;

    public xue(cc6 cc6Var, wue wueVar) {
        this.a = wueVar;
    }

    public final void a(Activity activity, GiftUsablePushData giftUsablePushData) {
        try {
            boolean z = giftUsablePushData.getMappedGiftPurposeType() == GiftPurposeType.DobVerified;
            double amount = giftUsablePushData.getAmount();
            String currency = giftUsablePushData.getCurrency();
            if (currency == null) {
                currency = "";
            }
            List<Integer> bizTypeScope = giftUsablePushData.getBizTypeScope();
            Parcelable.Creator<ApplicableCategoryIds> creator = ApplicableCategoryIds.CREATOR;
            bizTypeScope.getClass();
            this.a.d(activity, new DobGift(currency, z, amount, bizTypeScope));
        } catch (Exception e) {
            itf0.a.f(e, "Error processing DOB socket gift", new Object[0]);
        }
    }
}

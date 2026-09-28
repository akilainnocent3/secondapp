package defpackage;

import com.sportybet.feature.loyalty.impl.notifications.presentation.reward.LoyaltyRewardBottomSheetActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pvl extends py1 {
    public boolean a = false;

    public pvl() {
        addOnContextAvailableListener(new ovl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((cyt) generatedComponent()).J1((LoyaltyRewardBottomSheetActivity) this);
    }
}

package defpackage;

import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.LoyaltyMissionBottomSheetActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nvl extends py1 {
    public boolean a = false;

    public nvl() {
        addOnContextAvailableListener(new mvl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((qwt) generatedComponent()).o((LoyaltyMissionBottomSheetActivity) this);
    }
}

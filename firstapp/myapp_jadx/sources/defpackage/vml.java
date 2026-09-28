package defpackage;

import com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.BetslipThemeMissionBottomSheetActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vml extends py1 {
    public boolean a = false;

    public vml() {
        addOnContextAvailableListener(new uml(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((vx3) generatedComponent()).u((BetslipThemeMissionBottomSheetActivity) this);
    }
}

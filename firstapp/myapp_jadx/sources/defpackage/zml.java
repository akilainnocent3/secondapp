package defpackage;

import com.sportybet.feature.loyalty.impl.notifications.presentation.streakMission.BettingStreakMissionBottomSheetActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zml extends py1 {
    public boolean a = false;

    public zml() {
        addOnContextAvailableListener(new yml(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((h24) generatedComponent()).l1((BettingStreakMissionBottomSheetActivity) this);
    }
}

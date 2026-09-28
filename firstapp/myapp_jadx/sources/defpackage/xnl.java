package defpackage;

import com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.ChallengeAnnouncementBottomSheetActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xnl extends py1 {
    public boolean a = false;

    public xnl() {
        addOnContextAvailableListener(new wnl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((ax6) generatedComponent()).q0((ChallengeAnnouncementBottomSheetActivity) this);
    }
}

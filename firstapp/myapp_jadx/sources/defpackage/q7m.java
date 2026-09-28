package defpackage;

import com.sportybet.feature.loyalty.impl.welcomereward.WelcomeRewardBottomSheetActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q7m extends py1 {
    public boolean a = false;

    public q7m() {
        addOnContextAvailableListener(new p7m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((t1j0) generatedComponent()).v2((WelcomeRewardBottomSheetActivity) this);
    }
}

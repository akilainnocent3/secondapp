package defpackage;

import com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o7m extends py1 {
    public boolean a = false;

    public o7m() {
        addOnContextAvailableListener(new n7m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((b1j0) generatedComponent()).a1((WelcomeRewardActivity) this);
    }
}

package defpackage;

import com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xvl extends py1 {
    public boolean a = false;

    public xvl() {
        addOnContextAvailableListener(new wvl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((b5u) generatedComponent()).E2((LuckyNumberActivity) this);
    }
}

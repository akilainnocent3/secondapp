package defpackage;

import com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vnl extends py1 {
    public boolean a = false;

    public vnl() {
        addOnContextAvailableListener(new unl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((xw6) generatedComponent()).k2((ChallengeActivity) this);
    }
}

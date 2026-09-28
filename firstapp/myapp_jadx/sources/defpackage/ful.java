package defpackage;

import com.sportybet.feature.kyc.verifyfailed.KycVerifyFailedActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ful extends py1 {
    public boolean a = false;

    public ful() {
        addOnContextAvailableListener(new eul(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((pup) generatedComponent()).r((KycVerifyFailedActivity) this);
    }
}

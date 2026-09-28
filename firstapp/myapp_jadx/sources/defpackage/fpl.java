package defpackage;

import com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fpl extends py1 {
    public boolean a = false;

    public fpl() {
        addOnContextAvailableListener(new epl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((oqa) generatedComponent()).n1((ConfirmAccountInfoActivity) this);
    }
}

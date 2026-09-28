package defpackage;

import com.sportybet.android.payment.withdraw.presentation.activity.WithdrawKycAgentActivity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x7m extends pw40 {
    public boolean a = false;

    public x7m() {
        addOnContextAvailableListener(new w7m(this));
    }

    @Override // com.sportybet.android.account.b, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((lmj0) generatedComponent()).C((WithdrawKycAgentActivity) this);
    }
}

package defpackage;

import com.sportybet.android.ugpay.deposit.CommonDepositActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vol extends yz1 {
    public boolean d = false;

    public vol() {
        addOnContextAvailableListener(new uol(this));
    }

    @Override // com.sportybet.android.account.b, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.d) {
            return;
        }
        this.d = true;
        ((tc8) generatedComponent()).U1((CommonDepositActivity) this);
    }
}

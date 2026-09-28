package defpackage;

import com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bpl extends py1 {
    public boolean a = false;

    public bpl() {
        addOnContextAvailableListener(new apl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((fg8) generatedComponent()).i1((CommonMobileMoneyWithdrawActivity) this);
    }
}

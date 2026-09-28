package defpackage;

import com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class rzl extends py1 {
    public boolean a = false;

    public rzl() {
        addOnContextAvailableListener(new qzl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((fb10) generatedComponent()).l2((PixBtgWithdrawActivity) this);
    }
}

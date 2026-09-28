package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class mzl extends py1 {
    public boolean a = false;

    public mzl() {
        addOnContextAvailableListener(new lzl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((t610) generatedComponent()).G1((PixBtgDepositActivity) this);
    }
}

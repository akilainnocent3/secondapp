package defpackage;

import com.sportybet.android.globalpay.mobileMoney.CmMobileMoneyDepositActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class nol extends py1 {
    public boolean a = false;

    public nol() {
        addOnContextAvailableListener(new mol(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((fu7) generatedComponent()).W0((CmMobileMoneyDepositActivity) this);
    }
}

package defpackage;

import com.sportybet.android.globalpay.kyc.za.ZAKycAgentActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n8m extends pw40 {
    public boolean a = false;

    public n8m() {
        addOnContextAvailableListener(new m8m(this));
    }

    @Override // com.sportybet.android.account.b, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((p9k0) generatedComponent()).z2((ZAKycAgentActivity) this);
    }
}

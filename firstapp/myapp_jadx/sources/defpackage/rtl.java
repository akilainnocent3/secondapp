package defpackage;

import com.sportybet.android.user.kyc.KYCActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rtl extends i12 {
    public boolean i = false;

    public rtl() {
        addOnContextAvailableListener(new qtl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.i) {
            return;
        }
        this.i = true;
        ((whp) generatedComponent()).s0((KYCActivity) this);
    }
}

package defpackage;

import com.sportybet.feature.kyc.nin.NINVerificationActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nxl extends py1 {
    public boolean a = false;

    public nxl() {
        addOnContextAvailableListener(new mxl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((h5x) generatedComponent()).w0((NINVerificationActivity) this);
    }
}

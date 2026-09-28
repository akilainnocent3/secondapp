package defpackage;

import com.sportybet.feature.kyc.nin.NINVerificationDialogActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pxl extends ty1 {
    public boolean a = false;

    public pxl() {
        addOnContextAvailableListener(new oxl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((s5x) generatedComponent()).A2((NINVerificationDialogActivity) this);
    }
}

package defpackage;

import com.sportybet.feature.kyc.nin.NINReVerifyActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lxl extends ty1 {
    public boolean a = false;

    public lxl() {
        addOnContextAvailableListener(new kxl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((s4x) generatedComponent()).M1((NINReVerifyActivity) this);
    }
}

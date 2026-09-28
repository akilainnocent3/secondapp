package defpackage;

import com.sporty.android.platform.features.account.register.presentation.RegistrationSuccessfulActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l1m extends py1 {
    public boolean a = false;

    public l1m() {
        addOnContextAvailableListener(new k1m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((vx40) generatedComponent()).w((RegistrationSuccessfulActivity) this);
    }
}

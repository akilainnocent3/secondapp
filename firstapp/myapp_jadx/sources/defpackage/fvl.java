package defpackage;

import com.sporty.android.platform.features.security.newdevicelogin.loginalert.LoginAlertActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class fvl extends py1 {
    public boolean a = false;

    public fvl() {
        addOnContextAvailableListener(new evl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((xgt) generatedComponent()).t0((LoginAlertActivity) this);
    }
}

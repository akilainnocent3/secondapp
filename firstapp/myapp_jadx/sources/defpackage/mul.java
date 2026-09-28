package defpackage;

import com.sportybet.android.limits.base.limitBase.LimitsActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class mul extends e22 {
    public boolean f = false;

    public mul() {
        addOnContextAvailableListener(new lul(this));
    }

    @Override // defpackage.dml, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.f) {
            return;
        }
        this.f = true;
        ((cds) generatedComponent()).Z1((LimitsActivity) this);
    }
}

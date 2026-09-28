package defpackage;

import com.sportybet.android.limits.edit.EditLimitsActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class nql extends e22 {
    public boolean f = false;

    public nql() {
        addOnContextAvailableListener(new mql(this));
    }

    @Override // defpackage.dml, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.f) {
            return;
        }
        this.f = true;
        ((dqf) generatedComponent()).f2((EditLimitsActivity) this);
    }
}

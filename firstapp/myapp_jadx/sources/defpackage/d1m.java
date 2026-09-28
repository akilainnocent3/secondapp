package defpackage;

import com.sportybet.android.limits.reached.ReachedLimitsActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class d1m extends e22 {
    public boolean f = false;

    public d1m() {
        addOnContextAvailableListener(new c1m(this));
    }

    @Override // defpackage.dml, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.f) {
            return;
        }
        this.f = true;
        ((h140) generatedComponent()).v1((ReachedLimitsActivity) this);
    }
}

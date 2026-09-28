package defpackage;

import com.sportybet.feature.timeAlertReached.TimeAlertReachedActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d5m extends ty1 {
    public boolean a = false;

    public d5m() {
        addOnContextAvailableListener(new c5m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((fuf0) generatedComponent()).T1((TimeAlertReachedActivity) this);
    }
}

package defpackage;

import com.sportybet.android.openbet.presentation.activity.LiveOpenBetActivity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uul extends py1 {
    public boolean a = false;

    public uul() {
        addOnContextAvailableListener(new tul(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((eps) generatedComponent()).d((LiveOpenBetActivity) this);
    }
}

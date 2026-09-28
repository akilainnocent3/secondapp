package defpackage;

import com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.SportyTvRedirectActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q4m extends py1 {
    public boolean a = false;

    public q4m() {
        addOnContextAvailableListener(new p4m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((zed0) generatedComponent()).n((SportyTvRedirectActivity) this);
    }
}

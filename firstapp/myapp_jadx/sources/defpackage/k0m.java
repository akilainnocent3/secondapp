package defpackage;

import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k0m extends py1 {
    public boolean a = false;

    public k0m() {
        addOnContextAvailableListener(new j0m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((yl20) generatedComponent()).p((PreMatchSportActivity) this);
    }
}

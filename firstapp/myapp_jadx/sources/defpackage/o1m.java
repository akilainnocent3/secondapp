package defpackage;

import com.sportybet.feature.remixbet.presentation.RemixBetActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o1m extends py1 {
    public boolean a = false;

    public o1m() {
        addOnContextAvailableListener(new n1m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((t350) generatedComponent()).H1((RemixBetActivity) this);
    }
}

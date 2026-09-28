package defpackage;

import com.sportybet.plugin.realsports.activities.PrevBetHistoryActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class m0m extends py1 {
    public boolean a = false;

    public m0m() {
        addOnContextAvailableListener(new l0m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((rp20) generatedComponent()).q2((PrevBetHistoryActivity) this);
    }
}

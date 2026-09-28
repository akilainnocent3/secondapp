package defpackage;

import com.sportybet.plugin.realsports.activities.TransactionSearchActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class r5m extends py1 {
    public boolean a = false;

    public r5m() {
        addOnContextAvailableListener(new q5m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((uqg0) generatedComponent()).S0((TransactionSearchActivity) this);
    }
}

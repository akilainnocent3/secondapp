package defpackage;

import com.sportybet.android.transaction.ui.txdetails.TxDetailsActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e6m extends py1 {
    public boolean a = false;

    public e6m() {
        addOnContextAvailableListener(new d6m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((v1h0) generatedComponent()).h0((TxDetailsActivity) this);
    }
}

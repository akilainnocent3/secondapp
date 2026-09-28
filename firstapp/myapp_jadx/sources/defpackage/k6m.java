package defpackage;

import com.sportybet.android.transaction.ui.txlist.TxListActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k6m extends py1 {
    public boolean a = false;

    public k6m() {
        addOnContextAvailableListener(new j6m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((l7h0) generatedComponent()).m1((TxListActivity) this);
    }
}

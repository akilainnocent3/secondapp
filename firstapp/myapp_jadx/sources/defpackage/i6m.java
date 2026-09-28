package defpackage;

import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxFixStatusActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i6m extends py1 {
    public boolean a = false;

    public i6m() {
        addOnContextAvailableListener(new h6m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((o5h0) generatedComponent()).H2((TxFixStatusActivity) this);
    }
}

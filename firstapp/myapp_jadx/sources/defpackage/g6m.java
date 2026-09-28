package defpackage;

import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxDetailsV2Activity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g6m extends py1 {
    public boolean a = false;

    public g6m() {
        addOnContextAvailableListener(new f6m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((a4h0) generatedComponent()).S((TxDetailsV2Activity) this);
    }
}

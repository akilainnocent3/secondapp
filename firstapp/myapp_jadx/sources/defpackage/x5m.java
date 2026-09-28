package defpackage;

import com.sportybet.android.payment.security.nameconfirm.bvn.presentation.activity.TransferBvnActivity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x5m extends e5 {
    public boolean v = false;

    public x5m() {
        addOnContextAvailableListener(new w5m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.v) {
            return;
        }
        this.v = true;
        ((lrg0) generatedComponent()).K((TransferBvnActivity) this);
    }
}

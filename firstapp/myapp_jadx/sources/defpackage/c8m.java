package defpackage;

import com.sportybet.android.globalpay.stp.spei.withdraw.pending.WithdrawalPendingActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c8m extends py1 {
    public boolean a = false;

    public c8m() {
        addOnContextAvailableListener(new b8m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((qsj0) generatedComponent()).Z((WithdrawalPendingActivity) this);
    }
}

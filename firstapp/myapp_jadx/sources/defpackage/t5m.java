package defpackage;

import com.sportybet.android.basepay.TransactionSuccessActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class t5m extends py1 {
    public boolean a = false;

    public t5m() {
        addOnContextAvailableListener(new s5m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((wqg0) generatedComponent()).u1((TransactionSuccessActivity) this);
    }
}

package defpackage;

import com.sportybet.android.kepay.withdraw.KeWithdrawActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class vtl extends py1 {
    public boolean a = false;

    public vtl() {
        addOnContextAvailableListener(new utl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((zkp) generatedComponent()).N2((KeWithdrawActivity) this);
    }
}

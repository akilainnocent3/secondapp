package defpackage;

import com.sportybet.android.sportypin.WithdrawalPinActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e8m extends py1 {
    public boolean a = false;

    public e8m() {
        addOnContextAvailableListener(new d8m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((utj0) generatedComponent()).x1((WithdrawalPinActivity) this);
    }
}

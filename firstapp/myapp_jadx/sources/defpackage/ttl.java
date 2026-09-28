package defpackage;

import com.sportybet.android.kepay.deposit.KeDepositActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class ttl extends py1 {
    public boolean a = false;

    public ttl() {
        addOnContextAvailableListener(new stl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((lip) generatedComponent()).F0((KeDepositActivity) this);
    }
}

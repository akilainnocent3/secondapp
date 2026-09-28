package defpackage;

import com.sportybet.android.account.AccountActivationActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class kll extends py1 {
    public boolean a = false;

    public kll() {
        addOnContextAvailableListener(new jll(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((v7) generatedComponent()).e0((AccountActivationActivity) this);
    }
}

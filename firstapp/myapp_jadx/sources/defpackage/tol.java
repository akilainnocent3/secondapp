package defpackage;

import com.sportybet.android.account.confirm.activity.CommonConfirmNameActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class tol extends pw40 {
    public boolean a = false;

    public tol() {
        addOnContextAvailableListener(new sol(this));
    }

    @Override // com.sportybet.android.account.b, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((kc8) generatedComponent()).m0((CommonConfirmNameActivity) this);
    }
}

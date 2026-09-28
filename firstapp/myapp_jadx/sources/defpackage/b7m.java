package defpackage;

import com.sportybet.android.bvn.VerifyBvnWithdrawActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b7m extends e5 {
    public boolean v = false;

    public b7m() {
        addOnContextAvailableListener(new a7m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.v) {
            return;
        }
        this.v = true;
        ((pzh0) generatedComponent()).M((VerifyBvnWithdrawActivity) this);
    }
}

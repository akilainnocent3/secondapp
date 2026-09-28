package defpackage;

import com.sportybet.android.verifybet.VerifyBetActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class x6m extends py1 {
    public boolean a = false;

    public x6m() {
        addOnContextAvailableListener(new w6m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((qyh0) generatedComponent()).u2((VerifyBetActivity) this);
    }
}

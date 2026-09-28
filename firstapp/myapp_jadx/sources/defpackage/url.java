package defpackage;

import com.sportybet.android.globalpay.GlobalWithdrawActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class url extends szz {
    public boolean c = false;

    public url() {
        addOnContextAvailableListener(new trl(this));
    }

    @Override // defpackage.bzl, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.c) {
            return;
        }
        this.c = true;
        ((f3l) generatedComponent()).X((GlobalWithdrawActivity) this);
    }
}

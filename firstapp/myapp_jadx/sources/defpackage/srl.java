package defpackage;

import com.sportybet.android.globalpay.GlobalDepositActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class srl extends szz {
    public boolean c = false;

    public srl() {
        addOnContextAvailableListener(new rrl(this));
    }

    @Override // defpackage.bzl, com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.c) {
            return;
        }
        this.c = true;
        ((w0l) generatedComponent()).G2((GlobalDepositActivity) this);
    }
}

package defpackage;

import com.sportybet.android.ugpay.deposit.MedialOtherActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vwl extends py1 {
    public boolean a = false;

    public vwl() {
        addOnContextAvailableListener(new uwl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((ilv) generatedComponent()).X1((MedialOtherActivity) this);
    }
}

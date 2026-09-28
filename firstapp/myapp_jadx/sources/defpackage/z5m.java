package defpackage;

import com.sportybet.android.payment.security.sportypin.presentation.activity.TransferPinActivity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z5m extends py1 {
    public boolean a = false;

    public z5m() {
        addOnContextAvailableListener(new y5m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((urg0) generatedComponent()).b((TransferPinActivity) this);
    }
}

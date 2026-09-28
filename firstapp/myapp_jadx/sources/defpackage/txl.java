package defpackage;

import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.NameMismatchCSActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class txl extends py1 {
    public boolean a = false;

    public txl() {
        addOnContextAvailableListener(new sxl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((tcx) generatedComponent()).K1((NameMismatchCSActivity) this);
    }
}

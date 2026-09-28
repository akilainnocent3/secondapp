package defpackage;

import com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zyl extends py1 {
    public boolean a = false;

    public zyl() {
        addOnContextAvailableListener(new yyl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((utz) generatedComponent()).M2((PartnerWithdrawRequestDetailsActivity) this);
    }
}

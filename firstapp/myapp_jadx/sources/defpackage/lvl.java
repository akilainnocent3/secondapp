package defpackage;

import com.sporty.android.platform.features.loyalty.downgrade.LoyaltyDowngradeDialogActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lvl extends py1 {
    public boolean a = false;

    public lvl() {
        addOnContextAvailableListener(new kvl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((pst) generatedComponent()).D0((LoyaltyDowngradeDialogActivity) this);
    }
}

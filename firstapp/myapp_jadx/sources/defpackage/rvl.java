package defpackage;

import com.sporty.android.platform.features.loyalty.unlockedbottomsheet.LoyaltyUnlockedActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class rvl extends py1 {
    public boolean a = false;

    public rvl() {
        addOnContextAvailableListener(new qvl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((f1u) generatedComponent()).k1((LoyaltyUnlockedActivity) this);
    }
}

package defpackage;

import com.sporty.android.platform.features.loyalty.upgradedialog.LoyaltyUpgradeActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class tvl extends py1 {
    public boolean a = false;

    public tvl() {
        addOnContextAvailableListener(new svl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((q1u) generatedComponent()).z0((LoyaltyUpgradeActivity) this);
    }
}

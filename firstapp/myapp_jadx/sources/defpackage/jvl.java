package defpackage;

import com.sporty.android.platform.features.loyalty.LoyaltyActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class jvl extends py1 {
    public boolean a = false;

    public jvl() {
        addOnContextAvailableListener(new ivl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((lqt) generatedComponent()).V2((LoyaltyActivity) this);
    }
}

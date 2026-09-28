package defpackage;

import com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class p5m extends py1 {
    public boolean a = false;

    public p5m() {
        addOnContextAvailableListener(new o5m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((cpg0) generatedComponent()).B1((TradingActivity) this);
    }
}

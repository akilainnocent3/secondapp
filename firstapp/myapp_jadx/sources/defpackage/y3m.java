package defpackage;

import com.sportybet.android.instantwin.presentation.legendsrace.SportyLegendsSettlementActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class y3m extends py1 {
    public boolean a = false;

    public y3m() {
        addOnContextAvailableListener(new x3m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((hkc0) generatedComponent()).n0((SportyLegendsSettlementActivity) this);
    }
}

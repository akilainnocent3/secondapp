package defpackage;

import com.sportybet.android.instantwin.presentation.penaltysettlement.SportyPenaltySettlementActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i4m extends py1 {
    public boolean a = false;

    public i4m() {
        addOnContextAvailableListener(new h4m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((w1d0) generatedComponent()).N((SportyPenaltySettlementActivity) this);
    }
}

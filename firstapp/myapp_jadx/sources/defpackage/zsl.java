package defpackage;

import com.sportybet.android.instantwin.presentation.bethistory2.InstantWinBetHistoryActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zsl extends py1 {
    public boolean a = false;

    public zsl() {
        addOnContextAvailableListener(new ysl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((d9o) generatedComponent()).Y1((InstantWinBetHistoryActivity) this);
    }
}

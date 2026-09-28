package defpackage;

import com.sportybet.android.bethistory.presentation.activity.BetHistoryCalendarActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class mml extends py1 {
    public boolean a = false;

    public mml() {
        addOnContextAvailableListener(new lml(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((zp2) generatedComponent()).f0((BetHistoryCalendarActivity) this);
    }
}

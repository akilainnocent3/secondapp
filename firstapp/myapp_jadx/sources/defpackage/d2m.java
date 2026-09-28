package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.ScheduledFootballActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d2m extends py1 {
    public boolean a = false;

    public d2m() {
        addOnContextAvailableListener(new c2m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((yz60) generatedComponent()).O1((ScheduledFootballActivity) this);
    }
}

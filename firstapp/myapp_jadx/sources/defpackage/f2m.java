package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.ScheduledFootballOpenBetsActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class f2m extends py1 {
    public boolean a = false;

    public f2m() {
        addOnContextAvailableListener(new e2m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((ia70) generatedComponent()).i2((ScheduledFootballOpenBetsActivity) this);
    }
}

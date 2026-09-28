package defpackage;

import com.sportybet.android.instantwin.presentation.ticketdetail.InstantWinTicketDetailActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class etl extends py1 {
    public boolean a = false;

    public etl() {
        addOnContextAvailableListener(new dtl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((gmo) generatedComponent()).H0((InstantWinTicketDetailActivity) this);
    }
}

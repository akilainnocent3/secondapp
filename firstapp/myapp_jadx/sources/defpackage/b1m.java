package defpackage;

import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b1m extends py1 {
    public boolean a = false;

    public b1m() {
        addOnContextAvailableListener(new a1m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((yt30) generatedComponent()).y((RSportsBetTicketDetailsActivity) this);
    }
}

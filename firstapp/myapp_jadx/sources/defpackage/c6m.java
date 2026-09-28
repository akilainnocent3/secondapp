package defpackage;

import com.sportybet.android.transaction.ui.calendar.TxCalendarActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c6m extends py1 {
    public boolean a = false;

    public c6m() {
        addOnContextAvailableListener(new b6m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((t0h0) generatedComponent()).B2((TxCalendarActivity) this);
    }
}

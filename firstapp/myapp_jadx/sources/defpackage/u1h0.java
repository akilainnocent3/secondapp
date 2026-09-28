package defpackage;

import android.view.View;
import com.sportybet.android.transaction.ui.txdetails.TxDetailsActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class u1h0 implements View.OnClickListener {
    public final /* synthetic */ TxDetailsActivity a;

    public u1h0(TxDetailsActivity txDetailsActivity) {
        this.a = txDetailsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TxDetailsActivity txDetailsActivity = this.a;
        txDetailsActivity.d.b(txDetailsActivity, snb0.WITHDRAW);
    }
}

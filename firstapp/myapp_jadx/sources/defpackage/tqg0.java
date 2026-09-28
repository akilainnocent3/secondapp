package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.activities.TransactionSearchActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class tqg0 implements View.OnClickListener {
    public final /* synthetic */ TransactionSearchActivity a;

    public tqg0(TransactionSearchActivity transactionSearchActivity) {
        this.a = transactionSearchActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TransactionSearchActivity transactionSearchActivity = this.a;
        if ("history".equals(transactionSearchActivity.e.getTag())) {
            transactionSearchActivity.z1(1);
        } else {
            transactionSearchActivity.z1(0);
        }
    }
}

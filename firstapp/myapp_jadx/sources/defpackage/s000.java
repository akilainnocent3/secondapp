package defpackage;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s000 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_param_tx_category", aqg0.e.c.a);
        sh8.c().c(o7d.a(wae.ME_TRANSACTIONS), bundle);
    }
}

package defpackage;

import android.view.View;
import android.widget.TextView;
import com.sportybet.feature.payment.impl.paybill.ExclusiveOffersLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class bsr implements g6i0 {
    public final ExclusiveOffersLayout a;
    public final TextView b;

    public bsr(ExclusiveOffersLayout exclusiveOffersLayout, TextView textView) {
        this.a = exclusiveOffersLayout;
        this.b = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.feature.payment.impl.paybill.ExclusiveOffersLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ctr implements g6i0 {
    public final ConstraintLayout a;
    public final View b;
    public final ExclusiveOffersLayout c;
    public final TextView d;

    public ctr(ConstraintLayout constraintLayout, View view, ExclusiveOffersLayout exclusiveOffersLayout, TextView textView) {
        this.a = constraintLayout;
        this.b = view;
        this.c = exclusiveOffersLayout;
        this.d = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

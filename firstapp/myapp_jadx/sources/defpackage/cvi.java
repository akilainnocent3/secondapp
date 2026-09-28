package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.feature.payment.impl.paybill.ExclusiveOffersLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class cvi implements g6i0 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final LinearLayout f;
    public final View i;
    public final ExclusiveOffersLayout v;
    public final LinearLayout w;
    public final TextView y;

    public cvi(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, ImageView imageView, LinearLayout linearLayout3, View view, ExclusiveOffersLayout exclusiveOffersLayout, LinearLayout linearLayout4, TextView textView3) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = textView;
        this.d = textView2;
        this.e = imageView;
        this.f = linearLayout3;
        this.i = view;
        this.v = exclusiveOffersLayout;
        this.w = linearLayout4;
        this.y = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

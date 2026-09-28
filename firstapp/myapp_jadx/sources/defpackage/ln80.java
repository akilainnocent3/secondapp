package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ln80 implements g6i0 {
    public final CardView a;
    public final TextView b;
    public final TextView c;
    public final ConstraintLayout d;
    public final TextView e;
    public final TextView f;
    public final TextView i;
    public final LinearLayout v;
    public final TextView w;

    public ln80(CardView cardView, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout, TextView textView6) {
        this.a = cardView;
        this.b = textView;
        this.c = textView2;
        this.d = constraintLayout;
        this.e = textView3;
        this.f = textView4;
        this.i = textView5;
        this.v = linearLayout;
        this.w = textView6;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

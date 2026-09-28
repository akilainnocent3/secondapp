package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class st implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final RecyclerView c;
    public final TextView d;
    public final CardView e;
    public final TextView f;
    public final TextView i;
    public final TextView v;
    public final TextView w;

    public st(ConstraintLayout constraintLayout, TextView textView, RecyclerView recyclerView, TextView textView2, CardView cardView, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = recyclerView;
        this.d = textView2;
        this.e = cardView;
        this.f = textView3;
        this.i = textView4;
        this.v = textView5;
        this.w = textView6;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

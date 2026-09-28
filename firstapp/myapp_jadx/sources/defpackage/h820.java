package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class h820 implements g6i0 {
    public final TextView A;
    public final ConstraintLayout B;
    public final CardView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final View f;
    public final View i;
    public final RecyclerView v;
    public final FlexboxLayout w;
    public final TextView y;
    public final TextView z;

    public h820(CardView cardView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view, View view2, RecyclerView recyclerView, FlexboxLayout flexboxLayout, TextView textView5, TextView textView6, TextView textView7, ConstraintLayout constraintLayout) {
        this.a = cardView;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
        this.f = view;
        this.i = view2;
        this.v = recyclerView;
        this.w = flexboxLayout;
        this.y = textView5;
        this.z = textView6;
        this.A = textView7;
        this.B = constraintLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

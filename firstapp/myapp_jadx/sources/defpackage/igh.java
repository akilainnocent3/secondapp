package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.widget.OutcomeButton;

/* JADX INFO: loaded from: classes7.dex */
public final class igh implements g6i0 {
    public final TextView A;
    public final RecyclerView B;
    public final TextView C;
    public final View D;
    public final View E;
    public final ConstraintLayout a;
    public final OutcomeButton b;
    public final AppCompatImageView c;
    public final AppCompatImageView d;
    public final AppCompatImageView e;
    public final AppCompatImageView f;
    public final AppCompatImageView i;
    public final AppCompatImageView v;
    public final AppCompatImageView w;
    public final AppCompatImageView y;
    public final TextView z;

    public igh(ConstraintLayout constraintLayout, OutcomeButton outcomeButton, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, AppCompatImageView appCompatImageView6, AppCompatImageView appCompatImageView7, AppCompatImageView appCompatImageView8, TextView textView, TextView textView2, RecyclerView recyclerView, TextView textView3, View view, View view2) {
        this.a = constraintLayout;
        this.b = outcomeButton;
        this.c = appCompatImageView;
        this.d = appCompatImageView2;
        this.e = appCompatImageView3;
        this.f = appCompatImageView4;
        this.i = appCompatImageView5;
        this.v = appCompatImageView6;
        this.w = appCompatImageView7;
        this.y = appCompatImageView8;
        this.z = textView;
        this.A = textView2;
        this.B = recyclerView;
        this.C = textView3;
        this.D = view;
        this.E = view2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

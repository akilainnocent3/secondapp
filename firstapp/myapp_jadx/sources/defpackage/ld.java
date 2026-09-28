package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.outrights.SearchMarketView;
import com.sportybet.plugin.realsports.widget.PreMatchSpinnerTextView;

/* JADX INFO: loaded from: classes7.dex */
public final class ld implements g6i0 {
    public final View A;
    public final ConstraintLayout a;
    public final View b;
    public final PreMatchSpinnerTextView c;
    public final View d;
    public final LoadingView e;
    public final View f;
    public final View i;
    public final RecyclerView v;
    public final RecyclerView w;
    public final SearchMarketView y;
    public final ij90 z;

    public ld(ConstraintLayout constraintLayout, View view, PreMatchSpinnerTextView preMatchSpinnerTextView, View view2, LoadingView loadingView, View view3, View view4, RecyclerView recyclerView, RecyclerView recyclerView2, SearchMarketView searchMarketView, ij90 ij90Var, View view5) {
        this.a = constraintLayout;
        this.b = view;
        this.c = preMatchSpinnerTextView;
        this.d = view2;
        this.e = loadingView;
        this.f = view3;
        this.i = view4;
        this.v = recyclerView;
        this.w = recyclerView2;
        this.y = searchMarketView;
        this.z = ij90Var;
        this.A = view5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.realsports.widget.ProgressLoadingView;

/* JADX INFO: loaded from: classes5.dex */
public final class zfd0 implements g6i0 {
    public final ConstraintLayout a;
    public final ProgressButton b;
    public final TextView c;
    public final LoadingView d;
    public final ProgressLoadingView e;
    public final RecyclerView f;
    public final SwipeRefreshLayout i;
    public final TextView v;

    public zfd0(ConstraintLayout constraintLayout, ProgressButton progressButton, TextView textView, LoadingView loadingView, ProgressLoadingView progressLoadingView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextView textView2) {
        this.a = constraintLayout;
        this.b = progressButton;
        this.c = textView;
        this.d = loadingView;
        this.e = progressLoadingView;
        this.f = recyclerView;
        this.i = swipeRefreshLayout;
        this.v = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

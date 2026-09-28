package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.LoadingView;

/* JADX INFO: loaded from: classes7.dex */
public final class fgd0 implements g6i0 {
    public final ComposeView A;
    public final ComposeView B;
    public final ConstraintLayout a;
    public final ComposeView b;
    public final View c;
    public final ComposeView d;
    public final BubbleView e;
    public final LoadingView f;
    public final ComposeView i;
    public final SwipeRefreshLayout v;
    public final TabLayout w;
    public final View y;
    public final ComposeView z;

    public fgd0(ConstraintLayout constraintLayout, ij90 ij90Var, ComposeView composeView, View view, ComposeView composeView2, BubbleView bubbleView, LoadingView loadingView, ComposeView composeView3, SwipeRefreshLayout swipeRefreshLayout, TabLayout tabLayout, View view2, ComposeView composeView4, ComposeView composeView5, ComposeView composeView6) {
        this.a = constraintLayout;
        this.b = composeView;
        this.c = view;
        this.d = composeView2;
        this.e = bubbleView;
        this.f = loadingView;
        this.i = composeView3;
        this.v = swipeRefreshLayout;
        this.w = tabLayout;
        this.y = view2;
        this.z = composeView4;
        this.A = composeView5;
        this.B = composeView6;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

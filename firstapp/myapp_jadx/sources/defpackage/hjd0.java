package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.prematch.widget.InterceptConsecutiveScrollerLayout;
import com.sportybet.plugin.realsports.prematch.widget.LiveEventsRecyclerView;
import com.sportybet.plugin.realsports.prematch.widget.LiveTogglesContainer;
import com.sportybet.plugin.realsports.prematch.widget.MarketsTabs;
import com.sportybet.plugin.realsports.prematch.widget.PreMatchFiltersContainer;

/* JADX INFO: loaded from: classes7.dex */
public final class hjd0 implements g6i0 {
    public final LiveEventsRecyclerView A;
    public final LiveTogglesContainer B;
    public final View C;
    public final View D;
    public final BubbleView E;
    public final MarketsTabs F;
    public final OneUpTwoUpSwitch G;
    public final OUEarlyGoalsSwitch H;
    public final SwipeRefreshLayout I;
    public final InterceptConsecutiveScrollerLayout J;
    public final View K;
    public final ij90 L;
    public final LoadingView M;
    public final RecyclerView N;
    public final ConstraintLayout a;
    public final TabLayout b;
    public final PreMatchFiltersContainer c;
    public final View d;
    public final LoadingView e;
    public final View f;
    public final BubbleView i;
    public final MarketsTabs v;
    public final gid0 w;
    public final OneUpTwoUpSwitch y;
    public final OUEarlyGoalsSwitch z;

    public hjd0(ConstraintLayout constraintLayout, TabLayout tabLayout, PreMatchFiltersContainer preMatchFiltersContainer, View view, LoadingView loadingView, View view2, BubbleView bubbleView, MarketsTabs marketsTabs, gid0 gid0Var, OneUpTwoUpSwitch oneUpTwoUpSwitch, OUEarlyGoalsSwitch oUEarlyGoalsSwitch, LiveEventsRecyclerView liveEventsRecyclerView, LiveTogglesContainer liveTogglesContainer, View view3, View view4, BubbleView bubbleView2, MarketsTabs marketsTabs2, OneUpTwoUpSwitch oneUpTwoUpSwitch2, OUEarlyGoalsSwitch oUEarlyGoalsSwitch2, SwipeRefreshLayout swipeRefreshLayout, InterceptConsecutiveScrollerLayout interceptConsecutiveScrollerLayout, View view5, ij90 ij90Var, LoadingView loadingView2, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = tabLayout;
        this.c = preMatchFiltersContainer;
        this.d = view;
        this.e = loadingView;
        this.f = view2;
        this.i = bubbleView;
        this.v = marketsTabs;
        this.w = gid0Var;
        this.y = oneUpTwoUpSwitch;
        this.z = oUEarlyGoalsSwitch;
        this.A = liveEventsRecyclerView;
        this.B = liveTogglesContainer;
        this.C = view3;
        this.D = view4;
        this.E = bubbleView2;
        this.F = marketsTabs2;
        this.G = oneUpTwoUpSwitch2;
        this.H = oUEarlyGoalsSwitch2;
        this.I = swipeRefreshLayout;
        this.J = interceptConsecutiveScrollerLayout;
        this.K = view5;
        this.L = ij90Var;
        this.M = loadingView2;
        this.N = recyclerView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

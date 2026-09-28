package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common_ui.widgets.SmoothScrollViewPager;
import com.sportybet.android.instantwin.presentation.widget.ActionBar;
import com.sportybet.android.instantwin.presentation.widget.PlaceBetButtonLayout;
import com.sportybet.android.virtual.presentation.widget.InstantWinQuickBetView;
import com.sportybet.android.widget.LoadingView;

/* JADX INFO: loaded from: classes5.dex */
public final class cd implements g6i0 {
    public final ComposeView A;
    public final ComposeView B;
    public final ComposeView C;
    public final FrameLayout D;
    public final LoadingView E;
    public final TabLayout F;
    public final InstantWinQuickBetView G;
    public final SmoothScrollViewPager H;
    public final ConstraintLayout a;
    public final ActionBar b;
    public final PlaceBetButtonLayout c;
    public final ComposeView d;
    public final ComposeView e;
    public final ComposeView f;
    public final ComposeView i;
    public final ComposeView v;
    public final ComposeView w;
    public final ComposeView y;
    public final ComposeView z;

    public cd(ConstraintLayout constraintLayout, ActionBar actionBar, PlaceBetButtonLayout placeBetButtonLayout, ComposeView composeView, ComposeView composeView2, ComposeView composeView3, ComposeView composeView4, ComposeView composeView5, ComposeView composeView6, ComposeView composeView7, ComposeView composeView8, ComposeView composeView9, ComposeView composeView10, ComposeView composeView11, FrameLayout frameLayout, LoadingView loadingView, TabLayout tabLayout, InstantWinQuickBetView instantWinQuickBetView, SmoothScrollViewPager smoothScrollViewPager) {
        this.a = constraintLayout;
        this.b = actionBar;
        this.c = placeBetButtonLayout;
        this.d = composeView;
        this.e = composeView2;
        this.f = composeView3;
        this.i = composeView4;
        this.v = composeView5;
        this.w = composeView6;
        this.y = composeView7;
        this.z = composeView8;
        this.A = composeView9;
        this.B = composeView10;
        this.C = composeView11;
        this.D = frameLayout;
        this.E = loadingView;
        this.F = tabLayout;
        this.G = instantWinQuickBetView;
        this.H = smoothScrollViewPager;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

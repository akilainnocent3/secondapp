package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.instantwin.presentation.widget.ActionBar;
import com.sportybet.android.instantwin.presentation.widget.PlaceBetButtonLayout;
import com.sportybet.android.virtual.presentation.widget.InstantWinQuickBetView;
import com.sportybet.android.widget.LoadingView;

/* JADX INFO: loaded from: classes5.dex */
public final class bd implements g6i0 {
    public final ComposeView A;
    public final ComposeView B;
    public final FrameLayout C;
    public final LoadingView D;
    public final PlaceBetButtonLayout E;
    public final InstantWinQuickBetView F;
    public final RecyclerView G;
    public final TabLayout H;
    public final View I;
    public final ViewPager2 J;
    public final ConstraintLayout a;
    public final ActionBar b;
    public final ComposeView c;
    public final ComposeView d;
    public final ComposeView e;
    public final ComposeView f;
    public final ComposeView i;
    public final ComposeView v;
    public final ComposeView w;
    public final ComposeView y;
    public final ComposeView z;

    public bd(ConstraintLayout constraintLayout, ActionBar actionBar, ComposeView composeView, ComposeView composeView2, ComposeView composeView3, ComposeView composeView4, ComposeView composeView5, ComposeView composeView6, ComposeView composeView7, ComposeView composeView8, ComposeView composeView9, ComposeView composeView10, ComposeView composeView11, FrameLayout frameLayout, LoadingView loadingView, PlaceBetButtonLayout placeBetButtonLayout, InstantWinQuickBetView instantWinQuickBetView, RecyclerView recyclerView, TabLayout tabLayout, View view, ViewPager2 viewPager2) {
        this.a = constraintLayout;
        this.b = actionBar;
        this.c = composeView;
        this.d = composeView2;
        this.e = composeView3;
        this.f = composeView4;
        this.i = composeView5;
        this.v = composeView6;
        this.w = composeView7;
        this.y = composeView8;
        this.z = composeView9;
        this.A = composeView10;
        this.B = composeView11;
        this.C = frameLayout;
        this.D = loadingView;
        this.E = placeBetButtonLayout;
        this.F = instantWinQuickBetView;
        this.G = recyclerView;
        this.H = tabLayout;
        this.I = view;
        this.J = viewPager2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

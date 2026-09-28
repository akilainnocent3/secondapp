package defpackage;

import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.game.agent.FeaturedGamesRouter;
import com.sportybet.android.instantwin.presentation.buildandgo.FeaturedInstantVirtualView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.feature.luckynumber.featurematch.presentation.LuckyNumberFeatureMatchView;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer;

/* JADX INFO: loaded from: classes7.dex */
public final class ydh implements g6i0 {
    public final FeaturedContainer a;
    public final AppCompatImageView b;
    public final ViewPager2 c;
    public final FeaturedGamesRouter d;
    public final TabLayout e;
    public final FeaturedInstantVirtualView f;
    public final LoadingView i;
    public final ViewPager2 v;
    public final RecyclerView w;
    public final View y;
    public final ViewFlipper z;

    public ydh(FeaturedContainer featuredContainer, AppCompatImageView appCompatImageView, ViewPager2 viewPager2, FeaturedGamesRouter featuredGamesRouter, LuckyNumberFeatureMatchView luckyNumberFeatureMatchView, TabLayout tabLayout, FeaturedInstantVirtualView featuredInstantVirtualView, LoadingView loadingView, ViewPager2 viewPager3, RecyclerView recyclerView, TextView textView, View view, ViewFlipper viewFlipper) {
        this.a = featuredContainer;
        this.b = appCompatImageView;
        this.c = viewPager2;
        this.d = featuredGamesRouter;
        this.e = tabLayout;
        this.f = featuredInstantVirtualView;
        this.i = loadingView;
        this.v = viewPager3;
        this.w = recyclerView;
        this.y = view;
        this.z = viewFlipper;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

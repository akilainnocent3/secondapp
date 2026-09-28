package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import im.delight.android.webview.AdvancedWebView;

/* JADX INFO: loaded from: classes5.dex */
public final class meb0 implements g6i0 {
    public final PlayerView A;
    public final RecyclerView B;
    public final TextView C;
    public final gfb0 D;
    public final AdvancedWebView E;
    public final ConstraintLayout a;
    public final ij90 b;
    public final AppBarLayout c;
    public final TextView d;
    public final AppCompatImageView e;
    public final TextView f;
    public final View i;
    public final TabLayout v;
    public final zeb0 w;
    public final bfb0 y;
    public final NestedScrollView z;

    public meb0(ConstraintLayout constraintLayout, ij90 ij90Var, AppBarLayout appBarLayout, TextView textView, AppCompatImageView appCompatImageView, TextView textView2, View view, TabLayout tabLayout, TextView textView3, zeb0 zeb0Var, bfb0 bfb0Var, NestedScrollView nestedScrollView, PlayerView playerView, RecyclerView recyclerView, TextView textView4, gfb0 gfb0Var, AdvancedWebView advancedWebView) {
        this.a = constraintLayout;
        this.b = ij90Var;
        this.c = appBarLayout;
        this.d = textView;
        this.e = appCompatImageView;
        this.f = textView2;
        this.i = view;
        this.v = tabLayout;
        this.w = zeb0Var;
        this.y = bfb0Var;
        this.z = nestedScrollView;
        this.A = playerView;
        this.B = recyclerView;
        this.C = textView4;
        this.D = gfb0Var;
        this.E = advancedWebView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

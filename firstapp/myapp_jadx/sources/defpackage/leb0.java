package defpackage;

import android.view.View;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class leb0 implements g6i0 {
    public final CoordinatorLayout a;
    public final AppBarLayout b;
    public final TabLayout c;
    public final zeb0 d;
    public final bfb0 e;
    public final RecyclerView f;
    public final SwipeRefreshLayout i;
    public final WebView v;

    public leb0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, TabLayout tabLayout, zeb0 zeb0Var, bfb0 bfb0Var, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, WebView webView) {
        this.a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = tabLayout;
        this.d = zeb0Var;
        this.e = bfb0Var;
        this.f = recyclerView;
        this.i = swipeRefreshLayout;
        this.v = webView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

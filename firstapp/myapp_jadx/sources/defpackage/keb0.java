package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import im.delight.android.webview.AdvancedWebView;

/* JADX INFO: loaded from: classes5.dex */
public final class keb0 implements g6i0 {
    public final NestedScrollView A;
    public final AppCompatImageView B;
    public final RecyclerView C;
    public final TextView D;
    public final AdvancedWebView E;
    public final ConstraintLayout a;
    public final ij90 b;
    public final AppBarLayout c;
    public final AppCompatImageView d;
    public final TextView e;
    public final AppCompatImageView f;
    public final TextView i;
    public final View v;
    public final TabLayout w;
    public final zeb0 y;
    public final bfb0 z;

    public keb0(ConstraintLayout constraintLayout, ij90 ij90Var, AppBarLayout appBarLayout, AppCompatImageView appCompatImageView, TextView textView, AppCompatImageView appCompatImageView2, TextView textView2, View view, TabLayout tabLayout, zeb0 zeb0Var, bfb0 bfb0Var, NestedScrollView nestedScrollView, AppCompatImageView appCompatImageView3, RecyclerView recyclerView, TextView textView3, AdvancedWebView advancedWebView) {
        this.a = constraintLayout;
        this.b = ij90Var;
        this.c = appBarLayout;
        this.d = appCompatImageView;
        this.e = textView;
        this.f = appCompatImageView2;
        this.i = textView2;
        this.v = view;
        this.w = tabLayout;
        this.y = zeb0Var;
        this.z = bfb0Var;
        this.A = nestedScrollView;
        this.B = appCompatImageView3;
        this.C = recyclerView;
        this.D = textView3;
        this.E = advancedWebView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

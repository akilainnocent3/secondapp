package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class oeb0 implements g6i0 {
    public final RecyclerView A;
    public final AppCompatImageView B;
    public final SwipeRefreshLayout C;
    public final TextView D;
    public final gfb0 E;
    public final ConstraintLayout a;
    public final TextView b;
    public final View c;
    public final TabLayout d;
    public final View e;
    public final afb0 f;
    public final yeb0 i;
    public final afb0 v;
    public final TextView w;
    public final PlayerView y;
    public final LinearLayout z;

    public oeb0(ConstraintLayout constraintLayout, TextView textView, View view, TabLayout tabLayout, TextView textView2, View view2, afb0 afb0Var, yeb0 yeb0Var, afb0 afb0Var2, TextView textView3, PlayerView playerView, LinearLayout linearLayout, RecyclerView recyclerView, AppCompatImageView appCompatImageView, SwipeRefreshLayout swipeRefreshLayout, TextView textView4, gfb0 gfb0Var) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = view;
        this.d = tabLayout;
        this.e = view2;
        this.f = afb0Var;
        this.i = yeb0Var;
        this.v = afb0Var2;
        this.w = textView3;
        this.y = playerView;
        this.z = linearLayout;
        this.A = recyclerView;
        this.B = appCompatImageView;
        this.C = swipeRefreshLayout;
        this.D = textView4;
        this.E = gfb0Var;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

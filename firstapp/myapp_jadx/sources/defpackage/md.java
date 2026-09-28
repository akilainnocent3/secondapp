package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.LoadingViewNew;

/* JADX INFO: loaded from: classes6.dex */
public final class md implements g6i0 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final RecyclerView D;
    public final SwipeRefreshLayout E;
    public final TextView F;
    public final TextView G;
    public final ConstraintLayout a;
    public final TextView b;
    public final ImageButton c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final ImageButton i;
    public final LoadingViewNew v;
    public final ComposeView w;
    public final LoadingViewNew y;
    public final TextView z;

    public md(ConstraintLayout constraintLayout, TextView textView, ImageButton imageButton, TextView textView2, TextView textView3, TextView textView4, ImageButton imageButton2, LoadingViewNew loadingViewNew, ComposeView composeView, LoadingViewNew loadingViewNew2, TextView textView5, TextView textView6, TextView textView7, TextView textView8, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextView textView9, TextView textView10) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = imageButton;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.i = imageButton2;
        this.v = loadingViewNew;
        this.w = composeView;
        this.y = loadingViewNew2;
        this.z = textView5;
        this.A = textView6;
        this.B = textView7;
        this.C = textView8;
        this.D = recyclerView;
        this.E = swipeRefreshLayout;
        this.F = textView9;
        this.G = textView10;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class lxi implements g6i0 {
    public final SwipeRefreshLayout A;
    public final TextView B;
    public final View C;
    public final ComposeView D;
    public final ComposeView E;
    public final ConstraintLayout a;
    public final Button b;
    public final Button c;
    public final Button d;
    public final Button e;
    public final Button f;
    public final ImageView i;
    public final LinearLayout v;
    public final veb0 w;
    public final ProgressBar y;
    public final RecyclerView z;

    public lxi(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, Button button4, Button button5, ImageView imageView, LinearLayout linearLayout, veb0 veb0Var, ProgressBar progressBar, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextView textView, View view, ComposeView composeView, ComposeView composeView2) {
        this.a = constraintLayout;
        this.b = button;
        this.c = button2;
        this.d = button3;
        this.e = button4;
        this.f = button5;
        this.i = imageView;
        this.v = linearLayout;
        this.w = veb0Var;
        this.y = progressBar;
        this.z = recyclerView;
        this.A = swipeRefreshLayout;
        this.B = textView;
        this.C = view;
        this.D = composeView;
        this.E = composeView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

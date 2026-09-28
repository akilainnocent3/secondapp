package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;

/* JADX INFO: loaded from: classes6.dex */
public final class bzi implements g6i0 {
    public final TextView A;
    public final LoadingViewNew B;
    public final ComposeView C;
    public final LoadingViewNew D;
    public final FrameLayout E;
    public final ClearEditText F;
    public final TextView G;
    public final ProgressButton H;
    public final TextView I;
    public final SwipeRefreshLayout J;
    public final ConstraintLayout K;
    public final ProgressButton L;
    public final LinearLayout M;
    public final TextView N;
    public final AspectRatioImageView O;
    public final TextView P;
    public final TextView Q;
    public final AppCompatImageView R;
    public final TextView S;
    public final FrameLayout a;
    public final ClearEditText b;
    public final TextView c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final TextView i;
    public final TextView v;
    public final TextView w;
    public final LinearLayout y;
    public final SimpleDescriptionListView z;

    public bzi(FrameLayout frameLayout, ClearEditText clearEditText, TextView textView, TextView textView2, FrameLayout frameLayout2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout, SimpleDescriptionListView simpleDescriptionListView, TextView textView7, LoadingViewNew loadingViewNew, ComposeView composeView, LoadingViewNew loadingViewNew2, FrameLayout frameLayout3, ClearEditText clearEditText2, TextView textView8, ProgressButton progressButton, TextView textView9, SwipeRefreshLayout swipeRefreshLayout, ConstraintLayout constraintLayout, ProgressButton progressButton2, LinearLayout linearLayout2, TextView textView10, AspectRatioImageView aspectRatioImageView, TextView textView11, TextView textView12, AppCompatImageView appCompatImageView, TextView textView13) {
        this.a = frameLayout;
        this.b = clearEditText;
        this.c = textView;
        this.d = textView2;
        this.e = frameLayout2;
        this.f = textView3;
        this.i = textView4;
        this.v = textView5;
        this.w = textView6;
        this.y = linearLayout;
        this.z = simpleDescriptionListView;
        this.A = textView7;
        this.B = loadingViewNew;
        this.C = composeView;
        this.D = loadingViewNew2;
        this.E = frameLayout3;
        this.F = clearEditText2;
        this.G = textView8;
        this.H = progressButton;
        this.I = textView9;
        this.J = swipeRefreshLayout;
        this.K = constraintLayout;
        this.L = progressButton2;
        this.M = linearLayout2;
        this.N = textView10;
        this.O = aspectRatioImageView;
        this.P = textView11;
        this.Q = textView12;
        this.R = appCompatImageView;
        this.S = textView13;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

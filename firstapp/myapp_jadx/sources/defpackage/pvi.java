package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CombEditText;
import com.sporty.android.common_ui.widgets.CombText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;

/* JADX INFO: loaded from: classes5.dex */
public final class pvi implements g6i0 {
    public final TextView A;
    public final CombText B;
    public final TextView C;
    public final SimpleDescriptionListView D;
    public final LoadingViewNew E;
    public final ComposeView F;
    public final HintView G;
    public final LoadingViewNew H;
    public final ProgressButton I;
    public final SwipeRefreshLayout J;
    public final FrameLayout K;
    public final HintView L;
    public final TextView M;
    public final TextView N;
    public final AppCompatImageView O;
    public final FrameLayout a;
    public final CombEditText b;
    public final ComposeView c;
    public final TextView d;
    public final TextView e;
    public final HintView f;
    public final ClearEditText i;
    public final TextView v;
    public final TextView w;
    public final FrameLayout y;
    public final TextView z;

    public pvi(FrameLayout frameLayout, CombEditText combEditText, ComposeView composeView, TextView textView, TextView textView2, HintView hintView, ClearEditText clearEditText, TextView textView3, TextView textView4, FrameLayout frameLayout2, TextView textView5, TextView textView6, CombText combText, TextView textView7, SimpleDescriptionListView simpleDescriptionListView, LoadingViewNew loadingViewNew, ComposeView composeView2, HintView hintView2, LoadingViewNew loadingViewNew2, ProgressButton progressButton, SwipeRefreshLayout swipeRefreshLayout, FrameLayout frameLayout3, HintView hintView3, TextView textView8, TextView textView9, AppCompatImageView appCompatImageView) {
        this.a = frameLayout;
        this.b = combEditText;
        this.c = composeView;
        this.d = textView;
        this.e = textView2;
        this.f = hintView;
        this.i = clearEditText;
        this.v = textView3;
        this.w = textView4;
        this.y = frameLayout2;
        this.z = textView5;
        this.A = textView6;
        this.B = combText;
        this.C = textView7;
        this.D = simpleDescriptionListView;
        this.E = loadingViewNew;
        this.F = composeView2;
        this.G = hintView2;
        this.H = loadingViewNew2;
        this.I = progressButton;
        this.J = swipeRefreshLayout;
        this.K = frameLayout3;
        this.L = hintView3;
        this.M = textView8;
        this.N = textView9;
        this.O = appCompatImageView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

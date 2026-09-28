package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CombEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.AmountQuickAddingButtonGroup;

/* JADX INFO: loaded from: classes6.dex */
public final class jvi implements g6i0 {
    public final AmountQuickAddingButtonGroup A;
    public final ComposeView B;
    public final ConstraintLayout C;
    public final zrr D;
    public final SimpleDescriptionListView E;
    public final AppCompatImageView F;
    public final HintView G;
    public final LoadingViewNew H;
    public final ComposeView I;
    public final LoadingViewNew J;
    public final BubbleView K;
    public final ProgressButton L;
    public final RecyclerView M;
    public final HintView N;
    public final SwipeRefreshLayout O;
    public final TextView P;
    public final WebView Q;
    public final FrameLayout a;
    public final ClearEditText b;
    public final TextView c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final TextView i;
    public final FlexboxLayout v;
    public final ComposeView w;
    public final CombEditText y;
    public final TextView z;

    public jvi(FrameLayout frameLayout, ClearEditText clearEditText, TextView textView, TextView textView2, FrameLayout frameLayout2, TextView textView3, TextView textView4, FlexboxLayout flexboxLayout, ComposeView composeView, CombEditText combEditText, TextView textView5, AmountQuickAddingButtonGroup amountQuickAddingButtonGroup, ComposeView composeView2, ConstraintLayout constraintLayout, zrr zrrVar, SimpleDescriptionListView simpleDescriptionListView, AppCompatImageView appCompatImageView, HintView hintView, LoadingViewNew loadingViewNew, ComposeView composeView3, LoadingViewNew loadingViewNew2, BubbleView bubbleView, ProgressButton progressButton, RecyclerView recyclerView, HintView hintView2, SwipeRefreshLayout swipeRefreshLayout, TextView textView6, WebView webView) {
        this.a = frameLayout;
        this.b = clearEditText;
        this.c = textView;
        this.d = textView2;
        this.e = frameLayout2;
        this.f = textView3;
        this.i = textView4;
        this.v = flexboxLayout;
        this.w = composeView;
        this.y = combEditText;
        this.z = textView5;
        this.A = amountQuickAddingButtonGroup;
        this.B = composeView2;
        this.C = constraintLayout;
        this.D = zrrVar;
        this.E = simpleDescriptionListView;
        this.F = appCompatImageView;
        this.G = hintView;
        this.H = loadingViewNew;
        this.I = composeView3;
        this.J = loadingViewNew2;
        this.K = bubbleView;
        this.L = progressButton;
        this.M = recyclerView;
        this.N = hintView2;
        this.O = swipeRefreshLayout;
        this.P = textView6;
        this.Q = webView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

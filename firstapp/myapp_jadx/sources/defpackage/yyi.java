package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.IconTextSelectorButton;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;

/* JADX INFO: loaded from: classes6.dex */
public final class yyi implements g6i0 {
    public final LoadingViewNew A;
    public final ComposeView B;
    public final LoadingViewNew C;
    public final IconTextSelectorButton D;
    public final ProgressButton E;
    public final SwipeRefreshLayout F;
    public final TextView G;
    public final ComposeView H;
    public final AspectRatioImageView I;
    public final TextView J;
    public final TextView K;
    public final AppCompatImageView L;
    public final FrameLayout a;
    public final ClearEditText b;
    public final TextView c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final TextView i;
    public final IconTextSelectorButton v;
    public final ComposeView w;
    public final SimpleDescriptionListView y;
    public final HintView z;

    public yyi(FrameLayout frameLayout, ClearEditText clearEditText, TextView textView, TextView textView2, FrameLayout frameLayout2, TextView textView3, TextView textView4, IconTextSelectorButton iconTextSelectorButton, ComposeView composeView, SimpleDescriptionListView simpleDescriptionListView, HintView hintView, LoadingViewNew loadingViewNew, ComposeView composeView2, LoadingViewNew loadingViewNew2, IconTextSelectorButton iconTextSelectorButton2, ProgressButton progressButton, SwipeRefreshLayout swipeRefreshLayout, TextView textView5, ComposeView composeView3, AspectRatioImageView aspectRatioImageView, TextView textView6, TextView textView7, AppCompatImageView appCompatImageView) {
        this.a = frameLayout;
        this.b = clearEditText;
        this.c = textView;
        this.d = textView2;
        this.e = frameLayout2;
        this.f = textView3;
        this.i = textView4;
        this.v = iconTextSelectorButton;
        this.w = composeView;
        this.y = simpleDescriptionListView;
        this.z = hintView;
        this.A = loadingViewNew;
        this.B = composeView2;
        this.C = loadingViewNew2;
        this.D = iconTextSelectorButton2;
        this.E = progressButton;
        this.F = swipeRefreshLayout;
        this.G = textView5;
        this.H = composeView3;
        this.I = aspectRatioImageView;
        this.J = textView6;
        this.K = textView7;
        this.L = appCompatImageView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

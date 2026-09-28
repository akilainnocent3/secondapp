package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CombEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;

/* JADX INFO: loaded from: classes6.dex */
public final class azi implements g6i0 {
    public final LoadingViewNew A;
    public final ProgressButton B;
    public final CombEditText C;
    public final TextView D;
    public final TextView E;
    public final SwipeRefreshLayout F;
    public final TextView G;
    public final AspectRatioImageView H;
    public final FrameLayout a;
    public final ClearEditText b;
    public final TextView c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final TextView i;
    public final SimpleDescriptionListView v;
    public final HintView w;
    public final LoadingViewNew y;
    public final ComposeView z;

    public azi(FrameLayout frameLayout, ClearEditText clearEditText, TextView textView, TextView textView2, FrameLayout frameLayout2, TextView textView3, TextView textView4, SimpleDescriptionListView simpleDescriptionListView, HintView hintView, LoadingViewNew loadingViewNew, ComposeView composeView, LoadingViewNew loadingViewNew2, ProgressButton progressButton, CombEditText combEditText, TextView textView5, TextView textView6, SwipeRefreshLayout swipeRefreshLayout, TextView textView7, AspectRatioImageView aspectRatioImageView) {
        this.a = frameLayout;
        this.b = clearEditText;
        this.c = textView;
        this.d = textView2;
        this.e = frameLayout2;
        this.f = textView3;
        this.i = textView4;
        this.v = simpleDescriptionListView;
        this.w = hintView;
        this.y = loadingViewNew;
        this.z = composeView;
        this.A = loadingViewNew2;
        this.B = progressButton;
        this.C = combEditText;
        this.D = textView5;
        this.E = textView6;
        this.F = swipeRefreshLayout;
        this.G = textView7;
        this.H = aspectRatioImageView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

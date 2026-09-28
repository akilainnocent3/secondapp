package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CombEditText;
import com.sporty.android.common_ui.widgets.CombText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;

/* JADX INFO: loaded from: classes6.dex */
public final class ovi implements g6i0 {
    public final ComposeView A;
    public final SimpleDescriptionListView B;
    public final HintView C;
    public final LoadingViewNew D;
    public final ComposeView E;
    public final LoadingViewNew F;
    public final ProgressButton G;
    public final HintView H;
    public final SwipeRefreshLayout I;
    public final FrameLayout J;
    public final FrameLayout a;
    public final CombEditText b;
    public final TextView c;
    public final ClearEditText d;
    public final TextView e;
    public final TextView f;
    public final FrameLayout i;
    public final TextView v;
    public final TextView w;
    public final CombText y;
    public final TextView z;

    public ovi(FrameLayout frameLayout, CombEditText combEditText, TextView textView, ClearEditText clearEditText, TextView textView2, TextView textView3, FrameLayout frameLayout2, TextView textView4, TextView textView5, CombText combText, TextView textView6, ComposeView composeView, SimpleDescriptionListView simpleDescriptionListView, HintView hintView, LoadingViewNew loadingViewNew, ComposeView composeView2, LoadingViewNew loadingViewNew2, ProgressButton progressButton, HintView hintView2, SwipeRefreshLayout swipeRefreshLayout, FrameLayout frameLayout3) {
        this.a = frameLayout;
        this.b = combEditText;
        this.c = textView;
        this.d = clearEditText;
        this.e = textView2;
        this.f = textView3;
        this.i = frameLayout2;
        this.v = textView4;
        this.w = textView5;
        this.y = combText;
        this.z = textView6;
        this.A = composeView;
        this.B = simpleDescriptionListView;
        this.C = hintView;
        this.D = loadingViewNew;
        this.E = composeView2;
        this.F = loadingViewNew2;
        this.G = progressButton;
        this.H = hintView2;
        this.I = swipeRefreshLayout;
        this.J = frameLayout3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

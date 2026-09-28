package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.widget.HintView;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.AmountQuickAddingButtonGroup;

/* JADX INFO: loaded from: classes6.dex */
public final class ivi implements g6i0 {
    public final ComposeView A;
    public final LoadingViewNew B;
    public final ComposeView C;
    public final ComposeView D;
    public final ComposeView E;
    public final SwipeRefreshLayout F;
    public final FrameLayout a;
    public final ClearEditText b;
    public final TextView c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final TextView i;
    public final AmountQuickAddingButtonGroup v;
    public final HintView w;
    public final ComposeView y;
    public final LoadingViewNew z;

    public ivi(FrameLayout frameLayout, ClearEditText clearEditText, TextView textView, TextView textView2, FrameLayout frameLayout2, TextView textView3, TextView textView4, AmountQuickAddingButtonGroup amountQuickAddingButtonGroup, HintView hintView, ComposeView composeView, LoadingViewNew loadingViewNew, ComposeView composeView2, LoadingViewNew loadingViewNew2, ComposeView composeView3, ComposeView composeView4, ComposeView composeView5, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = frameLayout;
        this.b = clearEditText;
        this.c = textView;
        this.d = textView2;
        this.e = frameLayout2;
        this.f = textView3;
        this.i = textView4;
        this.v = amountQuickAddingButtonGroup;
        this.w = hintView;
        this.y = composeView;
        this.z = loadingViewNew;
        this.A = composeView2;
        this.B = loadingViewNew2;
        this.C = composeView3;
        this.D = composeView4;
        this.E = composeView5;
        this.F = swipeRefreshLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

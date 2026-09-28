package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.IconTextSelectorButton;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.AmountQuickAddingButtonGroup;

/* JADX INFO: loaded from: classes6.dex */
public final class nvi implements g6i0 {
    public final SimpleDescriptionListView A;
    public final HintView B;
    public final LoadingViewNew C;
    public final ComposeView D;
    public final LoadingViewNew E;
    public final IconTextSelectorButton F;
    public final BubbleView G;
    public final ProgressButton H;
    public final SwipeRefreshLayout I;
    public final FrameLayout a;
    public final ClearEditText b;
    public final TextView c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final TextView i;
    public final IconTextSelectorButton v;
    public final ComposeView w;
    public final AmountQuickAddingButtonGroup y;
    public final ComposeView z;

    public nvi(FrameLayout frameLayout, ClearEditText clearEditText, TextView textView, TextView textView2, FrameLayout frameLayout2, TextView textView3, TextView textView4, IconTextSelectorButton iconTextSelectorButton, ComposeView composeView, AmountQuickAddingButtonGroup amountQuickAddingButtonGroup, ComposeView composeView2, SimpleDescriptionListView simpleDescriptionListView, HintView hintView, LoadingViewNew loadingViewNew, ComposeView composeView3, LoadingViewNew loadingViewNew2, IconTextSelectorButton iconTextSelectorButton2, BubbleView bubbleView, ProgressButton progressButton, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = frameLayout;
        this.b = clearEditText;
        this.c = textView;
        this.d = textView2;
        this.e = frameLayout2;
        this.f = textView3;
        this.i = textView4;
        this.v = iconTextSelectorButton;
        this.w = composeView;
        this.y = amountQuickAddingButtonGroup;
        this.z = composeView2;
        this.A = simpleDescriptionListView;
        this.B = hintView;
        this.C = loadingViewNew;
        this.D = composeView3;
        this.E = loadingViewNew2;
        this.F = iconTextSelectorButton2;
        this.G = bubbleView;
        this.H = progressButton;
        this.I = swipeRefreshLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

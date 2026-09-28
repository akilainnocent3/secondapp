package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.AmountQuickAddingButtonGroup;

/* JADX INFO: loaded from: classes6.dex */
public final class mvi implements g6i0 {
    public final HintView A;
    public final LoadingViewNew B;
    public final ComposeView C;
    public final LoadingViewNew D;
    public final ProgressButton E;
    public final LinearLayoutCompat F;
    public final AppCompatImageView G;
    public final AppCompatTextView H;
    public final ConstraintLayout I;
    public final AppCompatTextView J;
    public final LinearLayoutCompat K;
    public final AppCompatImageView L;
    public final AppCompatTextView M;
    public final SwipeRefreshLayout N;
    public final AppCompatImageView O;
    public final FrameLayout a;
    public final ClearEditText b;
    public final TextView c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final TextView i;
    public final AppCompatImageView v;
    public final AmountQuickAddingButtonGroup w;
    public final ComposeView y;
    public final SimpleDescriptionListView z;

    public mvi(FrameLayout frameLayout, ClearEditText clearEditText, TextView textView, TextView textView2, FrameLayout frameLayout2, TextView textView3, TextView textView4, AppCompatImageView appCompatImageView, AmountQuickAddingButtonGroup amountQuickAddingButtonGroup, ComposeView composeView, SimpleDescriptionListView simpleDescriptionListView, HintView hintView, LoadingViewNew loadingViewNew, ComposeView composeView2, LoadingViewNew loadingViewNew2, ProgressButton progressButton, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView2, LinearLayoutCompat linearLayoutCompat2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView3, SwipeRefreshLayout swipeRefreshLayout, AppCompatImageView appCompatImageView4) {
        this.a = frameLayout;
        this.b = clearEditText;
        this.c = textView;
        this.d = textView2;
        this.e = frameLayout2;
        this.f = textView3;
        this.i = textView4;
        this.v = appCompatImageView;
        this.w = amountQuickAddingButtonGroup;
        this.y = composeView;
        this.z = simpleDescriptionListView;
        this.A = hintView;
        this.B = loadingViewNew;
        this.C = composeView2;
        this.D = loadingViewNew2;
        this.E = progressButton;
        this.F = linearLayoutCompat;
        this.G = appCompatImageView2;
        this.H = appCompatTextView;
        this.I = constraintLayout;
        this.J = appCompatTextView2;
        this.K = linearLayoutCompat2;
        this.L = appCompatImageView3;
        this.M = appCompatTextView3;
        this.N = swipeRefreshLayout;
        this.O = appCompatImageView4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

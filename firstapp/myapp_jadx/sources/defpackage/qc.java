package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.IconTextSelectorButton;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes4.dex */
public final class qc implements g6i0 {
    public final TextView A;
    public final TextView B;
    public final ImageButton C;
    public final TextView D;
    public final ImageButton E;
    public final LoadingViewNew F;
    public final ComposeView G;
    public final IconTextSelectorButton H;
    public final ProgressButton I;
    public final SwipeRefreshLayout J;
    public final LinearLayout K;
    public final AspectRatioImageView L;
    public final ComposeView M;
    public final TextView N;
    public final AppCompatImageView O;
    public final TextView P;
    public final ConstraintLayout a;
    public final ClearEditText b;
    public final TextView c;
    public final TextView d;
    public final ImageButton e;
    public final TextView f;
    public final TextView i;
    public final IconTextSelectorButton v;
    public final LinearLayout w;
    public final RelativeLayout y;
    public final TextView z;

    public qc(ConstraintLayout constraintLayout, ClearEditText clearEditText, TextView textView, TextView textView2, ImageButton imageButton, TextView textView3, TextView textView4, IconTextSelectorButton iconTextSelectorButton, LinearLayout linearLayout, RelativeLayout relativeLayout, TextView textView5, TextView textView6, TextView textView7, ImageButton imageButton2, TextView textView8, ImageButton imageButton3, LoadingViewNew loadingViewNew, ComposeView composeView, IconTextSelectorButton iconTextSelectorButton2, ProgressButton progressButton, SwipeRefreshLayout swipeRefreshLayout, LinearLayout linearLayout2, AspectRatioImageView aspectRatioImageView, ComposeView composeView2, TextView textView9, AppCompatImageView appCompatImageView, TextView textView10) {
        this.a = constraintLayout;
        this.b = clearEditText;
        this.c = textView;
        this.d = textView2;
        this.e = imageButton;
        this.f = textView3;
        this.i = textView4;
        this.v = iconTextSelectorButton;
        this.w = linearLayout;
        this.y = relativeLayout;
        this.z = textView5;
        this.A = textView6;
        this.B = textView7;
        this.C = imageButton2;
        this.D = textView8;
        this.E = imageButton3;
        this.F = loadingViewNew;
        this.G = composeView;
        this.H = iconTextSelectorButton2;
        this.I = progressButton;
        this.J = swipeRefreshLayout;
        this.K = linearLayout2;
        this.L = aspectRatioImageView;
        this.M = composeView2;
        this.N = textView9;
        this.O = appCompatImageView;
        this.P = textView10;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

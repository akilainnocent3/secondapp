package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.realsports.widget.ClearEditText;

/* JADX INFO: loaded from: classes5.dex */
public final class cwi implements g6i0 {
    public final ImageView A;
    public final ConstraintLayout B;
    public final TextView C;
    public final LoadingViewNew D;
    public final ComposeView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final ClearEditText c;
    public final TextView d;
    public final ProgressButton e;
    public final TextView f;
    public final ImageView i;
    public final ConstraintLayout v;
    public final ConstraintLayout w;
    public final ImageView y;
    public final ImageView z;

    public cwi(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ClearEditText clearEditText, TextView textView, ProgressButton progressButton, TextView textView2, ImageView imageView, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout5, TextView textView3, LoadingViewNew loadingViewNew, ComposeView composeView, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = clearEditText;
        this.d = textView;
        this.e = progressButton;
        this.f = textView2;
        this.i = imageView;
        this.v = constraintLayout3;
        this.w = constraintLayout4;
        this.y = imageView2;
        this.z = imageView3;
        this.A = imageView4;
        this.B = constraintLayout5;
        this.C = textView3;
        this.D = loadingViewNew;
        this.E = composeView;
        this.F = textView4;
        this.G = textView5;
        this.H = textView6;
        this.I = textView7;
        this.J = textView8;
        this.K = textView9;
        this.L = textView10;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.user.LineTextViewPanel;
import com.sportybet.android.user.kyc.banner.KYCBanner;
import com.sportybet.android.widget.LoadingView;

/* JADX INFO: loaded from: classes5.dex */
public final class oui implements g6i0 {
    public final LoadingView A;
    public final LineTextViewPanel B;
    public final ComposeView C;
    public final ScrollView D;
    public final ComposeView E;
    public final ComposeView F;
    public final LoadingView G;
    public final ComposeView H;
    public final ComposeView I;
    public final ComposeView J;
    public final ComposeView K;
    public final ImageView L;
    public final View M;
    public final TextView N;
    public final LineTextViewPanel O;
    public final LineTextViewPanel P;
    public final RelativeLayout a;
    public final ConstraintLayout b;
    public final ImageButton c;
    public final ComposeView d;
    public final LineTextViewPanel e;
    public final LineTextViewPanel f;
    public final ImageButton i;
    public final KYCBanner v;
    public final ConstraintLayout w;
    public final LineTextViewPanel y;
    public final LineTextViewPanel z;

    public oui(RelativeLayout relativeLayout, ConstraintLayout constraintLayout, ImageButton imageButton, ComposeView composeView, LineTextViewPanel lineTextViewPanel, LineTextViewPanel lineTextViewPanel2, ImageButton imageButton2, KYCBanner kYCBanner, ConstraintLayout constraintLayout2, LineTextViewPanel lineTextViewPanel3, LineTextViewPanel lineTextViewPanel4, LoadingView loadingView, LineTextViewPanel lineTextViewPanel5, ComposeView composeView2, ScrollView scrollView, ComposeView composeView3, ComposeView composeView4, LoadingView loadingView2, ComposeView composeView5, ComposeView composeView6, ComposeView composeView7, ComposeView composeView8, ImageView imageView, View view, TextView textView, LineTextViewPanel lineTextViewPanel6, LineTextViewPanel lineTextViewPanel7) {
        this.a = relativeLayout;
        this.b = constraintLayout;
        this.c = imageButton;
        this.d = composeView;
        this.e = lineTextViewPanel;
        this.f = lineTextViewPanel2;
        this.i = imageButton2;
        this.v = kYCBanner;
        this.w = constraintLayout2;
        this.y = lineTextViewPanel3;
        this.z = lineTextViewPanel4;
        this.A = loadingView;
        this.B = lineTextViewPanel5;
        this.C = composeView2;
        this.D = scrollView;
        this.E = composeView3;
        this.F = composeView4;
        this.G = loadingView2;
        this.H = composeView5;
        this.I = composeView6;
        this.J = composeView7;
        this.K = composeView8;
        this.L = imageView;
        this.M = view;
        this.N = textView;
        this.O = lineTextViewPanel6;
        this.P = lineTextViewPanel7;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

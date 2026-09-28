package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.cashoutphase3.widget.CashoutLiveEventControlsHeaderView;
import com.sportybet.android.cashoutphase3.widget.LiveMatchTrackerView;
import com.sportybet.android.cashoutphase3.widget.STVPlayerView;
import com.sportybet.plugin.event.view.LiveEventMatchWebView;

/* JADX INFO: loaded from: classes5.dex */
public final class fhd0 implements g6i0 {
    public final LiveMatchTrackerView A;
    public final LinearLayout B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final ComposeView F;
    public final TextView G;
    public final TextView H;
    public final ImageView I;
    public final ImageView J;
    public final STVPlayerView K;
    public final TextView L;
    public final TextView M;
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final ImageView d;
    public final ComposeView e;
    public final nrr f;
    public final ImageView i;
    public final CashoutLiveEventControlsHeaderView v;
    public final TextView w;
    public final tp6 y;
    public final LiveEventMatchWebView z;

    public fhd0(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, ComposeView composeView, nrr nrrVar, ImageView imageView3, CashoutLiveEventControlsHeaderView cashoutLiveEventControlsHeaderView, TextView textView2, tp6 tp6Var, LiveEventMatchWebView liveEventMatchWebView, LiveMatchTrackerView liveMatchTrackerView, LinearLayout linearLayout, TextView textView3, TextView textView4, TextView textView5, ComposeView composeView2, TextView textView6, TextView textView7, ImageView imageView4, ImageView imageView5, STVPlayerView sTVPlayerView, TextView textView8, TextView textView9) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = imageView2;
        this.e = composeView;
        this.f = nrrVar;
        this.i = imageView3;
        this.v = cashoutLiveEventControlsHeaderView;
        this.w = textView2;
        this.y = tp6Var;
        this.z = liveEventMatchWebView;
        this.A = liveMatchTrackerView;
        this.B = linearLayout;
        this.C = textView3;
        this.D = textView4;
        this.E = textView5;
        this.F = composeView2;
        this.G = textView6;
        this.H = textView7;
        this.I = imageView4;
        this.J = imageView5;
        this.K = sTVPlayerView;
        this.L = textView8;
        this.M = textView9;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

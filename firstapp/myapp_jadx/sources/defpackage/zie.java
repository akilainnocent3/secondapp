package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewpager2.widget.ViewPager2;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.common_ui.widgets.GenericPairButton;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.bookingcode.presentation.activity.CustomCodeComposeUtil;

/* JADX INFO: loaded from: classes7.dex */
public final class zie implements g6i0 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final ComposeView F;
    public final LoadingViewNew G;
    public final ComposeView H;
    public final ComposeView I;
    public final TextView J;
    public final TextView K;
    public final ComposeView L;
    public final AppCompatTextView M;
    public final TextView N;
    public final GenericPairButton O;
    public final ComposeView P;
    public final ComposeView Q;
    public final LinearLayout R;
    public final TextView S;
    public final ProgressBar T;
    public final ComposeView U;
    public final View V;
    public final Group W;
    public final ConstraintLayout X;
    public final f2p Y;
    public final Group Z;
    public final ConstraintLayout a;
    public final ViewPager2 a0;
    public final AspectRatioImageView b;
    public final TextView b0;
    public final ImageView c;
    public final ConstraintLayout c0;
    public final LinearLayout d;
    public final ImageView d0;
    public final TextView e;
    public final ProgressBar e0;
    public final TextView f;
    public final View f0;
    public final ktr g0;
    public final TextView h0;
    public final CustomCodeComposeUtil i;
    public final TextView i0;
    public final TextView j0;
    public final TextView k0;
    public final TextView l0;
    public final ImageView v;
    public final TextView w;
    public final TextView y;
    public final TextView z;

    public zie(ConstraintLayout constraintLayout, AspectRatioImageView aspectRatioImageView, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, CustomCodeComposeUtil customCodeComposeUtil, ImageView imageView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, ComposeView composeView, LoadingViewNew loadingViewNew, ComposeView composeView2, ComposeView composeView3, TextView textView11, TextView textView12, ComposeView composeView4, AppCompatTextView appCompatTextView, TextView textView13, GenericPairButton genericPairButton, ComposeView composeView5, ComposeView composeView6, LinearLayout linearLayout2, TextView textView14, ProgressBar progressBar, ComposeView composeView7, View view, Group group, ConstraintLayout constraintLayout2, f2p f2pVar, Group group2, ViewPager2 viewPager2, TextView textView15, ConstraintLayout constraintLayout3, ImageView imageView3, ProgressBar progressBar2, View view2, ktr ktrVar, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20) {
        this.a = constraintLayout;
        this.b = aspectRatioImageView;
        this.c = imageView;
        this.d = linearLayout;
        this.e = textView;
        this.f = textView2;
        this.i = customCodeComposeUtil;
        this.v = imageView2;
        this.w = textView3;
        this.y = textView4;
        this.z = textView5;
        this.A = textView6;
        this.B = textView7;
        this.C = textView8;
        this.D = textView9;
        this.E = textView10;
        this.F = composeView;
        this.G = loadingViewNew;
        this.H = composeView2;
        this.I = composeView3;
        this.J = textView11;
        this.K = textView12;
        this.L = composeView4;
        this.M = appCompatTextView;
        this.N = textView13;
        this.O = genericPairButton;
        this.P = composeView5;
        this.Q = composeView6;
        this.R = linearLayout2;
        this.S = textView14;
        this.T = progressBar;
        this.U = composeView7;
        this.V = view;
        this.W = group;
        this.X = constraintLayout2;
        this.Y = f2pVar;
        this.Z = group2;
        this.a0 = viewPager2;
        this.b0 = textView15;
        this.c0 = constraintLayout3;
        this.d0 = imageView3;
        this.e0 = progressBar2;
        this.f0 = view2;
        this.g0 = ktrVar;
        this.h0 = textView16;
        this.i0 = textView17;
        this.j0 = textView18;
        this.k0 = textView19;
        this.l0 = textView20;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

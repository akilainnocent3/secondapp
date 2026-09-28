package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sporty.android.common_ui.widgets.CommonButton;

/* JADX INFO: loaded from: classes6.dex */
public final class bf implements g6i0 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final ImageView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final Group M;
    public final AppCompatImageView N;
    public final ComposeView O;
    public final ComposeView P;
    public final ConstraintLayout a;
    public final TextView b;
    public final Group c;
    public final TextView d;
    public final ImageView e;
    public final TextView f;
    public final View i;
    public final View v;
    public final CommonButton w;
    public final ImageView y;
    public final TextView z;

    public bf(ConstraintLayout constraintLayout, TextView textView, Group group, TextView textView2, ImageView imageView, TextView textView3, View view, View view2, CommonButton commonButton, ImageView imageView2, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, ImageView imageView3, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, Group group2, AppCompatImageView appCompatImageView, ComposeView composeView, ComposeView composeView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = group;
        this.d = textView2;
        this.e = imageView;
        this.f = textView3;
        this.i = view;
        this.v = view2;
        this.w = commonButton;
        this.y = imageView2;
        this.z = textView4;
        this.A = textView5;
        this.B = textView6;
        this.C = textView7;
        this.D = textView8;
        this.E = textView9;
        this.F = imageView3;
        this.G = textView10;
        this.H = textView11;
        this.I = textView12;
        this.J = textView13;
        this.K = textView14;
        this.L = textView15;
        this.M = group2;
        this.N = appCompatImageView;
        this.O = composeView;
        this.P = composeView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

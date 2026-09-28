package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class f820 implements g6i0 {
    public final ConstraintLayout A;
    public final ImageView B;
    public final ImageView C;
    public final TextView D;
    public final ImageView E;
    public final ImageView F;
    public final View G;
    public final View H;
    public final SeekBar I;
    public final ConstraintLayout J;
    public final View K;
    public final ConstraintLayout L;
    public final CardView a;
    public final View b;
    public final MotionLayout c;
    public final ConstraintLayout d;
    public final View e;
    public final View f;
    public final TextView i;
    public final ConstraintLayout v;
    public final TextView w;
    public final View y;
    public final View z;

    public f820(CardView cardView, View view, MotionLayout motionLayout, ConstraintLayout constraintLayout, View view2, View view3, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, View view4, View view5, ConstraintLayout constraintLayout3, ImageView imageView, ImageView imageView2, TextView textView3, ImageView imageView3, ImageView imageView4, View view6, View view7, SeekBar seekBar, ConstraintLayout constraintLayout4, View view8, ConstraintLayout constraintLayout5) {
        this.a = cardView;
        this.b = view;
        this.c = motionLayout;
        this.d = constraintLayout;
        this.e = view2;
        this.f = view3;
        this.i = textView;
        this.v = constraintLayout2;
        this.w = textView2;
        this.y = view4;
        this.z = view5;
        this.A = constraintLayout3;
        this.B = imageView;
        this.C = imageView2;
        this.D = textView3;
        this.E = imageView3;
        this.F = imageView4;
        this.G = view6;
        this.H = view7;
        this.I = seekBar;
        this.J = constraintLayout4;
        this.K = view8;
        this.L = constraintLayout5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

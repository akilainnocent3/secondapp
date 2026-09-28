package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportygames.commons.utils.LineAnimationView;

/* JADX INFO: loaded from: classes8.dex */
public final class rs80 implements g6i0 {
    public final LineAnimationView A;
    public final ConstraintLayout B;
    public final ConstraintLayout C;
    public final TextView D;
    public final TextView E;
    public final ImageView F;
    public final LineAnimationView G;
    public final ConstraintLayout H;
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final LineAnimationView e;
    public final ConstraintLayout f;
    public final View i;
    public final View v;
    public final TextView w;
    public final TextView y;
    public final ImageView z;

    public rs80(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, LineAnimationView lineAnimationView, ConstraintLayout constraintLayout2, View view, View view2, TextView textView3, TextView textView4, ImageView imageView2, LineAnimationView lineAnimationView2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, TextView textView5, TextView textView6, ImageView imageView3, LineAnimationView lineAnimationView3, ConstraintLayout constraintLayout5) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = imageView;
        this.e = lineAnimationView;
        this.f = constraintLayout2;
        this.i = view;
        this.v = view2;
        this.w = textView3;
        this.y = textView4;
        this.z = imageView2;
        this.A = lineAnimationView2;
        this.B = constraintLayout3;
        this.C = constraintLayout4;
        this.D = textView5;
        this.E = textView6;
        this.F = imageView3;
        this.G = lineAnimationView3;
        this.H = constraintLayout5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

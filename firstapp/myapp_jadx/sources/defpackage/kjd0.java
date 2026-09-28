package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class kjd0 implements g6i0 {
    public final LinearLayout A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final TextView c;
    public final View d;
    public final ImageView e;
    public final TextView f;
    public final TextView i;
    public final LinearLayout v;
    public final TextView w;
    public final View y;
    public final View z;

    public kjd0(ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, View view, ImageView imageView, TextView textView2, TextView textView3, LinearLayout linearLayout2, TextView textView4, View view2, View view3, LinearLayout linearLayout3, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.a = constraintLayout;
        this.b = linearLayout;
        this.c = textView;
        this.d = view;
        this.e = imageView;
        this.f = textView2;
        this.i = textView3;
        this.v = linearLayout2;
        this.w = textView4;
        this.y = view2;
        this.z = view3;
        this.A = linearLayout3;
        this.B = textView5;
        this.C = textView6;
        this.D = textView7;
        this.E = textView8;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

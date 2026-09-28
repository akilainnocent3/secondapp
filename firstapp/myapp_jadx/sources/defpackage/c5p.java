package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class c5p implements g6i0 {
    public final TextView A;
    public final TextView B;
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final View e;
    public final LinearLayout f;
    public final ImageView i;
    public final TextView v;
    public final TextView w;
    public final View y;
    public final View z;

    public c5p(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, View view, LinearLayout linearLayout, ImageView imageView2, TextView textView3, TextView textView4, View view2, View view3, TextView textView5, TextView textView6) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = view;
        this.f = linearLayout;
        this.i = imageView2;
        this.v = textView3;
        this.w = textView4;
        this.y = view2;
        this.z = view3;
        this.A = textView5;
        this.B = textView6;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

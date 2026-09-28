package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class yie implements g6i0 {
    public final AppCompatImageView A;
    public final TextView B;
    public final AppCompatImageView C;
    public final LinearLayout D;
    public final AppCompatImageView E;
    public final TextView F;
    public final ConstraintLayout a;
    public final AppCompatTextView b;
    public final View c;
    public final View d;
    public final View e;
    public final AppCompatImageView f;
    public final LinearLayout i;
    public final AppCompatImageView v;
    public final TextView w;
    public final AppCompatImageView y;
    public final LinearLayout z;

    public yie(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, View view, View view2, View view3, AppCompatImageView appCompatImageView, LinearLayout linearLayout, AppCompatImageView appCompatImageView2, TextView textView, AppCompatImageView appCompatImageView3, LinearLayout linearLayout2, AppCompatImageView appCompatImageView4, TextView textView2, AppCompatImageView appCompatImageView5, LinearLayout linearLayout3, AppCompatImageView appCompatImageView6, TextView textView3) {
        this.a = constraintLayout;
        this.b = appCompatTextView;
        this.c = view;
        this.d = view2;
        this.e = view3;
        this.f = appCompatImageView;
        this.i = linearLayout;
        this.v = appCompatImageView2;
        this.w = textView;
        this.y = appCompatImageView3;
        this.z = linearLayout2;
        this.A = appCompatImageView4;
        this.B = textView2;
        this.C = appCompatImageView5;
        this.D = linearLayout3;
        this.E = appCompatImageView6;
        this.F = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

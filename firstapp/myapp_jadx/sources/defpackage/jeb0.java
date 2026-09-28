package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class jeb0 implements g6i0 {
    public final View A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final View F;
    public final ConstraintLayout a;
    public final ImageButton b;
    public final LinearLayout c;
    public final LinearLayout d;
    public final LinearLayout e;
    public final ImageView f;
    public final View i;
    public final ProgressBar v;
    public final RecyclerView w;
    public final View y;
    public final View z;

    public jeb0(ConstraintLayout constraintLayout, ImageButton imageButton, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView, View view, ProgressBar progressBar, RecyclerView recyclerView, View view2, View view3, View view4, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view5) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = linearLayout;
        this.d = linearLayout2;
        this.e = linearLayout3;
        this.f = imageView;
        this.i = view;
        this.v = progressBar;
        this.w = recyclerView;
        this.y = view2;
        this.z = view3;
        this.A = view4;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = view5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

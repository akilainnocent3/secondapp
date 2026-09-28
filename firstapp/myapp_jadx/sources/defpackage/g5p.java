package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class g5p implements g6i0 {
    public final RelativeLayout a;
    public final LinearLayout b;
    public final View c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView i;
    public final TextView v;
    public final TextView w;

    public g5p(RelativeLayout relativeLayout, LinearLayout linearLayout, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.a = relativeLayout;
        this.b = linearLayout;
        this.c = view;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.i = textView4;
        this.v = textView5;
        this.w = textView6;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

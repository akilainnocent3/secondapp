package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class yhs implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final ImageView e;
    public final TextView f;
    public final ConstraintLayout i;
    public final View v;
    public final TextView w;

    public yhs(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, TextView textView3, ConstraintLayout constraintLayout2, View view, TextView textView4) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = imageView;
        this.e = imageView2;
        this.f = textView3;
        this.i = constraintLayout2;
        this.v = view;
        this.w = textView4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

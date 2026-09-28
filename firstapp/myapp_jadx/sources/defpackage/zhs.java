package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class zhs implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final TextView e;
    public final ConstraintLayout f;
    public final View i;
    public final TextView v;

    public zhs(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3, ConstraintLayout constraintLayout2, View view, TextView textView4) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = imageView;
        this.e = textView3;
        this.f = constraintLayout2;
        this.i = view;
        this.v = textView4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

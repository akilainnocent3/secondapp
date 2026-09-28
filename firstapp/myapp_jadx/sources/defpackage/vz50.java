package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class vz50 implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final ConstraintLayout c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final ConstraintLayout i;
    public final TextView v;
    public final ImageView w;

    public vz50(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout3, TextView textView5, ImageView imageView) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = constraintLayout2;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.i = constraintLayout3;
        this.v = textView5;
        this.w = imageView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class e3p implements g6i0 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ImageView c;
    public final View d;
    public final ImageView e;
    public final TextView f;
    public final TextView i;

    public e3p(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, View view, ImageView imageView3, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = view;
        this.e = imageView3;
        this.f = textView;
        this.i = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

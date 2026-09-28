package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class tvi implements g6i0 {
    public final ConstraintLayout a;
    public final ProgressBar b;
    public final ImageView c;
    public final Button d;
    public final TextView e;
    public final ConstraintLayout f;
    public final TextView i;
    public final TextView v;
    public final TextView w;

    public tvi(ConstraintLayout constraintLayout, ProgressBar progressBar, ImageView imageView, Button button, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3, TextView textView4) {
        this.a = constraintLayout;
        this.b = progressBar;
        this.c = imageView;
        this.d = button;
        this.e = textView;
        this.f = constraintLayout2;
        this.i = textView2;
        this.v = textView3;
        this.w = textView4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

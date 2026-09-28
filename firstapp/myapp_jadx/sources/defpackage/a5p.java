package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class a5p implements g6i0 {
    public final ConstraintLayout a;
    public final ComposeView b;
    public final ComposeView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public final TextView i;
    public final TextView v;
    public final TextView w;

    public a5p(ConstraintLayout constraintLayout, ComposeView composeView, ComposeView composeView2, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = composeView;
        this.c = composeView2;
        this.d = imageView;
        this.e = imageView2;
        this.f = imageView3;
        this.i = textView;
        this.v = textView2;
        this.w = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

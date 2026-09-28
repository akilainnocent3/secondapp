package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;

/* JADX INFO: loaded from: classes6.dex */
public final class f6j0 implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public final ImageView i;
    public final ImageView v;
    public final SpinKitView w;
    public final TextView y;

    public f6j0(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, SpinKitView spinKitView, TextView textView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = imageView;
        this.d = imageView2;
        this.e = imageView3;
        this.f = imageView4;
        this.i = imageView5;
        this.v = imageView6;
        this.w = spinKitView;
        this.y = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class w4p implements g6i0 {
    public final RelativeLayout A;
    public final AppCompatImageView B;
    public final RelativeLayout a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final View i;
    public final ImageView v;
    public final TextView w;
    public final TextView y;
    public final TextView z;

    public w4p(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, View view, ImageView imageView3, TextView textView4, TextView textView5, TextView textView6, RelativeLayout relativeLayout2, AppCompatImageView appCompatImageView) {
        this.a = relativeLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.i = view;
        this.v = imageView3;
        this.w = textView4;
        this.y = textView5;
        this.z = textView6;
        this.A = relativeLayout2;
        this.B = appCompatImageView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

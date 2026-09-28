package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class dd implements g6i0 {
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final View d;
    public final FrameLayout e;
    public final ImageView f;
    public final TextView i;
    public final View v;
    public final View w;

    public dd(FrameLayout frameLayout, ImageView imageView, ImageView imageView2, View view, FrameLayout frameLayout2, ImageView imageView3, TextView textView, View view2, View view3) {
        this.a = frameLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = view;
        this.e = frameLayout2;
        this.f = imageView3;
        this.i = textView;
        this.v = view2;
        this.w = view3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

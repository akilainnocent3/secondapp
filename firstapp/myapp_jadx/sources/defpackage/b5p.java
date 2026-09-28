package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class b5p implements g6i0 {
    public final RelativeLayout a;
    public final ImageView b;
    public final TextView c;
    public final ComposeView d;
    public final View e;
    public final ImageView f;
    public final TextView i;
    public final TextView v;

    public b5p(RelativeLayout relativeLayout, ImageView imageView, TextView textView, ComposeView composeView, View view, ImageView imageView2, TextView textView2, TextView textView3) {
        this.a = relativeLayout;
        this.b = imageView;
        this.c = textView;
        this.d = composeView;
        this.e = view;
        this.f = imageView2;
        this.i = textView2;
        this.v = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

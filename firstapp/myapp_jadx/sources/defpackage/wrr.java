package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class wrr implements g6i0 {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final View c;
    public final TextView d;
    public final View e;
    public final WebView f;
    public final ConstraintLayout i;
    public final View v;
    public final TextView w;

    public wrr(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, TextView textView, View view2, WebView webView, ConstraintLayout constraintLayout3, View view3, TextView textView2) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = view;
        this.d = textView;
        this.e = view2;
        this.f = webView;
        this.i = constraintLayout3;
        this.v = view3;
        this.w = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

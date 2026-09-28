package defpackage;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class aid0 implements g6i0 {
    public final ScrollView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView i;

    public aid0(ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.a = scrollView;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
        this.f = textView5;
        this.i = textView6;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

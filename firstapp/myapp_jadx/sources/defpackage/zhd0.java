package defpackage;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.sportybet.android.widget.ArrowButton;

/* JADX INFO: loaded from: classes5.dex */
public final class zhd0 implements g6i0 {
    public final ScrollView a;
    public final ArrowButton b;
    public final ArrowButton c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView i;
    public final TextView v;

    public zhd0(ScrollView scrollView, ArrowButton arrowButton, ArrowButton arrowButton2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.a = scrollView;
        this.b = arrowButton;
        this.c = arrowButton2;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.i = textView4;
        this.v = textView5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

package defpackage;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class bid0 implements g6i0 {
    public final ScrollView a;
    public final TextView b;
    public final TextView c;

    public bid0(ScrollView scrollView, TextView textView, TextView textView2) {
        this.a = scrollView;
        this.b = textView;
        this.c = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

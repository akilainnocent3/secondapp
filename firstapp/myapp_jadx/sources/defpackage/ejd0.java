package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class ejd0 implements g6i0 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;

    public ejd0(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = textView;
        this.d = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class i5p implements g6i0 {
    public final RelativeLayout a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public i5p(RelativeLayout relativeLayout, View view, TextView textView, TextView textView2, TextView textView3) {
        this.a = relativeLayout;
        this.b = view;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

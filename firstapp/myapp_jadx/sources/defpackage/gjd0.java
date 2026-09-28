package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class gjd0 implements g6i0 {
    public final FrameLayout a;
    public final View b;
    public final LinearLayout c;
    public final TextView d;
    public final ProgressBar e;

    public gjd0(FrameLayout frameLayout, View view, LinearLayout linearLayout, TextView textView, ProgressBar progressBar) {
        this.a = frameLayout;
        this.b = view;
        this.c = linearLayout;
        this.d = textView;
        this.e = progressBar;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

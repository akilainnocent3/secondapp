package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class mhd0 implements g6i0 {
    public final FrameLayout a;
    public final View b;
    public final TextView c;
    public final ProgressBar d;

    public mhd0(FrameLayout frameLayout, View view, TextView textView, ProgressBar progressBar) {
        this.a = frameLayout;
        this.b = view;
        this.c = textView;
        this.d = progressBar;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

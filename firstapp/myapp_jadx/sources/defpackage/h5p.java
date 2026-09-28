package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class h5p implements g6i0 {
    public final ConstraintLayout a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public h5p(ConstraintLayout constraintLayout, View view, TextView textView, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
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

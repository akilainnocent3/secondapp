package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class iq2 implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final ConstraintLayout c;
    public final TextView d;

    public iq2(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = constraintLayout2;
        this.d = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

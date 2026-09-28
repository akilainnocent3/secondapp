package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class jc implements g6i0 {
    public final ConstraintLayout a;
    public final Button b;
    public final Button c;
    public final Button d;
    public final View e;
    public final TextView f;

    public jc(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, View view, TextView textView) {
        this.a = constraintLayout;
        this.b = button;
        this.c = button2;
        this.d = button3;
        this.e = view;
        this.f = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

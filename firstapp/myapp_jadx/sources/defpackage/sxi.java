package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class sxi implements g6i0 {
    public final ConstraintLayout a;
    public final Button b;
    public final TextView c;
    public final TextView d;

    public sxi(ConstraintLayout constraintLayout, Button button, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = button;
        this.c = textView;
        this.d = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

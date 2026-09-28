package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class veb0 implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatButton b;
    public final AppCompatButton c;
    public final LinearLayout d;
    public final LinearLayout e;
    public final xeb0 f;
    public final View i;
    public final View v;

    public veb0(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, LinearLayout linearLayout, LinearLayout linearLayout2, xeb0 xeb0Var, View view, View view2) {
        this.a = constraintLayout;
        this.b = appCompatButton;
        this.c = appCompatButton2;
        this.d = linearLayout;
        this.e = linearLayout2;
        this.f = xeb0Var;
        this.i = view;
        this.v = view2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

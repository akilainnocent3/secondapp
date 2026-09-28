package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class kke implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatCheckBox b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;

    public kke(ConstraintLayout constraintLayout, AppCompatCheckBox appCompatCheckBox, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.a = constraintLayout;
        this.b = appCompatCheckBox;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

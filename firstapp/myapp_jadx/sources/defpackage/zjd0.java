package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class zjd0 implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatTextView b;
    public final View c;
    public final TextView d;
    public final TextView e;
    public final TextView f;

    public zjd0(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, View view, TextView textView, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = appCompatTextView;
        this.c = view;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

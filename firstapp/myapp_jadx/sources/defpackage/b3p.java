package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class b3p implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final LinearLayout c;
    public final AppCompatImageView d;
    public final TextView e;
    public final View f;
    public final TextView i;

    public b3p(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, AppCompatImageView appCompatImageView, TextView textView2, View view, TextView textView3) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = linearLayout;
        this.d = appCompatImageView;
        this.e = textView2;
        this.f = view;
        this.i = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

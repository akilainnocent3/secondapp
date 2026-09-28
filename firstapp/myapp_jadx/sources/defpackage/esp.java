package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class esp implements g6i0 {
    public final ConstraintLayout a;
    public final View b;
    public final AppCompatImageView c;
    public final TextView d;
    public final AppCompatImageView e;
    public final TextView f;

    public esp(ConstraintLayout constraintLayout, View view, AppCompatImageView appCompatImageView, TextView textView, AppCompatImageView appCompatImageView2, TextView textView2) {
        this.a = constraintLayout;
        this.b = view;
        this.c = appCompatImageView;
        this.d = textView;
        this.e = appCompatImageView2;
        this.f = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

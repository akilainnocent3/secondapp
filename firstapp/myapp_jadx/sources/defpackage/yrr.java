package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class yrr implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final View c;
    public final AppCompatImageView d;
    public final TextView e;

    public yrr(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, View view, AppCompatImageView appCompatImageView2, TextView textView) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = view;
        this.d = appCompatImageView2;
        this.e = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

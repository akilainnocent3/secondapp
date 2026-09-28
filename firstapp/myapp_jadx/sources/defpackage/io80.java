package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class io80 implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatTextView b;
    public final AppCompatImageView c;
    public final AppCompatImageView d;
    public final AppCompatImageView e;
    public final AppCompatTextView f;
    public final ConstraintLayout i;
    public final TextView v;
    public final AppCompatImageView w;
    public final TextView y;
    public final ConstraintLayout z;

    public io80(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout2, TextView textView, AppCompatImageView appCompatImageView4, TextView textView2, ConstraintLayout constraintLayout3) {
        this.a = constraintLayout;
        this.b = appCompatTextView;
        this.c = appCompatImageView;
        this.d = appCompatImageView2;
        this.e = appCompatImageView3;
        this.f = appCompatTextView2;
        this.i = constraintLayout2;
        this.v = textView;
        this.w = appCompatImageView4;
        this.y = textView2;
        this.z = constraintLayout3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

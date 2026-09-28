package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class jo80 implements g6i0 {
    public final ConstraintLayout A;
    public final ConstraintLayout a;
    public final AppCompatTextView b;
    public final AppCompatImageView c;
    public final AppCompatImageView d;
    public final AppCompatImageView e;
    public final AppCompatTextView f;
    public final ConstraintLayout i;
    public final TextView v;
    public final TextView w;
    public final AppCompatImageView y;
    public final TextView z;

    public jo80(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, AppCompatImageView appCompatImageView4, TextView textView3, ConstraintLayout constraintLayout3) {
        this.a = constraintLayout;
        this.b = appCompatTextView;
        this.c = appCompatImageView;
        this.d = appCompatImageView2;
        this.e = appCompatImageView3;
        this.f = appCompatTextView2;
        this.i = constraintLayout2;
        this.v = textView;
        this.w = textView2;
        this.y = appCompatImageView4;
        this.z = textView3;
        this.A = constraintLayout3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

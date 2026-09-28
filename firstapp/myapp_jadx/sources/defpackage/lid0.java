package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class lid0 implements g6i0 {
    public final AppCompatTextView A;
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;
    public final AppCompatImageView e;
    public final AppCompatTextView f;
    public final AppCompatImageView i;
    public final AppCompatImageView v;
    public final View w;
    public final AppCompatImageView y;
    public final AppCompatTextView z;

    public lid0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, View view, AppCompatImageView appCompatImageView5, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = appCompatTextView;
        this.d = appCompatTextView2;
        this.e = appCompatImageView2;
        this.f = appCompatTextView3;
        this.i = appCompatImageView3;
        this.v = appCompatImageView4;
        this.w = view;
        this.y = appCompatImageView5;
        this.z = appCompatTextView4;
        this.A = appCompatTextView5;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

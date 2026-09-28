package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class cjh implements g6i0 {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final ConstraintLayout c;
    public final AppCompatImageView d;
    public final ConstraintLayout e;
    public final AppCompatImageView f;
    public final AppCompatTextView i;

    public cjh(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout4, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = constraintLayout3;
        this.d = appCompatImageView;
        this.e = constraintLayout4;
        this.f = appCompatImageView2;
        this.i = appCompatTextView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

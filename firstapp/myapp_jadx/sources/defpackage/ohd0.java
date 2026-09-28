package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class ohd0 implements g6i0 {
    public final ConstraintLayout a;
    public final AppCompatImageButton b;
    public final AppCompatImageView c;
    public final AppCompatImageView d;
    public final AppCompatTextView e;

    public ohd0(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.a = constraintLayout;
        this.b = appCompatImageButton;
        this.c = appCompatImageView;
        this.d = appCompatImageView2;
        this.e = appCompatTextView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

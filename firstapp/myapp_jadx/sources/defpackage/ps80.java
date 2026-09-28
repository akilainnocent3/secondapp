package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes7.dex */
public final class ps80 implements g6i0 {
    public final MaterialCardView a;
    public final ConstraintLayout b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;
    public final AppCompatImageView e;

    public ps80(MaterialCardView materialCardView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView) {
        this.a = materialCardView;
        this.b = constraintLayout;
        this.c = appCompatTextView;
        this.d = appCompatTextView2;
        this.e = appCompatImageView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

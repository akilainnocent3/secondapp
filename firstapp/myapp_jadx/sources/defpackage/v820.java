package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes7.dex */
public final class v820 implements g6i0 {
    public final MaterialCardView a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final ConstraintLayout d;
    public final AppCompatTextView e;
    public final AppCompatTextView f;

    public v820(MaterialCardView materialCardView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.a = materialCardView;
        this.b = appCompatTextView;
        this.c = appCompatTextView2;
        this.d = constraintLayout;
        this.e = appCompatTextView3;
        this.f = appCompatTextView4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

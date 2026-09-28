package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class jwg implements g6i0 {
    public final ConstraintLayout a;
    public final CardView b;
    public final AppCompatImageView c;
    public final TextView d;
    public final ConstraintLayout e;

    public jwg(ConstraintLayout constraintLayout, CardView cardView, AppCompatImageView appCompatImageView, TextView textView, ConstraintLayout constraintLayout2) {
        this.a = constraintLayout;
        this.b = cardView;
        this.c = appCompatImageView;
        this.d = textView;
        this.e = constraintLayout2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

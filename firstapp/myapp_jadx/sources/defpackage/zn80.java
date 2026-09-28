package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class zn80 implements g6i0 {
    public final CardView a;
    public final ConstraintLayout b;
    public final TextView c;

    public zn80(CardView cardView, ConstraintLayout constraintLayout, TextView textView) {
        this.a = cardView;
        this.b = constraintLayout;
        this.c = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

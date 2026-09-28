package defpackage;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class f0t implements g6i0 {
    public final ConstraintLayout a;
    public final CardView b;

    public f0t(ConstraintLayout constraintLayout, CardView cardView) {
        this.a = constraintLayout;
        this.b = cardView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

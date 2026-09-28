package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class wo80 implements g6i0 {
    public final ConstraintLayout a;
    public final CardView b;
    public final ImageView c;

    public wo80(ConstraintLayout constraintLayout, CardView cardView, ImageView imageView) {
        this.a = constraintLayout;
        this.b = cardView;
        this.c = imageView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

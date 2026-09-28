package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class l820 implements g6i0 {
    public final CardView a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final ConstraintLayout d;
    public final AppCompatTextView e;
    public final AppCompatTextView f;
    public final AppCompatImageView i;
    public final AppCompatTextView v;
    public final AppCompatTextView w;
    public final ImageView y;
    public final AppCompatTextView z;

    public l820(CardView cardView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, ImageView imageView, AppCompatTextView appCompatTextView7) {
        this.a = cardView;
        this.b = appCompatTextView;
        this.c = appCompatTextView2;
        this.d = constraintLayout;
        this.e = appCompatTextView3;
        this.f = appCompatTextView4;
        this.i = appCompatImageView;
        this.v = appCompatTextView5;
        this.w = appCompatTextView6;
        this.y = imageView;
        this.z = appCompatTextView7;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

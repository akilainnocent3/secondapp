package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes7.dex */
public final class rt implements g6i0 {
    public final MaterialCardView a;
    public final MaterialCardView b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;
    public final AppCompatImageView e;
    public final AppCompatTextView f;
    public final AppCompatTextView i;
    public final AppCompatImageView v;

    public rt(MaterialCardView materialCardView, MaterialCardView materialCardView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatImageView appCompatImageView2) {
        this.a = materialCardView;
        this.b = materialCardView2;
        this.c = appCompatTextView;
        this.d = appCompatTextView2;
        this.e = appCompatImageView;
        this.f = appCompatTextView3;
        this.i = appCompatTextView4;
        this.v = appCompatImageView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

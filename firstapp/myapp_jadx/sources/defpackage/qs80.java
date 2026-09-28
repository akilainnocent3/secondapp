package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes8.dex */
public final class qs80 implements g6i0 {
    public final MaterialCardView a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final AppCompatImageView d;

    public qs80(MaterialCardView materialCardView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView) {
        this.a = materialCardView;
        this.b = appCompatTextView;
        this.c = appCompatTextView2;
        this.d = appCompatImageView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

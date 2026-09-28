package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes7.dex */
public final class k820 implements g6i0 {
    public final CardView a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final AppCompatTextView d;

    public k820(CardView cardView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.a = cardView;
        this.b = appCompatTextView;
        this.c = appCompatTextView2;
        this.d = appCompatTextView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes7.dex */
public final class so40 implements g6i0 {
    public final CardView a;
    public final CardView b;
    public final TextView c;

    public so40(CardView cardView, CardView cardView2, TextView textView) {
        this.a = cardView;
        this.b = cardView2;
        this.c = textView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

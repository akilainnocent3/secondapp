package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public final class sv80 implements g6i0 {
    public final CardView a;
    public final View b;
    public final View c;
    public final RecyclerView d;
    public final TextView e;
    public final ConstraintLayout f;

    public sv80(CardView cardView, View view, View view2, RecyclerView recyclerView, TextView textView, ConstraintLayout constraintLayout) {
        this.a = cardView;
        this.b = view;
        this.c = view2;
        this.d = recyclerView;
        this.e = textView;
        this.f = constraintLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

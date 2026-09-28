package defpackage;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.widget.OutcomeButton;

/* JADX INFO: loaded from: classes7.dex */
public final class p2p implements g6i0 {
    public final CardView a;
    public final OutcomeButton b;
    public final ConstraintLayout c;
    public final RecyclerView d;
    public final View e;
    public final View f;
    public final View i;

    public p2p(CardView cardView, OutcomeButton outcomeButton, ConstraintLayout constraintLayout, RecyclerView recyclerView, View view, View view2, View view3) {
        this.a = cardView;
        this.b = outcomeButton;
        this.c = constraintLayout;
        this.d = recyclerView;
        this.e = view;
        this.f = view2;
        this.i = view3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

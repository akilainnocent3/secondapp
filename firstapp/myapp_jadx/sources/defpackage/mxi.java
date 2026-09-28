package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class mxi implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final RecyclerView c;

    public mxi(ConstraintLayout constraintLayout, TextView textView, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = recyclerView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

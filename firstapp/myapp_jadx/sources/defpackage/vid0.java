package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class vid0 implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final RecyclerView d;

    public vid0(ConstraintLayout constraintLayout, TextView textView, TextView textView2, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = recyclerView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

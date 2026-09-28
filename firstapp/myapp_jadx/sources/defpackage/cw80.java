package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public final class cw80 implements g6i0 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ConstraintLayout c;
    public final RecyclerView d;

    public cw80(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = constraintLayout2;
        this.d = recyclerView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

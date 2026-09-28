package defpackage;

import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class lc implements g6i0 {
    public final ConstraintLayout a;
    public final ImageButton b;
    public final ImageButton c;
    public final RecyclerView d;

    public lc(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = imageButton2;
        this.d = recyclerView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

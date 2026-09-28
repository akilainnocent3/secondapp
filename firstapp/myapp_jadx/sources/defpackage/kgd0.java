package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class kgd0 implements g6i0 {
    public final ConstraintLayout a;

    public kgd0(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.a = constraintLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

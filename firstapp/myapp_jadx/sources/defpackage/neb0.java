package defpackage;

import android.view.View;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class neb0 implements g6i0 {
    public final ConstraintLayout a;
    public final ij90 b;
    public final dfb0 c;
    public final afb0 d;
    public final ConstraintLayout e;
    public final RecyclerView f;
    public final SwipeRefreshLayout i;
    public final ToggleButton v;

    public neb0(ConstraintLayout constraintLayout, ij90 ij90Var, dfb0 dfb0Var, afb0 afb0Var, ConstraintLayout constraintLayout2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, ToggleButton toggleButton) {
        this.a = constraintLayout;
        this.b = ij90Var;
        this.c = dfb0Var;
        this.d = afb0Var;
        this.e = constraintLayout2;
        this.f = recyclerView;
        this.i = swipeRefreshLayout;
        this.v = toggleButton;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

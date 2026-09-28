package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class bo80 implements g6i0 {
    public final RelativeLayout a;
    public final yn80 b;
    public final RecyclerView c;
    public final SwipeRefreshLayout d;
    public final SwipeRefreshLayout e;

    public bo80(RelativeLayout relativeLayout, yn80 yn80Var, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, SwipeRefreshLayout swipeRefreshLayout2) {
        this.a = relativeLayout;
        this.b = yn80Var;
        this.c = recyclerView;
        this.d = swipeRefreshLayout;
        this.e = swipeRefreshLayout2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

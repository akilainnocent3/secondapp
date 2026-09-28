package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class co80 implements g6i0 {
    public final RelativeLayout a;
    public final yn80 b;
    public final LinearLayout c;
    public final RecyclerView d;
    public final SwipeRefreshLayout e;
    public final SwipeRefreshLayout f;

    public co80(RelativeLayout relativeLayout, yn80 yn80Var, LinearLayout linearLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, SwipeRefreshLayout swipeRefreshLayout2) {
        this.a = relativeLayout;
        this.b = yn80Var;
        this.c = linearLayout;
        this.d = recyclerView;
        this.e = swipeRefreshLayout;
        this.f = swipeRefreshLayout2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

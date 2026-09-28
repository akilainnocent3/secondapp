package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.betorder.RecyclerView.PullRefreshRecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class thd0 implements g6i0 {
    public final FrameLayout a;
    public final ImageButton b;
    public final LoadingView c;
    public final PullRefreshRecyclerView d;

    public thd0(FrameLayout frameLayout, ImageButton imageButton, LoadingView loadingView, PullRefreshRecyclerView pullRefreshRecyclerView) {
        this.a = frameLayout;
        this.b = imageButton;
        this.c = loadingView;
        this.d = pullRefreshRecyclerView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

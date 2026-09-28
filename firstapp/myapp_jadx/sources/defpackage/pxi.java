package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class pxi implements g6i0 {
    public final ConstraintLayout a;
    public final View b;
    public final Group c;
    public final ProgressButton d;
    public final TextView e;
    public final LoadingViewNew f;
    public final BubbleView i;
    public final RecyclerView v;
    public final SwipeRefreshLayout w;

    public pxi(ConstraintLayout constraintLayout, View view, Group group, ImageView imageView, ProgressButton progressButton, TextView textView, LoadingViewNew loadingViewNew, BubbleView bubbleView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = constraintLayout;
        this.b = view;
        this.c = group;
        this.d = progressButton;
        this.e = textView;
        this.f = loadingViewNew;
        this.i = bubbleView;
        this.v = recyclerView;
        this.w = swipeRefreshLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

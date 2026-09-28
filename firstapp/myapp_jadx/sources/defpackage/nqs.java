package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.cruxlab.sectionedrecyclerview.lib.SectionHeaderLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common_ui.widgets.AspectRatioFrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class nqs implements g6i0 {
    public final ConstraintLayout a;
    public final ij90 b;
    public final AspectRatioFrameLayout c;
    public final ImageView d;
    public final RecyclerView e;
    public final SectionHeaderLayout f;
    public final TabLayout i;
    public final View v;
    public final SwipeRefreshLayout w;

    public nqs(ConstraintLayout constraintLayout, ij90 ij90Var, AspectRatioFrameLayout aspectRatioFrameLayout, ImageView imageView, RecyclerView recyclerView, SectionHeaderLayout sectionHeaderLayout, TabLayout tabLayout, View view, SwipeRefreshLayout swipeRefreshLayout) {
        this.a = constraintLayout;
        this.b = ij90Var;
        this.c = aspectRatioFrameLayout;
        this.d = imageView;
        this.e = recyclerView;
        this.f = sectionHeaderLayout;
        this.i = tabLayout;
        this.v = view;
        this.w = swipeRefreshLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}

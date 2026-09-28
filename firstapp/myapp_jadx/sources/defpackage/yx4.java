package defpackage;

import android.view.View;
import android.view.animation.AnimationSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class yx4 extends RecyclerView.s {
    public final /* synthetic */ View a;
    public final /* synthetic */ AnimationSet b;
    public final /* synthetic */ RecyclerView c;

    public yx4(View view, AnimationSet animationSet, RecyclerView recyclerView) {
        this.a = view;
        this.b = animationSet;
        this.c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void a(RecyclerView recyclerView, int i) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            int iG1 = ((LinearLayoutManager) layoutManager).g1();
            RecyclerView.f adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            AnimationSet animationSet = this.b;
            View view = this.a;
            if (i == 0) {
                if (iG1 < itemCount - 1) {
                    gy4.c(view, animationSet, this.c.getAdapter());
                }
            } else {
                if (i != 1) {
                    return;
                }
                if (animationSet != null) {
                    animationSet.reset();
                }
                view.clearAnimation();
                view.setVisibility(8);
            }
        }
    }
}

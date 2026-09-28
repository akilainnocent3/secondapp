package defpackage;

import android.view.animation.AnimationSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class xw7 extends RecyclerView.s {
    public final /* synthetic */ zw7 a;

    public xw7(zw7 zw7Var) {
        this.a = zw7Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void a(RecyclerView recyclerView, int i) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            int iG1 = ((LinearLayoutManager) layoutManager).g1();
            RecyclerView.f adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            zw7 zw7Var = this.a;
            if (i == 0) {
                if (iG1 < itemCount - 1) {
                    zw7Var.e();
                }
            } else {
                if (i != 1) {
                    return;
                }
                d2p d2pVar = zw7Var.a;
                AnimationSet animationSet = zw7Var.d;
                if (animationSet != null) {
                    animationSet.reset();
                }
                d2pVar.H.clearAnimation();
                d2pVar.H.setVisibility(8);
            }
        }
    }
}

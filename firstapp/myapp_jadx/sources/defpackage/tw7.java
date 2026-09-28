package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class tw7 extends RecyclerView.s {
    public final /* synthetic */ uw7 a;

    public tw7(uw7 uw7Var) {
        this.a = uw7Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void a(RecyclerView recyclerView, int i) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iG1 = linearLayoutManager.g1();
        RecyclerView.f adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        uw7 uw7Var = this.a;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            uw7Var.f();
        } else if (iG1 < itemCount - 1) {
            uw7Var.e();
        } else {
            uw7Var.f();
        }
    }
}

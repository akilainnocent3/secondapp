package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class fty {
    public static final void a(RecyclerView recyclerView) {
        RecyclerView.f adapter;
        RecyclerView.o layoutManager;
        int iP;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        int iK = layoutManager.K();
        for (int i = 0; i < iK; i++) {
            View viewJ = layoutManager.J(i);
            if (viewJ != null && (iP = RecyclerView.P(viewJ)) != -1) {
                adapter.notifyItemChanged(iP, "one_up_promo_eligibility");
            }
        }
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.sportynews.ui.SportyNewsListFragment;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hsc0 extends RecyclerView.s {
    public final LinearLayoutManager a;
    public final /* synthetic */ SportyNewsListFragment b;

    public hsc0(leb0 leb0Var, SportyNewsListFragment sportyNewsListFragment) {
        this.b = sportyNewsListFragment;
        RecyclerView.o layoutManager = leb0Var.f.getLayoutManager();
        layoutManager.getClass();
        this.a = (LinearLayoutManager) layoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void b(RecyclerView recyclerView, int i, int i2) {
        Context context;
        int i3;
        LinearLayoutManager linearLayoutManager = this.a;
        int iA = linearLayoutManager.a();
        SportyNewsListFragment sportyNewsListFragment = this.b;
        sportyNewsListFragment.G = iA;
        View viewF = linearLayoutManager.F(linearLayoutManager.h1());
        if (sportyNewsListFragment.E && ((i3 = sportyNewsListFragment.G) > sportyNewsListFragment.D || i3 == 0)) {
            sportyNewsListFragment.E = false;
            sportyNewsListFragment.D = i3;
        }
        String strB = null;
        Object tag = viewF != null ? viewF.getTag() : null;
        if (viewF != null && (context = viewF.getContext()) != null) {
            strB = sn5.b(context, R.string.sporty_news__load_more, new Object[0]);
        }
        if (!Intrinsics.g(tag, strB) || viewF == null || viewF.getVisibility() != 0 || sportyNewsListFragment.E || sportyNewsListFragment.C.length() <= 0) {
            return;
        }
        sportyNewsListFragment.E = true;
        recyclerView.postDelayed(sportyNewsListFragment.Q, 1000L);
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.sportytv.ui.MySportyTvListFragment;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r1x extends RecyclerView.s {
    public final LinearLayoutManager a;
    public final /* synthetic */ MySportyTvListFragment b;

    public r1x(neb0 neb0Var, MySportyTvListFragment mySportyTvListFragment) {
        this.b = mySportyTvListFragment;
        RecyclerView.o layoutManager = neb0Var.f.getLayoutManager();
        layoutManager.getClass();
        this.a = (LinearLayoutManager) layoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void b(RecyclerView recyclerView, int i, int i2) {
        Context context;
        int i3;
        LinearLayoutManager linearLayoutManager = this.a;
        int iA = linearLayoutManager.a();
        MySportyTvListFragment mySportyTvListFragment = this.b;
        mySportyTvListFragment.J = iA;
        View viewF = linearLayoutManager.F(linearLayoutManager.h1());
        if (mySportyTvListFragment.I && ((i3 = mySportyTvListFragment.J) > mySportyTvListFragment.H || i3 == 0)) {
            mySportyTvListFragment.I = false;
            mySportyTvListFragment.H = i3;
        }
        String strB = null;
        Object tag = viewF != null ? viewF.getTag() : null;
        if (viewF != null && (context = viewF.getContext()) != null) {
            strB = sn5.b(context, R.string.sporty_tv__sporty_tv_load_more, new Object[0]);
        }
        if (!Intrinsics.g(tag, strB) || viewF == null || viewF.getVisibility() != 0 || mySportyTvListFragment.I || mySportyTvListFragment.F.length() <= 0) {
            return;
        }
        mySportyTvListFragment.I = true;
        recyclerView.postDelayed(mySportyTvListFragment.K, 1000L);
    }
}

package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class kxu extends RecyclerView.s {
    public final /* synthetic */ MatchEventActivity a;

    public kxu(MatchEventActivity matchEventActivity) {
        this.a = matchEventActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void b(RecyclerView recyclerView, int i, int i2) {
        lyu lyuVar;
        wvi wviVar;
        y4v y4vVar;
        xvi xviVar;
        String str;
        if (recyclerView.I) {
            MatchEventActivity matchEventActivity = this.a;
            if (i2 != 0) {
                int i3 = MatchEventActivity.a0;
                int itemCount = matchEventActivity.G1().getItemCount();
                int iF1 = matchEventActivity.H1().f1();
                if (iF1 != -1 && iF1 < itemCount) {
                    BaseNode item = matchEventActivity.G1().getItem(iF1);
                    if (item instanceof p2s) {
                        str = ((p2s) item).d;
                    } else {
                        str = item instanceof mpg ? ((mpg) item).b : null;
                    }
                    if (str != null) {
                        matchEventActivity.I1().J.b.a(str);
                    }
                }
            }
            if (!matchEventActivity.I && (y4vVar = matchEventActivity.G) != null && (xviVar = y4vVar.f) != null) {
                RecyclerView recyclerView2 = xviVar.b;
                if (recyclerView2.I) {
                    y4vVar.C = true;
                    recyclerView2.scrollBy(i, i2);
                    y4vVar.C = false;
                }
            }
            if (matchEventActivity.F || (lyuVar = matchEventActivity.D) == null || (wviVar = lyuVar.f) == null) {
                return;
            }
            RecyclerView recyclerView3 = wviVar.b;
            if (recyclerView3.I) {
                lyuVar.A = true;
                recyclerView3.scrollBy(i, i2);
                lyuVar.A = false;
            }
        }
    }
}

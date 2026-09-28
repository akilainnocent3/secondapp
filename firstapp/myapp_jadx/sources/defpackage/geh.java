package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportygames.featuredGames.view.FeaturedGames;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class geh extends RecyclerView.s {
    public final /* synthetic */ FeaturedGames a;
    public final /* synthetic */ LinearLayoutManager b;
    public final /* synthetic */ bq40 c;

    public geh(FeaturedGames featuredGames, LinearLayoutManager linearLayoutManager, bq40 bq40Var) {
        this.a = featuredGames;
        this.b = linearLayoutManager;
        this.c = bq40Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void a(RecyclerView recyclerView, int i) {
        wz.a("FeaturedGamesScroll", null, new String[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iF1;
        int iF2;
        ssw<Integer> sswVar;
        FeaturedGames featuredGames = this.a;
        if (featuredGames.z || (iF1 = this.b.f1()) == -1) {
            return;
        }
        ArrayList arrayList = featuredGames.y;
        if (arrayList == null) {
            Intrinsics.n("allGamesWithCategory");
            throw null;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = featuredGames.y;
        if (arrayList2 == null) {
            Intrinsics.n("allGamesWithCategory");
            throw null;
        }
        int size = iF1 % arrayList2.size();
        ArrayList arrayList3 = featuredGames.y;
        if (arrayList3 == null) {
            Intrinsics.n("allGamesWithCategory");
            throw null;
        }
        Pair pair = (Pair) CollectionsKt.V(size, arrayList3);
        if (pair != null) {
            int iIntValue = ((Number) pair.a).intValue();
            bq40 bq40Var = this.c;
            if (iIntValue != bq40Var.a) {
                bq40Var.a = iIntValue;
                qch qchVar = featuredGames.f;
                if (qchVar != null && (sswVar = qchVar.f) != null) {
                    sswVar.j(Integer.valueOf(iIntValue));
                }
                RecyclerView.o layoutManager = featuredGames.getBinding().b.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null || (iF2 = linearLayoutManager.f1()) == -1) {
                    return;
                }
                if (Math.abs(iF2 - iIntValue) > 1) {
                    featuredGames.getBinding().b.o0(iIntValue);
                } else {
                    featuredGames.getBinding().b.s0(iIntValue);
                }
            }
        }
    }
}

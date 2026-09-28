package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.LiveSectionData;
import com.sportybet.plugin.realsports.prematch.widget.LiveTogglesContainer;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.PreMatchSportActivity$collectData$1$1", f = "PreMatchSportActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kl20 extends tje0 implements Function2<lk50<? extends LiveSectionData>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ PreMatchSportActivity b;
    public final /* synthetic */ SwipeRefreshLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl20(PreMatchSportActivity preMatchSportActivity, SwipeRefreshLayout swipeRefreshLayout, v1b<? super kl20> v1bVar) {
        super(2, v1bVar);
        this.b = preMatchSportActivity;
        this.c = swipeRefreshLayout;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kl20 kl20Var = new kl20(this.b, this.c, v1bVar);
        kl20Var.a = obj;
        return kl20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends LiveSectionData> lk50Var, v1b<? super Unit> v1bVar) {
        return ((kl20) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50<LiveSectionData> lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
        its itsVarD1 = this.b.D1();
        SwipeRefreshLayout swipeRefreshLayout = this.c;
        boolean z = swipeRefreshLayout.c;
        LiveTogglesContainer liveTogglesContainer = itsVarD1.b;
        lk50Var.getClass();
        itsVarD1.s = lk50Var;
        if (lk50Var.equals(lk50.b.a)) {
            if (!z && liveTogglesContainer.getVisibility() == 0) {
                itsVarD1.b();
            }
        } else if (lk50Var instanceof lk50.a) {
            if (z) {
                swipeRefreshLayout.setRefreshing(false);
                Unit unit = Unit.a;
                zyf0.b(R.string.common_feedback__loading_failed_please_try_again_later, 0);
            }
            c8i0.n(liveTogglesContainer);
            itsVarD1.b();
        } else {
            if (!(lk50Var instanceof lk50.c)) {
                uhc.a();
                return null;
            }
            if (z) {
                swipeRefreshLayout.setRefreshing(false);
                Unit unit2 = Unit.a;
            }
            LiveSectionData liveSectionData = (LiveSectionData) ((lk50.c) lk50Var).a;
            int liveBettingCount = liveSectionData.getLiveBettingCount();
            int allLiveCount = liveSectionData.getAllLiveCount();
            liveTogglesContainer.d(liveBettingCount);
            liveTogglesContainer.a.b.setText(String.valueOf(allLiveCount));
            liveTogglesContainer.setVisibility(0);
            RegularMarketRule selectedMarket = itsVarD1.c.getSelectedMarket();
            if (selectedMarket != null) {
                itsVarD1.r.b(selectedMarket);
                List<Tournament> tournaments = liveSectionData.getTournaments();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = tournaments.iterator();
                while (it.hasNext()) {
                    Iterable iterable = ((Tournament) it.next()).events;
                    if (iterable == null) {
                        iterable = m2g.a;
                    }
                    p48.w(iterable, arrayList);
                }
                itsVarD1.a.b(selectedMarket, arrayList, true);
                itsVarD1.a(selectedMarket);
                itsVarD1.e.H0(liveSectionData.getSport(), selectedMarket, liveSectionData.getTournaments(), liveSectionData.getBoostResult(), z);
                itsVarD1.b();
            }
        }
        return Unit.a;
    }
}

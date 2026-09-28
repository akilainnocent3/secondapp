package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.EventData;
import com.sportybet.android.instantwin.newtork.model.response.MarketCategory;
import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xzu extends ek90 {
    public final /* synthetic */ MatchEventDetailActivity a;

    public xzu(MatchEventDetailActivity matchEventDetailActivity) {
        this.a = matchEventDetailActivity;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        String string;
        if (gVar != null) {
            int i = gVar.e;
            Object obj = gVar.a;
            if (obj == null || (string = obj.toString()) == null) {
                return;
            }
            MatchEventDetailActivity matchEventDetailActivity = this.a;
            u0v u0vVar = matchEventDetailActivity.R;
            if (u0vVar == null) {
                Intrinsics.n("matchEventDetailDataSource");
                throw null;
            }
            EventData eventDataF = u0vVar.f(string);
            if (eventDataF != null) {
                List<Event> list = eventDataF.events;
                list.getClass();
                matchEventDetailActivity.F = (Event) CollectionsKt.firstOrNull(list);
            }
            cd cdVar = matchEventDetailActivity.B;
            if (cdVar != null) {
                cdVar.H.setCurrentItem(i);
            }
            cd cdVar2 = matchEventDetailActivity.B;
            if (cdVar2 != null) {
                int selectedTabPosition = cdVar2.F.getSelectedTabPosition();
                Integer numValueOf = Integer.valueOf(selectedTabPosition);
                if (selectedTabPosition == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    MarketCategory marketCategory = (MarketCategory) CollectionsKt.V(numValueOf.intValue(), ((n4p) matchEventDetailActivity.C1()).z(((n4p) matchEventDetailActivity.C1()).c()));
                    if (marketCategory != null) {
                        m3v m3vVarI1 = matchEventDetailActivity.I1();
                        String id = marketCategory.getId();
                        id.getClass();
                        if (!m3vVarI1.i.H()) {
                            ej5.c(o8i0.d(m3vVarI1), null, null, new f3v(m3vVarI1, id, null), 3);
                        }
                    }
                }
            }
            matchEventDetailActivity.V1("detail_market_category_tab_" + ((Object) gVar.c));
        }
    }
}

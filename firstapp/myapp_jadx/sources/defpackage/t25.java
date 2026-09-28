package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.plugin.realsports.data.BoostInfo;
import com.sportybet.plugin.realsports.data.BoostResult;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.live.data.LiveBoostMatchItem;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class t25 {
    public static final BoostResult a(BoostInfo boostInfo) {
        Object bVar;
        boostInfo.getClass();
        try {
            zi50.a aVar = zi50.b;
            eal ealVar = new eal();
            long j = boostInfo.usableTime;
            long j2 = boostInfo.expireTime;
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z = false;
            if (j <= jCurrentTimeMillis && jCurrentTimeMillis <= j2) {
                z = true;
            }
            bcp bcpVar = boostInfo.details;
            bcpVar.getClass();
            ArrayList arrayList = new ArrayList(l48.r(bcpVar, 10));
            Iterator<tcp> it = bcpVar.iterator();
            while (it.hasNext()) {
                arrayList.add((LiveBoostMatchItem) ealVar.b(it.next(), LiveBoostMatchItem.class));
            }
            bVar = new BoostResult(z, arrayList);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        zi50.a aVar3 = zi50.b;
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        return (BoostResult) bVar;
    }

    public static final boolean b(Event event, BoostResult boostResult) {
        Sport sport;
        Category category;
        Tournament tournament;
        String str;
        mfb0 mfb0VarE;
        RegularMarketRule regularMarketRuleN;
        String str2;
        List<LiveBoostMatchItem> boostMatchList;
        event.getClass();
        boostResult.getClass();
        int i = event.status;
        if (i < 1 || i > 2 || (sport = event.sport) == null || (category = sport.category) == null || (tournament = category.tournament) == null || (str = tournament.id) == null || (mfb0VarE = lfb0.d().e(event.sport.id)) == null || (regularMarketRuleN = mfb0VarE.n()) == null || (str2 = regularMarketRuleN.a) == null || ((boostMatchList = boostResult.getBoostMatchList()) != null && boostMatchList.isEmpty())) {
            return false;
        }
        for (LiveBoostMatchItem liveBoostMatchItem : boostMatchList) {
            if (byx.f(liveBoostMatchItem.getTournamentId(), str) && byx.f(liveBoostMatchItem.getMarketId(), str2)) {
                return true;
            }
        }
        return false;
    }

    public static c1g0 c(a aVar) {
        qyd0 qyd0Var = oib0.a;
        return d1g0.c(((lib0) aVar.O(qyd0Var)).H0, 0L, ((lib0) aVar.O(qyd0Var)).a0, ((lib0) aVar.O(qyd0Var)).o, ((lib0) aVar.O(qyd0Var)).a0, 0L, aVar, 34);
    }
}

package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Sport;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a8z {
    public final s1p a;
    public final g1p b;
    public final sfy c;

    public a8z(s1p s1pVar, g1p g1pVar, sfy sfyVar) {
        sfyVar.getClass();
        this.a = s1pVar;
        this.b = g1pVar;
        this.c = sfyVar;
    }

    public final z7z a(Event event, Market market, Outcome outcome) {
        List<Outcome> list;
        String str;
        if (event == null || market == null || outcome == null) {
            return z7z.c.a;
        }
        if (this.a.a(event.eventId, market.status, outcome)) {
            return new z7z.b(this.c.a(outcome));
        }
        g1p g1pVar = this.b;
        if (qq1.c(g1pVar.b, BOConfigParam.OddsBoostPrematchBoostEnabled, g1pVar.c.b().a()) && g1pVar.a.isLogin() && market.isPreMatch() && outcome.isActive != 0 && market.status == 0) {
            Sport sport = event.sport;
            Object next = null;
            if (Intrinsics.g(sport != null ? sport.id : null, "sr:sport:1") && event.oddsBoost && Intrinsics.g(market.id, "1") && (list = market.outcomes) != null && !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        String str2 = ((Outcome) next).odds;
                        str2.getClass();
                        BigDecimal bigDecimalG = b.g(str2);
                        if (bigDecimalG == null) {
                            bigDecimalG = BigDecimal.ZERO;
                        }
                        do {
                            Object next2 = it.next();
                            String str3 = ((Outcome) next2).odds;
                            str3.getClass();
                            BigDecimal bigDecimalG2 = b.g(str3);
                            if (bigDecimalG2 == null) {
                                bigDecimalG2 = BigDecimal.ZERO;
                            }
                            if (bigDecimalG.compareTo(bigDecimalG2) < 0) {
                                next = next2;
                                bigDecimalG = bigDecimalG2;
                            }
                        } while (it.hasNext());
                    }
                }
                Outcome outcome2 = (Outcome) next;
                if (outcome2 != null && (outcome2 == outcome || ((str = outcome.id) != null && Intrinsics.g(outcome2.id, str)))) {
                    return z7z.a.a;
                }
            }
        }
        return z7z.c.a;
    }
}

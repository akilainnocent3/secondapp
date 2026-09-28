package defpackage;

import com.appsflyer.internal.y;
import com.sporty.android.book.data.entity.RelatedBetRequest;
import com.sporty.android.book.domain.entity.Event;
import com.sporty.android.book.domain.entity.Market;
import com.sporty.android.book.domain.entity.Outcome;

/* JADX INFO: loaded from: classes4.dex */
public final class h880 {
    public static final RelatedBetRequest.Selection a(Event event) throws Exception {
        String id;
        String id2;
        String odds;
        event.getClass();
        String sportId = event.getSportId();
        String tournamentId = event.getTournamentId();
        String str = tournamentId.length() == 0 ? null : tournamentId;
        if (str == null) {
            y.a("tournamentId is null.");
            return null;
        }
        String eventId = event.getEventId();
        Market primaryMarket = event.getPrimaryMarket();
        if (primaryMarket == null || (id = primaryMarket.getId()) == null) {
            y.a("marketId is null.");
            return null;
        }
        Outcome primaryOutcome = event.getPrimaryOutcome();
        if (primaryOutcome == null || (id2 = primaryOutcome.getId()) == null) {
            y.a("outcomeId is null.");
            return null;
        }
        Market primaryMarket2 = event.getPrimaryMarket();
        String specifier = primaryMarket2 != null ? primaryMarket2.getSpecifier() : null;
        Outcome primaryOutcome2 = event.getPrimaryOutcome();
        if (primaryOutcome2 != null && (odds = primaryOutcome2.getOdds()) != null) {
            return new RelatedBetRequest.Selection(sportId, str, eventId, id, id2, specifier, odds, true);
        }
        y.a("odds is null.");
        return null;
    }
}

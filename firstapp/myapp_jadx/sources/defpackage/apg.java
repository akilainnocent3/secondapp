package defpackage;

import com.sporty.android.book.presentation.eventsorting.EventStreamType;
import com.sportybet.android.bookingcode.presentation.uistate.HighLiabilityItemUiState;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class apg {
    public static final LinkedHashMap a(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String str = ((Event) obj).parentBetBuilderMarketId;
                if (str != null && str.length() != 0) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                Event event = (Event) obj2;
                List<Market> list2 = event.markets;
                if (list2 != null) {
                    for (Market market : list2) {
                        List<Outcome> list3 = market.outcomes;
                        if (list3 != null) {
                            for (Outcome outcome : list3) {
                                String str2 = event.parentBetBuilderMarketId;
                                if (linkedHashMap.containsKey(str2)) {
                                    Object obj3 = linkedHashMap.get(str2);
                                    obj3.getClass();
                                    linkedHashMap.put(str2, CollectionsKt.j0((Collection) obj3, new Selection(event, market, outcome)));
                                } else {
                                    linkedHashMap.put(str2, a.c(new Selection(event, market, outcome)));
                                }
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String b(Event event, Market market) {
        event.getClass();
        market.getClass();
        String str = market.specifier;
        String strConcat = str != null ? "?".concat(str) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        String str2 = event.eventId;
        int i = market.product;
        String str3 = event.sport.id;
        String str4 = market.id;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("/");
        sb.append(i);
        sb.append("/");
        sb.append(str3);
        return pr0.a(sb, "/", str4, strConcat);
    }

    public static final String c(Event event) {
        Category category;
        Tournament tournament;
        event.getClass();
        Sport sport = event.sport;
        String str = (sport == null || (category = sport.category) == null || (tournament = category.tournament) == null) ? null : tournament.name;
        return str == null ? "" : str;
    }

    public static final String d(Event event) {
        String lowerCase;
        String str;
        event.getClass();
        Sport sport = event.sport;
        if (sport == null || (str = sport.name) == null) {
            lowerCase = null;
        } else {
            lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        return lowerCase == null ? "" : lowerCase;
    }

    public static final boolean e(Event event, Set set) {
        event.getClass();
        set.getClass();
        if (event.hasLiveStream() && set.contains(EventStreamType.SPORTY_TV)) {
            return true;
        }
        return event.hasAudioStream() && set.contains(EventStreamType.SPORTY_FM);
    }

    public static final Event f(Event event) {
        Category category;
        Tournament tournament;
        event.getClass();
        Event event2 = new Event(event);
        event2.markets = null;
        Tournament tournament2 = event2.tournament;
        if (tournament2 != null) {
            tournament2.events = null;
        }
        Sport sport = event2.sport;
        if (sport != null && (category = sport.category) != null && (tournament = category.tournament) != null) {
            tournament.events = null;
        }
        if (sport != null) {
            sport.categories = null;
        }
        return event2;
    }

    public static final HighLiabilityItemUiState g(Event event, List list) {
        CharSequence charSequence;
        String str;
        Tournament tournament;
        List<Outcome> list2;
        List<Outcome> list3;
        event.getClass();
        list.getClass();
        if (event.isBetBuilderChild()) {
            return null;
        }
        List<Market> list4 = event.markets;
        list4.getClass();
        Market market = (Market) CollectionsKt.firstOrNull(list4);
        Outcome outcome = (market == null || (list3 = market.outcomes) == null) ? null : (Outcome) CollectionsKt.firstOrNull(list3);
        if (event.isBetBuilderParent()) {
            j7g j7gVar = new j7g();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.g(((Event) obj).parentBetBuilderMarketId, market != null ? market.id : null)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                List<Market> list5 = ((Event) obj2).markets;
                Market market2 = list5 != null ? (Market) CollectionsKt.firstOrNull(list5) : null;
                Outcome outcome2 = (market2 == null || (list2 = market2.outcomes) == null) ? null : (Outcome) CollectionsKt.firstOrNull(list2);
                j7gVar.k(outcome2 != null ? outcome2.desc : null);
                j7gVar.a("  ");
                j7gVar.a(market2 != null ? market2.desc : null);
                j7gVar.a("\n");
            }
            CharSequence charSequenceT0 = StringsKt.t0(j7gVar);
            if (charSequenceT0.length() <= 0) {
                charSequenceT0 = null;
            }
            charSequence = charSequenceT0;
        } else {
            charSequence = null;
        }
        String str2 = event.eventId;
        if (str2 == null) {
            str2 = "";
        }
        Sport sport = event.sport;
        String str3 = sport.id;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = market != null ? market.id : null;
        if (str4 == null) {
            str4 = "";
        }
        int i2 = market != null ? market.product : 0;
        if (market == null || (str = market.specifier) == null) {
            str = "";
        }
        String str5 = outcome != null ? outcome.id : null;
        if (str5 == null) {
            str5 = "";
        }
        int i3 = market != null ? market.status : 0;
        String str6 = market != null ? market.desc : null;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = outcome != null ? outcome.desc : null;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = outcome != null ? outcome.odds : null;
        if (str8 == null) {
            str8 = "";
        }
        double d = outcome != null ? outcome.probability : 0.0d;
        String str9 = str6;
        int i4 = outcome != null ? outcome.isActive : 0;
        int i5 = outcome != null ? outcome.oddsChangesFlag : 0;
        String str10 = event.homeTeamName;
        String str11 = str10 == null ? "" : str10;
        String str12 = event.awayTeamName;
        String str13 = str12 == null ? "" : str12;
        Category category = sport.category;
        String str14 = (category == null || (tournament = category.tournament) == null) ? null : tournament.name;
        return new HighLiabilityItemUiState(str2, str3, str4, i2, str, str5, i3, str9, str7, str8, d, i4, i5, str11, str13, str14 == null ? "" : str14, event.estimateStartTime, charSequence);
    }

    public static final String h(Event event) {
        event.getClass();
        Sport sport = event.sport;
        String str = sport.name;
        Category category = sport.category;
        return str + " - " + category.name + " - " + category.tournament.name;
    }

    public static final Event i(com.sporty.android.book.domain.entity.Event event) {
        event.getClass();
        Event event2 = new Event();
        event2.eventId = event.getEventId();
        event2.gameId = event.getGameId();
        event2.status = event.getStatus();
        event2.estimateStartTime = event.getEstimateStartTime();
        event2.matchStatus = event.getMatchStatus();
        event2.homeTeamName = event.getHomeTeamName();
        event2.awayTeamName = event.getAwayTeamName();
        event2.topTeam = event.getTopTeam();
        event2.matchTrackerNotAllowed = event.getMatchTrackerNotAllowed();
        event2.eventSource = event.getEventSource();
        Sport sport = new Sport();
        sport.id = event.getSportId();
        sport.name = event.getSportName();
        Category category = new Category();
        category.id = event.getSportCategoryId();
        category.name = event.getSportCategoryName();
        Tournament tournament = new Tournament();
        tournament.id = event.getTournamentId();
        tournament.name = event.getTournamentName();
        category.tournament = tournament;
        sport.category = category;
        event2.sport = sport;
        List<com.sporty.android.book.domain.entity.Market> markets = event.getMarkets();
        ArrayList arrayList = new ArrayList(l48.r(markets, 10));
        Iterator<T> it = markets.iterator();
        while (it.hasNext()) {
            arrayList.add(vpu.k((com.sporty.android.book.domain.entity.Market) it.next()));
        }
        event2.markets = arrayList;
        return event2;
    }
}

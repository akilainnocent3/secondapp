package defpackage;

import com.sporty.android.core.model.bookingcode.CategoryDto;
import com.sporty.android.core.model.bookingcode.EventDto;
import com.sporty.android.core.model.bookingcode.MarketDto;
import com.sporty.android.core.model.bookingcode.OutcomeDto;
import com.sporty.android.core.model.bookingcode.SmartRemixEligibilityResponse;
import com.sporty.android.core.model.bookingcode.SmartRemixTicketDto;
import com.sporty.android.core.model.bookingcode.SportDto;
import com.sporty.android.core.model.bookingcode.TournamentDto;
import com.sportybet.android.bookingcode.presentation.uistate.HighLiabilityItemUiState;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes4.dex */
public final class gj7 {
    public final e2a0 a;

    public gj7(e2a0 e2a0Var, d1a d1aVar) {
        e2a0Var.getClass();
        this.a = e2a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(x1b x1bVar, String str, List list) {
        fj7 fj7Var;
        List list2;
        Sport sport;
        Selection selection;
        Market market;
        List<Outcome> list3;
        Outcome outcome;
        Double dH;
        Category category;
        Category category2;
        Category category3;
        TournamentDto tournament;
        TournamentDto tournament2;
        OutcomeDto outcomeDto;
        HighLiabilityItemUiState highLiabilityItemUiState;
        CategoryDto category4;
        TournamentDto tournament3;
        Double dH2;
        if (x1bVar instanceof fj7) {
            fj7Var = (fj7) x1bVar;
            int i = fj7Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fj7Var.d = i - Integer.MIN_VALUE;
            } else {
                fj7Var = new fj7(this, x1bVar);
            }
        } else {
            fj7Var = new fj7(this, x1bVar);
        }
        Object obj = fj7Var.b;
        y5b y5bVar = y5b.a;
        int i2 = fj7Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            fj7Var.a = list;
            fj7Var.d = 1;
            Object objA = this.a.a(str, fj7Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
            obj = objA;
            list2 = list;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = fj7Var.a;
            uj50.b(obj);
        }
        SmartRemixEligibilityResponse smartRemixEligibilityResponse = (SmartRemixEligibilityResponse) obj;
        String shareCode = smartRemixEligibilityResponse.getShareCode();
        if (shareCode == null || StringsKt.U(shareCode)) {
            shareCode = null;
        }
        SmartRemixTicketDto ticket = smartRemixEligibilityResponse.getTicket();
        Integer orderType = ticket != null ? ticket.getOrderType() : null;
        List<EventDto> outcomes = smartRemixEligibilityResponse.getOutcomes();
        if (shareCode == null || outcomes == null || outcomes.isEmpty()) {
            throw new l2a0();
        }
        ArrayList arrayListA = kw5.a(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            HighLiabilityItemUiState highLiabilityItemUiStateG = apg.g((Event) it.next(), list2);
            if (highLiabilityItemUiStateG != null) {
                arrayListA.add(highLiabilityItemUiStateG);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (EventDto eventDto : outcomes) {
            eventDto.getClass();
            MarketDto marketDto = (MarketDto) CollectionsKt.firstOrNull(eventDto.getMarkets());
            if (marketDto == null || (outcomeDto = (OutcomeDto) CollectionsKt.firstOrNull(marketDto.getOutcomes())) == null) {
                highLiabilityItemUiState = null;
            } else {
                String eventId = eventDto.getEventId();
                String str2 = eventId == null ? "" : eventId;
                SportDto sport2 = eventDto.getSport();
                String id = sport2 != null ? sport2.getId() : null;
                String str3 = id == null ? "" : id;
                String id2 = marketDto.getId();
                String str4 = id2 == null ? "" : id2;
                Integer product = marketDto.getProduct();
                int iIntValue = product != null ? product.intValue() : 0;
                String specifier = marketDto.getSpecifier();
                String str5 = specifier == null ? "" : specifier;
                Integer status = marketDto.getStatus();
                int iIntValue2 = status != null ? status.intValue() : 0;
                String desc = marketDto.getDesc();
                String str6 = desc == null ? "" : desc;
                String id3 = outcomeDto.getId();
                String str7 = id3 == null ? "" : id3;
                String desc2 = outcomeDto.getDesc();
                String str8 = desc2 == null ? "" : desc2;
                String odds = outcomeDto.getOdds();
                String str9 = odds == null ? "" : odds;
                String probability = outcomeDto.getProbability();
                double dDoubleValue = (probability == null || (dH2 = b.h(probability)) == null) ? 0.0d : dH2.doubleValue();
                Integer numIsActive = outcomeDto.isActive();
                int iIntValue3 = numIsActive != null ? numIsActive.intValue() : 0;
                String homeTeamName = eventDto.getHomeTeamName();
                String str10 = homeTeamName == null ? "" : homeTeamName;
                String awayTeamName = eventDto.getAwayTeamName();
                String str11 = awayTeamName == null ? "" : awayTeamName;
                SportDto sport3 = eventDto.getSport();
                String name = (sport3 == null || (category4 = sport3.getCategory()) == null || (tournament3 = category4.getTournament()) == null) ? null : tournament3.getName();
                String str12 = name == null ? "" : name;
                Long estimateStartTime = eventDto.getEstimateStartTime();
                highLiabilityItemUiState = new HighLiabilityItemUiState(str2, str3, str4, iIntValue, str5, str7, iIntValue2, str6, str8, str9, dDoubleValue, iIntValue3, 0, str10, str11, str12, estimateStartTime != null ? estimateStartTime.longValue() : 0L, null, 135168, null);
            }
            if (highLiabilityItemUiState != null) {
                arrayList.add(highLiabilityItemUiState);
            }
        }
        int i3 = 10;
        ArrayList arrayList2 = new ArrayList(l48.r(arrayListA, 10));
        int size = arrayListA.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayListA.get(i4);
            i4++;
            arrayList2.add(i2a0.a((HighLiabilityItemUiState) obj2));
        }
        Set setE0 = CollectionsKt.E0(arrayList2);
        ArrayList arrayList3 = new ArrayList(l48.r(arrayList, 10));
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj3 = arrayList.get(i5);
            i5++;
            arrayList3.add(i2a0.a((HighLiabilityItemUiState) obj3));
        }
        Set setE1 = CollectionsKt.E0(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayListA.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj4 = arrayListA.get(i6);
            i6++;
            if (!setE1.contains(i2a0.a((HighLiabilityItemUiState) obj4))) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size4 = arrayList.size();
        int i7 = 0;
        while (i7 < size4) {
            Object obj5 = arrayList.get(i7);
            i7++;
            if (!setE0.contains(i2a0.a((HighLiabilityItemUiState) obj5))) {
                arrayList5.add(obj5);
            }
        }
        c2a0 c2a0Var = new c2a0(arrayList4, arrayList5);
        if (arrayList4.isEmpty() && arrayList5.isEmpty()) {
            throw new l2a0();
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it2 = outcomes.iterator();
        while (it2.hasNext()) {
            EventDto eventDto2 = (EventDto) it2.next();
            Event event = new Event();
            event.eventId = eventDto2.getEventId();
            event.gameId = eventDto2.getGameId();
            event.productStatus = eventDto2.getProductStatus();
            Long estimateStartTime2 = eventDto2.getEstimateStartTime();
            event.estimateStartTime = estimateStartTime2 != null ? estimateStartTime2.longValue() : 0L;
            Integer status2 = eventDto2.getStatus();
            event.status = status2 != null ? status2.intValue() : 0;
            event.setScore = eventDto2.getSetScore();
            event.gameScore = eventDto2.getGameScore();
            event.period = eventDto2.getPeriod();
            event.playedSeconds = eventDto2.getPlayedSeconds();
            event.homeTeamName = eventDto2.getHomeTeamName();
            event.awayTeamName = eventDto2.getAwayTeamName();
            SportDto sport4 = eventDto2.getSport();
            if (sport4 != null) {
                sport = new Sport();
                sport.id = sport4.getId();
                sport.name = sport4.getName();
                Category category5 = new Category();
                CategoryDto category6 = sport4.getCategory();
                category5.id = category6 != null ? category6.getId() : null;
                CategoryDto category7 = sport4.getCategory();
                category5.name = category7 != null ? category7.getName() : null;
                Tournament tournament4 = new Tournament();
                CategoryDto category8 = sport4.getCategory();
                tournament4.id = (category8 == null || (tournament2 = category8.getTournament()) == null) ? null : tournament2.getId();
                CategoryDto category9 = sport4.getCategory();
                tournament4.name = (category9 == null || (tournament = category9.getTournament()) == null) ? null : tournament.getName();
                category5.tournament = tournament4;
                sport.category = category5;
            } else {
                sport = null;
            }
            event.sport = sport;
            event.tournament = (sport == null || (category3 = sport.category) == null) ? null : category3.tournament;
            event.categoryId = (sport == null || (category2 = sport.category) == null) ? null : category2.id;
            event.categoryName = (sport == null || (category = sport.category) == null) ? null : category.name;
            List<MarketDto> markets = eventDto2.getMarkets();
            ArrayList arrayList7 = new ArrayList(l48.r(markets, i3));
            for (MarketDto marketDto2 : markets) {
                Market market2 = new Market();
                market2.id = marketDto2.getId();
                Integer product2 = marketDto2.getProduct();
                market2.product = product2 != null ? product2.intValue() : 0;
                market2.desc = marketDto2.getDesc();
                market2.specifier = marketDto2.getSpecifier();
                Integer status3 = marketDto2.getStatus();
                market2.status = status3 != null ? status3.intValue() : 0;
                market2.group = marketDto2.getGroup();
                market2.marketGuide = marketDto2.getMarketGuide();
                Integer favourite = marketDto2.getFavourite();
                market2.favourite = favourite != null ? String.valueOf(favourite.intValue()) : null;
                List<OutcomeDto> outcomes2 = marketDto2.getOutcomes();
                ArrayList arrayList8 = new ArrayList(l48.r(outcomes2, i3));
                for (Iterator it3 = outcomes2.iterator(); it3.hasNext(); it3 = it3) {
                    OutcomeDto outcomeDto2 = (OutcomeDto) it3.next();
                    Outcome outcome2 = new Outcome();
                    Iterator it4 = it2;
                    outcome2.id = outcomeDto2.getId();
                    outcome2.odds = outcomeDto2.getOdds();
                    String probability2 = outcomeDto2.getProbability();
                    outcome2.probability = (probability2 == null || (dH = b.h(probability2)) == null) ? 0.0d : dH.doubleValue();
                    Integer numIsActive2 = outcomeDto2.isActive();
                    outcome2.isActive = numIsActive2 != null ? numIsActive2.intValue() : 0;
                    outcome2.desc = outcomeDto2.getDesc();
                    arrayList8.add(outcome2);
                    marketDto2 = marketDto2;
                    it2 = it4;
                }
                Iterator it5 = it2;
                market2.outcomes = arrayList8;
                Long lastOddsChangeTime = marketDto2.getLastOddsChangeTime();
                market2.lastOddsChangeTime = lastOddsChangeTime != null ? lastOddsChangeTime.longValue() : -1L;
                arrayList7.add(market2);
                it2 = it5;
                i3 = 10;
            }
            Iterator it6 = it2;
            event.markets = arrayList7;
            Boolean matchTrackerNotAllowed = eventDto2.getMatchTrackerNotAllowed();
            event.matchTrackerNotAllowed = matchTrackerNotAllowed != null ? matchTrackerNotAllowed.booleanValue() : false;
            List<Market> list4 = event.markets;
            if (list4 == null || (market = (Market) CollectionsKt.firstOrNull(list4)) == null || (list3 = market.outcomes) == null || (outcome = (Outcome) CollectionsKt.firstOrNull(list3)) == null) {
                selection = null;
            } else {
                selection = new Selection(event, market, outcome);
                selection.f = shareCode;
            }
            if (selection != null) {
                arrayList6.add(selection);
            }
            it2 = it6;
            i3 = 10;
        }
        return new d2a0(shareCode, orderType, arrayList6, c2a0Var);
    }
}

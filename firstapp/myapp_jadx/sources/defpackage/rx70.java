package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.searchv2.data.model.SearchCategoryDto;
import com.sportybet.plugin.realsports.searchv2.data.model.SearchGameDto;
import com.sportybet.plugin.realsports.searchv2.data.model.SearchResultsDto;
import com.sportybet.plugin.realsports.searchv2.data.model.SearchTeamDto;
import com.sportybet.plugin.realsports.searchv2.data.model.SearchTournamentDto;
import com.sportybet.plugin.realsports.searchv2.domain.model.SearchFeatureConfig;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class rx70 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [m2g] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [m2g] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [m2g] */
    public static final mx70 a(SearchResultsDto searchResultsDto, lfb0 lfb0Var, SearchFeatureConfig searchFeatureConfig) {
        vw70 vw70Var;
        Iterator it;
        SearchCategoryDto searchCategoryDto;
        String str;
        List list;
        ?? arrayList;
        ?? arrayList2;
        int i;
        ?? arrayList3;
        searchResultsDto.getClass();
        lfb0Var.getClass();
        searchFeatureConfig.getClass();
        String query = searchResultsDto.getQuery();
        List<SearchCategoryDto> results = searchResultsDto.getResults();
        int i2 = 10;
        ArrayList arrayList4 = new ArrayList(l48.r(results, 10));
        Iterator it2 = results.iterator();
        while (it2.hasNext()) {
            SearchCategoryDto searchCategoryDto2 = (SearchCategoryDto) it2.next();
            String type = searchCategoryDto2.getType();
            String categoryId = searchCategoryDto2.getCategoryId();
            String categoryName = searchCategoryDto2.getCategoryName();
            String categoryIcon = searchCategoryDto2.getCategoryIcon();
            if (searchFeatureConfig.getMatchesSectionEnabled()) {
                List<Event> live = searchCategoryDto2.getMatches().getLive();
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = live.iterator();
                while (it3.hasNext()) {
                    fu70 fu70VarB = b((Event) it3.next(), lfb0Var);
                    if (fu70VarB != null) {
                        arrayList5.add(fu70VarB);
                    }
                }
                List<Event> upcoming = searchCategoryDto2.getMatches().getUpcoming();
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = upcoming.iterator();
                while (it4.hasNext()) {
                    fu70 fu70VarB2 = b((Event) it4.next(), lfb0Var);
                    if (fu70VarB2 != null) {
                        arrayList6.add(fu70VarB2);
                    }
                }
                vw70Var = new vw70(arrayList5, arrayList6);
            } else {
                m2g m2gVar = m2g.a;
                vw70Var = new vw70(m2gVar, m2gVar);
            }
            vw70 vw70Var2 = vw70Var;
            if (searchFeatureConfig.getTeamsSectionEnabled()) {
                List<SearchTeamDto> teams = searchCategoryDto2.getTeams();
                ArrayList arrayList7 = new ArrayList(l48.r(teams, i2));
                Iterator it5 = teams.iterator();
                while (it5.hasNext()) {
                    SearchTeamDto searchTeamDto = (SearchTeamDto) it5.next();
                    String teamId = searchTeamDto.getTeamId();
                    String teamName = searchTeamDto.getTeamName();
                    String teamIcon = searchTeamDto.getTeamIcon();
                    List<SearchTournamentDto> tournaments = searchTeamDto.getTournaments();
                    Iterator it6 = it2;
                    SearchCategoryDto searchCategoryDto3 = searchCategoryDto2;
                    Iterator it7 = it5;
                    ArrayList arrayList8 = new ArrayList(l48.r(tournaments, 10));
                    Iterator it8 = tournaments.iterator();
                    while (it8.hasNext()) {
                        SearchTournamentDto searchTournamentDto = (SearchTournamentDto) it8.next();
                        arrayList8.add(new n080(searchTournamentDto.getTournamentId(), searchTournamentDto.getTournamentName(), searchTournamentDto.getTournamentIcon()));
                        it8 = it8;
                        type = type;
                    }
                    arrayList7.add(new qz70(teamId, teamName, teamIcon, arrayList8));
                    it2 = it6;
                    searchCategoryDto2 = searchCategoryDto3;
                    it5 = it7;
                }
                it = it2;
                searchCategoryDto = searchCategoryDto2;
                str = type;
                list = arrayList7;
            } else {
                it = it2;
                searchCategoryDto = searchCategoryDto2;
                str = type;
                list = m2g.a;
            }
            if (searchFeatureConfig.getLeaguesSectionEnabled()) {
                List<SearchTournamentDto> tournaments2 = searchCategoryDto.getTournaments();
                arrayList = new ArrayList(l48.r(tournaments2, 10));
                for (SearchTournamentDto searchTournamentDto2 : tournaments2) {
                    arrayList.add(new n080(searchTournamentDto2.getTournamentId(), searchTournamentDto2.getTournamentName(), searchTournamentDto2.getTournamentIcon()));
                }
            } else {
                arrayList = m2g.a;
            }
            ?? r13 = arrayList;
            if (searchFeatureConfig.getPlayersSectionEnabled()) {
                List<Event> players = searchCategoryDto.getPlayers();
                arrayList2 = new ArrayList();
                Iterator it9 = players.iterator();
                while (it9.hasNext()) {
                    fu70 fu70VarB3 = b((Event) it9.next(), lfb0Var);
                    if (fu70VarB3 != null) {
                        arrayList2.add(fu70VarB3);
                    }
                }
            } else {
                arrayList2 = m2g.a;
            }
            ?? r14 = arrayList2;
            if (searchFeatureConfig.getGamesSectionEnabled()) {
                List<SearchGameDto> games = searchCategoryDto.getGames();
                i = 10;
                arrayList3 = new ArrayList(l48.r(games, 10));
                for (SearchGameDto searchGameDto : games) {
                    arrayList3.add(new zv70(searchGameDto.getGameId(), searchGameDto.getGameName(), searchGameDto.getGameCategory(), searchGameDto.getGameIcon(), searchGameDto.getGameLink()));
                }
            } else {
                i = 10;
                arrayList3 = m2g.a;
            }
            arrayList4.add(new vt70(str, categoryId, categoryName, categoryIcon, vw70Var2, list, r13, r14, arrayList3));
            i2 = i;
            it2 = it;
        }
        ArrayList arrayList9 = new ArrayList();
        int size = arrayList4.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList4.get(i3);
            i3++;
            vt70 vt70Var = (vt70) obj;
            if (!vt70Var.e.a.isEmpty() || !vt70Var.e.b.isEmpty() || !vt70Var.f.isEmpty() || !vt70Var.g.isEmpty() || !vt70Var.h.isEmpty() || !vt70Var.i.isEmpty()) {
                arrayList9.add(obj);
            }
        }
        return new mx70(arrayList9, query);
    }

    public static final fu70 b(Event event, lfb0 lfb0Var) {
        String str;
        mfb0 mfb0VarE;
        Sport sport = event.sport;
        Object obj = null;
        if (sport != null && (str = sport.id) != null && (mfb0VarE = lfb0Var.e(str)) != null) {
            List list = event.markets;
            if (list == null) {
                list = m2g.a;
            }
            Market market = (Market) CollectionsKt.firstOrNull(list);
            if (market != null) {
                List<RegularMarketRule> listV = mfb0VarE.v();
                listV.getClass();
                for (Object obj2 : listV) {
                    if (Intrinsics.g(((RegularMarketRule) obj2).a, market.id)) {
                        obj = obj2;
                        break;
                    }
                }
                return new fu70(event, (RegularMarketRule) obj, mfb0VarE, System.currentTimeMillis());
            }
        }
        return null;
    }
}

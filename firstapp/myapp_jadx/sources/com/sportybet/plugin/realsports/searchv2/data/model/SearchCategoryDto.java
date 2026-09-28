package com.sportybet.plugin.realsports.searchv2.data.model;

import com.sportybet.plugin.realsports.data.Event;
import defpackage.ai50;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.m2g;
import defpackage.ng1;
import defpackage.qpu;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\nHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\nHÆ\u0003J{\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nHÆ\u0001J\u0014\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020.HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cÊ\u0001\u0002\b1Ê\u0001\f\b2\u0012\b\b3\u0012\u0004\b\u0003\u0010\u0000¨\u00060"}, d2 = {"Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchCategoryDto;", "", "type", "", "categoryId", "categoryName", "categoryIcon", "matches", "Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchMatchesDto;", "teams", "", "Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchTeamDto;", "tournaments", "Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchTournamentDto;", "players", "Lcom/sportybet/plugin/realsports/data/Event;", "games", "Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchGameDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchMatchesDto;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getCategoryId", "getCategoryName", "getCategoryIcon", "getMatches", "()Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchMatchesDto;", "getTeams", "()Ljava/util/List;", "getTournaments", "getPlayers", "getGames", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SearchCategoryDto {
    public static final int $stable = SearchMatchesDto.$stable;
    private final String categoryIcon;
    private final String categoryId;
    private final String categoryName;
    private final List<SearchGameDto> games;
    private final SearchMatchesDto matches;
    private final List<Event> players;
    private final List<SearchTeamDto> teams;
    private final List<SearchTournamentDto> tournaments;
    private final String type;

    public SearchCategoryDto(String str, String str2, String str3, String str4, SearchMatchesDto searchMatchesDto, List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? new SearchMatchesDto(null, null, 3, null) : searchMatchesDto, (i & 32) != 0 ? m2g.a : list, (i & 64) != 0 ? m2g.a : list2, (i & 128) != 0 ? m2g.a : list3, (i & 256) != 0 ? m2g.a : list4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchCategoryDto copy$default(SearchCategoryDto searchCategoryDto, String str, String str2, String str3, String str4, SearchMatchesDto searchMatchesDto, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchCategoryDto.type;
        }
        if ((i & 2) != 0) {
            str2 = searchCategoryDto.categoryId;
        }
        if ((i & 4) != 0) {
            str3 = searchCategoryDto.categoryName;
        }
        if ((i & 8) != 0) {
            str4 = searchCategoryDto.categoryIcon;
        }
        if ((i & 16) != 0) {
            searchMatchesDto = searchCategoryDto.matches;
        }
        if ((i & 32) != 0) {
            list = searchCategoryDto.teams;
        }
        if ((i & 64) != 0) {
            list2 = searchCategoryDto.tournaments;
        }
        if ((i & 128) != 0) {
            list3 = searchCategoryDto.players;
        }
        if ((i & 256) != 0) {
            list4 = searchCategoryDto.games;
        }
        List list5 = list3;
        List list6 = list4;
        List list7 = list;
        List list8 = list2;
        SearchMatchesDto searchMatchesDto2 = searchMatchesDto;
        String str5 = str3;
        return searchCategoryDto.copy(str, str2, str5, str4, searchMatchesDto2, list7, list8, list5, list6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCategoryIcon() {
        return this.categoryIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SearchMatchesDto getMatches() {
        return this.matches;
    }

    public final List<SearchTeamDto> component6() {
        return this.teams;
    }

    public final List<SearchTournamentDto> component7() {
        return this.tournaments;
    }

    public final List<Event> component8() {
        return this.players;
    }

    public final List<SearchGameDto> component9() {
        return this.games;
    }

    public final SearchCategoryDto copy(String type, String categoryId, String categoryName, String categoryIcon, SearchMatchesDto matches, List<SearchTeamDto> teams, List<SearchTournamentDto> tournaments, List<? extends Event> players, List<SearchGameDto> games) {
        type.getClass();
        categoryId.getClass();
        categoryName.getClass();
        categoryIcon.getClass();
        matches.getClass();
        teams.getClass();
        tournaments.getClass();
        players.getClass();
        games.getClass();
        return new SearchCategoryDto(type, categoryId, categoryName, categoryIcon, matches, teams, tournaments, players, games);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchCategoryDto)) {
            return false;
        }
        SearchCategoryDto searchCategoryDto = (SearchCategoryDto) other;
        return Intrinsics.g(this.type, searchCategoryDto.type) && Intrinsics.g(this.categoryId, searchCategoryDto.categoryId) && Intrinsics.g(this.categoryName, searchCategoryDto.categoryName) && Intrinsics.g(this.categoryIcon, searchCategoryDto.categoryIcon) && Intrinsics.g(this.matches, searchCategoryDto.matches) && Intrinsics.g(this.teams, searchCategoryDto.teams) && Intrinsics.g(this.tournaments, searchCategoryDto.tournaments) && Intrinsics.g(this.players, searchCategoryDto.players) && Intrinsics.g(this.games, searchCategoryDto.games);
    }

    public final String getCategoryIcon() {
        return this.categoryIcon;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final List<SearchGameDto> getGames() {
        return this.games;
    }

    public final SearchMatchesDto getMatches() {
        return this.matches;
    }

    public final List<Event> getPlayers() {
        return this.players;
    }

    public final List<SearchTeamDto> getTeams() {
        return this.teams;
    }

    public final List<SearchTournamentDto> getTournaments() {
        return this.tournaments;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.games.hashCode() + ai50.a(ai50.a(ai50.a((this.matches.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.type.hashCode() * 31, 31, this.categoryId), 31, this.categoryName), 31, this.categoryIcon)) * 31, 31, this.teams), 31, this.tournaments), 31, this.players);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.categoryId;
        String str3 = this.categoryName;
        String str4 = this.categoryIcon;
        SearchMatchesDto searchMatchesDto = this.matches;
        List<SearchTeamDto> list = this.teams;
        List<SearchTournamentDto> list2 = this.tournaments;
        List<Event> list3 = this.players;
        List<SearchGameDto> list4 = this.games;
        StringBuilder sbA = ux5.a("SearchCategoryDto(type=", str, ", categoryId=", str2, ", categoryName=");
        hxa.c(sbA, str3, ", categoryIcon=", str4, ", matches=");
        sbA.append(searchMatchesDto);
        sbA.append(", teams=");
        sbA.append(list);
        sbA.append(", tournaments=");
        qpu.a(", players=", ", games=", sbA, list2, list3);
        return ng1.a(sbA, list4, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchCategoryDto(String str, String str2, String str3, String str4, SearchMatchesDto searchMatchesDto, List<SearchTeamDto> list, List<SearchTournamentDto> list2, List<? extends Event> list3, List<SearchGameDto> list4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        searchMatchesDto.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.type = str;
        this.categoryId = str2;
        this.categoryName = str3;
        this.categoryIcon = str4;
        this.matches = searchMatchesDto;
        this.teams = list;
        this.tournaments = list2;
        this.players = list3;
        this.games = list4;
    }

    public SearchCategoryDto() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}

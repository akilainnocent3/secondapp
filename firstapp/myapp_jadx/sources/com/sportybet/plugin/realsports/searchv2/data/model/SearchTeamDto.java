package com.sportybet.plugin.realsports.searchv2.data.model;

import defpackage.gmf0;
import defpackage.m2g;
import defpackage.nve;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\u0002\b\u001dÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001c"}, d2 = {"Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchTeamDto;", "", "teamId", "", "teamName", "teamIcon", "tournaments", "", "Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchTournamentDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTeamId", "()Ljava/lang/String;", "getTeamName", "getTeamIcon", "getTournaments", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SearchTeamDto {
    public static final int $stable = 8;
    private final String teamIcon;
    private final String teamId;
    private final String teamName;
    private final List<SearchTournamentDto> tournaments;

    public SearchTeamDto(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchTeamDto copy$default(SearchTeamDto searchTeamDto, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchTeamDto.teamId;
        }
        if ((i & 2) != 0) {
            str2 = searchTeamDto.teamName;
        }
        if ((i & 4) != 0) {
            str3 = searchTeamDto.teamIcon;
        }
        if ((i & 8) != 0) {
            list = searchTeamDto.tournaments;
        }
        return searchTeamDto.copy(str, str2, str3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTeamId() {
        return this.teamId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTeamName() {
        return this.teamName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTeamIcon() {
        return this.teamIcon;
    }

    public final List<SearchTournamentDto> component4() {
        return this.tournaments;
    }

    public final SearchTeamDto copy(String teamId, String teamName, String teamIcon, List<SearchTournamentDto> tournaments) {
        teamId.getClass();
        teamName.getClass();
        teamIcon.getClass();
        tournaments.getClass();
        return new SearchTeamDto(teamId, teamName, teamIcon, tournaments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchTeamDto)) {
            return false;
        }
        SearchTeamDto searchTeamDto = (SearchTeamDto) other;
        return Intrinsics.g(this.teamId, searchTeamDto.teamId) && Intrinsics.g(this.teamName, searchTeamDto.teamName) && Intrinsics.g(this.teamIcon, searchTeamDto.teamIcon) && Intrinsics.g(this.tournaments, searchTeamDto.tournaments);
    }

    public final String getTeamIcon() {
        return this.teamIcon;
    }

    public final String getTeamId() {
        return this.teamId;
    }

    public final String getTeamName() {
        return this.teamName;
    }

    public final List<SearchTournamentDto> getTournaments() {
        return this.tournaments;
    }

    public int hashCode() {
        return this.tournaments.hashCode() + gmf0.a(gmf0.a(this.teamId.hashCode() * 31, 31, this.teamName), 31, this.teamIcon);
    }

    public String toString() {
        String str = this.teamId;
        String str2 = this.teamName;
        return nve.a(this.teamIcon, ", tournaments=", ")", ux5.a("SearchTeamDto(teamId=", str, ", teamName=", str2, ", teamIcon="), this.tournaments);
    }

    public SearchTeamDto(String str, String str2, String str3, List<SearchTournamentDto> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.teamId = str;
        this.teamName = str2;
        this.teamIcon = str3;
        this.tournaments = list;
    }

    public SearchTeamDto() {
        this(null, null, null, null, 15, null);
    }
}

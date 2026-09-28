package com.sportybet.plugin.realsports.searchv2.data.model;

import com.appsflyer.internal.m;
import defpackage.gmf0;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\u0002\b\u0017Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchTournamentDto;", "", "tournamentId", "", "tournamentName", "tournamentIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTournamentId", "()Ljava/lang/String;", "getTournamentName", "getTournamentIcon", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SearchTournamentDto {
    public static final int $stable = 0;
    private final String tournamentIcon;
    private final String tournamentId;
    private final String tournamentName;

    public /* synthetic */ SearchTournamentDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public static /* synthetic */ SearchTournamentDto copy$default(SearchTournamentDto searchTournamentDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchTournamentDto.tournamentId;
        }
        if ((i & 2) != 0) {
            str2 = searchTournamentDto.tournamentName;
        }
        if ((i & 4) != 0) {
            str3 = searchTournamentDto.tournamentIcon;
        }
        return searchTournamentDto.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTournamentName() {
        return this.tournamentName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTournamentIcon() {
        return this.tournamentIcon;
    }

    public final SearchTournamentDto copy(String tournamentId, String tournamentName, String tournamentIcon) {
        tournamentId.getClass();
        tournamentName.getClass();
        tournamentIcon.getClass();
        return new SearchTournamentDto(tournamentId, tournamentName, tournamentIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchTournamentDto)) {
            return false;
        }
        SearchTournamentDto searchTournamentDto = (SearchTournamentDto) other;
        return Intrinsics.g(this.tournamentId, searchTournamentDto.tournamentId) && Intrinsics.g(this.tournamentName, searchTournamentDto.tournamentName) && Intrinsics.g(this.tournamentIcon, searchTournamentDto.tournamentIcon);
    }

    public final String getTournamentIcon() {
        return this.tournamentIcon;
    }

    public final String getTournamentId() {
        return this.tournamentId;
    }

    public final String getTournamentName() {
        return this.tournamentName;
    }

    public int hashCode() {
        return this.tournamentIcon.hashCode() + gmf0.a(this.tournamentId.hashCode() * 31, 31, this.tournamentName);
    }

    public String toString() {
        String str = this.tournamentId;
        String str2 = this.tournamentName;
        return uf80.a(ux5.a("SearchTournamentDto(tournamentId=", str, ", tournamentName=", str2, ", tournamentIcon="), this.tournamentIcon, ")");
    }

    public SearchTournamentDto(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.tournamentId = str;
        this.tournamentName = str2;
        this.tournamentIcon = str3;
    }

    public SearchTournamentDto() {
        this(null, null, null, 7, null);
    }
}

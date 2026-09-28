package com.sporty.android.core.model.bookingcode;

import defpackage.ai50;
import defpackage.hfb0;
import defpackage.kya0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003Jc\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016Ê\u0001\u0002\b$¨\u0006#"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/TournamentBookingCodeFilterDto;", "", "tournamentIdsFilter", "", "", "featureCodeMarkets", "teamName", "timeFilter", "", "timeSegmentFilter", "limit", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)V", "getTournamentIdsFilter", "()Ljava/util/List;", "getFeatureCodeMarkets", "getTeamName", "()Ljava/lang/String;", "getTimeFilter", "getTimeSegmentFilter", "getLimit", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TournamentBookingCodeFilterDto {
    private final List<String> featureCodeMarkets;
    private final int limit;
    private final String teamName;
    private final List<Long> timeFilter;
    private final List<Long> timeSegmentFilter;
    private final List<String> tournamentIdsFilter;

    public TournamentBookingCodeFilterDto(List<String> list, List<String> list2, String str, List<Long> list3, List<Long> list4, int i) {
        list.getClass();
        list2.getClass();
        this.tournamentIdsFilter = list;
        this.featureCodeMarkets = list2;
        this.teamName = str;
        this.timeFilter = list3;
        this.timeSegmentFilter = list4;
        this.limit = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TournamentBookingCodeFilterDto copy$default(TournamentBookingCodeFilterDto tournamentBookingCodeFilterDto, List list, List list2, String str, List list3, List list4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = tournamentBookingCodeFilterDto.tournamentIdsFilter;
        }
        if ((i2 & 2) != 0) {
            list2 = tournamentBookingCodeFilterDto.featureCodeMarkets;
        }
        if ((i2 & 4) != 0) {
            str = tournamentBookingCodeFilterDto.teamName;
        }
        if ((i2 & 8) != 0) {
            list3 = tournamentBookingCodeFilterDto.timeFilter;
        }
        if ((i2 & 16) != 0) {
            list4 = tournamentBookingCodeFilterDto.timeSegmentFilter;
        }
        if ((i2 & 32) != 0) {
            i = tournamentBookingCodeFilterDto.limit;
        }
        List list5 = list4;
        int i3 = i;
        return tournamentBookingCodeFilterDto.copy(list, list2, str, list3, list5, i3);
    }

    public final List<String> component1() {
        return this.tournamentIdsFilter;
    }

    public final List<String> component2() {
        return this.featureCodeMarkets;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTeamName() {
        return this.teamName;
    }

    public final List<Long> component4() {
        return this.timeFilter;
    }

    public final List<Long> component5() {
        return this.timeSegmentFilter;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final TournamentBookingCodeFilterDto copy(List<String> tournamentIdsFilter, List<String> featureCodeMarkets, String teamName, List<Long> timeFilter, List<Long> timeSegmentFilter, int limit) {
        tournamentIdsFilter.getClass();
        featureCodeMarkets.getClass();
        return new TournamentBookingCodeFilterDto(tournamentIdsFilter, featureCodeMarkets, teamName, timeFilter, timeSegmentFilter, limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentBookingCodeFilterDto)) {
            return false;
        }
        TournamentBookingCodeFilterDto tournamentBookingCodeFilterDto = (TournamentBookingCodeFilterDto) other;
        return Intrinsics.g(this.tournamentIdsFilter, tournamentBookingCodeFilterDto.tournamentIdsFilter) && Intrinsics.g(this.featureCodeMarkets, tournamentBookingCodeFilterDto.featureCodeMarkets) && Intrinsics.g(this.teamName, tournamentBookingCodeFilterDto.teamName) && Intrinsics.g(this.timeFilter, tournamentBookingCodeFilterDto.timeFilter) && Intrinsics.g(this.timeSegmentFilter, tournamentBookingCodeFilterDto.timeSegmentFilter) && this.limit == tournamentBookingCodeFilterDto.limit;
    }

    public final List<String> getFeatureCodeMarkets() {
        return this.featureCodeMarkets;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getTeamName() {
        return this.teamName;
    }

    public final List<Long> getTimeFilter() {
        return this.timeFilter;
    }

    public final List<Long> getTimeSegmentFilter() {
        return this.timeSegmentFilter;
    }

    public final List<String> getTournamentIdsFilter() {
        return this.tournamentIdsFilter;
    }

    public int hashCode() {
        int iA = ai50.a(this.tournamentIdsFilter.hashCode() * 31, 31, this.featureCodeMarkets);
        String str = this.teamName;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        List<Long> list = this.timeFilter;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Long> list2 = this.timeSegmentFilter;
        return Integer.hashCode(this.limit) + ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public String toString() {
        List<String> list = this.tournamentIdsFilter;
        List<String> list2 = this.featureCodeMarkets;
        String str = this.teamName;
        List<Long> list3 = this.timeFilter;
        List<Long> list4 = this.timeSegmentFilter;
        int i = this.limit;
        StringBuilder sbA = hfb0.a("TournamentBookingCodeFilterDto(tournamentIdsFilter=", ", featureCodeMarkets=", ", teamName=", list, list2);
        kya0.b(str, ", timeFilter=", ", timeSegmentFilter=", sbA, list3);
        sbA.append(list4);
        sbA.append(", limit=");
        sbA.append(i);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ TournamentBookingCodeFilterDto(List list, List list2, String str, List list3, List list4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, str, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : list4, i);
    }
}

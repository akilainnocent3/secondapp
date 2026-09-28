package com.sporty.android.core.model.bookingcode;

import com.google.gson.annotations.SerializedName;
import defpackage.ai50;
import defpackage.hfb0;
import defpackage.ijg0;
import defpackage.qpu;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010-\u001a\u00020\u0004HÆ\u0003J\u009d\u0001\u0010.\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0004HÆ\u0001J\u0014\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00102\u001a\u00020\u0004HÖ\u0081\u0004J\n\u00103\u001a\u00020\u000eHÖ\u0081\u0004R+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R%\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR-\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R-\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R'\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R%\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#Ê\u0001\u0002\b5¨\u00064"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/BookingCodeTournamentFilterDto;", "", "foldsFilter", "", "", "oddsFilter", "", "popularityFilter", "sortBy", "Lcom/sporty/android/core/model/bookingcode/BookingCodeFilterDto$SortBy;", "timeFilter", "", "timeSegmentFilter", "featureCodeMarkets", "", "tournamentIdsFilter", "teamName", "limit", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/sporty/android/core/model/bookingcode/BookingCodeFilterDto$SortBy;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;I)V", "getFoldsFilter", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "getOddsFilter", "getPopularityFilter", "getSortBy", "()Lcom/sporty/android/core/model/bookingcode/BookingCodeFilterDto$SortBy;", "getTimeFilter", "getTimeSegmentFilter", "getFeatureCodeMarkets", "getTournamentIdsFilter", "getTeamName", "()Ljava/lang/String;", "getLimit", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BookingCodeTournamentFilterDto {

    @SerializedName("featureCodeMarkets")
    private final List<String> featureCodeMarkets;

    @SerializedName("foldsFilter")
    private final List<Integer> foldsFilter;

    @SerializedName("limit")
    private final int limit;

    @SerializedName("oddsFilter")
    private final List<Double> oddsFilter;

    @SerializedName("popularityFilter")
    private final List<Integer> popularityFilter;

    @SerializedName("sortBy")
    private final BookingCodeFilterDto.SortBy sortBy;

    @SerializedName("teamName")
    private final String teamName;

    @SerializedName("timeFilter")
    private final List<Long> timeFilter;

    @SerializedName("timeSegmentFilter")
    private final List<Long> timeSegmentFilter;

    @SerializedName("tournamentIdsFilter")
    private final List<String> tournamentIdsFilter;

    public BookingCodeTournamentFilterDto(List<Integer> list, List<Double> list2, List<Integer> list3, BookingCodeFilterDto.SortBy sortBy, List<Long> list4, List<Long> list5, List<String> list6, List<String> list7, String str, int i) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        sortBy.getClass();
        list6.getClass();
        list7.getClass();
        this.foldsFilter = list;
        this.oddsFilter = list2;
        this.popularityFilter = list3;
        this.sortBy = sortBy;
        this.timeFilter = list4;
        this.timeSegmentFilter = list5;
        this.featureCodeMarkets = list6;
        this.tournamentIdsFilter = list7;
        this.teamName = str;
        this.limit = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BookingCodeTournamentFilterDto copy$default(BookingCodeTournamentFilterDto bookingCodeTournamentFilterDto, List list, List list2, List list3, BookingCodeFilterDto.SortBy sortBy, List list4, List list5, List list6, List list7, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = bookingCodeTournamentFilterDto.foldsFilter;
        }
        if ((i2 & 2) != 0) {
            list2 = bookingCodeTournamentFilterDto.oddsFilter;
        }
        if ((i2 & 4) != 0) {
            list3 = bookingCodeTournamentFilterDto.popularityFilter;
        }
        if ((i2 & 8) != 0) {
            sortBy = bookingCodeTournamentFilterDto.sortBy;
        }
        if ((i2 & 16) != 0) {
            list4 = bookingCodeTournamentFilterDto.timeFilter;
        }
        if ((i2 & 32) != 0) {
            list5 = bookingCodeTournamentFilterDto.timeSegmentFilter;
        }
        if ((i2 & 64) != 0) {
            list6 = bookingCodeTournamentFilterDto.featureCodeMarkets;
        }
        if ((i2 & 128) != 0) {
            list7 = bookingCodeTournamentFilterDto.tournamentIdsFilter;
        }
        if ((i2 & 256) != 0) {
            str = bookingCodeTournamentFilterDto.teamName;
        }
        if ((i2 & 512) != 0) {
            i = bookingCodeTournamentFilterDto.limit;
        }
        String str2 = str;
        int i3 = i;
        List list8 = list6;
        List list9 = list7;
        List list10 = list4;
        List list11 = list5;
        return bookingCodeTournamentFilterDto.copy(list, list2, list3, sortBy, list10, list11, list8, list9, str2, i3);
    }

    public final List<Integer> component1() {
        return this.foldsFilter;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final List<Double> component2() {
        return this.oddsFilter;
    }

    public final List<Integer> component3() {
        return this.popularityFilter;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BookingCodeFilterDto.SortBy getSortBy() {
        return this.sortBy;
    }

    public final List<Long> component5() {
        return this.timeFilter;
    }

    public final List<Long> component6() {
        return this.timeSegmentFilter;
    }

    public final List<String> component7() {
        return this.featureCodeMarkets;
    }

    public final List<String> component8() {
        return this.tournamentIdsFilter;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTeamName() {
        return this.teamName;
    }

    public final BookingCodeTournamentFilterDto copy(List<Integer> foldsFilter, List<Double> oddsFilter, List<Integer> popularityFilter, BookingCodeFilterDto.SortBy sortBy, List<Long> timeFilter, List<Long> timeSegmentFilter, List<String> featureCodeMarkets, List<String> tournamentIdsFilter, String teamName, int limit) {
        foldsFilter.getClass();
        oddsFilter.getClass();
        popularityFilter.getClass();
        sortBy.getClass();
        featureCodeMarkets.getClass();
        tournamentIdsFilter.getClass();
        return new BookingCodeTournamentFilterDto(foldsFilter, oddsFilter, popularityFilter, sortBy, timeFilter, timeSegmentFilter, featureCodeMarkets, tournamentIdsFilter, teamName, limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookingCodeTournamentFilterDto)) {
            return false;
        }
        BookingCodeTournamentFilterDto bookingCodeTournamentFilterDto = (BookingCodeTournamentFilterDto) other;
        return Intrinsics.g(this.foldsFilter, bookingCodeTournamentFilterDto.foldsFilter) && Intrinsics.g(this.oddsFilter, bookingCodeTournamentFilterDto.oddsFilter) && Intrinsics.g(this.popularityFilter, bookingCodeTournamentFilterDto.popularityFilter) && Intrinsics.g(this.sortBy, bookingCodeTournamentFilterDto.sortBy) && Intrinsics.g(this.timeFilter, bookingCodeTournamentFilterDto.timeFilter) && Intrinsics.g(this.timeSegmentFilter, bookingCodeTournamentFilterDto.timeSegmentFilter) && Intrinsics.g(this.featureCodeMarkets, bookingCodeTournamentFilterDto.featureCodeMarkets) && Intrinsics.g(this.tournamentIdsFilter, bookingCodeTournamentFilterDto.tournamentIdsFilter) && Intrinsics.g(this.teamName, bookingCodeTournamentFilterDto.teamName) && this.limit == bookingCodeTournamentFilterDto.limit;
    }

    public final List<String> getFeatureCodeMarkets() {
        return this.featureCodeMarkets;
    }

    public final List<Integer> getFoldsFilter() {
        return this.foldsFilter;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final List<Double> getOddsFilter() {
        return this.oddsFilter;
    }

    public final List<Integer> getPopularityFilter() {
        return this.popularityFilter;
    }

    public final BookingCodeFilterDto.SortBy getSortBy() {
        return this.sortBy;
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
        int iHashCode = (this.sortBy.hashCode() + ai50.a(ai50.a(this.foldsFilter.hashCode() * 31, 31, this.oddsFilter), 31, this.popularityFilter)) * 31;
        List<Long> list = this.timeFilter;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Long> list2 = this.timeSegmentFilter;
        int iA = ai50.a(ai50.a((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.featureCodeMarkets), 31, this.tournamentIdsFilter);
        String str = this.teamName;
        return Integer.hashCode(this.limit) + ((iA + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        List<Integer> list = this.foldsFilter;
        List<Double> list2 = this.oddsFilter;
        List<Integer> list3 = this.popularityFilter;
        BookingCodeFilterDto.SortBy sortBy = this.sortBy;
        List<Long> list4 = this.timeFilter;
        List<Long> list5 = this.timeSegmentFilter;
        List<String> list6 = this.featureCodeMarkets;
        List<String> list7 = this.tournamentIdsFilter;
        String str = this.teamName;
        int i = this.limit;
        StringBuilder sbA = hfb0.a("BookingCodeTournamentFilterDto(foldsFilter=", ", oddsFilter=", ", popularityFilter=", list, list2);
        sbA.append(list3);
        sbA.append(", sortBy=");
        sbA.append(sortBy);
        sbA.append(", timeFilter=");
        qpu.a(", timeSegmentFilter=", ", featureCodeMarkets=", sbA, list4, list5);
        qpu.a(", tournamentIdsFilter=", ", teamName=", sbA, list6, list7);
        return ijg0.a(i, str, ", limit=", ")", sbA);
    }

    public /* synthetic */ BookingCodeTournamentFilterDto(List list, List list2, List list3, BookingCodeFilterDto.SortBy sortBy, List list4, List list5, List list6, List list7, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, sortBy, (i2 & 16) != 0 ? null : list4, (i2 & 32) != 0 ? null : list5, list6, list7, (i2 & 256) != 0 ? null : str, i);
    }
}

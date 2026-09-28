package com.sporty.android.core.model.bookingcode;

import com.google.android.gms.common.annotation.LjLk.llGRV;
import com.google.gson.annotations.SerializedName;
import defpackage.ai50;
import defpackage.gpp;
import defpackage.ml5;
import defpackage.uf80;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jw\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0014\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fÊ\u0001\u0002\b/¨\u0006."}, d2 = {"Lcom/sporty/android/core/model/bookingcode/BookingCodeFilterDto;", "", "defaultList", "", "foldsFilter", "", "", "i", "oddsFilter", "", "sortBy", "Lcom/sporty/android/core/model/bookingcode/BookingCodeFilterDto$SortBy;", "timeFilter", "", "timeSegmentFilter", "featureCodeMarket", "", "<init>", "(ZLjava/util/List;ILjava/util/List;Lcom/sporty/android/core/model/bookingcode/BookingCodeFilterDto$SortBy;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getDefaultList", "()Z", "getFoldsFilter", "()Ljava/util/List;", "getI", "()I", "getOddsFilter", "getSortBy", "()Lcom/sporty/android/core/model/bookingcode/BookingCodeFilterDto$SortBy;", "getTimeFilter", "getTimeSegmentFilter", "getFeatureCodeMarket", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "SortBy", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BookingCodeFilterDto {
    private final boolean defaultList;
    private final String featureCodeMarket;
    private final List<Integer> foldsFilter;
    private final int i;
    private final List<Double> oddsFilter;
    private final SortBy sortBy;
    private final List<Long> timeFilter;
    private final List<Long> timeSegmentFilter;

    public BookingCodeFilterDto(boolean z, List<Integer> list, int i, List<Double> list2, SortBy sortBy, List<Long> list3, List<Long> list4, String str) {
        list.getClass();
        list2.getClass();
        sortBy.getClass();
        this.defaultList = z;
        this.foldsFilter = list;
        this.i = i;
        this.oddsFilter = list2;
        this.sortBy = sortBy;
        this.timeFilter = list3;
        this.timeSegmentFilter = list4;
        this.featureCodeMarket = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BookingCodeFilterDto copy$default(BookingCodeFilterDto bookingCodeFilterDto, boolean z, List list, int i, List list2, SortBy sortBy, List list3, List list4, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = bookingCodeFilterDto.defaultList;
        }
        if ((i2 & 2) != 0) {
            list = bookingCodeFilterDto.foldsFilter;
        }
        if ((i2 & 4) != 0) {
            i = bookingCodeFilterDto.i;
        }
        if ((i2 & 8) != 0) {
            list2 = bookingCodeFilterDto.oddsFilter;
        }
        if ((i2 & 16) != 0) {
            sortBy = bookingCodeFilterDto.sortBy;
        }
        if ((i2 & 32) != 0) {
            list3 = bookingCodeFilterDto.timeFilter;
        }
        if ((i2 & 64) != 0) {
            list4 = bookingCodeFilterDto.timeSegmentFilter;
        }
        if ((i2 & 128) != 0) {
            str = bookingCodeFilterDto.featureCodeMarket;
        }
        List list5 = list4;
        String str2 = str;
        SortBy sortBy2 = sortBy;
        List list6 = list3;
        return bookingCodeFilterDto.copy(z, list, i, list2, sortBy2, list6, list5, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDefaultList() {
        return this.defaultList;
    }

    public final List<Integer> component2() {
        return this.foldsFilter;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getI() {
        return this.i;
    }

    public final List<Double> component4() {
        return this.oddsFilter;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SortBy getSortBy() {
        return this.sortBy;
    }

    public final List<Long> component6() {
        return this.timeFilter;
    }

    public final List<Long> component7() {
        return this.timeSegmentFilter;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFeatureCodeMarket() {
        return this.featureCodeMarket;
    }

    public final BookingCodeFilterDto copy(boolean defaultList, List<Integer> foldsFilter, int i, List<Double> oddsFilter, SortBy sortBy, List<Long> timeFilter, List<Long> timeSegmentFilter, String featureCodeMarket) {
        foldsFilter.getClass();
        oddsFilter.getClass();
        sortBy.getClass();
        return new BookingCodeFilterDto(defaultList, foldsFilter, i, oddsFilter, sortBy, timeFilter, timeSegmentFilter, featureCodeMarket);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookingCodeFilterDto)) {
            return false;
        }
        BookingCodeFilterDto bookingCodeFilterDto = (BookingCodeFilterDto) other;
        return this.defaultList == bookingCodeFilterDto.defaultList && Intrinsics.g(this.foldsFilter, bookingCodeFilterDto.foldsFilter) && this.i == bookingCodeFilterDto.i && Intrinsics.g(this.oddsFilter, bookingCodeFilterDto.oddsFilter) && Intrinsics.g(this.sortBy, bookingCodeFilterDto.sortBy) && Intrinsics.g(this.timeFilter, bookingCodeFilterDto.timeFilter) && Intrinsics.g(this.timeSegmentFilter, bookingCodeFilterDto.timeSegmentFilter) && Intrinsics.g(this.featureCodeMarket, bookingCodeFilterDto.featureCodeMarket);
    }

    public final boolean getDefaultList() {
        return this.defaultList;
    }

    public final String getFeatureCodeMarket() {
        return this.featureCodeMarket;
    }

    public final List<Integer> getFoldsFilter() {
        return this.foldsFilter;
    }

    public final int getI() {
        return this.i;
    }

    public final List<Double> getOddsFilter() {
        return this.oddsFilter;
    }

    public final SortBy getSortBy() {
        return this.sortBy;
    }

    public final List<Long> getTimeFilter() {
        return this.timeFilter;
    }

    public final List<Long> getTimeSegmentFilter() {
        return this.timeSegmentFilter;
    }

    public int hashCode() {
        int iHashCode = (this.sortBy.hashCode() + ai50.a(gpp.a(this.i, ai50.a(Boolean.hashCode(this.defaultList) * 31, 31, this.foldsFilter), 31), 31, this.oddsFilter)) * 31;
        List<Long> list = this.timeFilter;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Long> list2 = this.timeSegmentFilter;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.featureCodeMarket;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "BookingCodeFilterDto(defaultList=" + this.defaultList + ", foldsFilter=" + this.foldsFilter + llGRV.uhQjXRORkr + this.i + ", oddsFilter=" + this.oddsFilter + ", sortBy=" + this.sortBy + ", timeFilter=" + this.timeFilter + ", timeSegmentFilter=" + this.timeSegmentFilter + ", featureCodeMarket=" + this.featureCodeMarket + ")";
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nÊ\u0001\u0002\b\u001c¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/BookingCodeFilterDto$SortBy;", "", "fieldValue", "", "index", "", "order", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFieldValue", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "field", "getIndex", "()I", "getOrder", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class SortBy {
        public static final String SORT_POPULARITY = "popularity";

        @SerializedName("field")
        private final String fieldValue;
        private final int index;
        private final String order;

        public /* synthetic */ SortBy(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
        }

        public static /* synthetic */ SortBy copy$default(SortBy sortBy, String str, int i, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = sortBy.fieldValue;
            }
            if ((i2 & 2) != 0) {
                i = sortBy.index;
            }
            if ((i2 & 4) != 0) {
                str2 = sortBy.order;
            }
            return sortBy.copy(str, i, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFieldValue() {
            return this.fieldValue;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getOrder() {
            return this.order;
        }

        public final SortBy copy(String fieldValue, int index, String order) {
            fieldValue.getClass();
            order.getClass();
            return new SortBy(fieldValue, index, order);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SortBy)) {
                return false;
            }
            SortBy sortBy = (SortBy) other;
            return Intrinsics.g(this.fieldValue, sortBy.fieldValue) && this.index == sortBy.index && Intrinsics.g(this.order, sortBy.order);
        }

        public final String getFieldValue() {
            return this.fieldValue;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getOrder() {
            return this.order;
        }

        public int hashCode() {
            return this.order.hashCode() + gpp.a(this.index, this.fieldValue.hashCode() * 31, 31);
        }

        public String toString() {
            String str = this.fieldValue;
            int i = this.index;
            return uf80.a(ml5.a(i, "SortBy(fieldValue=", str, ", index=", ", order="), this.order, ")");
        }

        public SortBy(String str, int i, String str2) {
            str.getClass();
            str2.getClass();
            this.fieldValue = str;
            this.index = i;
            this.order = str2;
        }

        public SortBy() {
            this(null, 0, null, 7, null);
        }
    }

    public /* synthetic */ BookingCodeFilterDto(boolean z, List list, int i, List list2, SortBy sortBy, List list3, List list4, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, list, i, list2, sortBy, (i2 & 32) != 0 ? null : list3, (i2 & 64) != 0 ? null : list4, (i2 & 128) != 0 ? null : str);
    }
}

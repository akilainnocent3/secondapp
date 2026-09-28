package com.sporty.android.core.model.bookingcode;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.mtg0;
import defpackage.uf80;
import defpackage.uts;
import defpackage.w03;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00106\u001a\u00020\bHÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010<\u001a\u00020\u0014HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003J¬\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010?J\u0014\u0010@\u001a\u00020\u00142\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010B\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010C\u001a\u00020\bHÖ\u0081\u0004R)\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0002¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R)\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001d\u0010\u0019R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b#\u0010\u001fR%\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(%¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b((¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b)\u0010\u001fR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b*\u0010\u001fR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010/R'\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"Ê\u0001\u0002\bE¨\u0006D"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/BookingCodeInfoDto;", "", "createTime", "", "deadline", "foldsAmount", "", "operId", "", BookingCodeFilterDto.SortBy.SORT_POPULARITY, "bookingCode", "outcomeInfos", "", "Lcom/sporty/android/core/model/bookingcode/BookingCodeInfoOutcomeDto;", "source", AnalyticsParam.EVENT_STATUS, "totalOdds", "", "userId", "isBetBuilder", "", "featureCodeMarket", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;ZLjava/lang/String;)V", "getCreateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "Lcom/google/gson/annotations/SerializedName;", "value", "getDeadline", "getFoldsAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOperId", "()Ljava/lang/String;", "getPopularity", "getBookingCode", "shareCode", "getOutcomeInfos", "()Ljava/util/List;", "shareCodeDetail", "getSource", "getStatus", "getTotalOdds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getUserId", "()Z", "getFeatureCodeMarket", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;ZLjava/lang/String;)Lcom/sporty/android/core/model/bookingcode/BookingCodeInfoDto;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BookingCodeInfoDto {

    @SerializedName("shareCode")
    private final String bookingCode;

    @SerializedName("createTime")
    private final Long createTime;

    @SerializedName("deadline")
    private final Long deadline;

    @SerializedName("featureCodeMarket")
    private final String featureCodeMarket;
    private final Integer foldsAmount;
    private final boolean isBetBuilder;
    private final String operId;

    @SerializedName("shareCodeDetail")
    private final List<BookingCodeInfoOutcomeDto> outcomeInfos;
    private final Integer popularity;
    private final Integer source;
    private final Integer status;
    private final Double totalOdds;
    private final String userId;

    public /* synthetic */ BookingCodeInfoDto(Long l, Long l2, Integer num, String str, Integer num2, String str2, List list, Integer num3, Integer num4, Double d, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, num, str, num2, (i & 32) != 0 ? "" : str2, list, num3, num4, d, str3, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? null : str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BookingCodeInfoDto copy$default(BookingCodeInfoDto bookingCodeInfoDto, Long l, Long l2, Integer num, String str, Integer num2, String str2, List list, Integer num3, Integer num4, Double d, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            l = bookingCodeInfoDto.createTime;
        }
        return bookingCodeInfoDto.copy(l, (i & 2) != 0 ? bookingCodeInfoDto.deadline : l2, (i & 4) != 0 ? bookingCodeInfoDto.foldsAmount : num, (i & 8) != 0 ? bookingCodeInfoDto.operId : str, (i & 16) != 0 ? bookingCodeInfoDto.popularity : num2, (i & 32) != 0 ? bookingCodeInfoDto.bookingCode : str2, (i & 64) != 0 ? bookingCodeInfoDto.outcomeInfos : list, (i & 128) != 0 ? bookingCodeInfoDto.source : num3, (i & 256) != 0 ? bookingCodeInfoDto.status : num4, (i & 512) != 0 ? bookingCodeInfoDto.totalOdds : d, (i & 1024) != 0 ? bookingCodeInfoDto.userId : str3, (i & 2048) != 0 ? bookingCodeInfoDto.isBetBuilder : z, (i & 4096) != 0 ? bookingCodeInfoDto.featureCodeMarket : str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Double getTotalOdds() {
        return this.totalOdds;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsBetBuilder() {
        return this.isBetBuilder;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFeatureCodeMarket() {
        return this.featureCodeMarket;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getDeadline() {
        return this.deadline;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getFoldsAmount() {
        return this.foldsAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOperId() {
        return this.operId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getPopularity() {
        return this.popularity;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBookingCode() {
        return this.bookingCode;
    }

    public final List<BookingCodeInfoOutcomeDto> component7() {
        return this.outcomeInfos;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    public final BookingCodeInfoDto copy(Long createTime, Long deadline, Integer foldsAmount, String operId, Integer popularity, String bookingCode, List<BookingCodeInfoOutcomeDto> outcomeInfos, Integer source, Integer status, Double totalOdds, String userId, boolean isBetBuilder, String featureCodeMarket) {
        bookingCode.getClass();
        return new BookingCodeInfoDto(createTime, deadline, foldsAmount, operId, popularity, bookingCode, outcomeInfos, source, status, totalOdds, userId, isBetBuilder, featureCodeMarket);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookingCodeInfoDto)) {
            return false;
        }
        BookingCodeInfoDto bookingCodeInfoDto = (BookingCodeInfoDto) other;
        return Intrinsics.g(this.createTime, bookingCodeInfoDto.createTime) && Intrinsics.g(this.deadline, bookingCodeInfoDto.deadline) && Intrinsics.g(this.foldsAmount, bookingCodeInfoDto.foldsAmount) && Intrinsics.g(this.operId, bookingCodeInfoDto.operId) && Intrinsics.g(this.popularity, bookingCodeInfoDto.popularity) && Intrinsics.g(this.bookingCode, bookingCodeInfoDto.bookingCode) && Intrinsics.g(this.outcomeInfos, bookingCodeInfoDto.outcomeInfos) && Intrinsics.g(this.source, bookingCodeInfoDto.source) && Intrinsics.g(this.status, bookingCodeInfoDto.status) && Intrinsics.g(this.totalOdds, bookingCodeInfoDto.totalOdds) && Intrinsics.g(this.userId, bookingCodeInfoDto.userId) && this.isBetBuilder == bookingCodeInfoDto.isBetBuilder && Intrinsics.g(this.featureCodeMarket, bookingCodeInfoDto.featureCodeMarket);
    }

    public final String getBookingCode() {
        return this.bookingCode;
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final Long getDeadline() {
        return this.deadline;
    }

    public final String getFeatureCodeMarket() {
        return this.featureCodeMarket;
    }

    public final Integer getFoldsAmount() {
        return this.foldsAmount;
    }

    public final String getOperId() {
        return this.operId;
    }

    public final List<BookingCodeInfoOutcomeDto> getOutcomeInfos() {
        return this.outcomeInfos;
    }

    public final Integer getPopularity() {
        return this.popularity;
    }

    public final Integer getSource() {
        return this.source;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final Double getTotalOdds() {
        return this.totalOdds;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Long l = this.createTime;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.deadline;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.foldsAmount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.operId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.popularity;
        int iA = gmf0.a((iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.bookingCode);
        List<BookingCodeInfoOutcomeDto> list = this.outcomeInfos;
        int iHashCode5 = (iA + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.source;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.status;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d = this.totalOdds;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.userId;
        int iA2 = mtg0.a((iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isBetBuilder);
        String str3 = this.featureCodeMarket;
        return iA2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isBetBuilder() {
        return this.isBetBuilder;
    }

    public String toString() {
        Long l = this.createTime;
        Long l2 = this.deadline;
        Integer num = this.foldsAmount;
        String str = this.operId;
        Integer num2 = this.popularity;
        String str2 = this.bookingCode;
        List<BookingCodeInfoOutcomeDto> list = this.outcomeInfos;
        Integer num3 = this.source;
        Integer num4 = this.status;
        Double d = this.totalOdds;
        String str3 = this.userId;
        boolean z = this.isBetBuilder;
        String str4 = this.featureCodeMarket;
        StringBuilder sb = new StringBuilder("BookingCodeInfoDto(createTime=");
        sb.append(l);
        sb.append(", deadline=");
        sb.append(l2);
        sb.append(", foldsAmount=");
        w03.a(num, ", operId=", str, ", popularity=", sb);
        w03.a(num2, ", bookingCode=", str2, ", outcomeInfos=", sb);
        sb.append(list);
        sb.append(", source=");
        sb.append(num3);
        sb.append(", status=");
        sb.append(num4);
        sb.append(", totalOdds=");
        sb.append(d);
        sb.append(", userId=");
        uts.b(str3, ", isBetBuilder=", ", featureCodeMarket=", sb, z);
        return uf80.a(sb, str4, ")");
    }

    public BookingCodeInfoDto(Long l, Long l2, Integer num, String str, Integer num2, String str2, List<BookingCodeInfoOutcomeDto> list, Integer num3, Integer num4, Double d, String str3, boolean z, String str4) {
        str2.getClass();
        this.createTime = l;
        this.deadline = l2;
        this.foldsAmount = num;
        this.operId = str;
        this.popularity = num2;
        this.bookingCode = str2;
        this.outcomeInfos = list;
        this.source = num3;
        this.status = num4;
        this.totalOdds = d;
        this.userId = str3;
        this.isBetBuilder = z;
        this.featureCodeMarket = str4;
    }
}

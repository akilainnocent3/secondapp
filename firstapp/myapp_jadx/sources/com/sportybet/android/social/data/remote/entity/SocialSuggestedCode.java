package com.sportybet.android.social.data.remote.entity;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import defpackage.cv7;
import defpackage.ng1;
import defpackage.w03;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0080\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00100J\u0014\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00104\u001a\u00020\u0007HÖ\u0081\u0004J\n\u00105\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R)\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R)\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR)\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR)\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\"\u0010\u001bR)\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\r¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u001bR-\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%Ê\u0001\u0002\b7Ê\u0001\f\b8\u0012\b\b9\u0012\u0004\b\u0003\u0010\u0000¨\u00066"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedCode;", "", "shareCode", "", "totalOdds", "", "foldsAmount", "", "userId", "deadline", "", "createTime", BookingCodeFilterDto.SortBy.SORT_POPULARITY, "source", "shareCodeDetail", "", "Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedCodeDetail;", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getShareCode", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getTotalOdds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFoldsAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUserId", "getDeadline", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCreateTime", "getPopularity", "getSource", "getShareCodeDetail", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedCode;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocialSuggestedCode {
    public static final int $stable = 8;

    @SerializedName("createTime")
    private final Long createTime;

    @SerializedName("deadline")
    private final Long deadline;

    @SerializedName("foldsAmount")
    private final Integer foldsAmount;

    @SerializedName(BookingCodeFilterDto.SortBy.SORT_POPULARITY)
    private final Integer popularity;

    @SerializedName("shareCode")
    private final String shareCode;

    @SerializedName("shareCodeDetail")
    private final List<SocialSuggestedCodeDetail> shareCodeDetail;

    @SerializedName("source")
    private final Integer source;

    @SerializedName("totalOdds")
    private final Double totalOdds;

    @SerializedName("userId")
    private final String userId;

    public /* synthetic */ SocialSuggestedCode(String str, Double d, Integer num, String str2, Long l, Long l2, Integer num2, Integer num3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialSuggestedCode copy$default(SocialSuggestedCode socialSuggestedCode, String str, Double d, Integer num, String str2, Long l, Long l2, Integer num2, Integer num3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = socialSuggestedCode.shareCode;
        }
        if ((i & 2) != 0) {
            d = socialSuggestedCode.totalOdds;
        }
        if ((i & 4) != 0) {
            num = socialSuggestedCode.foldsAmount;
        }
        if ((i & 8) != 0) {
            str2 = socialSuggestedCode.userId;
        }
        if ((i & 16) != 0) {
            l = socialSuggestedCode.deadline;
        }
        if ((i & 32) != 0) {
            l2 = socialSuggestedCode.createTime;
        }
        if ((i & 64) != 0) {
            num2 = socialSuggestedCode.popularity;
        }
        if ((i & 128) != 0) {
            num3 = socialSuggestedCode.source;
        }
        if ((i & 256) != 0) {
            list = socialSuggestedCode.shareCodeDetail;
        }
        Integer num4 = num3;
        List list2 = list;
        Long l3 = l2;
        Integer num5 = num2;
        Long l4 = l;
        Integer num6 = num;
        return socialSuggestedCode.copy(str, d, num6, str2, l4, l3, num5, num4, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getTotalOdds() {
        return this.totalOdds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getFoldsAmount() {
        return this.foldsAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getDeadline() {
        return this.deadline;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getPopularity() {
        return this.popularity;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getSource() {
        return this.source;
    }

    public final List<SocialSuggestedCodeDetail> component9() {
        return this.shareCodeDetail;
    }

    public final SocialSuggestedCode copy(String shareCode, Double totalOdds, Integer foldsAmount, String userId, Long deadline, Long createTime, Integer popularity, Integer source, List<SocialSuggestedCodeDetail> shareCodeDetail) {
        return new SocialSuggestedCode(shareCode, totalOdds, foldsAmount, userId, deadline, createTime, popularity, source, shareCodeDetail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialSuggestedCode)) {
            return false;
        }
        SocialSuggestedCode socialSuggestedCode = (SocialSuggestedCode) other;
        return Intrinsics.g(this.shareCode, socialSuggestedCode.shareCode) && Intrinsics.g(this.totalOdds, socialSuggestedCode.totalOdds) && Intrinsics.g(this.foldsAmount, socialSuggestedCode.foldsAmount) && Intrinsics.g(this.userId, socialSuggestedCode.userId) && Intrinsics.g(this.deadline, socialSuggestedCode.deadline) && Intrinsics.g(this.createTime, socialSuggestedCode.createTime) && Intrinsics.g(this.popularity, socialSuggestedCode.popularity) && Intrinsics.g(this.source, socialSuggestedCode.source) && Intrinsics.g(this.shareCodeDetail, socialSuggestedCode.shareCodeDetail);
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final Long getDeadline() {
        return this.deadline;
    }

    public final Integer getFoldsAmount() {
        return this.foldsAmount;
    }

    public final Integer getPopularity() {
        return this.popularity;
    }

    public final String getShareCode() {
        return this.shareCode;
    }

    public final List<SocialSuggestedCodeDetail> getShareCodeDetail() {
        return this.shareCodeDetail;
    }

    public final Integer getSource() {
        return this.source;
    }

    public final Double getTotalOdds() {
        return this.totalOdds;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.shareCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.totalOdds;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.foldsAmount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.userId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.deadline;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.createTime;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.popularity;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.source;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<SocialSuggestedCodeDetail> list = this.shareCodeDetail;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.shareCode;
        Double d = this.totalOdds;
        Integer num = this.foldsAmount;
        String str2 = this.userId;
        Long l = this.deadline;
        Long l2 = this.createTime;
        Integer num2 = this.popularity;
        Integer num3 = this.source;
        List<SocialSuggestedCodeDetail> list = this.shareCodeDetail;
        StringBuilder sb = new StringBuilder("SocialSuggestedCode(shareCode=");
        sb.append(str);
        sb.append(", totalOdds=");
        sb.append(d);
        sb.append(", foldsAmount=");
        w03.a(num, ", userId=", str2, ", deadline=", sb);
        sb.append(l);
        sb.append(", createTime=");
        sb.append(l2);
        sb.append(", popularity=");
        cv7.a(sb, num2, ", source=", num3, ", shareCodeDetail=");
        return ng1.a(sb, list, ")");
    }

    public SocialSuggestedCode(String str, Double d, Integer num, String str2, Long l, Long l2, Integer num2, Integer num3, List<SocialSuggestedCodeDetail> list) {
        this.shareCode = str;
        this.totalOdds = d;
        this.foldsAmount = num;
        this.userId = str2;
        this.deadline = l;
        this.createTime = l2;
        this.popularity = num2;
        this.source = num3;
        this.shareCodeDetail = list;
    }

    public SocialSuggestedCode() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}

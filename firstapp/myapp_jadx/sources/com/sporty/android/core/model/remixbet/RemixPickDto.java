package com.sporty.android.core.model.remixbet;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ew7;
import defpackage.hxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009e\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00106J\u0014\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010:\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010;\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R)\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R'\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R'\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R'\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R'\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015R)\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000f¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R'\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0015Ê\u0001\u0002\b=¨\u0006<"}, d2 = {"Lcom/sporty/android/core/model/remixbet/RemixPickDto;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "product", "", "homeTeamName", "awayTeamName", "startTime", "", "marketId", "marketDescription", "marketSpecifiers", "outcomeId", "outcomeDescription", "odds", "", "sportId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getProduct", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHomeTeamName", "getAwayTeamName", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMarketId", "getMarketDescription", "getMarketSpecifiers", "getOutcomeId", "getOutcomeDescription", "getOdds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSportId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lcom/sporty/android/core/model/remixbet/RemixPickDto;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RemixPickDto {

    @SerializedName("awayTeamName")
    private final String awayTeamName;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("homeTeamName")
    private final String homeTeamName;

    @SerializedName("marketDescription")
    private final String marketDescription;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("marketSpecifiers")
    private final String marketSpecifiers;

    @SerializedName("odds")
    private final Double odds;

    @SerializedName("outcomeDescription")
    private final String outcomeDescription;

    @SerializedName("outcomeId")
    private final String outcomeId;

    @SerializedName("product")
    private final Integer product;

    @SerializedName("sportId")
    private final String sportId;

    @SerializedName("startTime")
    private final Long startTime;

    public RemixPickDto(String str, Integer num, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, Double d, String str9) {
        this.eventId = str;
        this.product = num;
        this.homeTeamName = str2;
        this.awayTeamName = str3;
        this.startTime = l;
        this.marketId = str4;
        this.marketDescription = str5;
        this.marketSpecifiers = str6;
        this.outcomeId = str7;
        this.outcomeDescription = str8;
        this.odds = d;
        this.sportId = str9;
    }

    public static /* synthetic */ RemixPickDto copy$default(RemixPickDto remixPickDto, String str, Integer num, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, Double d, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remixPickDto.eventId;
        }
        if ((i & 2) != 0) {
            num = remixPickDto.product;
        }
        if ((i & 4) != 0) {
            str2 = remixPickDto.homeTeamName;
        }
        if ((i & 8) != 0) {
            str3 = remixPickDto.awayTeamName;
        }
        if ((i & 16) != 0) {
            l = remixPickDto.startTime;
        }
        if ((i & 32) != 0) {
            str4 = remixPickDto.marketId;
        }
        if ((i & 64) != 0) {
            str5 = remixPickDto.marketDescription;
        }
        if ((i & 128) != 0) {
            str6 = remixPickDto.marketSpecifiers;
        }
        if ((i & 256) != 0) {
            str7 = remixPickDto.outcomeId;
        }
        if ((i & 512) != 0) {
            str8 = remixPickDto.outcomeDescription;
        }
        if ((i & 1024) != 0) {
            d = remixPickDto.odds;
        }
        if ((i & 2048) != 0) {
            str9 = remixPickDto.sportId;
        }
        Double d2 = d;
        String str10 = str9;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        Long l2 = l;
        String str15 = str4;
        return remixPickDto.copy(str, num, str2, str3, l2, str15, str13, str14, str11, str12, d2, str10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOutcomeDescription() {
        return this.outcomeDescription;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Double getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMarketDescription() {
        return this.marketDescription;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMarketSpecifiers() {
        return this.marketSpecifiers;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final RemixPickDto copy(String eventId, Integer product, String homeTeamName, String awayTeamName, Long startTime, String marketId, String marketDescription, String marketSpecifiers, String outcomeId, String outcomeDescription, Double odds, String sportId) {
        return new RemixPickDto(eventId, product, homeTeamName, awayTeamName, startTime, marketId, marketDescription, marketSpecifiers, outcomeId, outcomeDescription, odds, sportId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemixPickDto)) {
            return false;
        }
        RemixPickDto remixPickDto = (RemixPickDto) other;
        return Intrinsics.g(this.eventId, remixPickDto.eventId) && Intrinsics.g(this.product, remixPickDto.product) && Intrinsics.g(this.homeTeamName, remixPickDto.homeTeamName) && Intrinsics.g(this.awayTeamName, remixPickDto.awayTeamName) && Intrinsics.g(this.startTime, remixPickDto.startTime) && Intrinsics.g(this.marketId, remixPickDto.marketId) && Intrinsics.g(this.marketDescription, remixPickDto.marketDescription) && Intrinsics.g(this.marketSpecifiers, remixPickDto.marketSpecifiers) && Intrinsics.g(this.outcomeId, remixPickDto.outcomeId) && Intrinsics.g(this.outcomeDescription, remixPickDto.outcomeDescription) && Intrinsics.g(this.odds, remixPickDto.odds) && Intrinsics.g(this.sportId, remixPickDto.sportId);
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final String getMarketDescription() {
        return this.marketDescription;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getMarketSpecifiers() {
        return this.marketSpecifiers;
    }

    public final Double getOdds() {
        return this.odds;
    }

    public final String getOutcomeDescription() {
        return this.outcomeDescription;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final Integer getProduct() {
        return this.product;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.product;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.homeTeamName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.awayTeamName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.startTime;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.marketId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.marketDescription;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.marketSpecifiers;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.outcomeId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.outcomeDescription;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d = this.odds;
        int iHashCode11 = (iHashCode10 + (d == null ? 0 : d.hashCode())) * 31;
        String str9 = this.sportId;
        return iHashCode11 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        Integer num = this.product;
        String str2 = this.homeTeamName;
        String str3 = this.awayTeamName;
        Long l = this.startTime;
        String str4 = this.marketId;
        String str5 = this.marketDescription;
        String str6 = this.marketSpecifiers;
        String str7 = this.outcomeId;
        String str8 = this.outcomeDescription;
        Double d = this.odds;
        String str9 = this.sportId;
        StringBuilder sbA = ew7.a(num, "RemixPickDto(eventId=", str, ", product=", ", homeTeamName=");
        hxa.c(sbA, str2, ", awayTeamName=", str3, ", startTime=");
        sbA.append(l);
        sbA.append(", marketId=");
        sbA.append(str4);
        sbA.append(", marketDescription=");
        hxa.c(sbA, str5, ", marketSpecifiers=", str6, ", outcomeId=");
        hxa.c(sbA, str7, ", outcomeDescription=", str8, ", odds=");
        sbA.append(d);
        sbA.append(", sportId=");
        sbA.append(str9);
        sbA.append(")");
        return sbA.toString();
    }
}

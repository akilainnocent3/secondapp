package com.sportybet.android.multimaker.data.dto;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0092\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00100J\u0014\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00104\u001a\u00020\bHÖ\u0081\u0004J\n\u00105\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#Ê\u0001\u0002\b7Ê\u0001\f\b8\u0012\b\b9\u0012\u0004\b\u0003\u0010\u0000¨\u00066"}, d2 = {"Lcom/sportybet/android/multimaker/data/dto/MultiMakerEventDto;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "productStatus", "estimateStartTime", "", AnalyticsParam.EVENT_STATUS, "", "matchStatus", "homeTeamName", "awayTeamName", "sportId", "categoryId", "tournamentId", AnalyticsParam.MARKET_PARAM_MARKET, "Lcom/sportybet/android/multimaker/data/dto/MultiMakerMarketDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/android/multimaker/data/dto/MultiMakerMarketDto;)V", "getEventId", "()Ljava/lang/String;", "getProductStatus", "getEstimateStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMatchStatus", "getHomeTeamName", "getAwayTeamName", "getSportId", "getCategoryId", "getTournamentId", "getMarket", "()Lcom/sportybet/android/multimaker/data/dto/MultiMakerMarketDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/android/multimaker/data/dto/MultiMakerMarketDto;)Lcom/sportybet/android/multimaker/data/dto/MultiMakerEventDto;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MultiMakerEventDto {
    public static final int $stable = MultiMakerMarketDto.$stable;
    private final String awayTeamName;
    private final String categoryId;
    private final Long estimateStartTime;
    private final String eventId;
    private final String homeTeamName;
    private final MultiMakerMarketDto market;
    private final String matchStatus;
    private final String productStatus;
    private final String sportId;
    private final Integer status;
    private final String tournamentId;

    public /* synthetic */ MultiMakerEventDto(String str, String str2, Long l, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, MultiMakerMarketDto multiMakerMarketDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : multiMakerMarketDto);
    }

    public static /* synthetic */ MultiMakerEventDto copy$default(MultiMakerEventDto multiMakerEventDto, String str, String str2, Long l, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, MultiMakerMarketDto multiMakerMarketDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiMakerEventDto.eventId;
        }
        if ((i & 2) != 0) {
            str2 = multiMakerEventDto.productStatus;
        }
        if ((i & 4) != 0) {
            l = multiMakerEventDto.estimateStartTime;
        }
        if ((i & 8) != 0) {
            num = multiMakerEventDto.status;
        }
        if ((i & 16) != 0) {
            str3 = multiMakerEventDto.matchStatus;
        }
        if ((i & 32) != 0) {
            str4 = multiMakerEventDto.homeTeamName;
        }
        if ((i & 64) != 0) {
            str5 = multiMakerEventDto.awayTeamName;
        }
        if ((i & 128) != 0) {
            str6 = multiMakerEventDto.sportId;
        }
        if ((i & 256) != 0) {
            str7 = multiMakerEventDto.categoryId;
        }
        if ((i & 512) != 0) {
            str8 = multiMakerEventDto.tournamentId;
        }
        if ((i & 1024) != 0) {
            multiMakerMarketDto = multiMakerEventDto.market;
        }
        String str9 = str8;
        MultiMakerMarketDto multiMakerMarketDto2 = multiMakerMarketDto;
        String str10 = str6;
        String str11 = str7;
        String str12 = str4;
        String str13 = str5;
        String str14 = str3;
        Long l2 = l;
        return multiMakerEventDto.copy(str, str2, l2, num, str14, str12, str13, str10, str11, str9, multiMakerMarketDto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final MultiMakerMarketDto getMarket() {
        return this.market;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductStatus() {
        return this.productStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getEstimateStartTime() {
        return this.estimateStartTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMatchStatus() {
        return this.matchStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    public final MultiMakerEventDto copy(String eventId, String productStatus, Long estimateStartTime, Integer status, String matchStatus, String homeTeamName, String awayTeamName, String sportId, String categoryId, String tournamentId, MultiMakerMarketDto market) {
        return new MultiMakerEventDto(eventId, productStatus, estimateStartTime, status, matchStatus, homeTeamName, awayTeamName, sportId, categoryId, tournamentId, market);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiMakerEventDto)) {
            return false;
        }
        MultiMakerEventDto multiMakerEventDto = (MultiMakerEventDto) other;
        return Intrinsics.g(this.eventId, multiMakerEventDto.eventId) && Intrinsics.g(this.productStatus, multiMakerEventDto.productStatus) && Intrinsics.g(this.estimateStartTime, multiMakerEventDto.estimateStartTime) && Intrinsics.g(this.status, multiMakerEventDto.status) && Intrinsics.g(this.matchStatus, multiMakerEventDto.matchStatus) && Intrinsics.g(this.homeTeamName, multiMakerEventDto.homeTeamName) && Intrinsics.g(this.awayTeamName, multiMakerEventDto.awayTeamName) && Intrinsics.g(this.sportId, multiMakerEventDto.sportId) && Intrinsics.g(this.categoryId, multiMakerEventDto.categoryId) && Intrinsics.g(this.tournamentId, multiMakerEventDto.tournamentId) && Intrinsics.g(this.market, multiMakerEventDto.market);
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final Long getEstimateStartTime() {
        return this.estimateStartTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final MultiMakerMarketDto getMarket() {
        return this.market;
    }

    public final String getMatchStatus() {
        return this.matchStatus;
    }

    public final String getProductStatus() {
        return this.productStatus;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getTournamentId() {
        return this.tournamentId;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productStatus;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.estimateStartTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.matchStatus;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.homeTeamName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.awayTeamName;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sportId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.categoryId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tournamentId;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        MultiMakerMarketDto multiMakerMarketDto = this.market;
        return iHashCode10 + (multiMakerMarketDto != null ? multiMakerMarketDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.productStatus;
        Long l = this.estimateStartTime;
        Integer num = this.status;
        String str3 = this.matchStatus;
        String str4 = this.homeTeamName;
        String str5 = this.awayTeamName;
        String str6 = this.sportId;
        String str7 = this.categoryId;
        String str8 = this.tournamentId;
        MultiMakerMarketDto multiMakerMarketDto = this.market;
        StringBuilder sbA = ux5.a("MultiMakerEventDto(eventId=", str, ", productStatus=", str2, ", estimateStartTime=");
        sbA.append(l);
        sbA.append(", status=");
        sbA.append(num);
        sbA.append(", matchStatus=");
        hxa.c(sbA, str3, ", homeTeamName=", str4, ", awayTeamName=");
        hxa.c(sbA, str5, ", sportId=", str6, ", categoryId=");
        hxa.c(sbA, str7, ", tournamentId=", str8, ", market=");
        sbA.append(multiMakerMarketDto);
        sbA.append(")");
        return sbA.toString();
    }

    public MultiMakerEventDto(String str, String str2, Long l, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, MultiMakerMarketDto multiMakerMarketDto) {
        this.eventId = str;
        this.productStatus = str2;
        this.estimateStartTime = l;
        this.status = num;
        this.matchStatus = str3;
        this.homeTeamName = str4;
        this.awayTeamName = str5;
        this.sportId = str6;
        this.categoryId = str7;
        this.tournamentId = str8;
        this.market = multiMakerMarketDto;
    }

    public MultiMakerEventDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}

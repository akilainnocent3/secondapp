package com.sportygames.campaign.data.model;

import defpackage.f87;
import defpackage.gmf0;
import defpackage.o8i;
import defpackage.qn4;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u001b\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00130\u0012HÆ\u0003J\u0097\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00130\u0012HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006:"}, d2 = {"Lcom/sportygames/campaign/data/model/TournamentStatsData;", "", "tournamentName", "", "tournamentId", "", "currency", "onlyAmount", "endDate", "prizeListFirstObject", "Lcom/sportygames/campaign/data/model/PrizeInfo;", "rankData", "Lcom/sportygames/campaign/data/model/UserPlayInfo;", "minBetAmount", "startDate", "minimumCashoutCoefficient", "firstPrize", "prizeListMap", "", "Lkotlin/Pair;", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportygames/campaign/data/model/PrizeInfo;Lcom/sportygames/campaign/data/model/UserPlayInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTournamentName", "()Ljava/lang/String;", "getTournamentId", "()J", "getCurrency", "getOnlyAmount", "getEndDate", "getPrizeListFirstObject", "()Lcom/sportygames/campaign/data/model/PrizeInfo;", "getRankData", "()Lcom/sportygames/campaign/data/model/UserPlayInfo;", "getMinBetAmount", "getStartDate", "getMinimumCashoutCoefficient", "getFirstPrize", "getPrizeListMap", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "campaign_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TournamentStatsData {
    public static final int $stable = 8;
    private final String currency;
    private final String endDate;
    private final String firstPrize;
    private final String minBetAmount;
    private final String minimumCashoutCoefficient;
    private final String onlyAmount;
    private final PrizeInfo prizeListFirstObject;
    private final List<Pair<String, String>> prizeListMap;
    private final UserPlayInfo rankData;
    private final String startDate;
    private final long tournamentId;
    private final String tournamentName;

    public /* synthetic */ TournamentStatsData(String str, long j, String str2, String str3, String str4, PrizeInfo prizeInfo, UserPlayInfo userPlayInfo, String str5, String str6, String str7, String str8, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : prizeInfo, (i & 64) != 0 ? null : userPlayInfo, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TournamentStatsData copy$default(TournamentStatsData tournamentStatsData, String str, long j, String str2, String str3, String str4, PrizeInfo prizeInfo, UserPlayInfo userPlayInfo, String str5, String str6, String str7, String str8, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tournamentStatsData.tournamentName;
        }
        return tournamentStatsData.copy(str, (i & 2) != 0 ? tournamentStatsData.tournamentId : j, (i & 4) != 0 ? tournamentStatsData.currency : str2, (i & 8) != 0 ? tournamentStatsData.onlyAmount : str3, (i & 16) != 0 ? tournamentStatsData.endDate : str4, (i & 32) != 0 ? tournamentStatsData.prizeListFirstObject : prizeInfo, (i & 64) != 0 ? tournamentStatsData.rankData : userPlayInfo, (i & 128) != 0 ? tournamentStatsData.minBetAmount : str5, (i & 256) != 0 ? tournamentStatsData.startDate : str6, (i & 512) != 0 ? tournamentStatsData.minimumCashoutCoefficient : str7, (i & 1024) != 0 ? tournamentStatsData.firstPrize : str8, (i & 2048) != 0 ? tournamentStatsData.prizeListMap : list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTournamentName() {
        return this.tournamentName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMinimumCashoutCoefficient() {
        return this.minimumCashoutCoefficient;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFirstPrize() {
        return this.firstPrize;
    }

    public final List<Pair<String, String>> component12() {
        return this.prizeListMap;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOnlyAmount() {
        return this.onlyAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PrizeInfo getPrizeListFirstObject() {
        return this.prizeListFirstObject;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final UserPlayInfo getRankData() {
        return this.rankData;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMinBetAmount() {
        return this.minBetAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    public final TournamentStatsData copy(String tournamentName, long tournamentId, String currency, String onlyAmount, String endDate, PrizeInfo prizeListFirstObject, UserPlayInfo rankData, String minBetAmount, String startDate, String minimumCashoutCoefficient, String firstPrize, List<Pair<String, String>> prizeListMap) {
        qn4.b(tournamentName, currency, onlyAmount, endDate, minBetAmount);
        startDate.getClass();
        minimumCashoutCoefficient.getClass();
        firstPrize.getClass();
        prizeListMap.getClass();
        return new TournamentStatsData(tournamentName, tournamentId, currency, onlyAmount, endDate, prizeListFirstObject, rankData, minBetAmount, startDate, minimumCashoutCoefficient, firstPrize, prizeListMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentStatsData)) {
            return false;
        }
        TournamentStatsData tournamentStatsData = (TournamentStatsData) other;
        return Intrinsics.g(this.tournamentName, tournamentStatsData.tournamentName) && this.tournamentId == tournamentStatsData.tournamentId && Intrinsics.g(this.currency, tournamentStatsData.currency) && Intrinsics.g(this.onlyAmount, tournamentStatsData.onlyAmount) && Intrinsics.g(this.endDate, tournamentStatsData.endDate) && Intrinsics.g(this.prizeListFirstObject, tournamentStatsData.prizeListFirstObject) && Intrinsics.g(this.rankData, tournamentStatsData.rankData) && Intrinsics.g(this.minBetAmount, tournamentStatsData.minBetAmount) && Intrinsics.g(this.startDate, tournamentStatsData.startDate) && Intrinsics.g(this.minimumCashoutCoefficient, tournamentStatsData.minimumCashoutCoefficient) && Intrinsics.g(this.firstPrize, tournamentStatsData.firstPrize) && Intrinsics.g(this.prizeListMap, tournamentStatsData.prizeListMap);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getFirstPrize() {
        return this.firstPrize;
    }

    public final String getMinBetAmount() {
        return this.minBetAmount;
    }

    public final String getMinimumCashoutCoefficient() {
        return this.minimumCashoutCoefficient;
    }

    public final String getOnlyAmount() {
        return this.onlyAmount;
    }

    public final PrizeInfo getPrizeListFirstObject() {
        return this.prizeListFirstObject;
    }

    public final List<Pair<String, String>> getPrizeListMap() {
        return this.prizeListMap;
    }

    public final UserPlayInfo getRankData() {
        return this.rankData;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final long getTournamentId() {
        return this.tournamentId;
    }

    public final String getTournamentName() {
        return this.tournamentName;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(f87.a(this.tournamentName.hashCode() * 31, this.tournamentId, 31), 31, this.currency), 31, this.onlyAmount), 31, this.endDate);
        PrizeInfo prizeInfo = this.prizeListFirstObject;
        int iHashCode = (iA + (prizeInfo == null ? 0 : prizeInfo.hashCode())) * 31;
        UserPlayInfo userPlayInfo = this.rankData;
        return this.prizeListMap.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a((iHashCode + (userPlayInfo != null ? userPlayInfo.hashCode() : 0)) * 31, 31, this.minBetAmount), 31, this.startDate), 31, this.minimumCashoutCoefficient), 31, this.firstPrize);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TournamentStatsData(tournamentName=");
        sb.append(this.tournamentName);
        sb.append(", tournamentId=");
        sb.append(this.tournamentId);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", onlyAmount=");
        sb.append(this.onlyAmount);
        sb.append(", endDate=");
        sb.append(this.endDate);
        sb.append(", prizeListFirstObject=");
        sb.append(this.prizeListFirstObject);
        sb.append(", rankData=");
        sb.append(this.rankData);
        sb.append(", minBetAmount=");
        sb.append(this.minBetAmount);
        sb.append(", startDate=");
        sb.append(this.startDate);
        sb.append(", minimumCashoutCoefficient=");
        sb.append(this.minimumCashoutCoefficient);
        sb.append(", firstPrize=");
        sb.append(this.firstPrize);
        sb.append(", prizeListMap=");
        return o8i.a(sb, this.prizeListMap, ')');
    }

    public TournamentStatsData(String str, long j, String str2, String str3, String str4, PrizeInfo prizeInfo, UserPlayInfo userPlayInfo, String str5, String str6, String str7, String str8, List<Pair<String, String>> list) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        str8.getClass();
        list.getClass();
        this.tournamentName = str;
        this.tournamentId = j;
        this.currency = str2;
        this.onlyAmount = str3;
        this.endDate = str4;
        this.prizeListFirstObject = prizeInfo;
        this.rankData = userPlayInfo;
        this.minBetAmount = str5;
        this.startDate = str6;
        this.minimumCashoutCoefficient = str7;
        this.firstPrize = str8;
        this.prizeListMap = list;
    }
}

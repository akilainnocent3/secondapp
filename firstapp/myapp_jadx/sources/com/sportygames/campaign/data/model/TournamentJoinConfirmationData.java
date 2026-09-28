package com.sportygames.campaign.data.model;

import defpackage.gmf0;
import defpackage.m2g;
import defpackage.mtg0;
import defpackage.o8i;
import defpackage.qn4;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u001b\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00120\u0011HÆ\u0003J\u009f\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00120\u0011HÆ\u0001J\u0013\u00103\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00068"}, d2 = {"Lcom/sportygames/campaign/data/model/TournamentJoinConfirmationData;", "", "title", "", "amount", "showJoinButtons", "", "totalParticipants", "minBetAmount", "startsIn", "currency", "onlyAmount", "startDate", "endDate", "firstPrize", "minimumCashoutCoefficient", "prizeListMap", "", "Lkotlin/Pair;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getAmount", "getShowJoinButtons", "()Z", "getTotalParticipants", "getMinBetAmount", "getStartsIn", "getCurrency", "getOnlyAmount", "getStartDate", "getEndDate", "getFirstPrize", "getMinimumCashoutCoefficient", "getPrizeListMap", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "campaign_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TournamentJoinConfirmationData {
    public static final int $stable = 8;
    private final String amount;
    private final String currency;
    private final String endDate;
    private final String firstPrize;
    private final String minBetAmount;
    private final String minimumCashoutCoefficient;
    private final String onlyAmount;
    private final List<Pair<String, String>> prizeListMap;
    private final boolean showJoinButtons;
    private final String startDate;
    private final String startsIn;
    private final String title;
    private final String totalParticipants;

    public TournamentJoinConfirmationData(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) == 0 ? str11 : "", (i & 4096) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TournamentJoinConfirmationData copy$default(TournamentJoinConfirmationData tournamentJoinConfirmationData, String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tournamentJoinConfirmationData.title;
        }
        return tournamentJoinConfirmationData.copy(str, (i & 2) != 0 ? tournamentJoinConfirmationData.amount : str2, (i & 4) != 0 ? tournamentJoinConfirmationData.showJoinButtons : z, (i & 8) != 0 ? tournamentJoinConfirmationData.totalParticipants : str3, (i & 16) != 0 ? tournamentJoinConfirmationData.minBetAmount : str4, (i & 32) != 0 ? tournamentJoinConfirmationData.startsIn : str5, (i & 64) != 0 ? tournamentJoinConfirmationData.currency : str6, (i & 128) != 0 ? tournamentJoinConfirmationData.onlyAmount : str7, (i & 256) != 0 ? tournamentJoinConfirmationData.startDate : str8, (i & 512) != 0 ? tournamentJoinConfirmationData.endDate : str9, (i & 1024) != 0 ? tournamentJoinConfirmationData.firstPrize : str10, (i & 2048) != 0 ? tournamentJoinConfirmationData.minimumCashoutCoefficient : str11, (i & 4096) != 0 ? tournamentJoinConfirmationData.prizeListMap : list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFirstPrize() {
        return this.firstPrize;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMinimumCashoutCoefficient() {
        return this.minimumCashoutCoefficient;
    }

    public final List<Pair<String, String>> component13() {
        return this.prizeListMap;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowJoinButtons() {
        return this.showJoinButtons;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTotalParticipants() {
        return this.totalParticipants;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMinBetAmount() {
        return this.minBetAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStartsIn() {
        return this.startsIn;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOnlyAmount() {
        return this.onlyAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    public final TournamentJoinConfirmationData copy(String title, String amount, boolean showJoinButtons, String totalParticipants, String minBetAmount, String startsIn, String currency, String onlyAmount, String startDate, String endDate, String firstPrize, String minimumCashoutCoefficient, List<Pair<String, String>> prizeListMap) {
        qn4.b(title, amount, minBetAmount, startsIn, currency);
        qn4.b(onlyAmount, startDate, endDate, firstPrize, minimumCashoutCoefficient);
        prizeListMap.getClass();
        return new TournamentJoinConfirmationData(title, amount, showJoinButtons, totalParticipants, minBetAmount, startsIn, currency, onlyAmount, startDate, endDate, firstPrize, minimumCashoutCoefficient, prizeListMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentJoinConfirmationData)) {
            return false;
        }
        TournamentJoinConfirmationData tournamentJoinConfirmationData = (TournamentJoinConfirmationData) other;
        return Intrinsics.g(this.title, tournamentJoinConfirmationData.title) && Intrinsics.g(this.amount, tournamentJoinConfirmationData.amount) && this.showJoinButtons == tournamentJoinConfirmationData.showJoinButtons && Intrinsics.g(this.totalParticipants, tournamentJoinConfirmationData.totalParticipants) && Intrinsics.g(this.minBetAmount, tournamentJoinConfirmationData.minBetAmount) && Intrinsics.g(this.startsIn, tournamentJoinConfirmationData.startsIn) && Intrinsics.g(this.currency, tournamentJoinConfirmationData.currency) && Intrinsics.g(this.onlyAmount, tournamentJoinConfirmationData.onlyAmount) && Intrinsics.g(this.startDate, tournamentJoinConfirmationData.startDate) && Intrinsics.g(this.endDate, tournamentJoinConfirmationData.endDate) && Intrinsics.g(this.firstPrize, tournamentJoinConfirmationData.firstPrize) && Intrinsics.g(this.minimumCashoutCoefficient, tournamentJoinConfirmationData.minimumCashoutCoefficient) && Intrinsics.g(this.prizeListMap, tournamentJoinConfirmationData.prizeListMap);
    }

    public final String getAmount() {
        return this.amount;
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

    public final List<Pair<String, String>> getPrizeListMap() {
        return this.prizeListMap;
    }

    public final boolean getShowJoinButtons() {
        return this.showJoinButtons;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getStartsIn() {
        return this.startsIn;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTotalParticipants() {
        return this.totalParticipants;
    }

    public int hashCode() {
        int iA = mtg0.a(gmf0.a(this.title.hashCode() * 31, 31, this.amount), 31, this.showJoinButtons);
        String str = this.totalParticipants;
        return this.prizeListMap.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.minBetAmount), 31, this.startsIn), 31, this.currency), 31, this.onlyAmount), 31, this.startDate), 31, this.endDate), 31, this.firstPrize), 31, this.minimumCashoutCoefficient);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TournamentJoinConfirmationData(title=");
        sb.append(this.title);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", showJoinButtons=");
        sb.append(this.showJoinButtons);
        sb.append(", totalParticipants=");
        sb.append(this.totalParticipants);
        sb.append(", minBetAmount=");
        sb.append(this.minBetAmount);
        sb.append(", startsIn=");
        sb.append(this.startsIn);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", onlyAmount=");
        sb.append(this.onlyAmount);
        sb.append(", startDate=");
        sb.append(this.startDate);
        sb.append(", endDate=");
        sb.append(this.endDate);
        sb.append(", firstPrize=");
        sb.append(this.firstPrize);
        sb.append(", minimumCashoutCoefficient=");
        sb.append(this.minimumCashoutCoefficient);
        sb.append(", prizeListMap=");
        return o8i.a(sb, this.prizeListMap, ')');
    }

    public TournamentJoinConfirmationData(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<Pair<String, String>> list) {
        qn4.b(str, str2, str4, str5, str6);
        qn4.b(str7, str8, str9, str10, str11);
        list.getClass();
        this.title = str;
        this.amount = str2;
        this.showJoinButtons = z;
        this.totalParticipants = str3;
        this.minBetAmount = str4;
        this.startsIn = str5;
        this.currency = str6;
        this.onlyAmount = str7;
        this.startDate = str8;
        this.endDate = str9;
        this.firstPrize = str10;
        this.minimumCashoutCoefficient = str11;
        this.prizeListMap = list;
    }

    public TournamentJoinConfirmationData() {
        this(null, null, false, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}

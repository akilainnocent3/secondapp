package com.sportygames.redblack.remote.models;

import com.appsflyer.internal.l;
import com.appsflyer.internal.w;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.models.BetHistoryBase;
import defpackage.em5;
import defpackage.f87;
import defpackage.ffp;
import defpackage.fwv;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hib0;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.nrg0;
import defpackage.qn4;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\t\u0010C\u001a\u00020\u0006HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u000fHÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0006HÆ\u0003J\t\u0010J\u001a\u00020\u000fHÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\t\u0010M\u001a\u00020\u0016HÆ\u0003J\t\u0010N\u001a\u00020\u000fHÆ\u0003J\t\u0010O\u001a\u00020\u0006HÆ\u0003J\t\u0010P\u001a\u00020\u001aHÆ\u0003J\t\u0010Q\u001a\u00020\u001cHÆ\u0003J\t\u0010R\u001a\u00020\u001aHÆ\u0003Jå\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001aHÆ\u0001J\u0013\u0010T\u001a\u00020\u001a2\b\u0010U\u001a\u0004\u0018\u00010VHÖ\u0003J\t\u0010W\u001a\u00020\u0016HÖ\u0001J\t\u0010X\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0017\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b5\u0010-R\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001a\u0010\u001d\u001a\u00020\u001aX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u00108\"\u0004\b;\u0010<¨\u0006Y"}, d2 = {"Lcom/sportygames/redblack/remote/models/BetHistoryItem;", "Lcom/sportygames/commons/models/BetHistoryBase;", "actualCreditedAmount", "", "actualDebitedAmount", "awardStatus", "", "betPlaceStatus", "betTraceId", "countryCode", "createTime", "currency", "decision", "giftAmount", AnalyticsParam.EVENT_PARAM_ID, "", "payoutAmount", "resolvedAt", "roundId", "stakeAmount", "ticketId", "turnId", "", "uid", "updateTime", "winStatus", "", "userCard", "Lcom/sportygames/redblack/remote/models/UserCard;", "isExpanded", "<init>", "(DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DJDLjava/lang/String;JDLjava/lang/String;IJLjava/lang/String;ZLcom/sportygames/redblack/remote/models/UserCard;Z)V", "getActualCreditedAmount", "()D", "getActualDebitedAmount", "getAwardStatus", "()Ljava/lang/String;", "getBetPlaceStatus", "getBetTraceId", "getCountryCode", "getCreateTime", "getCurrency", "getDecision", "getGiftAmount", "getId", "()J", "getPayoutAmount", "getResolvedAt", "getRoundId", "getStakeAmount", "getTicketId", "getTurnId", "()I", "getUid", "getUpdateTime", "getWinStatus", "()Z", "getUserCard", "()Lcom/sportygames/redblack/remote/models/UserCard;", "setExpanded", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetHistoryItem implements BetHistoryBase {
    public static final int $stable = 8;
    private final double actualCreditedAmount;
    private final double actualDebitedAmount;
    private final String awardStatus;
    private final String betPlaceStatus;
    private final String betTraceId;
    private final String countryCode;
    private final String createTime;
    private final String currency;
    private final String decision;
    private final double giftAmount;
    private final long id;
    private boolean isExpanded;
    private final double payoutAmount;
    private final String resolvedAt;
    private final long roundId;
    private final double stakeAmount;
    private final String ticketId;
    private final int turnId;
    private final long uid;
    private final String updateTime;
    private final UserCard userCard;
    private final boolean winStatus;

    public BetHistoryItem(double d, double d2, String str, String str2, String str3, String str4, String str5, String str6, String str7, double d3, long j, double d4, String str8, long j2, double d5, String str9, int i, long j3, String str10, boolean z, UserCard userCard, boolean z2) {
        qn4.b(str, str2, str3, str4, str5);
        qn4.b(str6, str7, str8, str9, str10);
        userCard.getClass();
        this.actualCreditedAmount = d;
        this.actualDebitedAmount = d2;
        this.awardStatus = str;
        this.betPlaceStatus = str2;
        this.betTraceId = str3;
        this.countryCode = str4;
        this.createTime = str5;
        this.currency = str6;
        this.decision = str7;
        this.giftAmount = d3;
        this.id = j;
        this.payoutAmount = d4;
        this.resolvedAt = str8;
        this.roundId = j2;
        this.stakeAmount = d5;
        this.ticketId = str9;
        this.turnId = i;
        this.uid = j3;
        this.updateTime = str10;
        this.winStatus = z;
        this.userCard = userCard;
        this.isExpanded = z2;
    }

    public static /* synthetic */ BetHistoryItem copy$default(BetHistoryItem betHistoryItem, double d, double d2, String str, String str2, String str3, String str4, String str5, String str6, String str7, double d3, long j, double d4, String str8, long j2, double d5, String str9, int i, long j3, String str10, boolean z, UserCard userCard, boolean z2, int i2, Object obj) {
        boolean z3;
        boolean z4;
        double d6 = (i2 & 1) != 0 ? betHistoryItem.actualCreditedAmount : d;
        double d7 = (i2 & 2) != 0 ? betHistoryItem.actualDebitedAmount : d2;
        String str11 = (i2 & 4) != 0 ? betHistoryItem.awardStatus : str;
        String str12 = (i2 & 8) != 0 ? betHistoryItem.betPlaceStatus : str2;
        String str13 = (i2 & 16) != 0 ? betHistoryItem.betTraceId : str3;
        String str14 = (i2 & 32) != 0 ? betHistoryItem.countryCode : str4;
        String str15 = (i2 & 64) != 0 ? betHistoryItem.createTime : str5;
        String str16 = (i2 & 128) != 0 ? betHistoryItem.currency : str6;
        String str17 = (i2 & 256) != 0 ? betHistoryItem.decision : str7;
        double d8 = (i2 & 512) != 0 ? betHistoryItem.giftAmount : d3;
        long j4 = (i2 & 1024) != 0 ? betHistoryItem.id : j;
        double d9 = (i2 & 2048) != 0 ? betHistoryItem.payoutAmount : d4;
        String str18 = (i2 & 4096) != 0 ? betHistoryItem.resolvedAt : str8;
        long j5 = (i2 & 8192) != 0 ? betHistoryItem.roundId : j2;
        double d10 = (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? betHistoryItem.stakeAmount : d5;
        String str19 = (i2 & 32768) != 0 ? betHistoryItem.ticketId : str9;
        int i3 = (i2 & 65536) != 0 ? betHistoryItem.turnId : i;
        double d11 = d10;
        long j6 = (i2 & 131072) != 0 ? betHistoryItem.uid : j3;
        String str20 = (i2 & 262144) != 0 ? betHistoryItem.updateTime : str10;
        long j7 = j6;
        boolean z5 = (i2 & 524288) != 0 ? betHistoryItem.winStatus : z;
        UserCard userCard2 = (i2 & 1048576) != 0 ? betHistoryItem.userCard : userCard;
        if ((i2 & 2097152) != 0) {
            z4 = z5;
            z3 = betHistoryItem.isExpanded;
        } else {
            z3 = z2;
            z4 = z5;
        }
        return betHistoryItem.copy(d6, d7, str11, str12, str13, str14, str15, str16, str17, d8, j4, d9, str18, j5, d11, str19, i3, j7, str20, z4, userCard2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getActualCreditedAmount() {
        return this.actualCreditedAmount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getResolvedAt() {
        return this.resolvedAt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getTurnId() {
        return this.turnId;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getActualDebitedAmount() {
        return this.actualDebitedAmount;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getWinStatus() {
        return this.winStatus;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final UserCard getUserCard() {
        return this.userCard;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAwardStatus() {
        return this.awardStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBetPlaceStatus() {
        return this.betPlaceStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBetTraceId() {
        return this.betTraceId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDecision() {
        return this.decision;
    }

    public final BetHistoryItem copy(double actualCreditedAmount, double actualDebitedAmount, String awardStatus, String betPlaceStatus, String betTraceId, String countryCode, String createTime, String currency, String decision, double giftAmount, long id, double payoutAmount, String resolvedAt, long roundId, double stakeAmount, String ticketId, int turnId, long uid, String updateTime, boolean winStatus, UserCard userCard, boolean isExpanded) {
        qn4.b(awardStatus, betPlaceStatus, betTraceId, countryCode, createTime);
        qn4.b(currency, decision, resolvedAt, ticketId, updateTime);
        userCard.getClass();
        return new BetHistoryItem(actualCreditedAmount, actualDebitedAmount, awardStatus, betPlaceStatus, betTraceId, countryCode, createTime, currency, decision, giftAmount, id, payoutAmount, resolvedAt, roundId, stakeAmount, ticketId, turnId, uid, updateTime, winStatus, userCard, isExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetHistoryItem)) {
            return false;
        }
        BetHistoryItem betHistoryItem = (BetHistoryItem) other;
        return Double.compare(this.actualCreditedAmount, betHistoryItem.actualCreditedAmount) == 0 && Double.compare(this.actualDebitedAmount, betHistoryItem.actualDebitedAmount) == 0 && Intrinsics.g(this.awardStatus, betHistoryItem.awardStatus) && Intrinsics.g(this.betPlaceStatus, betHistoryItem.betPlaceStatus) && Intrinsics.g(this.betTraceId, betHistoryItem.betTraceId) && Intrinsics.g(this.countryCode, betHistoryItem.countryCode) && Intrinsics.g(this.createTime, betHistoryItem.createTime) && Intrinsics.g(this.currency, betHistoryItem.currency) && Intrinsics.g(this.decision, betHistoryItem.decision) && Double.compare(this.giftAmount, betHistoryItem.giftAmount) == 0 && this.id == betHistoryItem.id && Double.compare(this.payoutAmount, betHistoryItem.payoutAmount) == 0 && Intrinsics.g(this.resolvedAt, betHistoryItem.resolvedAt) && this.roundId == betHistoryItem.roundId && Double.compare(this.stakeAmount, betHistoryItem.stakeAmount) == 0 && Intrinsics.g(this.ticketId, betHistoryItem.ticketId) && this.turnId == betHistoryItem.turnId && this.uid == betHistoryItem.uid && Intrinsics.g(this.updateTime, betHistoryItem.updateTime) && this.winStatus == betHistoryItem.winStatus && Intrinsics.g(this.userCard, betHistoryItem.userCard) && this.isExpanded == betHistoryItem.isExpanded;
    }

    public final double getActualCreditedAmount() {
        return this.actualCreditedAmount;
    }

    public final double getActualDebitedAmount() {
        return this.actualDebitedAmount;
    }

    public final String getAwardStatus() {
        return this.awardStatus;
    }

    public final String getBetPlaceStatus() {
        return this.betPlaceStatus;
    }

    public final String getBetTraceId() {
        return this.betTraceId;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDecision() {
        return this.decision;
    }

    public final double getGiftAmount() {
        return this.giftAmount;
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public long getId() {
        return this.id;
    }

    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final String getResolvedAt() {
        return this.resolvedAt;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public final int getTurnId() {
        return this.turnId;
    }

    public final long getUid() {
        return this.uid;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final UserCard getUserCard() {
        return this.userCard;
    }

    public final boolean getWinStatus() {
        return this.winStatus;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isExpanded) + ((this.userCard.hashCode() + mtg0.a(gmf0.a(f87.a(gpp.a(this.turnId, gmf0.a(nrg0.a(f87.a(gmf0.a(nrg0.a(f87.a(nrg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(nrg0.a(Double.hashCode(this.actualCreditedAmount) * 31, 31, this.actualDebitedAmount), 31, this.awardStatus), 31, this.betPlaceStatus), 31, this.betTraceId), 31, this.countryCode), 31, this.createTime), 31, this.currency), 31, this.decision), 31, this.giftAmount), this.id, 31), 31, this.payoutAmount), 31, this.resolvedAt), this.roundId, 31), 31, this.stakeAmount), 31, this.ticketId), 31), this.uid, 31), 31, this.updateTime), 31, this.winStatus)) * 31);
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public boolean isExpanded() {
        return this.isExpanded;
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public String toString() {
        double d = this.actualCreditedAmount;
        double d2 = this.actualDebitedAmount;
        String str = this.awardStatus;
        String str2 = this.betPlaceStatus;
        String str3 = this.betTraceId;
        String str4 = this.countryCode;
        String str5 = this.createTime;
        String str6 = this.currency;
        String str7 = this.decision;
        double d3 = this.giftAmount;
        long j = this.id;
        double d4 = this.payoutAmount;
        String str8 = this.resolvedAt;
        long j2 = this.roundId;
        double d5 = this.stakeAmount;
        String str9 = this.ticketId;
        int i = this.turnId;
        long j3 = this.uid;
        String str10 = this.updateTime;
        boolean z = this.winStatus;
        UserCard userCard = this.userCard;
        boolean z2 = this.isExpanded;
        StringBuilder sbA = ffp.a(d, "BetHistoryItem(actualCreditedAmount=", ", actualDebitedAmount=");
        fwv.a(d2, ", awardStatus=", str, sbA);
        hxa.c(sbA, ", betPlaceStatus=", str2, ", betTraceId=", str3);
        hxa.c(sbA, ", countryCode=", str4, ", createTime=", str5);
        hxa.c(sbA, ", currency=", str6, ", decision=", str7);
        hib0.b(d3, ", giftAmount=", ", id=", sbA);
        sbA.append(j);
        hib0.b(d4, ", payoutAmount=", ", resolvedAt=", sbA);
        l.a(j2, str8, ", roundId=", sbA);
        hib0.b(d5, ", stakeAmount=", ", ticketId=", sbA);
        wxa.b(i, str9, ", turnId=", ", uid=", sbA);
        em5.a(j3, ", updateTime=", str10, sbA);
        sbA.append(", winStatus=");
        sbA.append(z);
        sbA.append(", userCard=");
        sbA.append(userCard);
        return w.a(sbA, ", isExpanded=", z2, ")");
    }
}

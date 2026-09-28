package com.sportygames.crash.remote.models;

import defpackage.f87;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hib0;
import defpackage.hxa;
import defpackage.k800;
import defpackage.nrg0;
import defpackage.q6a0;
import defpackage.qn4;
import defpackage.ry4;
import defpackage.s27;
import defpackage.to10;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\tHÆ\u0003J\t\u0010H\u001a\u00020\tHÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010J\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010K\u001a\u00020\rHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010M\u001a\u00020\rHÆ\u0003J\t\u0010N\u001a\u00020\rHÆ\u0003J\t\u0010O\u001a\u00020\rHÆ\u0003J\t\u0010P\u001a\u00020\rHÆ\u0003J\t\u0010Q\u001a\u00020\rHÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010S\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010T\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010U\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010V\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010W\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010X\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010Y\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010@J\u0010\u0010Z\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010@J\u0096\u0002\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0002\u0010\\J\u0013\u0010]\u001a\u00020\u001d2\b\u0010^\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010_\u001a\u00020\u0006HÖ\u0001J\t\u0010`\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\"\"\u0004\b$\u0010%R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b5\u00100R\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b6\u00100R\u0011\u0010\u0014\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b7\u00100R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010.\u001a\u0004\b8\u0010-R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010.\u001a\u0004\b9\u0010-R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010.\u001a\u0004\b:\u0010-R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010.\u001a\u0004\b;\u0010-R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010.\u001a\u0004\b<\u0010-R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010.\u001a\u0004\b=\u0010-R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010.\u001a\u0004\b>\u0010-R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010A\u001a\u0004\bB\u0010@¨\u0006a"}, d2 = {"Lcom/sportygames/crash/remote/models/TopBets;", "", "roundId", "", "betId", "roomId", "", "betIndex", "stakeAmount", "", "payoutAmount", "giftAmount", "giftId", "", "currency", "cashoutCoefficient", "userId", "nickName", "autoCashoutAt", "cashoutCoefficientStr", "betType", "targetCoefficient", "startCoefficient", "endCoefficient", "actualPayoutAmount", "bonusPercentage", "turboBonusAmount", "payoutWithoutTurboBonusAmount", "turboBonusUsed", "", "stakeSafeUsed", "<init>", "(JJIIDDLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getRoundId", "()J", "getBetId", "setBetId", "(J)V", "getRoomId", "()I", "getBetIndex", "getStakeAmount", "()D", "getPayoutAmount", "getGiftAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGiftId", "()Ljava/lang/String;", "getCurrency", "getCashoutCoefficient", "getUserId", "getNickName", "getAutoCashoutAt", "getCashoutCoefficientStr", "getBetType", "getTargetCoefficient", "getStartCoefficient", "getEndCoefficient", "getActualPayoutAmount", "getBonusPercentage", "getTurboBonusAmount", "getPayoutWithoutTurboBonusAmount", "getTurboBonusUsed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStakeSafeUsed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(JJIIDDLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sportygames/crash/remote/models/TopBets;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopBets {
    public static final int $stable = 8;
    private final Double actualPayoutAmount;
    private final String autoCashoutAt;
    private long betId;
    private final int betIndex;
    private final String betType;
    private final Double bonusPercentage;
    private final String cashoutCoefficient;
    private final String cashoutCoefficientStr;
    private final String currency;
    private final Double endCoefficient;
    private final Double giftAmount;
    private final String giftId;
    private final String nickName;
    private final double payoutAmount;
    private final Double payoutWithoutTurboBonusAmount;
    private final int roomId;
    private final long roundId;
    private final double stakeAmount;
    private final Boolean stakeSafeUsed;
    private final Double startCoefficient;
    private final Double targetCoefficient;
    private final Double turboBonusAmount;
    private final Boolean turboBonusUsed;
    private final String userId;

    public /* synthetic */ TopBets(long j, long j2, int i, int i2, double d, double d2, Double d3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Boolean bool, Boolean bool2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i, i2, d, d2, d3, str, str2, str3, str4, str5, (i3 & 4096) != 0 ? "" : str6, (i3 & 8192) != 0 ? "" : str7, (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "" : str8, (32768 & i3) != 0 ? null : d4, (65536 & i3) != 0 ? null : d5, (131072 & i3) != 0 ? null : d6, (262144 & i3) != 0 ? null : d7, (524288 & i3) != 0 ? null : d8, (1048576 & i3) != 0 ? null : d9, (2097152 & i3) != 0 ? null : d10, (4194304 & i3) != 0 ? Boolean.FALSE : bool, (i3 & 8388608) != 0 ? Boolean.FALSE : bool2);
    }

    public static /* synthetic */ TopBets copy$default(TopBets topBets, long j, long j2, int i, int i2, double d, double d2, Double d3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Boolean bool, Boolean bool2, int i3, Object obj) {
        Boolean bool3;
        Boolean bool4;
        long j3 = (i3 & 1) != 0 ? topBets.roundId : j;
        long j4 = (i3 & 2) != 0 ? topBets.betId : j2;
        int i4 = (i3 & 4) != 0 ? topBets.roomId : i;
        int i5 = (i3 & 8) != 0 ? topBets.betIndex : i2;
        double d11 = (i3 & 16) != 0 ? topBets.stakeAmount : d;
        double d12 = (i3 & 32) != 0 ? topBets.payoutAmount : d2;
        Double d13 = (i3 & 64) != 0 ? topBets.giftAmount : d3;
        String str9 = (i3 & 128) != 0 ? topBets.giftId : str;
        String str10 = (i3 & 256) != 0 ? topBets.currency : str2;
        String str11 = (i3 & 512) != 0 ? topBets.cashoutCoefficient : str3;
        long j5 = j3;
        String str12 = (i3 & 1024) != 0 ? topBets.userId : str4;
        String str13 = (i3 & 2048) != 0 ? topBets.nickName : str5;
        String str14 = str12;
        String str15 = (i3 & 4096) != 0 ? topBets.autoCashoutAt : str6;
        String str16 = (i3 & 8192) != 0 ? topBets.cashoutCoefficientStr : str7;
        String str17 = (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? topBets.betType : str8;
        Double d14 = (i3 & 32768) != 0 ? topBets.targetCoefficient : d4;
        Double d15 = (i3 & 65536) != 0 ? topBets.startCoefficient : d5;
        Double d16 = (i3 & 131072) != 0 ? topBets.endCoefficient : d6;
        Double d17 = (i3 & 262144) != 0 ? topBets.actualPayoutAmount : d7;
        Double d18 = (i3 & 524288) != 0 ? topBets.bonusPercentage : d8;
        Double d19 = (i3 & 1048576) != 0 ? topBets.turboBonusAmount : d9;
        Double d20 = (i3 & 2097152) != 0 ? topBets.payoutWithoutTurboBonusAmount : d10;
        Boolean bool5 = (i3 & 4194304) != 0 ? topBets.turboBonusUsed : bool;
        if ((i3 & 8388608) != 0) {
            bool4 = bool5;
            bool3 = topBets.stakeSafeUsed;
        } else {
            bool3 = bool2;
            bool4 = bool5;
        }
        return topBets.copy(j5, j4, i4, i5, d11, d12, d13, str9, str10, str11, str14, str13, str15, str16, str17, d14, d15, d16, d17, d18, d19, d20, bool4, bool3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAutoCashoutAt() {
        return this.autoCashoutAt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCashoutCoefficientStr() {
        return this.cashoutCoefficientStr;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getBetType() {
        return this.betType;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Double getTargetCoefficient() {
        return this.targetCoefficient;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Double getStartCoefficient() {
        return this.startCoefficient;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Double getEndCoefficient() {
        return this.endCoefficient;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Double getActualPayoutAmount() {
        return this.actualPayoutAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Double getBonusPercentage() {
        return this.bonusPercentage;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Double getTurboBonusAmount() {
        return this.turboBonusAmount;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Double getPayoutWithoutTurboBonusAmount() {
        return this.payoutWithoutTurboBonusAmount;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getTurboBonusUsed() {
        return this.turboBonusUsed;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Boolean getStakeSafeUsed() {
        return this.stakeSafeUsed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRoomId() {
        return this.roomId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBetIndex() {
        return this.betIndex;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final TopBets copy(long roundId, long betId, int roomId, int betIndex, double stakeAmount, double payoutAmount, Double giftAmount, String giftId, String currency, String cashoutCoefficient, String userId, String nickName, String autoCashoutAt, String cashoutCoefficientStr, String betType, Double targetCoefficient, Double startCoefficient, Double endCoefficient, Double actualPayoutAmount, Double bonusPercentage, Double turboBonusAmount, Double payoutWithoutTurboBonusAmount, Boolean turboBonusUsed, Boolean stakeSafeUsed) {
        qn4.b(currency, userId, nickName, autoCashoutAt, cashoutCoefficientStr);
        betType.getClass();
        return new TopBets(roundId, betId, roomId, betIndex, stakeAmount, payoutAmount, giftAmount, giftId, currency, cashoutCoefficient, userId, nickName, autoCashoutAt, cashoutCoefficientStr, betType, targetCoefficient, startCoefficient, endCoefficient, actualPayoutAmount, bonusPercentage, turboBonusAmount, payoutWithoutTurboBonusAmount, turboBonusUsed, stakeSafeUsed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopBets)) {
            return false;
        }
        TopBets topBets = (TopBets) other;
        return this.roundId == topBets.roundId && this.betId == topBets.betId && this.roomId == topBets.roomId && this.betIndex == topBets.betIndex && Double.compare(this.stakeAmount, topBets.stakeAmount) == 0 && Double.compare(this.payoutAmount, topBets.payoutAmount) == 0 && Intrinsics.g(this.giftAmount, topBets.giftAmount) && Intrinsics.g(this.giftId, topBets.giftId) && Intrinsics.g(this.currency, topBets.currency) && Intrinsics.g(this.cashoutCoefficient, topBets.cashoutCoefficient) && Intrinsics.g(this.userId, topBets.userId) && Intrinsics.g(this.nickName, topBets.nickName) && Intrinsics.g(this.autoCashoutAt, topBets.autoCashoutAt) && Intrinsics.g(this.cashoutCoefficientStr, topBets.cashoutCoefficientStr) && Intrinsics.g(this.betType, topBets.betType) && Intrinsics.g(this.targetCoefficient, topBets.targetCoefficient) && Intrinsics.g(this.startCoefficient, topBets.startCoefficient) && Intrinsics.g(this.endCoefficient, topBets.endCoefficient) && Intrinsics.g(this.actualPayoutAmount, topBets.actualPayoutAmount) && Intrinsics.g(this.bonusPercentage, topBets.bonusPercentage) && Intrinsics.g(this.turboBonusAmount, topBets.turboBonusAmount) && Intrinsics.g(this.payoutWithoutTurboBonusAmount, topBets.payoutWithoutTurboBonusAmount) && Intrinsics.g(this.turboBonusUsed, topBets.turboBonusUsed) && Intrinsics.g(this.stakeSafeUsed, topBets.stakeSafeUsed);
    }

    public final Double getActualPayoutAmount() {
        return this.actualPayoutAmount;
    }

    public final String getAutoCashoutAt() {
        return this.autoCashoutAt;
    }

    public final long getBetId() {
        return this.betId;
    }

    public final int getBetIndex() {
        return this.betIndex;
    }

    public final String getBetType() {
        return this.betType;
    }

    public final Double getBonusPercentage() {
        return this.bonusPercentage;
    }

    public final String getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    public final String getCashoutCoefficientStr() {
        return this.cashoutCoefficientStr;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getEndCoefficient() {
        return this.endCoefficient;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final String getGiftId() {
        return this.giftId;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final Double getPayoutWithoutTurboBonusAmount() {
        return this.payoutWithoutTurboBonusAmount;
    }

    public final int getRoomId() {
        return this.roomId;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final Boolean getStakeSafeUsed() {
        return this.stakeSafeUsed;
    }

    public final Double getStartCoefficient() {
        return this.startCoefficient;
    }

    public final Double getTargetCoefficient() {
        return this.targetCoefficient;
    }

    public final Double getTurboBonusAmount() {
        return this.turboBonusAmount;
    }

    public final Boolean getTurboBonusUsed() {
        return this.turboBonusUsed;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = nrg0.a(nrg0.a(gpp.a(this.betIndex, gpp.a(this.roomId, f87.a(Long.hashCode(this.roundId) * 31, this.betId, 31), 31), 31), 31, this.stakeAmount), 31, this.payoutAmount);
        Double d = this.giftAmount;
        int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.giftId;
        int iA2 = gmf0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.currency);
        String str2 = this.cashoutCoefficient;
        int iA3 = gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a((iA2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.userId), 31, this.nickName), 31, this.autoCashoutAt), 31, this.cashoutCoefficientStr), 31, this.betType);
        Double d2 = this.targetCoefficient;
        int iHashCode2 = (iA3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.startCoefficient;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.endCoefficient;
        int iHashCode4 = (iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.actualPayoutAmount;
        int iHashCode5 = (iHashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.bonusPercentage;
        int iHashCode6 = (iHashCode5 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.turboBonusAmount;
        int iHashCode7 = (iHashCode6 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.payoutWithoutTurboBonusAmount;
        int iHashCode8 = (iHashCode7 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Boolean bool = this.turboBonusUsed;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.stakeSafeUsed;
        return iHashCode9 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final void setBetId(long j) {
        this.betId = j;
    }

    public String toString() {
        long j = this.roundId;
        long j2 = this.betId;
        int i = this.roomId;
        int i2 = this.betIndex;
        double d = this.stakeAmount;
        double d2 = this.payoutAmount;
        Double d3 = this.giftAmount;
        String str = this.giftId;
        String str2 = this.currency;
        String str3 = this.cashoutCoefficient;
        String str4 = this.userId;
        String str5 = this.nickName;
        String str6 = this.autoCashoutAt;
        String str7 = this.cashoutCoefficientStr;
        String str8 = this.betType;
        Double d4 = this.targetCoefficient;
        Double d5 = this.startCoefficient;
        Double d6 = this.endCoefficient;
        Double d7 = this.actualPayoutAmount;
        Double d8 = this.bonusPercentage;
        Double d9 = this.turboBonusAmount;
        Double d10 = this.payoutWithoutTurboBonusAmount;
        Boolean bool = this.turboBonusUsed;
        Boolean bool2 = this.stakeSafeUsed;
        StringBuilder sbA = q6a0.a(j, "TopBets(roundId=", ", betId=");
        to10.a(sbA, j2, ", roomId=", i);
        sbA.append(", betIndex=");
        sbA.append(i2);
        sbA.append(", stakeAmount=");
        sbA.append(d);
        hib0.b(d2, ", payoutAmount=", ", giftAmount=", sbA);
        ry4.a(d3, ", giftId=", str, ", currency=", sbA);
        hxa.c(sbA, str2, ", cashoutCoefficient=", str3, ", userId=");
        hxa.c(sbA, str4, ", nickName=", str5, ", autoCashoutAt=");
        hxa.c(sbA, str6, ", cashoutCoefficientStr=", str7, ", betType=");
        k800.a(d4, str8, ", targetCoefficient=", ", startCoefficient=", sbA);
        s27.a(d5, d6, ", endCoefficient=", ", actualPayoutAmount=", sbA);
        s27.a(d7, d8, ", bonusPercentage=", ", turboBonusAmount=", sbA);
        s27.a(d9, d10, ", payoutWithoutTurboBonusAmount=", ", turboBonusUsed=", sbA);
        sbA.append(bool);
        sbA.append(", stakeSafeUsed=");
        sbA.append(bool2);
        sbA.append(")");
        return sbA.toString();
    }

    public TopBets(long j, long j2, int i, int i2, double d, double d2, Double d3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Boolean bool, Boolean bool2) {
        qn4.b(str2, str4, str5, str6, str7);
        str8.getClass();
        this.roundId = j;
        this.betId = j2;
        this.roomId = i;
        this.betIndex = i2;
        this.stakeAmount = d;
        this.payoutAmount = d2;
        this.giftAmount = d3;
        this.giftId = str;
        this.currency = str2;
        this.cashoutCoefficient = str3;
        this.userId = str4;
        this.nickName = str5;
        this.autoCashoutAt = str6;
        this.cashoutCoefficientStr = str7;
        this.betType = str8;
        this.targetCoefficient = d4;
        this.startCoefficient = d5;
        this.endCoefficient = d6;
        this.actualPayoutAmount = d7;
        this.bonusPercentage = d8;
        this.turboBonusAmount = d9;
        this.payoutWithoutTurboBonusAmount = d10;
        this.turboBonusUsed = bool;
        this.stakeSafeUsed = bool2;
    }
}

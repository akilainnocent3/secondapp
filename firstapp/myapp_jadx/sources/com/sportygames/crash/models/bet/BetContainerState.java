package com.sportygames.crash.models.bet;

import com.appsflyer.internal.w;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.crash.models.BetData;
import com.sportygames.crash.remote.models.DetailResponse;
import com.sportygames.crash.remote.models.TopBets;
import defpackage.f87;
import defpackage.gpp;
import defpackage.mtg0;
import defpackage.u8;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\nHÆ\u0003J\t\u0010C\u001a\u00020\fHÆ\u0003J\t\u0010D\u001a\u00020\u000eHÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\nHÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\nHÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0017HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003Jï\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010V\u001a\u00020\u00032\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020\nHÖ\u0001J\t\u0010Y\u001a\u00020ZHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b6\u0010*R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010#R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010#R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010#R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010#¨\u0006["}, d2 = {"Lcom/sportygames/crash/models/bet/BetContainerState;", "", "resetWholeContainer", "", "detailResponse", "Lcom/sportygames/crash/remote/models/DetailResponse;", "roundId", "", "resetAllData", "levelGameDetailsApplyEpoch", "", "gift", "Lcom/sportygames/commons/models/GiftItem;", "betData", "Lcom/sportygames/crash/models/BetData;", "betPlaced", "betInProgress", "cashoutInProgress", "keypadType", "fbgAvailable", "keypadValue", "extraKey", "topBets", "Lcom/sportygames/crash/remote/models/TopBets;", "resetChips", "keypadVisible", "autoBetFlag", "cancelBet", "isTurboBet", "isStakeSafeBet", "isStakeSafeApplied", "isTurboApplied", "<init>", "(ZLcom/sportygames/crash/remote/models/DetailResponse;JZILcom/sportygames/commons/models/GiftItem;Lcom/sportygames/crash/models/BetData;ZZZIZIZLcom/sportygames/crash/remote/models/TopBets;ZZZZZZZZ)V", "getResetWholeContainer", "()Z", "getDetailResponse", "()Lcom/sportygames/crash/remote/models/DetailResponse;", "getRoundId", "()J", "getResetAllData", "getLevelGameDetailsApplyEpoch", "()I", "getGift", "()Lcom/sportygames/commons/models/GiftItem;", "getBetData", "()Lcom/sportygames/crash/models/BetData;", "setBetData", "(Lcom/sportygames/crash/models/BetData;)V", "getBetPlaced", "getBetInProgress", "getCashoutInProgress", "getKeypadType", "getFbgAvailable", "getKeypadValue", "getExtraKey", "getTopBets", "()Lcom/sportygames/crash/remote/models/TopBets;", "getResetChips", "getKeypadVisible", "getAutoBetFlag", "getCancelBet", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetContainerState {
    public static final int $stable = 8;
    private final boolean autoBetFlag;
    private BetData betData;
    private final boolean betInProgress;
    private final boolean betPlaced;
    private final boolean cancelBet;
    private final boolean cashoutInProgress;
    private final DetailResponse detailResponse;
    private final boolean extraKey;
    private final boolean fbgAvailable;
    private final GiftItem gift;
    private final boolean isStakeSafeApplied;
    private final boolean isStakeSafeBet;
    private final boolean isTurboApplied;
    private final boolean isTurboBet;
    private final int keypadType;
    private final int keypadValue;
    private final boolean keypadVisible;
    private final int levelGameDetailsApplyEpoch;
    private final boolean resetAllData;
    private final boolean resetChips;
    private final boolean resetWholeContainer;
    private final long roundId;
    private final TopBets topBets;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ BetContainerState(boolean z, DetailResponse detailResponse, long j, boolean z2, int i, GiftItem giftItem, BetData betData, boolean z3, boolean z4, boolean z5, int i2, boolean z6, int i3, boolean z7, TopBets topBets, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? new DetailResponse(0.0d, 0.0d, 0.0d, "", new ArrayList(), new ArrayList(), 0.0d, 0.0d, 0, 0, "", Boolean.TRUE, "") : detailResponse, (i4 & 4) != 0 ? 0L : j, (i4 & 8) != 0 ? false : z2, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? new GiftItem(0.0d, "", "", "", 0.0d, 0L, 0, Double.valueOf(0.0d), null) : giftItem, (i4 & 64) != 0 ? new BetData(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : betData, (i4 & 128) != 0 ? false : z3, (i4 & 256) != 0 ? false : z4, (i4 & 512) != 0 ? false : z5, (i4 & 1024) != 0 ? -22 : i2, (i4 & 2048) != 0 ? false : z6, (i4 & 4096) != 0 ? -1 : i3, (i4 & 8192) != 0 ? false : z7, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? new TopBets(0L, 0L, 0, 0, 0.0d, 0.0d, null, "", "", "", "", "", "", "", "", null, null, null, null, null, null, null, null, null, 16252928, null) : topBets, (32768 & i4) != 0 ? false : z8, (i4 & 65536) != 0 ? false : z9, (i4 & 131072) != 0 ? false : z10, (i4 & 262144) != 0 ? false : z11, (i4 & 524288) != 0 ? false : z12, (i4 & 1048576) != 0 ? false : z13, (i4 & 2097152) != 0 ? false : z14, (i4 & 4194304) != 0 ? false : z15);
    }

    public static /* synthetic */ BetContainerState copy$default(BetContainerState betContainerState, boolean z, DetailResponse detailResponse, long j, boolean z2, int i, GiftItem giftItem, BetData betData, boolean z3, boolean z4, boolean z5, int i2, boolean z6, int i3, boolean z7, TopBets topBets, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i4, Object obj) {
        boolean z16;
        boolean z17;
        boolean z18 = (i4 & 1) != 0 ? betContainerState.resetWholeContainer : z;
        DetailResponse detailResponse2 = (i4 & 2) != 0 ? betContainerState.detailResponse : detailResponse;
        long j2 = (i4 & 4) != 0 ? betContainerState.roundId : j;
        boolean z19 = (i4 & 8) != 0 ? betContainerState.resetAllData : z2;
        int i5 = (i4 & 16) != 0 ? betContainerState.levelGameDetailsApplyEpoch : i;
        GiftItem giftItem2 = (i4 & 32) != 0 ? betContainerState.gift : giftItem;
        BetData betData2 = (i4 & 64) != 0 ? betContainerState.betData : betData;
        boolean z20 = (i4 & 128) != 0 ? betContainerState.betPlaced : z3;
        boolean z21 = (i4 & 256) != 0 ? betContainerState.betInProgress : z4;
        boolean z22 = (i4 & 512) != 0 ? betContainerState.cashoutInProgress : z5;
        int i6 = (i4 & 1024) != 0 ? betContainerState.keypadType : i2;
        boolean z23 = (i4 & 2048) != 0 ? betContainerState.fbgAvailable : z6;
        int i7 = (i4 & 4096) != 0 ? betContainerState.keypadValue : i3;
        boolean z24 = z18;
        boolean z25 = (i4 & 8192) != 0 ? betContainerState.extraKey : z7;
        TopBets topBets2 = (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? betContainerState.topBets : topBets;
        boolean z26 = (i4 & 32768) != 0 ? betContainerState.resetChips : z8;
        boolean z27 = (i4 & 65536) != 0 ? betContainerState.keypadVisible : z9;
        boolean z28 = (i4 & 131072) != 0 ? betContainerState.autoBetFlag : z10;
        boolean z29 = (i4 & 262144) != 0 ? betContainerState.cancelBet : z11;
        boolean z30 = (i4 & 524288) != 0 ? betContainerState.isTurboBet : z12;
        boolean z31 = (i4 & 1048576) != 0 ? betContainerState.isStakeSafeBet : z13;
        boolean z32 = (i4 & 2097152) != 0 ? betContainerState.isStakeSafeApplied : z14;
        if ((i4 & 4194304) != 0) {
            z17 = z32;
            z16 = betContainerState.isTurboApplied;
        } else {
            z16 = z15;
            z17 = z32;
        }
        return betContainerState.copy(z24, detailResponse2, j2, z19, i5, giftItem2, betData2, z20, z21, z22, i6, z23, i7, z25, topBets2, z26, z27, z28, z29, z30, z31, z17, z16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getResetWholeContainer() {
        return this.resetWholeContainer;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getCashoutInProgress() {
        return this.cashoutInProgress;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getKeypadType() {
        return this.keypadType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getFbgAvailable() {
        return this.fbgAvailable;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getKeypadValue() {
        return this.keypadValue;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getExtraKey() {
        return this.extraKey;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final TopBets getTopBets() {
        return this.topBets;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getResetChips() {
        return this.resetChips;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getKeypadVisible() {
        return this.keypadVisible;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getAutoBetFlag() {
        return this.autoBetFlag;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getCancelBet() {
        return this.cancelBet;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DetailResponse getDetailResponse() {
        return this.detailResponse;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getIsTurboBet() {
        return this.isTurboBet;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getIsStakeSafeBet() {
        return this.isStakeSafeBet;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getIsStakeSafeApplied() {
        return this.isStakeSafeApplied;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getIsTurboApplied() {
        return this.isTurboApplied;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getResetAllData() {
        return this.resetAllData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLevelGameDetailsApplyEpoch() {
        return this.levelGameDetailsApplyEpoch;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GiftItem getGift() {
        return this.gift;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BetData getBetData() {
        return this.betData;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getBetPlaced() {
        return this.betPlaced;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getBetInProgress() {
        return this.betInProgress;
    }

    public final BetContainerState copy(boolean resetWholeContainer, DetailResponse detailResponse, long roundId, boolean resetAllData, int levelGameDetailsApplyEpoch, GiftItem gift, BetData betData, boolean betPlaced, boolean betInProgress, boolean cashoutInProgress, int keypadType, boolean fbgAvailable, int keypadValue, boolean extraKey, TopBets topBets, boolean resetChips, boolean keypadVisible, boolean autoBetFlag, boolean cancelBet, boolean isTurboBet, boolean isStakeSafeBet, boolean isStakeSafeApplied, boolean isTurboApplied) {
        detailResponse.getClass();
        gift.getClass();
        betData.getClass();
        topBets.getClass();
        return new BetContainerState(resetWholeContainer, detailResponse, roundId, resetAllData, levelGameDetailsApplyEpoch, gift, betData, betPlaced, betInProgress, cashoutInProgress, keypadType, fbgAvailable, keypadValue, extraKey, topBets, resetChips, keypadVisible, autoBetFlag, cancelBet, isTurboBet, isStakeSafeBet, isStakeSafeApplied, isTurboApplied);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetContainerState)) {
            return false;
        }
        BetContainerState betContainerState = (BetContainerState) other;
        return this.resetWholeContainer == betContainerState.resetWholeContainer && Intrinsics.g(this.detailResponse, betContainerState.detailResponse) && this.roundId == betContainerState.roundId && this.resetAllData == betContainerState.resetAllData && this.levelGameDetailsApplyEpoch == betContainerState.levelGameDetailsApplyEpoch && Intrinsics.g(this.gift, betContainerState.gift) && Intrinsics.g(this.betData, betContainerState.betData) && this.betPlaced == betContainerState.betPlaced && this.betInProgress == betContainerState.betInProgress && this.cashoutInProgress == betContainerState.cashoutInProgress && this.keypadType == betContainerState.keypadType && this.fbgAvailable == betContainerState.fbgAvailable && this.keypadValue == betContainerState.keypadValue && this.extraKey == betContainerState.extraKey && Intrinsics.g(this.topBets, betContainerState.topBets) && this.resetChips == betContainerState.resetChips && this.keypadVisible == betContainerState.keypadVisible && this.autoBetFlag == betContainerState.autoBetFlag && this.cancelBet == betContainerState.cancelBet && this.isTurboBet == betContainerState.isTurboBet && this.isStakeSafeBet == betContainerState.isStakeSafeBet && this.isStakeSafeApplied == betContainerState.isStakeSafeApplied && this.isTurboApplied == betContainerState.isTurboApplied;
    }

    public final boolean getAutoBetFlag() {
        return this.autoBetFlag;
    }

    public final BetData getBetData() {
        return this.betData;
    }

    public final boolean getBetInProgress() {
        return this.betInProgress;
    }

    public final boolean getBetPlaced() {
        return this.betPlaced;
    }

    public final boolean getCancelBet() {
        return this.cancelBet;
    }

    public final boolean getCashoutInProgress() {
        return this.cashoutInProgress;
    }

    public final DetailResponse getDetailResponse() {
        return this.detailResponse;
    }

    public final boolean getExtraKey() {
        return this.extraKey;
    }

    public final boolean getFbgAvailable() {
        return this.fbgAvailable;
    }

    public final GiftItem getGift() {
        return this.gift;
    }

    public final int getKeypadType() {
        return this.keypadType;
    }

    public final int getKeypadValue() {
        return this.keypadValue;
    }

    public final boolean getKeypadVisible() {
        return this.keypadVisible;
    }

    public final int getLevelGameDetailsApplyEpoch() {
        return this.levelGameDetailsApplyEpoch;
    }

    public final boolean getResetAllData() {
        return this.resetAllData;
    }

    public final boolean getResetChips() {
        return this.resetChips;
    }

    public final boolean getResetWholeContainer() {
        return this.resetWholeContainer;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final TopBets getTopBets() {
        return this.topBets;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isTurboApplied) + mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a((this.topBets.hashCode() + mtg0.a(gpp.a(this.keypadValue, mtg0.a(gpp.a(this.keypadType, mtg0.a(mtg0.a(mtg0.a((this.betData.hashCode() + ((this.gift.hashCode() + gpp.a(this.levelGameDetailsApplyEpoch, mtg0.a(f87.a((this.detailResponse.hashCode() + (Boolean.hashCode(this.resetWholeContainer) * 31)) * 31, this.roundId, 31), 31, this.resetAllData), 31)) * 31)) * 31, 31, this.betPlaced), 31, this.betInProgress), 31, this.cashoutInProgress), 31), 31, this.fbgAvailable), 31), 31, this.extraKey)) * 31, 31, this.resetChips), 31, this.keypadVisible), 31, this.autoBetFlag), 31, this.cancelBet), 31, this.isTurboBet), 31, this.isStakeSafeBet), 31, this.isStakeSafeApplied);
    }

    public final boolean isStakeSafeApplied() {
        return this.isStakeSafeApplied;
    }

    public final boolean isStakeSafeBet() {
        return this.isStakeSafeBet;
    }

    public final boolean isTurboApplied() {
        return this.isTurboApplied;
    }

    public final boolean isTurboBet() {
        return this.isTurboBet;
    }

    public final void setBetData(BetData betData) {
        betData.getClass();
        this.betData = betData;
    }

    public String toString() {
        boolean z = this.resetWholeContainer;
        DetailResponse detailResponse = this.detailResponse;
        long j = this.roundId;
        boolean z2 = this.resetAllData;
        int i = this.levelGameDetailsApplyEpoch;
        GiftItem giftItem = this.gift;
        BetData betData = this.betData;
        boolean z3 = this.betPlaced;
        boolean z4 = this.betInProgress;
        boolean z5 = this.cashoutInProgress;
        int i2 = this.keypadType;
        boolean z6 = this.fbgAvailable;
        int i3 = this.keypadValue;
        boolean z7 = this.extraKey;
        TopBets topBets = this.topBets;
        boolean z8 = this.resetChips;
        boolean z9 = this.keypadVisible;
        boolean z10 = this.autoBetFlag;
        boolean z11 = this.cancelBet;
        boolean z12 = this.isTurboBet;
        boolean z13 = this.isStakeSafeBet;
        boolean z14 = this.isStakeSafeApplied;
        boolean z15 = this.isTurboApplied;
        StringBuilder sb = new StringBuilder("BetContainerState(resetWholeContainer=");
        sb.append(z);
        sb.append(", detailResponse=");
        sb.append(detailResponse);
        sb.append(", roundId=");
        sb.append(j);
        sb.append(", resetAllData=");
        sb.append(z2);
        sb.append(", levelGameDetailsApplyEpoch=");
        sb.append(i);
        sb.append(", gift=");
        sb.append(giftItem);
        sb.append(", betData=");
        sb.append(betData);
        sb.append(", betPlaced=");
        sb.append(z3);
        u8.a(", betInProgress=", ", cashoutInProgress=", sb, z4, z5);
        sb.append(", keypadType=");
        sb.append(i2);
        sb.append(", fbgAvailable=");
        sb.append(z6);
        sb.append(", keypadValue=");
        sb.append(i3);
        sb.append(", extraKey=");
        sb.append(z7);
        sb.append(", topBets=");
        sb.append(topBets);
        sb.append(", resetChips=");
        sb.append(z8);
        u8.a(", keypadVisible=", ", autoBetFlag=", sb, z9, z10);
        u8.a(", cancelBet=", ", isTurboBet=", sb, z11, z12);
        u8.a(", isStakeSafeBet=", ", isStakeSafeApplied=", sb, z13, z14);
        return w.a(sb, ", isTurboApplied=", z15, ")");
    }

    public BetContainerState(boolean z, DetailResponse detailResponse, long j, boolean z2, int i, GiftItem giftItem, BetData betData, boolean z3, boolean z4, boolean z5, int i2, boolean z6, int i3, boolean z7, TopBets topBets, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        detailResponse.getClass();
        giftItem.getClass();
        betData.getClass();
        topBets.getClass();
        this.resetWholeContainer = z;
        this.detailResponse = detailResponse;
        this.roundId = j;
        this.resetAllData = z2;
        this.levelGameDetailsApplyEpoch = i;
        this.gift = giftItem;
        this.betData = betData;
        this.betPlaced = z3;
        this.betInProgress = z4;
        this.cashoutInProgress = z5;
        this.keypadType = i2;
        this.fbgAvailable = z6;
        this.keypadValue = i3;
        this.extraKey = z7;
        this.topBets = topBets;
        this.resetChips = z8;
        this.keypadVisible = z9;
        this.autoBetFlag = z10;
        this.cancelBet = z11;
        this.isTurboBet = z12;
        this.isStakeSafeBet = z13;
        this.isStakeSafeApplied = z14;
        this.isTurboApplied = z15;
    }

    public BetContainerState() {
        this(false, null, 0L, false, 0, null, null, false, false, false, 0, false, 0, false, null, false, false, false, false, false, false, false, false, 8388607, null);
    }
}

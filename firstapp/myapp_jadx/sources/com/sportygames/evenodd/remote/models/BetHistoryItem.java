package com.sportygames.evenodd.remote.models;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.models.BetHistoryBase;
import defpackage.f87;
import defpackage.fwv;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.hib0;
import defpackage.hxa;
import defpackage.nrg0;
import defpackage.qn4;
import defpackage.x9d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0014HÆ\u0003J\u009f\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u0010;\u001a\u00020\u00142\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010(\"\u0004\b)\u0010*¨\u0006A"}, d2 = {"Lcom/sportygames/evenodd/remote/models/BetHistoryItem;", "Lcom/sportygames/commons/models/BetHistoryBase;", "userId", "", "actualDebitedAmount", "", "actualCreditedAmount", "userPick", "houseDraw", "houseDrawSum", "houseDrawDecision", "decision", "giftAmount", AnalyticsParam.EVENT_PARAM_ID, "", "payoutAmount", "createdAt", "stakeAmount", "ticketId", "isExpanded", "", "<init>", "(Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DJDLjava/lang/String;DLjava/lang/String;Z)V", "getUserId", "()Ljava/lang/String;", "getActualDebitedAmount", "()D", "getActualCreditedAmount", "getUserPick", "getHouseDraw", "getHouseDrawSum", "getHouseDrawDecision", "getDecision", "getGiftAmount", "getId", "()J", "getPayoutAmount", "getCreatedAt", "getStakeAmount", "getTicketId", "()Z", "setExpanded", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetHistoryItem implements BetHistoryBase {
    public static final int $stable = 8;
    private final double actualCreditedAmount;
    private final double actualDebitedAmount;
    private final String createdAt;
    private final String decision;
    private final double giftAmount;
    private final String houseDraw;
    private final String houseDrawDecision;
    private final String houseDrawSum;
    private final long id;
    private boolean isExpanded;
    private final double payoutAmount;
    private final double stakeAmount;
    private final String ticketId;
    private final String userId;
    private final String userPick;

    public BetHistoryItem(String str, double d, double d2, String str2, String str3, String str4, String str5, String str6, double d3, long j, double d4, String str7, double d5, String str8, boolean z) {
        qn4.b(str, str2, str3, str4, str5);
        m.a(str6, str7, str8);
        this.userId = str;
        this.actualDebitedAmount = d;
        this.actualCreditedAmount = d2;
        this.userPick = str2;
        this.houseDraw = str3;
        this.houseDrawSum = str4;
        this.houseDrawDecision = str5;
        this.decision = str6;
        this.giftAmount = d3;
        this.id = j;
        this.payoutAmount = d4;
        this.createdAt = str7;
        this.stakeAmount = d5;
        this.ticketId = str8;
        this.isExpanded = z;
    }

    public static /* synthetic */ BetHistoryItem copy$default(BetHistoryItem betHistoryItem, String str, double d, double d2, String str2, String str3, String str4, String str5, String str6, double d3, long j, double d4, String str7, double d5, String str8, boolean z, int i, Object obj) {
        String str9 = (i & 1) != 0 ? betHistoryItem.userId : str;
        double d6 = (i & 2) != 0 ? betHistoryItem.actualDebitedAmount : d;
        return betHistoryItem.copy(str9, d6, (i & 4) != 0 ? betHistoryItem.actualCreditedAmount : d2, (i & 8) != 0 ? betHistoryItem.userPick : str2, (i & 16) != 0 ? betHistoryItem.houseDraw : str3, (i & 32) != 0 ? betHistoryItem.houseDrawSum : str4, (i & 64) != 0 ? betHistoryItem.houseDrawDecision : str5, (i & 128) != 0 ? betHistoryItem.decision : str6, (i & 256) != 0 ? betHistoryItem.giftAmount : d3, (i & 512) != 0 ? betHistoryItem.id : j, (i & 1024) != 0 ? betHistoryItem.payoutAmount : d4, (i & 2048) != 0 ? betHistoryItem.createdAt : str7, (i & 4096) != 0 ? betHistoryItem.stakeAmount : d5, (i & 8192) != 0 ? betHistoryItem.ticketId : str8, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? betHistoryItem.isExpanded : z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getActualDebitedAmount() {
        return this.actualDebitedAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getActualCreditedAmount() {
        return this.actualCreditedAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserPick() {
        return this.userPick;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHouseDraw() {
        return this.houseDraw;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHouseDrawSum() {
        return this.houseDrawSum;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHouseDrawDecision() {
        return this.houseDrawDecision;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDecision() {
        return this.decision;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getGiftAmount() {
        return this.giftAmount;
    }

    public final BetHistoryItem copy(String userId, double actualDebitedAmount, double actualCreditedAmount, String userPick, String houseDraw, String houseDrawSum, String houseDrawDecision, String decision, double giftAmount, long id, double payoutAmount, String createdAt, double stakeAmount, String ticketId, boolean isExpanded) {
        qn4.b(userId, userPick, houseDraw, houseDrawSum, houseDrawDecision);
        decision.getClass();
        createdAt.getClass();
        ticketId.getClass();
        return new BetHistoryItem(userId, actualDebitedAmount, actualCreditedAmount, userPick, houseDraw, houseDrawSum, houseDrawDecision, decision, giftAmount, id, payoutAmount, createdAt, stakeAmount, ticketId, isExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetHistoryItem)) {
            return false;
        }
        BetHistoryItem betHistoryItem = (BetHistoryItem) other;
        return Intrinsics.g(this.userId, betHistoryItem.userId) && Double.compare(this.actualDebitedAmount, betHistoryItem.actualDebitedAmount) == 0 && Double.compare(this.actualCreditedAmount, betHistoryItem.actualCreditedAmount) == 0 && Intrinsics.g(this.userPick, betHistoryItem.userPick) && Intrinsics.g(this.houseDraw, betHistoryItem.houseDraw) && Intrinsics.g(this.houseDrawSum, betHistoryItem.houseDrawSum) && Intrinsics.g(this.houseDrawDecision, betHistoryItem.houseDrawDecision) && Intrinsics.g(this.decision, betHistoryItem.decision) && Double.compare(this.giftAmount, betHistoryItem.giftAmount) == 0 && this.id == betHistoryItem.id && Double.compare(this.payoutAmount, betHistoryItem.payoutAmount) == 0 && Intrinsics.g(this.createdAt, betHistoryItem.createdAt) && Double.compare(this.stakeAmount, betHistoryItem.stakeAmount) == 0 && Intrinsics.g(this.ticketId, betHistoryItem.ticketId) && this.isExpanded == betHistoryItem.isExpanded;
    }

    public final double getActualCreditedAmount() {
        return this.actualCreditedAmount;
    }

    public final double getActualDebitedAmount() {
        return this.actualDebitedAmount;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDecision() {
        return this.decision;
    }

    public final double getGiftAmount() {
        return this.giftAmount;
    }

    public final String getHouseDraw() {
        return this.houseDraw;
    }

    public final String getHouseDrawDecision() {
        return this.houseDrawDecision;
    }

    public final String getHouseDrawSum() {
        return this.houseDrawSum;
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public long getId() {
        return this.id;
    }

    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserPick() {
        return this.userPick;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isExpanded) + gmf0.a(nrg0.a(gmf0.a(nrg0.a(f87.a(nrg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(nrg0.a(nrg0.a(this.userId.hashCode() * 31, 31, this.actualDebitedAmount), 31, this.actualCreditedAmount), 31, this.userPick), 31, this.houseDraw), 31, this.houseDrawSum), 31, this.houseDrawDecision), 31, this.decision), 31, this.giftAmount), this.id, 31), 31, this.payoutAmount), 31, this.createdAt), 31, this.stakeAmount), 31, this.ticketId);
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
        String str = this.userId;
        double d = this.actualDebitedAmount;
        double d2 = this.actualCreditedAmount;
        String str2 = this.userPick;
        String str3 = this.houseDraw;
        String str4 = this.houseDrawSum;
        String str5 = this.houseDrawDecision;
        String str6 = this.decision;
        double d3 = this.giftAmount;
        long j = this.id;
        double d4 = this.payoutAmount;
        String str7 = this.createdAt;
        double d5 = this.stakeAmount;
        String str8 = this.ticketId;
        boolean z = this.isExpanded;
        StringBuilder sb = new StringBuilder("BetHistoryItem(userId=");
        sb.append(str);
        sb.append(", actualDebitedAmount=");
        sb.append(d);
        hib0.b(d2, ", actualCreditedAmount=", ", userPick=", sb);
        hxa.c(sb, str2, ", houseDraw=", str3, ", houseDrawSum=");
        hxa.c(sb, str4, ", houseDrawDecision=", str5, ", decision=");
        sb.append(str6);
        sb.append(", giftAmount=");
        sb.append(d3);
        g41.a(j, ", id=", ", payoutAmount=", sb);
        fwv.a(d4, ", createdAt=", str7, sb);
        hib0.b(d5, ", stakeAmount=", ", ticketId=", sb);
        return x9d.a(str8, ", isExpanded=", ")", sb, z);
    }
}

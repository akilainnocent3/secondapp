package com.sporty.android.core.model.loyalty;

import com.appsflyer.internal.l;
import com.appsflyer.internal.x;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f78;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.qn4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 92\u00020\u0001:\u00019Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0083\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0014\u00105\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00107\u001a\u00020\rHÖ\u0081\u0004J\n\u00108\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R%\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(%¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'Ê\u0001\u0002\b;¨\u0006:"}, d2 = {"Lcom/sporty/android/core/model/loyalty/LoyaltyActivityData;", "", "batchId", "", "claimedAmount", "", "claimedTime", "currency", "endTime", "lastClaimedTime", "potentialReward", "startTime", AnalyticsParam.EVENT_STATUS, "", "userId", "isDailyReward", "", "dailyRecordContent", "Lcom/sporty/android/core/model/loyalty/DailyRecordContent;", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JJILjava/lang/String;ZLcom/sporty/android/core/model/loyalty/DailyRecordContent;)V", "getBatchId", "()Ljava/lang/String;", "getClaimedAmount", "()J", "getClaimedTime", "getCurrency", "getEndTime", "getLastClaimedTime", "getPotentialReward", "getStartTime", "getStatus", "()I", "getUserId", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "isDaily", "getDailyRecordContent", "()Lcom/sporty/android/core/model/loyalty/DailyRecordContent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "Companion", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LoyaltyActivityData {
    public static final int DAILY_CLAIMED = 4;
    public static final int DAILY_CLAIM_DISPLAY = 5;
    public static final int STATUS_ACTIVE = 1;
    public static final int STATUS_CLAIMABLE = 3;
    public static final int WAIT_SETTLE = 2;
    private final String batchId;
    private final long claimedAmount;
    private final String claimedTime;
    private final String currency;
    private final DailyRecordContent dailyRecordContent;
    private final long endTime;

    @SerializedName("isDaily")
    private final boolean isDailyReward;
    private final String lastClaimedTime;
    private final long potentialReward;
    private final long startTime;
    private final int status;
    private final String userId;

    public LoyaltyActivityData(String str, long j, String str2, String str3, long j2, String str4, long j3, long j4, int i, String str5, boolean z, DailyRecordContent dailyRecordContent) {
        qn4.b(str, str2, str3, str4, str5);
        this.batchId = str;
        this.claimedAmount = j;
        this.claimedTime = str2;
        this.currency = str3;
        this.endTime = j2;
        this.lastClaimedTime = str4;
        this.potentialReward = j3;
        this.startTime = j4;
        this.status = i;
        this.userId = str5;
        this.isDailyReward = z;
        this.dailyRecordContent = dailyRecordContent;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBatchId() {
        return this.batchId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsDailyReward() {
        return this.isDailyReward;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final DailyRecordContent getDailyRecordContent() {
        return this.dailyRecordContent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getClaimedAmount() {
        return this.claimedAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClaimedTime() {
        return this.claimedTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLastClaimedTime() {
        return this.lastClaimedTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getPotentialReward() {
        return this.potentialReward;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final LoyaltyActivityData copy(String batchId, long claimedAmount, String claimedTime, String currency, long endTime, String lastClaimedTime, long potentialReward, long startTime, int status, String userId, boolean isDailyReward, DailyRecordContent dailyRecordContent) {
        batchId.getClass();
        claimedTime.getClass();
        currency.getClass();
        lastClaimedTime.getClass();
        userId.getClass();
        return new LoyaltyActivityData(batchId, claimedAmount, claimedTime, currency, endTime, lastClaimedTime, potentialReward, startTime, status, userId, isDailyReward, dailyRecordContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoyaltyActivityData)) {
            return false;
        }
        LoyaltyActivityData loyaltyActivityData = (LoyaltyActivityData) other;
        return Intrinsics.g(this.batchId, loyaltyActivityData.batchId) && this.claimedAmount == loyaltyActivityData.claimedAmount && Intrinsics.g(this.claimedTime, loyaltyActivityData.claimedTime) && Intrinsics.g(this.currency, loyaltyActivityData.currency) && this.endTime == loyaltyActivityData.endTime && Intrinsics.g(this.lastClaimedTime, loyaltyActivityData.lastClaimedTime) && this.potentialReward == loyaltyActivityData.potentialReward && this.startTime == loyaltyActivityData.startTime && this.status == loyaltyActivityData.status && Intrinsics.g(this.userId, loyaltyActivityData.userId) && this.isDailyReward == loyaltyActivityData.isDailyReward && Intrinsics.g(this.dailyRecordContent, loyaltyActivityData.dailyRecordContent);
    }

    public final String getBatchId() {
        return this.batchId;
    }

    public final long getClaimedAmount() {
        return this.claimedAmount;
    }

    public final String getClaimedTime() {
        return this.claimedTime;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final DailyRecordContent getDailyRecordContent() {
        return this.dailyRecordContent;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getLastClaimedTime() {
        return this.lastClaimedTime;
    }

    public final long getPotentialReward() {
        return this.potentialReward;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = mtg0.a(gmf0.a(gpp.a(this.status, f87.a(f87.a(gmf0.a(f87.a(gmf0.a(gmf0.a(f87.a(this.batchId.hashCode() * 31, this.claimedAmount, 31), 31, this.claimedTime), 31, this.currency), this.endTime, 31), 31, this.lastClaimedTime), this.potentialReward, 31), this.startTime, 31), 31), 31, this.userId), 31, this.isDailyReward);
        DailyRecordContent dailyRecordContent = this.dailyRecordContent;
        return iA + (dailyRecordContent == null ? 0 : dailyRecordContent.hashCode());
    }

    public final boolean isDailyReward() {
        return this.isDailyReward;
    }

    public String toString() {
        String str = this.batchId;
        long j = this.claimedAmount;
        String str2 = this.claimedTime;
        String str3 = this.currency;
        long j2 = this.endTime;
        String str4 = this.lastClaimedTime;
        long j3 = this.potentialReward;
        long j4 = this.startTime;
        int i = this.status;
        String str5 = this.userId;
        boolean z = this.isDailyReward;
        DailyRecordContent dailyRecordContent = this.dailyRecordContent;
        StringBuilder sbA = x.a(j, "LoyaltyActivityData(batchId=", str, ", claimedAmount=");
        hxa.c(sbA, ", claimedTime=", str2, ", currency=", str3);
        g41.a(j2, ", endTime=", ", lastClaimedTime=", sbA);
        l.a(j3, str4, ", potentialReward=", sbA);
        g41.a(j4, ", startTime=", ", status=", sbA);
        f78.b(i, ", userId=", str5, ", isDailyReward=", sbA);
        sbA.append(z);
        sbA.append(", dailyRecordContent=");
        sbA.append(dailyRecordContent);
        sbA.append(")");
        return sbA.toString();
    }
}

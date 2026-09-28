package com.sportybet.android.social.data.remote.entity;

import com.appsflyer.internal.x;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.to10;
import defpackage.u4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jx\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0014\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u00020\fHÖ\u0081\u0004J\n\u00100\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012Ê\u0001\u0002\b2Ê\u0001\f\b3\u0012\b\b4\u0012\u0004\b\u0003\u0010\u0002¨\u00061"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/CreatorCredit;", "", "batchId", "", "claimedAmount", "", "currency", "endTime", "lastClaimedTime", "potentialReward", "startTime", AnalyticsParam.EVENT_STATUS, "", "userId", "aliasCode", "<init>", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/Long;JJILjava/lang/String;Ljava/lang/String;)V", "getBatchId", "()Ljava/lang/String;", "getClaimedAmount", "()J", "getCurrency", "getEndTime", "getLastClaimedTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPotentialReward", "getStartTime", "getStatus", "()I", "getUserId", "getAliasCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/Long;JJILjava/lang/String;Ljava/lang/String;)Lcom/sportybet/android/social/data/remote/entity/CreatorCredit;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CreatorCredit {
    public static final int $stable = 0;
    private final String aliasCode;
    private final String batchId;
    private final long claimedAmount;
    private final String currency;
    private final long endTime;
    private final Long lastClaimedTime;
    private final long potentialReward;
    private final long startTime;
    private final int status;
    private final String userId;

    public CreatorCredit(String str, long j, String str2, long j2, Long l, long j3, long j4, int i, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.batchId = str;
        this.claimedAmount = j;
        this.currency = str2;
        this.endTime = j2;
        this.lastClaimedTime = l;
        this.potentialReward = j3;
        this.startTime = j4;
        this.status = i;
        this.userId = str3;
        this.aliasCode = str4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBatchId() {
        return this.batchId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAliasCode() {
        return this.aliasCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getClaimedAmount() {
        return this.claimedAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getLastClaimedTime() {
        return this.lastClaimedTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getPotentialReward() {
        return this.potentialReward;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final CreatorCredit copy(String batchId, long claimedAmount, String currency, long endTime, Long lastClaimedTime, long potentialReward, long startTime, int status, String userId, String aliasCode) {
        batchId.getClass();
        currency.getClass();
        return new CreatorCredit(batchId, claimedAmount, currency, endTime, lastClaimedTime, potentialReward, startTime, status, userId, aliasCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatorCredit)) {
            return false;
        }
        CreatorCredit creatorCredit = (CreatorCredit) other;
        return Intrinsics.g(this.batchId, creatorCredit.batchId) && this.claimedAmount == creatorCredit.claimedAmount && Intrinsics.g(this.currency, creatorCredit.currency) && this.endTime == creatorCredit.endTime && Intrinsics.g(this.lastClaimedTime, creatorCredit.lastClaimedTime) && this.potentialReward == creatorCredit.potentialReward && this.startTime == creatorCredit.startTime && this.status == creatorCredit.status && Intrinsics.g(this.userId, creatorCredit.userId) && Intrinsics.g(this.aliasCode, creatorCredit.aliasCode);
    }

    public final String getAliasCode() {
        return this.aliasCode;
    }

    public final String getBatchId() {
        return this.batchId;
    }

    public final long getClaimedAmount() {
        return this.claimedAmount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final Long getLastClaimedTime() {
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
        int iA = f87.a(gmf0.a(f87.a(this.batchId.hashCode() * 31, this.claimedAmount, 31), 31, this.currency), this.endTime, 31);
        Long l = this.lastClaimedTime;
        int iA2 = gpp.a(this.status, f87.a(f87.a((iA + (l == null ? 0 : l.hashCode())) * 31, this.potentialReward, 31), this.startTime, 31), 31);
        String str = this.userId;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.aliasCode;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.batchId;
        long j = this.claimedAmount;
        String str2 = this.currency;
        long j2 = this.endTime;
        Long l = this.lastClaimedTime;
        long j3 = this.potentialReward;
        long j4 = this.startTime;
        int i = this.status;
        String str3 = this.userId;
        String str4 = this.aliasCode;
        StringBuilder sbA = x.a(j, "CreatorCredit(batchId=", str, ", claimedAmount=");
        u4.a(sbA, ", currency=", str2, ", endTime=");
        sbA.append(j2);
        sbA.append(", lastClaimedTime=");
        sbA.append(l);
        g41.a(j3, ", potentialReward=", ", startTime=", sbA);
        to10.a(sbA, j4, ", status=", i);
        hxa.c(sbA, ", userId=", str3, ", aliasCode=", str4);
        sbA.append(")");
        return sbA.toString();
    }
}

package com.sportybet.android.social.data.local;

import com.appsflyer.internal.m;
import com.appsflyer.internal.x;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f78;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.u4;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003Jm\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001J\u0014\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00106\u001a\u00020\fHÖ\u0081\u0004J\n\u00107\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R%\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R%\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R%\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R%\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(!¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R%\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R%\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(%¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0012R%\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b('¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#Ê\u0001\u0002\b9Ê\u0001 \b:\u0012\u0012\b;\u0012\u000e\b\fJ\u0004\b\b(\u0015J\u0004\b\b(%\u0012\b\b<\u0012\u0004\b\b(=Ê\u0001\f\b>\u0012\b\b?\u0012\u0004\b\u0003\u0010\u0002¨\u00068"}, d2 = {"Lcom/sportybet/android/social/data/local/CreatorCreditEntity;", "", "batchId", "", "claimedAmount", "", "currency", "endTime", "lastClaimedTime", "potentialReward", "startTime", AnalyticsParam.EVENT_STATUS, "", "userId", "sourceIndex", "<init>", "(Ljava/lang/String;JLjava/lang/String;JJJJILjava/lang/String;I)V", "getBatchId", "()Ljava/lang/String;", "Landroidx/room/ColumnInfo;", "name", "batch_id", "getClaimedAmount", "()J", "claimed_amount", "getCurrency", "getEndTime", "end_time", "getLastClaimedTime", "last_claimed_time", "getPotentialReward", "potential_reward", "getStartTime", "start_time", "getStatus", "()I", "getUserId", AnalyticsParam.EVENT_PARAM_USER_ID, "getSourceIndex", "source_index", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/room/Entity;", "primaryKeys", "tableName", "creator_credit_table", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CreatorCreditEntity {
    public static final int $stable = 0;
    private final String batchId;
    private final long claimedAmount;
    private final String currency;
    private final long endTime;
    private final long lastClaimedTime;
    private final long potentialReward;
    private final int sourceIndex;
    private final long startTime;
    private final int status;
    private final String userId;

    public CreatorCreditEntity(String str, long j, String str2, long j2, long j3, long j4, long j5, int i, String str3, int i2) {
        m.a(str, str2, str3);
        this.batchId = str;
        this.claimedAmount = j;
        this.currency = str2;
        this.endTime = j2;
        this.lastClaimedTime = j3;
        this.potentialReward = j4;
        this.startTime = j5;
        this.status = i;
        this.userId = str3;
        this.sourceIndex = i2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBatchId() {
        return this.batchId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getSourceIndex() {
        return this.sourceIndex;
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
    public final long getLastClaimedTime() {
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

    public final CreatorCreditEntity copy(String batchId, long claimedAmount, String currency, long endTime, long lastClaimedTime, long potentialReward, long startTime, int status, String userId, int sourceIndex) {
        batchId.getClass();
        currency.getClass();
        userId.getClass();
        return new CreatorCreditEntity(batchId, claimedAmount, currency, endTime, lastClaimedTime, potentialReward, startTime, status, userId, sourceIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatorCreditEntity)) {
            return false;
        }
        CreatorCreditEntity creatorCreditEntity = (CreatorCreditEntity) other;
        return Intrinsics.g(this.batchId, creatorCreditEntity.batchId) && this.claimedAmount == creatorCreditEntity.claimedAmount && Intrinsics.g(this.currency, creatorCreditEntity.currency) && this.endTime == creatorCreditEntity.endTime && this.lastClaimedTime == creatorCreditEntity.lastClaimedTime && this.potentialReward == creatorCreditEntity.potentialReward && this.startTime == creatorCreditEntity.startTime && this.status == creatorCreditEntity.status && Intrinsics.g(this.userId, creatorCreditEntity.userId) && this.sourceIndex == creatorCreditEntity.sourceIndex;
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

    public final long getLastClaimedTime() {
        return this.lastClaimedTime;
    }

    public final long getPotentialReward() {
        return this.potentialReward;
    }

    public final int getSourceIndex() {
        return this.sourceIndex;
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
        return Integer.hashCode(this.sourceIndex) + gmf0.a(gpp.a(this.status, f87.a(f87.a(f87.a(f87.a(gmf0.a(f87.a(this.batchId.hashCode() * 31, this.claimedAmount, 31), 31, this.currency), this.endTime, 31), this.lastClaimedTime, 31), this.potentialReward, 31), this.startTime, 31), 31), 31, this.userId);
    }

    public String toString() {
        String str = this.batchId;
        long j = this.claimedAmount;
        String str2 = this.currency;
        long j2 = this.endTime;
        long j3 = this.lastClaimedTime;
        long j4 = this.potentialReward;
        long j5 = this.startTime;
        int i = this.status;
        String str3 = this.userId;
        int i2 = this.sourceIndex;
        StringBuilder sbA = x.a(j, "CreatorCreditEntity(batchId=", str, ", claimedAmount=");
        u4.a(sbA, ", currency=", str2, ", endTime=");
        sbA.append(j2);
        g41.a(j3, ", lastClaimedTime=", ", potentialReward=", sbA);
        sbA.append(j4);
        g41.a(j5, ", startTime=", ", status=", sbA);
        f78.b(i, ", userId=", str3, ", sourceIndex=", sbA);
        return zk1.a(i2, ")", sbA);
    }
}

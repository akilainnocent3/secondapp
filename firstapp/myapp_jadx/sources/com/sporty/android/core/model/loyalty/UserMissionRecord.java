package com.sporty.android.core.model.loyalty;

import com.appsflyer.internal.b0;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.g41;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00104\u001a\u00020\u000fHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u00107\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010'J\u0096\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010:J\u0014\u0010;\u001a\u00020\u00132\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010=\u001a\u00020>HÖ\u0081\u0004J\n\u0010?\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010(\u001a\u0004\b,\u0010'¨\u0006@"}, d2 = {"Lcom/sporty/android/core/model/loyalty/UserMissionRecord;", "", AnalyticsParam.EVENT_PARAM_ID, "", "userId", "", "missionId", "recordType", "Lcom/sporty/android/core/model/loyalty/UserMissionRecordType;", "taskCode", "taskType", "Lcom/sporty/android/core/model/loyalty/LoyaltyMissionTaskType;", AnalyticsParam.EVENT_STATUS, "Lcom/sporty/android/core/model/loyalty/MissionStatus;", "accumulatedAmount", "", "expireTime", "updateTime", "cancelable", "", "cancelAvailableTime", "<init>", "(JLjava/lang/String;JLcom/sporty/android/core/model/loyalty/UserMissionRecordType;Ljava/lang/String;Lcom/sporty/android/core/model/loyalty/LoyaltyMissionTaskType;Lcom/sporty/android/core/model/loyalty/MissionStatus;DJLjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;)V", "getId", "()J", "getUserId", "()Ljava/lang/String;", "getMissionId", "getRecordType", "()Lcom/sporty/android/core/model/loyalty/UserMissionRecordType;", "getTaskCode", "getTaskType", "()Lcom/sporty/android/core/model/loyalty/LoyaltyMissionTaskType;", "getStatus", "()Lcom/sporty/android/core/model/loyalty/MissionStatus;", "getAccumulatedAmount", "()D", "getExpireTime", "getUpdateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCancelable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCancelAvailableTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(JLjava/lang/String;JLcom/sporty/android/core/model/loyalty/UserMissionRecordType;Ljava/lang/String;Lcom/sporty/android/core/model/loyalty/LoyaltyMissionTaskType;Lcom/sporty/android/core/model/loyalty/MissionStatus;DJLjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/sporty/android/core/model/loyalty/UserMissionRecord;", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UserMissionRecord {
    private final double accumulatedAmount;
    private final Long cancelAvailableTime;
    private final Boolean cancelable;
    private final long expireTime;
    private final long id;
    private final long missionId;
    private final UserMissionRecordType recordType;
    private final MissionStatus status;
    private final String taskCode;
    private final LoyaltyMissionTaskType taskType;
    private final Long updateTime;
    private final String userId;

    public /* synthetic */ UserMissionRecord(long j, String str, long j2, UserMissionRecordType userMissionRecordType, String str2, LoyaltyMissionTaskType loyaltyMissionTaskType, MissionStatus missionStatus, double d, long j3, Long l, Boolean bool, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, j2, userMissionRecordType, str2, loyaltyMissionTaskType, missionStatus, (i & 128) != 0 ? 0.0d : d, j3, l, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : l2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getCancelable() {
        return this.cancelable;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getCancelAvailableTime() {
        return this.cancelAvailableTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getMissionId() {
        return this.missionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UserMissionRecordType getRecordType() {
        return this.recordType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTaskCode() {
        return this.taskCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LoyaltyMissionTaskType getTaskType() {
        return this.taskType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MissionStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getAccumulatedAmount() {
        return this.accumulatedAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getExpireTime() {
        return this.expireTime;
    }

    public final UserMissionRecord copy(long id, String userId, long missionId, UserMissionRecordType recordType, String taskCode, LoyaltyMissionTaskType taskType, MissionStatus status, double accumulatedAmount, long expireTime, Long updateTime, Boolean cancelable, Long cancelAvailableTime) {
        return new UserMissionRecord(id, userId, missionId, recordType, taskCode, taskType, status, accumulatedAmount, expireTime, updateTime, cancelable, cancelAvailableTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMissionRecord)) {
            return false;
        }
        UserMissionRecord userMissionRecord = (UserMissionRecord) other;
        return this.id == userMissionRecord.id && Intrinsics.g(this.userId, userMissionRecord.userId) && this.missionId == userMissionRecord.missionId && this.recordType == userMissionRecord.recordType && Intrinsics.g(this.taskCode, userMissionRecord.taskCode) && this.taskType == userMissionRecord.taskType && this.status == userMissionRecord.status && Double.compare(this.accumulatedAmount, userMissionRecord.accumulatedAmount) == 0 && this.expireTime == userMissionRecord.expireTime && Intrinsics.g(this.updateTime, userMissionRecord.updateTime) && Intrinsics.g(this.cancelable, userMissionRecord.cancelable) && Intrinsics.g(this.cancelAvailableTime, userMissionRecord.cancelAvailableTime);
    }

    public final double getAccumulatedAmount() {
        return this.accumulatedAmount;
    }

    public final Long getCancelAvailableTime() {
        return this.cancelAvailableTime;
    }

    public final Boolean getCancelable() {
        return this.cancelable;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final long getId() {
        return this.id;
    }

    public final long getMissionId() {
        return this.missionId;
    }

    public final UserMissionRecordType getRecordType() {
        return this.recordType;
    }

    public final MissionStatus getStatus() {
        return this.status;
    }

    public final String getTaskCode() {
        return this.taskCode;
    }

    public final LoyaltyMissionTaskType getTaskType() {
        return this.taskType;
    }

    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.userId;
        int iA = f87.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.missionId, 31);
        UserMissionRecordType userMissionRecordType = this.recordType;
        int iHashCode2 = (iA + (userMissionRecordType == null ? 0 : userMissionRecordType.hashCode())) * 31;
        String str2 = this.taskCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LoyaltyMissionTaskType loyaltyMissionTaskType = this.taskType;
        int iHashCode4 = (iHashCode3 + (loyaltyMissionTaskType == null ? 0 : loyaltyMissionTaskType.hashCode())) * 31;
        MissionStatus missionStatus = this.status;
        int iA2 = f87.a(nrg0.a((iHashCode4 + (missionStatus == null ? 0 : missionStatus.hashCode())) * 31, 31, this.accumulatedAmount), this.expireTime, 31);
        Long l = this.updateTime;
        int iHashCode5 = (iA2 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.cancelable;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.cancelAvailableTime;
        return iHashCode6 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        long j = this.id;
        String str = this.userId;
        long j2 = this.missionId;
        UserMissionRecordType userMissionRecordType = this.recordType;
        String str2 = this.taskCode;
        LoyaltyMissionTaskType loyaltyMissionTaskType = this.taskType;
        MissionStatus missionStatus = this.status;
        double d = this.accumulatedAmount;
        long j3 = this.expireTime;
        Long l = this.updateTime;
        Boolean bool = this.cancelable;
        Long l2 = this.cancelAvailableTime;
        StringBuilder sbA = b0.a(j, "UserMissionRecord(id=", ", userId=", str);
        g41.a(j2, ", missionId=", ", recordType=", sbA);
        sbA.append(userMissionRecordType);
        sbA.append(", taskCode=");
        sbA.append(str2);
        sbA.append(", taskType=");
        sbA.append(loyaltyMissionTaskType);
        sbA.append(", status=");
        sbA.append(missionStatus);
        sbA.append(", accumulatedAmount=");
        sbA.append(d);
        g41.a(j3, ", expireTime=", ", updateTime=", sbA);
        sbA.append(l);
        sbA.append(", cancelable=");
        sbA.append(bool);
        sbA.append(", cancelAvailableTime=");
        sbA.append(l2);
        sbA.append(")");
        return sbA.toString();
    }

    public UserMissionRecord(long j, String str, long j2, UserMissionRecordType userMissionRecordType, String str2, LoyaltyMissionTaskType loyaltyMissionTaskType, MissionStatus missionStatus, double d, long j3, Long l, Boolean bool, Long l2) {
        this.id = j;
        this.userId = str;
        this.missionId = j2;
        this.recordType = userMissionRecordType;
        this.taskCode = str2;
        this.taskType = loyaltyMissionTaskType;
        this.status = missionStatus;
        this.accumulatedAmount = d;
        this.expireTime = j3;
        this.updateTime = l;
        this.cancelable = bool;
        this.cancelAvailableTime = l2;
    }
}

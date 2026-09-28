package com.sporty.android.core.model.loyalty;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.nrg0;
import defpackage.uqe0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jb\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010+J\u0014\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00100\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, d2 = {"Lcom/sporty/android/core/model/loyalty/MissionProgressDto;", "", AnalyticsParam.EVENT_PARAM_ID, "", "userId", "", "missionId", AnalyticsParam.EVENT_STATUS, "Lcom/sporty/android/core/model/loyalty/MissionStatus;", "accumulatedAmount", "", "expireTime", "", "updateTime", "worldCupPassInfo", "Lcom/sporty/android/core/model/loyalty/WorldCupPassInfoDto;", "<init>", "(ILjava/lang/String;ILcom/sporty/android/core/model/loyalty/MissionStatus;DJLjava/lang/Long;Lcom/sporty/android/core/model/loyalty/WorldCupPassInfoDto;)V", "getId", "()I", "getUserId", "()Ljava/lang/String;", "getMissionId", "getStatus", "()Lcom/sporty/android/core/model/loyalty/MissionStatus;", "getAccumulatedAmount", "()D", "getExpireTime", "()J", "getUpdateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getWorldCupPassInfo", "()Lcom/sporty/android/core/model/loyalty/WorldCupPassInfoDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/String;ILcom/sporty/android/core/model/loyalty/MissionStatus;DJLjava/lang/Long;Lcom/sporty/android/core/model/loyalty/WorldCupPassInfoDto;)Lcom/sporty/android/core/model/loyalty/MissionProgressDto;", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MissionProgressDto {
    private final double accumulatedAmount;
    private final long expireTime;
    private final int id;
    private final int missionId;
    private final MissionStatus status;
    private final Long updateTime;
    private final String userId;
    private final WorldCupPassInfoDto worldCupPassInfo;

    public MissionProgressDto(int i, String str, int i2, MissionStatus missionStatus, double d, long j, Long l, WorldCupPassInfoDto worldCupPassInfoDto) {
        str.getClass();
        missionStatus.getClass();
        this.id = i;
        this.userId = str;
        this.missionId = i2;
        this.status = missionStatus;
        this.accumulatedAmount = d;
        this.expireTime = j;
        this.updateTime = l;
        this.worldCupPassInfo = worldCupPassInfoDto;
    }

    public static /* synthetic */ MissionProgressDto copy$default(MissionProgressDto missionProgressDto, int i, String str, int i2, MissionStatus missionStatus, double d, long j, Long l, WorldCupPassInfoDto worldCupPassInfoDto, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = missionProgressDto.id;
        }
        if ((i3 & 2) != 0) {
            str = missionProgressDto.userId;
        }
        if ((i3 & 4) != 0) {
            i2 = missionProgressDto.missionId;
        }
        if ((i3 & 8) != 0) {
            missionStatus = missionProgressDto.status;
        }
        if ((i3 & 16) != 0) {
            d = missionProgressDto.accumulatedAmount;
        }
        if ((i3 & 32) != 0) {
            j = missionProgressDto.expireTime;
        }
        if ((i3 & 64) != 0) {
            l = missionProgressDto.updateTime;
        }
        if ((i3 & 128) != 0) {
            worldCupPassInfoDto = missionProgressDto.worldCupPassInfo;
        }
        long j2 = j;
        double d2 = d;
        int i4 = i2;
        MissionStatus missionStatus2 = missionStatus;
        return missionProgressDto.copy(i, str, i4, missionStatus2, d2, j2, l, worldCupPassInfoDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMissionId() {
        return this.missionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MissionStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getAccumulatedAmount() {
        return this.accumulatedAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getExpireTime() {
        return this.expireTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final WorldCupPassInfoDto getWorldCupPassInfo() {
        return this.worldCupPassInfo;
    }

    public final MissionProgressDto copy(int id, String userId, int missionId, MissionStatus status, double accumulatedAmount, long expireTime, Long updateTime, WorldCupPassInfoDto worldCupPassInfo) {
        userId.getClass();
        status.getClass();
        return new MissionProgressDto(id, userId, missionId, status, accumulatedAmount, expireTime, updateTime, worldCupPassInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionProgressDto)) {
            return false;
        }
        MissionProgressDto missionProgressDto = (MissionProgressDto) other;
        return this.id == missionProgressDto.id && Intrinsics.g(this.userId, missionProgressDto.userId) && this.missionId == missionProgressDto.missionId && this.status == missionProgressDto.status && Double.compare(this.accumulatedAmount, missionProgressDto.accumulatedAmount) == 0 && this.expireTime == missionProgressDto.expireTime && Intrinsics.g(this.updateTime, missionProgressDto.updateTime) && Intrinsics.g(this.worldCupPassInfo, missionProgressDto.worldCupPassInfo);
    }

    public final double getAccumulatedAmount() {
        return this.accumulatedAmount;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final int getId() {
        return this.id;
    }

    public final int getMissionId() {
        return this.missionId;
    }

    public final MissionStatus getStatus() {
        return this.status;
    }

    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final WorldCupPassInfoDto getWorldCupPassInfo() {
        return this.worldCupPassInfo;
    }

    public int hashCode() {
        int iA = f87.a(nrg0.a((this.status.hashCode() + gpp.a(this.missionId, gmf0.a(Integer.hashCode(this.id) * 31, 31, this.userId), 31)) * 31, 31, this.accumulatedAmount), this.expireTime, 31);
        Long l = this.updateTime;
        int iHashCode = (iA + (l == null ? 0 : l.hashCode())) * 31;
        WorldCupPassInfoDto worldCupPassInfoDto = this.worldCupPassInfo;
        return iHashCode + (worldCupPassInfoDto != null ? worldCupPassInfoDto.hashCode() : 0);
    }

    public String toString() {
        int i = this.id;
        String str = this.userId;
        int i2 = this.missionId;
        MissionStatus missionStatus = this.status;
        double d = this.accumulatedAmount;
        long j = this.expireTime;
        Long l = this.updateTime;
        WorldCupPassInfoDto worldCupPassInfoDto = this.worldCupPassInfo;
        StringBuilder sbA = uqe0.a(i, "MissionProgressDto(id=", ", userId=", str, ", missionId=");
        sbA.append(i2);
        sbA.append(", status=");
        sbA.append(missionStatus);
        sbA.append(", accumulatedAmount=");
        sbA.append(d);
        g41.a(j, ", expireTime=", ", updateTime=", sbA);
        sbA.append(l);
        sbA.append(", worldCupPassInfo=");
        sbA.append(worldCupPassInfoDto);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ MissionProgressDto(int i, String str, int i2, MissionStatus missionStatus, double d, long j, Long l, WorldCupPassInfoDto worldCupPassInfoDto, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, missionStatus, d, j, (i3 & 64) != 0 ? null : l, (i3 & 128) != 0 ? null : worldCupPassInfoDto);
    }
}

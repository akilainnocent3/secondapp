package com.sporty.android.core.model.loyalty;

import defpackage.mq0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/core/model/loyalty/MissionV2Data;", "", "missionConfig", "Lcom/sporty/android/core/model/loyalty/MissionConfigV2;", "missionList", "", "Lcom/sporty/android/core/model/loyalty/UserMissionRecord;", "canParticipate", "", "<init>", "(Lcom/sporty/android/core/model/loyalty/MissionConfigV2;Ljava/util/List;Z)V", "getMissionConfig", "()Lcom/sporty/android/core/model/loyalty/MissionConfigV2;", "getMissionList", "()Ljava/util/List;", "getCanParticipate", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MissionV2Data {
    private final boolean canParticipate;
    private final MissionConfigV2 missionConfig;
    private final List<UserMissionRecord> missionList;

    public MissionV2Data(MissionConfigV2 missionConfigV2, List<UserMissionRecord> list, boolean z) {
        missionConfigV2.getClass();
        this.missionConfig = missionConfigV2;
        this.missionList = list;
        this.canParticipate = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MissionV2Data copy$default(MissionV2Data missionV2Data, MissionConfigV2 missionConfigV2, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            missionConfigV2 = missionV2Data.missionConfig;
        }
        if ((i & 2) != 0) {
            list = missionV2Data.missionList;
        }
        if ((i & 4) != 0) {
            z = missionV2Data.canParticipate;
        }
        return missionV2Data.copy(missionConfigV2, list, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MissionConfigV2 getMissionConfig() {
        return this.missionConfig;
    }

    public final List<UserMissionRecord> component2() {
        return this.missionList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCanParticipate() {
        return this.canParticipate;
    }

    public final MissionV2Data copy(MissionConfigV2 missionConfig, List<UserMissionRecord> missionList, boolean canParticipate) {
        missionConfig.getClass();
        return new MissionV2Data(missionConfig, missionList, canParticipate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionV2Data)) {
            return false;
        }
        MissionV2Data missionV2Data = (MissionV2Data) other;
        return Intrinsics.g(this.missionConfig, missionV2Data.missionConfig) && Intrinsics.g(this.missionList, missionV2Data.missionList) && this.canParticipate == missionV2Data.canParticipate;
    }

    public final boolean getCanParticipate() {
        return this.canParticipate;
    }

    public final MissionConfigV2 getMissionConfig() {
        return this.missionConfig;
    }

    public final List<UserMissionRecord> getMissionList() {
        return this.missionList;
    }

    public int hashCode() {
        int iHashCode = this.missionConfig.hashCode() * 31;
        List<UserMissionRecord> list = this.missionList;
        return Boolean.hashCode(this.canParticipate) + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public String toString() {
        MissionConfigV2 missionConfigV2 = this.missionConfig;
        List<UserMissionRecord> list = this.missionList;
        boolean z = this.canParticipate;
        StringBuilder sb = new StringBuilder("MissionV2Data(missionConfig=");
        sb.append(missionConfigV2);
        sb.append(", missionList=");
        sb.append(list);
        sb.append(", canParticipate=");
        return mq0.a(sb, z, ")");
    }
}

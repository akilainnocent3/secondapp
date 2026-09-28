package com.sporty.android.core.model.loyalty;

import defpackage.mq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/loyalty/MissionData;", "", "missionConfig", "Lcom/sporty/android/core/model/loyalty/MissionConfig;", "mission", "Lcom/sporty/android/core/model/loyalty/MissionProgressDto;", "canParticipate", "", "<init>", "(Lcom/sporty/android/core/model/loyalty/MissionConfig;Lcom/sporty/android/core/model/loyalty/MissionProgressDto;Z)V", "getMissionConfig", "()Lcom/sporty/android/core/model/loyalty/MissionConfig;", "getMission", "()Lcom/sporty/android/core/model/loyalty/MissionProgressDto;", "getCanParticipate", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MissionData {
    private final boolean canParticipate;
    private final MissionProgressDto mission;
    private final MissionConfig missionConfig;

    public MissionData(MissionConfig missionConfig, MissionProgressDto missionProgressDto, boolean z) {
        missionConfig.getClass();
        this.missionConfig = missionConfig;
        this.mission = missionProgressDto;
        this.canParticipate = z;
    }

    public static /* synthetic */ MissionData copy$default(MissionData missionData, MissionConfig missionConfig, MissionProgressDto missionProgressDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            missionConfig = missionData.missionConfig;
        }
        if ((i & 2) != 0) {
            missionProgressDto = missionData.mission;
        }
        if ((i & 4) != 0) {
            z = missionData.canParticipate;
        }
        return missionData.copy(missionConfig, missionProgressDto, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MissionConfig getMissionConfig() {
        return this.missionConfig;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MissionProgressDto getMission() {
        return this.mission;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCanParticipate() {
        return this.canParticipate;
    }

    public final MissionData copy(MissionConfig missionConfig, MissionProgressDto mission, boolean canParticipate) {
        missionConfig.getClass();
        return new MissionData(missionConfig, mission, canParticipate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionData)) {
            return false;
        }
        MissionData missionData = (MissionData) other;
        return Intrinsics.g(this.missionConfig, missionData.missionConfig) && Intrinsics.g(this.mission, missionData.mission) && this.canParticipate == missionData.canParticipate;
    }

    public final boolean getCanParticipate() {
        return this.canParticipate;
    }

    public final MissionProgressDto getMission() {
        return this.mission;
    }

    public final MissionConfig getMissionConfig() {
        return this.missionConfig;
    }

    public int hashCode() {
        int iHashCode = this.missionConfig.hashCode() * 31;
        MissionProgressDto missionProgressDto = this.mission;
        return Boolean.hashCode(this.canParticipate) + ((iHashCode + (missionProgressDto == null ? 0 : missionProgressDto.hashCode())) * 31);
    }

    public String toString() {
        MissionConfig missionConfig = this.missionConfig;
        MissionProgressDto missionProgressDto = this.mission;
        boolean z = this.canParticipate;
        StringBuilder sb = new StringBuilder("MissionData(missionConfig=");
        sb.append(missionConfig);
        sb.append(", mission=");
        sb.append(missionProgressDto);
        sb.append(", canParticipate=");
        return mq0.a(sb, z, ")");
    }
}

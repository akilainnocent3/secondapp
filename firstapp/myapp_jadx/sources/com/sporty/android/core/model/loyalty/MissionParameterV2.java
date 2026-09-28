package com.sporty.android.core.model.loyalty;

import com.appsflyer.internal.b0;
import defpackage.ai50;
import defpackage.qjk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/sporty/android/core/model/loyalty/MissionParameterV2;", "", "lastParticipationTime", "", "participationDuration", "", "rewardList", "", "Lcom/sporty/android/core/model/loyalty/MissionRewardDto;", "taskParameterList", "Lcom/sporty/android/core/model/loyalty/MissionTaskParameter;", "<init>", "(JLjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getLastParticipationTime", "()J", "getParticipationDuration", "()Ljava/lang/String;", "getRewardList", "()Ljava/util/List;", "getTaskParameterList", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MissionParameterV2 {
    private final long lastParticipationTime;
    private final String participationDuration;
    private final List<MissionRewardDto> rewardList;
    private final List<MissionTaskParameter> taskParameterList;

    public MissionParameterV2(long j, String str, List<MissionRewardDto> list, List<MissionTaskParameter> list2) {
        list.getClass();
        list2.getClass();
        this.lastParticipationTime = j;
        this.participationDuration = str;
        this.rewardList = list;
        this.taskParameterList = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MissionParameterV2 copy$default(MissionParameterV2 missionParameterV2, long j, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = missionParameterV2.lastParticipationTime;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = missionParameterV2.participationDuration;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            list = missionParameterV2.rewardList;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = missionParameterV2.taskParameterList;
        }
        return missionParameterV2.copy(j2, str2, list3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLastParticipationTime() {
        return this.lastParticipationTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParticipationDuration() {
        return this.participationDuration;
    }

    public final List<MissionRewardDto> component3() {
        return this.rewardList;
    }

    public final List<MissionTaskParameter> component4() {
        return this.taskParameterList;
    }

    public final MissionParameterV2 copy(long lastParticipationTime, String participationDuration, List<MissionRewardDto> rewardList, List<MissionTaskParameter> taskParameterList) {
        rewardList.getClass();
        taskParameterList.getClass();
        return new MissionParameterV2(lastParticipationTime, participationDuration, rewardList, taskParameterList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionParameterV2)) {
            return false;
        }
        MissionParameterV2 missionParameterV2 = (MissionParameterV2) other;
        return this.lastParticipationTime == missionParameterV2.lastParticipationTime && Intrinsics.g(this.participationDuration, missionParameterV2.participationDuration) && Intrinsics.g(this.rewardList, missionParameterV2.rewardList) && Intrinsics.g(this.taskParameterList, missionParameterV2.taskParameterList);
    }

    public final long getLastParticipationTime() {
        return this.lastParticipationTime;
    }

    public final String getParticipationDuration() {
        return this.participationDuration;
    }

    public final List<MissionRewardDto> getRewardList() {
        return this.rewardList;
    }

    public final List<MissionTaskParameter> getTaskParameterList() {
        return this.taskParameterList;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.lastParticipationTime) * 31;
        String str = this.participationDuration;
        return this.taskParameterList.hashCode() + ai50.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.rewardList);
    }

    public String toString() {
        long j = this.lastParticipationTime;
        String str = this.participationDuration;
        List<MissionRewardDto> list = this.rewardList;
        List<MissionTaskParameter> list2 = this.taskParameterList;
        StringBuilder sbA = b0.a(j, "MissionParameterV2(lastParticipationTime=", ", participationDuration=", str);
        qjk.a(", rewardList=", ", taskParameterList=", sbA, list, list2);
        sbA.append(")");
        return sbA.toString();
    }
}

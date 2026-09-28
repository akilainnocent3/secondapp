package com.sporty.android.core.model.marketingactivities;

import defpackage.f87;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\u0002\b!¨\u0006 "}, d2 = {"Lcom/sporty/android/core/model/marketingactivities/EligibleActivityResponse;", "", "activityId", "", "activityKind", "Lcom/sporty/android/core/model/marketingactivities/ActivityKind;", "activityEndTime", "", "rewardList", "", "Lcom/sporty/android/core/model/marketingactivities/ActivityReward;", "<init>", "(Ljava/lang/String;Lcom/sporty/android/core/model/marketingactivities/ActivityKind;JLjava/util/List;)V", "getActivityId", "()Ljava/lang/String;", "getActivityKind", "()Lcom/sporty/android/core/model/marketingactivities/ActivityKind;", "getActivityEndTime", "()J", "getRewardList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EligibleActivityResponse {
    private final long activityEndTime;
    private final String activityId;
    private final ActivityKind activityKind;
    private final List<ActivityReward> rewardList;

    public EligibleActivityResponse(String str, ActivityKind activityKind, long j, List<ActivityReward> list) {
        str.getClass();
        list.getClass();
        this.activityId = str;
        this.activityKind = activityKind;
        this.activityEndTime = j;
        this.rewardList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EligibleActivityResponse copy$default(EligibleActivityResponse eligibleActivityResponse, String str, ActivityKind activityKind, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eligibleActivityResponse.activityId;
        }
        if ((i & 2) != 0) {
            activityKind = eligibleActivityResponse.activityKind;
        }
        if ((i & 4) != 0) {
            j = eligibleActivityResponse.activityEndTime;
        }
        if ((i & 8) != 0) {
            list = eligibleActivityResponse.rewardList;
        }
        List list2 = list;
        return eligibleActivityResponse.copy(str, activityKind, j, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ActivityKind getActivityKind() {
        return this.activityKind;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getActivityEndTime() {
        return this.activityEndTime;
    }

    public final List<ActivityReward> component4() {
        return this.rewardList;
    }

    public final EligibleActivityResponse copy(String activityId, ActivityKind activityKind, long activityEndTime, List<ActivityReward> rewardList) {
        activityId.getClass();
        rewardList.getClass();
        return new EligibleActivityResponse(activityId, activityKind, activityEndTime, rewardList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EligibleActivityResponse)) {
            return false;
        }
        EligibleActivityResponse eligibleActivityResponse = (EligibleActivityResponse) other;
        return Intrinsics.g(this.activityId, eligibleActivityResponse.activityId) && this.activityKind == eligibleActivityResponse.activityKind && this.activityEndTime == eligibleActivityResponse.activityEndTime && Intrinsics.g(this.rewardList, eligibleActivityResponse.rewardList);
    }

    public final long getActivityEndTime() {
        return this.activityEndTime;
    }

    public final String getActivityId() {
        return this.activityId;
    }

    public final ActivityKind getActivityKind() {
        return this.activityKind;
    }

    public final List<ActivityReward> getRewardList() {
        return this.rewardList;
    }

    public int hashCode() {
        int iHashCode = this.activityId.hashCode() * 31;
        ActivityKind activityKind = this.activityKind;
        return this.rewardList.hashCode() + f87.a((iHashCode + (activityKind == null ? 0 : activityKind.hashCode())) * 31, this.activityEndTime, 31);
    }

    public String toString() {
        return "EligibleActivityResponse(activityId=" + this.activityId + ", activityKind=" + this.activityKind + ", activityEndTime=" + this.activityEndTime + ", rewardList=" + this.rewardList + ")";
    }
}

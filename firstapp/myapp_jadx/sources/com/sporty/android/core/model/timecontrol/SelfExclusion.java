package com.sporty.android.core.model.timecontrol;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0006HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006#"}, d2 = {"Lcom/sporty/android/core/model/timecontrol/SelfExclusion;", "", "endDate", "", "startDate", "reason", "", "remainingTimeForNextBlocking", "remainingTimeForUnblocking", "selfExclusionType", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getEndDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStartDate", "getReason", "()Ljava/lang/String;", "getRemainingTimeForNextBlocking", "getRemainingTimeForUnblocking", "getSelfExclusionType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/sporty/android/core/model/timecontrol/SelfExclusion;", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SelfExclusion {
    private final Long endDate;
    private final String reason;
    private final Long remainingTimeForNextBlocking;
    private final Long remainingTimeForUnblocking;
    private final String selfExclusionType;
    private final Long startDate;

    public SelfExclusion(Long l, Long l2, String str, Long l3, Long l4, String str2) {
        this.endDate = l;
        this.startDate = l2;
        this.reason = str;
        this.remainingTimeForNextBlocking = l3;
        this.remainingTimeForUnblocking = l4;
        this.selfExclusionType = str2;
    }

    public static /* synthetic */ SelfExclusion copy$default(SelfExclusion selfExclusion, Long l, Long l2, String str, Long l3, Long l4, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = selfExclusion.endDate;
        }
        if ((i & 2) != 0) {
            l2 = selfExclusion.startDate;
        }
        if ((i & 4) != 0) {
            str = selfExclusion.reason;
        }
        if ((i & 8) != 0) {
            l3 = selfExclusion.remainingTimeForNextBlocking;
        }
        if ((i & 16) != 0) {
            l4 = selfExclusion.remainingTimeForUnblocking;
        }
        if ((i & 32) != 0) {
            str2 = selfExclusion.selfExclusionType;
        }
        Long l5 = l4;
        String str3 = str2;
        return selfExclusion.copy(l, l2, str, l3, l5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getRemainingTimeForNextBlocking() {
        return this.remainingTimeForNextBlocking;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getRemainingTimeForUnblocking() {
        return this.remainingTimeForUnblocking;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSelfExclusionType() {
        return this.selfExclusionType;
    }

    public final SelfExclusion copy(Long endDate, Long startDate, String reason, Long remainingTimeForNextBlocking, Long remainingTimeForUnblocking, String selfExclusionType) {
        return new SelfExclusion(endDate, startDate, reason, remainingTimeForNextBlocking, remainingTimeForUnblocking, selfExclusionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfExclusion)) {
            return false;
        }
        SelfExclusion selfExclusion = (SelfExclusion) other;
        return Intrinsics.g(this.endDate, selfExclusion.endDate) && Intrinsics.g(this.startDate, selfExclusion.startDate) && Intrinsics.g(this.reason, selfExclusion.reason) && Intrinsics.g(this.remainingTimeForNextBlocking, selfExclusion.remainingTimeForNextBlocking) && Intrinsics.g(this.remainingTimeForUnblocking, selfExclusion.remainingTimeForUnblocking) && Intrinsics.g(this.selfExclusionType, selfExclusion.selfExclusionType);
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final String getReason() {
        return this.reason;
    }

    public final Long getRemainingTimeForNextBlocking() {
        return this.remainingTimeForNextBlocking;
    }

    public final Long getRemainingTimeForUnblocking() {
        return this.remainingTimeForUnblocking;
    }

    public final String getSelfExclusionType() {
        return this.selfExclusionType;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        Long l = this.endDate;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.startDate;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.reason;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.remainingTimeForNextBlocking;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.remainingTimeForUnblocking;
        int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.selfExclusionType;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SelfExclusion(endDate=" + this.endDate + ", startDate=" + this.startDate + ", reason=" + this.reason + ", remainingTimeForNextBlocking=" + this.remainingTimeForNextBlocking + ", remainingTimeForUnblocking=" + this.remainingTimeForUnblocking + ", selfExclusionType=" + this.selfExclusionType + ")";
    }
}

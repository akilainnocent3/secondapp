package com.sporty.android.core.model.timecontrol;

import defpackage.tzx;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/timecontrol/TimeSelfExclusionRequest;", "", "selfExclusionEndDate", "", "cooldown", "", "<init>", "(Ljava/lang/String;Z)V", "getSelfExclusionEndDate", "()Ljava/lang/String;", "getCooldown", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TimeSelfExclusionRequest {
    private final boolean cooldown;
    private final String selfExclusionEndDate;

    public TimeSelfExclusionRequest(String str, boolean z) {
        str.getClass();
        this.selfExclusionEndDate = str;
        this.cooldown = z;
    }

    public static /* synthetic */ TimeSelfExclusionRequest copy$default(TimeSelfExclusionRequest timeSelfExclusionRequest, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timeSelfExclusionRequest.selfExclusionEndDate;
        }
        if ((i & 2) != 0) {
            z = timeSelfExclusionRequest.cooldown;
        }
        return timeSelfExclusionRequest.copy(str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSelfExclusionEndDate() {
        return this.selfExclusionEndDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCooldown() {
        return this.cooldown;
    }

    public final TimeSelfExclusionRequest copy(String selfExclusionEndDate, boolean cooldown) {
        selfExclusionEndDate.getClass();
        return new TimeSelfExclusionRequest(selfExclusionEndDate, cooldown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeSelfExclusionRequest)) {
            return false;
        }
        TimeSelfExclusionRequest timeSelfExclusionRequest = (TimeSelfExclusionRequest) other;
        return Intrinsics.g(this.selfExclusionEndDate, timeSelfExclusionRequest.selfExclusionEndDate) && this.cooldown == timeSelfExclusionRequest.cooldown;
    }

    public final boolean getCooldown() {
        return this.cooldown;
    }

    public final String getSelfExclusionEndDate() {
        return this.selfExclusionEndDate;
    }

    public int hashCode() {
        return Boolean.hashCode(this.cooldown) + (this.selfExclusionEndDate.hashCode() * 31);
    }

    public String toString() {
        return tzx.a("TimeSelfExclusionRequest(selfExclusionEndDate=", this.selfExclusionEndDate, ", cooldown=", ")", this.cooldown);
    }
}

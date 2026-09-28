package com.sporty.android.core.model.loyalty;

import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/sporty/android/core/model/loyalty/ParticipateMissionRequest;", "", "missionId", "", "<init>", "(Ljava/lang/String;)V", "getMissionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ParticipateMissionRequest {
    private final String missionId;

    public ParticipateMissionRequest(String str) {
        str.getClass();
        this.missionId = str;
    }

    public static /* synthetic */ ParticipateMissionRequest copy$default(ParticipateMissionRequest participateMissionRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = participateMissionRequest.missionId;
        }
        return participateMissionRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMissionId() {
        return this.missionId;
    }

    public final ParticipateMissionRequest copy(String missionId) {
        missionId.getClass();
        return new ParticipateMissionRequest(missionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ParticipateMissionRequest) && Intrinsics.g(this.missionId, ((ParticipateMissionRequest) other).missionId);
    }

    public final String getMissionId() {
        return this.missionId;
    }

    public int hashCode() {
        return this.missionId.hashCode();
    }

    public String toString() {
        return tug.a("ParticipateMissionRequest(missionId=", this.missionId, ")");
    }
}

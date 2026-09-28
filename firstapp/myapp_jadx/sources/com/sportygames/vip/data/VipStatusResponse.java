package com.sportygames.vip.data;

import defpackage.ruw;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/sportygames/vip/data/VipStatusResponse;", "", "vipStatus", "", "<init>", "(Z)V", "getVipStatus", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "vip_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VipStatusResponse {
    public static final int $stable = 0;
    private final boolean vipStatus;

    public VipStatusResponse(boolean z) {
        this.vipStatus = z;
    }

    public static /* synthetic */ VipStatusResponse copy$default(VipStatusResponse vipStatusResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = vipStatusResponse.vipStatus;
        }
        return vipStatusResponse.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getVipStatus() {
        return this.vipStatus;
    }

    public final VipStatusResponse copy(boolean vipStatus) {
        return new VipStatusResponse(vipStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VipStatusResponse) && this.vipStatus == ((VipStatusResponse) other).vipStatus;
    }

    public final boolean getVipStatus() {
        return this.vipStatus;
    }

    public int hashCode() {
        return Boolean.hashCode(this.vipStatus);
    }

    public String toString() {
        return ruw.a(new StringBuilder("VipStatusResponse(vipStatus="), this.vipStatus, ')');
    }
}

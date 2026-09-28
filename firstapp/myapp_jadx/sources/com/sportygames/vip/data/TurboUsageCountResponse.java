package com.sportygames.vip.data;

import defpackage.itu;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/sportygames/vip/data/TurboUsageCountResponse;", "", "turboValue", "", "turboBonusPercentage", "activateAfterRoundId", "", "stakeLimit", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;)V", "getTurboValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTurboBonusPercentage", "getActivateAfterRoundId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStakeLimit", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;)Lcom/sportygames/vip/data/TurboUsageCountResponse;", "equals", "", "other", "hashCode", "", "toString", "", "vip_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TurboUsageCountResponse {
    public static final int $stable = 0;
    private final Long activateAfterRoundId;
    private final Double stakeLimit;
    private final Double turboBonusPercentage;
    private final Double turboValue;

    public TurboUsageCountResponse(Double d, Double d2, Long l, Double d3) {
        this.turboValue = d;
        this.turboBonusPercentage = d2;
        this.activateAfterRoundId = l;
        this.stakeLimit = d3;
    }

    public static /* synthetic */ TurboUsageCountResponse copy$default(TurboUsageCountResponse turboUsageCountResponse, Double d, Double d2, Long l, Double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = turboUsageCountResponse.turboValue;
        }
        if ((i & 2) != 0) {
            d2 = turboUsageCountResponse.turboBonusPercentage;
        }
        if ((i & 4) != 0) {
            l = turboUsageCountResponse.activateAfterRoundId;
        }
        if ((i & 8) != 0) {
            d3 = turboUsageCountResponse.stakeLimit;
        }
        return turboUsageCountResponse.copy(d, d2, l, d3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getTurboValue() {
        return this.turboValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getTurboBonusPercentage() {
        return this.turboBonusPercentage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getActivateAfterRoundId() {
        return this.activateAfterRoundId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getStakeLimit() {
        return this.stakeLimit;
    }

    public final TurboUsageCountResponse copy(Double turboValue, Double turboBonusPercentage, Long activateAfterRoundId, Double stakeLimit) {
        return new TurboUsageCountResponse(turboValue, turboBonusPercentage, activateAfterRoundId, stakeLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TurboUsageCountResponse)) {
            return false;
        }
        TurboUsageCountResponse turboUsageCountResponse = (TurboUsageCountResponse) other;
        return Intrinsics.g(this.turboValue, turboUsageCountResponse.turboValue) && Intrinsics.g(this.turboBonusPercentage, turboUsageCountResponse.turboBonusPercentage) && Intrinsics.g(this.activateAfterRoundId, turboUsageCountResponse.activateAfterRoundId) && Intrinsics.g(this.stakeLimit, turboUsageCountResponse.stakeLimit);
    }

    public final Long getActivateAfterRoundId() {
        return this.activateAfterRoundId;
    }

    public final Double getStakeLimit() {
        return this.stakeLimit;
    }

    public final Double getTurboBonusPercentage() {
        return this.turboBonusPercentage;
    }

    public final Double getTurboValue() {
        return this.turboValue;
    }

    public int hashCode() {
        Double d = this.turboValue;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.turboBonusPercentage;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l = this.activateAfterRoundId;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Double d3 = this.stakeLimit;
        return iHashCode3 + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TurboUsageCountResponse(turboValue=");
        sb.append(this.turboValue);
        sb.append(", turboBonusPercentage=");
        sb.append(this.turboBonusPercentage);
        sb.append(", activateAfterRoundId=");
        sb.append(this.activateAfterRoundId);
        sb.append(", stakeLimit=");
        return itu.a(sb, this.stakeLimit, ')');
    }
}

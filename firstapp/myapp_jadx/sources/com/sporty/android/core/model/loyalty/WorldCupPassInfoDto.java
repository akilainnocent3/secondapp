package com.sporty.android.core.model.loyalty;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/loyalty/WorldCupPassInfoDto;", "", "pocketReceiveTime", "", "passStartTime", "passEndTime", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getPocketReceiveTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPassStartTime", "getPassEndTime", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/sporty/android/core/model/loyalty/WorldCupPassInfoDto;", "equals", "", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WorldCupPassInfoDto {
    private final Long passEndTime;
    private final Long passStartTime;
    private final Long pocketReceiveTime;

    public WorldCupPassInfoDto(Long l, Long l2, Long l3) {
        this.pocketReceiveTime = l;
        this.passStartTime = l2;
        this.passEndTime = l3;
    }

    public static /* synthetic */ WorldCupPassInfoDto copy$default(WorldCupPassInfoDto worldCupPassInfoDto, Long l, Long l2, Long l3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = worldCupPassInfoDto.pocketReceiveTime;
        }
        if ((i & 2) != 0) {
            l2 = worldCupPassInfoDto.passStartTime;
        }
        if ((i & 4) != 0) {
            l3 = worldCupPassInfoDto.passEndTime;
        }
        return worldCupPassInfoDto.copy(l, l2, l3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getPocketReceiveTime() {
        return this.pocketReceiveTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getPassStartTime() {
        return this.passStartTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getPassEndTime() {
        return this.passEndTime;
    }

    public final WorldCupPassInfoDto copy(Long pocketReceiveTime, Long passStartTime, Long passEndTime) {
        return new WorldCupPassInfoDto(pocketReceiveTime, passStartTime, passEndTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorldCupPassInfoDto)) {
            return false;
        }
        WorldCupPassInfoDto worldCupPassInfoDto = (WorldCupPassInfoDto) other;
        return Intrinsics.g(this.pocketReceiveTime, worldCupPassInfoDto.pocketReceiveTime) && Intrinsics.g(this.passStartTime, worldCupPassInfoDto.passStartTime) && Intrinsics.g(this.passEndTime, worldCupPassInfoDto.passEndTime);
    }

    public final Long getPassEndTime() {
        return this.passEndTime;
    }

    public final Long getPassStartTime() {
        return this.passStartTime;
    }

    public final Long getPocketReceiveTime() {
        return this.pocketReceiveTime;
    }

    public int hashCode() {
        Long l = this.pocketReceiveTime;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.passStartTime;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.passEndTime;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    public String toString() {
        return "WorldCupPassInfoDto(pocketReceiveTime=" + this.pocketReceiveTime + ", passStartTime=" + this.passStartTime + ", passEndTime=" + this.passEndTime + ")";
    }
}

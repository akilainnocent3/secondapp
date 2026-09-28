package com.sportybet.feature.luckynumber.placebet.data.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fÊ\u0001\u0002\b\u001eÊ\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001d"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNFavoriteStakeDTO;", "", "defaultStake", "", "quickAddStake1", "quickAddStake2", "quickAddStake3", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getDefaultStake", "()J", "getQuickAddStake1", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getQuickAddStake2", "getQuickAddStake3", "component1", "component2", "component3", "component4", "copy", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/sportybet/feature/luckynumber/placebet/data/data/LNFavoriteStakeDTO;", "equals", "", "other", "hashCode", "", "toString", "", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNFavoriteStakeDTO {
    public static final int $stable = 0;
    private final long defaultStake;
    private final Long quickAddStake1;
    private final Long quickAddStake2;
    private final Long quickAddStake3;

    public /* synthetic */ LNFavoriteStakeDTO(long j, Long l, Long l2, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3);
    }

    public static /* synthetic */ LNFavoriteStakeDTO copy$default(LNFavoriteStakeDTO lNFavoriteStakeDTO, long j, Long l, Long l2, Long l3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = lNFavoriteStakeDTO.defaultStake;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            l = lNFavoriteStakeDTO.quickAddStake1;
        }
        Long l4 = l;
        if ((i & 4) != 0) {
            l2 = lNFavoriteStakeDTO.quickAddStake2;
        }
        Long l5 = l2;
        if ((i & 8) != 0) {
            l3 = lNFavoriteStakeDTO.quickAddStake3;
        }
        return lNFavoriteStakeDTO.copy(j2, l4, l5, l3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDefaultStake() {
        return this.defaultStake;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getQuickAddStake1() {
        return this.quickAddStake1;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getQuickAddStake2() {
        return this.quickAddStake2;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getQuickAddStake3() {
        return this.quickAddStake3;
    }

    public final LNFavoriteStakeDTO copy(long defaultStake, Long quickAddStake1, Long quickAddStake2, Long quickAddStake3) {
        return new LNFavoriteStakeDTO(defaultStake, quickAddStake1, quickAddStake2, quickAddStake3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNFavoriteStakeDTO)) {
            return false;
        }
        LNFavoriteStakeDTO lNFavoriteStakeDTO = (LNFavoriteStakeDTO) other;
        return this.defaultStake == lNFavoriteStakeDTO.defaultStake && Intrinsics.g(this.quickAddStake1, lNFavoriteStakeDTO.quickAddStake1) && Intrinsics.g(this.quickAddStake2, lNFavoriteStakeDTO.quickAddStake2) && Intrinsics.g(this.quickAddStake3, lNFavoriteStakeDTO.quickAddStake3);
    }

    public final long getDefaultStake() {
        return this.defaultStake;
    }

    public final Long getQuickAddStake1() {
        return this.quickAddStake1;
    }

    public final Long getQuickAddStake2() {
        return this.quickAddStake2;
    }

    public final Long getQuickAddStake3() {
        return this.quickAddStake3;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.defaultStake) * 31;
        Long l = this.quickAddStake1;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.quickAddStake2;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.quickAddStake3;
        return iHashCode3 + (l3 != null ? l3.hashCode() : 0);
    }

    public String toString() {
        return "LNFavoriteStakeDTO(defaultStake=" + this.defaultStake + ", quickAddStake1=" + this.quickAddStake1 + ", quickAddStake2=" + this.quickAddStake2 + ", quickAddStake3=" + this.quickAddStake3 + ")";
    }

    public LNFavoriteStakeDTO(long j, Long l, Long l2, Long l3) {
        this.defaultStake = j;
        this.quickAddStake1 = l;
        this.quickAddStake2 = l2;
        this.quickAddStake3 = l3;
    }
}

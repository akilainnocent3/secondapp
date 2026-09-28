package com.sportybet.feature.luckynumber.featurematch.data.data;

import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\u0002\b Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001f"}, d2 = {"Lcom/sportybet/feature/luckynumber/featurematch/data/data/LNFeatureMatchCardsDTO;", "", "serverTime", "", "featureMatchEnable", "", "lastMinuteCard", "Lcom/sportybet/feature/luckynumber/featurematch/data/data/LNLastMinuteCardDTO;", "highestOddsCard", "Lcom/sportybet/feature/luckynumber/featurematch/data/data/LNHighestOddsCardDTO;", "<init>", "(JZLcom/sportybet/feature/luckynumber/featurematch/data/data/LNLastMinuteCardDTO;Lcom/sportybet/feature/luckynumber/featurematch/data/data/LNHighestOddsCardDTO;)V", "getServerTime", "()J", "getFeatureMatchEnable", "()Z", "getLastMinuteCard", "()Lcom/sportybet/feature/luckynumber/featurematch/data/data/LNLastMinuteCardDTO;", "getHighestOddsCard", "()Lcom/sportybet/feature/luckynumber/featurematch/data/data/LNHighestOddsCardDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNFeatureMatchCardsDTO {
    public static final int $stable = LNHighestOddsCardDTO.$stable | LNLastMinuteCardDTO.$stable;
    private final boolean featureMatchEnable;
    private final LNHighestOddsCardDTO highestOddsCard;
    private final LNLastMinuteCardDTO lastMinuteCard;
    private final long serverTime;

    public LNFeatureMatchCardsDTO(long j, boolean z, LNLastMinuteCardDTO lNLastMinuteCardDTO, LNHighestOddsCardDTO lNHighestOddsCardDTO) {
        this.serverTime = j;
        this.featureMatchEnable = z;
        this.lastMinuteCard = lNLastMinuteCardDTO;
        this.highestOddsCard = lNHighestOddsCardDTO;
    }

    public static /* synthetic */ LNFeatureMatchCardsDTO copy$default(LNFeatureMatchCardsDTO lNFeatureMatchCardsDTO, long j, boolean z, LNLastMinuteCardDTO lNLastMinuteCardDTO, LNHighestOddsCardDTO lNHighestOddsCardDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            j = lNFeatureMatchCardsDTO.serverTime;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            z = lNFeatureMatchCardsDTO.featureMatchEnable;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            lNLastMinuteCardDTO = lNFeatureMatchCardsDTO.lastMinuteCard;
        }
        LNLastMinuteCardDTO lNLastMinuteCardDTO2 = lNLastMinuteCardDTO;
        if ((i & 8) != 0) {
            lNHighestOddsCardDTO = lNFeatureMatchCardsDTO.highestOddsCard;
        }
        return lNFeatureMatchCardsDTO.copy(j2, z2, lNLastMinuteCardDTO2, lNHighestOddsCardDTO);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getServerTime() {
        return this.serverTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getFeatureMatchEnable() {
        return this.featureMatchEnable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LNLastMinuteCardDTO getLastMinuteCard() {
        return this.lastMinuteCard;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LNHighestOddsCardDTO getHighestOddsCard() {
        return this.highestOddsCard;
    }

    public final LNFeatureMatchCardsDTO copy(long serverTime, boolean featureMatchEnable, LNLastMinuteCardDTO lastMinuteCard, LNHighestOddsCardDTO highestOddsCard) {
        return new LNFeatureMatchCardsDTO(serverTime, featureMatchEnable, lastMinuteCard, highestOddsCard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNFeatureMatchCardsDTO)) {
            return false;
        }
        LNFeatureMatchCardsDTO lNFeatureMatchCardsDTO = (LNFeatureMatchCardsDTO) other;
        return this.serverTime == lNFeatureMatchCardsDTO.serverTime && this.featureMatchEnable == lNFeatureMatchCardsDTO.featureMatchEnable && Intrinsics.g(this.lastMinuteCard, lNFeatureMatchCardsDTO.lastMinuteCard) && Intrinsics.g(this.highestOddsCard, lNFeatureMatchCardsDTO.highestOddsCard);
    }

    public final boolean getFeatureMatchEnable() {
        return this.featureMatchEnable;
    }

    public final LNHighestOddsCardDTO getHighestOddsCard() {
        return this.highestOddsCard;
    }

    public final LNLastMinuteCardDTO getLastMinuteCard() {
        return this.lastMinuteCard;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public int hashCode() {
        int iA = mtg0.a(Long.hashCode(this.serverTime) * 31, 31, this.featureMatchEnable);
        LNLastMinuteCardDTO lNLastMinuteCardDTO = this.lastMinuteCard;
        int iHashCode = (iA + (lNLastMinuteCardDTO == null ? 0 : lNLastMinuteCardDTO.hashCode())) * 31;
        LNHighestOddsCardDTO lNHighestOddsCardDTO = this.highestOddsCard;
        return iHashCode + (lNHighestOddsCardDTO != null ? lNHighestOddsCardDTO.hashCode() : 0);
    }

    public String toString() {
        return "LNFeatureMatchCardsDTO(serverTime=" + this.serverTime + ", featureMatchEnable=" + this.featureMatchEnable + ", lastMinuteCard=" + this.lastMinuteCard + ", highestOddsCard=" + this.highestOddsCard + ")";
    }
}

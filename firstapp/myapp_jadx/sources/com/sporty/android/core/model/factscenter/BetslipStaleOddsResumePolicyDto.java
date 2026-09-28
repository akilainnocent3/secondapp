package com.sporty.android.core.model.factscenter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/factscenter/BetslipStaleOddsResumePolicyDto;", "", "enable", "", "waitThresholdInSeconds", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;)V", "getEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getWaitThresholdInSeconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/sporty/android/core/model/factscenter/BetslipStaleOddsResumePolicyDto;", "equals", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetslipStaleOddsResumePolicyDto {
    private final Boolean enable;
    private final Long waitThresholdInSeconds;

    public BetslipStaleOddsResumePolicyDto(Boolean bool, Long l) {
        this.enable = bool;
        this.waitThresholdInSeconds = l;
    }

    public static /* synthetic */ BetslipStaleOddsResumePolicyDto copy$default(BetslipStaleOddsResumePolicyDto betslipStaleOddsResumePolicyDto, Boolean bool, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = betslipStaleOddsResumePolicyDto.enable;
        }
        if ((i & 2) != 0) {
            l = betslipStaleOddsResumePolicyDto.waitThresholdInSeconds;
        }
        return betslipStaleOddsResumePolicyDto.copy(bool, l);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getWaitThresholdInSeconds() {
        return this.waitThresholdInSeconds;
    }

    public final BetslipStaleOddsResumePolicyDto copy(Boolean enable, Long waitThresholdInSeconds) {
        return new BetslipStaleOddsResumePolicyDto(enable, waitThresholdInSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetslipStaleOddsResumePolicyDto)) {
            return false;
        }
        BetslipStaleOddsResumePolicyDto betslipStaleOddsResumePolicyDto = (BetslipStaleOddsResumePolicyDto) other;
        return Intrinsics.g(this.enable, betslipStaleOddsResumePolicyDto.enable) && Intrinsics.g(this.waitThresholdInSeconds, betslipStaleOddsResumePolicyDto.waitThresholdInSeconds);
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final Long getWaitThresholdInSeconds() {
        return this.waitThresholdInSeconds;
    }

    public int hashCode() {
        Boolean bool = this.enable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.waitThresholdInSeconds;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "BetslipStaleOddsResumePolicyDto(enable=" + this.enable + ", waitThresholdInSeconds=" + this.waitThresholdInSeconds + ")";
    }
}

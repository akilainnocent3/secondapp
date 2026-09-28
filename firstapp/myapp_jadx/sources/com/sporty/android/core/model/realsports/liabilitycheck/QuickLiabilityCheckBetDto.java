package com.sporty.android.core.model.realsports.liabilitycheck;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ,\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u001a¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/realsports/liabilitycheck/QuickLiabilityCheckBetDto;", "", "selections", "", "Lcom/sporty/android/core/model/realsports/liabilitycheck/QuickLiabilityCheckSelectionDto;", "stake", "", "<init>", "(Ljava/util/Collection;Ljava/lang/Long;)V", "getSelections", "()Ljava/util/Collection;", "getStake", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/util/Collection;Ljava/lang/Long;)Lcom/sporty/android/core/model/realsports/liabilitycheck/QuickLiabilityCheckBetDto;", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class QuickLiabilityCheckBetDto {
    private final Collection<QuickLiabilityCheckSelectionDto> selections;
    private final Long stake;

    public QuickLiabilityCheckBetDto(Collection<QuickLiabilityCheckSelectionDto> collection, Long l) {
        this.selections = collection;
        this.stake = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuickLiabilityCheckBetDto copy$default(QuickLiabilityCheckBetDto quickLiabilityCheckBetDto, Collection collection, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            collection = quickLiabilityCheckBetDto.selections;
        }
        if ((i & 2) != 0) {
            l = quickLiabilityCheckBetDto.stake;
        }
        return quickLiabilityCheckBetDto.copy(collection, l);
    }

    public final Collection<QuickLiabilityCheckSelectionDto> component1() {
        return this.selections;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getStake() {
        return this.stake;
    }

    public final QuickLiabilityCheckBetDto copy(Collection<QuickLiabilityCheckSelectionDto> selections, Long stake) {
        return new QuickLiabilityCheckBetDto(selections, stake);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickLiabilityCheckBetDto)) {
            return false;
        }
        QuickLiabilityCheckBetDto quickLiabilityCheckBetDto = (QuickLiabilityCheckBetDto) other;
        return Intrinsics.g(this.selections, quickLiabilityCheckBetDto.selections) && Intrinsics.g(this.stake, quickLiabilityCheckBetDto.stake);
    }

    public final Collection<QuickLiabilityCheckSelectionDto> getSelections() {
        return this.selections;
    }

    public final Long getStake() {
        return this.stake;
    }

    public int hashCode() {
        Collection<QuickLiabilityCheckSelectionDto> collection = this.selections;
        int iHashCode = (collection == null ? 0 : collection.hashCode()) * 31;
        Long l = this.stake;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "QuickLiabilityCheckBetDto(selections=" + this.selections + ", stake=" + this.stake + ")";
    }
}

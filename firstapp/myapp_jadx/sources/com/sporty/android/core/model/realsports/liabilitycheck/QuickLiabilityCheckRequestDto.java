package com.sporty.android.core.model.realsports.liabilitycheck;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ,\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/realsports/liabilitycheck/QuickLiabilityCheckRequestDto;", "", "bets", "", "Lcom/sporty/android/core/model/realsports/liabilitycheck/QuickLiabilityCheckBetDto;", "orderType", "", "<init>", "(Ljava/util/Collection;Ljava/lang/Integer;)V", "getBets", "()Ljava/util/Collection;", "getOrderType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/Collection;Ljava/lang/Integer;)Lcom/sporty/android/core/model/realsports/liabilitycheck/QuickLiabilityCheckRequestDto;", "equals", "", "other", "hashCode", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class QuickLiabilityCheckRequestDto {
    private final Collection<QuickLiabilityCheckBetDto> bets;
    private final Integer orderType;

    public QuickLiabilityCheckRequestDto(Collection<QuickLiabilityCheckBetDto> collection, Integer num) {
        this.bets = collection;
        this.orderType = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuickLiabilityCheckRequestDto copy$default(QuickLiabilityCheckRequestDto quickLiabilityCheckRequestDto, Collection collection, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            collection = quickLiabilityCheckRequestDto.bets;
        }
        if ((i & 2) != 0) {
            num = quickLiabilityCheckRequestDto.orderType;
        }
        return quickLiabilityCheckRequestDto.copy(collection, num);
    }

    public final Collection<QuickLiabilityCheckBetDto> component1() {
        return this.bets;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getOrderType() {
        return this.orderType;
    }

    public final QuickLiabilityCheckRequestDto copy(Collection<QuickLiabilityCheckBetDto> bets, Integer orderType) {
        return new QuickLiabilityCheckRequestDto(bets, orderType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickLiabilityCheckRequestDto)) {
            return false;
        }
        QuickLiabilityCheckRequestDto quickLiabilityCheckRequestDto = (QuickLiabilityCheckRequestDto) other;
        return Intrinsics.g(this.bets, quickLiabilityCheckRequestDto.bets) && Intrinsics.g(this.orderType, quickLiabilityCheckRequestDto.orderType);
    }

    public final Collection<QuickLiabilityCheckBetDto> getBets() {
        return this.bets;
    }

    public final Integer getOrderType() {
        return this.orderType;
    }

    public int hashCode() {
        Collection<QuickLiabilityCheckBetDto> collection = this.bets;
        int iHashCode = (collection == null ? 0 : collection.hashCode()) * 31;
        Integer num = this.orderType;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "QuickLiabilityCheckRequestDto(bets=" + this.bets + ", orderType=" + this.orderType + ")";
    }
}

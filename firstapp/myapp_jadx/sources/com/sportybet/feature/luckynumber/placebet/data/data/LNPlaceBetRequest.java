package com.sportybet.feature.luckynumber.placebet.data.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\u0002\b\u0012Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0011"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNPlaceBetRequest;", "", "order", "Lcom/sportybet/feature/luckynumber/placebet/data/data/OrderDTO;", "<init>", "(Lcom/sportybet/feature/luckynumber/placebet/data/data/OrderDTO;)V", "getOrder", "()Lcom/sportybet/feature/luckynumber/placebet/data/data/OrderDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNPlaceBetRequest {
    public static final int $stable = OrderDTO.$stable;
    private final OrderDTO order;

    public LNPlaceBetRequest(OrderDTO orderDTO) {
        orderDTO.getClass();
        this.order = orderDTO;
    }

    public static /* synthetic */ LNPlaceBetRequest copy$default(LNPlaceBetRequest lNPlaceBetRequest, OrderDTO orderDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            orderDTO = lNPlaceBetRequest.order;
        }
        return lNPlaceBetRequest.copy(orderDTO);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrderDTO getOrder() {
        return this.order;
    }

    public final LNPlaceBetRequest copy(OrderDTO order) {
        order.getClass();
        return new LNPlaceBetRequest(order);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LNPlaceBetRequest) && Intrinsics.g(this.order, ((LNPlaceBetRequest) other).order);
    }

    public final OrderDTO getOrder() {
        return this.order;
    }

    public int hashCode() {
        return this.order.hashCode();
    }

    public String toString() {
        return "LNPlaceBetRequest(order=" + this.order + ")";
    }
}

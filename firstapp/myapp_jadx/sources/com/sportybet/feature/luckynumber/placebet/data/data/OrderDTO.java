package com.sportybet.feature.luckynumber.placebet.data.data;

import defpackage.ai50;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\u0002\b Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001f"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/OrderDTO;", "", "type", "", "selections", "", "Lcom/sportybet/feature/luckynumber/placebet/data/data/SelectionDTO;", "bets", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNBetDTO;", "amount", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNAmountDTO;", "<init>", "(ILjava/util/List;Ljava/util/List;Lcom/sportybet/feature/luckynumber/placebet/data/data/LNAmountDTO;)V", "getType", "()I", "getSelections", "()Ljava/util/List;", "getBets", "getAmount", "()Lcom/sportybet/feature/luckynumber/placebet/data/data/LNAmountDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OrderDTO {
    public static final int $stable = LNAmountDTO.$stable;
    private final LNAmountDTO amount;
    private final List<LNBetDTO> bets;
    private final List<SelectionDTO> selections;
    private final int type;

    public OrderDTO(int i, List<SelectionDTO> list, List<LNBetDTO> list2, LNAmountDTO lNAmountDTO) {
        list.getClass();
        list2.getClass();
        lNAmountDTO.getClass();
        this.type = i;
        this.selections = list;
        this.bets = list2;
        this.amount = lNAmountDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderDTO copy$default(OrderDTO orderDTO, int i, List list, List list2, LNAmountDTO lNAmountDTO, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = orderDTO.type;
        }
        if ((i2 & 2) != 0) {
            list = orderDTO.selections;
        }
        if ((i2 & 4) != 0) {
            list2 = orderDTO.bets;
        }
        if ((i2 & 8) != 0) {
            lNAmountDTO = orderDTO.amount;
        }
        return orderDTO.copy(i, list, list2, lNAmountDTO);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final List<SelectionDTO> component2() {
        return this.selections;
    }

    public final List<LNBetDTO> component3() {
        return this.bets;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LNAmountDTO getAmount() {
        return this.amount;
    }

    public final OrderDTO copy(int type, List<SelectionDTO> selections, List<LNBetDTO> bets, LNAmountDTO amount) {
        selections.getClass();
        bets.getClass();
        amount.getClass();
        return new OrderDTO(type, selections, bets, amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDTO)) {
            return false;
        }
        OrderDTO orderDTO = (OrderDTO) other;
        return this.type == orderDTO.type && Intrinsics.g(this.selections, orderDTO.selections) && Intrinsics.g(this.bets, orderDTO.bets) && Intrinsics.g(this.amount, orderDTO.amount);
    }

    public final LNAmountDTO getAmount() {
        return this.amount;
    }

    public final List<LNBetDTO> getBets() {
        return this.bets;
    }

    public final List<SelectionDTO> getSelections() {
        return this.selections;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.amount.hashCode() + ai50.a(ai50.a(Integer.hashCode(this.type) * 31, 31, this.selections), 31, this.bets);
    }

    public String toString() {
        return "OrderDTO(type=" + this.type + ", selections=" + this.selections + ", bets=" + this.bets + ", amount=" + this.amount + ")";
    }
}

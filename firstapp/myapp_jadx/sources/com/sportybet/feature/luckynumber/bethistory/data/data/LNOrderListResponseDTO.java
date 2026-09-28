package com.sportybet.feature.luckynumber.bethistory.data.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u0017Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sportybet/feature/luckynumber/bethistory/data/data/LNOrderListResponseDTO;", "", "orders", "", "Lcom/sportybet/feature/luckynumber/bethistory/data/data/LNOrderDTO;", "nextCursor", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getOrders", "()Ljava/util/List;", "getNextCursor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNOrderListResponseDTO {
    public static final int $stable = 8;
    private final String nextCursor;
    private final List<LNOrderDTO> orders;

    public /* synthetic */ LNOrderListResponseDTO(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNOrderListResponseDTO copy$default(LNOrderListResponseDTO lNOrderListResponseDTO, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lNOrderListResponseDTO.orders;
        }
        if ((i & 2) != 0) {
            str = lNOrderListResponseDTO.nextCursor;
        }
        return lNOrderListResponseDTO.copy(list, str);
    }

    public final List<LNOrderDTO> component1() {
        return this.orders;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final LNOrderListResponseDTO copy(List<LNOrderDTO> orders, String nextCursor) {
        return new LNOrderListResponseDTO(orders, nextCursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNOrderListResponseDTO)) {
            return false;
        }
        LNOrderListResponseDTO lNOrderListResponseDTO = (LNOrderListResponseDTO) other;
        return Intrinsics.g(this.orders, lNOrderListResponseDTO.orders) && Intrinsics.g(this.nextCursor, lNOrderListResponseDTO.nextCursor);
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final List<LNOrderDTO> getOrders() {
        return this.orders;
    }

    public int hashCode() {
        List<LNOrderDTO> list = this.orders;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextCursor;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "LNOrderListResponseDTO(orders=" + this.orders + ", nextCursor=" + this.nextCursor + ")";
    }

    public LNOrderListResponseDTO(List<LNOrderDTO> list, String str) {
        this.orders = list;
        this.nextCursor = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LNOrderListResponseDTO() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

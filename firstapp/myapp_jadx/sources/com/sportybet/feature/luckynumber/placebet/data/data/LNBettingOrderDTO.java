package com.sportybet.feature.luckynumber.placebet.data.data;

import defpackage.ai50;
import defpackage.gmf0;
import defpackage.ux5;
import defpackage.v9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fÊ\u0001\u0002\b\u001cÊ\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001b"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNBettingOrderDTO;", "", "orderId", "", "shortId", "mainNumbers", "", "", "bonusNumbers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getOrderId", "()Ljava/lang/String;", "getShortId", "getMainNumbers", "()Ljava/util/List;", "getBonusNumbers", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNBettingOrderDTO {
    public static final int $stable = 0;
    private final List<Integer> bonusNumbers;
    private final List<Integer> mainNumbers;
    private final String orderId;
    private final String shortId;

    public LNBettingOrderDTO(String str, String str2, List<Integer> list, List<Integer> list2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.orderId = str;
        this.shortId = str2;
        this.mainNumbers = list;
        this.bonusNumbers = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNBettingOrderDTO copy$default(LNBettingOrderDTO lNBettingOrderDTO, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNBettingOrderDTO.orderId;
        }
        if ((i & 2) != 0) {
            str2 = lNBettingOrderDTO.shortId;
        }
        if ((i & 4) != 0) {
            list = lNBettingOrderDTO.mainNumbers;
        }
        if ((i & 8) != 0) {
            list2 = lNBettingOrderDTO.bonusNumbers;
        }
        return lNBettingOrderDTO.copy(str, str2, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShortId() {
        return this.shortId;
    }

    public final List<Integer> component3() {
        return this.mainNumbers;
    }

    public final List<Integer> component4() {
        return this.bonusNumbers;
    }

    public final LNBettingOrderDTO copy(String orderId, String shortId, List<Integer> mainNumbers, List<Integer> bonusNumbers) {
        orderId.getClass();
        shortId.getClass();
        mainNumbers.getClass();
        bonusNumbers.getClass();
        return new LNBettingOrderDTO(orderId, shortId, mainNumbers, bonusNumbers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNBettingOrderDTO)) {
            return false;
        }
        LNBettingOrderDTO lNBettingOrderDTO = (LNBettingOrderDTO) other;
        return Intrinsics.g(this.orderId, lNBettingOrderDTO.orderId) && Intrinsics.g(this.shortId, lNBettingOrderDTO.shortId) && Intrinsics.g(this.mainNumbers, lNBettingOrderDTO.mainNumbers) && Intrinsics.g(this.bonusNumbers, lNBettingOrderDTO.bonusNumbers);
    }

    public final List<Integer> getBonusNumbers() {
        return this.bonusNumbers;
    }

    public final List<Integer> getMainNumbers() {
        return this.mainNumbers;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getShortId() {
        return this.shortId;
    }

    public int hashCode() {
        return this.bonusNumbers.hashCode() + ai50.a(gmf0.a(this.orderId.hashCode() * 31, 31, this.shortId), 31, this.mainNumbers);
    }

    public String toString() {
        String str = this.orderId;
        String str2 = this.shortId;
        return v9d.a(", bonusNumbers=", ")", ux5.a("LNBettingOrderDTO(orderId=", str, ", shortId=", str2, ", mainNumbers="), this.mainNumbers, this.bonusNumbers);
    }
}

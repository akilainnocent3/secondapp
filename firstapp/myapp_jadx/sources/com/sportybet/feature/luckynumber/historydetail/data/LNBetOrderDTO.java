package com.sportybet.feature.luckynumber.historydetail.data;

import defpackage.ai50;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.nrz;
import defpackage.ux5;
import defpackage.wxa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\u008e\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0012\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u00104J\u0014\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00108\u001a\u00020\u0006HÖ\u0081\u0004J\n\u00109\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bÊ\u0001\u0002\b;Ê\u0001\f\b<\u0012\b\b=\u0012\u0004\b\u0003\u0010\u0000¨\u0006:"}, d2 = {"Lcom/sportybet/feature/luckynumber/historydetail/data/LNBetOrderDTO;", "", "orderId", "", "shortId", "orderType", "", "totalStake", "", "totalWinnings", "winningStatus", "giftTotalAmount", "currency", "combinationSize", "betSize", "selections", "", "Lcom/sportybet/feature/luckynumber/historydetail/data/LNBetSelectionDTO;", "createTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJJILjava/lang/Long;Ljava/lang/String;IILjava/util/List;J)V", "getOrderId", "()Ljava/lang/String;", "getShortId", "getOrderType", "()I", "getTotalStake", "()J", "getTotalWinnings", "getWinningStatus", "getGiftTotalAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "getCombinationSize", "getBetSize", "getSelections", "()Ljava/util/List;", "getCreateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;IJJILjava/lang/Long;Ljava/lang/String;IILjava/util/List;J)Lcom/sportybet/feature/luckynumber/historydetail/data/LNBetOrderDTO;", "equals", "", "other", "hashCode", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNBetOrderDTO {
    public static final int $stable = 8;
    private final int betSize;
    private final int combinationSize;
    private final long createTime;
    private final String currency;
    private final Long giftTotalAmount;
    private final String orderId;
    private final int orderType;
    private final List<LNBetSelectionDTO> selections;
    private final String shortId;
    private final long totalStake;
    private final long totalWinnings;
    private final int winningStatus;

    public LNBetOrderDTO(String str, String str2, int i, long j, long j2, int i2, Long l, String str3, int i3, int i4, List<LNBetSelectionDTO> list, long j3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.orderId = str;
        this.shortId = str2;
        this.orderType = i;
        this.totalStake = j;
        this.totalWinnings = j2;
        this.winningStatus = i2;
        this.giftTotalAmount = l;
        this.currency = str3;
        this.combinationSize = i3;
        this.betSize = i4;
        this.selections = list;
        this.createTime = j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNBetOrderDTO copy$default(LNBetOrderDTO lNBetOrderDTO, String str, String str2, int i, long j, long j2, int i2, Long l, String str3, int i3, int i4, List list, long j3, int i5, Object obj) {
        long j4;
        String str4;
        String str5 = (i5 & 1) != 0 ? lNBetOrderDTO.orderId : str;
        String str6 = (i5 & 2) != 0 ? lNBetOrderDTO.shortId : str2;
        int i6 = (i5 & 4) != 0 ? lNBetOrderDTO.orderType : i;
        long j5 = (i5 & 8) != 0 ? lNBetOrderDTO.totalStake : j;
        long j6 = (i5 & 16) != 0 ? lNBetOrderDTO.totalWinnings : j2;
        int i7 = (i5 & 32) != 0 ? lNBetOrderDTO.winningStatus : i2;
        Long l2 = (i5 & 64) != 0 ? lNBetOrderDTO.giftTotalAmount : l;
        String str7 = (i5 & 128) != 0 ? lNBetOrderDTO.currency : str3;
        int i8 = (i5 & 256) != 0 ? lNBetOrderDTO.combinationSize : i3;
        int i9 = (i5 & 512) != 0 ? lNBetOrderDTO.betSize : i4;
        List list2 = (i5 & 1024) != 0 ? lNBetOrderDTO.selections : list;
        if ((i5 & 2048) != 0) {
            str4 = str5;
            j4 = lNBetOrderDTO.createTime;
        } else {
            j4 = j3;
            str4 = str5;
        }
        return lNBetOrderDTO.copy(str4, str6, i6, j5, j6, i7, l2, str7, i8, i9, list2, j4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getBetSize() {
        return this.betSize;
    }

    public final List<LNBetSelectionDTO> component11() {
        return this.selections;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShortId() {
        return this.shortId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTotalStake() {
        return this.totalStake;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTotalWinnings() {
        return this.totalWinnings;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWinningStatus() {
        return this.winningStatus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getGiftTotalAmount() {
        return this.giftTotalAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getCombinationSize() {
        return this.combinationSize;
    }

    public final LNBetOrderDTO copy(String orderId, String shortId, int orderType, long totalStake, long totalWinnings, int winningStatus, Long giftTotalAmount, String currency, int combinationSize, int betSize, List<LNBetSelectionDTO> selections, long createTime) {
        orderId.getClass();
        shortId.getClass();
        currency.getClass();
        selections.getClass();
        return new LNBetOrderDTO(orderId, shortId, orderType, totalStake, totalWinnings, winningStatus, giftTotalAmount, currency, combinationSize, betSize, selections, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNBetOrderDTO)) {
            return false;
        }
        LNBetOrderDTO lNBetOrderDTO = (LNBetOrderDTO) other;
        return Intrinsics.g(this.orderId, lNBetOrderDTO.orderId) && Intrinsics.g(this.shortId, lNBetOrderDTO.shortId) && this.orderType == lNBetOrderDTO.orderType && this.totalStake == lNBetOrderDTO.totalStake && this.totalWinnings == lNBetOrderDTO.totalWinnings && this.winningStatus == lNBetOrderDTO.winningStatus && Intrinsics.g(this.giftTotalAmount, lNBetOrderDTO.giftTotalAmount) && Intrinsics.g(this.currency, lNBetOrderDTO.currency) && this.combinationSize == lNBetOrderDTO.combinationSize && this.betSize == lNBetOrderDTO.betSize && Intrinsics.g(this.selections, lNBetOrderDTO.selections) && this.createTime == lNBetOrderDTO.createTime;
    }

    public final int getBetSize() {
        return this.betSize;
    }

    public final int getCombinationSize() {
        return this.combinationSize;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Long getGiftTotalAmount() {
        return this.giftTotalAmount;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final int getOrderType() {
        return this.orderType;
    }

    public final List<LNBetSelectionDTO> getSelections() {
        return this.selections;
    }

    public final String getShortId() {
        return this.shortId;
    }

    public final long getTotalStake() {
        return this.totalStake;
    }

    public final long getTotalWinnings() {
        return this.totalWinnings;
    }

    public final int getWinningStatus() {
        return this.winningStatus;
    }

    public int hashCode() {
        int iA = gpp.a(this.winningStatus, f87.a(f87.a(gpp.a(this.orderType, gmf0.a(this.orderId.hashCode() * 31, 31, this.shortId), 31), this.totalStake, 31), this.totalWinnings, 31), 31);
        Long l = this.giftTotalAmount;
        return Long.hashCode(this.createTime) + ai50.a(gpp.a(this.betSize, gpp.a(this.combinationSize, gmf0.a((iA + (l == null ? 0 : l.hashCode())) * 31, 31, this.currency), 31), 31), 31, this.selections);
    }

    public String toString() {
        String str = this.orderId;
        String str2 = this.shortId;
        int i = this.orderType;
        long j = this.totalStake;
        long j2 = this.totalWinnings;
        int i2 = this.winningStatus;
        Long l = this.giftTotalAmount;
        String str3 = this.currency;
        int i3 = this.combinationSize;
        int i4 = this.betSize;
        List<LNBetSelectionDTO> list = this.selections;
        long j3 = this.createTime;
        StringBuilder sbA = ux5.a("LNBetOrderDTO(orderId=", str, ", shortId=", str2, ", orderType=");
        sbA.append(i);
        sbA.append(", totalStake=");
        sbA.append(j);
        g41.a(j2, ", totalWinnings=", ", winningStatus=", sbA);
        sbA.append(i2);
        sbA.append(", giftTotalAmount=");
        sbA.append(l);
        sbA.append(", currency=");
        wxa.b(i3, str3, ", combinationSize=", ", betSize=", sbA);
        sbA.append(i4);
        sbA.append(", selections=");
        sbA.append(list);
        sbA.append(", createTime=");
        return nrz.a(j3, ")", sbA);
    }
}

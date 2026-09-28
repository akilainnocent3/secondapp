package com.sporty.android.core.model.pocket.withdraw.partner;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0016¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/pocket/withdraw/partner/PartnerWithdrawRequest;", "", "payAmount", "Ljava/math/BigDecimal;", "ptnCode", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;)V", "getPayAmount", "()Ljava/math/BigDecimal;", "getPtnCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PartnerWithdrawRequest {
    private final BigDecimal payAmount;
    private final String ptnCode;

    public PartnerWithdrawRequest(BigDecimal bigDecimal, String str) {
        bigDecimal.getClass();
        str.getClass();
        this.payAmount = bigDecimal;
        this.ptnCode = str;
    }

    public static /* synthetic */ PartnerWithdrawRequest copy$default(PartnerWithdrawRequest partnerWithdrawRequest, BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = partnerWithdrawRequest.payAmount;
        }
        if ((i & 2) != 0) {
            str = partnerWithdrawRequest.ptnCode;
        }
        return partnerWithdrawRequest.copy(bigDecimal, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getPayAmount() {
        return this.payAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPtnCode() {
        return this.ptnCode;
    }

    public final PartnerWithdrawRequest copy(BigDecimal payAmount, String ptnCode) {
        payAmount.getClass();
        ptnCode.getClass();
        return new PartnerWithdrawRequest(payAmount, ptnCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerWithdrawRequest)) {
            return false;
        }
        PartnerWithdrawRequest partnerWithdrawRequest = (PartnerWithdrawRequest) other;
        return Intrinsics.g(this.payAmount, partnerWithdrawRequest.payAmount) && Intrinsics.g(this.ptnCode, partnerWithdrawRequest.ptnCode);
    }

    public final BigDecimal getPayAmount() {
        return this.payAmount;
    }

    public final String getPtnCode() {
        return this.ptnCode;
    }

    public int hashCode() {
        return this.ptnCode.hashCode() + (this.payAmount.hashCode() * 31);
    }

    public String toString() {
        return "PartnerWithdrawRequest(payAmount=" + this.payAmount + ", ptnCode=" + this.ptnCode + ")";
    }
}

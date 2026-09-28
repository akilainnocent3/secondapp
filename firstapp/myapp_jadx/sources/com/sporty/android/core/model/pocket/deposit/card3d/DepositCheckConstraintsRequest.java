package com.sporty.android.core.model.pocket.deposit.card3d;

import com.appsflyer.internal.a0;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.hxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003JP\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012Ê\u0001\u0002\b&¨\u0006%"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/card3d/DepositCheckConstraintsRequest;", "", "payChId", "", "payAmount", "", "cardCvv", "", "bankAssetId", "cardNum", "cardExpDate", "<init>", "(IJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getPayChId", "()I", "getPayAmount", "()J", "getCardCvv", "()Ljava/lang/String;", "getBankAssetId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCardNum", "getCardExpDate", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(IJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/sporty/android/core/model/pocket/deposit/card3d/DepositCheckConstraintsRequest;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DepositCheckConstraintsRequest {
    private final Integer bankAssetId;
    private final String cardCvv;
    private final String cardExpDate;
    private final String cardNum;
    private final long payAmount;
    private final int payChId;

    public DepositCheckConstraintsRequest(int i, long j, String str, Integer num, String str2, String str3) {
        str.getClass();
        this.payChId = i;
        this.payAmount = j;
        this.cardCvv = str;
        this.bankAssetId = num;
        this.cardNum = str2;
        this.cardExpDate = str3;
    }

    public static /* synthetic */ DepositCheckConstraintsRequest copy$default(DepositCheckConstraintsRequest depositCheckConstraintsRequest, int i, long j, String str, Integer num, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = depositCheckConstraintsRequest.payChId;
        }
        if ((i2 & 2) != 0) {
            j = depositCheckConstraintsRequest.payAmount;
        }
        if ((i2 & 4) != 0) {
            str = depositCheckConstraintsRequest.cardCvv;
        }
        if ((i2 & 8) != 0) {
            num = depositCheckConstraintsRequest.bankAssetId;
        }
        if ((i2 & 16) != 0) {
            str2 = depositCheckConstraintsRequest.cardNum;
        }
        if ((i2 & 32) != 0) {
            str3 = depositCheckConstraintsRequest.cardExpDate;
        }
        return depositCheckConstraintsRequest.copy(i, j, str, num, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPayChId() {
        return this.payChId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPayAmount() {
        return this.payAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardCvv() {
        return this.cardCvv;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getBankAssetId() {
        return this.bankAssetId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCardNum() {
        return this.cardNum;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCardExpDate() {
        return this.cardExpDate;
    }

    public final DepositCheckConstraintsRequest copy(int payChId, long payAmount, String cardCvv, Integer bankAssetId, String cardNum, String cardExpDate) {
        cardCvv.getClass();
        return new DepositCheckConstraintsRequest(payChId, payAmount, cardCvv, bankAssetId, cardNum, cardExpDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepositCheckConstraintsRequest)) {
            return false;
        }
        DepositCheckConstraintsRequest depositCheckConstraintsRequest = (DepositCheckConstraintsRequest) other;
        return this.payChId == depositCheckConstraintsRequest.payChId && this.payAmount == depositCheckConstraintsRequest.payAmount && Intrinsics.g(this.cardCvv, depositCheckConstraintsRequest.cardCvv) && Intrinsics.g(this.bankAssetId, depositCheckConstraintsRequest.bankAssetId) && Intrinsics.g(this.cardNum, depositCheckConstraintsRequest.cardNum) && Intrinsics.g(this.cardExpDate, depositCheckConstraintsRequest.cardExpDate);
    }

    public final Integer getBankAssetId() {
        return this.bankAssetId;
    }

    public final String getCardCvv() {
        return this.cardCvv;
    }

    public final String getCardExpDate() {
        return this.cardExpDate;
    }

    public final String getCardNum() {
        return this.cardNum;
    }

    public final long getPayAmount() {
        return this.payAmount;
    }

    public final int getPayChId() {
        return this.payChId;
    }

    public int hashCode() {
        int iA = gmf0.a(f87.a(Integer.hashCode(this.payChId) * 31, this.payAmount, 31), 31, this.cardCvv);
        Integer num = this.bankAssetId;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.cardNum;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardExpDate;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = this.payChId;
        long j = this.payAmount;
        String str = this.cardCvv;
        Integer num = this.bankAssetId;
        String str2 = this.cardNum;
        String str3 = this.cardExpDate;
        StringBuilder sbA = a0.a("DepositCheckConstraintsRequest(payChId=", ", payAmount=", i, j);
        sbA.append(", cardCvv=");
        sbA.append(str);
        sbA.append(", bankAssetId=");
        sbA.append(num);
        hxa.c(sbA, ", cardNum=", str2, ", cardExpDate=", str3);
        sbA.append(")");
        return sbA.toString();
    }
}

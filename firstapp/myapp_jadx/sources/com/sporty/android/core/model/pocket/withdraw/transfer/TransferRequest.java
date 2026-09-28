package com.sporty.android.core.model.pocket.withdraw.transfer;

import defpackage.gmf0;
import defpackage.hxa;
import defpackage.uf80;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eÊ\u0001\u0002\b\u001f¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/core/model/pocket/withdraw/transfer/TransferRequest;", "", "payAmount", "Ljava/math/BigDecimal;", "phoneCountryCode", "", "phoneNo", "currency", "withdrawPINCode", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPayAmount", "()Ljava/math/BigDecimal;", "getPhoneCountryCode", "()Ljava/lang/String;", "getPhoneNo", "getCurrency", "getWithdrawPINCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TransferRequest {
    private final String currency;
    private final BigDecimal payAmount;
    private final String phoneCountryCode;
    private final String phoneNo;
    private final String withdrawPINCode;

    public TransferRequest(BigDecimal bigDecimal, String str, String str2, String str3, String str4) {
        bigDecimal.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.payAmount = bigDecimal;
        this.phoneCountryCode = str;
        this.phoneNo = str2;
        this.currency = str3;
        this.withdrawPINCode = str4;
    }

    public static /* synthetic */ TransferRequest copy$default(TransferRequest transferRequest, BigDecimal bigDecimal, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = transferRequest.payAmount;
        }
        if ((i & 2) != 0) {
            str = transferRequest.phoneCountryCode;
        }
        if ((i & 4) != 0) {
            str2 = transferRequest.phoneNo;
        }
        if ((i & 8) != 0) {
            str3 = transferRequest.currency;
        }
        if ((i & 16) != 0) {
            str4 = transferRequest.withdrawPINCode;
        }
        String str5 = str4;
        String str6 = str2;
        return transferRequest.copy(bigDecimal, str, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getPayAmount() {
        return this.payAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhoneNo() {
        return this.phoneNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWithdrawPINCode() {
        return this.withdrawPINCode;
    }

    public final TransferRequest copy(BigDecimal payAmount, String phoneCountryCode, String phoneNo, String currency, String withdrawPINCode) {
        payAmount.getClass();
        phoneCountryCode.getClass();
        phoneNo.getClass();
        currency.getClass();
        return new TransferRequest(payAmount, phoneCountryCode, phoneNo, currency, withdrawPINCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferRequest)) {
            return false;
        }
        TransferRequest transferRequest = (TransferRequest) other;
        return Intrinsics.g(this.payAmount, transferRequest.payAmount) && Intrinsics.g(this.phoneCountryCode, transferRequest.phoneCountryCode) && Intrinsics.g(this.phoneNo, transferRequest.phoneNo) && Intrinsics.g(this.currency, transferRequest.currency) && Intrinsics.g(this.withdrawPINCode, transferRequest.withdrawPINCode);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final BigDecimal getPayAmount() {
        return this.payAmount;
    }

    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public final String getPhoneNo() {
        return this.phoneNo;
    }

    public final String getWithdrawPINCode() {
        return this.withdrawPINCode;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(this.payAmount.hashCode() * 31, 31, this.phoneCountryCode), 31, this.phoneNo), 31, this.currency);
        String str = this.withdrawPINCode;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        BigDecimal bigDecimal = this.payAmount;
        String str = this.phoneCountryCode;
        String str2 = this.phoneNo;
        String str3 = this.currency;
        String str4 = this.withdrawPINCode;
        StringBuilder sb = new StringBuilder("TransferRequest(payAmount=");
        sb.append(bigDecimal);
        sb.append(", phoneCountryCode=");
        sb.append(str);
        sb.append(", phoneNo=");
        hxa.c(sb, str2, ", currency=", str3, ", withdrawPINCode=");
        return uf80.a(sb, str4, ")");
    }

    public /* synthetic */ TransferRequest(BigDecimal bigDecimal, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, str, str2, str3, (i & 16) != 0 ? null : str4);
    }
}

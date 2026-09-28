package com.sporty.android.core.model.pocket.withdraw.otp;

import defpackage.ew7;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nÊ\u0001\u0002\b\u001a¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/pocket/withdraw/otp/CheckBankTradeOtpRequest;", "", "bankCode", "", "bankId", "", "bankAccountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getBankCode", "()Ljava/lang/String;", "getBankId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBankAccountNumber", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sporty/android/core/model/pocket/withdraw/otp/CheckBankTradeOtpRequest;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CheckBankTradeOtpRequest {
    private final String bankAccountNumber;
    private final String bankCode;
    private final Integer bankId;

    public /* synthetic */ CheckBankTradeOtpRequest(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, str2);
    }

    public static /* synthetic */ CheckBankTradeOtpRequest copy$default(CheckBankTradeOtpRequest checkBankTradeOtpRequest, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkBankTradeOtpRequest.bankCode;
        }
        if ((i & 2) != 0) {
            num = checkBankTradeOtpRequest.bankId;
        }
        if ((i & 4) != 0) {
            str2 = checkBankTradeOtpRequest.bankAccountNumber;
        }
        return checkBankTradeOtpRequest.copy(str, num, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBankId() {
        return this.bankId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public final CheckBankTradeOtpRequest copy(String bankCode, Integer bankId, String bankAccountNumber) {
        bankAccountNumber.getClass();
        return new CheckBankTradeOtpRequest(bankCode, bankId, bankAccountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckBankTradeOtpRequest)) {
            return false;
        }
        CheckBankTradeOtpRequest checkBankTradeOtpRequest = (CheckBankTradeOtpRequest) other;
        return Intrinsics.g(this.bankCode, checkBankTradeOtpRequest.bankCode) && Intrinsics.g(this.bankId, checkBankTradeOtpRequest.bankId) && Intrinsics.g(this.bankAccountNumber, checkBankTradeOtpRequest.bankAccountNumber);
    }

    public final String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final Integer getBankId() {
        return this.bankId;
    }

    public int hashCode() {
        String str = this.bankCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.bankId;
        return this.bankAccountNumber.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.bankCode;
        Integer num = this.bankId;
        return uf80.a(ew7.a(num, "CheckBankTradeOtpRequest(bankCode=", str, ", bankId=", ", bankAccountNumber="), this.bankAccountNumber, ")");
    }

    public CheckBankTradeOtpRequest(String str, Integer num, String str2) {
        str2.getClass();
        this.bankCode = str;
        this.bankId = num;
        this.bankAccountNumber = str2;
    }
}

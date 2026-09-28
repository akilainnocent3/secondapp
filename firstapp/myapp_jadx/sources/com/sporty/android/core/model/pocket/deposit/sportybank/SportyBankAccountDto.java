package com.sporty.android.core.model.pocket.deposit.sportybank;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.em5;
import defpackage.f87;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.pr0;
import defpackage.q6a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jy\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u00100\u001a\u00020\"2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00102\u001a\u00020\bHÖ\u0081\u0004J\n\u00103\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R'\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b!\u0010#R\u0011\u0010$\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b$\u0010#Ê\u0001\u0002\b5¨\u00064"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/SportyBankAccountDto;", "", AnalyticsParam.EVENT_PARAM_ID, "", "createTime", "accountNumber", "", AnalyticsParam.EVENT_STATUS, "", "bankId", "bankCode", "bankName", "bankIconUrl", "userFirstName", "userLastName", "<init>", "(JJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getCreateTime", "getAccountNumber", "()Ljava/lang/String;", "getStatus", "()I", "getBankId", "getBankCode", "getBankName", "getBankIconUrl", "Lcom/google/gson/annotations/SerializedName;", "value", "bankIcon", "getUserFirstName", "getUserLastName", "isActive", "", "()Z", "isWaiting", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportyBankAccountDto {
    private final String accountNumber;
    private final String bankCode;

    @SerializedName("bankIcon")
    private final String bankIconUrl;
    private final int bankId;
    private final String bankName;
    private final long createTime;
    private final long id;
    private final int status;
    private final String userFirstName;
    private final String userLastName;

    public SportyBankAccountDto(long j, long j2, String str, int i, int i2, String str2, String str3, String str4, String str5, String str6) {
        this.id = j;
        this.createTime = j2;
        this.accountNumber = str;
        this.status = i;
        this.bankId = i2;
        this.bankCode = str2;
        this.bankName = str3;
        this.bankIconUrl = str4;
        this.userFirstName = str5;
        this.userLastName = str6;
    }

    public static /* synthetic */ SportyBankAccountDto copy$default(SportyBankAccountDto sportyBankAccountDto, long j, long j2, String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = sportyBankAccountDto.id;
        }
        return sportyBankAccountDto.copy(j, (i3 & 2) != 0 ? sportyBankAccountDto.createTime : j2, (i3 & 4) != 0 ? sportyBankAccountDto.accountNumber : str, (i3 & 8) != 0 ? sportyBankAccountDto.status : i, (i3 & 16) != 0 ? sportyBankAccountDto.bankId : i2, (i3 & 32) != 0 ? sportyBankAccountDto.bankCode : str2, (i3 & 64) != 0 ? sportyBankAccountDto.bankName : str3, (i3 & 128) != 0 ? sportyBankAccountDto.bankIconUrl : str4, (i3 & 256) != 0 ? sportyBankAccountDto.userFirstName : str5, (i3 & 512) != 0 ? sportyBankAccountDto.userLastName : str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUserLastName() {
        return this.userLastName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBankId() {
        return this.bankId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBankIconUrl() {
        return this.bankIconUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUserFirstName() {
        return this.userFirstName;
    }

    public final SportyBankAccountDto copy(long id, long createTime, String accountNumber, int status, int bankId, String bankCode, String bankName, String bankIconUrl, String userFirstName, String userLastName) {
        return new SportyBankAccountDto(id, createTime, accountNumber, status, bankId, bankCode, bankName, bankIconUrl, userFirstName, userLastName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportyBankAccountDto)) {
            return false;
        }
        SportyBankAccountDto sportyBankAccountDto = (SportyBankAccountDto) other;
        return this.id == sportyBankAccountDto.id && this.createTime == sportyBankAccountDto.createTime && Intrinsics.g(this.accountNumber, sportyBankAccountDto.accountNumber) && this.status == sportyBankAccountDto.status && this.bankId == sportyBankAccountDto.bankId && Intrinsics.g(this.bankCode, sportyBankAccountDto.bankCode) && Intrinsics.g(this.bankName, sportyBankAccountDto.bankName) && Intrinsics.g(this.bankIconUrl, sportyBankAccountDto.bankIconUrl) && Intrinsics.g(this.userFirstName, sportyBankAccountDto.userFirstName) && Intrinsics.g(this.userLastName, sportyBankAccountDto.userLastName);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final String getBankIconUrl() {
        return this.bankIconUrl;
    }

    public final int getBankId() {
        return this.bankId;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getId() {
        return this.id;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getUserFirstName() {
        return this.userFirstName;
    }

    public final String getUserLastName() {
        return this.userLastName;
    }

    public int hashCode() {
        int iA = f87.a(Long.hashCode(this.id) * 31, this.createTime, 31);
        String str = this.accountNumber;
        int iA2 = gpp.a(this.bankId, gpp.a(this.status, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.bankCode;
        int iHashCode = (iA2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bankName;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bankIconUrl;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userFirstName;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.userLastName;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean isActive() {
        return this.status == SportyBankAccountStatus.ACTIVE.getIntValue();
    }

    public final boolean isWaiting() {
        return this.status == SportyBankAccountStatus.WAITING.getIntValue();
    }

    public String toString() {
        long j = this.id;
        long j2 = this.createTime;
        String str = this.accountNumber;
        int i = this.status;
        int i2 = this.bankId;
        String str2 = this.bankCode;
        String str3 = this.bankName;
        String str4 = this.bankIconUrl;
        String str5 = this.userFirstName;
        String str6 = this.userLastName;
        StringBuilder sbA = q6a0.a(j, "SportyBankAccountDto(id=", ", createTime=");
        em5.a(j2, ", accountNumber=", str, sbA);
        sbA.append(", status=");
        sbA.append(i);
        sbA.append(oAudzpbdOhCI.NrboLY);
        sbA.append(i2);
        hxa.c(sbA, ", bankCode=", str2, ", bankName=", str3);
        hxa.c(sbA, ", bankIconUrl=", str4, ", userFirstName=", str5);
        return pr0.a(sbA, ", userLastName=", str6, ")");
    }
}

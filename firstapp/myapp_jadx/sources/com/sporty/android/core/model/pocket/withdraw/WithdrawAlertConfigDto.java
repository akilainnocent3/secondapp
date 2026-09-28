package com.sporty.android.core.model.pocket.withdraw;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\bHÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\u0002\b\u001f¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/core/model/pocket/withdraw/WithdrawAlertConfigDto;", "", "payChannelId", "", "displayAlert", "", "displayCreditDelaysHint", "alertContent", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getPayChannelId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDisplayAlert", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisplayCreditDelaysHint", "getAlertContent", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/sporty/android/core/model/pocket/withdraw/WithdrawAlertConfigDto;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WithdrawAlertConfigDto {
    private final String alertContent;
    private final Boolean displayAlert;
    private final Boolean displayCreditDelaysHint;
    private final Integer payChannelId;

    public WithdrawAlertConfigDto(Integer num, Boolean bool, Boolean bool2, String str) {
        this.payChannelId = num;
        this.displayAlert = bool;
        this.displayCreditDelaysHint = bool2;
        this.alertContent = str;
    }

    public static /* synthetic */ WithdrawAlertConfigDto copy$default(WithdrawAlertConfigDto withdrawAlertConfigDto, Integer num, Boolean bool, Boolean bool2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = withdrawAlertConfigDto.payChannelId;
        }
        if ((i & 2) != 0) {
            bool = withdrawAlertConfigDto.displayAlert;
        }
        if ((i & 4) != 0) {
            bool2 = withdrawAlertConfigDto.displayCreditDelaysHint;
        }
        if ((i & 8) != 0) {
            str = withdrawAlertConfigDto.alertContent;
        }
        return withdrawAlertConfigDto.copy(num, bool, bool2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getPayChannelId() {
        return this.payChannelId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getDisplayAlert() {
        return this.displayAlert;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getDisplayCreditDelaysHint() {
        return this.displayCreditDelaysHint;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAlertContent() {
        return this.alertContent;
    }

    public final WithdrawAlertConfigDto copy(Integer payChannelId, Boolean displayAlert, Boolean displayCreditDelaysHint, String alertContent) {
        return new WithdrawAlertConfigDto(payChannelId, displayAlert, displayCreditDelaysHint, alertContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawAlertConfigDto)) {
            return false;
        }
        WithdrawAlertConfigDto withdrawAlertConfigDto = (WithdrawAlertConfigDto) other;
        return Intrinsics.g(this.payChannelId, withdrawAlertConfigDto.payChannelId) && Intrinsics.g(this.displayAlert, withdrawAlertConfigDto.displayAlert) && Intrinsics.g(this.displayCreditDelaysHint, withdrawAlertConfigDto.displayCreditDelaysHint) && Intrinsics.g(this.alertContent, withdrawAlertConfigDto.alertContent);
    }

    public final String getAlertContent() {
        return this.alertContent;
    }

    public final Boolean getDisplayAlert() {
        return this.displayAlert;
    }

    public final Boolean getDisplayCreditDelaysHint() {
        return this.displayCreditDelaysHint;
    }

    public final Integer getPayChannelId() {
        return this.payChannelId;
    }

    public int hashCode() {
        Integer num = this.payChannelId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.displayAlert;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.displayCreditDelaysHint;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.alertContent;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "WithdrawAlertConfigDto(payChannelId=" + this.payChannelId + ", displayAlert=" + this.displayAlert + ", displayCreditDelaysHint=" + this.displayCreditDelaysHint + ", alertContent=" + this.alertContent + ")";
    }
}

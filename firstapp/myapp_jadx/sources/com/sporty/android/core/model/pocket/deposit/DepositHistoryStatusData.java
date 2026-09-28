package com.sporty.android.core.model.pocket.deposit;

import defpackage.gpp;
import defpackage.rg2;
import defpackage.uqe0;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015JF\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/DepositHistoryStatusData;", "", "state", "", "phoneNo", "", "payCh", "payRecordStatus", "editable", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;)V", "getState", "()I", "setState", "(I)V", "getPhoneNo", "()Ljava/lang/String;", "getPayCh", "getPayRecordStatus", "getEditable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;)Lcom/sporty/android/core/model/pocket/deposit/DepositHistoryStatusData;", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DepositHistoryStatusData {
    private final Boolean editable;
    private final String payCh;
    private final int payRecordStatus;
    private final String phoneNo;
    private int state;

    public DepositHistoryStatusData(int i, String str, String str2, int i2, Boolean bool) {
        this.state = i;
        this.phoneNo = str;
        this.payCh = str2;
        this.payRecordStatus = i2;
        this.editable = bool;
    }

    public static /* synthetic */ DepositHistoryStatusData copy$default(DepositHistoryStatusData depositHistoryStatusData, int i, String str, String str2, int i2, Boolean bool, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = depositHistoryStatusData.state;
        }
        if ((i3 & 2) != 0) {
            str = depositHistoryStatusData.phoneNo;
        }
        if ((i3 & 4) != 0) {
            str2 = depositHistoryStatusData.payCh;
        }
        if ((i3 & 8) != 0) {
            i2 = depositHistoryStatusData.payRecordStatus;
        }
        if ((i3 & 16) != 0) {
            bool = depositHistoryStatusData.editable;
        }
        Boolean bool2 = bool;
        String str3 = str2;
        return depositHistoryStatusData.copy(i, str, str3, i2, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhoneNo() {
        return this.phoneNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPayCh() {
        return this.payCh;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPayRecordStatus() {
        return this.payRecordStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getEditable() {
        return this.editable;
    }

    public final DepositHistoryStatusData copy(int state, String phoneNo, String payCh, int payRecordStatus, Boolean editable) {
        return new DepositHistoryStatusData(state, phoneNo, payCh, payRecordStatus, editable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepositHistoryStatusData)) {
            return false;
        }
        DepositHistoryStatusData depositHistoryStatusData = (DepositHistoryStatusData) other;
        return this.state == depositHistoryStatusData.state && Intrinsics.g(this.phoneNo, depositHistoryStatusData.phoneNo) && Intrinsics.g(this.payCh, depositHistoryStatusData.payCh) && this.payRecordStatus == depositHistoryStatusData.payRecordStatus && Intrinsics.g(this.editable, depositHistoryStatusData.editable);
    }

    public final Boolean getEditable() {
        return this.editable;
    }

    public final String getPayCh() {
        return this.payCh;
    }

    public final int getPayRecordStatus() {
        return this.payRecordStatus;
    }

    public final String getPhoneNo() {
        return this.phoneNo;
    }

    public final int getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.state) * 31;
        String str = this.phoneNo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.payCh;
        int iA = gpp.a(this.payRecordStatus, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Boolean bool = this.editable;
        return iA + (bool != null ? bool.hashCode() : 0);
    }

    public final void setState(int i) {
        this.state = i;
    }

    public String toString() {
        int i = this.state;
        String str = this.phoneNo;
        String str2 = this.payCh;
        int i2 = this.payRecordStatus;
        Boolean bool = this.editable;
        StringBuilder sbA = uqe0.a(i, "DepositHistoryStatusData(state=", ", phoneNo=", str, ", payCh=");
        wxa.b(i2, str2, ", payRecordStatus=", ", editable=", sbA);
        return rg2.a(sbA, bool, ")");
    }
}

package com.sporty.android.core.model.primaryphone;

import defpackage.t160;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fÊ\u0001\u0002\b\u0018¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/primaryphone/UpdatePrimaryPhoneNumberResult;", "", "depositPhone", "", "token", "", "validTime", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "getDepositPhone", "()Z", "getToken", "()Ljava/lang/String;", "getValidTime", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UpdatePrimaryPhoneNumberResult {
    private final boolean depositPhone;
    private final String token;
    private final String validTime;

    public /* synthetic */ UpdatePrimaryPhoneNumberResult(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    public static /* synthetic */ UpdatePrimaryPhoneNumberResult copy$default(UpdatePrimaryPhoneNumberResult updatePrimaryPhoneNumberResult, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = updatePrimaryPhoneNumberResult.depositPhone;
        }
        if ((i & 2) != 0) {
            str = updatePrimaryPhoneNumberResult.token;
        }
        if ((i & 4) != 0) {
            str2 = updatePrimaryPhoneNumberResult.validTime;
        }
        return updatePrimaryPhoneNumberResult.copy(z, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDepositPhone() {
        return this.depositPhone;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValidTime() {
        return this.validTime;
    }

    public final UpdatePrimaryPhoneNumberResult copy(boolean depositPhone, String token, String validTime) {
        return new UpdatePrimaryPhoneNumberResult(depositPhone, token, validTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePrimaryPhoneNumberResult)) {
            return false;
        }
        UpdatePrimaryPhoneNumberResult updatePrimaryPhoneNumberResult = (UpdatePrimaryPhoneNumberResult) other;
        return this.depositPhone == updatePrimaryPhoneNumberResult.depositPhone && Intrinsics.g(this.token, updatePrimaryPhoneNumberResult.token) && Intrinsics.g(this.validTime, updatePrimaryPhoneNumberResult.validTime);
    }

    public final boolean getDepositPhone() {
        return this.depositPhone;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getValidTime() {
        return this.validTime;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.depositPhone) * 31;
        String str = this.token;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.validTime;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.depositPhone;
        String str = this.token;
        return uf80.a(t160.a("UpdatePrimaryPhoneNumberResult(depositPhone=", ", token=", str, ", validTime=", z), this.validTime, ")");
    }

    public UpdatePrimaryPhoneNumberResult(boolean z, String str, String str2) {
        this.depositPhone = z;
        this.token = str;
        this.validTime = str2;
    }

    public UpdatePrimaryPhoneNumberResult() {
        this(false, null, null, 7, null);
    }
}

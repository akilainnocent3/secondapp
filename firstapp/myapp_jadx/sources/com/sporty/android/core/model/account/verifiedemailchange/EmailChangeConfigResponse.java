package com.sporty.android.core.model.account.verifiedemailchange;

import defpackage.mq0;
import defpackage.mtg0;
import defpackage.nng;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/core/model/account/verifiedemailchange/EmailChangeConfigResponse;", "", "allowUpdateXTimesPerYear", "", "mainSwitchEnabled", "", "otpRequestEnabled", "passwordRequestEnabled", "sportyPinRequestEnabled", "<init>", "(IZZZZ)V", "getAllowUpdateXTimesPerYear", "()I", "getMainSwitchEnabled", "()Z", "getOtpRequestEnabled", "getPasswordRequestEnabled", "getSportyPinRequestEnabled", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EmailChangeConfigResponse {
    private final int allowUpdateXTimesPerYear;
    private final boolean mainSwitchEnabled;
    private final boolean otpRequestEnabled;
    private final boolean passwordRequestEnabled;
    private final boolean sportyPinRequestEnabled;

    public /* synthetic */ EmailChangeConfigResponse(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4);
    }

    public static /* synthetic */ EmailChangeConfigResponse copy$default(EmailChangeConfigResponse emailChangeConfigResponse, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = emailChangeConfigResponse.allowUpdateXTimesPerYear;
        }
        if ((i2 & 2) != 0) {
            z = emailChangeConfigResponse.mainSwitchEnabled;
        }
        if ((i2 & 4) != 0) {
            z2 = emailChangeConfigResponse.otpRequestEnabled;
        }
        if ((i2 & 8) != 0) {
            z3 = emailChangeConfigResponse.passwordRequestEnabled;
        }
        if ((i2 & 16) != 0) {
            z4 = emailChangeConfigResponse.sportyPinRequestEnabled;
        }
        boolean z5 = z4;
        boolean z6 = z2;
        return emailChangeConfigResponse.copy(i, z, z6, z3, z5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAllowUpdateXTimesPerYear() {
        return this.allowUpdateXTimesPerYear;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getMainSwitchEnabled() {
        return this.mainSwitchEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getOtpRequestEnabled() {
        return this.otpRequestEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getPasswordRequestEnabled() {
        return this.passwordRequestEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSportyPinRequestEnabled() {
        return this.sportyPinRequestEnabled;
    }

    public final EmailChangeConfigResponse copy(int allowUpdateXTimesPerYear, boolean mainSwitchEnabled, boolean otpRequestEnabled, boolean passwordRequestEnabled, boolean sportyPinRequestEnabled) {
        return new EmailChangeConfigResponse(allowUpdateXTimesPerYear, mainSwitchEnabled, otpRequestEnabled, passwordRequestEnabled, sportyPinRequestEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailChangeConfigResponse)) {
            return false;
        }
        EmailChangeConfigResponse emailChangeConfigResponse = (EmailChangeConfigResponse) other;
        return this.allowUpdateXTimesPerYear == emailChangeConfigResponse.allowUpdateXTimesPerYear && this.mainSwitchEnabled == emailChangeConfigResponse.mainSwitchEnabled && this.otpRequestEnabled == emailChangeConfigResponse.otpRequestEnabled && this.passwordRequestEnabled == emailChangeConfigResponse.passwordRequestEnabled && this.sportyPinRequestEnabled == emailChangeConfigResponse.sportyPinRequestEnabled;
    }

    public final int getAllowUpdateXTimesPerYear() {
        return this.allowUpdateXTimesPerYear;
    }

    public final boolean getMainSwitchEnabled() {
        return this.mainSwitchEnabled;
    }

    public final boolean getOtpRequestEnabled() {
        return this.otpRequestEnabled;
    }

    public final boolean getPasswordRequestEnabled() {
        return this.passwordRequestEnabled;
    }

    public final boolean getSportyPinRequestEnabled() {
        return this.sportyPinRequestEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.sportyPinRequestEnabled) + mtg0.a(mtg0.a(mtg0.a(Integer.hashCode(this.allowUpdateXTimesPerYear) * 31, 31, this.mainSwitchEnabled), 31, this.otpRequestEnabled), 31, this.passwordRequestEnabled);
    }

    public String toString() {
        int i = this.allowUpdateXTimesPerYear;
        boolean z = this.mainSwitchEnabled;
        boolean z2 = this.otpRequestEnabled;
        boolean z3 = this.passwordRequestEnabled;
        boolean z4 = this.sportyPinRequestEnabled;
        StringBuilder sb = new StringBuilder("EmailChangeConfigResponse(allowUpdateXTimesPerYear=");
        sb.append(i);
        sb.append(", mainSwitchEnabled=");
        sb.append(z);
        sb.append(", otpRequestEnabled=");
        nng.a(", passwordRequestEnabled=", ", sportyPinRequestEnabled=", sb, z2, z3);
        return mq0.a(sb, z4, ")");
    }

    public EmailChangeConfigResponse(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.allowUpdateXTimesPerYear = i;
        this.mainSwitchEnabled = z;
        this.otpRequestEnabled = z2;
        this.passwordRequestEnabled = z3;
        this.sportyPinRequestEnabled = z4;
    }

    public EmailChangeConfigResponse() {
        this(0, false, false, false, false, 31, null);
    }
}

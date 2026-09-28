package com.sporty.android.core.model.security.otp;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gmf0;
import defpackage.mq0;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fÊ\u0001\u0002\b\u001e¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/core/model/security/otp/TradingOTPResult;", "Landroid/os/Parcelable;", "otpToken", "", "otpCode", "isTrustedDevice", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getOtpToken", "()Ljava/lang/String;", "getOtpCode", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TradingOTPResult implements Parcelable {
    public static final Parcelable.Creator<TradingOTPResult> CREATOR = new Creator();
    private final boolean isTrustedDevice;
    private final String otpCode;
    private final String otpToken;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TradingOTPResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradingOTPResult createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new TradingOTPResult(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradingOTPResult[] newArray(int i) {
            return new TradingOTPResult[i];
        }
    }

    public TradingOTPResult(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.otpToken = str;
        this.otpCode = str2;
        this.isTrustedDevice = z;
    }

    public static /* synthetic */ TradingOTPResult copy$default(TradingOTPResult tradingOTPResult, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradingOTPResult.otpToken;
        }
        if ((i & 2) != 0) {
            str2 = tradingOTPResult.otpCode;
        }
        if ((i & 4) != 0) {
            z = tradingOTPResult.isTrustedDevice;
        }
        return tradingOTPResult.copy(str, str2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOtpToken() {
        return this.otpToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOtpCode() {
        return this.otpCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsTrustedDevice() {
        return this.isTrustedDevice;
    }

    public final TradingOTPResult copy(String otpToken, String otpCode, boolean isTrustedDevice) {
        otpToken.getClass();
        otpCode.getClass();
        return new TradingOTPResult(otpToken, otpCode, isTrustedDevice);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradingOTPResult)) {
            return false;
        }
        TradingOTPResult tradingOTPResult = (TradingOTPResult) other;
        return Intrinsics.g(this.otpToken, tradingOTPResult.otpToken) && Intrinsics.g(this.otpCode, tradingOTPResult.otpCode) && this.isTrustedDevice == tradingOTPResult.isTrustedDevice;
    }

    public final String getOtpCode() {
        return this.otpCode;
    }

    public final String getOtpToken() {
        return this.otpToken;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isTrustedDevice) + gmf0.a(this.otpToken.hashCode() * 31, 31, this.otpCode);
    }

    public final boolean isTrustedDevice() {
        return this.isTrustedDevice;
    }

    public String toString() {
        String str = this.otpToken;
        String str2 = this.otpCode;
        return mq0.a(ux5.a("TradingOTPResult(otpToken=", str, ", otpCode=", str2, ", isTrustedDevice="), this.isTrustedDevice, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.otpToken);
        dest.writeString(this.otpCode);
        dest.writeInt(this.isTrustedDevice ? 1 : 0);
    }

    public /* synthetic */ TradingOTPResult(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }
}

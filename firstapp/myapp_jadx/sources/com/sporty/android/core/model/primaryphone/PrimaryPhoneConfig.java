package com.sporty.android.core.model.primaryphone;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cwz;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.ijg0;
import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0007HÆ\u0001J\u0006\u0010)\u001a\u00020\u0007J\u0014\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0083\u0004J\n\u0010-\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010.\u001a\u00020\rHÖ\u0081\u0004J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016Ê\u0001\u0002\b5Ê\u0001\u0002\b6¨\u00064"}, d2 = {"Lcom/sporty/android/core/model/primaryphone/PrimaryPhoneConfig;", "Landroid/os/Parcelable;", "authenticationEnabled", "", "functionEnabled", "nameMatchCheckEnabled", "oldPhoneRegisteredMonths", "", "otpNewPhoneEnabled", "otpNewPhoneWrongThreshold", "otpOldPhoneEnabled", "otpOldPhoneWrongThreshold", "withdrawLimitAmount", "", "withdrawLimitDays", "<init>", "(ZZZIZIZILjava/lang/String;I)V", "getAuthenticationEnabled", "()Z", "getFunctionEnabled", "getNameMatchCheckEnabled", "getOldPhoneRegisteredMonths", "()I", "getOtpNewPhoneEnabled", "getOtpNewPhoneWrongThreshold", "getOtpOldPhoneEnabled", "getOtpOldPhoneWrongThreshold", "getWithdrawLimitAmount", "()Ljava/lang/String;", "getWithdrawLimitDays", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Landroidx/annotation/Keep;", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PrimaryPhoneConfig implements Parcelable {
    public static final Parcelable.Creator<PrimaryPhoneConfig> CREATOR = new Creator();
    private final boolean authenticationEnabled;
    private final boolean functionEnabled;
    private final boolean nameMatchCheckEnabled;
    private final int oldPhoneRegisteredMonths;
    private final boolean otpNewPhoneEnabled;
    private final int otpNewPhoneWrongThreshold;
    private final boolean otpOldPhoneEnabled;
    private final int otpOldPhoneWrongThreshold;
    private final String withdrawLimitAmount;
    private final int withdrawLimitDays;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PrimaryPhoneConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrimaryPhoneConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            parcel.getClass();
            boolean z3 = false;
            boolean z4 = true;
            if (parcel.readInt() != 0) {
                z3 = true;
            }
            if (parcel.readInt() == 0) {
                z4 = z3;
            }
            if (parcel.readInt() == 0) {
                z4 = z3;
            }
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
                z2 = true;
            } else {
                z = z4;
                z2 = z3;
            }
            return new PrimaryPhoneConfig(z3, z4, z4, i, z2, parcel.readInt(), parcel.readInt() != 0 ? z : false, parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrimaryPhoneConfig[] newArray(int i) {
            return new PrimaryPhoneConfig[i];
        }
    }

    public /* synthetic */ PrimaryPhoneConfig(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, int i3, String str, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? true : z, (i5 & 2) != 0 ? true : z2, (i5 & 4) != 0 ? true : z3, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? true : z4, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? true : z5, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) != 0 ? "" : str, (i5 & 512) != 0 ? 0 : i4);
    }

    public static /* synthetic */ PrimaryPhoneConfig copy$default(PrimaryPhoneConfig primaryPhoneConfig, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, int i3, String str, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z = primaryPhoneConfig.authenticationEnabled;
        }
        if ((i5 & 2) != 0) {
            z2 = primaryPhoneConfig.functionEnabled;
        }
        if ((i5 & 4) != 0) {
            z3 = primaryPhoneConfig.nameMatchCheckEnabled;
        }
        if ((i5 & 8) != 0) {
            i = primaryPhoneConfig.oldPhoneRegisteredMonths;
        }
        if ((i5 & 16) != 0) {
            z4 = primaryPhoneConfig.otpNewPhoneEnabled;
        }
        if ((i5 & 32) != 0) {
            i2 = primaryPhoneConfig.otpNewPhoneWrongThreshold;
        }
        if ((i5 & 64) != 0) {
            z5 = primaryPhoneConfig.otpOldPhoneEnabled;
        }
        if ((i5 & 128) != 0) {
            i3 = primaryPhoneConfig.otpOldPhoneWrongThreshold;
        }
        if ((i5 & 256) != 0) {
            str = primaryPhoneConfig.withdrawLimitAmount;
        }
        if ((i5 & 512) != 0) {
            i4 = primaryPhoneConfig.withdrawLimitDays;
        }
        String str2 = str;
        int i6 = i4;
        boolean z6 = z5;
        int i7 = i3;
        boolean z7 = z4;
        int i8 = i2;
        return primaryPhoneConfig.copy(z, z2, z3, i, z7, i8, z6, i7, str2, i6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAuthenticationEnabled() {
        return this.authenticationEnabled;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getWithdrawLimitDays() {
        return this.withdrawLimitDays;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getFunctionEnabled() {
        return this.functionEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getNameMatchCheckEnabled() {
        return this.nameMatchCheckEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOldPhoneRegisteredMonths() {
        return this.oldPhoneRegisteredMonths;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getOtpNewPhoneEnabled() {
        return this.otpNewPhoneEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOtpNewPhoneWrongThreshold() {
        return this.otpNewPhoneWrongThreshold;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getOtpOldPhoneEnabled() {
        return this.otpOldPhoneEnabled;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getOtpOldPhoneWrongThreshold() {
        return this.otpOldPhoneWrongThreshold;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getWithdrawLimitAmount() {
        return this.withdrawLimitAmount;
    }

    public final PrimaryPhoneConfig copy(boolean authenticationEnabled, boolean functionEnabled, boolean nameMatchCheckEnabled, int oldPhoneRegisteredMonths, boolean otpNewPhoneEnabled, int otpNewPhoneWrongThreshold, boolean otpOldPhoneEnabled, int otpOldPhoneWrongThreshold, String withdrawLimitAmount, int withdrawLimitDays) {
        withdrawLimitAmount.getClass();
        return new PrimaryPhoneConfig(authenticationEnabled, functionEnabled, nameMatchCheckEnabled, oldPhoneRegisteredMonths, otpNewPhoneEnabled, otpNewPhoneWrongThreshold, otpOldPhoneEnabled, otpOldPhoneWrongThreshold, withdrawLimitAmount, withdrawLimitDays);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryPhoneConfig)) {
            return false;
        }
        PrimaryPhoneConfig primaryPhoneConfig = (PrimaryPhoneConfig) other;
        return this.authenticationEnabled == primaryPhoneConfig.authenticationEnabled && this.functionEnabled == primaryPhoneConfig.functionEnabled && this.nameMatchCheckEnabled == primaryPhoneConfig.nameMatchCheckEnabled && this.oldPhoneRegisteredMonths == primaryPhoneConfig.oldPhoneRegisteredMonths && this.otpNewPhoneEnabled == primaryPhoneConfig.otpNewPhoneEnabled && this.otpNewPhoneWrongThreshold == primaryPhoneConfig.otpNewPhoneWrongThreshold && this.otpOldPhoneEnabled == primaryPhoneConfig.otpOldPhoneEnabled && this.otpOldPhoneWrongThreshold == primaryPhoneConfig.otpOldPhoneWrongThreshold && Intrinsics.g(this.withdrawLimitAmount, primaryPhoneConfig.withdrawLimitAmount) && this.withdrawLimitDays == primaryPhoneConfig.withdrawLimitDays;
    }

    public final boolean getAuthenticationEnabled() {
        return this.authenticationEnabled;
    }

    public final boolean getFunctionEnabled() {
        return this.functionEnabled;
    }

    public final boolean getNameMatchCheckEnabled() {
        return this.nameMatchCheckEnabled;
    }

    public final int getOldPhoneRegisteredMonths() {
        return this.oldPhoneRegisteredMonths;
    }

    public final boolean getOtpNewPhoneEnabled() {
        return this.otpNewPhoneEnabled;
    }

    public final int getOtpNewPhoneWrongThreshold() {
        return this.otpNewPhoneWrongThreshold;
    }

    public final boolean getOtpOldPhoneEnabled() {
        return this.otpOldPhoneEnabled;
    }

    public final int getOtpOldPhoneWrongThreshold() {
        return this.otpOldPhoneWrongThreshold;
    }

    public final String getWithdrawLimitAmount() {
        return this.withdrawLimitAmount;
    }

    public final int getWithdrawLimitDays() {
        return this.withdrawLimitDays;
    }

    public int hashCode() {
        return Integer.hashCode(this.withdrawLimitDays) + gmf0.a(gpp.a(this.otpOldPhoneWrongThreshold, mtg0.a(gpp.a(this.otpNewPhoneWrongThreshold, mtg0.a(gpp.a(this.oldPhoneRegisteredMonths, mtg0.a(mtg0.a(Boolean.hashCode(this.authenticationEnabled) * 31, 31, this.functionEnabled), 31, this.nameMatchCheckEnabled), 31), 31, this.otpNewPhoneEnabled), 31), 31, this.otpOldPhoneEnabled), 31), 31, this.withdrawLimitAmount);
    }

    public String toString() {
        boolean z = this.authenticationEnabled;
        boolean z2 = this.functionEnabled;
        boolean z3 = this.nameMatchCheckEnabled;
        int i = this.oldPhoneRegisteredMonths;
        boolean z4 = this.otpNewPhoneEnabled;
        int i2 = this.otpNewPhoneWrongThreshold;
        boolean z5 = this.otpOldPhoneEnabled;
        int i3 = this.otpOldPhoneWrongThreshold;
        String str = this.withdrawLimitAmount;
        int i4 = this.withdrawLimitDays;
        StringBuilder sbA = cwz.a("PrimaryPhoneConfig(authenticationEnabled=", ", functionEnabled=", ", nameMatchCheckEnabled=", z, z2);
        sbA.append(z3);
        sbA.append(", oldPhoneRegisteredMonths=");
        sbA.append(i);
        sbA.append(", otpNewPhoneEnabled=");
        sbA.append(z4);
        sbA.append(", otpNewPhoneWrongThreshold=");
        sbA.append(i2);
        sbA.append(", otpOldPhoneEnabled=");
        sbA.append(z5);
        sbA.append(", otpOldPhoneWrongThreshold=");
        sbA.append(i3);
        sbA.append(", withdrawLimitAmount=");
        return ijg0.a(i4, str, ", withdrawLimitDays=", ")", sbA);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.authenticationEnabled ? 1 : 0);
        dest.writeInt(this.functionEnabled ? 1 : 0);
        dest.writeInt(this.nameMatchCheckEnabled ? 1 : 0);
        dest.writeInt(this.oldPhoneRegisteredMonths);
        dest.writeInt(this.otpNewPhoneEnabled ? 1 : 0);
        dest.writeInt(this.otpNewPhoneWrongThreshold);
        dest.writeInt(this.otpOldPhoneEnabled ? 1 : 0);
        dest.writeInt(this.otpOldPhoneWrongThreshold);
        dest.writeString(this.withdrawLimitAmount);
        dest.writeInt(this.withdrawLimitDays);
    }

    public PrimaryPhoneConfig(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, int i3, String str, int i4) {
        str.getClass();
        this.authenticationEnabled = z;
        this.functionEnabled = z2;
        this.nameMatchCheckEnabled = z3;
        this.oldPhoneRegisteredMonths = i;
        this.otpNewPhoneEnabled = z4;
        this.otpNewPhoneWrongThreshold = i2;
        this.otpOldPhoneEnabled = z5;
        this.otpOldPhoneWrongThreshold = i3;
        this.withdrawLimitAmount = str;
        this.withdrawLimitDays = i4;
    }

    public PrimaryPhoneConfig() {
        this(false, false, false, 0, false, 0, false, 0, null, 0, 1023, null);
    }
}

package com.sporty.android.core.model.kyc.phonemigration;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cwz;
import defpackage.lng;
import defpackage.mtg0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\u0002\b!¨\u0006 "}, d2 = {"Lcom/sporty/android/core/model/kyc/phonemigration/PhoneMigrateConfigResponse;", "Landroid/os/Parcelable;", "enabled", "", "nameMatchingEnabled", "otpForMainAccountEnabled", "otpForSubsidiaryAccountEnabled", "<init>", "(ZZZZ)V", "getEnabled", "()Z", "getNameMatchingEnabled", "getOtpForMainAccountEnabled", "getOtpForSubsidiaryAccountEnabled", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PhoneMigrateConfigResponse implements Parcelable {
    public static final Parcelable.Creator<PhoneMigrateConfigResponse> CREATOR = new Creator();
    private final boolean enabled;
    private final boolean nameMatchingEnabled;
    private final boolean otpForMainAccountEnabled;
    private final boolean otpForSubsidiaryAccountEnabled;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PhoneMigrateConfigResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneMigrateConfigResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PhoneMigrateConfigResponse(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneMigrateConfigResponse[] newArray(int i) {
            return new PhoneMigrateConfigResponse[i];
        }
    }

    public PhoneMigrateConfigResponse(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enabled = z;
        this.nameMatchingEnabled = z2;
        this.otpForMainAccountEnabled = z3;
        this.otpForSubsidiaryAccountEnabled = z4;
    }

    public static /* synthetic */ PhoneMigrateConfigResponse copy$default(PhoneMigrateConfigResponse phoneMigrateConfigResponse, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = phoneMigrateConfigResponse.enabled;
        }
        if ((i & 2) != 0) {
            z2 = phoneMigrateConfigResponse.nameMatchingEnabled;
        }
        if ((i & 4) != 0) {
            z3 = phoneMigrateConfigResponse.otpForMainAccountEnabled;
        }
        if ((i & 8) != 0) {
            z4 = phoneMigrateConfigResponse.otpForSubsidiaryAccountEnabled;
        }
        return phoneMigrateConfigResponse.copy(z, z2, z3, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getNameMatchingEnabled() {
        return this.nameMatchingEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getOtpForMainAccountEnabled() {
        return this.otpForMainAccountEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getOtpForSubsidiaryAccountEnabled() {
        return this.otpForSubsidiaryAccountEnabled;
    }

    public final PhoneMigrateConfigResponse copy(boolean enabled, boolean nameMatchingEnabled, boolean otpForMainAccountEnabled, boolean otpForSubsidiaryAccountEnabled) {
        return new PhoneMigrateConfigResponse(enabled, nameMatchingEnabled, otpForMainAccountEnabled, otpForSubsidiaryAccountEnabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneMigrateConfigResponse)) {
            return false;
        }
        PhoneMigrateConfigResponse phoneMigrateConfigResponse = (PhoneMigrateConfigResponse) other;
        return this.enabled == phoneMigrateConfigResponse.enabled && this.nameMatchingEnabled == phoneMigrateConfigResponse.nameMatchingEnabled && this.otpForMainAccountEnabled == phoneMigrateConfigResponse.otpForMainAccountEnabled && this.otpForSubsidiaryAccountEnabled == phoneMigrateConfigResponse.otpForSubsidiaryAccountEnabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getNameMatchingEnabled() {
        return this.nameMatchingEnabled;
    }

    public final boolean getOtpForMainAccountEnabled() {
        return this.otpForMainAccountEnabled;
    }

    public final boolean getOtpForSubsidiaryAccountEnabled() {
        return this.otpForSubsidiaryAccountEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.otpForSubsidiaryAccountEnabled) + mtg0.a(mtg0.a(Boolean.hashCode(this.enabled) * 31, 31, this.nameMatchingEnabled), 31, this.otpForMainAccountEnabled);
    }

    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.nameMatchingEnabled;
        return lng.a(", otpForSubsidiaryAccountEnabled=", ")", cwz.a("PhoneMigrateConfigResponse(enabled=", ", nameMatchingEnabled=", ", otpForMainAccountEnabled=", z, z2), this.otpForMainAccountEnabled, this.otpForSubsidiaryAccountEnabled);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.enabled ? 1 : 0);
        dest.writeInt(this.nameMatchingEnabled ? 1 : 0);
        dest.writeInt(this.otpForMainAccountEnabled ? 1 : 0);
        dest.writeInt(this.otpForSubsidiaryAccountEnabled ? 1 : 0);
    }
}

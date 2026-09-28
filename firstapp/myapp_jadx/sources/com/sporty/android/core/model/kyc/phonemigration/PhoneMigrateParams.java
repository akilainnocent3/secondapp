package com.sporty.android.core.model.kyc.phonemigration;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cwz;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.mtg0;
import defpackage.nng;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0014\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0083\u0004J\n\u0010&\u001a\u00020\"HÖ\u0081\u0004J\n\u0010'\u001a\u00020\bHÖ\u0081\u0004J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014Ê\u0001\u0002\b.¨\u0006-"}, d2 = {"Lcom/sporty/android/core/model/kyc/phonemigration/PhoneMigrateParams;", "Landroid/os/Parcelable;", "enabled", "", "nameMatchingEnabled", "otpForMainAccountEnabled", "otpForSubsidiaryAccountEnabled", "userName", "", "kycFailedUserPhone", "mainUserPhone", "passwordVerifyToken", "<init>", "(ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEnabled", "()Z", "getNameMatchingEnabled", "getOtpForMainAccountEnabled", "getOtpForSubsidiaryAccountEnabled", "getUserName", "()Ljava/lang/String;", "getKycFailedUserPhone", "getMainUserPhone", "getPasswordVerifyToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PhoneMigrateParams implements Parcelable {
    public static final Parcelable.Creator<PhoneMigrateParams> CREATOR = new Creator();
    private final boolean enabled;
    private final String kycFailedUserPhone;
    private final String mainUserPhone;
    private final boolean nameMatchingEnabled;
    private final boolean otpForMainAccountEnabled;
    private final boolean otpForSubsidiaryAccountEnabled;
    private final String passwordVerifyToken;
    private final String userName;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PhoneMigrateParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneMigrateParams createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z = false;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            }
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new PhoneMigrateParams(z, z2, z2, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneMigrateParams[] newArray(int i) {
            return new PhoneMigrateParams[i];
        }
    }

    public /* synthetic */ PhoneMigrateParams(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4);
    }

    public static /* synthetic */ PhoneMigrateParams copy$default(PhoneMigrateParams phoneMigrateParams, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = phoneMigrateParams.enabled;
        }
        if ((i & 2) != 0) {
            z2 = phoneMigrateParams.nameMatchingEnabled;
        }
        if ((i & 4) != 0) {
            z3 = phoneMigrateParams.otpForMainAccountEnabled;
        }
        if ((i & 8) != 0) {
            z4 = phoneMigrateParams.otpForSubsidiaryAccountEnabled;
        }
        if ((i & 16) != 0) {
            str = phoneMigrateParams.userName;
        }
        if ((i & 32) != 0) {
            str2 = phoneMigrateParams.kycFailedUserPhone;
        }
        if ((i & 64) != 0) {
            str3 = phoneMigrateParams.mainUserPhone;
        }
        if ((i & 128) != 0) {
            str4 = phoneMigrateParams.passwordVerifyToken;
        }
        String str5 = str3;
        String str6 = str4;
        String str7 = str;
        String str8 = str2;
        return phoneMigrateParams.copy(z, z2, z3, z4, str7, str8, str5, str6);
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

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getKycFailedUserPhone() {
        return this.kycFailedUserPhone;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMainUserPhone() {
        return this.mainUserPhone;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPasswordVerifyToken() {
        return this.passwordVerifyToken;
    }

    public final PhoneMigrateParams copy(boolean enabled, boolean nameMatchingEnabled, boolean otpForMainAccountEnabled, boolean otpForSubsidiaryAccountEnabled, String userName, String kycFailedUserPhone, String mainUserPhone, String passwordVerifyToken) {
        userName.getClass();
        kycFailedUserPhone.getClass();
        mainUserPhone.getClass();
        passwordVerifyToken.getClass();
        return new PhoneMigrateParams(enabled, nameMatchingEnabled, otpForMainAccountEnabled, otpForSubsidiaryAccountEnabled, userName, kycFailedUserPhone, mainUserPhone, passwordVerifyToken);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneMigrateParams)) {
            return false;
        }
        PhoneMigrateParams phoneMigrateParams = (PhoneMigrateParams) other;
        return this.enabled == phoneMigrateParams.enabled && this.nameMatchingEnabled == phoneMigrateParams.nameMatchingEnabled && this.otpForMainAccountEnabled == phoneMigrateParams.otpForMainAccountEnabled && this.otpForSubsidiaryAccountEnabled == phoneMigrateParams.otpForSubsidiaryAccountEnabled && Intrinsics.g(this.userName, phoneMigrateParams.userName) && Intrinsics.g(this.kycFailedUserPhone, phoneMigrateParams.kycFailedUserPhone) && Intrinsics.g(this.mainUserPhone, phoneMigrateParams.mainUserPhone) && Intrinsics.g(this.passwordVerifyToken, phoneMigrateParams.passwordVerifyToken);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getKycFailedUserPhone() {
        return this.kycFailedUserPhone;
    }

    public final String getMainUserPhone() {
        return this.mainUserPhone;
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

    public final String getPasswordVerifyToken() {
        return this.passwordVerifyToken;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return this.passwordVerifyToken.hashCode() + gmf0.a(gmf0.a(gmf0.a(mtg0.a(mtg0.a(mtg0.a(Boolean.hashCode(this.enabled) * 31, 31, this.nameMatchingEnabled), 31, this.otpForMainAccountEnabled), 31, this.otpForSubsidiaryAccountEnabled), 31, this.userName), 31, this.kycFailedUserPhone), 31, this.mainUserPhone);
    }

    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.nameMatchingEnabled;
        boolean z3 = this.otpForMainAccountEnabled;
        boolean z4 = this.otpForSubsidiaryAccountEnabled;
        String str = this.userName;
        String str2 = this.kycFailedUserPhone;
        String str3 = this.mainUserPhone;
        String str4 = this.passwordVerifyToken;
        StringBuilder sbA = cwz.a("PhoneMigrateParams(enabled=", ", nameMatchingEnabled=", ", otpForMainAccountEnabled=", z, z2);
        nng.a(", otpForSubsidiaryAccountEnabled=", ", userName=", sbA, z3, z4);
        hxa.c(sbA, str, ", kycFailedUserPhone=", str2, ", mainUserPhone=");
        return kwi.a(sbA, str3, ", passwordVerifyToken=", str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.enabled ? 1 : 0);
        dest.writeInt(this.nameMatchingEnabled ? 1 : 0);
        dest.writeInt(this.otpForMainAccountEnabled ? 1 : 0);
        dest.writeInt(this.otpForSubsidiaryAccountEnabled ? 1 : 0);
        dest.writeString(this.userName);
        dest.writeString(this.kycFailedUserPhone);
        dest.writeString(this.mainUserPhone);
        dest.writeString(this.passwordVerifyToken);
    }

    public PhoneMigrateParams(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.enabled = z;
        this.nameMatchingEnabled = z2;
        this.otpForMainAccountEnabled = z3;
        this.otpForSubsidiaryAccountEnabled = z4;
        this.userName = str;
        this.kycFailedUserPhone = str2;
        this.mainUserPhone = str3;
        this.passwordVerifyToken = str4;
    }

    public PhoneMigrateParams() {
        this(false, false, false, false, null, null, null, null, 255, null);
    }
}

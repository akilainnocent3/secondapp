package com.sporty.android.core.model.kyc.phonemigration;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.ml5;
import defpackage.qn4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010!\u001a\u00020\u0005J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0083\u0004J\n\u0010&\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fÊ\u0001\u0002\b.¨\u0006-"}, d2 = {"Lcom/sporty/android/core/model/kyc/phonemigration/PhoneMigrateFindMainAccountResponse;", "Landroid/os/Parcelable;", "idNumber", "", "idType", "", "kycFailedUserId", "kycFailedUserPhone", "mainUserId", "mainUserPhone", "phoneCountryCode", "token", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdNumber", "()Ljava/lang/String;", "getIdType", "()I", "getKycFailedUserId", "getKycFailedUserPhone", "getMainUserId", "getMainUserPhone", "getPhoneCountryCode", "getToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PhoneMigrateFindMainAccountResponse implements Parcelable {
    public static final Parcelable.Creator<PhoneMigrateFindMainAccountResponse> CREATOR = new Creator();
    private final String idNumber;
    private final int idType;
    private final String kycFailedUserId;
    private final String kycFailedUserPhone;
    private final String mainUserId;
    private final String mainUserPhone;
    private final String phoneCountryCode;
    private final String token;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PhoneMigrateFindMainAccountResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneMigrateFindMainAccountResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PhoneMigrateFindMainAccountResponse(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneMigrateFindMainAccountResponse[] newArray(int i) {
            return new PhoneMigrateFindMainAccountResponse[i];
        }
    }

    public PhoneMigrateFindMainAccountResponse(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.idNumber = str;
        this.idType = i;
        this.kycFailedUserId = str2;
        this.kycFailedUserPhone = str3;
        this.mainUserId = str4;
        this.mainUserPhone = str5;
        this.phoneCountryCode = str6;
        this.token = str7;
    }

    public static /* synthetic */ PhoneMigrateFindMainAccountResponse copy$default(PhoneMigrateFindMainAccountResponse phoneMigrateFindMainAccountResponse, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = phoneMigrateFindMainAccountResponse.idNumber;
        }
        if ((i2 & 2) != 0) {
            i = phoneMigrateFindMainAccountResponse.idType;
        }
        if ((i2 & 4) != 0) {
            str2 = phoneMigrateFindMainAccountResponse.kycFailedUserId;
        }
        if ((i2 & 8) != 0) {
            str3 = phoneMigrateFindMainAccountResponse.kycFailedUserPhone;
        }
        if ((i2 & 16) != 0) {
            str4 = phoneMigrateFindMainAccountResponse.mainUserId;
        }
        if ((i2 & 32) != 0) {
            str5 = phoneMigrateFindMainAccountResponse.mainUserPhone;
        }
        if ((i2 & 64) != 0) {
            str6 = phoneMigrateFindMainAccountResponse.phoneCountryCode;
        }
        if ((i2 & 128) != 0) {
            str7 = phoneMigrateFindMainAccountResponse.token;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return phoneMigrateFindMainAccountResponse.copy(str, i, str2, str3, str10, str11, str8, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdNumber() {
        return this.idNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIdType() {
        return this.idType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKycFailedUserId() {
        return this.kycFailedUserId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKycFailedUserPhone() {
        return this.kycFailedUserPhone;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMainUserId() {
        return this.mainUserId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMainUserPhone() {
        return this.mainUserPhone;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final PhoneMigrateFindMainAccountResponse copy(String idNumber, int idType, String kycFailedUserId, String kycFailedUserPhone, String mainUserId, String mainUserPhone, String phoneCountryCode, String token) {
        qn4.b(idNumber, kycFailedUserId, kycFailedUserPhone, mainUserId, mainUserPhone);
        phoneCountryCode.getClass();
        token.getClass();
        return new PhoneMigrateFindMainAccountResponse(idNumber, idType, kycFailedUserId, kycFailedUserPhone, mainUserId, mainUserPhone, phoneCountryCode, token);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneMigrateFindMainAccountResponse)) {
            return false;
        }
        PhoneMigrateFindMainAccountResponse phoneMigrateFindMainAccountResponse = (PhoneMigrateFindMainAccountResponse) other;
        return Intrinsics.g(this.idNumber, phoneMigrateFindMainAccountResponse.idNumber) && this.idType == phoneMigrateFindMainAccountResponse.idType && Intrinsics.g(this.kycFailedUserId, phoneMigrateFindMainAccountResponse.kycFailedUserId) && Intrinsics.g(this.kycFailedUserPhone, phoneMigrateFindMainAccountResponse.kycFailedUserPhone) && Intrinsics.g(this.mainUserId, phoneMigrateFindMainAccountResponse.mainUserId) && Intrinsics.g(this.mainUserPhone, phoneMigrateFindMainAccountResponse.mainUserPhone) && Intrinsics.g(this.phoneCountryCode, phoneMigrateFindMainAccountResponse.phoneCountryCode) && Intrinsics.g(this.token, phoneMigrateFindMainAccountResponse.token);
    }

    public final String getIdNumber() {
        return this.idNumber;
    }

    public final int getIdType() {
        return this.idType;
    }

    public final String getKycFailedUserId() {
        return this.kycFailedUserId;
    }

    public final String getKycFailedUserPhone() {
        return this.kycFailedUserPhone;
    }

    public final String getMainUserId() {
        return this.mainUserId;
    }

    public final String getMainUserPhone() {
        return this.mainUserPhone;
    }

    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gpp.a(this.idType, this.idNumber.hashCode() * 31, 31), 31, this.kycFailedUserId), 31, this.kycFailedUserPhone), 31, this.mainUserId), 31, this.mainUserPhone), 31, this.phoneCountryCode);
    }

    public String toString() {
        String str = this.idNumber;
        int i = this.idType;
        String str2 = this.kycFailedUserId;
        String str3 = this.kycFailedUserPhone;
        String str4 = this.mainUserId;
        String str5 = this.mainUserPhone;
        String str6 = this.phoneCountryCode;
        String str7 = this.token;
        StringBuilder sbA = ml5.a(i, "PhoneMigrateFindMainAccountResponse(idNumber=", str, ", idType=", ", kycFailedUserId=");
        hxa.c(sbA, str2, ", kycFailedUserPhone=", str3, ", mainUserId=");
        hxa.c(sbA, str4, ", mainUserPhone=", str5, ", phoneCountryCode=");
        return kwi.a(sbA, str6, ", token=", str7, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.idNumber);
        dest.writeInt(this.idType);
        dest.writeString(this.kycFailedUserId);
        dest.writeString(this.kycFailedUserPhone);
        dest.writeString(this.mainUserId);
        dest.writeString(this.mainUserPhone);
        dest.writeString(this.phoneCountryCode);
        dest.writeString(this.token);
    }
}

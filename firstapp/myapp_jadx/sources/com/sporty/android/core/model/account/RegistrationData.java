package com.sporty.android.core.model.account;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.ruw;

/* JADX INFO: loaded from: classes4.dex */
public class RegistrationData implements Parcelable {
    public static final int CREATE_ACCOUNT_AFTER_KYC = 20;
    public static final int CREATE_ACCOUNT_BEFORE_KYC = 10;
    public static final int CREATE_ACCOUNT_WITHOUT_KYC = 30;
    public static final Parcelable.Creator<RegistrationData> CREATOR = new Parcelable.Creator<RegistrationData>() { // from class: com.sporty.android.core.model.account.RegistrationData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RegistrationData createFromParcel(Parcel parcel) {
            return new RegistrationData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RegistrationData[] newArray(int i) {
            return new RegistrationData[i];
        }
    };
    public String accessToken;
    public boolean isFacebook;
    public String logEventName;
    public String mobile;
    public String refreshToken;
    public String registrationKYCToken;
    public int registrationStatus;
    public int userCertStatus;
    public String userId;

    public RegistrationData(Parcel parcel) {
        this.accessToken = parcel.readString();
        this.refreshToken = parcel.readString();
        this.userId = parcel.readString();
        this.userCertStatus = parcel.readInt();
        this.mobile = parcel.readString();
        this.registrationKYCToken = parcel.readString();
        this.registrationStatus = parcel.readInt();
        this.logEventName = parcel.readString();
        this.isFacebook = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean hasRegistrationKYCTokens() {
        return !TextUtils.isEmpty(this.registrationKYCToken);
    }

    public boolean hasRegistrationTokens() {
        return (TextUtils.isEmpty(this.accessToken) || TextUtils.isEmpty(this.refreshToken) || TextUtils.isEmpty(this.userId)) ? false : true;
    }

    public boolean hasUserCertStatus() {
        return this.userCertStatus != 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RegistrationData{accessToken='");
        sb.append(this.accessToken);
        sb.append("', refreshToken='");
        sb.append(this.refreshToken);
        sb.append("', userId='");
        sb.append(this.userId);
        sb.append("', userCertStatus=");
        sb.append(this.userCertStatus);
        sb.append(", mobile='");
        sb.append(this.mobile);
        sb.append("', registrationKYCToken='");
        sb.append(this.registrationKYCToken);
        sb.append("', registrationStatus=");
        sb.append(this.registrationStatus);
        sb.append(", logEventName='");
        sb.append(this.logEventName);
        sb.append("', isFacebook=");
        return ruw.a(sb, this.isFacebook, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.accessToken);
        parcel.writeString(this.refreshToken);
        parcel.writeString(this.userId);
        parcel.writeInt(this.userCertStatus);
        parcel.writeString(this.mobile);
        parcel.writeString(this.registrationKYCToken);
        parcel.writeInt(this.registrationStatus);
        parcel.writeString(this.logEventName);
        parcel.writeByte(this.isFacebook ? (byte) 1 : (byte) 0);
    }

    public RegistrationData() {
    }
}

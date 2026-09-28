package com.sporty.android.core.model.security.otp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ml5;
import defpackage.qn4;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0091\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0006\u00106\u001a\u00020\u0005J\u0014\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0083\u0004J\n\u0010;\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010<\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0005R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR%\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R%\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR%\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R%\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R%\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R%\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R%\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R%\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R'\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R%\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR'\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'Ê\u0001\u0002\bC¨\u0006B"}, d2 = {"Lcom/sporty/android/core/model/security/otp/OTPCompleteResult;", "Landroid/os/Parcelable;", "simpleToken", "", "registrationStatus", "", "accessToken", "maxAge", "refreshToken", "userId", "currency", "countryCode", "language", "phoneCountryCode", "selfExclusion", "Lcom/sporty/android/core/model/security/otp/SelfExclusion;", "userCert", "variant", "Lcom/sporty/android/core/model/security/otp/OTPVerificationBrVariant;", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/security/otp/SelfExclusion;ILcom/sporty/android/core/model/security/otp/OTPVerificationBrVariant;)V", "getSimpleToken", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getRegistrationStatus", "()I", "getAccessToken", "getMaxAge", "getRefreshToken", "getUserId", "getCurrency", "getCountryCode", "getLanguage", "getPhoneCountryCode", "getSelfExclusion", "()Lcom/sporty/android/core/model/security/otp/SelfExclusion;", "getUserCert", "getVariant", "()Lcom/sporty/android/core/model/security/otp/OTPVerificationBrVariant;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OTPCompleteResult implements Parcelable {
    public static final Parcelable.Creator<OTPCompleteResult> CREATOR = new Creator();

    @SerializedName("accessToken")
    private final String accessToken;

    @SerializedName("countryCode")
    private final String countryCode;

    @SerializedName("currency")
    private final String currency;

    @SerializedName("language")
    private final String language;

    @SerializedName("maxAge")
    private final int maxAge;

    @SerializedName("phoneCountryCode")
    private final String phoneCountryCode;

    @SerializedName("refreshToken")
    private final String refreshToken;

    @SerializedName("registrationStatus")
    private final int registrationStatus;

    @SerializedName("selfExclusion")
    private final SelfExclusion selfExclusion;

    @SerializedName("simpleToken")
    private final String simpleToken;

    @SerializedName("userCert")
    private final int userCert;

    @SerializedName("userId")
    private final String userId;

    @SerializedName("variant")
    private final OTPVerificationBrVariant variant;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OTPCompleteResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OTPCompleteResult createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new OTPCompleteResult(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SelfExclusion.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0 ? OTPVerificationBrVariant.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OTPCompleteResult[] newArray(int i) {
            return new OTPCompleteResult[i];
        }
    }

    public OTPCompleteResult(String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, SelfExclusion selfExclusion, int i3, OTPVerificationBrVariant oTPVerificationBrVariant) {
        qn4.b(str2, str3, str4, str5, str6);
        str7.getClass();
        str8.getClass();
        this.simpleToken = str;
        this.registrationStatus = i;
        this.accessToken = str2;
        this.maxAge = i2;
        this.refreshToken = str3;
        this.userId = str4;
        this.currency = str5;
        this.countryCode = str6;
        this.language = str7;
        this.phoneCountryCode = str8;
        this.selfExclusion = selfExclusion;
        this.userCert = i3;
        this.variant = oTPVerificationBrVariant;
    }

    public static /* synthetic */ OTPCompleteResult copy$default(OTPCompleteResult oTPCompleteResult, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, SelfExclusion selfExclusion, int i3, OTPVerificationBrVariant oTPVerificationBrVariant, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = oTPCompleteResult.simpleToken;
        }
        return oTPCompleteResult.copy(str, (i4 & 2) != 0 ? oTPCompleteResult.registrationStatus : i, (i4 & 4) != 0 ? oTPCompleteResult.accessToken : str2, (i4 & 8) != 0 ? oTPCompleteResult.maxAge : i2, (i4 & 16) != 0 ? oTPCompleteResult.refreshToken : str3, (i4 & 32) != 0 ? oTPCompleteResult.userId : str4, (i4 & 64) != 0 ? oTPCompleteResult.currency : str5, (i4 & 128) != 0 ? oTPCompleteResult.countryCode : str6, (i4 & 256) != 0 ? oTPCompleteResult.language : str7, (i4 & 512) != 0 ? oTPCompleteResult.phoneCountryCode : str8, (i4 & 1024) != 0 ? oTPCompleteResult.selfExclusion : selfExclusion, (i4 & 2048) != 0 ? oTPCompleteResult.userCert : i3, (i4 & 4096) != 0 ? oTPCompleteResult.variant : oTPVerificationBrVariant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSimpleToken() {
        return this.simpleToken;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final SelfExclusion getSelfExclusion() {
        return this.selfExclusion;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getUserCert() {
        return this.userCert;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final OTPVerificationBrVariant getVariant() {
        return this.variant;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRegistrationStatus() {
        return this.registrationStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxAge() {
        return this.maxAge;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final OTPCompleteResult copy(String simpleToken, int registrationStatus, String accessToken, int maxAge, String refreshToken, String userId, String currency, String countryCode, String language, String phoneCountryCode, SelfExclusion selfExclusion, int userCert, OTPVerificationBrVariant variant) {
        qn4.b(accessToken, refreshToken, userId, currency, countryCode);
        language.getClass();
        phoneCountryCode.getClass();
        return new OTPCompleteResult(simpleToken, registrationStatus, accessToken, maxAge, refreshToken, userId, currency, countryCode, language, phoneCountryCode, selfExclusion, userCert, variant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OTPCompleteResult)) {
            return false;
        }
        OTPCompleteResult oTPCompleteResult = (OTPCompleteResult) other;
        return Intrinsics.g(this.simpleToken, oTPCompleteResult.simpleToken) && this.registrationStatus == oTPCompleteResult.registrationStatus && Intrinsics.g(this.accessToken, oTPCompleteResult.accessToken) && this.maxAge == oTPCompleteResult.maxAge && Intrinsics.g(this.refreshToken, oTPCompleteResult.refreshToken) && Intrinsics.g(this.userId, oTPCompleteResult.userId) && Intrinsics.g(this.currency, oTPCompleteResult.currency) && Intrinsics.g(this.countryCode, oTPCompleteResult.countryCode) && Intrinsics.g(this.language, oTPCompleteResult.language) && Intrinsics.g(this.phoneCountryCode, oTPCompleteResult.phoneCountryCode) && Intrinsics.g(this.selfExclusion, oTPCompleteResult.selfExclusion) && this.userCert == oTPCompleteResult.userCert && this.variant == oTPCompleteResult.variant;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final int getMaxAge() {
        return this.maxAge;
    }

    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final int getRegistrationStatus() {
        return this.registrationStatus;
    }

    public final SelfExclusion getSelfExclusion() {
        return this.selfExclusion;
    }

    public final String getSimpleToken() {
        return this.simpleToken;
    }

    public final int getUserCert() {
        return this.userCert;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final OTPVerificationBrVariant getVariant() {
        return this.variant;
    }

    public int hashCode() {
        String str = this.simpleToken;
        int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gpp.a(this.maxAge, gmf0.a(gpp.a(this.registrationStatus, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.accessToken), 31), 31, this.refreshToken), 31, this.userId), 31, this.currency), 31, this.countryCode), 31, this.language), 31, this.phoneCountryCode);
        SelfExclusion selfExclusion = this.selfExclusion;
        int iA2 = gpp.a(this.userCert, (iA + (selfExclusion == null ? 0 : selfExclusion.hashCode())) * 31, 31);
        OTPVerificationBrVariant oTPVerificationBrVariant = this.variant;
        return iA2 + (oTPVerificationBrVariant != null ? oTPVerificationBrVariant.hashCode() : 0);
    }

    public String toString() {
        String str = this.simpleToken;
        int i = this.registrationStatus;
        String str2 = this.accessToken;
        int i2 = this.maxAge;
        String str3 = this.refreshToken;
        String str4 = this.userId;
        String str5 = this.currency;
        String str6 = this.countryCode;
        String str7 = this.language;
        String str8 = this.phoneCountryCode;
        SelfExclusion selfExclusion = this.selfExclusion;
        int i3 = this.userCert;
        OTPVerificationBrVariant oTPVerificationBrVariant = this.variant;
        StringBuilder sbA = ml5.a(i, "OTPCompleteResult(simpleToken=", str, ", registrationStatus=", ", accessToken=");
        wxa.b(i2, str2, ", maxAge=", ", refreshToken=", sbA);
        hxa.c(sbA, str3, ", userId=", str4, ", currency=");
        hxa.c(sbA, str5, ", countryCode=", str6, ", language=");
        hxa.c(sbA, str7, ", phoneCountryCode=", str8, ", selfExclusion=");
        sbA.append(selfExclusion);
        sbA.append(", userCert=");
        sbA.append(i3);
        sbA.append(", variant=");
        sbA.append(oTPVerificationBrVariant);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.simpleToken);
        dest.writeInt(this.registrationStatus);
        dest.writeString(this.accessToken);
        dest.writeInt(this.maxAge);
        dest.writeString(this.refreshToken);
        dest.writeString(this.userId);
        dest.writeString(this.currency);
        dest.writeString(this.countryCode);
        dest.writeString(this.language);
        dest.writeString(this.phoneCountryCode);
        SelfExclusion selfExclusion = this.selfExclusion;
        if (selfExclusion == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            selfExclusion.writeToParcel(dest, flags);
        }
        dest.writeInt(this.userCert);
        OTPVerificationBrVariant oTPVerificationBrVariant = this.variant;
        if (oTPVerificationBrVariant == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(oTPVerificationBrVariant.name());
        }
    }
}

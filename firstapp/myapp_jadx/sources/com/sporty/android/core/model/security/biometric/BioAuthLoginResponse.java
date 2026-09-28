package com.sporty.android.core.model.security.biometric;

import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ijg0;
import defpackage.ux5;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0007HÆ\u0001J\u0014\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010,\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010-\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016Ê\u0001\u0002\b/¨\u0006."}, d2 = {"Lcom/sporty/android/core/model/security/biometric/BioAuthLoginResponse;", "", "accessToken", "", "refreshToken", "userId", "maxAge", "", "selfExclusion", "Lcom/sporty/android/core/model/security/biometric/BioAuthSelfExclusion;", "userCert", "countryCode", "currency", "language", "phoneCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/sporty/android/core/model/security/biometric/BioAuthSelfExclusion;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken", "getUserId", "getMaxAge", "()I", "getSelfExclusion", "()Lcom/sporty/android/core/model/security/biometric/BioAuthSelfExclusion;", "getUserCert", "getCountryCode", "getCurrency", "getLanguage", "getPhoneCountryCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BioAuthLoginResponse {
    private final String accessToken;
    private final String countryCode;
    private final String currency;
    private final String language;
    private final int maxAge;
    private final int phoneCountryCode;
    private final String refreshToken;
    private final BioAuthSelfExclusion selfExclusion;
    private final int userCert;
    private final String userId;

    public BioAuthLoginResponse(String str, String str2, String str3, int i, BioAuthSelfExclusion bioAuthSelfExclusion, int i2, String str4, String str5, String str6, int i3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        bioAuthSelfExclusion.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.accessToken = str;
        this.refreshToken = str2;
        this.userId = str3;
        this.maxAge = i;
        this.selfExclusion = bioAuthSelfExclusion;
        this.userCert = i2;
        this.countryCode = str4;
        this.currency = str5;
        this.language = str6;
        this.phoneCountryCode = i3;
    }

    public static /* synthetic */ BioAuthLoginResponse copy$default(BioAuthLoginResponse bioAuthLoginResponse, String str, String str2, String str3, int i, BioAuthSelfExclusion bioAuthSelfExclusion, int i2, String str4, String str5, String str6, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = bioAuthLoginResponse.accessToken;
        }
        if ((i4 & 2) != 0) {
            str2 = bioAuthLoginResponse.refreshToken;
        }
        if ((i4 & 4) != 0) {
            str3 = bioAuthLoginResponse.userId;
        }
        if ((i4 & 8) != 0) {
            i = bioAuthLoginResponse.maxAge;
        }
        if ((i4 & 16) != 0) {
            bioAuthSelfExclusion = bioAuthLoginResponse.selfExclusion;
        }
        if ((i4 & 32) != 0) {
            i2 = bioAuthLoginResponse.userCert;
        }
        if ((i4 & 64) != 0) {
            str4 = bioAuthLoginResponse.countryCode;
        }
        if ((i4 & 128) != 0) {
            str5 = bioAuthLoginResponse.currency;
        }
        if ((i4 & 256) != 0) {
            str6 = bioAuthLoginResponse.language;
        }
        if ((i4 & 512) != 0) {
            i3 = bioAuthLoginResponse.phoneCountryCode;
        }
        String str7 = str6;
        int i5 = i3;
        String str8 = str4;
        String str9 = str5;
        BioAuthSelfExclusion bioAuthSelfExclusion2 = bioAuthSelfExclusion;
        int i6 = i2;
        return bioAuthLoginResponse.copy(str, str2, str3, i, bioAuthSelfExclusion2, i6, str8, str9, str7, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxAge() {
        return this.maxAge;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BioAuthSelfExclusion getSelfExclusion() {
        return this.selfExclusion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getUserCert() {
        return this.userCert;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final BioAuthLoginResponse copy(String accessToken, String refreshToken, String userId, int maxAge, BioAuthSelfExclusion selfExclusion, int userCert, String countryCode, String currency, String language, int phoneCountryCode) {
        accessToken.getClass();
        refreshToken.getClass();
        userId.getClass();
        selfExclusion.getClass();
        countryCode.getClass();
        currency.getClass();
        language.getClass();
        return new BioAuthLoginResponse(accessToken, refreshToken, userId, maxAge, selfExclusion, userCert, countryCode, currency, language, phoneCountryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BioAuthLoginResponse)) {
            return false;
        }
        BioAuthLoginResponse bioAuthLoginResponse = (BioAuthLoginResponse) other;
        return Intrinsics.g(this.accessToken, bioAuthLoginResponse.accessToken) && Intrinsics.g(this.refreshToken, bioAuthLoginResponse.refreshToken) && Intrinsics.g(this.userId, bioAuthLoginResponse.userId) && this.maxAge == bioAuthLoginResponse.maxAge && Intrinsics.g(this.selfExclusion, bioAuthLoginResponse.selfExclusion) && this.userCert == bioAuthLoginResponse.userCert && Intrinsics.g(this.countryCode, bioAuthLoginResponse.countryCode) && Intrinsics.g(this.currency, bioAuthLoginResponse.currency) && Intrinsics.g(this.language, bioAuthLoginResponse.language) && this.phoneCountryCode == bioAuthLoginResponse.phoneCountryCode;
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

    public final int getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final BioAuthSelfExclusion getSelfExclusion() {
        return this.selfExclusion;
    }

    public final int getUserCert() {
        return this.userCert;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Integer.hashCode(this.phoneCountryCode) + gmf0.a(gmf0.a(gmf0.a(gpp.a(this.userCert, (this.selfExclusion.hashCode() + gpp.a(this.maxAge, gmf0.a(gmf0.a(this.accessToken.hashCode() * 31, 31, this.refreshToken), 31, this.userId), 31)) * 31, 31), 31, this.countryCode), 31, this.currency), 31, this.language);
    }

    public String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        String str3 = this.userId;
        int i = this.maxAge;
        BioAuthSelfExclusion bioAuthSelfExclusion = this.selfExclusion;
        int i2 = this.userCert;
        String str4 = this.countryCode;
        String str5 = this.currency;
        String str6 = this.language;
        int i3 = this.phoneCountryCode;
        StringBuilder sbA = ux5.a("BioAuthLoginResponse(accessToken=", str, ", refreshToken=", str2, ", userId=");
        wxa.b(i, str3, ", maxAge=", ", selfExclusion=", sbA);
        sbA.append(bioAuthSelfExclusion);
        sbA.append(", userCert=");
        sbA.append(i2);
        sbA.append(", countryCode=");
        hxa.c(sbA, str4, ", currency=", str5, ", language=");
        return ijg0.a(i3, str6, ", phoneCountryCode=", ")", sbA);
    }
}

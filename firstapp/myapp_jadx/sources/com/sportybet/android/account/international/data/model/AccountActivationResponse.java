package com.sportybet.android.account.international.data.model;

import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.qn4;
import defpackage.ux5;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fÊ\u0001\f\b'\u0012\b\b(\u0012\u0004\b\u0003\u0010\u0002¨\u0006&"}, d2 = {"Lcom/sportybet/android/account/international/data/model/AccountActivationResponse;", "", "accessToken", "", "refreshToken", "userId", "maxAge", "", "countryCode", "currency", "language", "phoneCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken", "getUserId", "getMaxAge", "()I", "getCountryCode", "getCurrency", "getLanguage", "getPhoneCountryCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AccountActivationResponse {
    public static final int $stable = 0;
    private final String accessToken;
    private final String countryCode;
    private final String currency;
    private final String language;
    private final int maxAge;
    private final String phoneCountryCode;
    private final String refreshToken;
    private final String userId;

    public AccountActivationResponse(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.accessToken = str;
        this.refreshToken = str2;
        this.userId = str3;
        this.maxAge = i;
        this.countryCode = str4;
        this.currency = str5;
        this.language = str6;
        this.phoneCountryCode = str7;
    }

    public static /* synthetic */ AccountActivationResponse copy$default(AccountActivationResponse accountActivationResponse, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = accountActivationResponse.accessToken;
        }
        if ((i2 & 2) != 0) {
            str2 = accountActivationResponse.refreshToken;
        }
        if ((i2 & 4) != 0) {
            str3 = accountActivationResponse.userId;
        }
        if ((i2 & 8) != 0) {
            i = accountActivationResponse.maxAge;
        }
        if ((i2 & 16) != 0) {
            str4 = accountActivationResponse.countryCode;
        }
        if ((i2 & 32) != 0) {
            str5 = accountActivationResponse.currency;
        }
        if ((i2 & 64) != 0) {
            str6 = accountActivationResponse.language;
        }
        if ((i2 & 128) != 0) {
            str7 = accountActivationResponse.phoneCountryCode;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return accountActivationResponse.copy(str, str2, str3, i, str10, str11, str8, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
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
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public final AccountActivationResponse copy(String accessToken, String refreshToken, String userId, int maxAge, String countryCode, String currency, String language, String phoneCountryCode) {
        qn4.b(accessToken, refreshToken, userId, countryCode, currency);
        language.getClass();
        phoneCountryCode.getClass();
        return new AccountActivationResponse(accessToken, refreshToken, userId, maxAge, countryCode, currency, language, phoneCountryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountActivationResponse)) {
            return false;
        }
        AccountActivationResponse accountActivationResponse = (AccountActivationResponse) other;
        return Intrinsics.g(this.accessToken, accountActivationResponse.accessToken) && Intrinsics.g(this.refreshToken, accountActivationResponse.refreshToken) && Intrinsics.g(this.userId, accountActivationResponse.userId) && this.maxAge == accountActivationResponse.maxAge && Intrinsics.g(this.countryCode, accountActivationResponse.countryCode) && Intrinsics.g(this.currency, accountActivationResponse.currency) && Intrinsics.g(this.language, accountActivationResponse.language) && Intrinsics.g(this.phoneCountryCode, accountActivationResponse.phoneCountryCode);
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

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.phoneCountryCode.hashCode() + gmf0.a(gmf0.a(gmf0.a(gpp.a(this.maxAge, gmf0.a(gmf0.a(this.accessToken.hashCode() * 31, 31, this.refreshToken), 31, this.userId), 31), 31, this.countryCode), 31, this.currency), 31, this.language);
    }

    public String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        String str3 = this.userId;
        int i = this.maxAge;
        String str4 = this.countryCode;
        String str5 = this.currency;
        String str6 = this.language;
        String str7 = this.phoneCountryCode;
        StringBuilder sbA = ux5.a("AccountActivationResponse(accessToken=", str, ", refreshToken=", str2, ", userId=");
        wxa.b(i, str3, ", maxAge=", ", countryCode=", sbA);
        hxa.c(sbA, str4, ", currency=", str5, ", language=");
        return kwi.a(sbA, str6, ", phoneCountryCode=", str7, ")");
    }
}

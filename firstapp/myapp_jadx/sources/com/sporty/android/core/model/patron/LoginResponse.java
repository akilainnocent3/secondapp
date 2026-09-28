package com.sporty.android.core.model.patron;

import defpackage.ae80;
import defpackage.ce80;
import defpackage.cgo;
import defpackage.f78;
import defpackage.f87;
import defpackage.fma;
import defpackage.g41;
import defpackage.gae0;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.nrz;
import defpackage.pd80;
import defpackage.php;
import defpackage.qn4;
import defpackage.u4;
import defpackage.ux5;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@ae80
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0003DECBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0080\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b>\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b?\u0010\u0017R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b@\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\bA\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bB\u0010\u001c¨\u0006F"}, d2 = {"Lcom/sporty/android/core/model/patron/LoginResponse;", "", "", "token", "accessToken", "refreshToken", "userId", "", "maxAge", "Lcom/sporty/android/core/model/patron/LoginResponse$SelfExclusion;", "selfExclusion", "userCert", "countryCode", "currency", "language", "phoneCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/sporty/android/core/model/patron/LoginResponse$SelfExclusion;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lce80;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/sporty/android/core/model/patron/LoginResponse$SelfExclusion;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILce80;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()I", "component6", "()Lcom/sporty/android/core/model/patron/LoginResponse$SelfExclusion;", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/sporty/android/core/model/patron/LoginResponse$SelfExclusion;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/sporty/android/core/model/patron/LoginResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lfma;", "output", "Lpd80;", "serialDesc", "", "write$Self$model", "(Lcom/sporty/android/core/model/patron/LoginResponse;Lfma;Lpd80;)V", "write$Self", "Ljava/lang/String;", "getToken", "getAccessToken", "getRefreshToken", "getUserId", "I", "getMaxAge", "Lcom/sporty/android/core/model/patron/LoginResponse$SelfExclusion;", "getSelfExclusion", "getUserCert", "getCountryCode", "getCurrency", "getLanguage", "getPhoneCountryCode", "Companion", "SelfExclusion", "$serializer", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LoginResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accessToken;
    private final String countryCode;
    private final String currency;
    private final String language;
    private final int maxAge;
    private final int phoneCountryCode;
    private final String refreshToken;
    private final SelfExclusion selfExclusion;
    private final String token;
    private final int userCert;
    private final String userId;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/patron/LoginResponse$Companion;", "", "<init>", "()V", "Lphp;", "Lcom/sporty/android/core/model/patron/LoginResponse;", "serializer", "()Lphp;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final php<LoginResponse> serializer() {
            return LoginResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LoginResponse(int i, String str, String str2, String str3, String str4, int i2, SelfExclusion selfExclusion, int i3, String str5, String str6, String str7, int i4, ce80 ce80Var) {
        if (2015 != (i & 2015)) {
            cgo.a(i, 2015, LoginResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.token = str;
        this.accessToken = str2;
        this.refreshToken = str3;
        this.userId = str4;
        this.maxAge = i2;
        if ((i & 32) == 0) {
            this.selfExclusion = null;
        } else {
            this.selfExclusion = selfExclusion;
        }
        this.userCert = i3;
        this.countryCode = str5;
        this.currency = str6;
        this.language = str7;
        this.phoneCountryCode = i4;
    }

    public static /* synthetic */ LoginResponse copy$default(LoginResponse loginResponse, String str, String str2, String str3, String str4, int i, SelfExclusion selfExclusion, int i2, String str5, String str6, String str7, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = loginResponse.token;
        }
        if ((i4 & 2) != 0) {
            str2 = loginResponse.accessToken;
        }
        if ((i4 & 4) != 0) {
            str3 = loginResponse.refreshToken;
        }
        if ((i4 & 8) != 0) {
            str4 = loginResponse.userId;
        }
        if ((i4 & 16) != 0) {
            i = loginResponse.maxAge;
        }
        if ((i4 & 32) != 0) {
            selfExclusion = loginResponse.selfExclusion;
        }
        if ((i4 & 64) != 0) {
            i2 = loginResponse.userCert;
        }
        if ((i4 & 128) != 0) {
            str5 = loginResponse.countryCode;
        }
        if ((i4 & 256) != 0) {
            str6 = loginResponse.currency;
        }
        if ((i4 & 512) != 0) {
            str7 = loginResponse.language;
        }
        if ((i4 & 1024) != 0) {
            i3 = loginResponse.phoneCountryCode;
        }
        String str8 = str7;
        int i5 = i3;
        String str9 = str5;
        String str10 = str6;
        SelfExclusion selfExclusion2 = selfExclusion;
        int i6 = i2;
        int i7 = i;
        String str11 = str3;
        return loginResponse.copy(str, str2, str11, str4, i7, selfExclusion2, i6, str9, str10, str8, i5);
    }

    public static final /* synthetic */ void write$Self$model(LoginResponse self, fma output, pd80 serialDesc) {
        output.o(serialDesc, 0, self.token);
        output.o(serialDesc, 1, self.accessToken);
        output.o(serialDesc, 2, self.refreshToken);
        output.o(serialDesc, 3, self.userId);
        output.A(4, self.maxAge, serialDesc);
        if (output.a(serialDesc) || self.selfExclusion != null) {
            output.D(serialDesc, 5, LoginResponse$SelfExclusion$$serializer.INSTANCE, self.selfExclusion);
        }
        output.A(6, self.userCert, serialDesc);
        output.o(serialDesc, 7, self.countryCode);
        output.o(serialDesc, 8, self.currency);
        output.o(serialDesc, 9, self.language);
        output.A(10, self.phoneCountryCode, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxAge() {
        return this.maxAge;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SelfExclusion getSelfExclusion() {
        return this.selfExclusion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getUserCert() {
        return this.userCert;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final LoginResponse copy(String token, String accessToken, String refreshToken, String userId, int maxAge, SelfExclusion selfExclusion, int userCert, String countryCode, String currency, String language, int phoneCountryCode) {
        qn4.b(token, accessToken, refreshToken, userId, countryCode);
        currency.getClass();
        language.getClass();
        return new LoginResponse(token, accessToken, refreshToken, userId, maxAge, selfExclusion, userCert, countryCode, currency, language, phoneCountryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginResponse)) {
            return false;
        }
        LoginResponse loginResponse = (LoginResponse) other;
        return Intrinsics.g(this.token, loginResponse.token) && Intrinsics.g(this.accessToken, loginResponse.accessToken) && Intrinsics.g(this.refreshToken, loginResponse.refreshToken) && Intrinsics.g(this.userId, loginResponse.userId) && this.maxAge == loginResponse.maxAge && Intrinsics.g(this.selfExclusion, loginResponse.selfExclusion) && this.userCert == loginResponse.userCert && Intrinsics.g(this.countryCode, loginResponse.countryCode) && Intrinsics.g(this.currency, loginResponse.currency) && Intrinsics.g(this.language, loginResponse.language) && this.phoneCountryCode == loginResponse.phoneCountryCode;
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

    public final SelfExclusion getSelfExclusion() {
        return this.selfExclusion;
    }

    public final String getToken() {
        return this.token;
    }

    public final int getUserCert() {
        return this.userCert;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = gpp.a(this.maxAge, gmf0.a(gmf0.a(gmf0.a(this.token.hashCode() * 31, 31, this.accessToken), 31, this.refreshToken), 31, this.userId), 31);
        SelfExclusion selfExclusion = this.selfExclusion;
        return Integer.hashCode(this.phoneCountryCode) + gmf0.a(gmf0.a(gmf0.a(gpp.a(this.userCert, (iA + (selfExclusion == null ? 0 : selfExclusion.hashCode())) * 31, 31), 31, this.countryCode), 31, this.currency), 31, this.language);
    }

    public String toString() {
        String str = this.token;
        String str2 = this.accessToken;
        String str3 = this.refreshToken;
        String str4 = this.userId;
        int i = this.maxAge;
        SelfExclusion selfExclusion = this.selfExclusion;
        int i2 = this.userCert;
        String str5 = this.countryCode;
        String str6 = this.currency;
        String str7 = this.language;
        int i3 = this.phoneCountryCode;
        StringBuilder sbA = ux5.a("LoginResponse(token=", str, ", accessToken=", str2, ", refreshToken=");
        hxa.c(sbA, str3, ", userId=", str4, ", maxAge=");
        sbA.append(i);
        sbA.append(", selfExclusion=");
        sbA.append(selfExclusion);
        sbA.append(", userCert=");
        f78.b(i2, ", countryCode=", str5, ", currency=", sbA);
        hxa.c(sbA, str6, ", language=", str7, ", phoneCountryCode=");
        return zk1.a(i3, ")", sbA);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJN\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010!R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b3\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b4\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b5\u0010\u001c¨\u00068"}, d2 = {"Lcom/sporty/android/core/model/patron/LoginResponse$SelfExclusion;", "", "", "cooldown", "", "endDate", "", "selfExclusionType", "remainingTimeForNextBlocking", "remainingTimeForUnblocking", "startDate", "<init>", "(ZJLjava/lang/String;JJJ)V", "", "seen0", "Lce80;", "serializationConstructorMarker", "(IZJLjava/lang/String;JJJLce80;)V", "self", "Lfma;", "output", "Lpd80;", "serialDesc", "", "write$Self$model", "(Lcom/sporty/android/core/model/patron/LoginResponse$SelfExclusion;Lfma;Lpd80;)V", "write$Self", "resolveLoginTime", "()J", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "copy", "(ZJLjava/lang/String;JJJ)Lcom/sporty/android/core/model/patron/LoginResponse$SelfExclusion;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getCooldown", "J", "getEndDate", "Ljava/lang/String;", "getSelfExclusionType", "getRemainingTimeForNextBlocking", "getRemainingTimeForUnblocking", "getStartDate", "Companion", "$serializer", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @ae80
    public static final /* data */ class SelfExclusion {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean cooldown;
        private final long endDate;
        private final long remainingTimeForNextBlocking;
        private final long remainingTimeForUnblocking;
        private final String selfExclusionType;
        private final long startDate;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/patron/LoginResponse$SelfExclusion$Companion;", "", "<init>", "()V", "Lphp;", "Lcom/sporty/android/core/model/patron/LoginResponse$SelfExclusion;", "serializer", "()Lphp;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final php<SelfExclusion> serializer() {
                return LoginResponse$SelfExclusion$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ SelfExclusion(int i, boolean z, long j, String str, long j2, long j3, long j4, ce80 ce80Var) {
            if (63 != (i & 63)) {
                cgo.a(i, 63, LoginResponse$SelfExclusion$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.cooldown = z;
            this.endDate = j;
            this.selfExclusionType = str;
            this.remainingTimeForNextBlocking = j2;
            this.remainingTimeForUnblocking = j3;
            this.startDate = j4;
        }

        public static /* synthetic */ SelfExclusion copy$default(SelfExclusion selfExclusion, boolean z, long j, String str, long j2, long j3, long j4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = selfExclusion.cooldown;
            }
            if ((i & 2) != 0) {
                j = selfExclusion.endDate;
            }
            if ((i & 4) != 0) {
                str = selfExclusion.selfExclusionType;
            }
            if ((i & 8) != 0) {
                j2 = selfExclusion.remainingTimeForNextBlocking;
            }
            if ((i & 16) != 0) {
                j3 = selfExclusion.remainingTimeForUnblocking;
            }
            if ((i & 32) != 0) {
                j4 = selfExclusion.startDate;
            }
            long j5 = j4;
            String str2 = str;
            return selfExclusion.copy(z, j, str2, j2, j3, j5);
        }

        public static final /* synthetic */ void write$Self$model(SelfExclusion self, fma output, pd80 serialDesc) {
            output.i(serialDesc, 0, self.cooldown);
            output.f(serialDesc, 1, self.endDate);
            output.D(serialDesc, 2, gae0.a, self.selfExclusionType);
            output.f(serialDesc, 3, self.remainingTimeForNextBlocking);
            output.f(serialDesc, 4, self.remainingTimeForUnblocking);
            output.f(serialDesc, 5, self.startDate);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getCooldown() {
            return this.cooldown;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getEndDate() {
            return this.endDate;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSelfExclusionType() {
            return this.selfExclusionType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getRemainingTimeForNextBlocking() {
            return this.remainingTimeForNextBlocking;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getRemainingTimeForUnblocking() {
            return this.remainingTimeForUnblocking;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getStartDate() {
            return this.startDate;
        }

        public final SelfExclusion copy(boolean cooldown, long endDate, String selfExclusionType, long remainingTimeForNextBlocking, long remainingTimeForUnblocking, long startDate) {
            return new SelfExclusion(cooldown, endDate, selfExclusionType, remainingTimeForNextBlocking, remainingTimeForUnblocking, startDate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelfExclusion)) {
                return false;
            }
            SelfExclusion selfExclusion = (SelfExclusion) other;
            return this.cooldown == selfExclusion.cooldown && this.endDate == selfExclusion.endDate && Intrinsics.g(this.selfExclusionType, selfExclusion.selfExclusionType) && this.remainingTimeForNextBlocking == selfExclusion.remainingTimeForNextBlocking && this.remainingTimeForUnblocking == selfExclusion.remainingTimeForUnblocking && this.startDate == selfExclusion.startDate;
        }

        public final boolean getCooldown() {
            return this.cooldown;
        }

        public final long getEndDate() {
            return this.endDate;
        }

        public final long getRemainingTimeForNextBlocking() {
            return this.remainingTimeForNextBlocking;
        }

        public final long getRemainingTimeForUnblocking() {
            return this.remainingTimeForUnblocking;
        }

        public final String getSelfExclusionType() {
            return this.selfExclusionType;
        }

        public final long getStartDate() {
            return this.startDate;
        }

        public int hashCode() {
            int iA = f87.a(Boolean.hashCode(this.cooldown) * 31, this.endDate, 31);
            String str = this.selfExclusionType;
            return Long.hashCode(this.startDate) + f87.a(f87.a((iA + (str == null ? 0 : str.hashCode())) * 31, this.remainingTimeForNextBlocking, 31), this.remainingTimeForUnblocking, 31);
        }

        public final long resolveLoginTime() {
            String str = this.selfExclusionType;
            if ((str == null || StringsKt.U(str)) && this.startDate == 0 && this.endDate == 0) {
                return System.currentTimeMillis();
            }
            return 0L;
        }

        public String toString() {
            boolean z = this.cooldown;
            long j = this.endDate;
            String str = this.selfExclusionType;
            long j2 = this.remainingTimeForNextBlocking;
            long j3 = this.remainingTimeForUnblocking;
            long j4 = this.startDate;
            StringBuilder sb = new StringBuilder("SelfExclusion(cooldown=");
            sb.append(z);
            sb.append(", endDate=");
            sb.append(j);
            u4.a(sb, ", selfExclusionType=", str, ", remainingTimeForNextBlocking=");
            sb.append(j2);
            g41.a(j3, ", remainingTimeForUnblocking=", ", startDate=", sb);
            return nrz.a(j4, ")", sb);
        }

        public SelfExclusion(boolean z, long j, String str, long j2, long j3, long j4) {
            this.cooldown = z;
            this.endDate = j;
            this.selfExclusionType = str;
            this.remainingTimeForNextBlocking = j2;
            this.remainingTimeForUnblocking = j3;
            this.startDate = j4;
        }
    }

    public LoginResponse(String str, String str2, String str3, String str4, int i, SelfExclusion selfExclusion, int i2, String str5, String str6, String str7, int i3) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.token = str;
        this.accessToken = str2;
        this.refreshToken = str3;
        this.userId = str4;
        this.maxAge = i;
        this.selfExclusion = selfExclusion;
        this.userCert = i2;
        this.countryCode = str5;
        this.currency = str6;
        this.language = str7;
        this.phoneCountryCode = i3;
    }

    public /* synthetic */ LoginResponse(String str, String str2, String str3, String str4, int i, SelfExclusion selfExclusion, int i2, String str5, String str6, String str7, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, (i4 & 32) != 0 ? null : selfExclusion, i2, str5, str6, str7, i3);
    }
}

package defpackage;

import com.sporty.android.core.model.patron.LoginResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vqm {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final Integer g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final long m;

    public static final class a {
        public static vqm a(LoginResponse loginResponse, String str, long j) {
            loginResponse.getClass();
            str.getClass();
            String userId = loginResponse.getUserId();
            String accessToken = loginResponse.getAccessToken();
            String refreshToken = loginResponse.getRefreshToken();
            LoginResponse.SelfExclusion selfExclusion = loginResponse.getSelfExclusion();
            Long lValueOf = selfExclusion != null ? Long.valueOf(selfExclusion.getEndDate()) : null;
            LoginResponse.SelfExclusion selfExclusion2 = loginResponse.getSelfExclusion();
            return new vqm(str, userId, accessToken, refreshToken, lValueOf, selfExclusion2 != null ? selfExclusion2.getSelfExclusionType() : null, Integer.valueOf(loginResponse.getUserCert()), loginResponse.getCountryCode(), loginResponse.getCurrency(), loginResponse.getLanguage(), String.valueOf(loginResponse.getPhoneCountryCode()), j, 2048);
        }
    }

    public /* synthetic */ vqm(String str, String str2, String str3, String str4, Long l, String str5, Integer num, String str6, String str7, String str8, String str9, long j, int i) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) == 0, (i & 4096) != 0 ? 0L : j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqm)) {
            return false;
        }
        vqm vqmVar = (vqm) obj;
        return Intrinsics.g(this.a, vqmVar.a) && Intrinsics.g(this.b, vqmVar.b) && Intrinsics.g(this.c, vqmVar.c) && Intrinsics.g(this.d, vqmVar.d) && Intrinsics.g(this.e, vqmVar.e) && Intrinsics.g(this.f, vqmVar.f) && Intrinsics.g(this.g, vqmVar.g) && Intrinsics.g(this.h, vqmVar.h) && Intrinsics.g(this.i, vqmVar.i) && Intrinsics.g(this.j, vqmVar.j) && Intrinsics.g(this.k, vqmVar.k) && this.l == vqmVar.l && this.m == vqmVar.m;
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Long l = this.e;
        int iHashCode = (iA + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        return Long.hashCode(this.m) + mtg0.a((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.l);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("IAccountHelperLogin(mobile=", this.a, ", userId=", this.b, ", accessToken=");
        hxa.c(sbA, this.c, ", refreshToken=", this.d, ", selfExclusionUTCTimestamp=");
        sbA.append(this.e);
        sbA.append(", selfExclusionType=");
        sbA.append(this.f);
        sbA.append(", userCert=");
        w03.a(this.g, ", countryCode=", this.h, ", currency=", sbA);
        hxa.c(sbA, this.i, ", language=", this.j, ", phoneCountryCode=");
        uts.b(this.k, ", isFacialRecognitionDeferred=", ", loginTime=", sbA, this.l);
        return nrz.a(this.m, ")", sbA);
    }

    public vqm(String str, String str2, String str3, String str4, Long l, String str5, Integer num, String str6, String str7, String str8, String str9, boolean z, long j) {
        wd7.a(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
        this.f = str5;
        this.g = num;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = z;
        this.m = j;
    }
}

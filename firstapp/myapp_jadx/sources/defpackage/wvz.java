package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wvz {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Integer f;
    public final String g;

    public wvz(String str, String str2, String str3, String str4, Long l, Integer num, String str5) {
        wd7.a(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
        this.f = num;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvz)) {
            return false;
        }
        wvz wvzVar = (wvz) obj;
        return Intrinsics.g(this.a, wvzVar.a) && Intrinsics.g(this.b, wvzVar.b) && Intrinsics.g(this.c, wvzVar.c) && Intrinsics.g(this.d, wvzVar.d) && Intrinsics.g(this.e, wvzVar.e) && this.f.equals(wvzVar.f) && Intrinsics.g(this.g, wvzVar.g);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Long l = this.e;
        int iHashCode = (this.f.hashCode() + ((iA + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        String str = this.g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("PasswordResetResult(mobile=", this.a, ", userId=", this.b, ", accessToken=");
        hxa.c(sbA, this.c, ", refreshToken=", this.d, ", selfExclusionUTCTimestamp=");
        sbA.append(this.e);
        sbA.append(", userCert=");
        sbA.append(this.f);
        sbA.append(", language=");
        return uf80.a(sbA, this.g, ")");
    }
}

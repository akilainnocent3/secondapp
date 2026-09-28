package defpackage;

import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class kk20 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public kk20(String str, String str2, String str3, String str4, String str5, String str6) {
        m.a(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk20)) {
            return false;
        }
        kk20 kk20Var = (kk20) obj;
        return Intrinsics.g(this.a, kk20Var.a) && Intrinsics.g(this.b, kk20Var.b) && Intrinsics.g(this.c, kk20Var.c) && Intrinsics.g(this.d, kk20Var.d) && Intrinsics.g(this.e, kk20Var.e) && this.f.equals(kk20Var.f);
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iA2 = gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return this.f.hashCode() + ((iA2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("PreMatchSideMenuEvent(eventId=", this.a, ", homeTeam=", this.b, ", homeIcon=");
        hxa.c(sbA, this.c, ", awayTeam=", this.d, ", awayIcon=");
        return kwi.a(sbA, this.e, ", time=", this.f, ")");
    }
}

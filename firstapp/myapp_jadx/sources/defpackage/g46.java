package defpackage;

import com.appsflyer.internal.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g46 {
    public final String a;
    public final long b;
    public final f0e0 c;
    public final String d;
    public final String e;
    public final as5 f;
    public final f0e0 g;
    public final f0e0 h;

    public g46(String str, long j, f0e0 f0e0Var, String str2, String str3, as5 as5Var, f0e0 f0e0Var2, f0e0 f0e0Var3) {
        str.getClass();
        f0e0Var.getClass();
        f0e0Var2.getClass();
        this.a = str;
        this.b = j;
        this.c = f0e0Var;
        this.d = str2;
        this.e = str3;
        this.f = as5Var;
        this.g = f0e0Var2;
        this.h = f0e0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g46)) {
            return false;
        }
        g46 g46Var = (g46) obj;
        return Intrinsics.g(this.a, g46Var.a) && this.b == g46Var.b && Intrinsics.g(this.c, g46Var.c) && Intrinsics.g(this.d, g46Var.d) && Intrinsics.g(this.e, g46Var.e) && this.f == g46Var.f && Intrinsics.g(this.g, g46Var.g) && this.h.equals(g46Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + f87.a(this.a.hashCode() * 31, this.b, 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        as5 as5Var = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((iHashCode3 + (as5Var != null ? as5Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = x.a(this.b, "CampaignApiTestResult(campaignCode=", this.a, ", timeMillis=");
        sbA.append(", participate=");
        sbA.append(this.c);
        sbA.append(", variantName=");
        sbA.append(this.d);
        sbA.append(", variantValue=");
        sbA.append(this.e);
        sbA.append(", cacheType=");
        sbA.append(this.f);
        sbA.append(", visit=");
        sbA.append(this.g);
        sbA.append(", convert=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}

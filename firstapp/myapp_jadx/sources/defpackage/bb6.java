package defpackage;

import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bb6 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final long g;

    public bb6(String str, int i, int i2, String str2, String str3, boolean z, long j) {
        m.a(str, str2, str3);
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb6)) {
            return false;
        }
        bb6 bb6Var = (bb6) obj;
        return Intrinsics.g(this.a, bb6Var.a) && this.b == bb6Var.b && this.c == bb6Var.c && Intrinsics.g(this.d, bb6Var.d) && Intrinsics.g(this.e, bb6Var.e) && this.f == bb6Var.f && this.g == bb6Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + mtg0.a(gmf0.a(gmf0.a(gpp.a(this.c, gpp.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "CampaignVariantEntity(campaignCode=", this.a, ", campaignId=", ", variantId=");
        f78.b(this.c, ", variantValue=", this.d, ", variantName=", sbA);
        uts.b(this.e, ", canConvert=", ", expireTime=", sbA, this.f);
        return nrz.a(this.g, ")", sbA);
    }
}

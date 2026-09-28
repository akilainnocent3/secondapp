package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class lja0 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final JSONArray g;
    public final JSONArray h;

    public lja0(String str, int i, int i2, String str2, String str3, String str4, JSONArray jSONArray, JSONArray jSONArray2) {
        wd7.a(str, str2, str3, str4);
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = jSONArray;
        this.h = jSONArray2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lja0)) {
            return false;
        }
        lja0 lja0Var = (lja0) obj;
        return Intrinsics.g(this.a, lja0Var.a) && this.b == lja0Var.b && this.c == lja0Var.c && Intrinsics.g(this.d, lja0Var.d) && Intrinsics.g(this.e, lja0Var.e) && Intrinsics.g(this.f, lja0Var.f) && Intrinsics.g(this.g, lja0Var.g) && this.h.equals(lja0Var.h);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(gpp.a(this.c, gpp.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
        JSONArray jSONArray = this.g;
        return this.h.hashCode() + ((iA + (jSONArray == null ? 0 : jSONArray.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "SocketMarketData(eventId=", this.a, ", marketStatus=", ", product=");
        f78.b(this.c, ", topicType=", this.d, ", marketId=", sbA);
        hxa.c(sbA, this.e, ", marketSpecifier=", this.f, ", oddsData=");
        sbA.append(this.g);
        sbA.append(", marketData=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}

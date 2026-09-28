package defpackage;

import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a4g0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public a4g0(String str, String str2, String str3, String str4) {
        m.a(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4g0)) {
            return false;
        }
        a4g0 a4g0Var = (a4g0) obj;
        return Intrinsics.g(this.a, a4g0Var.a) && Intrinsics.g(this.b, a4g0Var.b) && Intrinsics.g(this.c, a4g0Var.c) && this.d.equals(a4g0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kwi.a(ux5.a("Tournament(id=", this.a, ", radarId=", this.b, ", name="), this.c, ", logoUrl=", this.d, ")");
    }
}

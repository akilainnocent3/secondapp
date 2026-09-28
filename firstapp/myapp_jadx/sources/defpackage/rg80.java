package defpackage;

import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rg80 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final xoc e;
    public final String f;
    public final String g;

    public rg80(String str, String str2, int i, long j, xoc xocVar, String str3, String str4) {
        m.a(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = xocVar;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg80)) {
            return false;
        }
        rg80 rg80Var = (rg80) obj;
        return Intrinsics.g(this.a, rg80Var.a) && Intrinsics.g(this.b, rg80Var.b) && this.c == rg80Var.c && this.d == rg80Var.d && this.e.equals(rg80Var.e) && this.f.equals(rg80Var.f) && Intrinsics.g(this.g, rg80Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + gmf0.a((this.e.hashCode() + f87.a(gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), this.d, 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return j26.a(sb, this.g, ')');
    }
}

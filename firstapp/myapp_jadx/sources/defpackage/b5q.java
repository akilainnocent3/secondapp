package defpackage;

import com.appsflyer.internal.x;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b5q {
    public final String a;
    public final long b;

    public b5q(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5q)) {
            return false;
        }
        b5q b5qVar = (b5q) obj;
        return Intrinsics.g(this.a, b5qVar.a) && this.b == b5qVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = x.a(this.b, "LNCurrentStreamDetail(drawId=", this.a, ", drawTime=");
        sbA.append(lTGEJfVytU.tWpmVeKGQq);
        return sbA.toString();
    }
}

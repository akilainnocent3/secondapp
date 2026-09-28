package defpackage;

import com.appsflyer.internal.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a5q {
    public final String a;
    public final long b;
    public final long c;

    public a5q(String str, long j, long j2) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5q)) {
            return false;
        }
        a5q a5qVar = (a5q) obj;
        return Intrinsics.g(this.a, a5qVar.a) && this.b == a5qVar.b && this.c == a5qVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + f87.a(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return zug.a(this.c, ", drawTimeForElapsedRealtime=", ")", x.a(this.b, "LNCurrentLottery(drawId=", this.a, ", drawTime="));
    }
}

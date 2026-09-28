package defpackage;

import com.appsflyer.internal.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e6r {
    public final String a;
    public final long b;

    public e6r(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6r)) {
            return false;
        }
        e6r e6rVar = (e6r) obj;
        return Intrinsics.g(this.a, e6rVar.a) && this.b == e6rVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = x.a(this.b, "LNRecentSearchEntity(name=", this.a, ", modifyTime=");
        sbA.append(")");
        return sbA.toString();
    }
}

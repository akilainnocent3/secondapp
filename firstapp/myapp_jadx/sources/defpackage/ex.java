package defpackage;

import com.appsflyer.internal.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ex {
    public final long a;
    public final String b;

    public ex(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex)) {
            return false;
        }
        ex exVar = (ex) obj;
        return this.a == exVar.a && Intrinsics.g(this.b, exVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = b0.a(this.a, "AnTestAccountCacheState(generation=", ", accountName=", this.b);
        sbA.append(")");
        return sbA.toString();
    }
}

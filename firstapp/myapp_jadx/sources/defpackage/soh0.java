package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class soh0 {
    public final long a;
    public final String b;

    public soh0(long j, String str) {
        str.getClass();
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soh0)) {
            return false;
        }
        soh0 soh0Var = (soh0) obj;
        return this.a == soh0Var.a && Intrinsics.g(this.b, soh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserDetails(id=");
        sb.append(this.a);
        sb.append(", countryCode=");
        return j26.a(sb, this.b, ')');
    }
}

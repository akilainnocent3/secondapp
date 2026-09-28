package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class toh0 {
    public final long a;
    public final String b;
    public final boolean c;

    public toh0(long j, String str, boolean z) {
        str.getClass();
        this.a = j;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toh0)) {
            return false;
        }
        toh0 toh0Var = (toh0) obj;
        return this.a == toh0Var.a && Intrinsics.g(this.b, toh0Var.b) && this.c == toh0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gmf0.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserDetails(id=");
        sb.append(this.a);
        sb.append(", countryCode=");
        sb.append(this.b);
        sb.append(", isBlocked=");
        return ruw.a(sb, this.c, ')');
    }
}

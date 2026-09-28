package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cx20 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public cx20(int i, int i2, String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx20)) {
            return false;
        }
        cx20 cx20Var = (cx20) obj;
        return Intrinsics.g(this.a, cx20Var.a) && this.b == cx20Var.b && this.c == cx20Var.c && this.d == cx20Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gpp.a(this.c, gpp.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", isDefaultProcess=");
        return ruw.a(sb, this.d, ')');
    }
}

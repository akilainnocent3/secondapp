package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ivj0 {
    public final String a;
    public final int b;

    public ivj0(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivj0)) {
            return false;
        }
        ivj0 ivj0Var = (ivj0) obj;
        return Intrinsics.g(this.a, ivj0Var.a) && this.b == ivj0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return rr1.b(sb, this.b, ')');
    }
}

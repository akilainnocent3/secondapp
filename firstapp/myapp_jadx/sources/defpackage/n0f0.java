package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n0f0 {
    public final String a;
    public final String b;

    public n0f0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0f0)) {
            return false;
        }
        n0f0 n0f0Var = (n0f0) obj;
        return Intrinsics.g(this.a, n0f0Var.a) && Intrinsics.g(this.b, n0f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TGUser(nickname=");
        sb.append(this.a);
        sb.append(", avatar=");
        return j26.a(sb, this.b, ')');
    }
}

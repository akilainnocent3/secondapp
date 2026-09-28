package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n9e0 {
    public final String a;
    public final String b;

    public n9e0(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9e0)) {
            return false;
        }
        n9e0 n9e0Var = (n9e0) obj;
        return this.a.equals(n9e0Var.a) && Intrinsics.g(this.b, n9e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("StringData(key=", this.a, ", value=", this.b, ")");
    }
}

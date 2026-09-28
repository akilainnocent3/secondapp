package defpackage;

import com.appsflyer.internal.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g74 {
    public final int a;
    public final String b;

    public g74(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g74)) {
            return false;
        }
        g74 g74Var = (g74) obj;
        return this.a == g74Var.a && Intrinsics.g(this.b, g74Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return h.a(this.a, "BioAuthError(errorCode=", ", errorString=", this.b, ")");
    }
}

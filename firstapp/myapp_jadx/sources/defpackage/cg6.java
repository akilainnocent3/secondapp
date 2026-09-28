package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cg6 {
    public final String a;
    public final bc6 b;

    public cg6(String str, bc6 bc6Var) {
        str.getClass();
        this.a = str;
        this.b = bc6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cg6) {
            cg6 cg6Var = (cg6) obj;
            return Intrinsics.g(this.a, cg6Var.a) && this.b == cg6Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Card3DSWebAuthEvent(webContent=" + this.a + ", continuation=" + this.b + ")";
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n7v {
    public final String a;
    public final bgg0 b;

    public n7v(String str, bgg0 bgg0Var) {
        this.a = str;
        this.b = bgg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7v)) {
            return false;
        }
        n7v n7vVar = (n7v) obj;
        return Intrinsics.g(this.a, n7vVar.a) && Intrinsics.g(this.b, n7vVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        bgg0 bgg0Var = this.b;
        return iHashCode + (bgg0Var != null ? bgg0Var.hashCode() : 0);
    }

    public final String toString() {
        return "MatchSlot(placeholder=" + this.a + ", team=" + this.b + ")";
    }
}

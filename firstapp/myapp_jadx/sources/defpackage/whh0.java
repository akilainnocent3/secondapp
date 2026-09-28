package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class whh0 {
    public final rhh0 a;
    public final phh0 b;
    public final Set<phh0> c;

    public whh0(rhh0 rhh0Var, phh0 phh0Var, Set set) {
        rhh0Var.getClass();
        set.getClass();
        this.a = rhh0Var;
        this.b = phh0Var;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whh0)) {
            return false;
        }
        whh0 whh0Var = (whh0) obj;
        return this.a == whh0Var.a && this.b == whh0Var.b && Intrinsics.g(this.c, whh0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        phh0 phh0Var = this.b;
        return Boolean.hashCode(true) + ((this.c.hashCode() + ((iHashCode + (phh0Var == null ? 0 : phh0Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "UpMarketTabContext(family=" + this.a + ", activeCase=" + this.b + ", supportedCases=" + this.c + ", isReachable=true)";
    }
}

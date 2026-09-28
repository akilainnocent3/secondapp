package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ne40 {
    public final boolean a;
    public final boolean b;
    public final List<be40> c;

    public ne40(List list, boolean z, boolean z2) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne40)) {
            return false;
        }
        ne40 ne40Var = (ne40) obj;
        return this.a == ne40Var.a && this.b == ne40Var.b && Intrinsics.g(this.c, ne40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return ng1.a(cwz.a("RecapResult(isEligible=", ", shouldShowTutorial=", ", pages=", this.a, this.b), this.c, ")");
    }
}

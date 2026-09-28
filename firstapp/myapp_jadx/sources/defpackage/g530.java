package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g530 {
    public final String a;
    public final String b;
    public final n530 c;
    public final boolean d;

    public g530(String str, String str2, n530 n530Var, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = n530Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g530)) {
            return false;
        }
        g530 g530Var = (g530) obj;
        return Intrinsics.g(this.a, g530Var.a) && Intrinsics.g(this.b, g530Var.b) && this.c == g530Var.c && this.d == g530Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("PromotionItem(id=", this.a, ", name=", this.b, ", status=");
        sbA.append(this.c);
        sbA.append(", isFeature=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}

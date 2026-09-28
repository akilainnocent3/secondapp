package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k4d0 {
    public final boolean a;
    public final String b;
    public final hvc0 c;
    public final boolean d;
    public final List<pwc0> e;
    public final wyc0 f;

    public k4d0(boolean z, String str, hvc0 hvc0Var, boolean z2, List<pwc0> list, wyc0 wyc0Var) {
        list.getClass();
        this.a = z;
        this.b = str;
        this.c = hvc0Var;
        this.d = z2;
        this.e = list;
        this.f = wyc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4d0)) {
            return false;
        }
        k4d0 k4d0Var = (k4d0) obj;
        return this.a == k4d0Var.a && this.b.equals(k4d0Var.b) && this.c.equals(k4d0Var.c) && this.d == k4d0Var.d && Intrinsics.g(this.e, k4d0Var.e) && Intrinsics.g(this.f, k4d0Var.f);
    }

    public final int hashCode() {
        int iA = ai50.a(mtg0.a((this.c.hashCode() + gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
        wyc0 wyc0Var = this.f;
        return iA + (wyc0Var == null ? 0 : wyc0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = t160.a("SportyPenaltySportConfig(active=", ", sportId=", this.b, ", betLimitInfo=", this.a);
        sbA.append(this.c);
        sbA.append(", giftEnabled=");
        sbA.append(this.d);
        sbA.append(", marketCategories=");
        sbA.append(this.e);
        sbA.append(", oddsFilter=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}

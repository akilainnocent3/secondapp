package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d2a0 {
    public final String a;
    public final Integer b;
    public final ArrayList c;
    public final c2a0 d;

    public d2a0(String str, Integer num, ArrayList arrayList, c2a0 c2a0Var) {
        this.a = str;
        this.b = num;
        this.c = arrayList;
        this.d = c2a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2a0)) {
            return false;
        }
        d2a0 d2a0Var = (d2a0) obj;
        return this.a.equals(d2a0Var.a) && Intrinsics.g(this.b, d2a0Var.b) && this.c.equals(d2a0Var.c) && this.d.equals(d2a0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.d.hashCode() + vt5.a(this.c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = ew7.a(this.b, "SmartRemixEligibilityResult(shareCode=", this.a, ", orderType=", ", selections=");
        sbA.append(this.c);
        sbA.append(", diff=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}

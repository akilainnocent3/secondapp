package defpackage;

import java.util.StringJoiner;

/* JADX INFO: loaded from: classes8.dex */
public final class nl1 {
    public final tr a;
    public final bjb0 b;
    public final int c;

    public nl1(tr trVar, bjb0 bjb0Var, int i) {
        if (trVar == null) {
            bmy.a("Null aggregation");
            throw null;
        }
        this.a = trVar;
        if (bjb0Var == null) {
            bmy.a("Null attributesProcessor");
            throw null;
        }
        this.b = bjb0Var;
        this.c = i;
    }

    public static k6i0 a() {
        k6i0 k6i0Var = new k6i0();
        k6i0Var.a = x8d.a;
        k6i0Var.b = ayx.b;
        k6i0Var.c = 2000;
        return k6i0Var;
    }

    public final tr b() {
        return this.a;
    }

    public final bjb0 c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final String e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nl1)) {
            return false;
        }
        nl1 nl1Var = (nl1) obj;
        return nl1Var.f() == null && nl1Var.e() == null && this.a.equals(nl1Var.b()) && this.b.equals(nl1Var.c()) && this.c == nl1Var.d();
    }

    public final String f() {
        return null;
    }

    public final int hashCode() {
        return this.c ^ ((((((1000003 * 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "View{", "}");
        if (f() != null) {
            stringJoiner.add("name=" + f());
        }
        if (e() != null) {
            stringJoiner.add("description=" + e());
        }
        stringJoiner.add("aggregation=" + b());
        stringJoiner.add("attributesProcessor=" + c());
        stringJoiner.add("cardinalityLimit=" + d());
        return stringJoiner.toString();
    }
}

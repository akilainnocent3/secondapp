package defpackage;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public abstract class npv {
    public final AtomicReference<eqa0> a = new AtomicReference<>();
    public int b;

    public static qj1 a(nl1 nl1Var, eqa0 eqa0Var, bj1 bj1Var) {
        qj1 qj1Var = new qj1(nl1Var.f() == null ? bj1Var.c : nl1Var.f(), nl1Var.e() == null ? bj1Var.d : nl1Var.e(), nl1Var, bj1Var);
        qj1Var.a.set(eqa0Var);
        return qj1Var;
    }

    public abstract String b();

    public abstract String c();

    public abstract bj1 d();

    public abstract nl1 e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof npv)) {
            return false;
        }
        npv npvVar = (npv) obj;
        return c().equalsIgnoreCase(npvVar.c()) && b().equals(npvVar.b()) && e().equals(npvVar.e()) && d().equals(npvVar.d());
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((c().toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ b().hashCode()) * 1000003) ^ e().hashCode()) * 1000003) ^ d().hashCode();
        this.b = iHashCode;
        return iHashCode;
    }
}

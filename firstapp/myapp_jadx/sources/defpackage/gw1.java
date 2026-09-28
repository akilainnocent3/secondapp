package defpackage;

import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gw1 {
    public static final gw1 d = new gw1(null, true, b.k("Savings", "Cheque/Current", "Transmission"));
    public final String a;
    public final boolean b;
    public final List<String> c;

    public gw1(String str, boolean z, List<String> list) {
        list.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
    }

    public static gw1 a(gw1 gw1Var, String str, boolean z) {
        List<String> list = gw1Var.c;
        gw1Var.getClass();
        list.getClass();
        return new gw1(str, z, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw1)) {
            return false;
        }
        gw1 gw1Var = (gw1) obj;
        return Intrinsics.g(this.a, gw1Var.a) && this.b == gw1Var.b && Intrinsics.g(this.c, gw1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + mtg0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return ng1.a(z620.a("BankAccountType(selectedType=", this.a, ", isNewBankAccount=", ", types=", this.b), this.c, ")");
    }
}

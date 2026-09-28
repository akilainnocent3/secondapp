package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x0h0 {
    public final String a;
    public final String b;
    public final String c;

    public x0h0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0h0)) {
            return false;
        }
        x0h0 x0h0Var = (x0h0) obj;
        return this.a.equals(x0h0Var.a) && Intrinsics.g(this.b, x0h0Var.b) && this.c.equals(x0h0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return uf80.a(ux5.a("TxContactInfo(phone1=", this.a, ", phone2=", this.b, ", email="), this.c, ")");
    }
}

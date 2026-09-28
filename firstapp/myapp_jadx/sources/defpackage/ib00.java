package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ib00 {
    public final String a;
    public final String b;
    public final String c;
    public final zzg d;

    public ib00(String str, String str2, String str3, zzg zzgVar) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zzgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib00)) {
            return false;
        }
        ib00 ib00Var = (ib00) obj;
        return Intrinsics.g(this.a, ib00Var.a) && this.b.equals(ib00Var.b) && Intrinsics.g(this.c, ib00Var.c) && Intrinsics.g(this.d, ib00Var.d);
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        zzg zzgVar = this.d;
        return iA + (zzgVar == null ? 0 : zzgVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("PendingDepositState(tradeId=", this.a, ", currency=", this.b, ", amount=");
        sbA.append(this.c);
        sbA.append(", expirationTime=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}

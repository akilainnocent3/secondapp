package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ggi0 {
    public static final ggi0 d = new ggi0("", "", "");
    public final String a;
    public final String b;
    public final String c;

    public ggi0(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggi0)) {
            return false;
        }
        ggi0 ggi0Var = (ggi0) obj;
        return Intrinsics.g(this.a, ggi0Var.a) && this.b.equals(ggi0Var.b) && Intrinsics.g(this.c, ggi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("VirtualLobbyBroadcastItem(winner=", this.a, ", formattedAmount=", this.b, ", gameType="), this.c, ")");
    }
}

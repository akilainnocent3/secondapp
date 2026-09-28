package defpackage;

import com.sporty.android.permission.location.KN.qUnCRF;

/* JADX INFO: loaded from: classes2.dex */
public final class p43 {
    public final q43 a;
    public final boolean b;
    public final int c;
    public final boolean d;

    public p43(q43 q43Var, boolean z, int i, boolean z2) {
        this.a = q43Var;
        this.b = z;
        this.c = i;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p43)) {
            return false;
        }
        p43 p43Var = (p43) obj;
        return this.a == p43Var.a && this.b == p43Var.b && this.c == p43Var.c && this.d == p43Var.d;
    }

    public final int hashCode() {
        q43 q43Var = this.a;
        return Boolean.hashCode(this.d) + gpp.a(this.c, mtg0.a((q43Var == null ? 0 : q43Var.hashCode()) * 31, 31, this.b), 31);
    }

    public final String toString() {
        return qUnCRF.PRlIgUWRIC + this.a + ", isAutoBetEnabled=" + this.b + ", orderType=" + this.c + ", isSim=" + this.d + ")";
    }
}

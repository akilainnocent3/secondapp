package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tji0 {
    public final String a;
    public final String b;
    public final qcn<wii0> c;
    public final dii0 d;

    public tji0(String str, String str2, uf00 uf00Var, dii0 dii0Var) {
        str.getClass();
        uf00Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = uf00Var;
        this.d = dii0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tji0)) {
            return false;
        }
        tji0 tji0Var = (tji0) obj;
        return Intrinsics.g(this.a, tji0Var.a) && this.b.equals(tji0Var.b) && Intrinsics.g(this.c, tji0Var.c) && Intrinsics.g(this.d, tji0Var.d);
    }

    public final int hashCode() {
        int iA = shu.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
        dii0 dii0Var = this.d;
        return iA + (dii0Var == null ? 0 : dii0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("VirtualLobbyGetStartedTabState(sportName=", this.a, ", tabResourceId=", this.b, ", cellStates=");
        sbA.append(this.c);
        sbA.append(", bottomCallToActionState=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}

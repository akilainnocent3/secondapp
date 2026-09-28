package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xnc0 {
    public final fnc0 a;
    public final enc0 b;
    public final enc0 c;

    public /* synthetic */ xnc0(enc0 enc0Var, enc0 enc0Var2, int i) {
        this(fnc0.a, (i & 2) != 0 ? null : enc0Var, (i & 4) != 0 ? null : enc0Var2);
    }

    public static xnc0 a(xnc0 xnc0Var, fnc0 fnc0Var, enc0 enc0Var, enc0 enc0Var2, int i) {
        if ((i & 1) != 0) {
            fnc0Var = xnc0Var.a;
        }
        if ((i & 2) != 0) {
            enc0Var = xnc0Var.b;
        }
        if ((i & 4) != 0) {
            enc0Var2 = xnc0Var.c;
        }
        xnc0Var.getClass();
        fnc0Var.getClass();
        return new xnc0(fnc0Var, enc0Var, enc0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnc0)) {
            return false;
        }
        xnc0 xnc0Var = (xnc0) obj;
        return this.a == xnc0Var.a && Intrinsics.g(this.b, xnc0Var.b) && Intrinsics.g(this.c, xnc0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        enc0 enc0Var = this.b;
        int iHashCode2 = (iHashCode + (enc0Var == null ? 0 : enc0Var.hashCode())) * 31;
        enc0 enc0Var2 = this.c;
        return iHashCode2 + (enc0Var2 != null ? enc0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "SportyLegendsTeamSelectionState(selectMode=" + this.a + ", homeTeam=" + this.b + ", awayTeam=" + this.c + ")";
    }

    public xnc0(fnc0 fnc0Var, enc0 enc0Var, enc0 enc0Var2) {
        this.a = fnc0Var;
        this.b = enc0Var;
        this.c = enc0Var2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xnc0() {
        enc0 enc0Var = null;
        this(enc0Var, enc0Var, 7);
    }
}

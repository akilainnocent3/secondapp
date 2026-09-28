package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k44 {
    public final m4e0 a;
    public final r4e0 b;
    public final h4e0 c;
    public final h850 d;
    public final uxs e;

    public k44(m4e0 m4e0Var, r4e0 r4e0Var, h4e0 h4e0Var, h850 h850Var, uxs uxsVar) {
        m4e0Var.getClass();
        r4e0Var.getClass();
        h4e0Var.getClass();
        h850Var.getClass();
        this.a = m4e0Var;
        this.b = r4e0Var;
        this.c = h4e0Var;
        this.d = h850Var;
        this.e = uxsVar;
    }

    public static k44 a(k44 k44Var, m4e0 m4e0Var, r4e0 r4e0Var, h4e0 h4e0Var, h850 h850Var, uxs uxsVar, int i) {
        if ((i & 1) != 0) {
            m4e0Var = k44Var.a;
        }
        m4e0 m4e0Var2 = m4e0Var;
        if ((i & 2) != 0) {
            r4e0Var = k44Var.b;
        }
        r4e0 r4e0Var2 = r4e0Var;
        if ((i & 4) != 0) {
            h4e0Var = k44Var.c;
        }
        h4e0 h4e0Var2 = h4e0Var;
        if ((i & 8) != 0) {
            h850Var = k44Var.d;
        }
        h850 h850Var2 = h850Var;
        if ((i & 16) != 0) {
            uxsVar = k44Var.e;
        }
        uxs uxsVar2 = uxsVar;
        k44Var.getClass();
        m4e0Var2.getClass();
        r4e0Var2.getClass();
        h4e0Var2.getClass();
        h850Var2.getClass();
        uxsVar2.getClass();
        return new k44(m4e0Var2, r4e0Var2, h4e0Var2, h850Var2, uxsVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k44)) {
            return false;
        }
        k44 k44Var = (k44) obj;
        return Intrinsics.g(this.a, k44Var.a) && Intrinsics.g(this.b, k44Var.b) && Intrinsics.g(this.c, k44Var.c) && Intrinsics.g(this.d, k44Var.d) && this.e == k44Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BettingStreakUiState(contentState=" + this.a + ", dialogState=" + this.b + ", bottomSheetState=" + this.c + ", repairOverlayState=" + this.d + ", earnRepairToolButtonStatus=" + this.e + ")";
    }

    public k44() {
        this(0);
    }

    public /* synthetic */ k44(int i) {
        this(m4e0.b.a, r4e0.b.a, h4e0.d.a, h850.b.a, uxs.ENABLE);
    }
}

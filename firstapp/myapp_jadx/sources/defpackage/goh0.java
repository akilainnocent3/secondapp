package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class goh0 {
    public final t760 a;
    public final boolean b;
    public final dg60 c;

    public goh0(t760 t760Var, boolean z, dg60 dg60Var) {
        t760Var.getClass();
        dg60Var.getClass();
        this.a = t760Var;
        this.b = z;
        this.c = dg60Var;
    }

    public static goh0 a(goh0 goh0Var, t760 t760Var, boolean z, dg60 dg60Var, int i) {
        if ((i & 1) != 0) {
            t760Var = goh0Var.a;
        }
        if ((i & 2) != 0) {
            z = goh0Var.b;
        }
        if ((i & 4) != 0) {
            dg60Var = goh0Var.c;
        }
        goh0Var.getClass();
        t760Var.getClass();
        dg60Var.getClass();
        return new goh0(t760Var, z, dg60Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof goh0)) {
            return false;
        }
        goh0 goh0Var = (goh0) obj;
        return Intrinsics.g(this.a, goh0Var.a) && this.b == goh0Var.b && Intrinsics.g(this.c, goh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "UserAutoSpin(count=" + this.a + ", isBuyExtraBall=" + this.b + ", spinState=" + this.c + ')';
    }

    public goh0() {
        this(0);
    }

    public /* synthetic */ goh0(int i) {
        this(t760.b.a, true, dg60.b.a);
    }
}

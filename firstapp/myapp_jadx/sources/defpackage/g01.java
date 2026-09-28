package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g01 {
    public final Object a;
    public final zz0 b;
    public final m9n c;

    public g01(Object obj, zz0 zz0Var, m9n m9nVar) {
        this.a = obj;
        this.b = zz0Var;
        this.c = m9nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g01)) {
            return false;
        }
        g01 g01Var = (g01) obj;
        zz0 zz0Var = g01Var.b;
        zz0 zz0Var2 = this.b;
        return Intrinsics.g(zz0Var2, zz0Var) && zz0Var2.equals(this.a, g01Var.a) && Intrinsics.g(this.c, g01Var.c);
    }

    public final int hashCode() {
        zz0 zz0Var = this.b;
        return this.c.hashCode() + ((zz0Var.hashCode(this.a) + (zz0Var.hashCode() * 31)) * 31);
    }
}

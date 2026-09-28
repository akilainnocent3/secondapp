package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v7k0 {
    public static final pd80 a(pd80 pd80Var, y3l y3lVar) {
        pd80 pd80VarA;
        php phpVarF;
        pd80Var.getClass();
        y3lVar.getClass();
        if (!Intrinsics.g(pd80Var.getKind(), yd80.a.a)) {
            return pd80Var.isInline() ? a(pd80Var.g(0), y3lVar) : pd80Var;
        }
        ygp ygpVarA = ggy.a(pd80Var);
        pd80 descriptor = null;
        if (ygpVarA != null && (phpVarF = y3lVar.f(ygpVarA, m2g.a)) != null) {
            descriptor = phpVarF.getDescriptor();
        }
        return (descriptor == null || (pd80VarA = a(descriptor, y3lVar)) == null) ? pd80Var : pd80VarA;
    }

    public static final u7k0 b(wbp wbpVar, pd80 pd80Var) {
        pd80Var.getClass();
        yd80 kind = pd80Var.getKind();
        if (kind instanceof f120) {
            return u7k0.POLY_OBJ;
        }
        if (Intrinsics.g(kind, ebe0.b.a)) {
            return u7k0.LIST;
        }
        if (!Intrinsics.g(kind, ebe0.c.a)) {
            return u7k0.OBJ;
        }
        pd80 pd80VarA = a(pd80Var.g(0), wbpVar.b);
        yd80 kind2 = pd80VarA.getKind();
        if ((kind2 instanceof bw20) || Intrinsics.g(kind2, yd80.b.a)) {
            return u7k0.MAP;
        }
        throw jdp.b(pd80VarA);
    }
}

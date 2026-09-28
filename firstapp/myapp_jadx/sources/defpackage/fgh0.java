package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fgh0 extends bgh0<dgh0, dgh0> {
    @Override // defpackage.bgh0
    public final void a(dgh0 dgh0Var, int i, int i2) {
        dgh0Var.c((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // defpackage.bgh0
    public final void b(dgh0 dgh0Var, int i, long j) {
        dgh0Var.c((i << 3) | 1, Long.valueOf(j));
    }

    @Override // defpackage.bgh0
    public final void c(dgh0 dgh0Var, int i, dgh0 dgh0Var2) {
        dgh0Var.c((i << 3) | 3, dgh0Var2);
    }

    @Override // defpackage.bgh0
    public final void d(dgh0 dgh0Var, int i, pl5 pl5Var) {
        dgh0Var.c((i << 3) | 2, pl5Var);
    }

    @Override // defpackage.bgh0
    public final void e(dgh0 dgh0Var, int i, long j) {
        dgh0Var.c(i << 3, Long.valueOf(j));
    }

    @Override // defpackage.bgh0
    public final dgh0 f(Object obj) {
        m1k m1kVar = (m1k) obj;
        dgh0 dgh0Var = m1kVar.unknownFields;
        if (dgh0Var != dgh0.f) {
            return dgh0Var;
        }
        dgh0 dgh0Var2 = new dgh0();
        m1kVar.unknownFields = dgh0Var2;
        return dgh0Var2;
    }

    @Override // defpackage.bgh0
    public final dgh0 g(Object obj) {
        return ((m1k) obj).unknownFields;
    }

    @Override // defpackage.bgh0
    public final int h(dgh0 dgh0Var) {
        return dgh0Var.b();
    }

    @Override // defpackage.bgh0
    public final int i(dgh0 dgh0Var) {
        dgh0 dgh0Var2 = dgh0Var;
        int i = dgh0Var2.d;
        if (i != -1) {
            return i;
        }
        int iH0 = 0;
        for (int i2 = 0; i2 < dgh0Var2.a; i2++) {
            int i3 = dgh0Var2.b[i2] >>> 3;
            iH0 += q08.h0(3, (pl5) dgh0Var2.c[i2]) + q08.n0(i3) + q08.m0(2) + (q08.m0(1) * 2);
        }
        dgh0Var2.d = iH0;
        return iH0;
    }

    @Override // defpackage.bgh0
    public final void j(Object obj) {
        dgh0 dgh0Var = ((m1k) obj).unknownFields;
        if (dgh0Var.e) {
            dgh0Var.e = false;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.bgh0
    public final dgh0 k(Object obj, Object obj2) {
        dgh0 dgh0Var = (dgh0) obj;
        dgh0 dgh0Var2 = (dgh0) obj2;
        dgh0 dgh0Var3 = dgh0.f;
        if (dgh0Var3.equals(dgh0Var2)) {
            return dgh0Var;
        }
        if (dgh0Var3.equals(dgh0Var)) {
            int i = dgh0Var.a + dgh0Var2.a;
            int[] iArrCopyOf = Arrays.copyOf(dgh0Var.b, i);
            System.arraycopy(dgh0Var2.b, 0, iArrCopyOf, dgh0Var.a, dgh0Var2.a);
            Object[] objArrCopyOf = Arrays.copyOf(dgh0Var.c, i);
            System.arraycopy(dgh0Var2.c, 0, objArrCopyOf, dgh0Var.a, dgh0Var2.a);
            return new dgh0(i, iArrCopyOf, objArrCopyOf, true);
        }
        dgh0Var.getClass();
        if (dgh0Var2.equals(dgh0Var3)) {
            return dgh0Var;
        }
        if (!dgh0Var.e) {
            bl0.a();
            return null;
        }
        int i2 = dgh0Var.a + dgh0Var2.a;
        dgh0Var.a(i2);
        System.arraycopy(dgh0Var2.b, 0, dgh0Var.b, dgh0Var.a, dgh0Var2.a);
        System.arraycopy(dgh0Var2.c, 0, dgh0Var.c, dgh0Var.a, dgh0Var2.a);
        dgh0Var.a = i2;
        return dgh0Var;
    }

    @Override // defpackage.bgh0
    public final dgh0 m() {
        return new dgh0();
    }

    @Override // defpackage.bgh0
    public final void n(Object obj, dgh0 dgh0Var) {
        ((m1k) obj).unknownFields = dgh0Var;
    }

    @Override // defpackage.bgh0
    public final void o(Object obj, dgh0 dgh0Var) {
        ((m1k) obj).unknownFields = dgh0Var;
    }

    @Override // defpackage.bgh0
    public final dgh0 p(Object obj) {
        dgh0 dgh0Var = (dgh0) obj;
        if (dgh0Var.e) {
            dgh0Var.e = false;
        }
        return dgh0Var;
    }

    @Override // defpackage.bgh0
    public final void q(dgh0 dgh0Var, z7k0 z7k0Var) {
        dgh0 dgh0Var2 = dgh0Var;
        dgh0Var2.getClass();
        z7k0Var.getClass();
        for (int i = 0; i < dgh0Var2.a; i++) {
            int i2 = dgh0Var2.b[i] >>> 3;
            Object obj = dgh0Var2.c[i];
            boolean z = obj instanceof pl5;
            q08 q08Var = ((u08) z7k0Var).a;
            if (z) {
                q08Var.E0(i2, (pl5) obj);
            } else {
                q08Var.D0(i2, (xnv) obj);
            }
        }
    }

    @Override // defpackage.bgh0
    public final void r(dgh0 dgh0Var, z7k0 z7k0Var) {
        dgh0Var.d(z7k0Var);
    }
}

package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class egh0 extends agh0<cgh0, cgh0> {
    @Override // defpackage.agh0
    public final void a(cgh0 cgh0Var, int i, int i2) {
        cgh0Var.c((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // defpackage.agh0
    public final void b(cgh0 cgh0Var, int i, long j) {
        cgh0Var.c((i << 3) | 1, Long.valueOf(j));
    }

    @Override // defpackage.agh0
    public final void c(cgh0 cgh0Var, int i, cgh0 cgh0Var2) {
        cgh0Var.c((i << 3) | 3, cgh0Var2);
    }

    @Override // defpackage.agh0
    public final void d(cgh0 cgh0Var, int i, ql5 ql5Var) {
        cgh0Var.c((i << 3) | 2, ql5Var);
    }

    @Override // defpackage.agh0
    public final void e(cgh0 cgh0Var, int i, long j) {
        cgh0Var.c(i << 3, Long.valueOf(j));
    }

    @Override // defpackage.agh0
    public final cgh0 f(Object obj) {
        n1k n1kVar = (n1k) obj;
        cgh0 cgh0Var = n1kVar.unknownFields;
        if (cgh0Var != cgh0.f) {
            return cgh0Var;
        }
        cgh0 cgh0Var2 = new cgh0();
        n1kVar.unknownFields = cgh0Var2;
        return cgh0Var2;
    }

    @Override // defpackage.agh0
    public final cgh0 g(Object obj) {
        return ((n1k) obj).unknownFields;
    }

    @Override // defpackage.agh0
    public final int h(cgh0 cgh0Var) {
        return cgh0Var.b();
    }

    @Override // defpackage.agh0
    public final int i(cgh0 cgh0Var) {
        cgh0 cgh0Var2 = cgh0Var;
        int i = cgh0Var2.d;
        if (i != -1) {
            return i;
        }
        int iX = 0;
        for (int i2 = 0; i2 < cgh0Var2.a; i2++) {
            int i3 = cgh0Var2.b[i2] >>> 3;
            iX += r08.X(3, (ql5) cgh0Var2.c[i2]) + r08.g0(2, i3) + (r08.f0(1) * 2);
        }
        cgh0Var2.d = iX;
        return iX;
    }

    @Override // defpackage.agh0
    public final void j(Object obj) {
        ((n1k) obj).unknownFields.e = false;
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
    @Override // defpackage.agh0
    public final cgh0 k(Object obj, Object obj2) {
        cgh0 cgh0Var = (cgh0) obj;
        cgh0 cgh0Var2 = (cgh0) obj2;
        cgh0 cgh0Var3 = cgh0.f;
        if (cgh0Var3.equals(cgh0Var2)) {
            return cgh0Var;
        }
        if (cgh0Var3.equals(cgh0Var)) {
            int i = cgh0Var.a + cgh0Var2.a;
            int[] iArrCopyOf = Arrays.copyOf(cgh0Var.b, i);
            System.arraycopy(cgh0Var2.b, 0, iArrCopyOf, cgh0Var.a, cgh0Var2.a);
            Object[] objArrCopyOf = Arrays.copyOf(cgh0Var.c, i);
            System.arraycopy(cgh0Var2.c, 0, objArrCopyOf, cgh0Var.a, cgh0Var2.a);
            return new cgh0(i, iArrCopyOf, objArrCopyOf, true);
        }
        cgh0Var.getClass();
        if (cgh0Var2.equals(cgh0Var3)) {
            return cgh0Var;
        }
        if (!cgh0Var.e) {
            bl0.a();
            return null;
        }
        int i2 = cgh0Var.a + cgh0Var2.a;
        cgh0Var.a(i2);
        System.arraycopy(cgh0Var2.b, 0, cgh0Var.b, cgh0Var.a, cgh0Var2.a);
        System.arraycopy(cgh0Var2.c, 0, cgh0Var.c, cgh0Var.a, cgh0Var2.a);
        cgh0Var.a = i2;
        return cgh0Var;
    }

    @Override // defpackage.agh0
    public final cgh0 m() {
        return new cgh0();
    }

    @Override // defpackage.agh0
    public final void n(Object obj, cgh0 cgh0Var) {
        ((n1k) obj).unknownFields = cgh0Var;
    }

    @Override // defpackage.agh0
    public final void o(Object obj, cgh0 cgh0Var) {
        ((n1k) obj).unknownFields = cgh0Var;
    }

    @Override // defpackage.agh0
    public final cgh0 p(Object obj) {
        cgh0 cgh0Var = (cgh0) obj;
        cgh0Var.e = false;
        return cgh0Var;
    }

    @Override // defpackage.agh0
    public final void q(cgh0 cgh0Var, y7k0 y7k0Var) throws r08.b {
        cgh0 cgh0Var2 = cgh0Var;
        cgh0Var2.getClass();
        y7k0Var.getClass();
        for (int i = 0; i < cgh0Var2.a; i++) {
            int i2 = cgh0Var2.b[i] >>> 3;
            Object obj = cgh0Var2.c[i];
            boolean z = obj instanceof ql5;
            r08.a aVar = ((t08) y7k0Var).a;
            if (z) {
                aVar.v0(1, 3);
                aVar.w0(2, i2);
                aVar.m0(3, (ql5) obj);
                aVar.v0(1, 4);
            } else {
                wnv wnvVar = (wnv) obj;
                aVar.v0(1, 3);
                aVar.w0(2, i2);
                aVar.v0(3, 2);
                aVar.x0(wnvVar.getSerializedSize());
                wnvVar.a(aVar);
                aVar.v0(1, 4);
            }
        }
    }

    @Override // defpackage.agh0
    public final void r(cgh0 cgh0Var, y7k0 y7k0Var) throws r08.b {
        cgh0Var.d(y7k0Var);
    }
}

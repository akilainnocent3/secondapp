package defpackage;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qc6 implements tcf {
    public final a a;
    public final b b;
    public b90 c;
    public b90 d;

    public static final class a {
        public mmd a;
        public asr b;
        public lc6 c;
        public long d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && Intrinsics.g(this.c, aVar.c) && yw90.a(this.d, aVar.d);
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) yw90.f(this.d)) + ')';
        }
    }

    public static final class b {
        public final rc6 a = new rc6(this);
        public v6l b;

        public b() {
        }

        public final lc6 a() {
            return qc6.this.a.c;
        }

        public final mmd b() {
            return qc6.this.a.a;
        }

        public final asr c() {
            return qc6.this.a.b;
        }

        public final long d() {
            return qc6.this.a.d;
        }

        public final void e(lc6 lc6Var) {
            qc6.this.a.c = lc6Var;
        }

        public final void f(mmd mmdVar) {
            qc6.this.a.a = mmdVar;
        }

        public final void g(asr asrVar) {
            qc6.this.a.b = asrVar;
        }

        public final void h(long j) {
            qc6.this.a.d = j;
        }
    }

    public qc6() {
        asr asrVar = asr.a;
        a aVar = new a();
        aVar.a = ocf.a;
        aVar.b = asrVar;
        aVar.c = u1g.a;
        aVar.d = 0L;
        this.a = aVar;
        this.b = new b();
    }

    public static zqz e(qc6 qc6Var, long j, wcf wcfVar, float f, l58 l58Var, int i) {
        zqz zqzVarI = qc6Var.i(wcfVar);
        if (f != 1.0f) {
            j = j58.c(j58.d(j) * f, j);
        }
        b90 b90Var = (b90) zqzVarI;
        long jD = b90Var.d();
        int i2 = j58.n;
        if (!nbh0.a(jD, j)) {
            b90Var.m(j);
        }
        if (b90Var.c != null) {
            b90Var.f(null);
        }
        if (!Intrinsics.g(b90Var.d, l58Var)) {
            b90Var.k(l58Var);
        }
        if (b90Var.b != i) {
            b90Var.c(i);
        }
        if (b90Var.a.isFilterBitmap()) {
            return zqzVarI;
        }
        b90Var.l(1);
        return zqzVarI;
    }

    @Override // defpackage.tcf
    public final void B0(ya5 ya5Var, long j, long j2, long j3, float f, wcf wcfVar, l58 l58Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.a.c.l(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), g(ya5Var, wcfVar, f, l58Var, i, 1));
    }

    @Override // defpackage.tcf
    public final void B1(long j, long j2, long j3, long j4, wcf wcfVar, float f) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.l(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), e(this, j, wcfVar, f, null, 3));
    }

    @Override // defpackage.tcf
    public final b F1() {
        return this.b;
    }

    @Override // defpackage.tcf
    public final void G(long j, float f, long j2, float f2, wcf wcfVar) {
        this.a.c.t(f, j2, e(this, j, wcfVar, f2, null, 3));
    }

    @Override // defpackage.tcf
    public final void H(bxz bxzVar, long j, float f, wcf wcfVar) {
        this.a.c.m(bxzVar, e(this, j, wcfVar, f, null, 3));
    }

    @Override // defpackage.tcf
    public final void H0(ya5 ya5Var, float f, float f2, boolean z, long j, long j2, wcf wcfVar) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.a.c.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, z, g(ya5Var, wcfVar, 1.0f, null, 3, 1));
    }

    @Override // defpackage.tcf
    public final void L0(dx80 dx80Var, float f, long j, wcf wcfVar) {
        this.a.c.t(f, j, g(dx80Var, wcfVar, 1.0f, null, 3, 1));
    }

    @Override // defpackage.tcf
    public final void M1(c8n c8nVar, long j, float f, wcf wcfVar, l58 l58Var, int i) {
        this.a.c.h(c8nVar, j, g(null, wcfVar, f, l58Var, i, 1));
    }

    @Override // defpackage.tcf
    public final void N1(bxz bxzVar, ya5 ya5Var, float f, wcf wcfVar, l58 l58Var, int i) {
        this.a.c.m(bxzVar, g(ya5Var, wcfVar, f, l58Var, i, 1));
    }

    @Override // defpackage.tcf
    public final void O1(long j, long j2, long j3, float f, wcf wcfVar, l58 l58Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.c.v(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), e(this, j, wcfVar, f, l58Var, i));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.tcf
    public final void S(long j, long j2, long j3, float f, int i, k90 k90Var) {
        lc6 lc6Var = this.a.c;
        b90 b90VarA = this.d;
        if (b90VarA == null) {
            b90VarA = c90.a();
            b90VarA.h(1);
            this.d = b90VarA;
        }
        Paint paint = b90VarA.a;
        long jD = b90VarA.d();
        int i2 = j58.n;
        if (!nbh0.a(jD, j)) {
            b90VarA.m(j);
        }
        if (b90VarA.c != null) {
            b90VarA.f(null);
        }
        if (!Intrinsics.g(b90VarA.d, null)) {
            b90VarA.k(null);
        }
        if (b90VarA.b != 3) {
            b90VarA.c(3);
        }
        if (paint.getStrokeWidth() != f) {
            b90VarA.r(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            b90VarA.q(4.0f);
        }
        if (b90VarA.i() != i) {
            b90VarA.o(i);
        }
        if (b90VarA.j() != 0) {
            b90VarA.p(0);
        }
        if (!Intrinsics.g(b90VarA.e, k90Var)) {
            b90VarA.n(k90Var);
        }
        if (!paint.isFilterBitmap()) {
            b90VarA.l(1);
        }
        lc6Var.k(j2, j3, b90VarA);
    }

    @Override // defpackage.tcf
    public final void Z(long j, long j2, long j3, wcf wcfVar) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.u(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), e(this, j, wcfVar, 1.0f, null, 3));
    }

    @Override // defpackage.tcf
    public final void a1(long j, float f, float f2, boolean z, long j2, long j3, float f3, wcf wcfVar) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, z, e(this, j, wcfVar, f3, null, 3));
    }

    @Override // defpackage.tcf
    public final void a2(ya5 ya5Var, long j, long j2, float f, wcf wcfVar, l58 l58Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.a.c.v(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), g(ya5Var, wcfVar, f, l58Var, i, 1));
    }

    @Override // defpackage.tcf
    public final void c1(c8n c8nVar, long j, long j2, long j3, long j4, float f, wcf wcfVar, l58 l58Var, int i, int i2) {
        this.a.c.b(c8nVar, j, j2, j3, j4, g(null, wcfVar, f, l58Var, i, i2));
    }

    public final zqz g(ya5 ya5Var, wcf wcfVar, float f, l58 l58Var, int i, int i2) {
        zqz zqzVarI = i(wcfVar);
        if (ya5Var != null) {
            ya5Var.a(f, d(), zqzVarI);
        } else {
            b90 b90Var = (b90) zqzVarI;
            if (b90Var.c != null) {
                b90Var.f(null);
            }
            long jD = b90Var.d();
            long j = j58.b;
            if (!nbh0.a(jD, j)) {
                b90Var.m(j);
            }
            if (b90Var.a() != f) {
                b90Var.b(f);
            }
        }
        b90 b90Var2 = (b90) zqzVarI;
        if (!Intrinsics.g(b90Var2.d, l58Var)) {
            b90Var2.k(l58Var);
        }
        if (b90Var2.b != i) {
            b90Var2.c(i);
        }
        if (b90Var2.a.isFilterBitmap() == i2) {
            return zqzVarI;
        }
        b90Var2.l(i2);
        return zqzVarI;
    }

    @Override // defpackage.mmd
    public final float getDensity() {
        return this.a.a.getDensity();
    }

    @Override // defpackage.tcf
    public final asr getLayoutDirection() {
        return this.a.b;
    }

    public final zqz i(wcf wcfVar) {
        if (Intrinsics.g(wcfVar, rlh.a)) {
            b90 b90Var = this.c;
            if (b90Var != null) {
                return b90Var;
            }
            b90 b90VarA = c90.a();
            b90VarA.h(0);
            this.c = b90VarA;
            return b90VarA;
        }
        if (!(wcfVar instanceof yae0)) {
            uhc.a();
            return null;
        }
        b90 b90VarA2 = this.d;
        if (b90VarA2 == null) {
            b90VarA2 = c90.a();
            b90VarA2.h(1);
            this.d = b90VarA2;
        }
        Paint paint = b90VarA2.a;
        float strokeWidth = paint.getStrokeWidth();
        yae0 yae0Var = (yae0) wcfVar;
        k90 k90Var = yae0Var.e;
        float f = yae0Var.a;
        if (strokeWidth != f) {
            b90VarA2.r(f);
        }
        int i = b90VarA2.i();
        int i2 = yae0Var.c;
        if (i != i2) {
            b90VarA2.o(i2);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = yae0Var.b;
        if (strokeMiter != f2) {
            b90VarA2.q(f2);
        }
        int iJ = b90VarA2.j();
        int i3 = yae0Var.d;
        if (iJ != i3) {
            b90VarA2.p(i3);
        }
        if (!Intrinsics.g(b90VarA2.e, k90Var)) {
            b90VarA2.n(k90Var);
        }
        return b90VarA2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.tcf
    public final void p1(ya5 ya5Var, long j, long j2, float f, int i, float f2) {
        lc6 lc6Var = this.a.c;
        b90 b90VarA = this.d;
        if (b90VarA == null) {
            b90VarA = c90.a();
            b90VarA.h(1);
            this.d = b90VarA;
        }
        Paint paint = b90VarA.a;
        if (ya5Var != null) {
            ya5Var.a(f2, d(), b90VarA);
        } else if (b90VarA.a() != f2) {
            b90VarA.b(f2);
        }
        if (!Intrinsics.g(b90VarA.d, null)) {
            b90VarA.k(null);
        }
        if (b90VarA.b != 3) {
            b90VarA.c(3);
        }
        if (paint.getStrokeWidth() != f) {
            b90VarA.r(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            b90VarA.q(4.0f);
        }
        if (b90VarA.i() != i) {
            b90VarA.o(i);
        }
        if (b90VarA.j() != 0) {
            b90VarA.p(0);
        }
        if (!Intrinsics.g(b90VarA.e, null)) {
            b90VarA.n(null);
        }
        if (!paint.isFilterBitmap()) {
            b90VarA.l(1);
        }
        lc6Var.k(j, j2, b90VarA);
    }

    @Override // defpackage.mmd
    public final float y1() {
        return this.a.a.y1();
    }
}

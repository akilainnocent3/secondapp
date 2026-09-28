package defpackage;

import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import com.google.protobuf.Reader;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class zpz implements fr70 {
    public long A;
    public final fyr B;
    public final ytw<Unit> C;
    public final ytw<Unit> D;
    public final ytw E;
    public final ytw F;
    public final ytw<Boolean> G;
    public final ytw<Boolean> H;
    public boolean a;
    public npz b;
    public final ytw c;
    public final qpz d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final sfd k;
    public final boolean l;
    public int m;
    public gyr.b n;
    public boolean o;
    public final ytw<npz> p;
    public mmd q;
    public final qsw r;
    public final osw s;
    public final osw t;
    public final mae u;
    public final gyr v;
    public final jwr w;
    public final rp1 x;
    public final ytw y;
    public final xpz z;

    @c0d(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {638, 643}, m = "scroll$suspendImpl")
    public static final class a extends x1b {
        public zpz a;
        public huw b;
        public tje0 c;
        public /* synthetic */ Object d;
        public int f;

        public a(v1b<? super a> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return zpz.u(zpz.this, null, null, this);
        }
    }

    public zpz(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            zkn.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = m.b(new gly(0L));
        this.d = new qpz(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        this.k = new sfd(new ixb(this, 2));
        int i2 = 1;
        this.l = true;
        this.m = -1;
        this.p = m.a(eqz.a, epx.a);
        this.q = eqz.b;
        this.r = new qsw();
        this.s = k.a(-1);
        this.t = k.a(i);
        rzu rzuVar = new rzu(this, i2);
        t6a0<qwo> t6a0Var = a6a0.a;
        bbe0 bbe0Var = bbe0.b;
        this.u = new mae(rzuVar, bbe0Var);
        new mae(new szu(this, i2), bbe0Var);
        this.v = new gyr(null, new o43(this, 3));
        this.w = new jwr();
        this.x = new rp1();
        this.y = m.b(null);
        this.z = new xpz(this);
        this.A = oxa.b(0, 0, 0, 15);
        this.B = new fyr();
        this.C = aey.a();
        this.D = aey.a();
        Boolean bool = Boolean.FALSE;
        this.E = m.b(bool);
        this.F = m.b(bool);
        this.G = m.b(bool);
        this.H = m.b(bool);
    }

    public static int i(boolean z, epz epzVar) {
        if (!z) {
            return (((rnz) CollectionsKt.T(epzVar.k())).getIndex() - epzVar.o()) - 1;
        }
        int iO = epzVar.o() + 1;
        return iO < 0 ? Reader.READ_DONE : ((rnz) CollectionsKt.b0(epzVar.k())).getIndex() + iO;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r9.b(r7, r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.functions.Function2<? super tp70, ? super v1b<? super kotlin.Unit>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v10, types: [sfd] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object u(defpackage.zpz r6, defpackage.huw r7, kotlin.jvm.functions.Function2<? super defpackage.tp70, ? super defpackage.v1b<? super kotlin.Unit>, ? extends java.lang.Object> r8, defpackage.v1b<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof zpz.a
            if (r0 == 0) goto L13
            r0 = r9
            zpz$a r0 = (zpz.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            zpz$a r0 = new zpz$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.d
            y5b r1 = defpackage.y5b.a
            int r2 = r0.f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            zpz r6 = r0.a
            defpackage.uj50.b(r9)
            goto L80
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L33:
            tje0 r6 = r0.c
            r8 = r6
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            huw r7 = r0.b
            zpz r6 = r0.a
            defpackage.uj50.b(r9)
            goto L5c
        L40:
            defpackage.uj50.b(r9)
            r0.a = r6
            r0.b = r7
            r9 = r8
            tje0 r9 = (defpackage.tje0) r9
            r0.c = r9
            r0.f = r5
            rp1 r9 = r6.x
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r9 = kotlin.Unit.a
        L59:
            if (r9 != r1) goto L5c
            goto L7f
        L5c:
            sfd r9 = r6.k
            boolean r9 = r9.c()
            if (r9 != 0) goto L6f
            int r9 = r6.k()
            osw r2 = r6.t
            u5a0 r2 = (defpackage.u5a0) r2
            r2.k(r9)
        L6f:
            sfd r9 = r6.k
            r0.a = r6
            r0.b = r3
            r0.c = r3
            r0.f = r4
            java.lang.Object r7 = r9.b(r7, r8, r0)
            if (r7 != r1) goto L80
        L7f:
            return r1
        L80:
            osw r6 = r6.s
            u5a0 r6 = (defpackage.u5a0) r6
            r7 = -1
            r6.k(r7)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpz.u(zpz, huw, kotlin.jvm.functions.Function2, v1b):java.lang.Object");
    }

    public static Object v(int i, v1b v1bVar, zpz zpzVar) {
        zpzVar.getClass();
        Object objB = zpzVar.b(huw.a, new aqz(i, null, zpzVar), v1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }

    @Override // defpackage.fr70
    public final float a(float f) {
        return this.k.a(f);
    }

    @Override // defpackage.fr70
    public final Object b(huw huwVar, Function2<? super tp70, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super Unit> v1bVar) {
        return u(this, huwVar, function2, v1bVar);
    }

    @Override // defpackage.fr70
    public final boolean c() {
        return this.k.c();
    }

    @Override // defpackage.fr70
    public final boolean d() {
        return ((Boolean) ((x5a0) this.F).getValue()).booleanValue();
    }

    @Override // defpackage.fr70
    public final boolean e() {
        return ((Boolean) ((x5a0) this.E).getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (b(defpackage.huw.a, r6, r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r13, defpackage.fkd0 r14, defpackage.v1b r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.vpz
            if (r0 == 0) goto L13
            r0 = r15
            vpz r0 = (defpackage.vpz) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            vpz r0 = new vpz
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L32
            if (r2 != r5) goto L2c
            defpackage.uj50.b(r15)
            goto L89
        L2c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r3
        L32:
            int r13 = r0.a
            fkd0 r14 = r0.b
            defpackage.uj50.b(r15)
        L39:
            r10 = r14
            goto L6a
        L3b:
            defpackage.uj50.b(r15)
            int r15 = r12.k()
            if (r13 != r15) goto L4d
            float r15 = r12.l()
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 != 0) goto L4d
            goto L53
        L4d:
            int r15 = r12.n()
            if (r15 != 0) goto L56
        L53:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        L56:
            r0.b = r14
            r0.a = r13
            r0.e = r6
            rp1 r15 = r12.x
            java.lang.Object r15 = r15.a(r0)
            if (r15 != r1) goto L65
            goto L67
        L65:
            kotlin.Unit r15 = kotlin.Unit.a
        L67:
            if (r15 != r1) goto L39
            goto L88
        L6a:
            int r8 = r12.j(r13)
            int r13 = r12.p()
            float r13 = (float) r13
            float r9 = r4 * r13
            wpz r6 = new wpz
            r11 = 0
            r7 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r0.b = r3
            r0.e = r5
            huw r12 = defpackage.huw.a
            java.lang.Object r12 = r7.b(r12, r6, r0)
            if (r12 != r1) goto L89
        L88:
            return r1
        L89:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpz.f(int, fkd0, v1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0127 A[Catch: all -> 0x0135, TryCatch #0 {all -> 0x0135, blocks: (B:52:0x00c4, B:56:0x00d3, B:59:0x00dc, B:62:0x00e9, B:64:0x00f7, B:72:0x012d, B:70:0x0127, B:67:0x010f), top: B:85:0x00c4 }] */
    public final void h(npz npzVar, boolean z, boolean z2) {
        List<fiv> list = npzVar.a;
        int i = npzVar.l;
        fiv fivVar = npzVar.i;
        fiv fivVar2 = npzVar.j;
        float f = npzVar.k;
        this.v.f = list.size();
        if (!z && this.a) {
            this.b = npzVar;
            return;
        }
        boolean z3 = true;
        if (z) {
            this.a = true;
        }
        qpz qpzVar = this.d;
        if (z2) {
            ((t5a0) qpzVar.c).A(f);
        } else {
            qpzVar.getClass();
            qpzVar.e = fivVar2 != null ? fivVar2.d : null;
            if (qpzVar.d || !list.isEmpty()) {
                qpzVar.d = true;
                int i2 = fivVar2 != null ? fivVar2.a : 0;
                ((u5a0) qpzVar.b).k(i2);
                qpzVar.f.b(i2);
                ((t5a0) qpzVar.c).A(f);
            }
            if (this.m != -1 && !list.isEmpty()) {
                if (this.m != i(this.o, npzVar)) {
                    this.m = -1;
                    gyr.b bVar = this.n;
                    if (bVar != null) {
                        bVar.cancel();
                    }
                    this.n = null;
                }
            }
        }
        ((x5a0) this.p).setValue(npzVar);
        ((x5a0) this.E).setValue(Boolean.valueOf(npzVar.m));
        if ((fivVar != null ? fivVar.a : 0) == 0 && i == 0) {
            z3 = false;
        }
        ((x5a0) this.F).setValue(Boolean.valueOf(z3));
        if (fivVar != null) {
            this.e = fivVar.a;
        }
        this.f = i;
        c5a0.e.getClass();
        c5a0 c5a0VarA = c5a0.a.a();
        Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
        c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
        try {
            if (this.l && npzVar.h < n() && Math.abs(this.j) > 0.5f) {
                float f2 = this.j;
                if (m().a() == i3z.a) {
                    if (Math.signum(f2) != Math.signum(-Float.intBitsToFloat((int) (r() & 4294967295L)))) {
                        if (s()) {
                        }
                    }
                } else if (Math.signum(f2) != Math.signum(-Float.intBitsToFloat((int) (r() >> 32)))) {
                    if (s()) {
                    }
                }
                t(this.j, npzVar);
                Unit unit = Unit.a;
            }
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            this.g = eqz.a(npzVar, n());
            n();
            int iD = (int) (npzVar.e == i3z.b ? npzVar.d() >> 32 : npzVar.d() & 4294967295L);
            this.h = f.e(npzVar.n.d(iD, npzVar.b, -npzVar.f, npzVar.d), 0, iD);
        } catch (Throwable th) {
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            throw th;
        }
    }

    public final int j(int i) {
        if (n() > 0) {
            return f.e(i, 0, n() - 1);
        }
        return 0;
    }

    public final int k() {
        return ((u5a0) this.d.b).D();
    }

    public final float l() {
        return ((t5a0) this.d.c).j();
    }

    public final epz m() {
        return (epz) ((x5a0) this.p).getValue();
    }

    public abstract int n();

    public final int o() {
        return ((npz) ((x5a0) this.p).getValue()).b;
    }

    public final int p() {
        return ((npz) ((x5a0) this.p).getValue()).c + o();
    }

    public final int q() {
        return ((Number) this.u.getValue()).intValue();
    }

    public final long r() {
        return ((gly) ((x5a0) this.c).getValue()).a;
    }

    public final boolean s() {
        return ((int) Float.intBitsToFloat((int) (r() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (r() & 4294967295L))) == 0;
    }

    public final void t(float f, epz epzVar) {
        gyr.b bVar;
        gyr.b bVar2;
        gyr.b bVar3;
        if (this.l && !epzVar.k().isEmpty()) {
            boolean z = f > 0.0f;
            int i = i(z, epzVar);
            if (i < 0 || i >= n()) {
                return;
            }
            if (i != this.m) {
                if (this.o != z && (bVar3 = this.n) != null) {
                    bVar3.cancel();
                }
                this.o = z;
                this.m = i;
                this.n = this.v.a(i, this.A, true, null);
            }
            if (z) {
                if ((((rnz) CollectionsKt.b0(epzVar.k())).getOffset() + (epzVar.n() + epzVar.j())) - epzVar.f() >= f || (bVar2 = this.n) == null) {
                    return;
                }
                bVar2.c();
                return;
            }
            if (epzVar.h() - ((rnz) CollectionsKt.T(epzVar.k())).getOffset() >= (-f) || (bVar = this.n) == null) {
                return;
            }
            bVar.c();
        }
    }

    public final void w(int i, float f, boolean z) {
        qpz qpzVar = this.d;
        ((u5a0) qpzVar.b).k(i);
        qpzVar.f.b(i);
        ((t5a0) qpzVar.c).A(f);
        qpzVar.e = null;
        if (!z) {
            this.D.setValue(Unit.a);
            return;
        }
        y250 y250Var = (y250) ((x5a0) this.y).getValue();
        if (y250Var != null) {
            y250Var.d();
        }
    }

    public zpz() {
        this(0, 0.0f);
    }
}

package defpackage;

import com.google.protobuf.Reader;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ywx extends xkt implements vhv, urr, xgz {
    public static final d c0 = d.a;
    public static final c d0 = c.a;
    public static final no50 e0;
    public static final frr f0;
    public static final float[] g0;
    public static final a h0;
    public static final b i0;
    public final tsr E;
    public boolean F;
    public boolean G;
    public ywx H;
    public ywx I;
    public boolean J;
    public boolean K;
    public Function1<? super a7l, Unit> L;
    public mmd M;
    public asr N;
    public biv P;
    public dtw<kt> Q;
    public float S;
    public qtw T;
    public frr U;
    public v6l V;
    public lc6 W;
    public zwx X;
    public boolean Z;
    public vgz a0;
    public v6l b0;
    public float O = 0.8f;
    public long R = 0;
    public final f Y = new f();

    public static final class a implements e {
        @Override // ywx.e
        public final int a() {
            return 16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3, types: [duw] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6, types: [duw] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.ui.d$c] */
        /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.d$c] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.ui.d$c] */
        /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // ywx.e
        public final boolean b(androidx.compose.ui.d.c cVar) {
            ?? duwVar = 0;
            while (true) {
                int i = 0;
                if (cVar == 0) {
                    return false;
                }
                if (cVar instanceof s020) {
                    ((s020) cVar).i0();
                } else if ((cVar.c & 16) != 0 && (cVar instanceof tkd)) {
                    androidx.compose.ui.d.c cVar2 = ((tkd) cVar).E;
                    duwVar = duwVar;
                    cVar = cVar;
                    while (cVar2 != null) {
                        if ((cVar2.c & 16) != 0) {
                            i++;
                            if (i == 1) {
                                duwVar = duwVar;
                                cVar = cVar2;
                            } else {
                                if (duwVar == 0) {
                                    duwVar = new duw(new androidx.compose.ui.d.c[16]);
                                }
                                if (cVar != 0) {
                                    duwVar.b(cVar);
                                    cVar = 0;
                                }
                                duwVar.b(cVar2);
                            }
                        }
                        cVar2 = cVar2.f;
                        duwVar = duwVar;
                        cVar = cVar;
                    }
                    if (i == 1) {
                    }
                }
                cVar = pkd.c(duwVar);
            }
        }

        @Override // ywx.e
        public final void c(tsr tsrVar, long j, iam iamVar, int i, boolean z) {
            tsrVar.L(j, iamVar, i, z);
        }

        @Override // ywx.e
        public final boolean d(tsr tsrVar) {
            return true;
        }
    }

    public static final class b implements e {
        @Override // ywx.e
        public final int a() {
            return 8;
        }

        @Override // ywx.e
        public final boolean b(androidx.compose.ui.d.c cVar) {
            return false;
        }

        @Override // ywx.e
        public final void c(tsr tsrVar, long j, iam iamVar, int i, boolean z) {
            wwx wwxVar = tsrVar.U;
            ywx ywxVar = wwxVar.d;
            d dVar = ywx.c0;
            wwxVar.d.W1(ywx.i0, ywxVar.t1(j, true), iamVar, 1, z);
        }

        @Override // ywx.e
        public final boolean d(tsr tsrVar) {
            sa80 sa80VarF = tsrVar.f();
            boolean z = false;
            if (sa80VarF != null && sa80VarF.d) {
                z = true;
            }
            return !z;
        }
    }

    public static final class c extends qlr implements Function1<ywx, Unit> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ywx ywxVar) {
            vgz vgzVar = ywxVar.a0;
            if (vgzVar != null) {
                vgzVar.invalidate();
            }
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function1<ywx, Unit> {
        public static final d a = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ywx ywxVar) {
            ywx ywxVar2 = ywxVar;
            if (ywxVar2.Z0() && ywxVar2.t2(true)) {
                tsr tsrVar = ywxVar2.E;
                ysr ysrVar = tsrVar.V;
                if (ysrVar.l > 0) {
                    if (ysrVar.k || ysrVar.j) {
                        tsrVar.g0(false);
                    }
                    ysrVar.p.J0();
                }
                tsrVar.X();
                wgz wgzVarA = xsr.a(tsrVar);
                rk40 rectManager = wgzVarA.getRectManager();
                if (ywxVar2 == tsrVar.U.d) {
                    rectManager.g(tsrVar, false);
                    rectManager.e(tsrVar);
                } else {
                    rectManager.f(tsrVar);
                }
                if (tsrVar.e0 > 0) {
                    wgzVarA.j(tsrVar);
                }
            }
            return Unit.a;
        }
    }

    public interface e {
        int a();

        boolean b(androidx.compose.ui.d.c cVar);

        void c(tsr tsrVar, long j, iam iamVar, int i, boolean z);

        boolean d(tsr tsrVar);
    }

    public static final class f extends qlr implements Function0<Unit> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ywx ywxVar = ywx.this.I;
            if (ywxVar != null) {
                ywxVar.Y1();
            }
            return Unit.a;
        }
    }

    public static final class g extends qlr implements Function0<Unit> {
        public final /* synthetic */ androidx.compose.ui.d.c b;
        public final /* synthetic */ e c;
        public final /* synthetic */ long d;
        public final /* synthetic */ iam e;
        public final /* synthetic */ int f;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ float v;
        public final /* synthetic */ boolean w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.compose.ui.d.c cVar, e eVar, long j, iam iamVar, int i, boolean z, float f, boolean z2) {
            super(0);
            this.b = cVar;
            this.c = eVar;
            this.d = j;
            this.e = iamVar;
            this.f = i;
            this.i = z;
            this.v = f;
            this.w = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ywx.this.h2(cxx.a(this.b, this.c.a()), this.c, this.d, this.e, this.f, this.i, this.v, this.w);
            return Unit.a;
        }
    }

    public static final class h extends qlr implements Function0<Unit> {
        public final /* synthetic */ Function1<a7l, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function1<? super a7l, Unit> function1) {
            super(0);
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            no50 no50Var = ywx.e0;
            this.a.invoke(no50Var);
            no50Var.L = no50Var.D.a(no50Var.G, no50Var.I, no50Var.H);
            return Unit.a;
        }
    }

    static {
        no50 no50Var = new no50();
        no50Var.b = 1.0f;
        no50Var.c = 1.0f;
        no50Var.d = 1.0f;
        long j = b7l.a;
        no50Var.v = j;
        no50Var.w = j;
        no50Var.B = 8.0f;
        no50Var.C = jsg0.b;
        no50Var.D = zk40.a;
        no50Var.F = 0;
        no50Var.G = 9205357640488583168L;
        no50Var.H = omd.a();
        no50Var.I = asr.a;
        no50Var.K = 3;
        e0 = no50Var;
        f0 = new frr();
        g0 = ddv.a();
        h0 = new a();
        i0 = new b();
    }

    public ywx(tsr tsrVar) {
        this.E = tsrVar;
        this.M = tsrVar.N;
        this.N = tsrVar.O;
    }

    public static ywx n2(urr urrVar) {
        ywx ywxVar;
        zkt zktVar = urrVar instanceof zkt ? (zkt) urrVar : null;
        if (zktVar != null && (ywxVar = zktVar.a.E) != null) {
            return ywxVar;
        }
        urrVar.getClass();
        return (ywx) urrVar;
    }

    @Override // defpackage.urr
    public final void C(urr urrVar, float[] fArr) {
        ywx ywxVarN2 = n2(urrVar);
        ywxVarN2.d2();
        ywx ywxVarS1 = s1(ywxVarN2);
        ddv.d(fArr);
        ywxVarN2.r2(ywxVarS1, fArr);
        q2(ywxVarS1, fArr);
    }

    @Override // defpackage.urr
    public final long D(long j) {
        if (!E1().C) {
            wkn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        urr urrVarC = eb9.c(this);
        return Q(urrVarC, gly.e(xsr.a(this.E).t(j), urrVarC.i0(0L)), true);
    }

    public final long D1() {
        return this.M.U1(this.E.P.f());
    }

    public abstract androidx.compose.ui.d.c E1();

    public final androidx.compose.ui.d.c H1(int i) {
        boolean zG = dxx.g(i);
        androidx.compose.ui.d.c cVarE1 = E1();
        if (!zG && (cVarE1 = cVarE1.e) == null) {
            return null;
        }
        for (androidx.compose.ui.d.c cVarL1 = L1(zG); cVarL1 != null && (cVarL1.d & i) != 0; cVarL1 = cVarL1.f) {
            if ((cVarL1.c & i) != 0) {
                return cVarL1;
            }
            if (cVarL1 == cVarE1) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.xkt
    public final xkt K0() {
        return this.H;
    }

    public final androidx.compose.ui.d.c L1(boolean z) {
        androidx.compose.ui.d.c cVarE1;
        wwx wwxVar = this.E.U;
        if (wwxVar.d == this) {
            return wwxVar.f;
        }
        ywx ywxVar = this.I;
        if (!z) {
            if (ywxVar != null) {
                return ywxVar.E1();
            }
            return null;
        }
        if (ywxVar == null || (cVarE1 = ywxVar.E1()) == null) {
            return null;
        }
        return cVarE1.f;
    }

    @Override // defpackage.urr
    public final long M(urr urrVar, long j) {
        return Q(urrVar, j, true);
    }

    @Override // defpackage.xkt
    public final boolean N0() {
        return this.P != null;
    }

    @Override // defpackage.xkt
    public final biv O0() {
        biv bivVar = this.P;
        if (bivVar != null) {
            return bivVar;
        }
        ib5.a("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.urr
    public final lk40 P(urr urrVar, boolean z) {
        if (!E1().C) {
            wkn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!urrVar.e()) {
            wkn.c("LayoutCoordinates " + urrVar + " is not attached!");
        }
        ywx ywxVarN2 = n2(urrVar);
        ywxVarN2.d2();
        ywx ywxVarS1 = s1(ywxVarN2);
        qtw qtwVar = this.T;
        if (qtwVar == null) {
            qtwVar = new qtw();
            this.T = qtwVar;
        }
        qtwVar.a = 0.0f;
        qtwVar.b = 0.0f;
        qtwVar.c = (int) (urrVar.a() >> 32);
        qtwVar.d = (int) (urrVar.a() & 4294967295L);
        while (ywxVarN2 != ywxVarS1) {
            ywxVarN2.k2(qtwVar, z, false);
            if (qtwVar.b()) {
                return lk40.e;
            }
            ywxVarN2 = ywxVarN2.I;
            ywxVarN2.getClass();
        }
        Y0(ywxVarS1, qtwVar, z);
        return new lk40(qtwVar.a, qtwVar.b, qtwVar.c, qtwVar.d);
    }

    public final void P1(androidx.compose.ui.d.c cVar, e eVar, long j, iam iamVar, int i, boolean z) {
        if (cVar == null) {
            X1(eVar, j, iamVar, i, z);
            return;
        }
        int i2 = iamVar.c;
        etw<Object> etwVar = iamVar.a;
        iamVar.c(i2 + 1, etwVar.b);
        iamVar.c++;
        etwVar.g(cVar);
        iamVar.b.a(jam.a(z, -1.0f, false));
        P1(cxx.a(cVar, eVar.a()), eVar, j, iamVar, i, z);
        iamVar.c = i2;
    }

    @Override // defpackage.urr
    public final long Q(urr urrVar, long j, boolean z) {
        if (urrVar instanceof zkt) {
            zkt zktVar = (zkt) urrVar;
            zktVar.a.E.d2();
            return zktVar.Q(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        ywx ywxVarN2 = n2(urrVar);
        ywxVarN2.d2();
        ywx ywxVarS1 = s1(ywxVarN2);
        while (ywxVarN2 != ywxVarS1) {
            j = ywxVarN2.o2(j, z);
            ywxVarN2 = ywxVarN2.I;
            ywxVarN2.getClass();
        }
        return h1(ywxVarS1, j, z);
    }

    @Override // defpackage.xkt
    public final xkt Q0() {
        return this.I;
    }

    @Override // defpackage.xkt
    public final long R0() {
        return this.R;
    }

    public final void S1(androidx.compose.ui.d.c cVar, e eVar, long j, iam iamVar, int i, boolean z, float f2) {
        if (cVar == null) {
            X1(eVar, j, iamVar, i, z);
            return;
        }
        int i2 = iamVar.c;
        etw<Object> etwVar = iamVar.a;
        iamVar.c(i2 + 1, etwVar.b);
        iamVar.c++;
        etwVar.g(cVar);
        iamVar.b.a(jam.a(z, f2, false));
        h2(cxx.a(cVar, eVar.a()), eVar, j, iamVar, i, z, f2, true);
        iamVar.c = i2;
    }

    @Override // defpackage.urr
    public final long T(long j) {
        return xsr.a(this.E).b(i0(j));
    }

    @Override // defpackage.xkt, defpackage.civ
    public final tsr T1() {
        return this.E;
    }

    @Override // defpackage.urr
    public final void W(float[] fArr) {
        wgz wgzVarA = xsr.a(this.E);
        ywx ywxVarN2 = n2(eb9.c(this));
        r2(ywxVarN2, fArr);
        if (wgzVarA instanceof gdv) {
            ((gdv) wgzVarA).i(fArr);
            return;
        }
        long jW = ywxVarN2.w(0L);
        if ((9223372034707292159L & jW) != 9205357640488583168L) {
            ddv.h(fArr, Float.intBitsToFloat((int) (jW >> 32)), Float.intBitsToFloat((int) (jW & 4294967295L)));
        }
    }

    @Override // defpackage.xkt
    public final void W0() {
        v6l v6lVar = this.b0;
        long j = this.R;
        if (v6lVar != null) {
            r0(j, this.S, v6lVar);
        } else {
            t0(j, this.S, this.L);
        }
    }

    public final void W1(e eVar, long j, iam iamVar, int i, boolean z) {
        boolean z2;
        etw<Object> etwVar = iamVar.a;
        androidx.compose.ui.d.c cVarH1 = H1(eVar.a());
        boolean z3 = false;
        if (!u2(j)) {
            if (i == 1) {
                float fK1 = k1(j, D1());
                if ((Float.floatToRawIntBits(fK1) & Reader.READ_DONE) < 2139095040) {
                    if (iamVar.c != etwVar.b - 1) {
                        if (ite.a(iamVar.b(), jam.a(false, fK1, false)) <= 0) {
                            return;
                        }
                    }
                    S1(cVarH1, eVar, j, iamVar, i, false, fK1);
                    return;
                }
                return;
            }
            return;
        }
        if (cVarH1 == null) {
            X1(eVar, j, iamVar, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < o0() && fIntBitsToFloat2 < l0()) {
            P1(cVarH1, eVar, j, iamVar, i, z);
            return;
        }
        float fK2 = i == 1 ? k1(j, D1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fK2) & Reader.READ_DONE) < 2139095040) {
            if (iamVar.c == etwVar.b - 1) {
                z2 = z;
            } else {
                z2 = z;
                if (ite.a(iamVar.b(), jam.a(z2, fK2, false)) > 0) {
                }
            }
            z3 = true;
        } else {
            z2 = z;
        }
        h2(cVarH1, eVar, j, iamVar, i, z2, fK2, z3);
    }

    public void X1(e eVar, long j, iam iamVar, int i, boolean z) {
        ywx ywxVar = this.H;
        if (ywxVar != null) {
            ywxVar.W1(eVar, ywxVar.t1(j, true), iamVar, i, z);
        }
    }

    public final void Y0(ywx ywxVar, qtw qtwVar, boolean z) {
        if (ywxVar == this) {
            return;
        }
        ywx ywxVar2 = this.I;
        if (ywxVar2 != null) {
            ywxVar2.Y0(ywxVar, qtwVar, z);
        }
        long j = this.R;
        float f2 = (int) (j >> 32);
        qtwVar.a -= f2;
        qtwVar.c -= f2;
        float f3 = (int) (j & 4294967295L);
        qtwVar.b -= f3;
        qtwVar.d -= f3;
        vgz vgzVar = this.a0;
        if (vgzVar != null) {
            vgzVar.b(qtwVar, true);
            if (this.K && z) {
                long j2 = this.c;
                qtwVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final void Y1() {
        vgz vgzVar = this.a0;
        if (vgzVar != null) {
            vgzVar.invalidate();
            return;
        }
        ywx ywxVar = this.I;
        if (ywxVar != null) {
            ywxVar.Y1();
        }
    }

    @Override // defpackage.xgz
    public final boolean Z0() {
        return (this.a0 == null || this.J || !this.E.e()) ? false : true;
    }

    @Override // defpackage.urr
    public final long a() {
        return this.c;
    }

    public final boolean c2() {
        if (this.a0 != null && this.O <= 0.0f) {
            return true;
        }
        ywx ywxVar = this.I;
        if (ywxVar != null) {
            return ywxVar.c2();
        }
        return false;
    }

    public final void d2() {
        this.E.V.b();
    }

    @Override // defpackage.urr
    public final boolean e() {
        return E1().C;
    }

    @Override // defpackage.urr
    public final urr e0() {
        if (!E1().C) {
            wkn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        d2();
        return this.E.U.d.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [duw] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void e2() {
        androidx.compose.ui.d.c cVarE1;
        boolean zG = dxx.g(128);
        androidx.compose.ui.d.c cVarL1 = L1(zG);
        if (cVarL1 == null || (cVarL1.a.d & 128) == 0) {
            return;
        }
        c5a0.e.getClass();
        c5a0 c5a0VarA = c5a0.a.a();
        Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
        c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
        try {
            if (!zG) {
                cVarE1 = E1().e;
                if (cVarE1 == null) {
                }
                Unit unit = Unit.a;
                c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            }
            cVarE1 = E1();
            for (androidx.compose.ui.d.c cVarL2 = L1(zG); cVarL2 != null && (cVarL2.d & 128) != 0; cVarL2 = cVarL2.f) {
                if ((cVarL2.c & 128) != 0) {
                    ?? C = cVarL2;
                    ?? duwVar = 0;
                    while (C != 0) {
                        if (C instanceof mrr) {
                            ((mrr) C).M(this.c);
                        } else if ((C.c & 128) != 0 && (C instanceof tkd)) {
                            androidx.compose.ui.d.c cVar = ((tkd) C).E;
                            int i = 0;
                            C = C;
                            duwVar = duwVar;
                            while (cVar != null) {
                                if ((cVar.c & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        duwVar = duwVar;
                                        C = cVar;
                                    } else {
                                        if (duwVar == 0) {
                                            duwVar = new duw(new androidx.compose.ui.d.c[16]);
                                        }
                                        if (C != 0) {
                                            duwVar.b(C);
                                            C = 0;
                                        }
                                        duwVar.b(cVar);
                                    }
                                }
                                cVar = cVar.f;
                                C = C;
                                duwVar = duwVar;
                            }
                            if (i == 1) {
                            }
                        }
                        C = pkd.c(duwVar);
                    }
                }
                if (cVarL2 == cVarE1) {
                    break;
                }
            }
            Unit unit2 = Unit.a;
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
        } catch (Throwable th) {
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void f2() {
        boolean zG = dxx.g(128);
        androidx.compose.ui.d.c cVarE1 = E1();
        if (!zG && (cVarE1 = cVarE1.e) == null) {
            return;
        }
        for (androidx.compose.ui.d.c cVarL1 = L1(zG); cVarL1 != null && (cVarL1.d & 128) != 0; cVarL1 = cVarL1.f) {
            if ((cVarL1.c & 128) != 0) {
                ?? C = cVarL1;
                ?? duwVar = 0;
                while (C != 0) {
                    if (C instanceof mrr) {
                        ((mrr) C).T0(this);
                    } else if ((C.c & 128) != 0 && (C instanceof tkd)) {
                        androidx.compose.ui.d.c cVar = ((tkd) C).E;
                        int i = 0;
                        C = C;
                        duwVar = duwVar;
                        while (cVar != null) {
                            if ((cVar.c & 128) != 0) {
                                i++;
                                if (i == 1) {
                                    duwVar = duwVar;
                                    C = cVar;
                                } else {
                                    if (duwVar == 0) {
                                        duwVar = new duw(new androidx.compose.ui.d.c[16]);
                                    }
                                    if (C != 0) {
                                        duwVar.b(C);
                                        C = 0;
                                    }
                                    duwVar.b(cVar);
                                }
                            }
                            cVar = cVar.f;
                            C = C;
                            duwVar = duwVar;
                        }
                        if (i == 1) {
                        }
                    }
                    C = pkd.c(duwVar);
                }
            }
            if (cVarL1 == cVarE1) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // defpackage.eiv, defpackage.mzo
    public final Object g() {
        tsr tsrVar = this.E;
        if (!tsrVar.U.c(64)) {
            return null;
        }
        E1();
        dq40 dq40Var = new dq40();
        for (androidx.compose.ui.d.c cVar = tsrVar.U.e; cVar != null; cVar = cVar.e) {
            if ((cVar.c & 64) != 0) {
                ?? C = cVar;
                ?? duwVar = 0;
                while (C != 0) {
                    if (C instanceof hsz) {
                        dq40Var.a = ((hsz) C).U(tsrVar.N, dq40Var.a);
                    } else if ((C.c & 64) != 0 && (C instanceof tkd)) {
                        androidx.compose.ui.d.c cVar2 = ((tkd) C).E;
                        int i = 0;
                        C = C;
                        duwVar = duwVar;
                        while (cVar2 != null) {
                            if ((cVar2.c & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    duwVar = duwVar;
                                    C = cVar2;
                                } else {
                                    if (duwVar == 0) {
                                        duwVar = new duw(new androidx.compose.ui.d.c[16]);
                                    }
                                    if (C != 0) {
                                        duwVar.b(C);
                                        C = 0;
                                    }
                                    duwVar.b(cVar2);
                                }
                            }
                            cVar2 = cVar2.f;
                            C = C;
                            duwVar = duwVar;
                        }
                        if (i == 1) {
                        }
                    }
                    C = pkd.c(duwVar);
                }
            }
        }
        return dq40Var.a;
    }

    public final void g2() {
        this.J = true;
        this.Y.invoke();
        l2();
        if (iwo.b(this.R, 0L)) {
            return;
        }
        this.E.X();
    }

    @Override // defpackage.mmd
    public final float getDensity() {
        return this.E.N.getDensity();
    }

    @Override // defpackage.nzo
    public final asr getLayoutDirection() {
        return this.E.O;
    }

    public final long h1(ywx ywxVar, long j, boolean z) {
        if (ywxVar == this) {
            return j;
        }
        ywx ywxVar2 = this.I;
        return (ywxVar2 == null || Intrinsics.g(ywxVar, ywxVar2)) ? t1(j, z) : t1(ywxVar2.h1(ywxVar, j, z), z);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x018c A[PHI: r2
      0x018c: PHI (r2v21 ??) = (r2v1 ??), (r2v1 ??), (r2v23 ??) binds: [B:55:0x0158, B:57:0x015c, B:71:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v21, types: [duw] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [duw] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void h2(androidx.compose.ui.d.c cVar, e eVar, long j, iam iamVar, int i, boolean z, float f2, boolean z2) {
        ?? C;
        int i2;
        usw uswVar = iamVar.b;
        etw<Object> etwVar = iamVar.a;
        if (cVar == null) {
            X1(eVar, j, iamVar, i, z);
            return;
        }
        int i3 = i;
        if (i3 == 3 || i3 == 4) {
            ?? r1 = cVar;
            ?? duwVar = 0;
            while (r1 != 0) {
                if (r1 instanceof s020) {
                    long jV0 = ((s020) r1).V0();
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    tsr tsrVar = this.E;
                    asr asrVar = tsrVar.O;
                    int i5 = w3g0.b;
                    long j2 = Long.MIN_VALUE & jV0;
                    if (fIntBitsToFloat < (-(((j2 == 0 || asrVar == asr.a) ? (int) jV0 : (int) (jV0 >> 30)) & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i4) >= o0() + (((j2 == 0 || tsrVar.O == asr.a) ? (int) (jV0 >> 30) : (int) jV0) & 32767)) {
                        break;
                    }
                    int i6 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i6) < (-(((int) (jV0 >> 15)) & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i6) >= (((int) (jV0 >> 45)) & 32767) + l0()) {
                        break;
                    }
                    g gVar = new g(cVar, eVar, j, iamVar, i3, z, f2, z2);
                    int i7 = iamVar.c;
                    int i8 = etwVar.b;
                    if (i7 == i8 - 1) {
                        iamVar.c(i7 + 1, i8);
                        iamVar.c++;
                        etwVar.g(cVar);
                        uswVar.a(jam.a(z, 0.0f, true));
                        gVar.invoke();
                        iamVar.c = i7;
                        return;
                    }
                    long jB = iamVar.b();
                    int i9 = iamVar.c;
                    if (!ite.c(jB)) {
                        if (ite.b(jB) > 0.0f) {
                            int i10 = iamVar.c;
                            iamVar.c(i10 + 1, etwVar.b);
                            iamVar.c++;
                            etwVar.g(cVar);
                            uswVar.a(jam.a(z, 0.0f, true));
                            gVar.invoke();
                            iamVar.c = i10;
                            return;
                        }
                        return;
                    }
                    int i11 = etwVar.b;
                    int i12 = i11 - 1;
                    iamVar.c = i12;
                    iamVar.c(i11, etwVar.b);
                    iamVar.c++;
                    etwVar.g(cVar);
                    uswVar.a(jam.a(z, 0.0f, true));
                    gVar.invoke();
                    iamVar.c = i12;
                    if (ite.b(iamVar.b()) < 0.0f) {
                        iamVar.c(i9 + 1, iamVar.c + 1);
                    }
                    iamVar.c = i9;
                    return;
                }
                if ((r1.c & 16) == 0 || !(r1 instanceof tkd)) {
                    C = r1;
                    duwVar = duwVar;
                    C = pkd.c(duwVar);
                } else {
                    androidx.compose.ui.d.c cVar2 = ((tkd) r1).E;
                    int i13 = 0;
                    while (cVar2 != null) {
                        if ((cVar2.c & 16) != 0) {
                            i13++;
                            if (i13 == 1) {
                                C = r1;
                                duwVar = duwVar;
                                duwVar = duwVar;
                                C = cVar2;
                            } else {
                                if (duwVar == 0) {
                                    duwVar = new duw(new androidx.compose.ui.d.c[16]);
                                }
                                if (C != 0) {
                                    duwVar.b(C);
                                    C = 0;
                                }
                                duwVar.b(cVar2);
                            }
                        } else {
                            C = r1;
                            duwVar = duwVar;
                        }
                        cVar2 = cVar2.f;
                        C = C;
                        duwVar = duwVar;
                    }
                    if (i13 == 1) {
                        C = r1;
                        duwVar = duwVar;
                    } else {
                        C = r1;
                        duwVar = duwVar;
                        C = pkd.c(duwVar);
                    }
                }
                i3 = i;
                r1 = C;
                duwVar = duwVar;
            }
        }
        if (z2) {
            S1(cVar, eVar, j, iamVar, i, z, f2);
            return;
        }
        if (!eVar.b(cVar)) {
            h2(cxx.a(cVar, eVar.a()), eVar, j, iamVar, i, z, f2, false);
            return;
        }
        bxx bxxVar = new bxx(this, cVar, eVar, j, iamVar, i, z, f2);
        int i14 = iamVar.c;
        int i15 = etwVar.b;
        if (i14 != i15 - 1) {
            long jB2 = iamVar.b();
            int i16 = iamVar.c;
            int i17 = etwVar.b;
            int i18 = i17 - 1;
            iamVar.c = i18;
            iamVar.c(i17, etwVar.b);
            iamVar.c++;
            etwVar.g(cVar);
            uswVar.a(jam.a(z, f2, false));
            bxxVar.invoke();
            iamVar.c = i18;
            long jB3 = iamVar.b();
            if (iamVar.c + 1 >= etwVar.b - 1 || ite.a(jB2, jB3) <= 0) {
                iamVar.c(iamVar.c + 1, etwVar.b);
            } else {
                int i19 = i16 + 1;
                boolean zC = ite.c(jB3);
                int i20 = iamVar.c;
                iamVar.c(i19, zC ? i20 + 2 : i20 + 1);
            }
            iamVar.c = i16;
            return;
        }
        int i21 = i14 + 1;
        iamVar.c(i21, i15);
        iamVar.c++;
        etwVar.g(cVar);
        uswVar.a(jam.a(z, f2, false));
        bxxVar.invoke();
        iamVar.c = i14;
        if (i21 == etwVar.b - 1 || ite.c(iamVar.b())) {
            int i22 = iamVar.c;
            int i23 = i22 + 1;
            etwVar.k(i23);
            if (i23 < 0 || i23 >= (i2 = uswVar.b)) {
                mae0.a("Index must be between 0 and size");
                return;
            }
            long[] jArr = uswVar.a;
            long j3 = jArr[i23];
            if (i23 != i2 - 1) {
                xx0.g(jArr, jArr, i23, i22 + 2, i2);
            }
            uswVar.b--;
        }
    }

    @Override // defpackage.urr
    public final long i0(long j) {
        if (!E1().C) {
            wkn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        d2();
        while (this != null) {
            j = this.o2(j, true);
            this = this.I;
        }
        return j;
    }

    public final long i1(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - o0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - l0();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    public void i2(lc6 lc6Var, v6l v6lVar) {
        ywx ywxVar = this.H;
        if (ywxVar != null) {
            ywxVar.m1(lc6Var, v6lVar);
        }
    }

    public final void j2(long j, float f2, Function1<? super a7l, Unit> function1, v6l v6lVar) {
        tsr tsrVar = this.E;
        if (v6lVar != null) {
            if (function1 != null) {
                wkn.a("both ways to create layers shouldn't be used together");
            }
            if (this.b0 != v6lVar) {
                this.b0 = null;
                s2(false, null);
                this.b0 = v6lVar;
            }
            if (this.a0 == null) {
                wgz wgzVarA = xsr.a(tsrVar);
                zwx zwxVar = this.X;
                if (zwxVar == null) {
                    zwx zwxVar2 = new zwx(this, new axx(this));
                    this.X = zwxVar2;
                    zwxVar = zwxVar2;
                }
                f fVar = this.Y;
                vgz vgzVarM = wgzVarA.m(zwxVar, fVar, v6lVar);
                vgzVarM.f(this.c);
                vgzVarM.j(j);
                this.a0 = vgzVarM;
                tsrVar.Y = true;
                fVar.invoke();
            }
        } else {
            if (this.b0 != null) {
                this.b0 = null;
                s2(false, null);
            }
            s2(false, function1);
        }
        if (!iwo.b(this.R, j)) {
            xsr.a(tsrVar).u(-4.0f);
            this.R = j;
            tsrVar.V.p.J0();
            vgz vgzVar = this.a0;
            if (vgzVar != null) {
                vgzVar.j(j);
            } else {
                ywx ywxVar = this.I;
                if (ywxVar != null) {
                    ywxVar.Y1();
                }
            }
            tsrVar.X();
            xkt.T0(this);
            wgz wgzVar = tsrVar.C;
            if (wgzVar != null) {
                wgzVar.n(tsrVar);
            }
        }
        this.S = f2;
        if (!this.z) {
            J0(O0());
        }
        if (this == tsrVar.U.d) {
            xsr.a(tsrVar).getRectManager().g(tsrVar, !tsrVar.V.p.z);
        }
    }

    public final float k1(long j, long j2) {
        if (o0() >= Float.intBitsToFloat((int) (j2 >> 32)) && l0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jI1 = i1(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jI1 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI1 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - o0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - l0()))) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void k2(qtw qtwVar, boolean z, boolean z2) {
        vgz vgzVar = this.a0;
        if (vgzVar != null) {
            if (this.K) {
                if (z2) {
                    long jD1 = D1();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jD1 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD1 & 4294967295L)) / 2.0f;
                    long j = this.c;
                    qtwVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z) {
                    long j2 = this.c;
                    qtwVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (qtwVar.b()) {
                    return;
                }
            }
            vgzVar.b(qtwVar, false);
        }
        long j3 = this.R;
        float f2 = (int) (j3 >> 32);
        qtwVar.a += f2;
        qtwVar.c += f2;
        float f3 = (int) (j3 & 4294967295L);
        qtwVar.b += f3;
        qtwVar.d += f3;
    }

    public final void l2() {
        if (this.a0 != null) {
            if (this.b0 != null) {
                this.b0 = null;
            }
            s2(false, null);
            this.E.g0(false);
        }
    }

    public final void m1(lc6 lc6Var, v6l v6lVar) {
        vgz vgzVar = this.a0;
        if (vgzVar != null) {
            vgzVar.g(lc6Var, v6lVar);
            return;
        }
        long j = this.R;
        float f2 = (int) (j >> 32);
        float f3 = (int) (j & 4294967295L);
        lc6Var.e(f2, f3);
        n1(lc6Var, v6lVar);
        lc6Var.e(-f2, -f3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [duw] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [duw] */
    public final void m2(biv bivVar) {
        ywx ywxVar;
        biv bivVar2 = this.P;
        if (bivVar != bivVar2) {
            this.P = bivVar;
            tsr tsrVar = this.E;
            int i = 0;
            if (bivVar2 == null || bivVar.c() != bivVar2.c() || bivVar.b() != bivVar2.b()) {
                int iC = bivVar.c();
                int iB = bivVar.b();
                vgz vgzVar = this.a0;
                if (vgzVar != null) {
                    vgzVar.f((((long) iC) << 32) | (((long) iB) & 4294967295L));
                } else if (tsrVar.i() && (ywxVar = this.I) != null) {
                    ywxVar.Y1();
                }
                u0((((long) iB) & 4294967295L) | (((long) iC) << 32));
                if (this.L != null) {
                    t2(false);
                }
                boolean zG = dxx.g(4);
                androidx.compose.ui.d.c cVarE1 = E1();
                if (zG || (cVarE1 = cVarE1.e) != null) {
                    for (androidx.compose.ui.d.c cVarL1 = L1(zG); cVarL1 != null && (cVarL1.d & 4) != 0; cVarL1 = cVarL1.f) {
                        if ((cVarL1.c & 4) != 0) {
                            ?? C = cVarL1;
                            ?? duwVar = 0;
                            while (C != 0) {
                                if (C instanceof qcf) {
                                    ((qcf) C).s1();
                                } else if ((C.c & 4) != 0 && (C instanceof tkd)) {
                                    androidx.compose.ui.d.c cVar = ((tkd) C).E;
                                    int i2 = 0;
                                    C = C;
                                    duwVar = duwVar;
                                    while (cVar != null) {
                                        if ((cVar.c & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                duwVar = duwVar;
                                                C = cVar;
                                            } else {
                                                if (duwVar == 0) {
                                                    duwVar = new duw(new androidx.compose.ui.d.c[16]);
                                                }
                                                if (C != 0) {
                                                    duwVar.b(C);
                                                    C = 0;
                                                }
                                                duwVar.b(cVar);
                                            }
                                        }
                                        cVar = cVar.f;
                                        C = C;
                                        duwVar = duwVar;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                C = pkd.c(duwVar);
                            }
                        }
                        if (cVarL1 == cVarE1) {
                            break;
                        }
                    }
                }
                wgz wgzVar = tsrVar.C;
                if (wgzVar != null) {
                    wgzVar.n(tsrVar);
                }
            }
            dtw<kt> dtwVar = this.Q;
            if ((dtwVar == null || dtwVar.e == 0) && bivVar.s().isEmpty()) {
                return;
            }
            dtw<kt> dtwVar2 = this.Q;
            Map<kt, Integer> mapS = bivVar.s();
            if (dtwVar2 != null && dtwVar2.e == mapS.size()) {
                Object[] objArr = dtwVar2.b;
                int[] iArr = dtwVar2.c;
                long[] jArr = dtwVar2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = mapS.get((kt) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            tsrVar.V.p.N.g();
            dtw<kt> dtwVarA = this.Q;
            if (dtwVarA == null) {
                dtwVarA = zby.a();
                this.Q = dtwVarA;
            }
            dtwVarA.a();
            for (Map.Entry<kt, Integer> entry : bivVar.s().entrySet()) {
                dtwVarA.h(entry.getValue().intValue(), entry.getKey());
            }
        }
    }

    public final void n1(lc6 lc6Var, v6l v6lVar) {
        ywx ywxVar;
        lc6 lc6Var2;
        v6l v6lVar2;
        androidx.compose.ui.d.c cVarH1 = H1(4);
        if (cVarH1 == null) {
            i2(lc6Var, v6lVar);
            return;
        }
        tsr tsrVar = this.E;
        tsrVar.getClass();
        wsr sharedDrawScope = xsr.a(tsrVar).getSharedDrawScope();
        long jD = kc6.d(this.c);
        sharedDrawScope.getClass();
        duw duwVar = null;
        while (cVarH1 != null) {
            if (cVarH1 instanceof qcf) {
                ywxVar = this;
                lc6Var2 = lc6Var;
                v6lVar2 = v6lVar;
                sharedDrawScope.e(lc6Var2, jD, ywxVar, (qcf) cVarH1, v6lVar2);
            } else {
                ywxVar = this;
                lc6Var2 = lc6Var;
                v6lVar2 = v6lVar;
                if ((cVarH1.c & 4) != 0 && (cVarH1 instanceof tkd)) {
                    int i = 0;
                    for (androidx.compose.ui.d.c cVar = ((tkd) cVarH1).E; cVar != null; cVar = cVar.f) {
                        if ((cVar.c & 4) != 0) {
                            i++;
                            if (i == 1) {
                                cVarH1 = cVar;
                            } else {
                                if (duwVar == null) {
                                    duwVar = new duw(new androidx.compose.ui.d.c[16]);
                                }
                                if (cVarH1 != null) {
                                    duwVar.b(cVarH1);
                                    cVarH1 = null;
                                }
                                duwVar.b(cVar);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                lc6Var = lc6Var2;
                this = ywxVar;
                v6lVar = v6lVar2;
            }
            cVarH1 = pkd.c(duwVar);
            lc6Var = lc6Var2;
            this = ywxVar;
            v6lVar = v6lVar2;
        }
    }

    @Override // defpackage.urr
    public final long o(long j) {
        if (!E1().C) {
            wkn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return Q(eb9.c(this), xsr.a(this.E).o(j), true);
    }

    public abstract void o1();

    public final long o2(long j, boolean z) {
        vgz vgzVar = this.a0;
        if (vgzVar != null) {
            j = vgzVar.d(j, false);
        }
        if (!z && this.w) {
            return j;
        }
        long j2 = this.R;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public final lk40 p2() {
        if (E1().C) {
            urr urrVarC = eb9.c(this);
            qtw qtwVar = this.T;
            if (qtwVar == null) {
                qtwVar = new qtw();
                this.T = qtwVar;
            }
            long jI1 = i1(D1());
            int i = (int) (jI1 >> 32);
            qtwVar.a = -Float.intBitsToFloat(i);
            int i2 = (int) (jI1 & 4294967295L);
            qtwVar.b = -Float.intBitsToFloat(i2);
            qtwVar.c = Float.intBitsToFloat(i) + o0();
            qtwVar.d = Float.intBitsToFloat(i2) + l0();
            while (this != urrVarC) {
                this.k2(qtwVar, false, true);
                if (!qtwVar.b()) {
                    this = this.I;
                    this.getClass();
                }
            }
            return new lk40(qtwVar.a, qtwVar.b, qtwVar.c, qtwVar.d);
        }
        return lk40.e;
    }

    public final void q2(ywx ywxVar, float[] fArr) {
        if (Intrinsics.g(ywxVar, this)) {
            return;
        }
        ywx ywxVar2 = this.I;
        ywxVar2.getClass();
        ywxVar2.q2(ywxVar, fArr);
        if (!iwo.b(this.R, 0L)) {
            float[] fArr2 = g0;
            ddv.d(fArr2);
            long j = this.R;
            ddv.h(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            ddv.g(fArr, fArr2);
        }
        vgz vgzVar = this.a0;
        if (vgzVar != null) {
            vgzVar.i(fArr);
        }
    }

    @Override // androidx.compose.ui.layout.y
    public void r0(long j, float f2, v6l v6lVar) {
        if (!this.F) {
            j2(j, f2, null, v6lVar);
            return;
        }
        ykt yktVarX1 = x1();
        yktVarX1.getClass();
        j2(yktVarX1.F, f2, null, v6lVar);
    }

    public final void r2(ywx ywxVar, float[] fArr) {
        while (!this.equals(ywxVar)) {
            vgz vgzVar = this.a0;
            if (vgzVar != null) {
                vgzVar.a(fArr);
            }
            long j = this.R;
            if (!iwo.b(j, 0L)) {
                float[] fArr2 = g0;
                ddv.d(fArr2);
                ddv.h(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                ddv.g(fArr, fArr2);
            }
            this = this.I;
            this.getClass();
        }
    }

    public final ywx s1(ywx ywxVar) {
        tsr tsrVarH = ywxVar.E;
        tsr tsrVar = this.E;
        if (tsrVarH == tsrVar) {
            androidx.compose.ui.d.c cVarE1 = ywxVar.E1();
            androidx.compose.ui.d.c cVarE2 = E1();
            if (!cVarE2.a.C) {
                wkn.c("visitLocalAncestors called on an unattached node");
            }
            for (androidx.compose.ui.d.c cVar = cVarE2.a.e; cVar != null; cVar = cVar.e) {
                if ((cVar.c & 2) != 0 && cVar == cVarE1) {
                    return ywxVar;
                }
            }
            return this;
        }
        while (tsrVarH.E > tsrVar.E) {
            tsrVarH = tsrVarH.H();
            tsrVarH.getClass();
        }
        tsr tsrVarH2 = tsrVar;
        while (tsrVarH2.E > tsrVarH.E) {
            tsrVarH2 = tsrVarH2.H();
            tsrVarH2.getClass();
        }
        while (tsrVarH != tsrVarH2) {
            tsrVarH = tsrVarH.H();
            tsrVarH2 = tsrVarH2.H();
            if (tsrVarH == null || tsrVarH2 == null) {
                hb5.a("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (tsrVarH2 != tsrVar) {
            if (tsrVarH != ywxVar.E) {
                return tsrVarH.U.c;
            }
            return ywxVar;
        }
        return this;
    }

    public final void s2(boolean z, Function1 function1) {
        wgz wgzVar;
        if (function1 != null && this.b0 != null) {
            wkn.a("layerBlock can't be provided when explicitLayer is provided");
        }
        tsr tsrVar = this.E;
        boolean z2 = (!z && this.L == function1 && Intrinsics.g(this.M, tsrVar.N) && this.N == tsrVar.O) ? false : true;
        this.M = tsrVar.N;
        this.N = tsrVar.O;
        boolean zE = tsrVar.e();
        f fVar = this.Y;
        if (!zE || function1 == null) {
            this.L = null;
            vgz vgzVar = this.a0;
            if (vgzVar != null) {
                if (!fdv.a(vgzVar.mo2getUnderlyingMatrixsQKQjiQ())) {
                    tsrVar.X();
                }
                vgzVar.destroy();
                tsrVar.Y = true;
                fVar.invoke();
                if (E1().C && tsrVar.i() && (wgzVar = tsrVar.C) != null) {
                    wgzVar.n(tsrVar);
                }
            }
            this.a0 = null;
            this.Z = false;
            return;
        }
        this.L = function1;
        if (this.a0 != null) {
            if (z2 && t2(true)) {
                tsrVar.X();
                xsr.a(tsrVar).getRectManager().f(tsrVar);
                return;
            }
            return;
        }
        wgz wgzVarA = xsr.a(tsrVar);
        zwx zwxVar = this.X;
        if (zwxVar == null) {
            zwx zwxVar2 = new zwx(this, new axx(this));
            this.X = zwxVar2;
            zwxVar = zwxVar2;
        }
        vgz vgzVarM = wgzVarA.m(zwxVar, fVar, null);
        vgzVarM.f(this.c);
        vgzVarM.j(this.R);
        this.a0 = vgzVarM;
        t2(true);
        tsrVar.Y = true;
        fVar.invoke();
    }

    @Override // androidx.compose.ui.layout.y
    public void t0(long j, float f2, Function1<? super a7l, Unit> function1) {
        if (!this.F) {
            j2(j, f2, function1, null);
            return;
        }
        ykt yktVarX1 = x1();
        yktVarX1.getClass();
        j2(yktVarX1.F, f2, function1, null);
    }

    public final long t1(long j, boolean z) {
        if (z || !this.w) {
            long j2 = this.R;
            j = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32);
        }
        vgz vgzVar = this.a0;
        return vgzVar != null ? vgzVar.d(j, true) : j;
    }

    public final boolean t2(boolean z) {
        wgz wgzVar;
        boolean z2 = false;
        if (this.b0 == null) {
            vgz vgzVar = this.a0;
            Function1<? super a7l, Unit> function1 = this.L;
            if (vgzVar != null) {
                if (function1 == null) {
                    throw w20.a("updateLayerParameters requires a non-null layerBlock");
                }
                no50 no50Var = e0;
                no50Var.k(1.0f);
                no50Var.v(1.0f);
                no50Var.b(1.0f);
                no50Var.B(0.0f);
                no50Var.f(0.0f);
                no50Var.t(0.0f);
                long j = b7l.a;
                no50Var.h(j);
                no50Var.n(j);
                no50Var.q(0.0f);
                no50Var.r(0.0f);
                no50Var.u(0.0f);
                no50Var.p(8.0f);
                no50Var.z0(jsg0.b);
                no50Var.A1(zk40.a);
                no50Var.l(false);
                no50Var.v0(null);
                no50Var.c(3);
                no50Var.c0(0);
                no50Var.G = 9205357640488583168L;
                no50Var.L = null;
                no50Var.a = 0;
                tsr tsrVar = this.E;
                no50Var.H = tsrVar.N;
                no50Var.I = tsrVar.O;
                no50Var.G = kc6.d(this.c);
                xsr.a(tsrVar).getSnapshotObserver().a(this, c0, new h(function1));
                frr frrVar = this.U;
                if (frrVar == null) {
                    frrVar = new frr();
                    this.U = frrVar;
                }
                frr frrVar2 = f0;
                frrVar2.getClass();
                frrVar2.a = frrVar.a;
                frrVar2.b = frrVar.b;
                frrVar2.c = frrVar.c;
                frrVar2.d = frrVar.d;
                frrVar2.e = frrVar.e;
                frrVar2.f = frrVar.f;
                frrVar2.g = frrVar.g;
                frrVar2.h = frrVar.h;
                frrVar2.i = frrVar.i;
                frrVar.a = no50Var.b;
                frrVar.b = no50Var.c;
                frrVar.c = no50Var.e;
                frrVar.d = no50Var.f;
                frrVar.e = no50Var.y;
                frrVar.f = no50Var.z;
                frrVar.g = no50Var.A;
                frrVar.h = no50Var.B;
                frrVar.i = no50Var.C;
                vgzVar.c(no50Var);
                boolean z3 = this.K;
                this.K = no50Var.E;
                this.O = no50Var.d;
                if (frrVar2.a == frrVar.a && frrVar2.b == frrVar.b && frrVar2.c == frrVar.c && frrVar2.d == frrVar.d && frrVar2.e == frrVar.e && frrVar2.f == frrVar.f && frrVar2.g == frrVar.g && frrVar2.h == frrVar.h && jsg0.a(frrVar2.i, frrVar.i)) {
                    z2 = true;
                }
                boolean z4 = !z2;
                if (z && ((!z2 || z3 != this.K) && (wgzVar = tsrVar.C) != null)) {
                    wgzVar.n(tsrVar);
                }
                return z4;
            }
            if (function1 != null) {
                wkn.c("null layer with a non-null layerBlock");
                return false;
            }
        }
        return false;
    }

    public final boolean u2(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        vgz vgzVar = this.a0;
        return vgzVar == null || !this.K || vgzVar.h(j);
    }

    @Override // defpackage.urr
    public final long w(long j) {
        if (!E1().C) {
            wkn.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return xsr.a(this.E).w(i0(j));
    }

    public abstract ykt x1();

    @Override // defpackage.mmd
    public final float y1() {
        return this.E.N.y1();
    }

    @Override // defpackage.xkt
    public final urr f1() {
        return this;
    }
}

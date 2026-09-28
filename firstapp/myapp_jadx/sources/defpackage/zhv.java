package defpackage;

import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zhv extends y implements vhv, pt, x5w {
    public boolean B;
    public Function1<? super a7l, Unit> D;
    public v6l E;
    public float F;
    public Object H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean Q;
    public float U;
    public boolean V;
    public Function1<? super a7l, Unit> W;
    public v6l X;
    public float Z;
    public boolean b0;
    public final ysr f;
    public boolean i;
    public boolean y;
    public boolean z;
    public int v = Reader.READ_DONE;
    public int w = Reader.READ_DONE;
    public tsr.f A = tsr.f.c;
    public long C = 0;
    public boolean G = true;
    public final vsr N = new vsr(this);
    public final duw<zhv> O = new duw<>(new zhv[16]);
    public boolean P = true;
    public long R = oxa.b(0, 0, 0, 15);
    public final b S = new b();
    public final a T = new a();
    public long Y = 0;
    public final c a0 = new c();

    public static final class a extends qlr implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            zhv zhvVar = zhv.this;
            ysr ysrVar = zhvVar.f;
            ysrVar.i = 0;
            duw<tsr> duwVarK = ysrVar.a.K();
            tsr[] tsrVarArr = duwVarK.a;
            int i = duwVarK.c;
            for (int i2 = 0; i2 < i; i2++) {
                zhv zhvVar2 = tsrVarArr[i2].V.p;
                zhvVar2.v = zhvVar2.w;
                zhvVar2.w = Reader.READ_DONE;
                zhvVar2.J = false;
                if (zhvVar2.A == tsr.f.b) {
                    zhvVar2.A = tsr.f.c;
                }
            }
            zhvVar.h0(xhv.a);
            zhvVar.U().O0().l();
            tsr tsrVar = ysrVar.a;
            duw<tsr> duwVarK2 = tsrVar.K();
            tsr[] tsrVarArr2 = duwVarK2.a;
            int i3 = duwVarK2.c;
            for (int i4 = 0; i4 < i3; i4++) {
                tsr tsrVar2 = tsrVarArr2[i4];
                ysr ysrVar2 = tsrVar2.V;
                if (ysrVar2.p.v != tsrVar2.I()) {
                    tsrVar.Y();
                    tsrVar.N();
                    if (tsrVar2.I() == Integer.MAX_VALUE) {
                        if (ysrVar2.c) {
                            blt bltVar = ysrVar2.q;
                            bltVar.getClass();
                            bltVar.A0(false);
                        }
                        ysrVar2.p.I0();
                    }
                }
            }
            zhvVar.h0(yhv.a);
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            zhv zhvVar = zhv.this;
            zhvVar.f.a().d0(zhvVar.R);
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            y.a placementScope;
            zhv zhvVar = zhv.this;
            ysr ysrVar = zhvVar.f;
            ywx ywxVar = ysrVar.a().I;
            if (ywxVar == null || (placementScope = ywxVar.A) == null) {
                placementScope = xsr.a(ysrVar.a).getPlacementScope();
            }
            Function1<? super a7l, Unit> function1 = zhvVar.W;
            v6l v6lVar = zhvVar.X;
            if (v6lVar != null) {
                ywx ywxVarA = ysrVar.a();
                long j = zhvVar.Y;
                float f = zhvVar.Z;
                placementScope.o(ywxVarA);
                ywxVarA.r0(iwo.d(j, ywxVarA.e), f, v6lVar);
            } else if (function1 == null) {
                ywx ywxVarA2 = ysrVar.a();
                long j2 = zhvVar.Y;
                float f2 = zhvVar.Z;
                placementScope.o(ywxVarA2);
                ywxVarA2.t0(iwo.d(j2, ywxVarA2.e), f2, null);
            } else {
                ywx ywxVarA3 = ysrVar.a();
                long j3 = zhvVar.Y;
                float f3 = zhvVar.Z;
                placementScope.o(ywxVarA3);
                ywxVarA3.t0(iwo.d(j3, ywxVarA3.e), f3, function1);
            }
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function1<pt, Unit> {
        public static final d a = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(pt ptVar) {
            ptVar.s().c = false;
            return Unit.a;
        }
    }

    public zhv(ysr ysrVar) {
        this.f = ysrVar;
    }

    @Override // defpackage.pt
    public final pt A() {
        ysr ysrVar;
        tsr tsrVarH = this.f.a.H();
        if (tsrVarH == null || (ysrVar = tsrVarH.V) == null) {
            return null;
        }
        return ysrVar.p;
    }

    public final List<zhv> A0() {
        ysr ysrVar = this.f;
        ysrVar.a.p0();
        boolean z = this.P;
        duw<zhv> duwVar = this.O;
        if (!z) {
            return duwVar.f();
        }
        tsr tsrVar = ysrVar.a;
        duw<tsr> duwVarK = tsrVar.K();
        tsr[] tsrVarArr = duwVarK.a;
        int i = duwVarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsr tsrVar2 = tsrVarArr[i2];
            if (duwVar.c <= i2) {
                duwVar.b(tsrVar2.V.p);
            } else {
                zhv zhvVar = tsrVar2.V.p;
                zhv[] zhvVarArr = duwVar.a;
                zhv zhvVar2 = zhvVarArr[i2];
                zhvVarArr[i2] = zhvVar;
            }
        }
        duwVar.l(((duw.a) tsrVar.A()).a.c, duwVar.c);
        this.P = false;
        return duwVar.f();
    }

    @Override // defpackage.x5w
    public final void E(boolean z) {
        ysr ysrVar = this.f;
        if (z != ysrVar.a().w) {
            ysrVar.a().w = z;
            this.b0 = true;
        }
    }

    public final void G0() {
        boolean z = this.I;
        this.I = true;
        tsr tsrVar = this.f.a;
        wwx wwxVar = tsrVar.U;
        if (!z) {
            wwxVar.c.f2();
            if (tsrVar.D()) {
                tsr.h0(tsrVar, true, 6);
            } else if (tsrVar.V.e) {
                tsr.f0(tsrVar, true, 6);
            }
        }
        ywx ywxVar = wwxVar.c.H;
        for (ywx ywxVar2 = wwxVar.d; !Intrinsics.g(ywxVar2, ywxVar) && ywxVar2 != null; ywxVar2 = ywxVar2.H) {
            if (ywxVar2.Z) {
                ywxVar2.Y1();
            }
        }
        duw<tsr> duwVarK = tsrVar.K();
        tsr[] tsrVarArr = duwVarK.a;
        int i = duwVarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsr tsrVar2 = tsrVarArr[i2];
            if (tsrVar2.I() != Integer.MAX_VALUE) {
                tsrVar2.V.p.G0();
                tsr.i0(tsrVar2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
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
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final void I0() {
        if (this.I) {
            this.I = false;
            ysr ysrVar = this.f;
            wwx wwxVar = ysrVar.a.U;
            ywx ywxVar = wwxVar.c.H;
            for (ywx ywxVar2 = wwxVar.d; !Intrinsics.g(ywxVar2, ywxVar) && ywxVar2 != null; ywxVar2 = ywxVar2.H) {
                androidx.compose.ui.d.c cVarL1 = ywxVar2.L1(dxx.g(1048576));
                if (cVarL1 != null && (cVarL1.a.d & 1048576) != 0) {
                    boolean zG = dxx.g(1048576);
                    androidx.compose.ui.d.c cVarE1 = ywxVar2.E1();
                    if (zG || (cVarE1 = cVarE1.e) != null) {
                        for (androidx.compose.ui.d.c cVarL2 = ywxVar2.L1(zG); cVarL2 != null && (cVarL2.d & 1048576) != 0; cVarL2 = cVarL2.f) {
                            if ((cVarL2.c & 1048576) != 0) {
                                ?? C = cVarL2;
                                ?? duwVar = 0;
                                while (C != 0) {
                                    if (C instanceof npy) {
                                        ((npy) C).c2();
                                    } else if ((C.c & 1048576) != 0 && (C instanceof tkd)) {
                                        androidx.compose.ui.d.c cVar = ((tkd) C).E;
                                        int i = 0;
                                        C = C;
                                        duwVar = duwVar;
                                        while (cVar != null) {
                                            if ((cVar.c & 1048576) != 0) {
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
                    }
                }
                ywxVar2.l2();
            }
            duw<tsr> duwVarK = ysrVar.a.K();
            tsr[] tsrVarArr = duwVarK.a;
            int i2 = duwVarK.c;
            for (int i3 = 0; i3 < i2; i3++) {
                tsrVarArr[i3].V.p.I0();
            }
        }
    }

    @Override // defpackage.pt
    public final void J() {
        this.Q = true;
        vsr vsrVar = this.N;
        vsrVar.i();
        boolean z = this.L;
        ysr ysrVar = this.f;
        if (z) {
            duw<tsr> duwVarK = ysrVar.a.K();
            tsr[] tsrVarArr = duwVarK.a;
            int i = duwVarK.c;
            for (int i2 = 0; i2 < i; i2++) {
                tsr tsrVar = tsrVarArr[i2];
                if (tsrVar.D() && tsrVar.E() == tsr.f.a && tsr.a0(tsrVar)) {
                    tsr.h0(ysrVar.a, false, 7);
                }
            }
        }
        if (this.M || (!this.B && !U().z && this.L)) {
            this.L = false;
            tsr.d dVar = ysrVar.d;
            ysrVar.d = tsr.d.c;
            ysrVar.g(false);
            tsr tsrVar2 = ysrVar.a;
            ghz snapshotObserver = xsr.a(tsrVar2).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a(tsrVar2, snapshotObserver.e, this.T);
            ysrVar.d = dVar;
            if (U().z && ysrVar.j) {
                requestLayout();
            }
            this.M = false;
        }
        if (vsrVar.d) {
            vsrVar.e = true;
        }
        if (vsrVar.b && vsrVar.f()) {
            vsrVar.h();
        }
        this.Q = false;
    }

    public final void J0() {
        ysr ysrVar = this.f;
        if (ysrVar.l > 0) {
            duw<tsr> duwVarK = ysrVar.a.K();
            tsr[] tsrVarArr = duwVarK.a;
            int i = duwVarK.c;
            for (int i2 = 0; i2 < i; i2++) {
                tsr tsrVar = tsrVarArr[i2];
                ysr ysrVar2 = tsrVar.V;
                boolean z = ysrVar2.j;
                zhv zhvVar = ysrVar2.p;
                if ((z || ysrVar2.k) && !zhvVar.L) {
                    tsrVar.g0(false);
                }
                zhvVar.J0();
            }
        }
    }

    public final void K0() {
        tsr.f fVar;
        ysr ysrVar = this.f;
        tsr.h0(ysrVar.a, false, 7);
        tsr tsrVar = ysrVar.a;
        tsr tsrVarH = tsrVar.H();
        if (tsrVarH == null || tsrVar.R != tsr.f.c) {
            return;
        }
        int iOrdinal = tsrVarH.V.d.ordinal();
        if (iOrdinal != 0) {
            fVar = iOrdinal != 2 ? tsrVarH.R : tsr.f.b;
        } else {
            fVar = tsr.f.a;
        }
        tsrVar.R = fVar;
    }

    public final void N0() {
        this.V = true;
        ysr ysrVar = this.f;
        tsr tsrVarH = ysrVar.a.H();
        float f = U().S;
        tsr tsrVar = ysrVar.a;
        wwx wwxVar = tsrVar.U;
        ywx ywxVar = wwxVar.d;
        iln ilnVar = wwxVar.c;
        while (ywxVar != ilnVar) {
            ywxVar.getClass();
            qsr qsrVar = (qsr) ywxVar;
            f += qsrVar.S;
            ywxVar = qsrVar.H;
        }
        if (f != this.U) {
            this.U = f;
            if (tsrVarH != null) {
                tsrVarH.Y();
            }
            if (tsrVarH != null) {
                tsrVarH.N();
            }
        }
        if (this.I) {
            tsrVar.U.c.f2();
        } else {
            if (tsrVarH != null) {
                tsrVarH.N();
            }
            G0();
            if (this.i && tsrVarH != null) {
                tsrVarH.g0(false);
            }
        }
        if (tsrVarH != null) {
            ysr ysrVar2 = tsrVarH.V;
            if (!this.i && ysrVar2.d == tsr.d.c) {
                if (this.w != Integer.MAX_VALUE) {
                    wkn.c("Place was called on a node which was placed already");
                }
                int i = ysrVar2.i;
                this.w = i;
                ysrVar2.i = i + 1;
            }
        } else {
            this.w = 0;
        }
        J();
    }

    public final void O0(long j) {
        ysr ysrVar = this.f;
        tsr.d dVar = ysrVar.d;
        tsr tsrVar = ysrVar.a;
        tsr.d dVar2 = tsr.d.e;
        if (dVar != dVar2) {
            wkn.c("layout state is not idle before measure starts");
        }
        this.R = j;
        tsr.d dVar3 = tsr.d.a;
        ysrVar.d = dVar3;
        this.K = false;
        ghz snapshotObserver = xsr.a(tsrVar).getSnapshotObserver();
        snapshotObserver.getClass();
        snapshotObserver.a(tsrVar, snapshotObserver.c, this.S);
        if (ysrVar.d == dVar3) {
            this.L = true;
            this.M = true;
            ysrVar.d = dVar2;
        }
    }

    public final void Q0(long j, float f, Function1<? super a7l, Unit> function1, v6l v6lVar) {
        ysr ysrVar = this.f;
        tsr tsrVar = ysrVar.a;
        tsr tsrVar2 = ysrVar.a;
        if (tsrVar.f0) {
            wkn.a("place is called on a deactivated node");
        }
        ysrVar.d = tsr.d.c;
        this.C = j;
        this.F = f;
        this.D = function1;
        this.E = v6lVar;
        this.V = false;
        wgz wgzVarA = xsr.a(tsrVar2);
        if (this.L || !this.I) {
            this.N.g = false;
            ysrVar.f(false);
            this.W = function1;
            this.Y = j;
            this.Z = f;
            this.X = v6lVar;
            ghz snapshotObserver = wgzVarA.getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a(tsrVar2, snapshotObserver.f, this.a0);
        } else {
            ywx ywxVarA = ysrVar.a();
            ywxVarA.j2(iwo.d(j, ywxVarA.e), f, function1, v6lVar);
            N0();
        }
        ysrVar.d = tsr.d.e;
        this.z = true;
    }

    @Override // defpackage.mzo
    public final int R(int i) {
        ysr ysrVar = this.f;
        if (!zsr.a(ysrVar.a)) {
            K0();
            return ysrVar.a().R(i);
        }
        blt bltVar = ysrVar.q;
        bltVar.getClass();
        return bltVar.R(i);
    }

    public final void R0(long j, float f, Function1<? super a7l, Unit> function1, v6l v6lVar) throws Throwable {
        boolean z;
        y.a placementScope;
        ysr ysrVar = this.f;
        tsr tsrVar = ysrVar.a;
        tsr tsrVar2 = ysrVar.a;
        try {
            this.J = true;
            if (!iwo.b(j, this.C) || this.b0) {
                if (ysrVar.k || ysrVar.j || this.b0) {
                    this.L = true;
                    this.b0 = false;
                }
                J0();
            }
            blt bltVar = ysrVar.q;
            if (bltVar != null) {
                ysr ysrVar2 = bltVar.f;
                if (zsr.a(ysrVar2.a)) {
                    z = true;
                } else {
                    if (bltVar.G == blt.a.c && !ysrVar2.b) {
                        ysrVar2.c = true;
                    }
                    z = ysrVar2.c;
                }
                if (z) {
                    ywx ywxVar = ysrVar.a().I;
                    if (ywxVar == null || (placementScope = ywxVar.A) == null) {
                        placementScope = xsr.a(tsrVar2).getPlacementScope();
                    }
                    blt bltVar2 = ysrVar.q;
                    bltVar2.getClass();
                    tsr tsrVarH = tsrVar2.H();
                    if (tsrVarH != null) {
                        tsrVarH.V.h = 0;
                    }
                    bltVar2.w = Reader.READ_DONE;
                    placementScope.s(bltVar2, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
                }
            }
            blt bltVar3 = ysrVar.q;
            if (bltVar3 != null && !bltVar3.A) {
                wkn.c("Error: Placement happened before lookahead.");
            }
            Q0(j, f, function1, v6lVar);
            Unit unit = Unit.a;
        } catch (Throwable th) {
            tsrVar.k0(th);
            throw null;
        }
    }

    public final boolean S0(long j) throws Throwable {
        ysr ysrVar = this.f;
        tsr tsrVar = ysrVar.a;
        tsr tsrVar2 = ysrVar.a;
        try {
            if (tsrVar.f0) {
                wkn.a("measure is called on a deactivated node");
            }
            wgz wgzVarA = xsr.a(tsrVar2);
            tsr tsrVarH = tsrVar2.H();
            boolean z = true;
            tsrVar2.T = tsrVar2.T || (tsrVarH != null && tsrVarH.T);
            if (!tsrVar2.D() && kxa.c(this.d, j)) {
                wgzVarA.k(tsrVar2, false);
                tsrVar2.j0();
                return false;
            }
            this.N.f = false;
            h0(d.a);
            this.y = true;
            long j2 = ysrVar.a().c;
            w0(j);
            O0(j);
            if (jxo.b(ysrVar.a().c, j2) && ysrVar.a().a == this.a && ysrVar.a().b == this.b) {
                z = false;
            }
            u0((((long) ysrVar.a().b) & 4294967295L) | (((long) ysrVar.a().a) << 32));
            return z;
        } catch (Throwable th) {
            tsrVar.k0(th);
            throw null;
        }
    }

    @Override // defpackage.pt
    public final iln U() {
        return this.f.a.U.c;
    }

    @Override // defpackage.mzo
    public final int a0(int i) {
        ysr ysrVar = this.f;
        if (!zsr.a(ysrVar.a)) {
            K0();
            return ysrVar.a().a0(i);
        }
        blt bltVar = ysrVar.q;
        bltVar.getClass();
        return bltVar.a0(i);
    }

    @Override // defpackage.mzo
    public final int b0(int i) {
        ysr ysrVar = this.f;
        if (!zsr.a(ysrVar.a)) {
            K0();
            return ysrVar.a().b0(i);
        }
        blt bltVar = ysrVar.q;
        bltVar.getClass();
        return bltVar.b0(i);
    }

    @Override // defpackage.vhv
    public final y d0(long j) throws Throwable {
        tsr.f fVar;
        ysr ysrVar = this.f;
        tsr tsrVar = ysrVar.a;
        tsr tsrVar2 = ysrVar.a;
        tsr.f fVar2 = tsrVar.R;
        tsr.f fVar3 = tsr.f.c;
        if (fVar2 == fVar3) {
            tsrVar.s();
        }
        if (zsr.a(tsrVar2)) {
            blt bltVar = ysrVar.q;
            bltVar.getClass();
            bltVar.y = fVar3;
            bltVar.d0(j);
        }
        tsr tsrVarH = tsrVar2.H();
        if (tsrVarH != null) {
            ysr ysrVar2 = tsrVarH.V;
            if (this.A != fVar3 && !tsrVar2.T) {
                wkn.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = ysrVar2.d.ordinal();
            if (iOrdinal == 0) {
                fVar = tsr.f.a;
            } else {
                if (iOrdinal != 2) {
                    uj5.a(ysrVar2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                fVar = tsr.f.b;
            }
            this.A = fVar;
        } else {
            this.A = fVar3;
        }
        S0(j);
        return this;
    }

    @Override // defpackage.eiv
    public final int f0(kt ktVar) {
        ysr ysrVar = this.f;
        tsr tsrVarH = ysrVar.a.H();
        tsr.d dVar = tsrVarH != null ? tsrVarH.V.d : null;
        tsr.d dVar2 = tsr.d.a;
        vsr vsrVar = this.N;
        if (dVar == dVar2) {
            vsrVar.c = true;
        } else {
            tsr tsrVarH2 = ysrVar.a.H();
            if ((tsrVarH2 != null ? tsrVarH2.V.d : null) == tsr.d.c) {
                vsrVar.d = true;
            }
        }
        this.B = true;
        int iF0 = ysrVar.a().f0(ktVar);
        this.B = false;
        return iF0;
    }

    @Override // defpackage.eiv, defpackage.mzo
    public final Object g() {
        return this.H;
    }

    @Override // defpackage.pt
    public final void h0(Function1<? super pt, Unit> function1) {
        duw<tsr> duwVarK = this.f.a.K();
        tsr[] tsrVarArr = duwVarK.a;
        int i = duwVarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            function1.invoke(tsrVarArr[i2].V.p);
        }
    }

    @Override // defpackage.pt
    public final boolean i() {
        return this.I;
    }

    @Override // defpackage.pt
    public final void k0() {
        tsr.h0(this.f.a, false, 7);
    }

    @Override // androidx.compose.ui.layout.y
    public final int l0() {
        return this.f.a().l0();
    }

    @Override // androidx.compose.ui.layout.y
    public final int o0() {
        return this.f.a().o0();
    }

    @Override // androidx.compose.ui.layout.y
    public final void r0(long j, float f, v6l v6lVar) throws Throwable {
        R0(j, f, null, v6lVar);
    }

    @Override // defpackage.pt
    public final void requestLayout() {
        tsr tsrVar = this.f.a;
        tsr.c cVar = tsr.g0;
        tsrVar.g0(false);
    }

    @Override // defpackage.pt
    public final ot s() {
        return this.N;
    }

    @Override // androidx.compose.ui.layout.y
    public final void t0(long j, float f, Function1<? super a7l, Unit> function1) throws Throwable {
        R0(j, f, function1, null);
    }

    @Override // defpackage.mzo
    public final int x(int i) {
        ysr ysrVar = this.f;
        if (!zsr.a(ysrVar.a)) {
            K0();
            return ysrVar.a().x(i);
        }
        blt bltVar = ysrVar.q;
        bltVar.getClass();
        return bltVar.x(i);
    }
}

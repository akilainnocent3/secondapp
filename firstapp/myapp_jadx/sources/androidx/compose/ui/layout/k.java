package androidx.compose.ui.layout;

import android.view.ViewGroup;
import defpackage.a350;
import defpackage.asr;
import defpackage.atr;
import defpackage.biv;
import defpackage.blt;
import defpackage.c5a0;
import defpackage.duw;
import defpackage.efe0;
import defpackage.fch0;
import defpackage.fz60;
import defpackage.gtw;
import defpackage.hz60;
import defpackage.iln;
import defpackage.k350;
import defpackage.kt;
import defpackage.kzz;
import defpackage.m2g;
import defpackage.mma;
import defpackage.mo50;
import defpackage.mzz;
import defpackage.nv9;
import defpackage.op8;
import defpackage.ozz;
import defpackage.q7k0;
import defpackage.r160;
import defpackage.rce0;
import defpackage.rtw;
import defpackage.stw;
import defpackage.tsr;
import defpackage.uga;
import defpackage.uma;
import defpackage.vhv;
import defpackage.w7z;
import defpackage.wkn;
import defpackage.x5a0;
import defpackage.xsr;
import defpackage.ysr;
import defpackage.ytw;
import defpackage.zhv;
import defpackage.zrp;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k implements uga {
    public int C;
    public int D;
    public final tsr a;
    public mma b;
    public h0 c;
    public int d;
    public int e;
    public final rtw<tsr, b> f = fz60.b();
    public final rtw<Object, tsr> i = fz60.b();
    public final c v = new c();
    public final a w = new a();
    public final rtw<Object, tsr> y = fz60.b();
    public final h0.a z = new h0.a(0);
    public final rtw<Object, g0.b> A = fz60.b();
    public final duw<Object> B = new duw<>(new Object[16]);
    public final String E = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public final class a implements rce0, t {
        public final /* synthetic */ c a;

        public a() {
            this.a = k.this.v;
        }

        @Override // defpackage.mmd
        public final float C1(float f) {
            return this.a.getDensity() * f;
        }

        @Override // defpackage.mmd
        public final float D0(long j) {
            return this.a.D0(j);
        }

        @Override // defpackage.mmd
        public final int I1(long j) {
            return this.a.I1(j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.rce0
        public final List<vhv> K(Object obj, Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2) {
            k kVar = k.this;
            rtw<Object, g0.b> rtwVar = kVar.A;
            rtw<Object, tsr> rtwVar2 = kVar.y;
            tsr tsrVar = kVar.a;
            rtw<Object, tsr> rtwVar3 = kVar.i;
            tsr tsrVarD = rtwVar3.d(obj);
            if (tsrVarD != null && ((duw.a) tsrVar.B()).a.i((T) tsrVarD) < kVar.d) {
                return tsrVarD.z();
            }
            duw<Object> duwVar = kVar.B;
            if (duwVar.c < kVar.e) {
                wkn.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
            }
            int i = duwVar.c;
            int i2 = kVar.e;
            if (i == i2) {
                duwVar.b(obj);
            } else {
                Object[] objArr = duwVar.a;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
            }
            kVar.e++;
            if (rtwVar2.a(obj)) {
                tsr tsrVarD2 = rtwVar2.d(obj);
                b bVarD = tsrVarD2 != null ? kVar.f.d(tsrVarD2) : null;
                if (bVarD != null && bVarD.d) {
                    kVar.i(tsrVarD2, obj, false, function2);
                }
            } else {
                if (tsrVar.e()) {
                    kVar.e();
                    if (!rtwVar3.b(obj)) {
                        rtwVar.k(obj);
                        Object objD = rtwVar2.d(obj);
                        if (objD == null) {
                            objD = kVar.j(obj);
                            if (objD != null) {
                                kVar.g(((duw.a) tsrVar.B()).a.i((T) objD), ((duw.a) tsrVar.B()).a.c);
                                kVar.D++;
                            } else {
                                int i3 = ((duw.a) tsrVar.B()).a.c;
                                tsr tsrVar2 = new tsr(2);
                                tsrVar.F = true;
                                tsrVar.M(i3, tsrVar2);
                                Unit unit = Unit.a;
                                tsrVar.F = false;
                                kVar.D++;
                                objD = tsrVar2;
                            }
                            rtwVar2.m(obj, objD);
                        }
                        kVar.i((tsr) objD, obj, false, function2);
                    }
                }
                rtwVar.m(obj, !tsrVar.e() ? new m() : new n(kVar, obj));
                if (tsrVar.V.d == tsr.d.c) {
                    tsrVar.e0(true);
                } else {
                    tsr.f0(tsrVar, true, 6);
                }
            }
            tsr tsrVarD3 = rtwVar2.d(obj);
            if (tsrVarD3 == null) {
                return m2g.a;
            }
            List<zhv> listA0 = tsrVarD3.V.p.A0();
            duw.a aVar = (duw.a) listA0;
            int i4 = aVar.a.c;
            for (int i5 = 0; i5 < i4; i5++) {
                ((zhv) aVar.get(i5)).f.b = true;
            }
            return listA0;
        }

        @Override // androidx.compose.ui.layout.t
        public final biv K1(int i, int i2, Map<kt, Integer> map, Function1<? super r160, Unit> function1, Function1<? super y.a, Unit> function2) {
            return this.a.K1(i, i2, map, function1, function2);
        }

        @Override // defpackage.mmd
        public final long N(float f) {
            return this.a.N(f);
        }

        @Override // defpackage.mmd
        public final long O(long j) {
            return this.a.O(j);
        }

        @Override // defpackage.mmd
        public final long U1(long j) {
            return this.a.U1(j);
        }

        @Override // defpackage.mmd
        public final float X(long j) {
            return this.a.X(j);
        }

        @Override // androidx.compose.ui.layout.t
        public final biv e1(int i, int i2, Map<kt, Integer> map, Function1<? super y.a, Unit> function1) {
            return this.a.K1(i, i2, map, null, function1);
        }

        @Override // defpackage.mmd
        public final long g0(float f) {
            return this.a.g0(f);
        }

        @Override // defpackage.mmd
        public final float getDensity() {
            return this.a.b;
        }

        @Override // defpackage.nzo
        public final asr getLayoutDirection() {
            return this.a.a;
        }

        @Override // defpackage.nzo
        public final boolean q0() {
            return this.a.q0();
        }

        @Override // defpackage.mmd
        public final float u1(int i) {
            return this.a.u1(i);
        }

        @Override // defpackage.mmd
        public final float v1(float f) {
            return f / this.a.getDensity();
        }

        @Override // defpackage.mmd
        public final int y0(float f) {
            return this.a.y0(f);
        }

        @Override // defpackage.mmd
        public final float y1() {
            return this.a.c;
        }
    }

    public static final class b {
        public Object a;
        public Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> b;
        public mo50 c;
        public boolean d;
        public boolean e;
        public mzz f;
        public ytw<Boolean> g;
        public boolean h;

        public b() {
            throw null;
        }
    }

    public final class c implements rce0 {
        public asr a = asr.b;
        public float b;
        public float c;

        public static final class a implements biv {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ Map<kt, Integer> c;
            public final /* synthetic */ Function1<r160, Unit> d;
            public final /* synthetic */ c e;
            public final /* synthetic */ k f;
            public final /* synthetic */ Function1<y.a, Unit> g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(int i, int i2, Map<kt, Integer> map, Function1<? super r160, Unit> function1, c cVar, k kVar, Function1<? super y.a, Unit> function2) {
                this.a = i;
                this.b = i2;
                this.c = map;
                this.d = function1;
                this.e = cVar;
                this.f = kVar;
                this.g = function2;
            }

            @Override // defpackage.biv
            public final int b() {
                return this.b;
            }

            @Override // defpackage.biv
            public final int c() {
                return this.a;
            }

            @Override // defpackage.biv
            public final void l() {
                iln.a aVar;
                tsr tsrVar = this.f.a;
                boolean zQ0 = this.e.q0();
                Function1<y.a, Unit> function1 = this.g;
                if (!zQ0 || (aVar = tsrVar.U.c.k0) == null) {
                    function1.invoke(tsrVar.U.c.A);
                } else {
                    function1.invoke(aVar.A);
                }
            }

            @Override // defpackage.biv
            public final Function1<r160, Unit> m() {
                return this.d;
            }

            @Override // defpackage.biv
            public final Map<kt, Integer> s() {
                return this.c;
            }
        }

        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.rce0
        public final List<vhv> K(Object obj, Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2) {
            k kVar = k.this;
            kVar.e();
            tsr tsrVar = kVar.a;
            tsr.d dVar = tsrVar.V.d;
            tsr.d dVar2 = tsr.d.a;
            if (dVar != dVar2 && dVar != tsr.d.c && dVar != tsr.d.b && dVar != tsr.d.d) {
                wkn.c("subcompose can only be used inside the measure or layout blocks");
            }
            rtw<Object, tsr> rtwVar = kVar.i;
            tsr tsrVarD = rtwVar.d(obj);
            if (tsrVarD == null) {
                tsrVarD = kVar.y.k(obj);
                if (tsrVarD != null) {
                    if (kVar.D <= 0) {
                        wkn.c("Check failed.");
                    }
                    kVar.D--;
                } else {
                    tsrVarD = kVar.j(obj);
                    if (tsrVarD == null) {
                        int i = kVar.d;
                        tsr tsrVar2 = new tsr(2);
                        tsrVar.F = true;
                        tsrVar.M(i, tsrVar2);
                        Unit unit = Unit.a;
                        tsrVar.F = false;
                        tsrVarD = tsrVar2;
                    }
                }
                rtwVar.m(obj, tsrVarD);
            }
            tsr tsrVar3 = tsrVarD;
            if (CollectionsKt.V(kVar.d, tsrVar.B()) != tsrVar3) {
                int i2 = ((duw.a) tsrVar.B()).a.i((T) tsrVar3);
                if (i2 < kVar.d) {
                    wkn.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                }
                int i3 = kVar.d;
                if (i3 != i2) {
                    kVar.g(i2, i3);
                }
            }
            kVar.d++;
            kVar.i(tsrVar3, obj, false, function2);
            return (dVar == dVar2 || dVar == tsr.d.c) ? tsrVar3.z() : tsrVar3.y();
        }

        @Override // androidx.compose.ui.layout.t
        public final biv K1(int i, int i2, Map<kt, Integer> map, Function1<? super r160, Unit> function1, Function1<? super y.a, Unit> function2) {
            if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
                wkn.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new a(i, i2, map, function1, this, k.this, function2);
        }

        @Override // defpackage.mmd
        public final float getDensity() {
            return this.b;
        }

        @Override // defpackage.nzo
        public final asr getLayoutDirection() {
            return this.a;
        }

        @Override // defpackage.nzo
        public final boolean q0() {
            tsr.d dVar = k.this.a.V.d;
            return dVar == tsr.d.d || dVar == tsr.d.b;
        }

        @Override // defpackage.mmd
        public final float y1() {
            return this.c;
        }
    }

    public k(tsr tsrVar, h0 h0Var) {
        this.a = tsrVar;
        this.c = h0Var;
    }

    public static void b(b bVar) {
        stw<k350> stwVar;
        mzz mzzVar = bVar.f;
        if (mzzVar != null) {
            mzzVar.h.set(ozz.b);
            a350 a350Var = mzzVar.j;
            if (a350Var.d.c()) {
                stwVar = a350Var.d;
                a350Var.d = hz60.a();
                a350Var.c.g();
            } else {
                stwVar = null;
            }
            a350Var.b();
            uma umaVar = mzzVar.a;
            umaVar.F = null;
            if (stwVar != null) {
                umaVar.J.k = stwVar;
                umaVar.L = 2;
            }
            bVar.f = null;
            mo50 mo50Var = bVar.c;
            if (mo50Var != null) {
                mo50Var.dispose();
            }
            bVar.c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // defpackage.uga
    public final void a() {
        mo50 mo50Var;
        tsr tsrVar = this.a;
        tsrVar.F = true;
        rtw<tsr, b> rtwVar = this.f;
        Object[] objArr = rtwVar.c;
        long[] jArr = rtwVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (mo50Var = ((b) objArr[(i << 3) + i3]).c) != null) {
                            mo50Var.dispose();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        tsrVar.b0();
        Unit unit = Unit.a;
        tsrVar.F = false;
        rtwVar.g();
        this.i.g();
        this.D = 0;
        this.C = 0;
        this.y.g();
        e();
    }

    @Override // defpackage.uga
    public final void c() {
        f(true);
    }

    public final void d(int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        this.C = 0;
        tsr tsrVar = this.a;
        List<tsr> listB = tsrVar.B();
        duw.a aVar = (duw.a) listB;
        boolean z4 = true;
        int i2 = (aVar.a.c - this.D) - 1;
        if (i <= i2) {
            h0.a aVar2 = this.z;
            aVar2.clear();
            gtw<Object> gtwVar = aVar2.a;
            rtw<tsr, b> rtwVar = this.f;
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    b bVarD = rtwVar.d((tsr) aVar.get(i3));
                    bVarD.getClass();
                    gtwVar.b(bVarD.a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.c.a(aVar2);
            c5a0.e.getClass();
            c5a0 c5a0VarA = c5a0.a.a();
            Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
            c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
            boolean z5 = false;
            while (i2 >= i) {
                try {
                    tsr tsrVar2 = (tsr) ((duw.a) listB).get(i2);
                    b bVarD2 = rtwVar.d(tsrVar2);
                    bVarD2.getClass();
                    b bVar = bVarD2;
                    Object obj = bVar.a;
                    if (gtwVar.a(obj)) {
                        boolean z6 = z4;
                        this.C++;
                        if (((Boolean) ((x5a0) bVar.g).getValue()).booleanValue()) {
                            ysr ysrVar = tsrVar2.V;
                            zhv zhvVar = ysrVar.p;
                            tsr.f fVar = tsr.f.c;
                            zhvVar.A = fVar;
                            blt bltVar = ysrVar.q;
                            if (bltVar != null) {
                                bltVar.y = fVar;
                            }
                            h(bVar, false);
                            if (bVar.h) {
                                z = z6;
                                z5 = z;
                            } else {
                                z = z6;
                            }
                            z2 = false;
                        } else {
                            z2 = z3;
                            z = z6;
                        }
                    } else {
                        tsrVar.F = z4;
                        rtwVar.k(tsrVar2);
                        mo50 mo50Var = bVar.c;
                        if (mo50Var != null) {
                            mo50Var.dispose();
                        }
                        z = true;
                        tsrVar.c0(i2, 1);
                        Unit unit = Unit.a;
                        z2 = false;
                        tsrVar.F = false;
                    }
                    this.i.k(obj);
                    i2--;
                    boolean z7 = z2;
                    z4 = z;
                    z3 = z7;
                } catch (Throwable th) {
                    c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                    throw th;
                }
            }
            Unit unit2 = Unit.a;
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            z3 = z5;
        }
        if (z3) {
            c5a0.e.getClass();
            c5a0.a.f();
        }
        e();
    }

    public final void e() {
        int i = ((duw.a) this.a.B()).a.c;
        rtw<tsr, b> rtwVar = this.f;
        if (rtwVar.e != i) {
            wkn.a("Inconsistency between the count of nodes tracked by the state (" + rtwVar.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.C) - this.D < 0) {
            StringBuilder sbA = efe0.a(i, "Incorrect state. Total children ", ". Reusable children ");
            sbA.append(this.C);
            sbA.append(". Precomposed children ");
            sbA.append(this.D);
            wkn.a(sbA.toString());
        }
        rtw<Object, tsr> rtwVar2 = this.y;
        if (rtwVar2.e == this.D) {
            return;
        }
        wkn.a("Incorrect state. Precomposed children " + this.D + ". Map size " + rtwVar2.e);
    }

    public final void f(boolean z) {
        this.D = 0;
        this.y.g();
        List<tsr> listB = this.a.B();
        int i = ((duw.a) listB).a.c;
        if (this.C != i) {
            this.C = i;
            c5a0.e.getClass();
            c5a0 c5a0VarA = c5a0.a.a();
            Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
            c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    tsr tsrVar = (tsr) ((duw.a) listB).get(i2);
                    b bVarD = this.f.d(tsrVar);
                    if (bVarD != null && ((Boolean) ((x5a0) bVarD.g).getValue()).booleanValue()) {
                        ysr ysrVar = tsrVar.V;
                        zhv zhvVar = ysrVar.p;
                        tsr.f fVar = tsr.f.c;
                        zhvVar.A = fVar;
                        blt bltVar = ysrVar.q;
                        if (bltVar != null) {
                            bltVar.y = fVar;
                        }
                        h(bVarD, z);
                        bVarD.a = f0.a;
                    }
                } catch (Throwable th) {
                    c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                    throw th;
                }
            }
            Unit unit = Unit.a;
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            this.i.g();
        }
        e();
    }

    public final void g(int i, int i2) {
        tsr tsrVar = this.a;
        tsrVar.F = true;
        tsrVar.V(i, i2, 1);
        Unit unit = Unit.a;
        tsrVar.F = false;
    }

    public final void h(b bVar, boolean z) {
        mo50 mo50Var;
        if (z || !bVar.h) {
            bVar.g = androidx.compose.runtime.m.b(Boolean.FALSE);
        } else {
            ((x5a0) bVar.g).setValue(Boolean.FALSE);
        }
        if (bVar.f != null) {
            b(bVar);
            return;
        }
        if (z) {
            mo50 mo50Var2 = bVar.c;
            if (mo50Var2 != null) {
                mo50Var2.deactivate();
                return;
            }
            return;
        }
        w7z outOfFrameExecutor = xsr.a(this.a).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            outOfFrameExecutor.d(new o(bVar));
        } else {
            if (bVar.h || (mo50Var = bVar.c) == null) {
                return;
            }
            mo50Var.deactivate();
        }
    }

    public final void i(tsr tsrVar, Object obj, boolean z, Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2) {
        uma umaVar;
        rtw<tsr, b> rtwVar = this.f;
        b bVarD = rtwVar.d(tsrVar);
        if (bVarD == null) {
            op8 op8Var = nv9.a;
            bVarD = new b();
            bVarD.a = obj;
            bVarD.b = op8Var;
            bVarD.c = null;
            bVarD.g = androidx.compose.runtime.m.b(Boolean.TRUE);
            rtwVar.m(tsrVar, bVarD);
        }
        b bVar = bVarD;
        boolean z2 = bVar.b != function2;
        mzz mzzVar = bVar.f;
        tsr tsrVar2 = this.a;
        if (mzzVar != null) {
            if (z2) {
                b(bVar);
            } else {
                if (z) {
                    return;
                }
                mzz mzzVar2 = bVar.f;
                if (mzzVar2 != null) {
                    c5a0.e.getClass();
                    c5a0 c5a0VarA = c5a0.a.a();
                    Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
                    c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
                    try {
                        tsrVar2.F = true;
                        while (!mzzVar2.c()) {
                            mzzVar2.f(new atr());
                        }
                        mzzVar2.a();
                        bVar.f = null;
                        Unit unit = Unit.a;
                        tsrVar2.F = false;
                        c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                    } catch (Throwable th) {
                        c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                        throw th;
                    }
                }
            }
        }
        mo50 mo50Var = bVar.c;
        boolean zS = mo50Var != null ? mo50Var.s() : true;
        if (z2 || zS || bVar.d) {
            bVar.b = function2;
            if (bVar.f != null) {
                wkn.a("new subcompose call while paused composition is still active");
            }
            c5a0.e.getClass();
            c5a0 c5a0VarA2 = c5a0.a.a();
            Function1<Object, Unit> function1E2 = c5a0VarA2 != null ? c5a0VarA2.e() : null;
            c5a0 c5a0VarB2 = c5a0.a.b(c5a0VarA2);
            try {
                tsrVar2.F = true;
                mo50 mo50Var2 = bVar.c;
                mma mmaVar = this.b;
                if (mmaVar == null) {
                    wkn.d("parent composition reference not set");
                    throw new zrp();
                }
                if (mo50Var2 == null || mo50Var2.isDisposed()) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = q7k0.a;
                        umaVar = new uma(mmaVar, new fch0(tsrVar));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = q7k0.a;
                        umaVar = new uma(mmaVar, new fch0(tsrVar));
                    }
                    mo50Var2 = umaVar;
                }
                bVar.c = mo50Var2;
                Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> op8Var2 = bVar.b;
                if (xsr.a(tsrVar2).getOutOfFrameExecutor() != null) {
                    bVar.h = false;
                } else {
                    bVar.h = true;
                    op8Var2 = new op8(1524156494, new p(bVar, op8Var2), true);
                }
                if (z) {
                    if (bVar.e) {
                        bVar.f = ((kzz) mo50Var2).u(op8Var2);
                    } else {
                        bVar.f = ((kzz) mo50Var2).e(op8Var2);
                    }
                } else if (bVar.e) {
                    mo50Var2.q(op8Var2);
                } else {
                    mo50Var2.g(op8Var2);
                }
                bVar.e = false;
                Unit unit2 = Unit.a;
                tsrVar2.F = false;
                c5a0.a.e(c5a0VarA2, c5a0VarB2, function1E2);
                bVar.d = false;
            } catch (Throwable th2) {
                c5a0.a.e(c5a0VarA2, c5a0VarB2, function1E2);
                throw th2;
            }
        }
    }

    public final tsr j(Object obj) {
        rtw<tsr, b> rtwVar;
        int i;
        if (this.C == 0) {
            return null;
        }
        duw.a aVar = (duw.a) this.a.B();
        int i2 = aVar.a.c - this.D;
        int i3 = i2 - this.C;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            rtwVar = this.f;
            if (i5 < i3) {
                i = -1;
                break;
            }
            b bVarD = rtwVar.d((tsr) aVar.get(i5));
            bVarD.getClass();
            if (Intrinsics.g(bVarD.a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                b bVarD2 = rtwVar.d((tsr) aVar.get(i4));
                bVarD2.getClass();
                b bVar = bVarD2;
                Object obj2 = bVar.a;
                if (obj2 == f0.a || this.c.b(obj, obj2)) {
                    bVar.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            g(i5, i3);
        }
        this.C--;
        tsr tsrVar = (tsr) aVar.get(i3);
        b bVarD3 = rtwVar.d(tsrVar);
        bVarD3.getClass();
        b bVar2 = bVarD3;
        bVar2.g = androidx.compose.runtime.m.b(Boolean.TRUE);
        bVar2.e = true;
        bVar2.d = true;
        return tsrVar;
    }

    @Override // defpackage.uga
    public final void l() {
        f(false);
    }
}

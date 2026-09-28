package defpackage;

import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class blt extends y implements vhv, pt, x5w {
    public boolean A;
    public boolean B;
    public kxa C;
    public Function1<? super a7l, Unit> E;
    public v6l F;
    public boolean K;
    public Object M;
    public boolean N;
    public final ysr f;
    public boolean i;
    public boolean z;
    public int v = Reader.READ_DONE;
    public int w = Reader.READ_DONE;
    public tsr.f y = tsr.f.c;
    public long D = 0;
    public a G = a.c;
    public final wkt H = new wkt(this);
    public final duw<blt> I = new duw<>(new blt[16]);
    public boolean J = true;
    public boolean L = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("IsPlacedInLookahead", 0);
            a = aVar;
            a aVar2 = new a("IsPlacedInApproach", 1);
            b = aVar2;
            a aVar3 = new a("IsNotPlaced", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public static final class b extends qlr implements Function0<Unit> {
        public final /* synthetic */ ykt b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ykt yktVar) {
            super(0);
            this.b = yktVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            blt bltVar = blt.this;
            ysr ysrVar = bltVar.f;
            ysrVar.h = 0;
            duw<tsr> duwVarK = ysrVar.a.K();
            tsr[] tsrVarArr = duwVarK.a;
            int i = duwVarK.c;
            for (int i2 = 0; i2 < i; i2++) {
                blt bltVar2 = tsrVarArr[i2].V.q;
                bltVar2.getClass();
                bltVar2.v = bltVar2.w;
                bltVar2.w = Reader.READ_DONE;
                if (bltVar2.y == tsr.f.b) {
                    bltVar2.y = tsr.f.c;
                }
            }
            bltVar.h0(clt.a);
            iln.a aVar = bltVar.U().k0;
            if (aVar != null) {
                boolean z = aVar.z;
                duw.a aVar2 = (duw.a) ysrVar.a.A();
                int i3 = aVar2.a.c;
                for (int i4 = 0; i4 < i3; i4++) {
                    ykt yktVarX1 = ((tsr) aVar2.get(i4)).U.d.x1();
                    if (yktVarX1 != null) {
                        yktVarX1.z = z;
                    }
                }
            }
            this.b.O0().l();
            if (bltVar.U().k0 != null) {
                duw.a aVar3 = (duw.a) ysrVar.a.A();
                int i5 = aVar3.a.c;
                for (int i6 = 0; i6 < i5; i6++) {
                    ykt yktVarX2 = ((tsr) aVar3.get(i6)).U.d.x1();
                    if (yktVarX2 != null) {
                        yktVarX2.z = false;
                    }
                }
            }
            duw<tsr> duwVarK2 = ysrVar.a.K();
            tsr[] tsrVarArr2 = duwVarK2.a;
            int i7 = duwVarK2.c;
            for (int i8 = 0; i8 < i7; i8++) {
                blt bltVar3 = tsrVarArr2[i8].V.q;
                bltVar3.getClass();
                int i9 = bltVar3.v;
                int i10 = bltVar3.w;
                if (i9 != i10 && i10 == Integer.MAX_VALUE) {
                    bltVar3.A0(true);
                }
            }
            bltVar.h0(dlt.a);
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function1<pt, Unit> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(pt ptVar) {
            ptVar.s().c = false;
            return Unit.a;
        }
    }

    public blt(ysr ysrVar) {
        this.f = ysrVar;
        this.M = ysrVar.p.H;
    }

    @Override // defpackage.pt
    public final pt A() {
        ysr ysrVar;
        tsr tsrVarH = this.f.a.H();
        if (tsrVarH == null || (ysrVar = tsrVarH.V) == null) {
            return null;
        }
        return ysrVar.q;
    }

    public final void A0(boolean z) {
        ysr ysrVar = this.f;
        if (z && ysrVar.c) {
            return;
        }
        if (z || ysrVar.c) {
            this.G = a.c;
            duw<tsr> duwVarK = ysrVar.a.K();
            tsr[] tsrVarArr = duwVarK.a;
            int i = duwVarK.c;
            for (int i2 = 0; i2 < i; i2++) {
                blt bltVar = tsrVarArr[i2].V.q;
                bltVar.getClass();
                bltVar.A0(true);
            }
        }
    }

    @Override // defpackage.x5w
    public final void E(boolean z) {
        ykt yktVarX1;
        ysr ysrVar = this.f;
        ykt yktVarX2 = ysrVar.a().x1();
        if (Boolean.valueOf(z).equals(yktVarX2 != null ? Boolean.valueOf(yktVarX2.w) : null) || (yktVarX1 = ysrVar.a().x1()) == null) {
            return;
        }
        yktVarX1.w = z;
    }

    public final void G0() {
        a aVar = this.G;
        ysr ysrVar = this.f;
        boolean z = ysrVar.c;
        tsr tsrVar = ysrVar.a;
        if (z) {
            this.G = a.b;
        } else {
            this.G = a.a;
        }
        if (aVar != a.a && ysrVar.e) {
            tsr.f0(tsrVar, true, 6);
        }
        duw<tsr> duwVarK = tsrVar.K();
        tsr[] tsrVarArr = duwVarK.a;
        int i = duwVarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsr tsrVar2 = tsrVarArr[i2];
            blt bltVar = tsrVar2.V.q;
            if (bltVar == null) {
                hb5.a("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (bltVar.w != Integer.MAX_VALUE) {
                bltVar.G0();
                tsr.i0(tsrVar2);
            }
        }
    }

    public final void I0() {
        ysr ysrVar = this.f;
        if (ysrVar.o > 0) {
            duw<tsr> duwVarK = ysrVar.a.K();
            tsr[] tsrVarArr = duwVarK.a;
            int i = duwVarK.c;
            for (int i2 = 0; i2 < i; i2++) {
                tsr tsrVar = tsrVarArr[i2];
                ysr ysrVar2 = tsrVar.V;
                if ((ysrVar2.m || ysrVar2.n) && !ysrVar2.f) {
                    tsrVar.e0(false);
                }
                blt bltVar = ysrVar2.q;
                if (bltVar != null) {
                    bltVar.I0();
                }
            }
        }
    }

    @Override // defpackage.pt
    public final void J() {
        this.K = true;
        wkt wktVar = this.H;
        wktVar.i();
        ysr ysrVar = this.f;
        boolean z = ysrVar.f;
        tsr tsrVar = ysrVar.a;
        if (z) {
            duw<tsr> duwVarK = tsrVar.K();
            tsr[] tsrVarArr = duwVarK.a;
            int i = duwVarK.c;
            for (int i2 = 0; i2 < i; i2++) {
                tsr tsrVar2 = tsrVarArr[i2];
                ysr ysrVar2 = tsrVar2.V;
                if (ysrVar2.e && tsrVar2.F() == tsr.f.a) {
                    blt bltVar = ysrVar2.q;
                    bltVar.getClass();
                    blt bltVar2 = ysrVar2.q;
                    kxa kxaVar = bltVar2 != null ? bltVar2.C : null;
                    kxaVar.getClass();
                    if (bltVar.O0(kxaVar.a)) {
                        tsr.f0(tsrVar, false, 7);
                    }
                }
            }
        }
        iln.a aVar = U().k0;
        aVar.getClass();
        if (ysrVar.g || (!this.z && !aVar.z && ysrVar.f)) {
            ysrVar.f = false;
            tsr.d dVar = ysrVar.d;
            ysrVar.d = tsr.d.d;
            wgz wgzVarA = xsr.a(tsrVar);
            ysrVar.i(false);
            ghz snapshotObserver = wgzVarA.getSnapshotObserver();
            b bVar = new b(aVar);
            snapshotObserver.getClass();
            if (tsrVar.v != null) {
                snapshotObserver.a(tsrVar, snapshotObserver.h, bVar);
            } else {
                snapshotObserver.a(tsrVar, snapshotObserver.e, bVar);
            }
            ysrVar.d = dVar;
            if (ysrVar.m && aVar.z) {
                requestLayout();
            }
            ysrVar.g = false;
        }
        if (wktVar.d) {
            wktVar.e = true;
        }
        if (wktVar.b && wktVar.f()) {
            wktVar.h();
        }
        this.K = false;
    }

    public final void J0() {
        tsr.f fVar;
        ysr ysrVar = this.f;
        tsr.f0(ysrVar.a, false, 7);
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

    public final void K0() {
        tsr.d dVar;
        this.N = true;
        ysr ysrVar = this.f;
        tsr tsrVarH = ysrVar.a.H();
        a aVar = this.G;
        if ((aVar != a.a && !ysrVar.c) || (aVar != a.b && ysrVar.c)) {
            G0();
            if (this.i && tsrVarH != null) {
                tsrVarH.e0(false);
            }
        }
        if (tsrVarH != null) {
            ysr ysrVar2 = tsrVarH.V;
            if (!this.i && ((dVar = ysrVar2.d) == tsr.d.c || dVar == tsr.d.d)) {
                if (this.w != Integer.MAX_VALUE) {
                    wkn.c("Place was called on a node which was placed already");
                }
                int i = ysrVar2.h;
                this.w = i;
                ysrVar2.h = i + 1;
            }
        } else {
            this.w = 0;
        }
        J();
    }

    public final void N0(long j, v6l v6lVar, Function1 function1) throws Throwable {
        ysr ysrVar = this.f;
        tsr tsrVar = ysrVar.a;
        tsr tsrVar2 = ysrVar.a;
        try {
            tsr tsrVarH = tsrVar.H();
            tsr.d dVar = tsrVarH != null ? tsrVarH.V.d : null;
            tsr.d dVar2 = tsr.d.d;
            if (dVar == dVar2) {
                ysrVar.c = false;
            }
            if (tsrVar2.f0) {
                wkn.a("place is called on a deactivated node");
            }
            ysrVar.d = dVar2;
            this.A = true;
            this.N = false;
            if (!iwo.b(j, this.D)) {
                if (ysrVar.n || ysrVar.m) {
                    ysrVar.f = true;
                }
                I0();
            }
            wgz wgzVarA = xsr.a(tsrVar2);
            if (ysrVar.f || !i()) {
                ysrVar.h(false);
                this.H.g = false;
                ghz snapshotObserver = wgzVarA.getSnapshotObserver();
                flt fltVar = new flt(this, wgzVarA, j);
                snapshotObserver.getClass();
                if (tsrVar2.v != null) {
                    snapshotObserver.a(tsrVar2, snapshotObserver.g, fltVar);
                } else {
                    snapshotObserver.a(tsrVar2, snapshotObserver.f, fltVar);
                }
            } else {
                ykt yktVarX1 = ysrVar.a().x1();
                yktVarX1.getClass();
                yktVarX1.i1(iwo.d(j, yktVarX1.e));
                K0();
            }
            this.D = j;
            this.E = function1;
            this.F = v6lVar;
            ysrVar.d = tsr.d.e;
            Unit unit = Unit.a;
        } catch (Throwable th) {
            tsrVar.k0(th);
            throw null;
        }
    }

    public final boolean O0(long j) throws Throwable {
        ysr ysrVar = this.f;
        tsr tsrVar = ysrVar.a;
        tsr tsrVar2 = ysrVar.a;
        try {
            if (tsrVar.f0) {
                wkn.a("measure is called on a deactivated node");
            }
            tsr tsrVarH = tsrVar2.H();
            tsrVar2.T = tsrVar2.T || (tsrVarH != null && tsrVarH.T);
            if (!tsrVar2.V.e) {
                kxa kxaVar = this.C;
                if (kxaVar == null ? false : kxa.c(kxaVar.a, j)) {
                    wgz wgzVar = tsrVar2.C;
                    if (wgzVar != null) {
                        wgzVar.k(tsrVar2, true);
                    }
                    tsrVar2.j0();
                    return false;
                }
            }
            this.C = new kxa(j);
            w0(j);
            this.H.f = false;
            h0(c.a);
            long j2 = this.B ? this.c : -9223372034707292160L;
            this.B = true;
            ykt yktVarX1 = ysrVar.a().x1();
            if (yktVarX1 == null) {
                wkn.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            ysrVar.c(j);
            u0((((long) yktVarX1.a) << 32) | (((long) yktVarX1.b) & 4294967295L));
            return (((int) (j2 >> 32)) == yktVarX1.a && ((int) (j2 & 4294967295L)) == yktVarX1.b) ? false : true;
        } catch (Throwable th) {
            tsrVar.k0(th);
            throw null;
        }
    }

    @Override // defpackage.mzo
    public final int R(int i) {
        J0();
        ykt yktVarX1 = this.f.a().x1();
        yktVarX1.getClass();
        return yktVarX1.R(i);
    }

    @Override // defpackage.pt
    public final iln U() {
        return this.f.a.U.c;
    }

    @Override // defpackage.mzo
    public final int a0(int i) {
        J0();
        ykt yktVarX1 = this.f.a().x1();
        yktVarX1.getClass();
        return yktVarX1.a0(i);
    }

    @Override // defpackage.mzo
    public final int b0(int i) {
        J0();
        ykt yktVarX1 = this.f.a().x1();
        yktVarX1.getClass();
        return yktVarX1.b0(i);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    @Override // defpackage.vhv
    public final y d0(long j) {
        tsr.f fVar;
        tsr.f fVar2 = tsr.f.c;
        ysr ysrVar = this.f;
        tsr tsrVar = ysrVar.a;
        tsr tsrVar2 = ysrVar.a;
        tsr tsrVarH = tsrVar.H();
        if ((tsrVarH != null ? tsrVarH.V.d : null) == tsr.d.b) {
            ysrVar.b = false;
        } else {
            tsr tsrVarH2 = tsrVar2.H();
            if ((tsrVarH2 != null ? tsrVarH2.V.d : null) == tsr.d.d) {
                ysrVar.b = false;
            }
        }
        tsr tsrVarH3 = tsrVar2.H();
        if (tsrVarH3 != null) {
            ysr ysrVar2 = tsrVarH3.V;
            if (this.y != fVar2 && !tsrVar2.T) {
                wkn.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = ysrVar2.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                fVar = tsr.f.a;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    uj5.a(ysrVar2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                fVar = tsr.f.b;
            }
            this.y = fVar;
        } else {
            this.y = fVar2;
        }
        if (tsrVar2.R == fVar2) {
            tsrVar2.s();
        }
        O0(j);
        return this;
    }

    @Override // defpackage.eiv
    public final int f0(kt ktVar) {
        ysr ysrVar = this.f;
        tsr tsrVarH = ysrVar.a.H();
        tsr.d dVar = tsrVarH != null ? tsrVarH.V.d : null;
        tsr.d dVar2 = tsr.d.b;
        wkt wktVar = this.H;
        if (dVar == dVar2) {
            wktVar.c = true;
        } else {
            tsr tsrVarH2 = ysrVar.a.H();
            if ((tsrVarH2 != null ? tsrVarH2.V.d : null) == tsr.d.d) {
                wktVar.d = true;
            }
        }
        this.z = true;
        ykt yktVarX1 = ysrVar.a().x1();
        yktVarX1.getClass();
        int iF0 = yktVarX1.f0(ktVar);
        this.z = false;
        return iF0;
    }

    @Override // defpackage.eiv, defpackage.mzo
    public final Object g() {
        return this.M;
    }

    @Override // defpackage.pt
    public final void h0(Function1<? super pt, Unit> function1) {
        duw<tsr> duwVarK = this.f.a.K();
        tsr[] tsrVarArr = duwVarK.a;
        int i = duwVarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            blt bltVar = tsrVarArr[i2].V.q;
            bltVar.getClass();
            function1.invoke(bltVar);
        }
    }

    @Override // defpackage.pt
    public final boolean i() {
        return this.G != a.c;
    }

    @Override // defpackage.pt
    public final void k0() {
        tsr.f0(this.f.a, false, 7);
    }

    @Override // androidx.compose.ui.layout.y
    public final int l0() {
        ykt yktVarX1 = this.f.a().x1();
        yktVarX1.getClass();
        return yktVarX1.l0();
    }

    @Override // androidx.compose.ui.layout.y
    public final int o0() {
        ykt yktVarX1 = this.f.a().x1();
        yktVarX1.getClass();
        return yktVarX1.o0();
    }

    @Override // androidx.compose.ui.layout.y
    public final void r0(long j, float f, v6l v6lVar) throws Throwable {
        N0(j, v6lVar, null);
    }

    @Override // defpackage.pt
    public final void requestLayout() {
        tsr tsrVar = this.f.a;
        tsr.c cVar = tsr.g0;
        tsrVar.e0(false);
    }

    @Override // defpackage.pt
    public final ot s() {
        return this.H;
    }

    @Override // androidx.compose.ui.layout.y
    public final void t0(long j, float f, Function1<? super a7l, Unit> function1) throws Throwable {
        N0(j, null, function1);
    }

    @Override // defpackage.mzo
    public final int x(int i) {
        J0();
        ykt yktVarX1 = this.f.a().x1();
        yktVarX1.getClass();
        return yktVarX1.x(i);
    }
}

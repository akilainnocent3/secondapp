package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.layout.y;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qsr extends ywx {
    public static final b90 n0;
    public psr j0;
    public kxa k0;
    public a l0;
    public c m0;

    public final class a extends ykt {
        public a() {
            super(qsr.this);
        }

        @Override // defpackage.xkt
        public final int G0(kt ktVar) {
            int iB = te4.b(this, ktVar);
            this.J.h(iB, ktVar);
            return iB;
        }

        @Override // defpackage.mzo
        public final int R(int i) {
            qsr qsrVar = qsr.this;
            psr psrVar = qsrVar.j0;
            ywx ywxVar = qsrVar.H;
            ywxVar.getClass();
            ykt yktVarX1 = ywxVar.x1();
            yktVarX1.getClass();
            return psrVar.w(this, yktVarX1, i);
        }

        @Override // defpackage.mzo
        public final int a0(int i) {
            qsr qsrVar = qsr.this;
            psr psrVar = qsrVar.j0;
            ywx ywxVar = qsrVar.H;
            ywxVar.getClass();
            ykt yktVarX1 = ywxVar.x1();
            yktVarX1.getClass();
            return psrVar.o(this, yktVarX1, i);
        }

        @Override // defpackage.mzo
        public final int b0(int i) {
            qsr qsrVar = qsr.this;
            psr psrVar = qsrVar.j0;
            ywx ywxVar = qsrVar.H;
            ywxVar.getClass();
            ykt yktVarX1 = ywxVar.x1();
            yktVarX1.getClass();
            return psrVar.C(this, yktVarX1, i);
        }

        @Override // defpackage.vhv
        public final y d0(long j) {
            w0(j);
            kxa kxaVar = new kxa(j);
            qsr qsrVar = qsr.this;
            qsrVar.k0 = kxaVar;
            psr psrVar = qsrVar.j0;
            ywx ywxVar = qsrVar.H;
            ywxVar.getClass();
            ykt yktVarX1 = ywxVar.x1();
            yktVarX1.getClass();
            m1(psrVar.e(this, yktVarX1, j));
            return this;
        }

        @Override // defpackage.mzo
        public final int x(int i) {
            qsr qsrVar = qsr.this;
            psr psrVar = qsrVar.j0;
            ywx ywxVar = qsrVar.H;
            ywxVar.getClass();
            ykt yktVarX1 = ywxVar.x1();
            yktVarX1.getClass();
            return psrVar.s(this, yktVarX1, i);
        }
    }

    public static final class b implements biv {
        public final /* synthetic */ biv a;
        public final int b;
        public final int c;

        public b(biv bivVar, qsr qsrVar) {
            this.a = bivVar;
            a aVar = qsrVar.l0;
            aVar.getClass();
            this.b = aVar.a;
            a aVar2 = qsrVar.l0;
            aVar2.getClass();
            this.c = aVar2.b;
        }

        @Override // defpackage.biv
        public final int b() {
            return this.c;
        }

        @Override // defpackage.biv
        public final int c() {
            return this.b;
        }

        @Override // defpackage.biv
        public final void l() {
            this.a.l();
        }

        @Override // defpackage.biv
        public final Function1<r160, Unit> m() {
            return this.a.m();
        }

        @Override // defpackage.biv
        public final Map<kt, Integer> s() {
            return this.a.s();
        }
    }

    static {
        b90 b90VarA = c90.a();
        b90VarA.m(j58.i);
        b90VarA.r(1.0f);
        b90VarA.h(1);
        n0 = b90VarA;
    }

    public qsr(tsr tsrVar, psr psrVar) {
        super(tsrVar);
        this.j0 = psrVar;
        this.l0 = tsrVar.v != null ? new a() : null;
        this.m0 = (psrVar.i().c & 512) != 0 ? new c(this, (androidx.compose.ui.layout.b) psrVar) : null;
    }

    @Override // defpackage.ywx
    public final d.c E1() {
        return this.j0.i();
    }

    @Override // defpackage.xkt
    public final int G0(kt ktVar) {
        a aVar = this.l0;
        if (aVar == null) {
            return te4.b(this, ktVar);
        }
        dtw<kt> dtwVar = aVar.J;
        int iD = dtwVar.d(ktVar);
        if (iD >= 0) {
            return dtwVar.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.mzo
    public final int R(int i) {
        c cVar = this.m0;
        if (cVar != null) {
            androidx.compose.ui.layout.b bVar = cVar.b;
            ywx ywxVar = this.H;
            ywxVar.getClass();
            return bVar.A0(cVar, ywxVar, i);
        }
        psr psrVar = this.j0;
        ywx ywxVar2 = this.H;
        ywxVar2.getClass();
        return psrVar.w(this, ywxVar2, i);
    }

    @Override // defpackage.mzo
    public final int a0(int i) {
        c cVar = this.m0;
        if (cVar != null) {
            androidx.compose.ui.layout.b bVar = cVar.b;
            ywx ywxVar = this.H;
            ywxVar.getClass();
            return bVar.d0(cVar, ywxVar, i);
        }
        psr psrVar = this.j0;
        ywx ywxVar2 = this.H;
        ywxVar2.getClass();
        return psrVar.o(this, ywxVar2, i);
    }

    @Override // defpackage.mzo
    public final int b0(int i) {
        c cVar = this.m0;
        if (cVar != null) {
            androidx.compose.ui.layout.b bVar = cVar.b;
            ywx ywxVar = this.H;
            ywxVar.getClass();
            return bVar.i1(cVar, ywxVar, i);
        }
        psr psrVar = this.j0;
        ywx ywxVar2 = this.H;
        ywxVar2.getClass();
        return psrVar.C(this, ywxVar2, i);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    @Override // defpackage.vhv
    public final y d0(long j) {
        biv bivVarE;
        boolean z;
        kxa kxaVar;
        if (this.G) {
            kxa kxaVar2 = this.k0;
            if (kxaVar2 == null) {
                hb5.a("Lookahead constraints cannot be null in approach pass.");
                return null;
            }
            j = kxaVar2.a;
        }
        w0(j);
        c cVar = this.m0;
        if (cVar != null) {
            androidx.compose.ui.layout.b bVar = cVar.b;
            a aVar = cVar.a.l0;
            aVar.getClass();
            biv bivVarO0 = aVar.O0();
            bivVarO0.c();
            bivVarO0.b();
            boolean z2 = bVar.m1() || (kxaVar = this.k0) == null || j != kxaVar.a;
            cVar.c = z2;
            if (!z2) {
                ywx ywxVar = this.H;
                ywxVar.getClass();
                ywxVar.G = true;
            }
            ywx ywxVar2 = this.H;
            ywxVar2.getClass();
            bivVarE = bVar.H1(cVar, ywxVar2, j);
            ywx ywxVar3 = this.H;
            ywxVar3.getClass();
            ywxVar3.G = false;
            int iC = bivVarE.c();
            a aVar2 = this.l0;
            aVar2.getClass();
            if (iC == aVar2.a) {
                int iB = bivVarE.b();
                a aVar3 = this.l0;
                aVar3.getClass();
                z = iB == aVar3.b;
            }
            if (!cVar.c) {
                ywx ywxVar4 = this.H;
                ywxVar4.getClass();
                long j2 = ywxVar4.c;
                ywx ywxVar5 = this.H;
                ywxVar5.getClass();
                ykt yktVarX1 = ywxVar5.x1();
                if (jxo.a(yktVarX1 != null ? new jxo(yktVarX1.Y0()) : null, j2) && !z) {
                    bivVarE = new b(bivVarE, this);
                }
            }
        } else {
            psr psrVar = this.j0;
            ywx ywxVar6 = this.H;
            ywxVar6.getClass();
            bivVarE = psrVar.e(this, ywxVar6, j);
        }
        m2(bivVarE);
        e2();
        return this;
    }

    @Override // defpackage.ywx
    public final void i2(lc6 lc6Var, v6l v6lVar) {
        ywx ywxVar;
        ywx ywxVar2 = this.H;
        ywxVar2.getClass();
        ywxVar2.m1(lc6Var, v6lVar);
        if (!xsr.a(this.E).getShowLayoutBounds() || (ywxVar = this.H) == null) {
            return;
        }
        if (jxo.b(this.c, ywxVar.c) && iwo.b(ywxVar.R, 0L)) {
            return;
        }
        long j = this.c;
        lc6Var.v(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, n0);
    }

    @Override // defpackage.ywx
    public final void o1() {
        if (this.l0 == null) {
            this.l0 = new a();
        }
    }

    @Override // defpackage.ywx, androidx.compose.ui.layout.y
    public final void r0(long j, float f, v6l v6lVar) {
        super.r0(j, f, v6lVar);
        v2();
    }

    @Override // defpackage.ywx, androidx.compose.ui.layout.y
    public final void t0(long j, float f, Function1<? super a7l, Unit> function1) {
        super.t0(j, f, function1);
        v2();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    public final void v2() {
        boolean z;
        if (this.y) {
            return;
        }
        f2();
        c cVar = this.m0;
        if (cVar != null) {
            this.l0.getClass();
            if (cVar.c) {
                z = false;
            } else {
                long j = this.c;
                a aVar = this.l0;
                if (jxo.a(aVar != null ? new jxo(aVar.Y0()) : null, j)) {
                    ywx ywxVar = this.H;
                    ywxVar.getClass();
                    long j2 = ywxVar.c;
                    ywx ywxVar2 = this.H;
                    ywxVar2.getClass();
                    ykt yktVarX1 = ywxVar2.x1();
                    if (jxo.a(yktVarX1 != null ? new jxo(yktVarX1.Y0()) : null, j2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            ywx ywxVar3 = this.H;
            ywxVar3.getClass();
            ywxVar3.F = z;
        }
        O0().l();
        ywx ywxVar4 = this.H;
        ywxVar4.getClass();
        ywxVar4.F = false;
    }

    public final void w2(psr psrVar) {
        if (!psrVar.equals(this.j0)) {
            if ((psrVar.i().c & 512) != 0) {
                androidx.compose.ui.layout.b bVar = (androidx.compose.ui.layout.b) psrVar;
                c cVar = this.m0;
                if (cVar != null) {
                    cVar.b = bVar;
                } else {
                    cVar = new c(this, bVar);
                }
                this.m0 = cVar;
            } else {
                this.m0 = null;
            }
        }
        this.j0 = psrVar;
    }

    @Override // defpackage.mzo
    public final int x(int i) {
        c cVar = this.m0;
        if (cVar != null) {
            androidx.compose.ui.layout.b bVar = cVar.b;
            ywx ywxVar = this.H;
            ywxVar.getClass();
            return bVar.N0(cVar, ywxVar, i);
        }
        psr psrVar = this.j0;
        ywx ywxVar2 = this.H;
        ywxVar2.getClass();
        return psrVar.s(this, ywxVar2, i);
    }

    @Override // defpackage.ywx
    public final ykt x1() {
        return this.l0;
    }
}

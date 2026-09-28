package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class tt1 extends d.c implements psr, qcf, ya80, s020, l3w, n3w, hsz, mrr, l2l, w3i, z4i, d5i, xgz, aj5 {
    public d.b D;
    public boolean E;
    public st1 F;
    public HashSet<i3w<?>> G;
    public urr H;

    public static final class a extends qlr implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            tt1.this.r2();
            return Unit.a;
        }
    }

    public static final class b implements wgz.a {
        public b() {
        }

        @Override // wgz.a
        public final void h() {
            tt1 tt1Var = tt1.this;
            if (tt1Var.H == null) {
                tt1Var.T0(pkd.d(tt1Var, 128));
            }
        }
    }

    public static final class c extends qlr implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            tt1 tt1Var = tt1.this;
            d.b bVar = tt1Var.D;
            bVar.getClass();
            ((j3w) bVar).g(tt1Var);
            return Unit.a;
        }
    }

    @Override // defpackage.qcf
    public final void A(wsr wsrVar) {
        d.b bVar = this.D;
        bVar.getClass();
        pcf pcfVar = (pcf) bVar;
        if (this.E && (bVar instanceof ncf)) {
            d.b bVar2 = this.D;
            if (bVar2 instanceof ncf) {
                pkd.g(this).getSnapshotObserver().a(this, vt1.b, new ut1(bVar2, this));
            }
            this.E = false;
        }
        pcfVar.A(wsrVar);
    }

    @Override // defpackage.psr
    public final int C(xkt xktVar, mzo mzoVar, int i) {
        d.b bVar = this.D;
        bVar.getClass();
        return ((nsr) bVar).C(xktVar, mzoVar, i);
    }

    @Override // defpackage.w3i
    public final void E1(j5i j5iVar) {
        d.b bVar = this.D;
        if (!(bVar instanceof v3i)) {
            wkn.c("onFocusEvent called on wrong node");
        }
        ((v3i) bVar).u();
    }

    @Override // defpackage.ya80
    public final void G0(pb80 pb80Var) {
        d.b bVar = this.D;
        bVar.getClass();
        sa80 sa80VarF = ((wa80) bVar).f();
        pb80Var.getClass();
        sa80 sa80Var = (sa80) pb80Var;
        rtw<ob80<?>, Object> rtwVar = sa80Var.a;
        if (sa80VarF.c) {
            sa80Var.c = true;
        }
        if (sa80VarF.d) {
            sa80Var.d = true;
        }
        rtw<ob80<?>, Object> rtwVar2 = sa80VarF.a;
        Object[] objArr = rtwVar2.b;
        Object[] objArr2 = rtwVar2.c;
        long[] jArr = rtwVar2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        ob80<?> ob80Var = (ob80) obj;
                        if (!rtwVar.a(ob80Var)) {
                            rtwVar.m(ob80Var, obj2);
                        } else if (obj2 instanceof c6) {
                            Object objD = rtwVar.d(ob80Var);
                            objD.getClass();
                            c6 c6Var = (c6) objD;
                            String str = c6Var.a;
                            if (str == null) {
                                str = ((c6) obj2).a;
                            }
                            haj hajVar = c6Var.b;
                            if (hajVar == null) {
                                hajVar = ((c6) obj2).b;
                            }
                            rtwVar.m(ob80Var, new c6(str, hajVar));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.mrr
    public final void M(long j) {
        d.b bVar = this.D;
        if (bVar instanceof apy) {
            ((apy) bVar).k();
        }
    }

    @Override // defpackage.s020
    public final boolean S1() {
        d.b bVar = this.D;
        bVar.getClass();
        ((r020) bVar).t().getClass();
        return true;
    }

    @Override // defpackage.mrr
    public final void T0(urr urrVar) {
        this.H = urrVar;
        d.b bVar = this.D;
        if (bVar instanceof soy) {
            ((soy) bVar).m();
        }
    }

    @Override // defpackage.hsz
    public final Object U(mmd mmdVar, Object obj) {
        d.b bVar = this.D;
        bVar.getClass();
        return ((gsz) bVar).v();
    }

    @Override // defpackage.s020
    public final void W(b020 b020Var, c020 c020Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        d.b bVar = this.D;
        bVar.getClass();
        v020.b bVarT = ((r020) bVar).t();
        v020 v020Var = v020.this;
        List<m020> list = b020Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            m020 m020Var = list.get(i);
            if (ovo.c(m020Var) || ovo.e(m020Var)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (list.get(i2).b()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (v020Var.d) {
            z3 = true;
            break;
        }
        int size3 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                m020 m020Var2 = list.get(i3);
                if (!ovo.c(m020Var2) && !ovo.e(m020Var2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        if (bVarT.c != v020.a.c) {
            if (c020Var == c020.a && z3) {
                bVarT.d = b020Var;
                bVarT.h(b020Var, !z || v020Var.d);
            }
            if (c020Var == c020.b && z && b020Var == bVarT.d && v020Var.d) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    list.get(i4).a();
                }
            }
            if (c020Var == c020.c && !z3 && b020Var != bVarT.d) {
                bVarT.h(b020Var, true);
            }
        }
        if (c020Var == c020.c) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    bVarT.c = v020.a.a;
                    v020Var.d = false;
                    bVarT.d = null;
                    break;
                } else if (!ovo.e(list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (b020Var == bVarT.d && z) {
                int size6 = list.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    if (list.get(i6).b()) {
                        if (v020Var.d) {
                            break;
                        }
                        bVarT.l(b020Var);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    list.get(i7).a();
                }
            }
        }
    }

    @Override // defpackage.xgz
    public final boolean Z0() {
        return this.C;
    }

    @Override // defpackage.z4i
    public final void b0(v4i v4iVar) {
        d.b bVar = this.D;
        if (!(bVar instanceof q4i)) {
            wkn.c("applyFocusProperties called on wrong node");
        }
        ((q4i) bVar).y();
    }

    @Override // defpackage.aj5
    public final long d() {
        return kc6.d(pkd.d(this, 128).c);
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        d.b bVar = this.D;
        bVar.getClass();
        return ((nsr) bVar).e(tVar, vhvVar, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // defpackage.l3w, defpackage.n3w
    public final <T> T g(i3w<T> i3wVar) {
        wwx wwxVar;
        HashSet<i3w<?>> hashSet = this.G;
        g730<g8j0> g730Var = u8j0.a;
        hashSet.add(g730Var);
        if (!this.a.C) {
            wkn.c("visitAncestors called on an unattached node");
        }
        d.c cVar = this.a.e;
        tsr tsrVarF = pkd.f(this);
        while (tsrVarF != null) {
            if ((tsrVarF.U.f.d & 32) != 0) {
                while (cVar != null) {
                    if ((cVar.c & 32) != 0) {
                        ?? C = cVar;
                        ?? duwVar = 0;
                        while (C != 0) {
                            if (C instanceof l3w) {
                                l3w l3wVar = (l3w) C;
                                if (l3wVar.o0().g(g730Var)) {
                                    return (T) l3wVar.o0().i(g730Var);
                                }
                            } else if ((C.c & 32) != 0 && (C instanceof tkd)) {
                                d.c cVar2 = ((tkd) C).E;
                                int i = 0;
                                C = C;
                                duwVar = duwVar;
                                while (cVar2 != null) {
                                    if ((cVar2.c & 32) != 0) {
                                        i++;
                                        if (i == 1) {
                                            duwVar = duwVar;
                                            C = cVar2;
                                        } else {
                                            if (duwVar == 0) {
                                                duwVar = new duw(new d.c[16]);
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
                    cVar = cVar.e;
                }
            }
            tsrVarF = tsrVarF.H();
            cVar = (tsrVarF == null || (wwxVar = tsrVarF.U) == null) ? null : wwxVar.e;
        }
        return (T) g730Var.a.invoke();
    }

    @Override // defpackage.aj5
    public final mmd getDensity() {
        return pkd.f(this).N;
    }

    @Override // defpackage.aj5
    public final asr getLayoutDirection() {
        return pkd.f(this).O;
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        p2(true);
    }

    @Override // defpackage.s020
    public final void i0() {
        d.b bVar = this.D;
        bVar.getClass();
        ((r020) bVar).t().getClass();
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        q2();
    }

    @Override // defpackage.s020
    public final void n1() {
        d.b bVar = this.D;
        bVar.getClass();
        v020.b bVarT = ((r020) bVar).t();
        v020 v020Var = v020.this;
        if (bVarT.c == v020.a.b) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            w020 w020Var = new w020(v020Var);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            w020Var.invoke(motionEventObtain);
            motionEventObtain.recycle();
            bVarT.c = v020.a.a;
            v020Var.d = false;
            bVarT.d = null;
        }
    }

    @Override // defpackage.psr
    public final int o(xkt xktVar, mzo mzoVar, int i) {
        d.b bVar = this.D;
        bVar.getClass();
        return ((nsr) bVar).o(xktVar, mzoVar, i);
    }

    @Override // defpackage.l3w
    public final kni0 o0() {
        st1 st1Var = this.F;
        return st1Var != null ? st1Var : p2g.b;
    }

    public final void p2(boolean z) {
        if (!this.C) {
            wkn.c("initializeModifier called on unattached node");
        }
        d.b bVar = this.D;
        if ((this.c & 32) != 0) {
            if (bVar instanceof j3w) {
                pkd.g(this).x(new a());
            }
            if (bVar instanceof m3w) {
                m3w<?> m3wVar = (m3w) bVar;
                st1 st1Var = this.F;
                g730<g8j0> g730Var = u8j0.a;
                if (st1Var == null || !st1Var.g(g730Var)) {
                    st1 st1Var2 = new st1();
                    st1Var2.b = m3wVar;
                    this.F = st1Var2;
                    if (vt1.a(this)) {
                        k3w modifierLocalManager = pkd.g(this).getModifierLocalManager();
                        modifierLocalManager.b.b(this);
                        modifierLocalManager.c.b(g730Var);
                        modifierLocalManager.a();
                    }
                } else {
                    st1Var.b = m3wVar;
                    k3w modifierLocalManager2 = pkd.g(this).getModifierLocalManager();
                    modifierLocalManager2.b.b(this);
                    modifierLocalManager2.c.b(g730Var);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.c & 4) != 0) {
            if (bVar instanceof ncf) {
                this.E = true;
            }
            if (!z) {
                pkd.d(this, 2).Y1();
            }
        }
        if ((this.c & 2) != 0) {
            if (vt1.a(this)) {
                ywx ywxVar = this.v;
                ywxVar.getClass();
                ((qsr) ywxVar).w2(this);
                vgz vgzVar = ywxVar.a0;
                if (vgzVar != null) {
                    vgzVar.invalidate();
                }
            }
            if (!z) {
                pkd.d(this, 2).Y1();
                pkd.f(this).P();
            }
        }
        if (bVar instanceof z250) {
            ((z250) bVar).p(pkd.f(this));
        }
        if ((this.c & 128) != 0) {
            if ((bVar instanceof apy) && vt1.a(this)) {
                pkd.f(this).P();
            }
            if (bVar instanceof soy) {
                this.H = null;
                if (vt1.a(this)) {
                    pkd.g(this).e(new b());
                }
            }
        }
        if ((this.c & 256) != 0 && (bVar instanceof foy) && vt1.a(this)) {
            pkd.f(this).P();
        }
        if (bVar instanceof c5i) {
            ((c5i) bVar).i().a.b(this);
        }
        if ((this.c & 16) != 0 && (bVar instanceof r020)) {
            ((r020) bVar).t().b = this.v;
        }
        if ((this.c & 8) != 0) {
            pkd.g(this).A();
        }
    }

    public final void q2() {
        if (!this.C) {
            wkn.c("unInitializeModifier called on unattached node");
        }
        d.b bVar = this.D;
        if ((this.c & 32) != 0) {
            if (bVar instanceof m3w) {
                k3w modifierLocalManager = pkd.g(this).getModifierLocalManager();
                modifierLocalManager.d.b(pkd.f(this));
                modifierLocalManager.e.b(u8j0.a);
                modifierLocalManager.a();
            }
            if (bVar instanceof j3w) {
                ((j3w) bVar).g(vt1.a);
            }
        }
        if ((this.c & 8) != 0) {
            pkd.g(this).A();
        }
        if (bVar instanceof c5i) {
            ((c5i) bVar).i().a.j(this);
        }
    }

    @Override // defpackage.l2l
    public final void r0(ywx ywxVar) {
        d.b bVar = this.D;
        bVar.getClass();
        ((foy) bVar).x();
    }

    public final void r2() {
        if (this.C) {
            this.G.clear();
            pkd.g(this).getSnapshotObserver().a(this, vt1.c, new c());
        }
    }

    @Override // defpackage.psr
    public final int s(xkt xktVar, mzo mzoVar, int i) {
        d.b bVar = this.D;
        bVar.getClass();
        return ((nsr) bVar).s(xktVar, mzoVar, i);
    }

    @Override // defpackage.qcf
    public final void s1() {
        this.E = true;
        rcf.a(this);
    }

    public final String toString() {
        return this.D.toString();
    }

    @Override // defpackage.psr
    public final int w(xkt xktVar, mzo mzoVar, int i) {
        d.b bVar = this.D;
        bVar.getClass();
        return ((nsr) bVar).w(xktVar, mzoVar, i);
    }

    @Override // defpackage.okd, defpackage.s020
    public final void x() {
        if (this.D instanceof r020) {
            n1();
        }
    }
}

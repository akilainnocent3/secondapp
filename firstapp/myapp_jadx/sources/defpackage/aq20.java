package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class aq20 extends pnh0 {
    public static final b y = new b();
    public static final ScheduledExecutorService z = mku.a();
    public c r;
    public Executor s;
    public wf80.b t;
    public aie0 u;
    public ehe0 v;
    public cie0 w;
    public wf80.c x;

    public static final class b {
        public static final lq20 a;

        static {
            xf50 xf50Var = new xf50(jy0.a, yf50.c);
            a aVar = new a();
            wg1 wg1Var = snh0.C;
            ftw ftwVar = aVar.a;
            ftwVar.Y(wg1Var, 2);
            ftwVar.Y(x9n.k, 0);
            ftwVar.Y(x9n.s, xf50Var);
            ftwVar.Y(snh0.H, Boolean.TRUE);
            ftwVar.Y(d9n.j, dhf.c);
            a = new lq20(w2z.U(ftwVar));
        }
    }

    public interface c {
        void a(cie0 cie0Var);
    }

    @Override // defpackage.pnh0
    public final void A() {
        F();
    }

    @Override // defpackage.pnh0
    public final void C(Rect rect) {
        this.k = rect;
        n26 n26VarC = c();
        ehe0 ehe0Var = this.v;
        if (n26VarC == null || ehe0Var == null) {
            return;
        }
        kpf0.c(new ahe0(ehe0Var, h(n26VarC, o(n26VarC)), ((x9n) this.h).T()));
    }

    public final void F() {
        wf80.c cVar = this.x;
        if (cVar != null) {
            cVar.b();
            this.x = null;
        }
        aie0 aie0Var = this.u;
        if (aie0Var != null) {
            aie0Var.a();
            this.u = null;
        }
        ehe0 ehe0Var = this.v;
        if (ehe0Var != null) {
            ehe0Var.b();
            this.v = null;
        }
        cie0 cie0Var = this.w;
        if (cie0Var != null) {
            synchronized (cie0Var.a) {
                cie0Var.m = null;
                cie0Var.n = null;
            }
        }
        this.w = null;
    }

    public final void G(c cVar) {
        kpf0.a();
        if (cVar == null) {
            this.r = null;
            this.d = pnh0.a.b;
            s();
            return;
        }
        this.r = cVar;
        this.s = z;
        k8e0 k8e0Var = this.i;
        if ((k8e0Var != null ? k8e0Var.f() : null) != null) {
            H((lq20) this.h, this.i);
            r();
        }
        q();
    }

    public final void H(lq20 lq20Var, k8e0 k8e0Var) {
        Rect rect;
        kpf0.a();
        n26 n26VarC = c();
        Objects.requireNonNull(n26VarC);
        F();
        km20.g(null, this.v == null);
        Matrix matrix = this.l;
        boolean zO = n26VarC.o();
        Size sizeF = k8e0Var.f();
        Rect rect2 = this.k;
        if (rect2 != null) {
            rect = rect2;
        } else if (sizeF != null) {
            rect2 = new Rect(0, 0, sizeF.getWidth(), sizeF.getHeight());
            rect = rect2;
        } else {
            rect = null;
        }
        Objects.requireNonNull(rect);
        ehe0 ehe0Var = new ehe0(1, 34, k8e0Var, matrix, zO, rect, h(n26VarC, o(n26VarC)), ((x9n) this.h).T(), n26VarC.o() && o(n26VarC));
        this.v = ehe0Var;
        if (this.o != null) {
            throw null;
        }
        Runnable runnable = new Runnable() { // from class: xp20
            @Override // java.lang.Runnable
            public final void run() {
                this.a.r();
            }
        };
        kpf0.a();
        ehe0Var.a();
        ehe0Var.m.add(runnable);
        cie0 cie0VarC = this.v.c(n26VarC, true);
        this.w = cie0VarC;
        this.u = cie0VarC.k;
        if (this.r != null) {
            n26 n26VarC2 = c();
            ehe0 ehe0Var2 = this.v;
            if (n26VarC2 != null && ehe0Var2 != null) {
                kpf0.c(new ahe0(ehe0Var2, h(n26VarC2, o(n26VarC2)), ((x9n) this.h).T()));
            }
            final c cVar = this.r;
            cVar.getClass();
            final cie0 cie0Var = this.w;
            cie0Var.getClass();
            this.s.execute(new Runnable() { // from class: yp20
                @Override // java.lang.Runnable
                public final void run() {
                    cVar.a(cie0Var);
                }
            });
        }
        wf80.b bVarD = wf80.b.d(lq20Var, k8e0Var.f());
        bVarD.h = k8e0Var.g();
        a(bVarD, k8e0Var);
        int iZ = lq20Var.z();
        if (iZ != 0) {
            ue6.a aVar = bVarD.b;
            if (iZ != 0) {
                aVar.b.Y(snh0.J, Integer.valueOf(iZ));
            }
        }
        if (k8e0Var.d() != null) {
            bVarD.a(k8e0Var.d());
        }
        if (this.r != null) {
            bVarD.b(this.u, k8e0Var.b(), ((x9n) this.h).G());
        }
        wf80.c cVar2 = this.x;
        if (cVar2 != null) {
            cVar2.b();
        }
        wf80.c cVar3 = new wf80.c(new wf80.d() { // from class: zp20
            @Override // wf80.d
            public final void a(wf80 wf80Var) {
                aq20 aq20Var = this.a;
                if (aq20Var.c() == null) {
                    return;
                }
                aq20Var.H((lq20) aq20Var.h, aq20Var.i);
                aq20Var.r();
            }
        });
        this.x = cVar3;
        bVarD.f = cVar3;
        this.t = bVarD;
        Object[] objArr = {bVarD.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
    }

    @Override // defpackage.pnh0
    public final snh0<?> f(boolean z2, tnh0 tnh0Var) {
        y.getClass();
        lq20 lq20Var = b.a;
        hoa hoaVarA = tnh0Var.a(lq20Var.P(), 1);
        if (z2) {
            hoaVarA = hoa.N(hoaVarA, lq20Var);
        }
        if (hoaVarA == null) {
            return null;
        }
        return new lq20(w2z.U(((a) m(hoaVarA)).a));
    }

    @Override // defpackage.pnh0
    public final Set<Integer> k() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // defpackage.pnh0
    public final snh0.b<?, ?, ?> m(hoa hoaVar) {
        return new a(ftw.W(hoaVar));
    }

    public final String toString() {
        return "Preview:".concat(g());
    }

    @Override // defpackage.pnh0
    public final snh0<?> v(m26 m26Var, snh0.b<?, ?, ?> bVar) {
        ((ftw) bVar.a()).Y(d9n.h, 34);
        return bVar.d();
    }

    @Override // defpackage.pnh0
    public final xk1 y(hoa hoaVar) {
        this.t.b.c(hoaVar);
        Object[] objArr = {this.t.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        xk1.a aVarI = this.i.i();
        aVarI.f = hoaVar;
        return aVarI.a();
    }

    @Override // defpackage.pnh0
    public final k8e0 z(k8e0 k8e0Var, k8e0 k8e0Var2) {
        pgt.a("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + k8e0Var + ", secondaryStreamSpec " + k8e0Var2);
        H((lq20) this.h, k8e0Var);
        return k8e0Var;
    }

    public static final class a implements snh0.b<aq20, lq20, a>, x9n.a<a> {
        public final ftw a;

        public a(ftw ftwVar) {
            this.a = ftwVar;
            wg1 wg1Var = h5f0.w;
            Class cls = (Class) ftwVar.b(wg1Var, null);
            if (cls != null && !cls.equals(aq20.class)) {
                nrh0.a(this, "Invalid target class configuration for ", ": ", cls);
                throw null;
            }
            ftwVar.Y(snh0.I, tnh0.b.b);
            ftwVar.Y(wg1Var, aq20.class);
            wg1 wg1Var2 = h5f0.v;
            if (ftwVar.b(wg1Var2, null) == null) {
                ftwVar.Y(wg1Var2, aq20.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
            wg1 wg1Var3 = x9n.n;
            if (((Integer) ftwVar.b(wg1Var3, -1)).intValue() == -1) {
                ftwVar.Y(wg1Var3, 2);
            }
        }

        @Override // defpackage.v1h
        public final csw a() {
            return this.a;
        }

        @Override // x9n.a
        public final a b(int i) {
            wg1 wg1Var = x9n.l;
            Integer numValueOf = Integer.valueOf(i);
            ftw ftwVar = this.a;
            ftwVar.Y(wg1Var, numValueOf);
            ftwVar.Y(x9n.m, Integer.valueOf(i));
            return this;
        }

        @Override // x9n.a
        @Deprecated
        public final a c(Size size) {
            this.a.Y(x9n.o, size);
            return this;
        }

        @Override // snh0.b
        public final snh0 d() {
            return new lq20(w2z.U(this.a));
        }

        public a() {
            this(ftw.V());
        }
    }
}

package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class k2 extends a2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12748e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12749f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f12750g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f12751h = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j2 f12752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12754d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends a2.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f12755c;

        public a(i2 i2Var, b bVar) {
            super(i2Var);
            i2Var.b(bVar.f12292a);
            j2.a aVar = bVar.f12760d;
            if (aVar != null) {
                i2Var.a(aVar.f12292a);
            }
            this.f12755c = bVar;
            bVar.f12759c = this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends a2.a {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f12756p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f12757q = 1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f12758r = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f12759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public j2.a f12760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public h2 f12761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f12762f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12763g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f12764h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f12765i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f12766j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f12767k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final v3.d f12768l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public View.OnKeyListener f12769m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public k f12770n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public j f12771o;

        public b(View view) {
            super(view);
            this.f12763g = 0;
            this.f12767k = 0.0f;
            this.f12768l = v3.d.c(view.getContext());
        }

        public final j2.a d() {
            return this.f12760d;
        }

        public final j e() {
            return this.f12771o;
        }

        public final k f() {
            return this.f12770n;
        }

        public View.OnKeyListener g() {
            return this.f12769m;
        }

        public final h2 h() {
            return this.f12761e;
        }

        public final Object i() {
            return this.f12762f;
        }

        public final float j() {
            return this.f12767k;
        }

        public Object k() {
            return null;
        }

        public a2.a l() {
            return null;
        }

        public final boolean m() {
            return this.f12765i;
        }

        public final boolean n() {
            return this.f12764h;
        }

        public final void o(boolean z10) {
            this.f12763g = z10 ? 1 : 2;
        }

        public final void p(j jVar) {
            this.f12771o = jVar;
        }

        public final void q(k kVar) {
            this.f12770n = kVar;
        }

        public void r(View.OnKeyListener onKeyListener) {
            this.f12769m = onKeyListener;
        }

        public final void s(View view) {
            int i10 = this.f12763g;
            if (i10 == 1) {
                view.setActivated(true);
            } else if (i10 == 2) {
                view.setActivated(false);
            }
        }
    }

    public k2() {
        j2 j2Var = new j2();
        this.f12752b = j2Var;
        this.f12753c = true;
        this.f12754d = 1;
        j2Var.o(true);
    }

    public void A(b bVar, boolean z10) {
        M(bVar);
        L(bVar, bVar.f12292a);
    }

    public void B(b bVar, boolean z10) {
        l(bVar, z10);
        M(bVar);
        L(bVar, bVar.f12292a);
    }

    public void C(b bVar) {
        if (p()) {
            bVar.f12768l.i(bVar.f12767k);
            j2.a aVar = bVar.f12760d;
            if (aVar != null) {
                this.f12752b.p(aVar, bVar.f12767k);
            }
            if (u()) {
                ((i2) bVar.f12759c.f12292a).d(bVar.f12768l.g().getColor());
            }
        }
    }

    public void D(b bVar) {
        j2.a aVar = bVar.f12760d;
        if (aVar != null) {
            this.f12752b.f(aVar);
        }
        bVar.f12761e = null;
        bVar.f12762f = null;
    }

    public void E(b bVar, boolean z10) {
        j2.a aVar = bVar.f12760d;
        if (aVar == null || aVar.f12292a.getVisibility() == 8) {
            return;
        }
        bVar.f12760d.f12292a.setVisibility(z10 ? 0 : 4);
    }

    public final void F(j2 j2Var) {
        this.f12752b = j2Var;
    }

    public final void G(a2.a aVar, boolean z10) {
        b bVarO = o(aVar);
        bVarO.f12765i = z10;
        A(bVarO, z10);
    }

    public final void H(a2.a aVar, boolean z10) {
        b bVarO = o(aVar);
        bVarO.f12764h = z10;
        B(bVarO, z10);
    }

    public final void I(boolean z10) {
        this.f12753c = z10;
    }

    public final void J(a2.a aVar, float f10) {
        b bVarO = o(aVar);
        bVarO.f12767k = f10;
        C(bVarO);
    }

    public final void K(int i10) {
        this.f12754d = i10;
    }

    public final void L(b bVar, View view) {
        int i10 = this.f12754d;
        if (i10 == 1) {
            bVar.o(bVar.m());
        } else if (i10 == 2) {
            bVar.o(bVar.n());
        } else if (i10 == 3) {
            bVar.o(bVar.m() && bVar.n());
        }
        bVar.s(view);
    }

    public final void M(b bVar) {
        if (this.f12752b == null || bVar.f12760d == null) {
            return;
        }
        ((i2) bVar.f12759c.f12292a).e(bVar.m());
    }

    @Override // androidx.leanback.widget.a2
    public final void c(a2.a aVar, Object obj) {
        x(o(aVar), obj);
    }

    @Override // androidx.leanback.widget.a2
    public final a2.a e(ViewGroup viewGroup) {
        a2.a aVar;
        b bVarK = k(viewGroup);
        bVarK.f12766j = false;
        if (w()) {
            i2 i2Var = new i2(viewGroup.getContext());
            j2 j2Var = this.f12752b;
            if (j2Var != null) {
                bVarK.f12760d = (j2.a) j2Var.e((ViewGroup) bVarK.f12292a);
            }
            aVar = new a(i2Var, bVarK);
        } else {
            aVar = bVarK;
        }
        s(bVarK);
        if (bVarK.f12766j) {
            return aVar;
        }
        throw new RuntimeException("super.initializeRowViewHolder() must be called");
    }

    @Override // androidx.leanback.widget.a2
    public final void f(a2.a aVar) {
        D(o(aVar));
    }

    @Override // androidx.leanback.widget.a2
    public final void g(a2.a aVar) {
        y(o(aVar));
    }

    @Override // androidx.leanback.widget.a2
    public final void h(a2.a aVar) {
        z(o(aVar));
    }

    public abstract b k(ViewGroup viewGroup);

    public void l(b bVar, boolean z10) {
        k kVar;
        if (!z10 || (kVar = bVar.f12770n) == null) {
            return;
        }
        kVar.b(null, null, bVar, bVar.i());
    }

    public final j2 n() {
        return this.f12752b;
    }

    public final b o(a2.a aVar) {
        return aVar instanceof a ? ((a) aVar).f12755c : (b) aVar;
    }

    public final boolean p() {
        return this.f12753c;
    }

    public final float q(a2.a aVar) {
        return o(aVar).f12767k;
    }

    public final int r() {
        return this.f12754d;
    }

    public void s(b bVar) {
        bVar.f12766j = true;
        if (t()) {
            return;
        }
        View view = bVar.f12292a;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        a aVar = bVar.f12759c;
        if (aVar != null) {
            ((ViewGroup) aVar.f12292a).setClipChildren(false);
        }
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return true;
    }

    public final boolean v() {
        return u() && p();
    }

    public final boolean w() {
        return this.f12752b != null || v();
    }

    public void x(b bVar, Object obj) {
        bVar.f12762f = obj;
        bVar.f12761e = obj instanceof h2 ? (h2) obj : null;
        if (bVar.f12760d == null || bVar.h() == null) {
            return;
        }
        this.f12752b.c(bVar.f12760d, obj);
    }

    public void y(b bVar) {
        j2.a aVar = bVar.f12760d;
        if (aVar != null) {
            this.f12752b.g(aVar);
        }
    }

    public void z(b bVar) {
        j2.a aVar = bVar.f12760d;
        if (aVar != null) {
            this.f12752b.h(aVar);
        }
        a2.b(bVar.f12292a);
    }

    public void m(b bVar, boolean z10) {
    }
}

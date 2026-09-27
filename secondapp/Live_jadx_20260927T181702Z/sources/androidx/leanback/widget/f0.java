package androidx.leanback.widget;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f0 extends k2 {
    public static final int A = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f12484t = "FullWidthDetailsRP";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f12485u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Handler f12486v = new Handler();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f12487w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f12488x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f12489y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f12490z = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a2 f12492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f12493k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j1 f12494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12496n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12497o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c f12499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12501s;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements i.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f12502a;

        public a(d dVar) {
            this.f12502a = dVar;
        }

        @Override // androidx.leanback.widget.i.h
        public boolean a(KeyEvent keyEvent) {
            if (this.f12502a.g() != null) {
                return this.f12502a.g().onKey(this.f12502a.f12292a, keyEvent.getKeyCode(), keyEvent);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends y0 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public d f12504t;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y0.d f12506b;

            public a(y0.d dVar) {
                this.f12506b = dVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (b.this.f12504t.e() != null) {
                    j jVarE = b.this.f12504t.e();
                    a2.a aVarF = this.f12506b.f();
                    Object objD = this.f12506b.d();
                    d dVar = b.this.f12504t;
                    jVarE.a(aVarF, objD, dVar, dVar.h());
                }
                j1 j1Var = f0.this.f12494l;
                if (j1Var != null) {
                    j1Var.a((androidx.leanback.widget.d) this.f12506b.d());
                }
            }
        }

        public b(d dVar) {
            this.f12504t = dVar;
        }

        @Override // androidx.leanback.widget.y0
        public void i(y0.d dVar) {
            dVar.itemView.removeOnLayoutChangeListener(this.f12504t.D);
            dVar.itemView.addOnLayoutChangeListener(this.f12504t.D);
        }

        @Override // androidx.leanback.widget.y0
        public void j(y0.d dVar) {
            if (this.f12504t.e() == null && f0.this.f12494l == null) {
                return;
            }
            dVar.e().j(dVar.f(), new a(dVar));
        }

        @Override // androidx.leanback.widget.y0
        public void l(y0.d dVar) {
            dVar.itemView.removeOnLayoutChangeListener(this.f12504t.D);
            this.f12504t.u(false);
        }

        @Override // androidx.leanback.widget.y0
        public void m(y0.d dVar) {
            if (this.f12504t.e() == null && f0.this.f12494l == null) {
                return;
            }
            dVar.e().j(dVar.f(), null);
        }
    }

    public f0(a2 a2Var) {
        this(a2Var, new p());
    }

    @Override // androidx.leanback.widget.k2
    public void C(k2.b bVar) {
        super.C(bVar);
        if (p()) {
            d dVar = (d) bVar;
            ((ColorDrawable) dVar.f12510u.getForeground().mutate()).setColor(dVar.f12768l.g().getColor());
        }
    }

    @Override // androidx.leanback.widget.k2
    public void D(k2.b bVar) {
        d dVar = (d) bVar;
        dVar.E();
        this.f12492j.f(dVar.f12513x);
        this.f12493k.f(dVar.f12514y);
        super.D(bVar);
    }

    @Override // androidx.leanback.widget.k2
    public void E(k2.b bVar, boolean z10) {
        super.E(bVar, z10);
        if (this.f12500r) {
            bVar.f12292a.setVisibility(z10 ? 0 : 4);
        }
    }

    public final int N() {
        return this.f12496n;
    }

    public final int O() {
        return this.f12501s;
    }

    public final int P() {
        return this.f12495m;
    }

    public final int Q() {
        return this.f12491i;
    }

    public int R() {
        return s3.a.j.f128839n;
    }

    public j1 S() {
        return this.f12494l;
    }

    public final boolean T() {
        return this.f12500r;
    }

    public final void U(d dVar) {
        W(dVar, dVar.C(), true);
        V(dVar, dVar.C(), true);
        c cVar = this.f12499q;
        if (cVar != null) {
            cVar.a(dVar);
        }
    }

    public void V(d dVar, int i10, boolean z10) {
        View view = dVar.A().f12292a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (this.f12501s != 1) {
            marginLayoutParams.setMarginStart(view.getResources().getDimensionPixelSize(s3.a.e.T0));
        } else {
            marginLayoutParams.setMarginStart(view.getResources().getDimensionPixelSize(s3.a.e.S0) - marginLayoutParams.width);
        }
        int iC = dVar.C();
        if (iC == 0) {
            marginLayoutParams.topMargin = view.getResources().getDimensionPixelSize(s3.a.e.N0) + view.getResources().getDimensionPixelSize(s3.a.e.K0) + view.getResources().getDimensionPixelSize(s3.a.e.R0);
        } else if (iC != 2) {
            marginLayoutParams.topMargin = view.getResources().getDimensionPixelSize(s3.a.e.N0) - (marginLayoutParams.height / 2);
        } else {
            marginLayoutParams.topMargin = 0;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public void W(d dVar, int i10, boolean z10) {
        int dimensionPixelSize;
        boolean z11 = i10 == 2;
        boolean z12 = dVar.C() == 2;
        if (z11 != z12 || z10) {
            Resources resources = dVar.f12292a.getResources();
            int dimensionPixelSize2 = this.f12493k.k(dVar.A(), (q) dVar.h()) ? dVar.A().f12292a.getLayoutParams().width : 0;
            if (this.f12501s != 1) {
                if (z12) {
                    dimensionPixelSize = resources.getDimensionPixelSize(s3.a.e.T0);
                } else {
                    dimensionPixelSize2 += resources.getDimensionPixelSize(s3.a.e.T0);
                    dimensionPixelSize = 0;
                }
            } else if (z12) {
                dimensionPixelSize = resources.getDimensionPixelSize(s3.a.e.S0) - dimensionPixelSize2;
            } else {
                dimensionPixelSize2 = resources.getDimensionPixelSize(s3.a.e.S0);
                dimensionPixelSize = 0;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dVar.B().getLayoutParams();
            marginLayoutParams.topMargin = z12 ? 0 : resources.getDimensionPixelSize(s3.a.e.N0);
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.leftMargin = dimensionPixelSize;
            dVar.B().setLayoutParams(marginLayoutParams);
            ViewGroup viewGroupY = dVar.y();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroupY.getLayoutParams();
            marginLayoutParams2.setMarginStart(dimensionPixelSize2);
            viewGroupY.setLayoutParams(marginLayoutParams2);
            ViewGroup viewGroupX = dVar.x();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) viewGroupX.getLayoutParams();
            marginLayoutParams3.setMarginStart(dimensionPixelSize2);
            marginLayoutParams3.height = z12 ? 0 : resources.getDimensionPixelSize(s3.a.e.K0);
            viewGroupX.setLayoutParams(marginLayoutParams3);
        }
    }

    public void X(d dVar, int i10) {
        W(dVar, i10, false);
        V(dVar, i10, false);
    }

    public final void Y(int i10) {
        this.f12496n = i10;
        this.f12498p = true;
    }

    public final void Z(int i10) {
        this.f12501s = i10;
    }

    public final void a0(int i10) {
        this.f12495m = i10;
        this.f12497o = true;
    }

    public final void b0(int i10) {
        this.f12491i = i10;
    }

    public final void c0(c cVar) {
        this.f12499q = cVar;
    }

    public void d0(j1 j1Var) {
        this.f12494l = j1Var;
    }

    public final void e0(boolean z10) {
        this.f12500r = z10;
    }

    public final void f0(d dVar, int i10) {
        if (dVar.C() != i10) {
            int iC = dVar.C();
            dVar.B = i10;
            X(dVar, iC);
        }
    }

    @Override // androidx.leanback.widget.k2
    public k2.b k(ViewGroup viewGroup) {
        d dVar = new d(LayoutInflater.from(viewGroup.getContext()).inflate(R(), viewGroup, false), this.f12492j, this.f12493k);
        this.f12493k.m(dVar.f12514y, dVar, this);
        f0(dVar, this.f12491i);
        dVar.A = new b(dVar);
        FrameLayout frameLayout = dVar.f12510u;
        if (this.f12497o) {
            frameLayout.setBackgroundColor(this.f12495m);
        }
        if (this.f12498p) {
            frameLayout.findViewById(s3.a.h.T).setBackgroundColor(this.f12496n);
        }
        f2.a(frameLayout, true);
        if (!p()) {
            dVar.f12510u.setForeground(null);
        }
        dVar.f12512w.setOnUnhandledKeyListener(new a(dVar));
        return dVar;
    }

    @Override // androidx.leanback.widget.k2
    public boolean t() {
        return true;
    }

    @Override // androidx.leanback.widget.k2
    public final boolean u() {
        return false;
    }

    @Override // androidx.leanback.widget.k2
    public void x(k2.b bVar, Object obj) {
        super.x(bVar, obj);
        q qVar = (q) obj;
        d dVar = (d) bVar;
        this.f12493k.c(dVar.f12514y, qVar);
        this.f12492j.c(dVar.f12513x, qVar.p());
        dVar.D();
    }

    @Override // androidx.leanback.widget.k2
    public void y(k2.b bVar) {
        super.y(bVar);
        d dVar = (d) bVar;
        this.f12492j.g(dVar.f12513x);
        this.f12493k.g(dVar.f12514y);
    }

    @Override // androidx.leanback.widget.k2
    public void z(k2.b bVar) {
        super.z(bVar);
        d dVar = (d) bVar;
        this.f12492j.h(dVar.f12513x);
        this.f12493k.h(dVar.f12514y);
    }

    public f0(a2 a2Var, p pVar) {
        this.f12491i = 0;
        this.f12495m = 0;
        this.f12496n = 0;
        F(null);
        I(false);
        this.f12492j = a2Var;
        this.f12493k = pVar;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class c {
        public void a(d dVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends k2.b {
        public y0 A;
        public int B;
        public final Runnable C;
        public final View.OnLayoutChangeListener D;
        public final l1 E;
        public final RecyclerView.OnScrollListener F;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final q.a f12508s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final ViewGroup f12509t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final FrameLayout f12510u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final ViewGroup f12511v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final HorizontalGridView f12512w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final a2.a f12513x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final p.a f12514y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f12515z;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h2 h2VarH = d.this.h();
                if (h2VarH == null) {
                    return;
                }
                d dVar = d.this;
                f0.this.f12493k.c(dVar.f12514y, h2VarH);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class b implements View.OnLayoutChangeListener {
            public b() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                d.this.u(false);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class c implements l1 {
            public c() {
            }

            @Override // androidx.leanback.widget.l1
            public void a(ViewGroup viewGroup, View view, int i10, long j10) {
                d.this.w(view);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class e extends q.a {
            public e() {
            }

            @Override // androidx.leanback.widget.q.a
            public void a(q qVar) {
                d.this.t(qVar.m());
            }

            @Override // androidx.leanback.widget.q.a
            public void b(q qVar) {
                Handler handler = f0.f12486v;
                handler.removeCallbacks(d.this.C);
                handler.post(d.this.C);
            }

            @Override // androidx.leanback.widget.q.a
            public void c(q qVar) {
                d dVar = d.this;
                a2.a aVar = dVar.f12513x;
                if (aVar != null) {
                    f0.this.f12492j.f(aVar);
                }
                d dVar2 = d.this;
                f0.this.f12492j.c(dVar2.f12513x, qVar.p());
            }
        }

        public d(View view, a2 a2Var, p pVar) {
            super(view);
            this.f12508s = v();
            this.B = 0;
            this.C = new a();
            this.D = new b();
            c cVar = new c();
            this.E = cVar;
            C0082d c0082d = new C0082d();
            this.F = c0082d;
            ViewGroup viewGroup = (ViewGroup) view.findViewById(s3.a.h.X);
            this.f12509t = viewGroup;
            FrameLayout frameLayout = (FrameLayout) view.findViewById(s3.a.h.Q);
            this.f12510u = frameLayout;
            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(s3.a.h.U);
            this.f12511v = viewGroup2;
            HorizontalGridView horizontalGridView = (HorizontalGridView) frameLayout.findViewById(s3.a.h.S);
            this.f12512w = horizontalGridView;
            horizontalGridView.setHasOverlappingRendering(false);
            horizontalGridView.setOnScrollListener(c0082d);
            horizontalGridView.setAdapter(this.A);
            horizontalGridView.setOnChildSelectedListener(cVar);
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(s3.a.e.f128621t0);
            horizontalGridView.setFadingRightEdgeLength(dimensionPixelSize);
            horizontalGridView.setFadingLeftEdgeLength(dimensionPixelSize);
            a2.a aVarE = a2Var.e(viewGroup2);
            this.f12513x = aVarE;
            viewGroup2.addView(aVarE.f12292a);
            p.a aVar = (p.a) pVar.e(viewGroup);
            this.f12514y = aVar;
            viewGroup.addView(aVar.f12292a);
        }

        public final p.a A() {
            return this.f12514y;
        }

        public final ViewGroup B() {
            return this.f12510u;
        }

        public final int C() {
            return this.B;
        }

        public void D() {
            q qVar = (q) h();
            t(qVar.m());
            qVar.j(this.f12508s);
        }

        public void E() {
            F();
            ((q) h()).v(this.f12508s);
            f0.f12486v.removeCallbacks(this.C);
        }

        public void F() {
            this.A.n(null);
            this.f12512w.setAdapter(null);
            this.f12515z = 0;
        }

        public void t(i1 i1Var) {
            this.A.n(i1Var);
            this.f12512w.setAdapter(this.A);
            this.f12515z = this.A.getItemCount();
        }

        public void u(boolean z10) {
            RecyclerView.f0 f0VarFindViewHolderForPosition = this.f12512w.findViewHolderForPosition(this.f12515z - 1);
            if (f0VarFindViewHolderForPosition != null) {
                f0VarFindViewHolderForPosition.itemView.getRight();
                this.f12512w.getWidth();
            }
            RecyclerView.f0 f0VarFindViewHolderForPosition2 = this.f12512w.findViewHolderForPosition(0);
            if (f0VarFindViewHolderForPosition2 != null) {
                f0VarFindViewHolderForPosition2.itemView.getLeft();
            }
        }

        public q.a v() {
            return new e();
        }

        public void w(View view) {
            RecyclerView.f0 f0VarFindViewHolderForPosition;
            if (n()) {
                if (view != null) {
                    f0VarFindViewHolderForPosition = this.f12512w.getChildViewHolder(view);
                } else {
                    HorizontalGridView horizontalGridView = this.f12512w;
                    f0VarFindViewHolderForPosition = horizontalGridView.findViewHolderForPosition(horizontalGridView.getSelectedPosition());
                }
                y0.d dVar = (y0.d) f0VarFindViewHolderForPosition;
                if (dVar == null) {
                    if (f() != null) {
                        f().b(null, null, this, h());
                    }
                } else if (f() != null) {
                    f().b(dVar.f(), dVar.d(), this, h());
                }
            }
        }

        public final ViewGroup x() {
            return this.f12512w;
        }

        public final ViewGroup y() {
            return this.f12511v;
        }

        public final a2.a z() {
            return this.f12513x;
        }

        /* JADX INFO: renamed from: androidx.leanback.widget.f0$d$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C0082d extends RecyclerView.OnScrollListener {
            public C0082d() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
                d.this.u(true);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            }
        }
    }
}

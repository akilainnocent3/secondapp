package androidx.leanback.widget;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class m extends a2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12780f = 7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f12781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f12782h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f12783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f12784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12786e = true;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i1 f12787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a2 f12788b;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a(a2.a aVar, Object obj, a aVar2);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void a(a2.a aVar, Object obj, a aVar2);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends a2.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i1 f12789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f12790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a2 f12791e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ControlBar f12792f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f12793g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public SparseArray<a2.a> f12794h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public i1.b f12795i;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements ControlBar.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m f12797a;

            public a(m mVar) {
                this.f12797a = mVar;
            }

            @Override // androidx.leanback.widget.ControlBar.a
            public void a(View view, View view2) {
                if (m.this.f12784c == null) {
                    return;
                }
                for (int i10 = 0; i10 < d.this.f12794h.size(); i10++) {
                    if (d.this.f12794h.get(i10).f12292a == view) {
                        d dVar = d.this;
                        m.this.f12784c.a(dVar.f12794h.get(i10), d.this.g().a(i10), d.this.f12790d);
                        return;
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class b extends i1.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m f12799a;

            public b(m mVar) {
                this.f12799a = mVar;
            }

            @Override // androidx.leanback.widget.i1.b
            public void a() {
                d dVar = d.this;
                if (dVar.f12789c == dVar.g()) {
                    d dVar2 = d.this;
                    dVar2.h(dVar2.f12791e);
                }
            }

            @Override // androidx.leanback.widget.i1.b
            public void c(int i10, int i11) {
                d dVar = d.this;
                if (dVar.f12789c == dVar.g()) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        d dVar2 = d.this;
                        dVar2.e(i10 + i12, dVar2.f12791e);
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class c implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f12801b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a2.a f12802c;

            public c(int i10, a2.a aVar) {
                this.f12801b = i10;
                this.f12802c = aVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object objA = d.this.g().a(this.f12801b);
                d dVar = d.this;
                b bVar = m.this.f12783b;
                if (bVar != null) {
                    bVar.a(this.f12802c, objA, dVar.f12790d);
                }
            }
        }

        public d(View view) {
            super(view);
            this.f12794h = new SparseArray<>();
            this.f12793g = view.findViewById(s3.a.h.J);
            ControlBar controlBar = (ControlBar) view.findViewById(s3.a.h.G);
            this.f12792f = controlBar;
            if (controlBar == null) {
                throw new IllegalStateException("Couldn't find control_bar");
            }
            controlBar.c(m.this.f12786e);
            this.f12792f.d(new a(m.this));
            this.f12795i = new b(m.this);
        }

        public final void d(int i10, i1 i1Var, a2 a2Var) {
            a2.a aVarE = this.f12794h.get(i10);
            Object objA = i1Var.a(i10);
            if (aVarE == null) {
                aVarE = a2Var.e(this.f12792f);
                this.f12794h.put(i10, aVarE);
                a2Var.j(aVarE, new c(i10, aVarE));
            }
            if (aVarE.f12292a.getParent() == null) {
                this.f12792f.addView(aVarE.f12292a);
            }
            a2Var.c(aVarE, objA);
        }

        public void e(int i10, a2 a2Var) {
            d(i10, g(), a2Var);
        }

        public int f(Context context, int i10) {
            return m.this.k(context) + m.this.l(context);
        }

        public i1 g() {
            return this.f12789c;
        }

        public void h(a2 a2Var) {
            i1 i1VarG = g();
            int iS = i1VarG == null ? 0 : i1VarG.s();
            View focusedChild = this.f12792f.getFocusedChild();
            if (focusedChild != null && iS > 0 && this.f12792f.indexOfChild(focusedChild) >= iS) {
                this.f12792f.getChildAt(i1VarG.s() - 1).requestFocus();
            }
            for (int childCount = this.f12792f.getChildCount() - 1; childCount >= iS; childCount--) {
                this.f12792f.removeViewAt(childCount);
            }
            for (int i10 = 0; i10 < iS && i10 < 7; i10++) {
                d(i10, i1VarG, a2Var);
            }
            ControlBar controlBar = this.f12792f;
            controlBar.b(f(controlBar.getContext(), iS));
        }
    }

    public m(int i10) {
        this.f12785d = i10;
    }

    @Override // androidx.leanback.widget.a2
    public void c(a2.a aVar, Object obj) {
        d dVar = (d) aVar;
        a aVar2 = (a) obj;
        i1 i1Var = dVar.f12789c;
        i1 i1Var2 = aVar2.f12787a;
        if (i1Var != i1Var2) {
            dVar.f12789c = i1Var2;
            if (i1Var2 != null) {
                i1Var2.p(dVar.f12795i);
            }
        }
        a2 a2Var = aVar2.f12788b;
        dVar.f12791e = a2Var;
        dVar.f12790d = aVar2;
        dVar.h(a2Var);
    }

    @Override // androidx.leanback.widget.a2
    public a2.a e(ViewGroup viewGroup) {
        return new d(LayoutInflater.from(viewGroup.getContext()).inflate(m(), viewGroup, false));
    }

    @Override // androidx.leanback.widget.a2
    public void f(a2.a aVar) {
        d dVar = (d) aVar;
        i1 i1Var = dVar.f12789c;
        if (i1Var != null) {
            i1Var.u(dVar.f12795i);
            dVar.f12789c = null;
        }
        dVar.f12790d = null;
    }

    public int k(Context context) {
        if (f12781g == 0) {
            f12781g = context.getResources().getDimensionPixelSize(s3.a.e.f128558g2);
        }
        return f12781g;
    }

    public int l(Context context) {
        if (f12782h == 0) {
            f12782h = context.getResources().getDimensionPixelSize(s3.a.e.f128546e0);
        }
        return f12782h;
    }

    public int m() {
        return this.f12785d;
    }

    public c n() {
        return this.f12784c;
    }

    public b o() {
        return this.f12783b;
    }

    public void p(d dVar, int i10) {
        dVar.f12793g.setBackgroundColor(i10);
    }

    public void q(boolean z10) {
        this.f12786e = z10;
    }

    public void r(b bVar) {
        this.f12783b = bVar;
    }

    public void s(c cVar) {
        this.f12784c = cVar;
    }
}

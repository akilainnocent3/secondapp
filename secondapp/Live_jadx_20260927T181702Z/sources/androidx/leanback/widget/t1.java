package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class t1 extends m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f13026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f13027k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13028i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends m.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i1 f13029c;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends m.d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public i1 f13030k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public i1.b f13031l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final FrameLayout f13032m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public a2.a f13033n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f13034o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final TextView f13035p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final TextView f13036q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final ProgressBar f13037r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f13038s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f13039t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public long f13040u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public StringBuilder f13041v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public StringBuilder f13042w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f13043x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f13044y;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends i1.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ t1 f13046a;

            public a(t1 t1Var) {
                this.f13046a = t1Var;
            }

            @Override // androidx.leanback.widget.i1.b
            public void a() {
                b bVar = b.this;
                if (bVar.f13034o) {
                    bVar.h(bVar.f12791e);
                }
            }

            @Override // androidx.leanback.widget.i1.b
            public void c(int i10, int i11) {
                if (b.this.f13034o) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        b bVar = b.this;
                        bVar.e(i10 + i12, bVar.f12791e);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: androidx.leanback.widget.t1$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class ViewOnClickListenerC0088b implements View.OnClickListener {
            public ViewOnClickListenerC0088b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                b.this.p();
            }
        }

        public b(View view) {
            super(view);
            this.f13038s = -1L;
            this.f13039t = -1L;
            this.f13040u = -1L;
            this.f13041v = new StringBuilder();
            this.f13042w = new StringBuilder();
            this.f13032m = (FrameLayout) view.findViewById(s3.a.h.N1);
            TextView textView = (TextView) view.findViewById(s3.a.h.L);
            this.f13035p = textView;
            TextView textView2 = (TextView) view.findViewById(s3.a.h.f128762r2);
            this.f13036q = textView2;
            this.f13037r = (ProgressBar) view.findViewById(s3.a.h.X1);
            this.f13031l = new a(t1.this);
            this.f13043x = ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).getMarginStart();
            this.f13044y = ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).getMarginEnd();
        }

        @Override // androidx.leanback.widget.m.d
        public int f(Context context, int i10) {
            int iX;
            int iL = t1.this.l(context);
            if (i10 < 4) {
                iX = t1.this.y(context);
            } else {
                iX = i10 < 6 ? t1.this.x(context) : t1.this.k(context);
            }
            return iL + iX;
        }

        @Override // androidx.leanback.widget.m.d
        public i1 g() {
            return this.f13034o ? this.f13030k : this.f12789c;
        }

        public long i() {
            return this.f13039t;
        }

        public long j() {
            return this.f13040u;
        }

        public long k() {
            return this.f13039t;
        }

        public void l(long j10) {
            long j11 = j10 / 1000;
            if (j10 != this.f13038s) {
                this.f13038s = j10;
                t1.w(j11, this.f13042w);
                this.f13035p.setText(this.f13042w.toString());
            }
            this.f13037r.setProgress((int) ((this.f13038s / this.f13039t) * 2.147483647E9d));
        }

        public void m(long j10) {
            this.f13040u = j10;
            this.f13037r.setSecondaryProgress((int) ((j10 / this.f13039t) * 2.147483647E9d));
        }

        public void n(long j10) {
            if (j10 <= 0) {
                this.f13036q.setVisibility(8);
                this.f13037r.setVisibility(8);
                return;
            }
            this.f13036q.setVisibility(0);
            this.f13037r.setVisibility(0);
            this.f13039t = j10;
            t1.w(j10 / 1000, this.f13041v);
            this.f13036q.setText(this.f13041v.toString());
            this.f13037r.setMax(Integer.MAX_VALUE);
        }

        public void o(boolean z10) {
            if (!z10) {
                a2.a aVar = this.f13033n;
                if (aVar == null || aVar.f12292a.getParent() == null) {
                    return;
                }
                this.f13032m.removeView(this.f13033n.f12292a);
                return;
            }
            if (this.f13033n == null) {
                u1.d dVar = new u1.d(this.f13032m.getContext());
                a2.a aVarE = this.f12791e.e(this.f13032m);
                this.f13033n = aVarE;
                this.f12791e.c(aVarE, dVar);
                this.f12791e.j(this.f13033n, new ViewOnClickListenerC0088b());
            }
            if (this.f13033n.f12292a.getParent() == null) {
                this.f13032m.addView(this.f13033n.f12292a);
            }
        }

        public void p() {
            this.f13034o = !this.f13034o;
            h(this.f12791e);
        }
    }

    public t1(int i10) {
        super(i10);
        this.f13028i = true;
    }

    public static void w(long j10, StringBuilder sb2) {
        long j11 = j10 / 60;
        long j12 = j11 / 60;
        long j13 = j10 - (j11 * 60);
        long j14 = j11 - (60 * j12);
        sb2.setLength(0);
        if (j12 > 0) {
            sb2.append(j12);
            sb2.append(':');
            if (j14 < 10) {
                sb2.append('0');
            }
        }
        sb2.append(j14);
        sb2.append(':');
        if (j13 < 10) {
            sb2.append('0');
        }
        sb2.append(j13);
    }

    public long A(b bVar) {
        return bVar.i();
    }

    public int B(b bVar) {
        return y3.a.a(C(bVar));
    }

    public long C(b bVar) {
        return bVar.j();
    }

    public int D(b bVar) {
        return y3.a.a(E(bVar));
    }

    public long E(b bVar) {
        return bVar.k();
    }

    public void F(b bVar) {
        bVar.f12792f.requestFocus();
    }

    public void G(b bVar, int i10) {
        H(bVar, i10);
    }

    public void H(b bVar, long j10) {
        bVar.l(j10);
    }

    public void I(b bVar, @k.k int i10) {
        ((LayerDrawable) bVar.f13037r.getProgressDrawable()).setDrawableByLayerId(R.id.progress, new ClipDrawable(new ColorDrawable(i10), 3, 1));
    }

    public void J(b bVar, int i10) {
        K(bVar, i10);
    }

    public void K(b bVar, long j10) {
        bVar.m(j10);
    }

    public void L(b bVar, int i10) {
        M(bVar, i10);
    }

    public void M(b bVar, long j10) {
        bVar.n(j10);
    }

    public void N(b bVar) {
        if (bVar.f13034o) {
            bVar.p();
        }
    }

    @Override // androidx.leanback.widget.m, androidx.leanback.widget.a2
    public void c(a2.a aVar, Object obj) {
        b bVar = (b) aVar;
        i1 i1Var = bVar.f13030k;
        i1 i1Var2 = ((a) obj).f13029c;
        if (i1Var != i1Var2) {
            bVar.f13030k = i1Var2;
            i1Var2.p(bVar.f13031l);
            bVar.f13034o = false;
        }
        super.c(aVar, obj);
        bVar.o(this.f13028i);
    }

    @Override // androidx.leanback.widget.m, androidx.leanback.widget.a2
    public a2.a e(ViewGroup viewGroup) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(m(), viewGroup, false));
    }

    @Override // androidx.leanback.widget.m, androidx.leanback.widget.a2
    public void f(a2.a aVar) {
        super.f(aVar);
        b bVar = (b) aVar;
        i1 i1Var = bVar.f13030k;
        if (i1Var != null) {
            i1Var.u(bVar.f13031l);
            bVar.f13030k = null;
        }
    }

    public boolean t() {
        return this.f13028i;
    }

    public void u(boolean z10) {
        this.f13028i = z10;
    }

    public void v(b bVar, boolean z10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bVar.f13035p.getLayoutParams();
        marginLayoutParams.setMarginStart(z10 ? bVar.f13043x : 0);
        bVar.f13035p.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) bVar.f13036q.getLayoutParams();
        marginLayoutParams2.setMarginEnd(z10 ? bVar.f13044y : 0);
        bVar.f13036q.setLayoutParams(marginLayoutParams2);
    }

    public int x(Context context) {
        if (f13026j == 0) {
            f13026j = context.getResources().getDimensionPixelSize(s3.a.e.f128548e2);
        }
        return f13026j;
    }

    public int y(Context context) {
        if (f13027k == 0) {
            f13027k = context.getResources().getDimensionPixelSize(s3.a.e.f128553f2);
        }
        return f13027k;
    }

    public int z(b bVar) {
        return y3.a.a(A(bVar));
    }
}

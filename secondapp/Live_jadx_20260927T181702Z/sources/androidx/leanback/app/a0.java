package androidx.leanback.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Fragment;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.a2;
import androidx.leanback.widget.b2;
import androidx.leanback.widget.h2;
import androidx.leanback.widget.i1;
import androidx.leanback.widget.k2;
import androidx.leanback.widget.u2;
import androidx.leanback.widget.w0;
import androidx.leanback.widget.w1;
import androidx.leanback.widget.x1;
import androidx.leanback.widget.y0;
import androidx.leanback.widget.y1;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class a0 extends Fragment {
    public static final String W = "controlvisible_oncreateview";
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f11133a0 = "PlaybackFragment";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final boolean f11134b0 = false;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f11135c0 = 1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f11136d0 = 1;
    public int A;
    public l B;
    public View.OnKeyListener C;
    public int H;
    public ValueAnimator I;
    public ValueAnimator J;
    public ValueAnimator K;
    public ValueAnimator L;
    public ValueAnimator M;
    public ValueAnimator N;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w3.i.a f11137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y1.a f11138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11139d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f0 f11141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i1 f11142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w1 f11143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h2 f11144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.leanback.widget.k f11145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.leanback.widget.j f11146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.leanback.widget.j f11147l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f11153r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f11154s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11156u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11157v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11158w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11159x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11160y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f11161z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e0 f11140e = new e0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.leanback.widget.j f11148m = new c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.leanback.widget.k f11149n = new d();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m f11150o = new m();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11155t = 1;
    public boolean D = true;
    public boolean E = true;
    public boolean F = true;
    public boolean G = true;
    public final Animator.AnimatorListener O = new e();
    public final Handler P = new f();
    public final androidx.leanback.widget.i.g Q = new g();
    public final androidx.leanback.widget.i.d R = new h();
    public TimeInterpolator S = new t3.b(100, 0);
    public TimeInterpolator T = new t3.a(100, 0);
    public final y0.b U = new a();
    public final y1.a V = new b();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends y1.a {
        public b() {
        }

        @Override // androidx.leanback.widget.y1.a
        public x1 a() {
            y1.a aVar = a0.this.f11138c;
            if (aVar == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // androidx.leanback.widget.y1.a
        public boolean b() {
            y1.a aVar = a0.this.f11138c;
            if (aVar == null) {
                return false;
            }
            return aVar.b();
        }

        @Override // androidx.leanback.widget.y1.a
        public void c(boolean z10) {
            y1.a aVar = a0.this.f11138c;
            if (aVar != null) {
                aVar.c(z10);
            }
            a0.this.N(false);
        }

        @Override // androidx.leanback.widget.y1.a
        public void d(long j10) {
            y1.a aVar = a0.this.f11138c;
            if (aVar != null) {
                aVar.d(j10);
            }
        }

        @Override // androidx.leanback.widget.y1.a
        public void e() {
            y1.a aVar = a0.this.f11138c;
            if (aVar != null) {
                aVar.e();
            }
            a0.this.N(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements androidx.leanback.widget.j {
        public c() {
        }

        @Override // androidx.leanback.widget.j
        public void a(a2.a aVar, Object obj, k2.b bVar, Object obj2) {
            androidx.leanback.widget.j jVar = a0.this.f11147l;
            if (jVar != null && (bVar instanceof w1.a)) {
                jVar.a(aVar, obj, bVar, obj2);
            }
            androidx.leanback.widget.j jVar2 = a0.this.f11146k;
            if (jVar2 != null) {
                jVar2.a(aVar, obj, bVar, obj2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements androidx.leanback.widget.k {
        public d() {
        }

        @Override // androidx.leanback.widget.k
        public void b(a2.a aVar, Object obj, k2.b bVar, Object obj2) {
            androidx.leanback.widget.k kVar = a0.this.f11145j;
            if (kVar != null) {
                kVar.b(aVar, obj, bVar, obj2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f extends Handler {
        public f() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                a0 a0Var = a0.this;
                if (a0Var.D) {
                    a0Var.i(true);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class g implements androidx.leanback.widget.i.g {
        public g() {
        }

        @Override // androidx.leanback.widget.i.g
        public boolean a(MotionEvent motionEvent) {
            return a0.this.u(motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class h implements androidx.leanback.widget.i.d {
        public h() {
        }

        @Override // androidx.leanback.widget.i.d
        public boolean a(KeyEvent keyEvent) {
            return a0.this.u(keyEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a0.this.A(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class j implements ValueAnimator.AnimatorUpdateListener {
        public j() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RecyclerView.f0 f0VarFindViewHolderForAdapterPosition;
            View view;
            if (a0.this.h() == null || (f0VarFindViewHolderForAdapterPosition = a0.this.h().findViewHolderForAdapterPosition(0)) == null || (view = f0VarFindViewHolderForAdapterPosition.itemView) == null) {
                return;
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            view.setAlpha(fFloatValue);
            view.setTranslationY(a0.this.A * (1.0f - fFloatValue));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class k implements ValueAnimator.AnimatorUpdateListener {
        public k() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (a0.this.h() == null) {
                return;
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int childCount = a0.this.h().getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = a0.this.h().getChildAt(i10);
                if (a0.this.h().getChildAdapterPosition(childAt) > 0) {
                    childAt.setAlpha(fFloatValue);
                    childAt.setTranslationY(a0.this.A * (1.0f - fFloatValue));
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class m implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f11174c = true;

        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = a0.this.f11141f;
            if (f0Var == null) {
                return;
            }
            f0Var.t(this.f11173b, this.f11174c);
        }
    }

    public a0() {
        this.f11140e.e(500L);
    }

    public static void b(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        if (valueAnimator.isStarted()) {
            valueAnimator.end();
        } else if (valueAnimator2.isStarted()) {
            valueAnimator2.end();
        }
    }

    public static ValueAnimator n(Context context, int i10) {
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, i10);
        valueAnimator.setDuration(valueAnimator.getDuration());
        return valueAnimator;
    }

    public static void x(ValueAnimator valueAnimator, ValueAnimator valueAnimator2, boolean z10) {
        if (valueAnimator.isStarted()) {
            valueAnimator.reverse();
            if (z10) {
                return;
            }
            valueAnimator.end();
            return;
        }
        valueAnimator2.start();
        if (z10) {
            return;
        }
        valueAnimator2.end();
    }

    public void A(int i10) {
        this.H = i10;
        View view = this.f11154s;
        if (view != null) {
            view.getBackground().setAlpha(i10);
        }
    }

    public void B(boolean z10) {
        if (z10 != this.D) {
            this.D = z10;
            if (isResumed() && getView().hasFocus()) {
                V(true);
                if (z10) {
                    X(this.f11158w);
                } else {
                    Y();
                }
            }
        }
    }

    @k.y0({k.y0.a.LIBRARY})
    public void C(l lVar) {
        this.B = lVar;
    }

    @Deprecated
    public void D(boolean z10) {
        B(z10);
    }

    public void E(w3.i.a aVar) {
        this.f11137b = aVar;
    }

    public void F(androidx.leanback.widget.j jVar) {
        this.f11146k = jVar;
    }

    public void G(androidx.leanback.widget.k kVar) {
        this.f11145j = kVar;
    }

    public final void H(View.OnKeyListener onKeyListener) {
        this.C = onKeyListener;
    }

    public void I(androidx.leanback.widget.j jVar) {
        this.f11147l = jVar;
    }

    public void J(h2 h2Var) {
        this.f11144i = h2Var;
        U();
        T();
    }

    public void K(w1 w1Var) {
        this.f11143h = w1Var;
        T();
        L();
    }

    public void L() {
        a2[] a2VarArrB;
        i1 i1Var = this.f11142g;
        if (i1Var == null || i1Var.d() == null || (a2VarArrB = this.f11142g.d().b()) == null) {
            return;
        }
        for (int i10 = 0; i10 < a2VarArrB.length; i10++) {
            a2 a2Var = a2VarArrB[i10];
            if ((a2Var instanceof w1) && a2Var.a(w0.class) == null) {
                w0 w0Var = new w0();
                w0.a aVar = new w0.a();
                aVar.i(0);
                aVar.j(100.0f);
                w0Var.c(new w0.a[]{aVar});
                a2VarArrB[i10].i(w0.class, w0Var);
            }
        }
    }

    public void M(y1.a aVar) {
        this.f11138c = aVar;
    }

    public void N(boolean z10) {
        if (this.f11139d == z10) {
            return;
        }
        this.f11139d = z10;
        h().setSelectedPosition(0);
        if (this.f11139d) {
            Y();
        }
        V(true);
        int childCount = h().getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = h().getChildAt(i10);
            if (h().getChildAdapterPosition(childAt) > 0) {
                childAt.setVisibility(this.f11139d ? 4 : 0);
            }
        }
    }

    public void O(int i10) {
        P(i10, true);
    }

    public void P(int i10, boolean z10) {
        m mVar = this.f11150o;
        mVar.f11173b = i10;
        mVar.f11174c = z10;
        if (getView() == null || getView().getHandler() == null) {
            return;
        }
        getView().getHandler().post(this.f11150o);
    }

    public void Q(boolean z10) {
        this.G = z10;
    }

    public void R(VerticalGridView verticalGridView) {
        if (verticalGridView == null) {
            return;
        }
        verticalGridView.setWindowAlignmentOffset(-this.f11151p);
        verticalGridView.setWindowAlignmentOffsetPercent(-1.0f);
        verticalGridView.setItemAlignmentOffset(this.f11152q - this.f11151p);
        verticalGridView.setItemAlignmentOffsetPercent(50.0f);
        verticalGridView.setPadding(verticalGridView.getPaddingLeft(), verticalGridView.getPaddingTop(), verticalGridView.getPaddingRight(), this.f11151p);
        verticalGridView.setWindowAlignment(2);
    }

    public final void S() {
        R(this.f11141f.j());
    }

    public final void T() {
        i1 i1Var = this.f11142g;
        if (i1Var == null || this.f11144i == null || this.f11143h == null) {
            return;
        }
        b2 b2VarD = i1Var.d();
        if (b2VarD == null) {
            androidx.leanback.widget.l lVar = new androidx.leanback.widget.l();
            lVar.c(this.f11144i.getClass(), this.f11143h);
            this.f11142g.r(lVar);
        } else if (b2VarD instanceof androidx.leanback.widget.l) {
            ((androidx.leanback.widget.l) b2VarD).c(this.f11144i.getClass(), this.f11143h);
        }
    }

    public final void U() {
        h2 h2Var;
        i1 i1Var = this.f11142g;
        if (!(i1Var instanceof androidx.leanback.widget.f) || this.f11144i == null) {
            if (!(i1Var instanceof u2) || (h2Var = this.f11144i) == null) {
                return;
            }
            ((u2) i1Var).B(0, h2Var);
            return;
        }
        androidx.leanback.widget.f fVar = (androidx.leanback.widget.f) i1Var;
        if (fVar.s() == 0) {
            fVar.x(this.f11144i);
        } else {
            fVar.F(0, this.f11144i);
        }
    }

    public void V(boolean z10) {
        W(true, z10);
    }

    public void W(boolean z10, boolean z11) {
        if (getView() == null) {
            this.E = z10;
            return;
        }
        if (!isResumed()) {
            z11 = false;
        }
        if (z10 == this.F) {
            if (z11) {
                return;
            }
            b(this.I, this.J);
            b(this.K, this.L);
            b(this.M, this.N);
            return;
        }
        this.F = z10;
        if (!z10) {
            Y();
        }
        this.A = (h() == null || h().getSelectedPosition() == 0) ? this.f11160y : this.f11161z;
        if (z10) {
            x(this.J, this.I, z11);
            x(this.L, this.K, z11);
            x(this.N, this.M, z11);
        } else {
            x(this.I, this.J, z11);
            x(this.K, this.L, z11);
            x(this.M, this.N, z11);
        }
        if (z11) {
            getView().announceForAccessibility(getString(z10 ? s3.a.l.f128880y : s3.a.l.f128868m));
        }
    }

    public final void X(int i10) {
        Handler handler = this.P;
        if (handler != null) {
            handler.removeMessages(1);
            this.P.sendEmptyMessageDelayed(1, i10);
        }
    }

    public final void Y() {
        Handler handler = this.P;
        if (handler != null) {
            handler.removeMessages(1);
        }
    }

    public void Z() {
        Y();
        V(true);
        int i10 = this.f11159x;
        if (i10 <= 0 || !this.D) {
            return;
        }
        X(i10);
    }

    public void a(boolean z10) {
        if (h() != null) {
            h().setAnimateChildLayout(z10);
        }
    }

    public final void a0() {
        View view = this.f11154s;
        if (view != null) {
            int i10 = this.f11156u;
            int i11 = this.f11155t;
            if (i11 == 0) {
                i10 = 0;
            } else if (i11 == 2) {
                i10 = this.f11157v;
            }
            view.setBackground(new ColorDrawable(i10));
            A(this.H);
        }
    }

    @Deprecated
    public void c() {
        W(false, false);
    }

    public i1 d() {
        return this.f11142g;
    }

    public int e() {
        return this.f11155t;
    }

    @k.y0({k.y0.a.LIBRARY})
    public l f() {
        return this.B;
    }

    public e0 g() {
        return this.f11140e;
    }

    public VerticalGridView h() {
        f0 f0Var = this.f11141f;
        if (f0Var == null) {
            return null;
        }
        return f0Var.j();
    }

    public void i(boolean z10) {
        W(false, z10);
    }

    public boolean j() {
        return this.D;
    }

    public boolean k() {
        return this.F;
    }

    @Deprecated
    public boolean l() {
        return j();
    }

    public boolean m() {
        return this.G;
    }

    public final void o() {
        i iVar = new i();
        Context contextA = r.a(this);
        ValueAnimator valueAnimatorN = n(contextA, s3.a.b.f128387n);
        this.I = valueAnimatorN;
        valueAnimatorN.addUpdateListener(iVar);
        this.I.addListener(this.O);
        ValueAnimator valueAnimatorN2 = n(contextA, s3.a.b.f128388o);
        this.J = valueAnimatorN2;
        valueAnimatorN2.addUpdateListener(iVar);
        this.J.addListener(this.O);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11152q = getResources().getDimensionPixelSize(s3.a.e.G2);
        this.f11151p = getResources().getDimensionPixelSize(s3.a.e.f128578k2);
        this.f11156u = getResources().getColor(s3.a.d.F);
        this.f11157v = getResources().getColor(s3.a.d.G);
        TypedValue typedValue = new TypedValue();
        r.a(this).getTheme().resolveAttribute(s3.a.c.C1, typedValue, true);
        this.f11158w = typedValue.data;
        r.a(this).getTheme().resolveAttribute(s3.a.c.B1, typedValue, true);
        this.f11159x = typedValue.data;
        this.f11160y = getResources().getDimensionPixelSize(s3.a.e.f128613r2);
        this.f11161z = getResources().getDimensionPixelSize(s3.a.e.f128653z2);
        o();
        p();
        q();
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(s3.a.j.P, viewGroup, false);
        this.f11153r = viewInflate;
        this.f11154s = viewInflate.findViewById(s3.a.h.V1);
        f0 f0Var = (f0) getChildFragmentManager().findFragmentById(s3.a.h.U1);
        this.f11141f = f0Var;
        if (f0Var == null) {
            this.f11141f = new f0();
            getChildFragmentManager().beginTransaction().replace(s3.a.h.U1, this.f11141f).commit();
        }
        i1 i1Var = this.f11142g;
        if (i1Var == null) {
            y(new androidx.leanback.widget.f(new androidx.leanback.widget.l()));
        } else {
            this.f11141f.o(i1Var);
        }
        this.f11141f.H(this.f11149n);
        this.f11141f.G(this.f11148m);
        this.H = 255;
        a0();
        this.f11141f.F(this.U);
        e0 e0VarG = g();
        if (e0VarG != null) {
            e0VarG.g((ViewGroup) this.f11153r);
        }
        return this.f11153r;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        w3.i.a aVar = this.f11137b;
        if (aVar != null) {
            aVar.a();
        }
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f11153r = null;
        this.f11154s = null;
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onPause() {
        w3.i.a aVar = this.f11137b;
        if (aVar != null) {
            aVar.b();
        }
        if (this.P.hasMessages(1)) {
            this.P.removeMessages(1);
        }
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.F && this.D) {
            X(this.f11158w);
        }
        h().setOnTouchInterceptListener(this.Q);
        h().setOnKeyInterceptListener(this.R);
        w3.i.a aVar = this.f11137b;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        S();
        this.f11141f.o(this.f11142g);
        w3.i.a aVar = this.f11137b;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        w3.i.a aVar = this.f11137b;
        if (aVar != null) {
            aVar.e();
        }
        super.onStop();
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.F = true;
        if (this.E) {
            return;
        }
        W(false, false);
        this.E = true;
    }

    public final void p() {
        j jVar = new j();
        Context contextA = r.a(this);
        ValueAnimator valueAnimatorN = n(contextA, s3.a.b.f128389p);
        this.K = valueAnimatorN;
        valueAnimatorN.addUpdateListener(jVar);
        this.K.setInterpolator(this.S);
        ValueAnimator valueAnimatorN2 = n(contextA, s3.a.b.f128390q);
        this.L = valueAnimatorN2;
        valueAnimatorN2.addUpdateListener(jVar);
        this.L.setInterpolator(this.T);
    }

    public final void q() {
        k kVar = new k();
        Context contextA = r.a(this);
        ValueAnimator valueAnimatorN = n(contextA, s3.a.b.f128389p);
        this.M = valueAnimatorN;
        valueAnimatorN.addUpdateListener(kVar);
        this.M.setInterpolator(this.S);
        ValueAnimator valueAnimatorN2 = n(contextA, s3.a.b.f128390q);
        this.N = valueAnimatorN2;
        valueAnimatorN2.addUpdateListener(kVar);
        this.N.setInterpolator(new AccelerateInterpolator());
    }

    public void r() {
        i1 i1Var = this.f11142g;
        if (i1Var == null) {
            return;
        }
        i1Var.j(0, 1);
    }

    public void s(boolean z10) {
        e0 e0VarG = g();
        if (e0VarG != null) {
            if (z10) {
                e0VarG.h();
            } else {
                e0VarG.d();
            }
        }
    }

    public boolean u(InputEvent inputEvent) {
        boolean zOnKey;
        int keyCode;
        int action;
        boolean z10 = this.F;
        if (inputEvent instanceof KeyEvent) {
            KeyEvent keyEvent = (KeyEvent) inputEvent;
            keyCode = keyEvent.getKeyCode();
            action = keyEvent.getAction();
            View.OnKeyListener onKeyListener = this.C;
            zOnKey = onKeyListener != null ? onKeyListener.onKey(getView(), keyCode, keyEvent) : false;
        } else {
            zOnKey = false;
            keyCode = 0;
            action = 0;
        }
        if (keyCode != 4 && keyCode != 111) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (!z10) {
                        zOnKey = true;
                    }
                    if (this.G && action == 0) {
                        Z();
                    }
                    return zOnKey;
                default:
                    if (this.G && zOnKey && action == 0) {
                        Z();
                        return zOnKey;
                    }
                    break;
            }
        } else {
            if (this.f11139d) {
                return false;
            }
            if (this.G && z10) {
                if (((KeyEvent) inputEvent).getAction() == 1) {
                    i(true);
                }
                return true;
            }
        }
        return zOnKey;
    }

    @k.y0({k.y0.a.LIBRARY})
    public void w() {
        y0.d dVar = (y0.d) h().findViewHolderForAdapterPosition(0);
        if (dVar == null || !(dVar.e() instanceof w1)) {
            return;
        }
        ((w1) dVar.e()).N((k2.b) dVar.f());
    }

    public void y(i1 i1Var) {
        this.f11142g = i1Var;
        U();
        T();
        L();
        f0 f0Var = this.f11141f;
        if (f0Var != null) {
            f0Var.o(i1Var);
        }
    }

    public void z(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("Invalid background type");
        }
        if (i10 != this.f11155t) {
            this.f11155t = i10;
            a0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends y0.b {
        public a() {
        }

        @Override // androidx.leanback.widget.y0.b
        public void b(y0.d dVar) {
            if (a0.this.F) {
                return;
            }
            dVar.f().f12292a.setAlpha(0.0f);
        }

        @Override // androidx.leanback.widget.y0.b
        public void e(y0.d dVar) {
            Object objF = dVar.f();
            if (objF instanceof y1) {
                ((y1) objF).b(a0.this.V);
            }
        }

        @Override // androidx.leanback.widget.y0.b
        public void f(y0.d dVar) {
            dVar.f().f12292a.setAlpha(1.0f);
            dVar.f().f12292a.setTranslationY(0.0f);
            dVar.f().f12292a.setAlpha(1.0f);
        }

        @Override // androidx.leanback.widget.y0.b
        public void c(y0.d dVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e implements Animator.AnimatorListener {
        public e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            y0.d dVar;
            a0 a0Var = a0.this;
            if (a0Var.H > 0) {
                a0Var.a(true);
                l lVar = a0.this.B;
                if (lVar != null) {
                    lVar.a();
                    return;
                }
                return;
            }
            VerticalGridView verticalGridViewH = a0Var.h();
            if (verticalGridViewH != null && verticalGridViewH.getSelectedPosition() == 0 && (dVar = (y0.d) verticalGridViewH.findViewHolderForAdapterPosition(0)) != null && (dVar.e() instanceof w1)) {
                ((w1) dVar.e()).N((k2.b) dVar.f());
            }
            l lVar2 = a0.this.B;
            if (lVar2 != null) {
                lVar2.b();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a0.this.a(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.y0({k.y0.a.LIBRARY})
    public static class l {
        public void a() {
        }

        public void b() {
        }
    }

    public void t(int i10, CharSequence charSequence) {
    }

    public void v(int i10, int i11) {
    }
}

package androidx.leanback.widget;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import android.widget.ViewFlipper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends k2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f12304n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f12305o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f12306p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Rect f12307q = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12311l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a2 f12312m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup.MarginLayoutParams f12313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f12314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f12315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f12316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f12317f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ View f12318g;

        public a(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, float f10, int i11, float f11, View view) {
            this.f12313b = marginLayoutParams;
            this.f12314c = i10;
            this.f12315d = f10;
            this.f12316e = i11;
            this.f12317f = f11;
            this.f12318g = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
            this.f12313b.leftMargin = Math.round(this.f12314c + (this.f12315d * animatedFraction));
            this.f12313b.width = Math.round(this.f12316e + (this.f12317f * animatedFraction));
            this.f12318g.requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0080b extends k2.b {
        public final TextView A;
        public final View B;
        public final ViewGroup C;
        public final List<a2.a> D;
        public g1.a[] E;
        public b F;
        public ValueAnimator G;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final View f12319s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final View f12320t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final View f12321u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final ViewFlipper f12322v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final TextView f12323w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final View f12324x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final View f12325y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final TextView f12326z;

        /* JADX INFO: renamed from: androidx.leanback.widget.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C0080b.this.e() != null) {
                    j jVarE = C0080b.this.e();
                    C0080b c0080b = C0080b.this;
                    jVarE.a(null, null, c0080b, c0080b.i());
                }
            }
        }

        /* JADX INFO: renamed from: androidx.leanback.widget.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class ViewOnFocusChangeListenerC0081b implements View.OnFocusChangeListener {
            public ViewOnFocusChangeListenerC0081b() {
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z10) {
                C0080b c0080b = C0080b.this;
                c0080b.G = b.b0(c0080b.f12320t, view, c0080b.G, true);
            }
        }

        /* JADX INFO: renamed from: androidx.leanback.widget.b$b$c */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class c implements View.OnFocusChangeListener {
            public c() {
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z10) {
                C0080b c0080b = C0080b.this;
                c0080b.G = b.b0(c0080b.f12320t, view, c0080b.G, false);
            }
        }

        /* JADX INFO: renamed from: androidx.leanback.widget.b$b$d */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class d implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a2.a f12330b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f12331c;

            public d(a2.a aVar, int i10) {
                this.f12330b = aVar;
                this.f12331c = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C0080b.this.e() != null) {
                    j jVarE = C0080b.this.e();
                    a2.a aVar = this.f12330b;
                    C0080b c0080b = C0080b.this;
                    jVarE.a(aVar, c0080b.E[this.f12331c], c0080b, c0080b.i());
                }
            }
        }

        public C0080b(View view) {
            super(view);
            this.f12320t = view.findViewById(s3.a.h.K1);
            this.f12319s = view.findViewById(s3.a.h.I1);
            this.f12321u = view.findViewById(s3.a.h.E1);
            this.f12326z = (TextView) view.findViewById(s3.a.h.G1);
            this.A = (TextView) view.findViewById(s3.a.h.F1);
            this.B = view.findViewById(s3.a.h.L1);
            this.C = (ViewGroup) view.findViewById(s3.a.h.D1);
            this.D = new ArrayList();
            v().setOnClickListener(new a());
            v().setOnFocusChangeListener(new ViewOnFocusChangeListenerC0081b());
            ViewFlipper viewFlipper = (ViewFlipper) view.findViewById(s3.a.h.H1);
            this.f12322v = viewFlipper;
            TypedValue typedValue = new TypedValue();
            View viewInflate = LayoutInflater.from(view.getContext()).inflate(view.getContext().getTheme().resolveAttribute(s3.a.c.K1, typedValue, true) ? typedValue.resourceId : s3.a.j.F, (ViewGroup) viewFlipper, true);
            this.f12323w = (TextView) viewInflate.findViewById(s3.a.h.O0);
            this.f12324x = viewInflate.findViewById(s3.a.h.S1);
            this.f12325y = viewInflate.findViewById(s3.a.h.Y1);
        }

        public View A() {
            return this.f12324x;
        }

        public View B() {
            return this.f12325y;
        }

        public g1.a[] C() {
            return this.E;
        }

        public View D() {
            return this.B;
        }

        public View E() {
            return this.f12320t;
        }

        public void F(g1.a aVar) {
            int iT;
            a2 a2VarO = this.F.O();
            if (a2VarO != null && (iT = t(aVar)) >= 0) {
                a2.a aVar2 = this.D.get(iT);
                a2VarO.f(aVar2);
                a2VarO.c(aVar2, aVar);
            }
        }

        public void G() {
            this.F.V(this);
            this.F.S(this, i());
        }

        public void H() {
            this.F.T(this);
        }

        public void I() {
            int childCount = u().getChildCount();
            while (true) {
                childCount--;
                if (childCount < this.D.size()) {
                    break;
                }
                u().removeViewAt(childCount);
                this.D.remove(childCount);
            }
            this.E = null;
            Object objI = i();
            if (objI instanceof g1) {
                g1.a[] aVarArrA = ((g1) objI).a();
                a2 a2VarO = this.F.O();
                if (a2VarO == null) {
                    return;
                }
                this.E = aVarArrA;
                for (int size = this.D.size(); size < aVarArrA.length; size++) {
                    a2.a aVarE = a2VarO.e(u());
                    u().addView(aVarE.f12292a);
                    this.D.add(aVarE);
                    aVarE.f12292a.setOnFocusChangeListener(new c());
                    aVarE.f12292a.setOnClickListener(new d(aVarE, size));
                }
                if (this.C != null) {
                    for (int i10 = 0; i10 < aVarArrA.length; i10++) {
                        a2.a aVar = this.D.get(i10);
                        a2VarO.f(aVar);
                        a2VarO.c(aVar, this.E[i10]);
                    }
                }
            }
        }

        public void J(int i10) {
            if (i10 < 0 || i10 >= this.f12322v.getChildCount()) {
                return;
            }
            this.f12322v.setDisplayedChild(i10);
        }

        public int t(g1.a aVar) {
            if (this.E == null) {
                return -1;
            }
            int i10 = 0;
            while (true) {
                g1.a[] aVarArr = this.E;
                if (i10 >= aVarArr.length) {
                    return -1;
                }
                if (aVarArr[i10] == aVar) {
                    return i10;
                }
                i10++;
            }
        }

        public ViewGroup u() {
            return this.C;
        }

        public View v() {
            return this.f12321u;
        }

        public TextView w() {
            return this.A;
        }

        public TextView x() {
            return this.f12326z;
        }

        public TextView y() {
            return this.f12323w;
        }

        public ViewFlipper z() {
            return this.f12322v;
        }
    }

    public b() {
        this(0);
    }

    public static int N(C0080b c0080b) {
        View view;
        int iP = c0080b.F.P(c0080b.i());
        if (iP == 0) {
            TextView textView = c0080b.f12323w;
            if (textView == null) {
                return -1;
            }
            return c0080b.f12322v.indexOfChild(textView);
        }
        if (iP != 1) {
            if (iP == 2 && (view = c0080b.f12325y) != null) {
                return c0080b.f12322v.indexOfChild(view);
            }
            return -1;
        }
        View view2 = c0080b.f12324x;
        if (view2 == null) {
            return -1;
        }
        return c0080b.f12322v.indexOfChild(view2);
    }

    public static ValueAnimator b0(View view, View view2, ValueAnimator valueAnimator, boolean z10) {
        ValueAnimator valueAnimator2;
        int integer = view2.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        int layoutDirection = view.getLayoutDirection();
        if (!view2.hasFocus()) {
            view.animate().cancel();
            view.animate().alpha(0.0f).setDuration(integer).setInterpolator(decelerateInterpolator).start();
            return valueAnimator;
        }
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator2 = null;
        } else {
            valueAnimator2 = valueAnimator;
        }
        float alpha = view.getAlpha();
        long j10 = integer;
        view.animate().alpha(1.0f).setDuration(j10).setInterpolator(decelerateInterpolator).start();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        Rect rect = f12307q;
        rect.set(0, 0, view2.getWidth(), view2.getHeight());
        viewGroup.offsetDescendantRectToMyCoords(view2, rect);
        if (z10) {
            if (layoutDirection == 1) {
                rect.right += viewGroup.getHeight();
                rect.left -= viewGroup.getHeight() / 2;
            } else {
                rect.left -= viewGroup.getHeight();
                rect.right += viewGroup.getHeight() / 2;
            }
        }
        int i10 = rect.left;
        int iWidth = rect.width();
        float f10 = marginLayoutParams.width - iWidth;
        float f11 = marginLayoutParams.leftMargin - i10;
        if (f11 == 0.0f && f10 == 0.0f) {
            return valueAnimator2;
        }
        if (alpha == 0.0f) {
            marginLayoutParams.width = iWidth;
            marginLayoutParams.leftMargin = i10;
            view.requestLayout();
            return valueAnimator2;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j10);
        valueAnimatorOfFloat.setInterpolator(decelerateInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new a(marginLayoutParams, i10, f11, iWidth, f10, view));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }

    public a2 O() {
        return this.f12312m;
    }

    public int P(Object obj) {
        return 0;
    }

    public int Q() {
        return this.f12311l;
    }

    public boolean R() {
        return this.f12310k;
    }

    public abstract void S(C0080b c0080b, Object obj);

    public void T(C0080b c0080b) {
        int iN = N(c0080b);
        if (iN == -1 || c0080b.f12322v.getDisplayedChild() == iN) {
            return;
        }
        c0080b.f12322v.setDisplayedChild(iN);
    }

    public void U(C0080b c0080b) {
        c0080b.I();
    }

    public void X(a2 a2Var) {
        this.f12312m = a2Var;
    }

    public void Y(int i10) {
        this.f12309j = true;
        this.f12308i = i10;
    }

    public void Z(boolean z10) {
        this.f12310k = z10;
    }

    public void a0(int i10) {
        this.f12311l = i10;
    }

    @Override // androidx.leanback.widget.k2
    public k2.b k(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f12311l != 0) {
            context = new ContextThemeWrapper(context, this.f12311l);
        }
        C0080b c0080b = new C0080b(LayoutInflater.from(context).inflate(s3.a.j.V, viewGroup, false));
        c0080b.F = this;
        if (this.f12309j) {
            c0080b.f12319s.setBackgroundColor(this.f12308i);
        }
        return c0080b;
    }

    @Override // androidx.leanback.widget.k2
    public boolean t() {
        return true;
    }

    @Override // androidx.leanback.widget.k2
    public boolean u() {
        return false;
    }

    @Override // androidx.leanback.widget.k2
    public void x(k2.b bVar, Object obj) {
        super.x(bVar, obj);
        C0080b c0080b = (C0080b) bVar;
        U(c0080b);
        c0080b.D().setVisibility(R() ? 0 : 8);
        T(c0080b);
        S(c0080b, obj);
    }

    public b(int i10) {
        this.f12308i = 0;
        this.f12312m = new f1();
        this.f12311l = i10;
        F(null);
    }

    public void V(C0080b c0080b) {
    }

    public void W(C0080b c0080b) {
    }
}

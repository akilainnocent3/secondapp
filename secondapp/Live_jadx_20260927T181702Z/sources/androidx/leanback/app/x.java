package androidx.leanback.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Property;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.PagingIndicator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class x extends Fragment {
    public static final String D = "OnboardingF";
    public static final boolean E = false;
    public static final long F = 1333;
    public static final long G = 417;
    public static final long H = 33;
    public static final long I = 500;
    public static final int J = 60;
    public static int K = 0;
    public static final TimeInterpolator L = new DecelerateInterpolator();
    public static final TimeInterpolator M = new AccelerateInterpolator();
    public static final String N = "leanback.onboarding.current_page_index";
    public static final String O = "leanback.onboarding.logo_animation_finished";
    public static final String P = "leanback.onboarding.enter_animation_finished";
    public AnimatorSet A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContextThemeWrapper f11879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PagingIndicator f11880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f11881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f11882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f11883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f11885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f11886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11891n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11893p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11895r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11897t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11899v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11901x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f11902y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11903z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @k.k
    public int f11892o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @k.k
    public int f11894q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @k.k
    public int f11896s = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @k.k
    public int f11898u = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @k.k
    public int f11900w = 0;
    public final View.OnClickListener B = new a();
    public final View.OnKeyListener C = new b();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x xVar = x.this;
            if (xVar.f11889l) {
                if (xVar.f11891n == xVar.i() - 1) {
                    x.this.z();
                } else {
                    x.this.q();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (!x.this.f11889l) {
                return i10 != 4;
            }
            if (keyEvent.getAction() == 0) {
                return false;
            }
            if (i10 == 4) {
                x xVar = x.this;
                if (xVar.f11891n == 0) {
                    return false;
                }
                xVar.r();
                return true;
            }
            if (i10 == 21) {
                x xVar2 = x.this;
                if (xVar2.f11887j) {
                    xVar2.r();
                } else {
                    xVar2.q();
                }
                return true;
            }
            if (i10 != 22) {
                return false;
            }
            x xVar3 = x.this;
            if (xVar3.f11887j) {
                xVar3.q();
            } else {
                xVar3.r();
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements ViewTreeObserver.OnPreDrawListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            x.this.getView().getViewTreeObserver().removeOnPreDrawListener(this);
            if (!x.this.O()) {
                x xVar = x.this;
                xVar.f11889l = true;
                xVar.A();
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f11907b;

        public d(Context context) {
            this.f11907b = context;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f11907b != null) {
                x xVar = x.this;
                xVar.f11889l = true;
                xVar.A();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends AnimatorListenerAdapter {
        public e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x.this.f11890m = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f11910b;

        public f(int i10) {
            this.f11910b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x xVar = x.this;
            xVar.f11885h.setText(xVar.k(this.f11910b));
            x xVar2 = x.this;
            xVar2.f11886i.setText(xVar2.j(this.f11910b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x.this.f11880c.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x.this.f11881d.setVisibility(8);
        }
    }

    public void A() {
        N(false);
    }

    public final void C(int i10) {
        x xVar;
        Animator animatorA;
        AnimatorSet animatorSet = this.A;
        if (animatorSet != null) {
            animatorSet.end();
        }
        this.f11880c.i(this.f11891n, true);
        ArrayList arrayList = new ArrayList();
        if (i10 < d()) {
            xVar = this;
            arrayList.add(xVar.a(this.f11885h, false, 8388611, 0L));
            animatorA = xVar.a(xVar.f11886i, false, 8388611, 33L);
            arrayList.add(animatorA);
            arrayList.add(xVar.a(xVar.f11885h, true, 8388613, 500L));
            arrayList.add(xVar.a(xVar.f11886i, true, 8388613, 533L));
        } else {
            xVar = this;
            arrayList.add(xVar.a(xVar.f11885h, false, 8388613, 0L));
            animatorA = xVar.a(xVar.f11886i, false, 8388613, 33L);
            arrayList.add(animatorA);
            arrayList.add(xVar.a(xVar.f11885h, true, 8388611, 500L));
            arrayList.add(xVar.a(xVar.f11886i, true, 8388611, 533L));
        }
        animatorA.addListener(new f(d()));
        Context contextA = r.a(this);
        if (d() == i() - 1) {
            xVar.f11881d.setVisibility(0);
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(contextA, s3.a.b.f128383j);
            animatorLoadAnimator.setTarget(xVar.f11880c);
            animatorLoadAnimator.addListener(new g());
            arrayList.add(animatorLoadAnimator);
            Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(contextA, s3.a.b.f128384k);
            animatorLoadAnimator2.setTarget(xVar.f11881d);
            arrayList.add(animatorLoadAnimator2);
        } else if (i10 == i() - 1) {
            xVar.f11880c.setVisibility(0);
            Animator animatorLoadAnimator3 = AnimatorInflater.loadAnimator(contextA, s3.a.b.f128382i);
            animatorLoadAnimator3.setTarget(xVar.f11880c);
            arrayList.add(animatorLoadAnimator3);
            Animator animatorLoadAnimator4 = AnimatorInflater.loadAnimator(contextA, s3.a.b.f128385l);
            animatorLoadAnimator4.setTarget(xVar.f11881d);
            animatorLoadAnimator4.addListener(new h());
            arrayList.add(animatorLoadAnimator4);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        xVar.A = animatorSet2;
        animatorSet2.playTogether(arrayList);
        xVar.A.start();
        B(xVar.f11891n, i10);
    }

    public int D() {
        return -1;
    }

    public final void E() {
        Context contextA = r.a(this);
        int iD = D();
        if (iD != -1) {
            this.f11879b = new ContextThemeWrapper(contextA, iD);
            return;
        }
        int i10 = s3.a.c.f128449n1;
        TypedValue typedValue = new TypedValue();
        if (contextA.getTheme().resolveAttribute(i10, typedValue, true)) {
            this.f11879b = new ContextThemeWrapper(contextA, typedValue.resourceId);
        }
    }

    public void F(@k.k int i10) {
        this.f11900w = i10;
        this.f11901x = true;
        PagingIndicator pagingIndicator = this.f11880c;
        if (pagingIndicator != null) {
            pagingIndicator.setArrowBackgroundColor(i10);
        }
    }

    public void G(@k.k int i10) {
        this.f11898u = i10;
        this.f11899v = true;
        PagingIndicator pagingIndicator = this.f11880c;
        if (pagingIndicator != null) {
            pagingIndicator.setArrowColor(i10);
        }
    }

    public void H(@k.k int i10) {
        this.f11894q = i10;
        this.f11895r = true;
        TextView textView = this.f11886i;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public void I(@k.k int i10) {
        this.f11896s = i10;
        this.f11897t = true;
        PagingIndicator pagingIndicator = this.f11880c;
        if (pagingIndicator != null) {
            pagingIndicator.setDotBackgroundColor(i10);
        }
    }

    public final void J(int i10) {
        this.f11884g = i10;
        ImageView imageView = this.f11883f;
        if (imageView != null) {
            imageView.setImageResource(i10);
            this.f11883f.setVisibility(0);
        }
    }

    public final void K(int i10) {
        this.f11888k = i10;
    }

    public void L(CharSequence charSequence) {
        this.f11902y = charSequence;
        this.f11903z = true;
        View view = this.f11881d;
        if (view != null) {
            ((Button) view).setText(charSequence);
        }
    }

    public void M(@k.k int i10) {
        this.f11892o = i10;
        this.f11893p = true;
        TextView textView = this.f11885h;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public final void N(boolean z10) {
        Context contextA = r.a(this);
        if (contextA == null) {
            return;
        }
        o();
        if (!this.f11890m || z10) {
            ArrayList arrayList = new ArrayList();
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(contextA, s3.a.b.f128381h);
            animatorLoadAnimator.setTarget(i() <= 1 ? this.f11881d : this.f11880c);
            arrayList.add(animatorLoadAnimator);
            Animator animatorY = y();
            if (animatorY != null) {
                animatorY.setTarget(this.f11885h);
                arrayList.add(animatorY);
            }
            Animator animatorU = u();
            if (animatorU != null) {
                animatorU.setTarget(this.f11886i);
                arrayList.add(animatorU);
            }
            Animator animatorV = v();
            if (animatorV != null) {
                arrayList.add(animatorV);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.A = animatorSet;
            animatorSet.playTogether(arrayList);
            this.A.start();
            this.A.addListener(new e());
            getView().requestFocus();
        }
    }

    public boolean O() {
        Animator animatorX;
        Animator animator;
        AnimatorSet animatorSet;
        Context contextA = r.a(this);
        if (contextA == null) {
            return false;
        }
        if (this.f11888k != 0) {
            this.f11882e.setVisibility(0);
            this.f11882e.setImageResource(this.f11888k);
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(contextA, s3.a.b.f128379f);
            Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(contextA, s3.a.b.f128380g);
            animatorLoadAnimator2.setStartDelay(1333L);
            animatorSet = new AnimatorSet();
            animatorSet.playSequentially(animatorLoadAnimator, animatorLoadAnimator2);
            animatorSet.setTarget(this.f11882e);
        } else {
            animatorX = x();
        }
        if (animator == null) {
            animator = animatorX;
            animator = animatorSet;
            return false;
        }
        animator = animatorX;
        animator = animatorSet;
        animator.addListener(new d(contextA));
        animator.start();
        return true;
    }

    public final Animator a(View view, boolean z10, int i10, long j10) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        boolean z11 = getView().getLayoutDirection() == 0;
        boolean z12 = (z11 && i10 == 8388613) || (!z11 && i10 == 8388611) || i10 == 5;
        if (z10) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, z12 ? K : -K, 0.0f);
            TimeInterpolator timeInterpolator = L;
            objectAnimatorOfFloat.setInterpolator(timeInterpolator);
            objectAnimatorOfFloat2.setInterpolator(timeInterpolator);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, 0.0f, z12 ? K : -K);
            TimeInterpolator timeInterpolator2 = M;
            objectAnimatorOfFloat.setInterpolator(timeInterpolator2);
            objectAnimatorOfFloat2.setInterpolator(timeInterpolator2);
        }
        objectAnimatorOfFloat.setDuration(417L);
        objectAnimatorOfFloat.setTarget(view);
        objectAnimatorOfFloat2.setDuration(417L);
        objectAnimatorOfFloat2.setTarget(view);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        if (j10 > 0) {
            animatorSet.setStartDelay(j10);
        }
        return animatorSet;
    }

    @k.k
    public final int b() {
        return this.f11900w;
    }

    @k.k
    public final int c() {
        return this.f11898u;
    }

    public final int d() {
        return this.f11891n;
    }

    @k.k
    public final int e() {
        return this.f11894q;
    }

    @k.k
    public final int f() {
        return this.f11896s;
    }

    public final int g() {
        return this.f11884g;
    }

    public final int h() {
        return this.f11888k;
    }

    public abstract int i();

    public abstract CharSequence j(int i10);

    public abstract CharSequence k(int i10);

    public final CharSequence l() {
        return this.f11902y;
    }

    public final LayoutInflater m(LayoutInflater layoutInflater) {
        ContextThemeWrapper contextThemeWrapper = this.f11879b;
        return contextThemeWrapper == null ? layoutInflater : layoutInflater.cloneInContext(contextThemeWrapper);
    }

    @k.k
    public final int n() {
        return this.f11892o;
    }

    public void o() {
        this.f11882e.setVisibility(8);
        int i10 = this.f11884g;
        if (i10 != 0) {
            this.f11883f.setImageResource(i10);
            this.f11883f.setVisibility(0);
        }
        View view = getView();
        LayoutInflater layoutInflaterM = m(LayoutInflater.from(r.a(this)));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(s3.a.h.f128719h);
        View viewS = s(layoutInflaterM, viewGroup);
        if (viewS != null) {
            viewGroup.setVisibility(0);
            viewGroup.addView(viewS);
        }
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(s3.a.h.C);
        View viewT = t(layoutInflaterM, viewGroup2);
        if (viewT != null) {
            viewGroup2.setVisibility(0);
            viewGroup2.addView(viewT);
        }
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(s3.a.h.f128712f0);
        View viewW = w(layoutInflaterM, viewGroup3);
        if (viewW != null) {
            viewGroup3.setVisibility(0);
            viewGroup3.addView(viewW);
        }
        view.findViewById(s3.a.h.Q1).setVisibility(0);
        view.findViewById(s3.a.h.C).setVisibility(0);
        if (i() > 1) {
            this.f11880c.setPageCount(i());
            this.f11880c.i(this.f11891n, false);
        }
        if (this.f11891n == i() - 1) {
            this.f11881d.setVisibility(0);
        } else {
            this.f11880c.setVisibility(0);
        }
        this.f11885h.setText(k(this.f11891n));
        this.f11886i.setText(j(this.f11891n));
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        E();
        ViewGroup viewGroup2 = (ViewGroup) m(layoutInflater).inflate(s3.a.j.H, viewGroup, false);
        this.f11887j = getResources().getConfiguration().getLayoutDirection() == 0;
        PagingIndicator pagingIndicator = (PagingIndicator) viewGroup2.findViewById(s3.a.h.R1);
        this.f11880c = pagingIndicator;
        pagingIndicator.setOnClickListener(this.B);
        this.f11880c.setOnKeyListener(this.C);
        View viewFindViewById = viewGroup2.findViewById(s3.a.h.f128788z);
        this.f11881d = viewFindViewById;
        viewFindViewById.setOnClickListener(this.B);
        this.f11881d.setOnKeyListener(this.C);
        this.f11883f = (ImageView) viewGroup2.findViewById(s3.a.h.B1);
        this.f11882e = (ImageView) viewGroup2.findViewById(s3.a.h.f128787y1);
        this.f11885h = (TextView) viewGroup2.findViewById(s3.a.h.f128742m2);
        this.f11886i = (TextView) viewGroup2.findViewById(s3.a.h.M);
        if (this.f11893p) {
            this.f11885h.setTextColor(this.f11892o);
        }
        if (this.f11895r) {
            this.f11886i.setTextColor(this.f11894q);
        }
        if (this.f11897t) {
            this.f11880c.setDotBackgroundColor(this.f11896s);
        }
        if (this.f11899v) {
            this.f11880c.setArrowColor(this.f11898u);
        }
        if (this.f11901x) {
            this.f11880c.setDotBackgroundColor(this.f11900w);
        }
        if (this.f11903z) {
            ((Button) this.f11881d).setText(this.f11902y);
        }
        Context contextA = r.a(this);
        if (K == 0) {
            K = (int) (contextA.getResources().getDisplayMetrics().scaledDensity * 60.0f);
        }
        viewGroup2.requestFocus();
        return viewGroup2;
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("leanback.onboarding.current_page_index", this.f11891n);
        bundle.putBoolean("leanback.onboarding.logo_animation_finished", this.f11889l);
        bundle.putBoolean("leanback.onboarding.enter_animation_finished", this.f11890m);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            this.f11891n = 0;
            this.f11889l = false;
            this.f11890m = false;
            this.f11880c.i(0, false);
            view.getViewTreeObserver().addOnPreDrawListener(new c());
            return;
        }
        this.f11891n = bundle.getInt("leanback.onboarding.current_page_index");
        this.f11889l = bundle.getBoolean("leanback.onboarding.logo_animation_finished");
        this.f11890m = bundle.getBoolean("leanback.onboarding.enter_animation_finished");
        if (this.f11889l) {
            A();
        } else {
            if (O()) {
                return;
            }
            this.f11889l = true;
            A();
        }
    }

    public final boolean p() {
        return this.f11889l;
    }

    public void q() {
        if (this.f11889l && this.f11891n < i() - 1) {
            int i10 = this.f11891n;
            this.f11891n = i10 + 1;
            C(i10);
        }
    }

    public void r() {
        int i10;
        if (this.f11889l && (i10 = this.f11891n) > 0) {
            this.f11891n = i10 - 1;
            C(i10);
        }
    }

    public abstract View s(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract View t(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public Animator u() {
        return AnimatorInflater.loadAnimator(r.a(this), s3.a.b.f128378e);
    }

    public Animator v() {
        return null;
    }

    public abstract View w(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public Animator x() {
        return null;
    }

    public Animator y() {
        return AnimatorInflater.loadAnimator(r.a(this), s3.a.b.f128386m);
    }

    public void z() {
    }

    public void B(int i10, int i11) {
    }
}

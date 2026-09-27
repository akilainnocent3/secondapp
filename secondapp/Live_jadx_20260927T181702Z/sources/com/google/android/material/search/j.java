package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.p0;
import f2.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f51384j = 250;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f51385k = 500;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f51386l = 750;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f51387m = 250;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f51388n = 250;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f51389o = 300;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f51390p = 75;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f51391q = 250;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f51392r = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Animator f51396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Animator f51397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f51398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f51399g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<SearchBar.b> f51393a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<AnimatorListenerAdapter> f51394b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<AnimatorListenerAdapter> f51395c = new LinkedHashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f51400h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Animator f51401i = null;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.k(new f() { // from class: com.google.android.material.search.i
                @Override // com.google.android.material.search.j.f
                public final void a(SearchBar.b bVar) {
                    bVar.a();
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f51403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Animator f51404c;

        public b(View view, Animator animator) {
            this.f51403b = view;
            this.f51404c = animator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51403b.setVisibility(8);
            this.f51404c.start();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SearchBar f51406b;

        public c(SearchBar searchBar) {
            this.f51406b = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.f51398f = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f51406b.setVisibility(4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.f51401i = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SearchBar f51409b;

        public e(SearchBar searchBar) {
            this.f51409b = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51409b.setVisibility(0);
            j.this.f51399g = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f51409b.E0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f {
        void a(SearchBar.b bVar);
    }

    public static /* synthetic */ void b(j jVar, SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z10) {
        jVar.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(jVar.t(searchBar, view), jVar.o(searchBar, view, appBarLayout));
        animatorSet.addListener(new k(jVar));
        Iterator<AnimatorListenerAdapter> it = jVar.f51394b.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z10) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        jVar.f51401i = animatorSet;
    }

    public static /* synthetic */ void c(ni.k kVar, View view, ValueAnimator valueAnimator) {
        kVar.q0(1.0f - valueAnimator.getAnimatedFraction());
        z1.O1(view, kVar);
        view.setAlpha(1.0f);
    }

    public boolean A(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f51395c.remove(animatorListenerAdapter);
    }

    public boolean B(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f51394b.remove(animatorListenerAdapter);
    }

    public boolean C(SearchBar.b bVar) {
        return this.f51393a.remove(bVar);
    }

    public void D(boolean z10) {
        this.f51400h = z10;
    }

    public void E(SearchBar searchBar, View view, @Nullable AppBarLayout appBarLayout, boolean z10) {
        Animator animator;
        if (y() && (animator = this.f51401i) != null) {
            animator.cancel();
        }
        this.f51399g = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(l(searchBar, view, appBarLayout), s(searchBar));
        animatorSet.addListener(new d());
        Iterator<AnimatorListenerAdapter> it = this.f51395c.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z10) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.f51401i = animatorSet;
    }

    public void F(final SearchBar searchBar, final View view, @Nullable final AppBarLayout appBarLayout, final boolean z10) {
        Animator animator;
        if (x() && (animator = this.f51401i) != null) {
            animator.cancel();
        }
        this.f51398f = true;
        view.setVisibility(4);
        view.post(new Runnable() { // from class: com.google.android.material.search.g
            @Override // java.lang.Runnable
            public final void run() {
                j.b(this.f51345b, searchBar, view, appBarLayout, z10);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void G(SearchBar searchBar) {
        k(new f() { // from class: com.google.android.material.search.e
            @Override // com.google.android.material.search.j.f
            public final void a(SearchBar.b bVar) {
                bVar.b();
            }
        });
        TextView textView = searchBar.getTextView();
        View centerView = searchBar.getCenterView();
        View viewF = com.google.android.material.internal.h0.f(searchBar);
        final Animator animatorV = v(textView, viewF);
        animatorV.addListener(new a());
        this.f51396d = animatorV;
        textView.setAlpha(0.0f);
        if (viewF != null) {
            viewF.setAlpha(0.0f);
        }
        if (centerView instanceof jh.a) {
            ((jh.a) centerView).a(new jh.a.InterfaceC0942a() { // from class: com.google.android.material.search.f
                @Override // jh.a.InterfaceC0942a
                public final void a() {
                    animatorV.start();
                }
            });
            return;
        }
        if (centerView == 0) {
            animatorV.start();
            return;
        }
        centerView.setAlpha(0.0f);
        centerView.setVisibility(0);
        Animator animatorM = m(centerView);
        this.f51397e = animatorM;
        animatorM.addListener(new b(centerView, animatorV));
        animatorM.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void H(SearchBar searchBar) {
        Animator animator = this.f51396d;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.f51397e;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView instanceof jh.a) {
            ((jh.a) centerView).b();
        }
        if (centerView != 0) {
            centerView.setAlpha(0.0f);
        }
    }

    public void h(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f51395c.add(animatorListenerAdapter);
    }

    public void i(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f51394b.add(animatorListenerAdapter);
    }

    public void j(SearchBar.b bVar) {
        this.f51393a.add(bVar);
    }

    public final void k(f fVar) {
        Iterator<SearchBar.b> it = this.f51393a.iterator();
        while (it.hasNext()) {
            fVar.a(it.next());
        }
    }

    public final Animator l(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return p(searchBar, view, appBarLayout).o(250L).e(new e(searchBar)).h();
    }

    public final Animator m(@Nullable View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.f(view));
        TimeInterpolator timeInterpolator = jh.b.f100474a;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f51400h ? 250L : 0L);
        valueAnimatorOfFloat.setStartDelay(this.f51400h ? 500L : 0L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.t.f(view));
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(250L);
        valueAnimatorOfFloat2.setStartDelay(750L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        return animatorSet;
    }

    public final List<View> n(View view) {
        boolean zS = p0.s(view);
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((!zS && (childAt instanceof ActionMenuView)) || (zS && !(childAt instanceof ActionMenuView))) {
                    arrayList.add(childAt);
                }
            }
        }
        return arrayList;
    }

    public final Animator o(SearchBar searchBar, View view, @Nullable AppBarLayout appBarLayout) {
        return p(searchBar, view, appBarLayout).o(300L).e(new c(searchBar)).j();
    }

    public final com.google.android.material.internal.g p(SearchBar searchBar, View view, @Nullable AppBarLayout appBarLayout) {
        return new com.google.android.material.internal.g(searchBar, view).m(q(searchBar, view)).n(appBarLayout != null ? appBarLayout.getTop() : 0).c(n(view));
    }

    public final ValueAnimator.AnimatorUpdateListener q(SearchBar searchBar, final View view) {
        final ni.k kVarM = ni.k.m(view.getContext());
        kVarM.l0(searchBar.getCornerSize());
        kVarM.o0(z1.T(searchBar));
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                j.c(kVarM, view, valueAnimator);
            }
        };
    }

    public final List<View> r(SearchBar searchBar) {
        List<View> listK = p0.k(searchBar);
        if (searchBar.getCenterView() != null) {
            listK.remove(searchBar.getCenterView());
        }
        return listK;
    }

    public final Animator s(SearchBar searchBar) {
        List<View> listR = r(searchBar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.e(listR));
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(jh.b.f100474a);
        return valueAnimatorOfFloat;
    }

    public final Animator t(SearchBar searchBar, final View view) {
        List<View> listR = r(searchBar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.e(listR));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(0.0f);
            }
        });
        valueAnimatorOfFloat.setDuration(75L);
        valueAnimatorOfFloat.setInterpolator(jh.b.f100474a);
        return valueAnimatorOfFloat;
    }

    public final Animator u(@Nullable View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.f(view));
        valueAnimatorOfFloat.setInterpolator(jh.b.f100474a);
        valueAnimatorOfFloat.setDuration(250L);
        return valueAnimatorOfFloat;
    }

    public final Animator v(TextView textView, @Nullable View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(250L);
        animatorSet.play(w(textView));
        if (view != null) {
            animatorSet.play(u(view));
        }
        return animatorSet;
    }

    public final Animator w(TextView textView) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.t.f(textView));
        valueAnimatorOfFloat.setInterpolator(jh.b.f100474a);
        valueAnimatorOfFloat.setDuration(250L);
        return valueAnimatorOfFloat;
    }

    public boolean x() {
        return this.f51399g;
    }

    public boolean y() {
        return this.f51398f;
    }

    public boolean z() {
        return this.f51400h;
    }
}

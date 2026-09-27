package androidx.leanback.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.graphics.Rect;
import android.transition.AutoTransition;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f11989a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11990b = 2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Transition.TransitionListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f11991b;

        public a(f fVar) {
            this.f11991b = fVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            this.f11991b.a(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f11991b.b(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            this.f11991b.c(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            this.f11991b.d(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            this.f11991b.e(transition);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f11992a;

        public b(d dVar) {
            this.f11992a = dVar;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f11992a.a(transition);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {
    }

    public static Object A(Window window) {
        return window.getSharedElementReenterTransition();
    }

    public static Object B(Window window) {
        return window.getSharedElementReturnTransition();
    }

    public static void C(Object obj, int i10) {
        ((Transition) obj).addTarget(i10);
    }

    public static void D(Object obj, View view) {
        ((Transition) obj).addTarget(view);
    }

    public static Object E(Context context, int i10) {
        return TransitionInflater.from(context).inflateTransition(i10);
    }

    public static void F(Object obj, f fVar) {
        Object obj2;
        if (fVar == null || (obj2 = fVar.f11993a) == null) {
            return;
        }
        ((Transition) obj).removeListener((Transition.TransitionListener) obj2);
        fVar.f11993a = null;
    }

    public static void G(Object obj, Object obj2) {
        TransitionManager.go((Scene) obj, (Transition) obj2);
    }

    public static void H(Object obj, int i10) {
        ((androidx.leanback.transition.a) obj).b(i10);
    }

    public static void I(Object obj, int i10, int i11) {
        ((androidx.leanback.transition.a) obj).c(i10, i11);
    }

    public static void J(Object obj, View view, int i10) {
        ((androidx.leanback.transition.a) obj).d(view, i10);
    }

    public static void K(Object obj, String str, int i10) {
        ((androidx.leanback.transition.a) obj).e(str, i10);
    }

    public static void L(Object obj, long j10) {
        ((Transition) obj).setDuration(j10);
    }

    @SuppressLint({"ReferencesDeprecated"})
    public static void M(Fragment fragment, Object obj) {
        fragment.setEnterTransition((Transition) obj);
    }

    public static void N(Window window, Object obj) {
        window.setEnterTransition((Transition) obj);
    }

    public static void O(Object obj, d dVar) {
        if (dVar == null) {
            ((Transition) obj).setEpicenterCallback(null);
        } else {
            ((Transition) obj).setEpicenterCallback(new b(dVar));
        }
    }

    @SuppressLint({"ReferencesDeprecated"})
    public static void P(Fragment fragment, Object obj) {
        fragment.setExitTransition((Transition) obj);
    }

    public static void Q(Object obj, Object obj2) {
        ((Transition) obj).setInterpolator((TimeInterpolator) obj2);
    }

    public static void R(Window window, Object obj) {
        window.setReturnTransition((Transition) obj);
    }

    @SuppressLint({"ReferencesDeprecated"})
    public static void S(Fragment fragment, Object obj) {
        fragment.setSharedElementEnterTransition((Transition) obj);
    }

    public static void T(Window window, Object obj) {
        window.setSharedElementEnterTransition((Transition) obj);
    }

    public static void U(Window window, Object obj) {
        window.setSharedElementReturnTransition((Transition) obj);
    }

    public static void V(Object obj, long j10) {
        ((Transition) obj).setStartDelay(j10);
    }

    public static void W(ViewGroup viewGroup, boolean z10) {
        viewGroup.setTransitionGroup(z10);
    }

    public static boolean X() {
        return true;
    }

    @SuppressLint({"ReferencesDeprecated"})
    public static void a(FragmentTransaction fragmentTransaction, View view, String str) {
        fragmentTransaction.addSharedElement(view, str);
    }

    public static void b(Object obj, View view) {
        ((Transition) obj).addTarget(view);
    }

    public static void c(Object obj, Object obj2) {
        ((TransitionSet) obj).addTransition((Transition) obj2);
    }

    public static void d(Object obj, f fVar) {
        if (fVar == null) {
            return;
        }
        a aVar = new a(fVar);
        fVar.f11993a = aVar;
        ((Transition) obj).addListener(aVar);
    }

    public static void e(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public static Object f() {
        return new AutoTransition();
    }

    public static Object g(boolean z10) {
        androidx.leanback.transition.a aVar = new androidx.leanback.transition.a();
        aVar.setReparent(z10);
        return aVar;
    }

    public static Object h() {
        return new ChangeTransform();
    }

    public static Object i(Context context) {
        return AnimationUtils.loadInterpolator(context, 17563663);
    }

    public static Object j(int i10) {
        return new FadeAndShortSlide(i10);
    }

    public static Object k(int i10, float f10) {
        FadeAndShortSlide fadeAndShortSlide = new FadeAndShortSlide(i10);
        fadeAndShortSlide.e(f10);
        return fadeAndShortSlide;
    }

    public static Object l(int i10) {
        return new Fade(i10);
    }

    public static Object m() {
        return new ChangeTransform();
    }

    public static Object n(ViewGroup viewGroup, Runnable runnable) {
        Scene scene = new Scene(viewGroup);
        scene.setEnterAction(runnable);
        return scene;
    }

    public static Object o(int i10) {
        SlideKitkat slideKitkat = new SlideKitkat();
        slideKitkat.c(i10);
        return slideKitkat;
    }

    public static Object p(boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(z10 ? 1 : 0);
        return transitionSet;
    }

    public static void q(Object obj, int i10, boolean z10) {
        ((Transition) obj).excludeTarget(i10, z10);
    }

    public static void r(Object obj, View view, boolean z10) {
        ((Transition) obj).excludeTarget(view, z10);
    }

    public static void s(Object obj, int i10, boolean z10) {
        ((Transition) obj).excludeChildren(i10, z10);
    }

    public static void t(Object obj, View view, boolean z10) {
        ((Transition) obj).excludeChildren(view, z10);
    }

    public static Object u(Window window) {
        return window.getEnterTransition();
    }

    public static Object v(Window window) {
        return window.getExitTransition();
    }

    public static Object w(Window window) {
        return window.getReenterTransition();
    }

    public static Object x(Window window) {
        return window.getReturnTransition();
    }

    public static Object y(Window window) {
        return window.getSharedElementEnterTransition();
    }

    public static Object z(Window window) {
        return window.getSharedElementExitTransition();
    }
}

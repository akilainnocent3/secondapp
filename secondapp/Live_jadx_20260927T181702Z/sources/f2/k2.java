package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<View> f82441a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l2 f82442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f82443c;

        public a(l2 l2Var, View view) {
            this.f82442b = l2Var;
            this.f82443c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f82442b.a(this.f82443c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f82442b.b(this.f82443c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f82442b.c(this.f82443c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(21)
    public static class b {
        @k.t
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.translationZ(f10);
        }

        @k.t
        public static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.translationZBy(f10);
        }

        @k.t
        public static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.z(f10);
        }

        @k.t
        public static ViewPropertyAnimator d(ViewPropertyAnimator viewPropertyAnimator, float f10) {
            return viewPropertyAnimator.zBy(f10);
        }
    }

    public k2(View view) {
        this.f82441a = new WeakReference<>(view);
    }

    @NonNull
    public k2 A(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }

    @NonNull
    public k2 B(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().translationYBy(f10);
        }
        return this;
    }

    @NonNull
    public k2 C(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            b.a(view.animate(), f10);
        }
        return this;
    }

    @NonNull
    public k2 D(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            b.b(view.animate(), f10);
        }
        return this;
    }

    @NonNull
    public k2 E(@NonNull Runnable runnable) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    public k2 F() {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    @NonNull
    public k2 G(@NonNull Runnable runnable) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    @NonNull
    public k2 H(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().x(f10);
        }
        return this;
    }

    @NonNull
    public k2 I(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().xBy(f10);
        }
        return this;
    }

    @NonNull
    public k2 J(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().y(f10);
        }
        return this;
    }

    @NonNull
    public k2 K(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().yBy(f10);
        }
        return this;
    }

    @NonNull
    public k2 L(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            b.c(view.animate(), f10);
        }
        return this;
    }

    @NonNull
    public k2 M(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            b.d(view.animate(), f10);
        }
        return this;
    }

    @NonNull
    public k2 b(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    @NonNull
    public k2 c(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().alphaBy(f10);
        }
        return this;
    }

    public void d() {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long e() {
        View view = this.f82441a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @Nullable
    public Interpolator f() {
        View view = this.f82441a.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public long g() {
        View view = this.f82441a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @NonNull
    public k2 h(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().rotation(f10);
        }
        return this;
    }

    @NonNull
    public k2 i(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().rotationBy(f10);
        }
        return this;
    }

    @NonNull
    public k2 j(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().rotationX(f10);
        }
        return this;
    }

    @NonNull
    public k2 k(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().rotationXBy(f10);
        }
        return this;
    }

    @NonNull
    public k2 l(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().rotationY(f10);
        }
        return this;
    }

    @NonNull
    public k2 m(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().rotationYBy(f10);
        }
        return this;
    }

    @NonNull
    public k2 n(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().scaleX(f10);
        }
        return this;
    }

    @NonNull
    public k2 o(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().scaleXBy(f10);
        }
        return this;
    }

    @NonNull
    public k2 p(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().scaleY(f10);
        }
        return this;
    }

    @NonNull
    public k2 q(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().scaleYBy(f10);
        }
        return this;
    }

    @NonNull
    public k2 r(long j10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    @NonNull
    public k2 s(@Nullable Interpolator interpolator) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @NonNull
    public k2 t(@Nullable l2 l2Var) {
        View view = this.f82441a.get();
        if (view != null) {
            u(view, l2Var);
        }
        return this;
    }

    public final void u(View view, l2 l2Var) {
        if (l2Var != null) {
            view.animate().setListener(new a(l2Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @NonNull
    public k2 v(long j10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    @NonNull
    public k2 w(@Nullable final n2 n2Var) {
        final View view = this.f82441a.get();
        if (view != null) {
            view.animate().setUpdateListener(n2Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: f2.j2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    n2Var.a(view);
                }
            } : null);
        }
        return this;
    }

    public void x() {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @NonNull
    public k2 y(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().translationX(f10);
        }
        return this;
    }

    @NonNull
    public k2 z(float f10) {
        View view = this.f82441a.get();
        if (view != null) {
            view.animate().translationXBy(f10);
        }
        return this;
    }
}

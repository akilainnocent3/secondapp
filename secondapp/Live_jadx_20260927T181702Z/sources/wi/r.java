package wi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class r implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f143357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f143358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f143359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f143360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f143361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f143362f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f143363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f143364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f143365d;

        public a(View view, float f10, float f11) {
            this.f143363b = view;
            this.f143364c = f10;
            this.f143365d = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f143363b.setScaleX(this.f143364c);
            this.f143363b.setScaleY(this.f143365d);
        }
    }

    public r() {
        this(true);
    }

    public static Animator c(View view, float f10, float f11) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f10, scaleX * f11), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f10 * scaleY, f11 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // wi.w
    @Nullable
    public Animator a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f143362f) {
            return this.f143361e ? c(view, this.f143357a, this.f143358b) : c(view, this.f143360d, this.f143359c);
        }
        return null;
    }

    @Override // wi.w
    @Nullable
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return this.f143361e ? c(view, this.f143359c, this.f143360d) : c(view, this.f143358b, this.f143357a);
    }

    public float d() {
        return this.f143360d;
    }

    public float e() {
        return this.f143359c;
    }

    public float f() {
        return this.f143358b;
    }

    public float g() {
        return this.f143357a;
    }

    public boolean h() {
        return this.f143361e;
    }

    public boolean i() {
        return this.f143362f;
    }

    public void j(boolean z10) {
        this.f143361e = z10;
    }

    public void k(float f10) {
        this.f143360d = f10;
    }

    public void l(float f10) {
        this.f143359c = f10;
    }

    public void m(float f10) {
        this.f143358b = f10;
    }

    public void n(float f10) {
        this.f143357a = f10;
    }

    public void o(boolean z10) {
        this.f143362f = z10;
    }

    public r(boolean z10) {
        this.f143357a = 1.0f;
        this.f143358b = 1.1f;
        this.f143359c = 0.8f;
        this.f143360d = 1.0f;
        this.f143362f = true;
        this.f143361e = z10;
    }
}

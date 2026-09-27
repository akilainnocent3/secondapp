package xi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@t0(21)
public final class s implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f145280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f145281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f145282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f145283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f145284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f145285f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f145286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f145287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f145288d;

        public a(View view, float f10, float f11) {
            this.f145286b = view;
            this.f145287c = f10;
            this.f145288d = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f145286b.setScaleX(this.f145287c);
            this.f145286b.setScaleY(this.f145288d);
        }
    }

    public s() {
        this(true);
    }

    public static Animator c(View view, float f10, float f11) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f10, scaleX * f11), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f10 * scaleY, f11 * scaleY));
        objectAnimatorOfPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // xi.x
    @Nullable
    public Animator a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f145285f) {
            return this.f145284e ? c(view, this.f145280a, this.f145281b) : c(view, this.f145283d, this.f145282c);
        }
        return null;
    }

    @Override // xi.x
    @Nullable
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return this.f145284e ? c(view, this.f145282c, this.f145283d) : c(view, this.f145281b, this.f145280a);
    }

    public float d() {
        return this.f145283d;
    }

    public float e() {
        return this.f145282c;
    }

    public float f() {
        return this.f145281b;
    }

    public float g() {
        return this.f145280a;
    }

    public boolean h() {
        return this.f145284e;
    }

    public boolean i() {
        return this.f145285f;
    }

    public void j(boolean z10) {
        this.f145284e = z10;
    }

    public void k(float f10) {
        this.f145283d = f10;
    }

    public void l(float f10) {
        this.f145282c = f10;
    }

    public void m(float f10) {
        this.f145281b = f10;
    }

    public void n(float f10) {
        this.f145280a = f10;
    }

    public void o(boolean z10) {
        this.f145285f = z10;
    }

    public s(boolean z10) {
        this.f145280a = 1.0f;
        this.f145281b = 1.1f;
        this.f145282c = 0.8f;
        this.f145283d = 1.0f;
        this.f145285f = true;
        this.f145284e = z10;
    }
}

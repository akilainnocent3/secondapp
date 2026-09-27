package f2;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f82389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f82390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f82391d;

    public h1(View view, Runnable runnable) {
        this.f82389b = view;
        this.f82390c = view.getViewTreeObserver();
        this.f82391d = runnable;
    }

    @NonNull
    public static h1 a(@NonNull View view, @NonNull Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        h1 h1Var = new h1(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(h1Var);
        view.addOnAttachStateChangeListener(h1Var);
        return h1Var;
    }

    public void b() {
        if (this.f82390c.isAlive()) {
            this.f82390c.removeOnPreDrawListener(this);
        } else {
            this.f82389b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f82389b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f82391d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NonNull View view) {
        this.f82390c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NonNull View view) {
        b();
    }
}

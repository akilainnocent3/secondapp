package mc;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j<Z> extends r<ImageView, Z> implements nc.f.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Animatable f107213k;

    public j(ImageView imageView) {
        super(imageView);
    }

    @Override // nc.f.a
    @Nullable
    public Drawable a() {
        return ((ImageView) this.f107229c).getDrawable();
    }

    @Override // nc.f.a
    public void b(Drawable drawable) {
        ((ImageView) this.f107229c).setImageDrawable(drawable);
    }

    @Override // mc.r, mc.b, mc.p
    public void f(@Nullable Drawable drawable) {
        super.f(drawable);
        Animatable animatable = this.f107213k;
        if (animatable != null) {
            animatable.stop();
        }
        v(null);
        b(drawable);
    }

    @Override // mc.r, mc.b, mc.p
    public void k(@Nullable Drawable drawable) {
        super.k(drawable);
        v(null);
        b(drawable);
    }

    @Override // mc.p
    public void l(@NonNull Z z10, @Nullable nc.f<? super Z> fVar) {
        if (fVar == null || !fVar.a(z10, this)) {
            v(z10);
        } else {
            t(z10);
        }
    }

    @Override // mc.b, mc.p
    public void n(@Nullable Drawable drawable) {
        super.n(drawable);
        v(null);
        b(drawable);
    }

    @Override // mc.b, com.bumptech.glide.manager.k
    public void onStart() {
        Animatable animatable = this.f107213k;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // mc.b, com.bumptech.glide.manager.k
    public void onStop() {
        Animatable animatable = this.f107213k;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void t(@Nullable Z z10) {
        if (!(z10 instanceof Animatable)) {
            this.f107213k = null;
            return;
        }
        Animatable animatable = (Animatable) z10;
        this.f107213k = animatable;
        animatable.start();
    }

    public abstract void u(@Nullable Z z10);

    public final void v(@Nullable Z z10) {
        u(z10);
        t(z10);
    }

    @Deprecated
    public j(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}

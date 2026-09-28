package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract class ubn<Z> extends s9i0<ImageView, Z> {
    public Animatable c;

    @Override // defpackage.b62, defpackage.gbs
    public final void b() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.b62, defpackage.gbs
    public final void c() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d5f0
    public void e(Object obj) {
        f(obj);
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    public abstract void f(Z z);

    @Override // defpackage.s9i0, defpackage.d5f0
    public final void g(Drawable drawable) {
        f(null);
        this.c = null;
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.s9i0, defpackage.d5f0
    public final void h(Drawable drawable) {
        super.h(drawable);
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        f(null);
        this.c = null;
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.b62, defpackage.d5f0
    public final void m(Drawable drawable) {
        f(null);
        this.c = null;
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}

package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vbn implements aug0, rdd, e5f0 {
    public boolean a;
    public final ImageView b;

    public vbn(ImageView imageView) {
        this.b = imageView;
    }

    @Override // defpackage.e5f0
    public final void a(u7n u7nVar) {
        f(u7nVar);
    }

    @Override // defpackage.e5f0
    public final void b(u7n u7nVar) {
        f(u7nVar);
    }

    @Override // defpackage.e5f0
    public final void c(u7n u7nVar) {
        f(u7nVar);
    }

    @Override // defpackage.aug0
    public final Drawable d() {
        return this.b.getDrawable();
    }

    public final void e() {
        Object drawable = this.b.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vbn) && Intrinsics.g(this.b, ((vbn) obj).b);
    }

    public final void f(u7n u7nVar) {
        ImageView imageView = this.b;
        Drawable drawableA = u7nVar != null ? zbn.a(u7nVar, imageView.getResources()) : null;
        Object drawable = imageView.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawableA);
        e();
    }

    @Override // defpackage.aug0
    public final View getView() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.rdd
    public final void onStart(ibs ibsVar) {
        this.a = true;
        e();
    }

    @Override // defpackage.rdd
    public final void onStop(ibs ibsVar) {
        this.a = false;
        e();
    }

    public final String toString() {
        return "ImageViewTarget(view=" + this.b + ')';
    }
}

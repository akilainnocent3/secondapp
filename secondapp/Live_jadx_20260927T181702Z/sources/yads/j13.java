package yads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class j13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m13 f150904a = new m13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bm f150905b = new bm();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bp f150906c = new bp();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l13 f150907d;

    public final void a(ImageView imageView) {
        imageView.removeOnLayoutChangeListener(this.f150907d);
    }

    public final void a(Drawable drawable, ImageView imageView, u41 u41Var) {
        l13 l13Var = new l13(this.f150905b, this.f150906c, this.f150904a, u41Var, drawable);
        this.f150907d = l13Var;
        imageView.addOnLayoutChangeListener(l13Var);
        if (imageView.getLayoutParams().width == -1 || imageView.getLayoutParams().height == -1 || imageView.getLayoutParams().width == -2 || imageView.getLayoutParams().height == -2) {
            imageView.setImageDrawable(drawable);
        }
    }
}

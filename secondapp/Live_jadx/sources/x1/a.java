package x1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Drawable f144078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f144079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final Path f144080c;

    public a(@oy.l Drawable drawable, float f10) {
        m0.p(drawable, "drawable");
        this.f144078a = drawable;
        this.f144079b = f10;
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, f10 / 2.0f, Path.Direction.CW);
        this.f144080c = path;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@oy.l Canvas canvas) {
        m0.p(canvas, "canvas");
        canvas.clipPath(this.f144080c);
        this.f144078a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f144078a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@oy.l Rect bounds) {
        m0.p(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f144078a.setBounds(bounds);
        this.f144080c.offset(bounds.exactCenterX(), bounds.exactCenterY());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f144078a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@oy.m ColorFilter colorFilter) {
        this.f144078a.setColorFilter(colorFilter);
    }
}

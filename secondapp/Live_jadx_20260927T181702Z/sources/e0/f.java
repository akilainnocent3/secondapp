package e0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(21)
public class f extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f79746a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f79748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f79749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f79750e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f79753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f79754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f79755j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79751f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f79752g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f79756k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f79747b = new Paint(5);

    public f(ColorStateList colorStateList, float f10) {
        this.f79746a = f10;
        e(colorStateList);
        this.f79748c = new RectF();
        this.f79749d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public ColorStateList b() {
        return this.f79753h;
    }

    public float c() {
        return this.f79750e;
    }

    public float d() {
        return this.f79746a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f79747b;
        if (this.f79754i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f79754i);
            z10 = true;
        }
        RectF rectF = this.f79748c;
        float f10 = this.f79746a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f79753h = colorStateList;
        this.f79747b.setColor(colorStateList.getColorForState(getState(), this.f79753h.getDefaultColor()));
    }

    public void f(@Nullable ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    public void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f79750e && this.f79751f == z10 && this.f79752g == z11) {
            return;
        }
        this.f79750e = f10;
        this.f79751f = z10;
        this.f79752g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f79749d, this.f79746a);
    }

    public void h(float f10) {
        if (f10 == this.f79746a) {
            return;
        }
        this.f79746a = f10;
        i(null);
        invalidateSelf();
    }

    public final void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f79748c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f79749d.set(rect);
        if (this.f79751f) {
            this.f79749d.inset((int) Math.ceil(g.c(this.f79750e, this.f79746a, this.f79752g)), (int) Math.ceil(g.d(this.f79750e, this.f79746a, this.f79752g)));
            this.f79748c.set(this.f79749d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f79755j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f79753h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f79753h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f79747b.getColor();
        if (z10) {
            this.f79747b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f79755j;
        if (colorStateList2 == null || (mode = this.f79756k) == null) {
            return z10;
        }
        this.f79754i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f79747b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f79747b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f79755j = colorStateList;
        this.f79754i = a(colorStateList, this.f79756k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f79756k = mode;
        this.f79754i = a(this.f79755j, mode);
        invalidateSelf();
    }
}

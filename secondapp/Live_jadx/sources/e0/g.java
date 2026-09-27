package e0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double f79757q = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f79758r = 1.5f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static a f79759s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79760a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f79762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f79763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f79764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f79765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Path f79766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f79767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f79768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f79769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f79770k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f79772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f79773n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f79771l = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f79774o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f79775p = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f79761b = new Paint(5);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(Canvas canvas, RectF rectF, float f10, Paint paint);
    }

    public g(Resources resources, ColorStateList colorStateList, float f10, float f11, float f12) {
        this.f79772m = resources.getColor(d0.a.b.f77416d);
        this.f79773n = resources.getColor(d0.a.b.f77415c);
        this.f79760a = resources.getDimensionPixelSize(d0.a.c.f77417a);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f79762c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f79765f = (int) (f10 + 0.5f);
        this.f79764e = new RectF();
        Paint paint2 = new Paint(this.f79762c);
        this.f79763d = paint2;
        paint2.setAntiAlias(false);
        s(f11, f12);
    }

    public static float c(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) f10) + ((1.0d - f79757q) * ((double) f11))) : f10;
    }

    public static float d(float f10, float f11, boolean z10) {
        return z10 ? (float) (((double) (f10 * 1.5f)) + ((1.0d - f79757q) * ((double) f11))) : f10 * 1.5f;
    }

    public final void a(Rect rect) {
        float f10 = this.f79767h;
        float f11 = 1.5f * f10;
        this.f79764e.set(rect.left + f10, rect.top + f11, rect.right - f10, rect.bottom - f11);
        b();
    }

    public final void b() {
        float f10 = this.f79765f;
        RectF rectF = new RectF(-f10, -f10, f10, f10);
        RectF rectF2 = new RectF(rectF);
        float f11 = this.f79768i;
        rectF2.inset(-f11, -f11);
        Path path = this.f79766g;
        if (path == null) {
            this.f79766g = new Path();
        } else {
            path.reset();
        }
        this.f79766g.setFillType(Path.FillType.EVEN_ODD);
        this.f79766g.moveTo(-this.f79765f, 0.0f);
        this.f79766g.rLineTo(-this.f79768i, 0.0f);
        this.f79766g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f79766g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f79766g.close();
        float f12 = this.f79765f;
        float f13 = f12 / (this.f79768i + f12);
        Paint paint = this.f79762c;
        float f14 = this.f79765f + this.f79768i;
        int i10 = this.f79772m;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f14, new int[]{i10, i10, this.f79773n}, new float[]{0.0f, f13, 1.0f}, tileMode));
        Paint paint2 = this.f79763d;
        float f15 = this.f79765f;
        float f16 = this.f79768i;
        float f17 = (-f15) + f16;
        float f18 = (-f15) - f16;
        int i11 = this.f79772m;
        paint2.setShader(new LinearGradient(0.0f, f17, 0.0f, f18, new int[]{i11, i11, this.f79773n}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        this.f79763d.setAntiAlias(false);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f79771l) {
            a(getBounds());
            this.f79771l = false;
        }
        canvas.translate(0.0f, this.f79769j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f79769j) / 2.0f);
        f79759s.a(canvas, this.f79764e, this.f79765f, this.f79761b);
    }

    public final void e(Canvas canvas) {
        Canvas canvas2;
        float f10 = this.f79765f;
        float f11 = (-f10) - this.f79768i;
        float f12 = f10 + this.f79760a + (this.f79769j / 2.0f);
        float f13 = 2.0f * f12;
        boolean z10 = this.f79764e.width() - f13 > 0.0f;
        boolean z11 = this.f79764e.height() - f13 > 0.0f;
        int iSave = canvas.save();
        RectF rectF = this.f79764e;
        canvas.translate(rectF.left + f12, rectF.top + f12);
        canvas.drawPath(this.f79766g, this.f79762c);
        if (z10) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, f11, this.f79764e.width() - f13, -this.f79765f, this.f79763d);
        } else {
            canvas2 = canvas;
        }
        canvas2.restoreToCount(iSave);
        int iSave2 = canvas2.save();
        RectF rectF2 = this.f79764e;
        canvas2.translate(rectF2.right - f12, rectF2.bottom - f12);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f79766g, this.f79762c);
        if (z10) {
            canvas2.drawRect(0.0f, f11, this.f79764e.width() - f13, (-this.f79765f) + this.f79768i, this.f79763d);
        }
        canvas2.restoreToCount(iSave2);
        int iSave3 = canvas2.save();
        RectF rectF3 = this.f79764e;
        canvas2.translate(rectF3.left + f12, rectF3.bottom - f12);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f79766g, this.f79762c);
        if (z11) {
            canvas2.drawRect(0.0f, f11, this.f79764e.height() - f13, -this.f79765f, this.f79763d);
        }
        canvas2.restoreToCount(iSave3);
        int iSave4 = canvas2.save();
        RectF rectF4 = this.f79764e;
        canvas2.translate(rectF4.right - f12, rectF4.top + f12);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f79766g, this.f79762c);
        if (z11) {
            canvas2.drawRect(0.0f, f11, this.f79764e.height() - f13, -this.f79765f, this.f79763d);
        }
        canvas2.restoreToCount(iSave4);
    }

    public ColorStateList f() {
        return this.f79770k;
    }

    public float g() {
        return this.f79765f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(d(this.f79767h, this.f79765f, this.f79774o));
        int iCeil2 = (int) Math.ceil(c(this.f79767h, this.f79765f, this.f79774o));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    public void h(Rect rect) {
        getPadding(rect);
    }

    public float i() {
        return this.f79767h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f79770k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public float j() {
        float f10 = this.f79767h;
        return (Math.max(f10, this.f79765f + this.f79760a + ((f10 * 1.5f) / 2.0f)) * 2.0f) + (((this.f79767h * 1.5f) + this.f79760a) * 2.0f);
    }

    public float k() {
        float f10 = this.f79767h;
        return (Math.max(f10, this.f79765f + this.f79760a + (f10 / 2.0f)) * 2.0f) + ((this.f79767h + this.f79760a) * 2.0f);
    }

    public float l() {
        return this.f79769j;
    }

    public void m(boolean z10) {
        this.f79774o = z10;
        invalidateSelf();
    }

    public final void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f79770k = colorStateList;
        this.f79761b.setColor(colorStateList.getColorForState(getState(), this.f79770k.getDefaultColor()));
    }

    public void o(@Nullable ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f79771l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f79770k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f79761b.getColor() == colorForState) {
            return false;
        }
        this.f79761b.setColor(colorForState);
        this.f79771l = true;
        invalidateSelf();
        return true;
    }

    public void p(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f10 + ". Must be >= 0");
        }
        float f11 = (int) (f10 + 0.5f);
        if (this.f79765f == f11) {
            return;
        }
        this.f79765f = f11;
        this.f79771l = true;
        invalidateSelf();
    }

    public void q(float f10) {
        s(this.f79769j, f10);
    }

    public void r(float f10) {
        s(f10, this.f79767h);
    }

    public final void s(float f10, float f11) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f10 + ". Must be >= 0");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f11 + ". Must be >= 0");
        }
        float fT = t(f10);
        float fT2 = t(f11);
        if (fT > fT2) {
            if (!this.f79775p) {
                this.f79775p = true;
            }
            fT = fT2;
        }
        if (this.f79769j == fT && this.f79767h == fT2) {
            return;
        }
        this.f79769j = fT;
        this.f79767h = fT2;
        this.f79768i = (int) ((fT * 1.5f) + this.f79760a + 0.5f);
        this.f79771l = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f79761b.setAlpha(i10);
        this.f79762c.setAlpha(i10);
        this.f79763d.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f79761b.setColorFilter(colorFilter);
    }

    public final int t(float f10) {
        int i10 = (int) (f10 + 0.5f);
        return i10 % 2 == 1 ? i10 - 1 : i10;
    }
}

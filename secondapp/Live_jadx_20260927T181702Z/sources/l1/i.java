package l1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends Drawable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f103289n = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f103290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f103291b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitmapShader f103294e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f103296g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f103300k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f103301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f103302m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f103292c = 119;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f103293d = new Paint(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f103295f = new Matrix();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f103297h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f103298i = new RectF();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f103299j = true;

    public i(Resources resources, Bitmap bitmap) {
        this.f103291b = 160;
        if (resources != null) {
            this.f103291b = resources.getDisplayMetrics().densityDpi;
        }
        this.f103290a = bitmap;
        if (bitmap != null) {
            a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f103294e = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f103302m = -1;
            this.f103301l = -1;
            this.f103294e = null;
        }
    }

    public static boolean j(float f10) {
        return f10 > 0.05f;
    }

    public final void a() {
        this.f103301l = this.f103290a.getScaledWidth(this.f103291b);
        this.f103302m = this.f103290a.getScaledHeight(this.f103291b);
    }

    @Nullable
    public final Bitmap b() {
        return this.f103290a;
    }

    public float c() {
        return this.f103296g;
    }

    public int d() {
        return this.f103292c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f103290a;
        if (bitmap == null) {
            return;
        }
        t();
        if (this.f103293d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f103297h, this.f103293d);
            return;
        }
        RectF rectF = this.f103298i;
        float f10 = this.f103296g;
        canvas.drawRoundRect(rectF, f10, f10, this.f103293d);
    }

    @NonNull
    public final Paint e() {
        return this.f103293d;
    }

    public void f(int i10, int i11, int i12, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return this.f103293d.isAntiAlias();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f103293d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f103293d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f103302m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f103301l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f103292c != 119 || this.f103300k || (bitmap = this.f103290a) == null || bitmap.hasAlpha() || this.f103293d.getAlpha() < 255 || j(this.f103296g)) ? -3 : -1;
    }

    public boolean h() {
        throw new UnsupportedOperationException();
    }

    public boolean i() {
        return this.f103300k;
    }

    public void k(boolean z10) {
        this.f103293d.setAntiAlias(z10);
        invalidateSelf();
    }

    public void l(boolean z10) {
        this.f103300k = z10;
        this.f103299j = true;
        if (!z10) {
            m(0.0f);
            return;
        }
        s();
        this.f103293d.setShader(this.f103294e);
        invalidateSelf();
    }

    public void m(float f10) {
        if (this.f103296g == f10) {
            return;
        }
        this.f103300k = false;
        if (j(f10)) {
            this.f103293d.setShader(this.f103294e);
        } else {
            this.f103293d.setShader(null);
        }
        this.f103296g = f10;
        invalidateSelf();
    }

    public void n(int i10) {
        if (this.f103292c != i10) {
            this.f103292c = i10;
            this.f103299j = true;
            invalidateSelf();
        }
    }

    public void o(boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        if (this.f103300k) {
            s();
        }
        this.f103299j = true;
    }

    public void p(int i10) {
        if (this.f103291b != i10) {
            if (i10 == 0) {
                i10 = 160;
            }
            this.f103291b = i10;
            if (this.f103290a != null) {
                a();
            }
            invalidateSelf();
        }
    }

    public void q(@NonNull Canvas canvas) {
        p(canvas.getDensity());
    }

    public void r(@NonNull DisplayMetrics displayMetrics) {
        p(displayMetrics.densityDpi);
    }

    public final void s() {
        this.f103296g = Math.min(this.f103302m, this.f103301l) / 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f103293d.getAlpha()) {
            this.f103293d.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f103293d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f103293d.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f103293d.setFilterBitmap(z10);
        invalidateSelf();
    }

    public void t() {
        i iVar;
        if (this.f103299j) {
            if (this.f103300k) {
                int iMin = Math.min(this.f103301l, this.f103302m);
                iVar = this;
                iVar.f(this.f103292c, iMin, iMin, getBounds(), this.f103297h);
                int iMin2 = Math.min(iVar.f103297h.width(), iVar.f103297h.height());
                iVar.f103297h.inset(Math.max(0, (iVar.f103297h.width() - iMin2) / 2), Math.max(0, (iVar.f103297h.height() - iMin2) / 2));
                iVar.f103296g = iMin2 * 0.5f;
            } else {
                iVar = this;
                iVar.f(iVar.f103292c, iVar.f103301l, iVar.f103302m, getBounds(), iVar.f103297h);
            }
            iVar.f103298i.set(iVar.f103297h);
            if (iVar.f103294e != null) {
                Matrix matrix = iVar.f103295f;
                RectF rectF = iVar.f103298i;
                matrix.setTranslate(rectF.left, rectF.top);
                iVar.f103295f.preScale(iVar.f103298i.width() / iVar.f103290a.getWidth(), iVar.f103298i.height() / iVar.f103290a.getHeight());
                iVar.f103294e.setLocalMatrix(iVar.f103295f);
                iVar.f103293d.setShader(iVar.f103294e);
            }
            iVar.f103299j = false;
        }
    }
}

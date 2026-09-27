package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.k;
import k.w;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f118554m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f118555n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f118556o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f118557p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f118558q = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f118559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f118560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f118561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f118562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f118563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f118564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f118565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f118566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f118567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f118568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f118569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f118570l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    public d(Context context) {
        Paint paint = new Paint();
        this.f118559a = paint;
        this.f118565g = new Path();
        this.f118567i = false;
        this.f118570l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, m.a.m.C3, m.a.b.f105474o1, m.a.l.f105954v1);
        p(typedArrayObtainStyledAttributes.getColor(m.a.m.G3, 0));
        o(typedArrayObtainStyledAttributes.getDimension(m.a.m.K3, 0.0f));
        s(typedArrayObtainStyledAttributes.getBoolean(m.a.m.J3, true));
        r(Math.round(typedArrayObtainStyledAttributes.getDimension(m.a.m.I3, 0.0f)));
        this.f118566h = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.a.m.H3, 0);
        this.f118561c = Math.round(typedArrayObtainStyledAttributes.getDimension(m.a.m.F3, 0.0f));
        this.f118560b = Math.round(typedArrayObtainStyledAttributes.getDimension(m.a.m.D3, 0.0f));
        this.f118562d = typedArrayObtainStyledAttributes.getDimension(m.a.m.E3, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float k(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public float a() {
        return this.f118560b;
    }

    public float b() {
        return this.f118562d;
    }

    public float c() {
        return this.f118561c;
    }

    public float d() {
        return this.f118559a.getStrokeWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f118570l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? l1.d.f(this) == 0 : l1.d.f(this) == 1))) {
            z10 = true;
        }
        float f10 = this.f118560b;
        float fK = k(this.f118561c, (float) Math.sqrt(f10 * f10 * 2.0f), this.f118568j);
        float fK2 = k(this.f118561c, this.f118562d, this.f118568j);
        float fRound = Math.round(k(0.0f, this.f118569k, this.f118568j));
        float fK3 = k(0.0f, f118558q, this.f118568j);
        float fK4 = k(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f118568j);
        double d10 = fK;
        double d11 = fK3;
        boolean z11 = z10;
        float fRound2 = Math.round(Math.cos(d11) * d10);
        float fRound3 = Math.round(d10 * Math.sin(d11));
        this.f118565g.rewind();
        float fK5 = k(this.f118563e + this.f118559a.getStrokeWidth(), -this.f118569k, this.f118568j);
        float f11 = (-fK2) / 2.0f;
        this.f118565g.moveTo(f11 + fRound, 0.0f);
        this.f118565g.rLineTo(fK2 - (fRound * 2.0f), 0.0f);
        this.f118565g.moveTo(f11, fK5);
        this.f118565g.rLineTo(fRound2, fRound3);
        this.f118565g.moveTo(f11, -fK5);
        this.f118565g.rLineTo(fRound2, -fRound3);
        this.f118565g.close();
        canvas.save();
        float strokeWidth = this.f118559a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f12 = this.f118563e;
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (f12 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + f12);
        if (this.f118564f) {
            canvas.rotate(fK4 * (this.f118567i ^ z11 ? -1 : 1));
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f118565g, this.f118559a);
        canvas.restore();
    }

    @k
    public int e() {
        return this.f118559a.getColor();
    }

    public int f() {
        return this.f118570l;
    }

    public float g() {
        return this.f118563e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f118566h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f118566h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint h() {
        return this.f118559a;
    }

    @w(from = 0.0d, to = 1.0d)
    public float i() {
        return this.f118568j;
    }

    public boolean j() {
        return this.f118564f;
    }

    public void l(float f10) {
        if (this.f118560b != f10) {
            this.f118560b = f10;
            invalidateSelf();
        }
    }

    public void m(float f10) {
        if (this.f118562d != f10) {
            this.f118562d = f10;
            invalidateSelf();
        }
    }

    public void n(float f10) {
        if (this.f118561c != f10) {
            this.f118561c = f10;
            invalidateSelf();
        }
    }

    public void o(float f10) {
        if (this.f118559a.getStrokeWidth() != f10) {
            this.f118559a.setStrokeWidth(f10);
            this.f118569k = (float) (((double) (f10 / 2.0f)) * Math.cos(f118558q));
            invalidateSelf();
        }
    }

    public void p(@k int i10) {
        if (i10 != this.f118559a.getColor()) {
            this.f118559a.setColor(i10);
            invalidateSelf();
        }
    }

    public void q(int i10) {
        if (i10 != this.f118570l) {
            this.f118570l = i10;
            invalidateSelf();
        }
    }

    public void r(float f10) {
        if (f10 != this.f118563e) {
            this.f118563e = f10;
            invalidateSelf();
        }
    }

    public void s(boolean z10) {
        if (this.f118564f != z10) {
            this.f118564f = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f118559a.getAlpha()) {
            this.f118559a.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f118559a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@w(from = 0.0d, to = 1.0d) float f10) {
        if (this.f118568j != f10) {
            this.f118568j = f10;
            invalidateSelf();
        }
    }

    public void t(boolean z10) {
        if (this.f118567i != z10) {
            this.f118567i = z10;
            invalidateSelf();
        }
    }
}

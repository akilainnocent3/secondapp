package sh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.k;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final boolean f135324k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f135325l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f135326m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f135327n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f135328o = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f135329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f135330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Path f135331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Paint f135332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Paint f135333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public g.e f135334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Drawable f135335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Paint f135336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f135337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f135338j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void b(Canvas canvas);

        boolean c();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(a aVar) {
        this.f135329a = aVar;
        View view = (View) aVar;
        this.f135330b = view;
        view.setWillNotDraw(false);
        this.f135331c = new Path();
        this.f135332d = new Paint(7);
        Paint paint = new Paint(1);
        this.f135333e = paint;
        paint.setColor(0);
    }

    public void a() {
        if (f135328o == 0) {
            this.f135337i = true;
            this.f135338j = false;
            this.f135330b.buildDrawingCache();
            Bitmap drawingCache = this.f135330b.getDrawingCache();
            if (drawingCache == null && this.f135330b.getWidth() != 0 && this.f135330b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f135330b.getWidth(), this.f135330b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f135330b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f135332d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f135337i = false;
            this.f135338j = true;
        }
    }

    public void b() {
        if (f135328o == 0) {
            this.f135338j = false;
            this.f135330b.destroyDrawingCache();
            this.f135332d.setShader(null);
            this.f135330b.invalidate();
        }
    }

    public void c(@NonNull Canvas canvas) {
        Canvas canvas2;
        if (p()) {
            int i10 = f135328o;
            if (i10 == 0) {
                canvas2 = canvas;
                g.e eVar = this.f135334f;
                canvas2.drawCircle(eVar.f135346a, eVar.f135347b, eVar.f135348c, this.f135332d);
                if (r()) {
                    g.e eVar2 = this.f135334f;
                    canvas2.drawCircle(eVar2.f135346a, eVar2.f135347b, eVar2.f135348c, this.f135333e);
                }
            } else if (i10 == 1) {
                canvas2 = canvas;
                int iSave = canvas2.save();
                canvas2.clipPath(this.f135331c);
                this.f135329a.b(canvas2);
                if (r()) {
                    canvas2.drawRect(0.0f, 0.0f, this.f135330b.getWidth(), this.f135330b.getHeight(), this.f135333e);
                }
                canvas2.restoreToCount(iSave);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Unsupported strategy " + i10);
                }
                this.f135329a.b(canvas);
                if (r()) {
                    canvas.drawRect(0.0f, 0.0f, this.f135330b.getWidth(), this.f135330b.getHeight(), this.f135333e);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
            }
        } else {
            canvas2 = canvas;
            this.f135329a.b(canvas2);
            if (r()) {
                canvas2.drawRect(0.0f, 0.0f, this.f135330b.getWidth(), this.f135330b.getHeight(), this.f135333e);
            }
        }
        f(canvas2);
    }

    public final void d(@NonNull Canvas canvas, int i10, float f10) {
        this.f135336h.setColor(i10);
        this.f135336h.setStrokeWidth(f10);
        g.e eVar = this.f135334f;
        canvas.drawCircle(eVar.f135346a, eVar.f135347b, eVar.f135348c - (f10 / 2.0f), this.f135336h);
    }

    public final void e(@NonNull Canvas canvas) {
        this.f135329a.b(canvas);
        if (r()) {
            g.e eVar = this.f135334f;
            canvas.drawCircle(eVar.f135346a, eVar.f135347b, eVar.f135348c, this.f135333e);
        }
        if (p()) {
            d(canvas, -16777216, 10.0f);
            d(canvas, p1.a.f120313c, 5.0f);
        }
        f(canvas);
    }

    public final void f(@NonNull Canvas canvas) {
        if (q()) {
            Rect bounds = this.f135335g.getBounds();
            float fWidth = this.f135334f.f135346a - (bounds.width() / 2.0f);
            float fHeight = this.f135334f.f135347b - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.f135335g.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    @Nullable
    public Drawable g() {
        return this.f135335g;
    }

    @k
    public int h() {
        return this.f135333e.getColor();
    }

    public final float i(@NonNull g.e eVar) {
        return fi.a.b(eVar.f135346a, eVar.f135347b, 0.0f, 0.0f, this.f135330b.getWidth(), this.f135330b.getHeight());
    }

    @Nullable
    public g.e j() {
        g.e eVar = this.f135334f;
        if (eVar == null) {
            return null;
        }
        g.e eVar2 = new g.e(eVar);
        if (eVar2.a()) {
            eVar2.f135348c = i(eVar2);
        }
        return eVar2;
    }

    public final void k() {
        if (f135328o == 1) {
            this.f135331c.rewind();
            g.e eVar = this.f135334f;
            if (eVar != null) {
                this.f135331c.addCircle(eVar.f135346a, eVar.f135347b, eVar.f135348c, Path.Direction.CW);
            }
        }
        this.f135330b.invalidate();
    }

    public boolean l() {
        return this.f135329a.c() && !p();
    }

    public void m(@Nullable Drawable drawable) {
        this.f135335g = drawable;
        this.f135330b.invalidate();
    }

    public void n(@k int i10) {
        this.f135333e.setColor(i10);
        this.f135330b.invalidate();
    }

    public void o(@Nullable g.e eVar) {
        if (eVar == null) {
            this.f135334f = null;
        } else {
            g.e eVar2 = this.f135334f;
            if (eVar2 == null) {
                this.f135334f = new g.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (fi.a.e(eVar.f135348c, i(eVar), 1.0E-4f)) {
                this.f135334f.f135348c = Float.MAX_VALUE;
            }
        }
        k();
    }

    public final boolean p() {
        g.e eVar = this.f135334f;
        boolean z10 = eVar == null || eVar.a();
        if (f135328o == 0) {
            return !z10 && this.f135338j;
        }
        return !z10;
    }

    public final boolean q() {
        return (this.f135337i || this.f135335g == null || this.f135334f == null) ? false : true;
    }

    public final boolean r() {
        return (this.f135337i || Color.alpha(this.f135333e.getColor()) == 0) ? false : true;
    }
}

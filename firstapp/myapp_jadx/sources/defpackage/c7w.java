package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c7w extends Drawable implements Animatable {
    public float A;
    public float B;
    public boolean C;
    public long D;
    public long E;
    public qg0 G;
    public Picture H;
    public boolean J;
    public final Movie a;
    public final Bitmap.Config b;
    public final vy60 c;
    public Canvas v;
    public Bitmap w;
    public final Paint d = new Paint(3);
    public final ArrayList e = new ArrayList();
    public final Rect f = new Rect();
    public final Rect i = new Rect();
    public float y = 1.0f;
    public float z = 1.0f;
    public int F = -1;
    public lg10 I = lg10.a;

    public c7w(Movie movie, Bitmap.Config config, vy60 vy60Var) {
        this.a = movie;
        this.b = config;
        this.c = vy60Var;
        if (ze4.b(config)) {
            hb5.a("Bitmap config must not be hardware.");
            throw null;
        }
    }

    public final void a(Canvas canvas) {
        Paint paint = this.d;
        Canvas canvas2 = this.v;
        Bitmap bitmap = this.w;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f = this.y;
            canvas2.scale(f, f);
            this.a.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.H;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.A, this.B);
                float f2 = this.z;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(iSave);
            throw th;
        }
    }

    public final void b(Rect rect) {
        Rect rect2 = this.f;
        if (rect2.equals(rect)) {
            return;
        }
        rect2.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Movie movie = this.a;
        int iWidth2 = movie.width();
        int iHeight2 = movie.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        vy60 vy60Var = this.c;
        double dB = x4d.b(iWidth2, iHeight2, iWidth, iHeight, vy60Var);
        if (!this.J && dB > 1.0d) {
            dB = 1.0d;
        }
        float f = (float) dB;
        this.y = f;
        int i = (int) (iWidth2 * f);
        int i2 = (int) (f * iHeight2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, this.b);
        Bitmap bitmap = this.w;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.w = bitmapCreateBitmap;
        this.v = new Canvas(bitmapCreateBitmap);
        if (this.J) {
            this.z = 1.0f;
            this.A = 0.0f;
            this.B = 0.0f;
        } else {
            float fB = (float) x4d.b(i, i2, iWidth, iHeight, vy60Var);
            this.z = fB;
            this.A = ((iWidth - (i * fB)) / 2.0f) + rect.left;
            this.B = ((iHeight - (fB * i2)) / 2.0f) + rect.top;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Movie movie = this.a;
        int iDuration = movie.duration();
        if (iDuration == 0) {
            iDuration = 0;
            z = false;
        } else {
            if (this.C) {
                this.E = SystemClock.uptimeMillis();
            }
            int i = (int) (this.E - this.D);
            int i2 = i / iDuration;
            int i3 = this.F;
            z = i3 == -1 || i2 <= i3;
            if (z) {
                iDuration = i - (i2 * iDuration);
            }
        }
        movie.setTime(iDuration);
        if (this.J) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.i;
            rect.set(0, 0, width, height);
            b(rect);
            int iSave = canvas.save();
            try {
                float f = 1.0f / this.y;
                canvas.scale(f, f);
                a(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            b(getBounds());
            a(canvas);
        }
        if (this.C && z) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.width();
    }

    @Override // android.graphics.drawable.Drawable
    @fae
    public final int getOpacity() {
        if (this.d.getAlpha() != 255) {
            return -3;
        }
        lg10 lg10Var = this.I;
        if (lg10Var != lg10.b) {
            return (lg10Var == lg10.a && this.a.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.C;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            kb5.a(hce0.a(i, "Invalid alpha: "));
        } else {
            this.d.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.C) {
            return;
        }
        this.C = true;
        this.D = SystemClock.uptimeMillis();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zd0) arrayList.get(i)).b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.C) {
            this.C = false;
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((zd0) arrayList.get(i)).a(this);
            }
        }
    }
}

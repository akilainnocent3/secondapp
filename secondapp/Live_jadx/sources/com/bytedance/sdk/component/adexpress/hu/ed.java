package com.bytedance.sdk.component.adexpress.hu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import fc.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class ed extends ImageView {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private boolean f34287ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private boolean f34288hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private boolean f34289hv;
    private Movie hww;
    private boolean khx;
    private int nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private volatile boolean f34290ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private float f34291ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private float f34292rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f34293sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private long f34294tq;
    private float vgm;
    private int vhb;
    private AnimatedImageDrawable vy;

    public ed(Context context) {
        super(context);
        this.f34289hv = Build.VERSION.SDK_INT >= 28;
        this.f34288hu = false;
        this.f34287ed = true;
        this.khx = true;
        hww();
    }

    private void sd() {
        if (this.hww == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f34294tq == 0) {
            this.f34294tq = jUptimeMillis;
        }
        int iDuration = this.hww.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        if (this.khx || Math.abs(iDuration - this.f34293sd) >= 60) {
            this.f34293sd = (int) ((jUptimeMillis - this.f34294tq) % ((long) iDuration));
        } else {
            this.f34293sd = iDuration;
            this.f34290ny = true;
        }
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && fc.a.a(drawable)) {
            AnimatedImageDrawable animatedImageDrawableA = b.a(drawable);
            this.vy = animatedImageDrawableA;
            if (!this.f34290ny) {
                animatedImageDrawableA.start();
            }
            if (!this.khx) {
                animatedImageDrawableA.setRepeatCount(0);
            }
        }
        tq();
    }

    private void tq() {
        if (this.hww == null || this.f34289hv || !this.f34287ed) {
            return;
        }
        postInvalidateOnAnimation();
    }

    public void hww() {
        if (this.f34289hv) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.hww == null || this.f34289hv) {
            super.onDraw(canvas);
            return;
        }
        try {
            if (this.f34290ny) {
                hww(canvas);
                return;
            }
            sd();
            hww(canvas);
            tq();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.hww != null && !this.f34289hv) {
            this.vgm = (getWidth() - this.nod) / 2.0f;
            this.f34291ok = (getHeight() - this.vhb) / 2.0f;
        }
        this.f34287ed = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i10, i11);
        if (this.f34289hv || (movie = this.hww) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.hww.height();
        float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(i10) == 0 || iWidth <= (size2 = View.MeasureSpec.getSize(i10))) ? 1.0f : iWidth / size2, (View.MeasureSpec.getMode(i11) == 0 || iHeight <= (size = View.MeasureSpec.getSize(i11))) ? 1.0f : iHeight / size);
        this.f34292rs = fMax;
        int i12 = (int) (iWidth * fMax);
        this.nod = i12;
        int i13 = (int) (iHeight * fMax);
        this.vhb = i13;
        setMeasuredDimension(i12, i13);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        if (this.hww != null) {
            this.f34287ed = i10 == 1;
            tq();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (this.hww != null) {
            this.f34287ed = i10 == 0;
            tq();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.hww != null) {
            this.f34287ed = i10 == 0;
            tq();
        }
    }

    public void setRepeatConfig(boolean z10) {
        AnimatedImageDrawable animatedImageDrawable;
        this.khx = z10;
        if (z10) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.vy) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception unused) {
        }
    }

    private void hww(Canvas canvas) {
        Movie movie = this.hww;
        if (movie == null) {
            return;
        }
        movie.setTime(this.f34293sd);
        float f10 = this.f34292rs;
        if (f10 == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.hww.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f10, f10);
            Movie movie2 = this.hww;
            float f11 = this.vgm;
            float f12 = this.f34292rs;
            movie2.draw(canvas, f11 / f12, this.f34291ok / f12);
        }
        canvas.restore();
    }
}

package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class ProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Runnable f67529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f67530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f67531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f67532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f67533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f67534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f67535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Handler f67536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Drawable f67537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f67538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f67539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f67540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f67541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f67542n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f67543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f67544p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Rect f67545q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f67546r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f67547s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f67548t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f67549u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f67550v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f67551w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f67552x;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar.this.invalidate();
        }
    }

    public ProgressBar(Context context) {
        super(context);
        this.f67529a = new a();
        this.f67535g = 25L;
        this.f67536h = new Handler(Looper.getMainLooper());
        this.f67539k = false;
        this.f67542n = 0.95f;
        this.f67543o = false;
        this.f67545q = new Rect();
        a(context);
    }

    private void a(Context context) {
        setWillNotDraw(false);
    }

    private float getVelocity() {
        if (this.f67548t) {
            return this.f67540l ? 1.0f : 0.4f;
        }
        if (this.f67552x < 2000) {
            if (this.f67550v == 1) {
                return this.f67540l ? 1.0f : 0.4f;
            }
            if (this.f67549u == 1) {
                return this.f67540l ? 0.4f : 0.2f;
            }
            if (this.f67540l) {
                return 0.2f;
            }
        }
        return 0.05f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f67539k) {
            this.f67539k = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f67543o ? 0L : jCurrentTimeMillis - this.f67541m;
        this.f67532d = Math.abs(j10 / 1000.0f);
        this.f67541m = jCurrentTimeMillis;
        this.f67552x += j10;
        float velocity = getVelocity();
        this.f67531c = velocity;
        float f10 = this.f67530b + (velocity * this.f67532d);
        this.f67530b = f10;
        if (!this.f67548t) {
            float f11 = this.f67542n;
            if (f10 > f11) {
                this.f67530b = f11;
            }
        }
        this.f67545q.right = (int) (this.f67530b * this.f67547s);
        this.f67536h.removeCallbacksAndMessages(null);
        this.f67536h.postDelayed(this.f67529a, this.f67535g);
        super.draw(canvas);
        a(canvas, this.f67532d);
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z10) {
        return null;
    }

    public float getProgress() {
        return this.f67530b;
    }

    public void initResource(boolean z10) {
        if (z10 || (this.f67537i == null && this.f67544p == null && this.f67546r == null && this.f67533e == null)) {
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f67537i = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f67537i.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f67544p = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f67544p.getIntrinsicHeight());
            }
            this.f67546r = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f67533e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f67547s = getMeasuredWidth();
    }

    public void onThemeChange() {
        if (this.f67539k) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Drawable drawable = this.f67537i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f67544p;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public void setPaused(boolean z10) {
        this.f67543o = z10;
        if (z10) {
            return;
        }
        this.f67541m = System.currentTimeMillis();
    }

    public void setProgress(float f10, boolean z10) {
        if (!z10 || f10 < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    public void setProgressState(int i10) {
        if (i10 == 5) {
            this.f67549u = 1;
            this.f67550v = 0;
            this.f67551w = 0;
            this.f67552x = 0L;
            return;
        }
        if (i10 == 6) {
            this.f67550v = 1;
            if (this.f67551w == 1) {
                startEndAnimation();
            }
            this.f67552x = 0L;
            return;
        }
        if (i10 == 7) {
            startEndAnimation();
        } else {
            if (i10 != 8) {
                return;
            }
            this.f67551w = 1;
            if (this.f67550v == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public void setVisible(boolean z10) {
        if (!z10) {
            setVisibility(4);
            return;
        }
        this.f67540l = true;
        this.f67541m = System.currentTimeMillis();
        this.f67532d = 0.0f;
        this.f67552x = 0L;
        this.f67548t = false;
        this.f67534f = 0.0f;
        this.f67530b = 0.0f;
        this.f67547s = getMeasuredWidth();
        this.f67543o = false;
        this.f67549u = 0;
        this.f67550v = 0;
        this.f67551w = 0;
        Drawable drawable = this.f67537i;
        if (drawable != null) {
            this.f67538j = -drawable.getIntrinsicWidth();
        } else {
            this.f67538j = 0;
        }
        Drawable drawable2 = this.f67546r;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
        }
        Drawable drawable3 = this.f67533e;
        if (drawable3 != null) {
            drawable3.setAlpha(255);
        }
        Drawable drawable4 = this.f67544p;
        if (drawable4 != null) {
            drawable4.setAlpha(255);
        }
        setVisibility(0);
        invalidate();
    }

    public void startEndAnimation() {
        if (this.f67548t) {
            return;
        }
        this.f67548t = true;
        this.f67534f = 0.0f;
    }

    private void a(Canvas canvas, float f10) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f67548t) {
            float f11 = this.f67534f;
            float f12 = this.f67547s * 0.5f;
            int i10 = (int) ((1.0f - (f11 / f12)) * 255.0f);
            if (i10 < 0) {
                i10 = 0;
            }
            if (f11 > f12) {
                setVisible(false);
            }
            Drawable drawable3 = this.f67546r;
            if (drawable3 != null) {
                drawable3.setAlpha(i10);
            }
            Drawable drawable4 = this.f67533e;
            if (drawable4 != null) {
                drawable4.setAlpha(i10);
            }
            Drawable drawable5 = this.f67544p;
            if (drawable5 != null) {
                drawable5.setAlpha(i10);
            }
            canvas.save();
            canvas.translate(this.f67534f, 0.0f);
        }
        if (this.f67546r != null && this.f67544p != null) {
            int iWidth = (int) (this.f67545q.width() - (this.f67544p.getIntrinsicWidth() * 0.05f));
            Drawable drawable6 = this.f67546r;
            drawable6.setBounds(0, 0, iWidth, drawable6.getIntrinsicHeight());
            this.f67546r.draw(canvas);
        }
        if (this.f67548t && (drawable2 = this.f67533e) != null && this.f67544p != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f67533e;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f67533e.draw(canvas);
            canvas.restore();
        }
        if (this.f67544p != null) {
            canvas.save();
            canvas.translate(this.f67545q.width() - getWidth(), 0.0f);
            this.f67544p.draw(canvas);
            canvas.restore();
        }
        if (!this.f67548t && Math.abs(this.f67530b - this.f67542n) < 1.0E-5f && (drawable = this.f67537i) != null) {
            int i11 = (int) (this.f67538j + (f10 * 0.2f * this.f67547s));
            this.f67538j = i11;
            if (i11 + drawable.getIntrinsicWidth() >= this.f67545q.width()) {
                this.f67538j = -this.f67537i.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f67538j, 0.0f);
            this.f67537i.draw(canvas);
            canvas.restore();
        }
        if (this.f67548t) {
            canvas.restore();
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67529a = new a();
        this.f67535g = 25L;
        this.f67536h = new Handler(Looper.getMainLooper());
        this.f67539k = false;
        this.f67542n = 0.95f;
        this.f67543o = false;
        this.f67545q = new Rect();
        a(context);
    }

    public void setProgressBarListener(c cVar) {
    }
}

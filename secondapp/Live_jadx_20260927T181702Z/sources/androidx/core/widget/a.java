package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import f2.z1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    public static final int A = 1;
    public static final int B = 315;
    public static final int C = 1575;
    public static final float D = Float.MAX_VALUE;
    public static final float E = 0.2f;
    public static final float F = 1.0f;
    public static final int G = ViewConfiguration.getTapTimeout();
    public static final int H = 500;
    public static final int I = 500;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f9315s = 0.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f9316t = Float.MAX_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f9317u = 0.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f9318v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f9319w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f9320x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f9321y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f9322z = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f9325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f9326e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9330i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9339r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0045a f9323b = new C0045a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f9324c = new AccelerateInterpolator();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f9327f = {0.0f, 0.0f};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f9328g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f9331j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f9332k = {0.0f, 0.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float[] f9333l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0045a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f9342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f9343d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f9349j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f9350k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f9344e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f9348i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f9345f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9346g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9347h = 0;

        public void a() {
            if (this.f9345f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f9345f;
            this.f9345f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f9346g = (int) (this.f9342c * f10);
            this.f9347h = (int) (f10 * this.f9343d);
        }

        public int b() {
            return this.f9346g;
        }

        public int c() {
            return this.f9347h;
        }

        public int d() {
            float f10 = this.f9342c;
            return (int) (f10 / Math.abs(f10));
        }

        public final float e(long j10) {
            long j11 = this.f9344e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f9348i;
            if (j12 < 0 || j10 < j12) {
                return a.e((j10 - j11) / this.f9340a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f9349j;
            return (1.0f - f10) + (f10 * a.e((j10 - j12) / this.f9350k, 0.0f, 1.0f));
        }

        public int f() {
            float f10 = this.f9343d;
            return (int) (f10 / Math.abs(f10));
        }

        public final float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public boolean h() {
            return this.f9348i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f9348i + ((long) this.f9350k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f9350k = a.f((int) (jCurrentAnimationTimeMillis - this.f9344e), 0, this.f9341b);
            this.f9349j = e(jCurrentAnimationTimeMillis);
            this.f9348i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f9341b = i10;
        }

        public void k(int i10) {
            this.f9340a = i10;
        }

        public void l(float f10, float f11) {
            this.f9342c = f10;
            this.f9343d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f9344e = jCurrentAnimationTimeMillis;
            this.f9348i = -1L;
            this.f9345f = jCurrentAnimationTimeMillis;
            this.f9349j = 0.5f;
            this.f9346g = 0;
            this.f9347h = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f9337p) {
                if (aVar.f9335n) {
                    aVar.f9335n = false;
                    aVar.f9323b.m();
                }
                C0045a c0045a = a.this.f9323b;
                if (c0045a.h() || !a.this.x()) {
                    a.this.f9337p = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f9336o) {
                    aVar2.f9336o = false;
                    aVar2.c();
                }
                c0045a.a();
                a.this.l(c0045a.b(), c0045a.c());
                z1.u1(a.this.f9325d, this);
            }
        }
    }

    public a(@NonNull View view) {
        this.f9325d = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        r(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        s(f12, f12);
        n(1);
        q(Float.MAX_VALUE, Float.MAX_VALUE);
        v(0.2f, 0.2f);
        w(1.0f, 1.0f);
        m(G);
        u(500);
        t(500);
    }

    public static float e(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    public static int f(int i10, int i11, int i12) {
        if (i10 > i12) {
            return i12;
        }
        return i10 < i11 ? i11 : i10;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    public void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f9325d.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f9327f[i10], f11, this.f9328g[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f9331j[i10];
        float f14 = this.f9332k[i10];
        float f15 = this.f9333l[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    public final float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f9329h;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f9337p && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f9324c.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f9324c.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public boolean i() {
        return this.f9338q;
    }

    public boolean j() {
        return this.f9339r;
    }

    public final void k() {
        if (this.f9335n) {
            this.f9337p = false;
        } else {
            this.f9323b.i();
        }
    }

    public abstract void l(int i10, int i11);

    @NonNull
    public a m(int i10) {
        this.f9330i = i10;
        return this;
    }

    @NonNull
    public a n(int i10) {
        this.f9329h = i10;
        return this;
    }

    public a o(boolean z10) {
        if (this.f9338q && !z10) {
            k();
        }
        this.f9338q = z10;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f9338q) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                k();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    k();
                }
            }
            return !this.f9339r && this.f9337p;
        }
        this.f9336o = true;
        this.f9334m = false;
        this.f9323b.l(d(0, motionEvent.getX(), view.getWidth(), this.f9325d.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f9325d.getHeight()));
        if (!this.f9337p && x()) {
            y();
        }
        if (this.f9339r) {
        }
    }

    public a p(boolean z10) {
        this.f9339r = z10;
        return this;
    }

    @NonNull
    public a q(float f10, float f11) {
        float[] fArr = this.f9328g;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    @NonNull
    public a r(float f10, float f11) {
        float[] fArr = this.f9333l;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    @NonNull
    public a s(float f10, float f11) {
        float[] fArr = this.f9332k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    @NonNull
    public a t(int i10) {
        this.f9323b.j(i10);
        return this;
    }

    @NonNull
    public a u(int i10) {
        this.f9323b.k(i10);
        return this;
    }

    @NonNull
    public a v(float f10, float f11) {
        float[] fArr = this.f9327f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    @NonNull
    public a w(float f10, float f11) {
        float[] fArr = this.f9331j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public boolean x() {
        C0045a c0045a = this.f9323b;
        int iF = c0045a.f();
        int iD = c0045a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }

    public final void y() {
        int i10;
        if (this.f9326e == null) {
            this.f9326e = new b();
        }
        this.f9337p = true;
        this.f9335n = true;
        if (this.f9334m || (i10 = this.f9330i) <= 0) {
            this.f9326e.run();
        } else {
            z1.v1(this.f9325d, this.f9326e, i10);
        }
        this.f9334m = true;
    }
}

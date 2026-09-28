package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class hkd0 extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, Drawable.Callback {
    public static final Rect H = new Rect();
    public static final c I = new c("rotateX");
    public static final d J = new d("rotate");
    public static final e K = new e("rotateY");
    public static final h L;
    public static final i M;
    public static final k N;
    public static final a O;
    public static final b P;
    public float A;
    public float B;
    public ValueAnimator C;
    public float d;
    public float e;
    public int f;
    public int i;
    public int v;
    public int w;
    public int y;
    public int z;
    public float a = 1.0f;
    public float b = 1.0f;
    public float c = 1.0f;
    public int D = 255;
    public Rect E = H;
    public final Camera F = new Camera();
    public final Matrix G = new Matrix();

    public static class a extends gxh<hkd0> {
        @Override // defpackage.gxh
        public final void a(hkd0 hkd0Var, float f) {
            hkd0Var.g(f);
        }

        @Override // android.util.Property
        public final Float get(Object obj) {
            return Float.valueOf(((hkd0) obj).a);
        }
    }

    public static class b extends nwo<hkd0> {
        @Override // defpackage.nwo
        public final void a(int i, Object obj) {
            ((hkd0) obj).setAlpha(i);
        }

        @Override // android.util.Property
        public final Integer get(Object obj) {
            return Integer.valueOf(((hkd0) obj).D);
        }
    }

    public static class c extends nwo<hkd0> {
        @Override // defpackage.nwo
        public final void a(int i, Object obj) {
            ((hkd0) obj).i = i;
        }

        @Override // android.util.Property
        public final Integer get(Object obj) {
            return Integer.valueOf(((hkd0) obj).i);
        }
    }

    public static class d extends nwo<hkd0> {
        @Override // defpackage.nwo
        public final void a(int i, Object obj) {
            ((hkd0) obj).z = i;
        }

        @Override // android.util.Property
        public final Integer get(Object obj) {
            return Integer.valueOf(((hkd0) obj).z);
        }
    }

    public static class e extends nwo<hkd0> {
        @Override // defpackage.nwo
        public final void a(int i, Object obj) {
            ((hkd0) obj).v = i;
        }

        @Override // android.util.Property
        public final Integer get(Object obj) {
            return Integer.valueOf(((hkd0) obj).v);
        }
    }

    public static class f extends nwo<hkd0> {
        @Override // defpackage.nwo
        public final void a(int i, Object obj) {
            ((hkd0) obj).w = i;
        }

        @Override // android.util.Property
        public final Integer get(Object obj) {
            return Integer.valueOf(((hkd0) obj).w);
        }
    }

    public static class g extends nwo<hkd0> {
        @Override // defpackage.nwo
        public final void a(int i, Object obj) {
            ((hkd0) obj).y = i;
        }

        @Override // android.util.Property
        public final Integer get(Object obj) {
            return Integer.valueOf(((hkd0) obj).y);
        }
    }

    public static class h extends gxh<hkd0> {
        @Override // defpackage.gxh
        public final void a(hkd0 hkd0Var, float f) {
            hkd0Var.A = f;
        }

        @Override // android.util.Property
        public final Float get(Object obj) {
            return Float.valueOf(((hkd0) obj).A);
        }
    }

    public static class i extends gxh<hkd0> {
        @Override // defpackage.gxh
        public final void a(hkd0 hkd0Var, float f) {
            hkd0Var.B = f;
        }

        @Override // android.util.Property
        public final Float get(Object obj) {
            return Float.valueOf(((hkd0) obj).B);
        }
    }

    public static class j extends gxh<hkd0> {
        @Override // defpackage.gxh
        public final void a(hkd0 hkd0Var, float f) {
            hkd0Var.b = f;
        }

        @Override // android.util.Property
        public final Float get(Object obj) {
            return Float.valueOf(((hkd0) obj).b);
        }
    }

    public static class k extends gxh<hkd0> {
        @Override // defpackage.gxh
        public final void a(hkd0 hkd0Var, float f) {
            hkd0Var.c = f;
        }

        @Override // android.util.Property
        public final Float get(Object obj) {
            return Float.valueOf(((hkd0) obj).c);
        }
    }

    static {
        new f("translateX");
        new g("translateY");
        L = new h("translateXPercentage");
        M = new i("translateYPercentage");
        new j("scaleX");
        N = new k("scaleY");
        O = new a("scale");
        P = new b("alpha");
    }

    public static Rect a(Rect rect) {
        int iMin = Math.min(rect.width(), rect.height());
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        int i2 = iMin / 2;
        return new Rect(iCenterX - i2, iCenterY - i2, iCenterX + i2, iCenterY + i2);
    }

    public abstract void b(Canvas canvas);

    public abstract int c();

    public abstract ValueAnimator d();

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iWidth = this.w;
        if (iWidth == 0) {
            iWidth = (int) (getBounds().width() * this.A);
        }
        int iHeight = this.y;
        if (iHeight == 0) {
            iHeight = (int) (getBounds().height() * this.B);
        }
        canvas.translate(iWidth, iHeight);
        canvas.scale(this.b, this.c, this.d, this.e);
        canvas.rotate(this.z, this.d, this.e);
        if (this.i != 0 || this.v != 0) {
            Camera camera = this.F;
            camera.save();
            camera.rotateX(this.i);
            camera.rotateY(this.v);
            Matrix matrix = this.G;
            camera.getMatrix(matrix);
            matrix.preTranslate(-this.d, -this.e);
            matrix.postTranslate(this.d, this.e);
            camera.restore();
            canvas.concat(matrix);
        }
        b(canvas);
    }

    public abstract void e(int i2);

    public final void f(int i2, int i3, int i4, int i5) {
        Rect rect = new Rect(i2, i3, i4, i5);
        this.E = rect;
        this.d = rect.centerX();
        this.e = this.E.centerY();
    }

    public final void g(float f2) {
        this.a = f2;
        this.b = f2;
        this.c = f2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.D;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ValueAnimator valueAnimator = this.C;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.D = i2;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            ValueAnimator valueAnimatorD = this.C;
            if (valueAnimatorD == null) {
                valueAnimatorD = d();
                this.C = valueAnimatorD;
            }
            if (valueAnimatorD != null) {
                valueAnimatorD.addUpdateListener(this);
                this.C.setStartDelay(this.f);
            }
            ValueAnimator valueAnimator2 = this.C;
            this.C = valueAnimator2;
            if (valueAnimator2 == null) {
                return;
            }
            if (!valueAnimator2.isStarted()) {
                valueAnimator2.start();
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.C.removeAllUpdateListeners();
        this.C.end();
        this.a = 1.0f;
        this.i = 0;
        this.v = 0;
        this.w = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0.0f;
        this.B = 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
    }
}

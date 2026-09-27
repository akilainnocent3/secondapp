package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import e2.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class b extends Drawable implements Animatable {
    public static final float A = 0.20999998f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f19328j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f19329k = 11.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f19330l = 3.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f19331m = 12;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f19332n = 6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f19333o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f19334p = 7.5f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f19335q = 2.5f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f19336r = 10;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f19337s = 5;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f19339u = 0.75f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final float f19340v = 0.5f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f19341w = 1332;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final float f19342x = 216.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final float f19343y = 0.8f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final float f19344z = 0.01f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f19345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f19346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Resources f19347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Animator f19348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f19349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Interpolator f19326h = new LinearInterpolator();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Interpolator f19327i = new r3.b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f19338t = {-16777216};

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f19351b;

        public a(d dVar) {
            this.f19351b = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.G(fFloatValue, this.f19351b);
            b.this.d(fFloatValue, this.f19351b, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f19355a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Paint f19356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f19357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Paint f19358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f19359e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f19360f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f19361g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f19362h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f19363i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f19364j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f19365k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f19366l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f19367m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f19368n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Path f19369o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f19370p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f19371q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f19372r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f19373s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19374t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f19375u;

        public d() {
            Paint paint = new Paint();
            this.f19356b = paint;
            Paint paint2 = new Paint();
            this.f19357c = paint2;
            Paint paint3 = new Paint();
            this.f19358d = paint3;
            this.f19359e = 0.0f;
            this.f19360f = 0.0f;
            this.f19361g = 0.0f;
            this.f19362h = 5.0f;
            this.f19370p = 1.0f;
            this.f19374t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void A(int i10) {
            this.f19358d.setColor(i10);
        }

        public void B(float f10) {
            this.f19371q = f10;
        }

        public void C(int i10) {
            this.f19375u = i10;
        }

        public void D(ColorFilter colorFilter) {
            this.f19356b.setColorFilter(colorFilter);
        }

        public void E(int i10) {
            this.f19364j = i10;
            this.f19375u = this.f19363i[i10];
        }

        public void F(@NonNull int[] iArr) {
            this.f19363i = iArr;
            E(0);
        }

        public void G(float f10) {
            this.f19360f = f10;
        }

        public void H(float f10) {
            this.f19361g = f10;
        }

        public void I(boolean z10) {
            if (this.f19368n != z10) {
                this.f19368n = z10;
            }
        }

        public void J(float f10) {
            this.f19359e = f10;
        }

        public void K(Paint.Cap cap) {
            this.f19356b.setStrokeCap(cap);
        }

        public void L(float f10) {
            this.f19362h = f10;
            this.f19356b.setStrokeWidth(f10);
        }

        public void M() {
            this.f19365k = this.f19359e;
            this.f19366l = this.f19360f;
            this.f19367m = this.f19361g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f19355a;
            float f10 = this.f19371q;
            float fMin = (this.f19362h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f19372r * this.f19370p) / 2.0f, this.f19362h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f19359e;
            float f12 = this.f19361g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f19360f + f12) * 360.0f) - f13;
            this.f19356b.setColor(this.f19375u);
            this.f19356b.setAlpha(this.f19374t);
            float f15 = this.f19362h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f19358d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f19356b);
            b(canvas, f13, f14, rectF);
        }

        public void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f19368n) {
                Path path = this.f19369o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f19369o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f19372r * this.f19370p) / 2.0f;
                this.f19369o.moveTo(0.0f, 0.0f);
                this.f19369o.lineTo(this.f19372r * this.f19370p, 0.0f);
                Path path3 = this.f19369o;
                float f13 = this.f19372r;
                float f14 = this.f19370p;
                path3.lineTo((f13 * f14) / 2.0f, this.f19373s * f14);
                this.f19369o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f19362h / 2.0f));
                this.f19369o.close();
                this.f19357c.setColor(this.f19375u);
                this.f19357c.setAlpha(this.f19374t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f19369o, this.f19357c);
                canvas.restore();
            }
        }

        public int c() {
            return this.f19374t;
        }

        public float d() {
            return this.f19373s;
        }

        public float e() {
            return this.f19370p;
        }

        public float f() {
            return this.f19372r;
        }

        public int g() {
            return this.f19358d.getColor();
        }

        public float h() {
            return this.f19371q;
        }

        public int[] i() {
            return this.f19363i;
        }

        public float j() {
            return this.f19360f;
        }

        public int k() {
            return this.f19363i[l()];
        }

        public int l() {
            return (this.f19364j + 1) % this.f19363i.length;
        }

        public float m() {
            return this.f19361g;
        }

        public boolean n() {
            return this.f19368n;
        }

        public float o() {
            return this.f19359e;
        }

        public int p() {
            return this.f19363i[this.f19364j];
        }

        public float q() {
            return this.f19366l;
        }

        public float r() {
            return this.f19367m;
        }

        public float s() {
            return this.f19365k;
        }

        public Paint.Cap t() {
            return this.f19356b.getStrokeCap();
        }

        public float u() {
            return this.f19362h;
        }

        public void v() {
            E(l());
        }

        public void w() {
            this.f19365k = 0.0f;
            this.f19366l = 0.0f;
            this.f19367m = 0.0f;
            J(0.0f);
            G(0.0f);
            H(0.0f);
        }

        public void x(int i10) {
            this.f19374t = i10;
        }

        public void y(float f10, float f11) {
            this.f19372r = (int) f10;
            this.f19373s = (int) f11;
        }

        public void z(float f10) {
            if (f10 != this.f19370p) {
                this.f19370p = f10;
            }
        }
    }

    public b(@NonNull Context context) {
        this.f19347d = ((Context) x.l(context)).getResources();
        d dVar = new d();
        this.f19345b = dVar;
        dVar.F(f19338t);
        D(2.5f);
        F();
    }

    public final void A(float f10, float f11, float f12, float f13) {
        d dVar = this.f19345b;
        float f14 = this.f19347d.getDisplayMetrics().density;
        dVar.L(f11 * f14);
        dVar.B(f10 * f14);
        dVar.E(0);
        dVar.y(f12 * f14, f13 * f14);
    }

    public void B(float f10, float f11) {
        this.f19345b.J(f10);
        this.f19345b.G(f11);
        invalidateSelf();
    }

    public void C(@NonNull Paint.Cap cap) {
        this.f19345b.K(cap);
        invalidateSelf();
    }

    public void D(float f10) {
        this.f19345b.L(f10);
        invalidateSelf();
    }

    public void E(int i10) {
        if (i10 == 0) {
            A(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            A(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void F() {
        d dVar = this.f19345b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(dVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f19326h);
        valueAnimatorOfFloat.addListener(new C0168b(dVar));
        this.f19348e = valueAnimatorOfFloat;
    }

    public void G(float f10, d dVar) {
        if (f10 > 0.75f) {
            dVar.C(e((f10 - 0.75f) / 0.25f, dVar.p(), dVar.k()));
        } else {
            dVar.C(dVar.p());
        }
    }

    public final void a(float f10, d dVar) {
        G(f10, dVar);
        float fFloor = (float) (Math.floor(dVar.r() / 0.8f) + 1.0d);
        dVar.J(dVar.s() + (((dVar.q() - 0.01f) - dVar.s()) * f10));
        dVar.G(dVar.q());
        dVar.H(dVar.r() + ((fFloor - dVar.r()) * f10));
    }

    public void d(float f10, d dVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f19350g) {
            a(f10, dVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fR = dVar.r();
            if (f10 < 0.5f) {
                interpolation = dVar.s();
                interpolation2 = (f19327i.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fS = dVar.s() + 0.79f;
                interpolation = fS - (((1.0f - f19327i.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fS;
            }
            float f11 = fR + (0.20999998f * f10);
            float f12 = (f10 + this.f19349f) * 216.0f;
            dVar.J(interpolation);
            dVar.G(interpolation2);
            dVar.H(f11);
            z(f12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f19346c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f19345b.a(canvas, bounds);
        canvas.restore();
    }

    public final int e(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f10))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f10))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f10))) << 8) | (i15 + ((int) (f10 * ((i11 & 255) - i15))));
    }

    public boolean f() {
        return this.f19345b.n();
    }

    public float g() {
        return this.f19345b.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19345b.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.f19345b.e();
    }

    public float i() {
        return this.f19345b.f();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f19348e.isRunning();
    }

    public int j() {
        return this.f19345b.g();
    }

    public float k() {
        return this.f19345b.h();
    }

    @NonNull
    public int[] l() {
        return this.f19345b.i();
    }

    public float m() {
        return this.f19345b.j();
    }

    public float n() {
        return this.f19345b.m();
    }

    public final float o() {
        return this.f19346c;
    }

    public float p() {
        return this.f19345b.o();
    }

    @NonNull
    public Paint.Cap q() {
        return this.f19345b.t();
    }

    public float r() {
        return this.f19345b.u();
    }

    public void s(float f10, float f11) {
        this.f19345b.y(f10, f11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f19345b.x(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19345b.D(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f19348e.cancel();
        this.f19345b.M();
        if (this.f19345b.j() != this.f19345b.o()) {
            this.f19350g = true;
            this.f19348e.setDuration(666L);
            this.f19348e.start();
        } else {
            this.f19345b.E(0);
            this.f19345b.w();
            this.f19348e.setDuration(1332L);
            this.f19348e.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f19348e.cancel();
        z(0.0f);
        this.f19345b.I(false);
        this.f19345b.E(0);
        this.f19345b.w();
        invalidateSelf();
    }

    public void t(boolean z10) {
        this.f19345b.I(z10);
        invalidateSelf();
    }

    public void u(float f10) {
        this.f19345b.z(f10);
        invalidateSelf();
    }

    public void v(int i10) {
        this.f19345b.A(i10);
        invalidateSelf();
    }

    public void w(float f10) {
        this.f19345b.B(f10);
        invalidateSelf();
    }

    public void x(@NonNull int... iArr) {
        this.f19345b.F(iArr);
        this.f19345b.E(0);
        invalidateSelf();
    }

    public void y(float f10) {
        this.f19345b.H(f10);
        invalidateSelf();
    }

    public final void z(float f10) {
        this.f19346c = f10;
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0168b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f19353b;

        public C0168b(d dVar) {
            this.f19353b = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.d(1.0f, this.f19353b, true);
            this.f19353b.M();
            this.f19353b.v();
            b bVar = b.this;
            if (!bVar.f19350g) {
                bVar.f19349f += 1.0f;
                return;
            }
            bVar.f19350g = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f19353b.I(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f19349f = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}

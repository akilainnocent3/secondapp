package hb;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import k.w;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class a<T> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f88077q = -3987645.8f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f88078r = 784923401;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final com.airbnb.lottie.k f88079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final T f88080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public T f88081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Interpolator f88082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Interpolator f88083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Interpolator f88084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f88085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Float f88086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f88087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f88088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f88089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f88090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f88091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f88092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f88093o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f88094p;

    public a(com.airbnb.lottie.k kVar, @Nullable T t10, @Nullable T t11, @Nullable Interpolator interpolator, float f10, @Nullable Float f11) {
        this.f88087i = -3987645.8f;
        this.f88088j = -3987645.8f;
        this.f88089k = f88078r;
        this.f88090l = f88078r;
        this.f88091m = Float.MIN_VALUE;
        this.f88092n = Float.MIN_VALUE;
        this.f88093o = null;
        this.f88094p = null;
        this.f88079a = kVar;
        this.f88080b = t10;
        this.f88081c = t11;
        this.f88082d = interpolator;
        this.f88083e = null;
        this.f88084f = null;
        this.f88085g = f10;
        this.f88086h = f11;
    }

    public boolean a(@w(from = 0.0d, to = 1.0d) float f10) {
        return f10 >= f() && f10 < c();
    }

    public a<T> b(T t10, T t11) {
        return new a<>(t10, t11);
    }

    public float c() {
        if (this.f88079a == null) {
            return 1.0f;
        }
        if (this.f88092n == Float.MIN_VALUE) {
            if (this.f88086h == null) {
                this.f88092n = 1.0f;
            } else {
                float f10 = f();
                this.f88092n = (float) (((double) f10) + (((double) (this.f88086h.floatValue() - this.f88085g)) / ((double) this.f88079a.e())));
            }
        }
        return this.f88092n;
    }

    public float d() {
        if (this.f88088j == -3987645.8f) {
            this.f88088j = ((Float) this.f88081c).floatValue();
        }
        return this.f88088j;
    }

    public int e() {
        if (this.f88090l == 784923401) {
            this.f88090l = ((Integer) this.f88081c).intValue();
        }
        return this.f88090l;
    }

    public float f() {
        com.airbnb.lottie.k kVar = this.f88079a;
        if (kVar == null) {
            return 0.0f;
        }
        if (this.f88091m == Float.MIN_VALUE) {
            this.f88091m = (this.f88085g - kVar.r()) / this.f88079a.e();
        }
        return this.f88091m;
    }

    public float g() {
        if (this.f88087i == -3987645.8f) {
            this.f88087i = ((Float) this.f88080b).floatValue();
        }
        return this.f88087i;
    }

    public int h() {
        if (this.f88089k == 784923401) {
            this.f88089k = ((Integer) this.f88080b).intValue();
        }
        return this.f88089k;
    }

    public boolean i() {
        return this.f88082d == null && this.f88083e == null && this.f88084f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f88080b + ", endValue=" + this.f88081c + ", startFrame=" + this.f88085g + ", endFrame=" + this.f88086h + ", interpolator=" + this.f88082d + fw.b.f85383j;
    }

    public a(com.airbnb.lottie.k kVar, @Nullable T t10, @Nullable T t11, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f10, @Nullable Float f11) {
        this.f88087i = -3987645.8f;
        this.f88088j = -3987645.8f;
        this.f88089k = f88078r;
        this.f88090l = f88078r;
        this.f88091m = Float.MIN_VALUE;
        this.f88092n = Float.MIN_VALUE;
        this.f88093o = null;
        this.f88094p = null;
        this.f88079a = kVar;
        this.f88080b = t10;
        this.f88081c = t11;
        this.f88082d = null;
        this.f88083e = interpolator;
        this.f88084f = interpolator2;
        this.f88085g = f10;
        this.f88086h = f11;
    }

    public a(com.airbnb.lottie.k kVar, @Nullable T t10, @Nullable T t11, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f10, @Nullable Float f11) {
        this.f88087i = -3987645.8f;
        this.f88088j = -3987645.8f;
        this.f88089k = f88078r;
        this.f88090l = f88078r;
        this.f88091m = Float.MIN_VALUE;
        this.f88092n = Float.MIN_VALUE;
        this.f88093o = null;
        this.f88094p = null;
        this.f88079a = kVar;
        this.f88080b = t10;
        this.f88081c = t11;
        this.f88082d = interpolator;
        this.f88083e = interpolator2;
        this.f88084f = interpolator3;
        this.f88085g = f10;
        this.f88086h = f11;
    }

    public a(T t10) {
        this.f88087i = -3987645.8f;
        this.f88088j = -3987645.8f;
        this.f88089k = f88078r;
        this.f88090l = f88078r;
        this.f88091m = Float.MIN_VALUE;
        this.f88092n = Float.MIN_VALUE;
        this.f88093o = null;
        this.f88094p = null;
        this.f88079a = null;
        this.f88080b = t10;
        this.f88081c = t10;
        this.f88082d = null;
        this.f88083e = null;
        this.f88084f = null;
        this.f88085g = Float.MIN_VALUE;
        this.f88086h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(T t10, T t11) {
        this.f88087i = -3987645.8f;
        this.f88088j = -3987645.8f;
        this.f88089k = f88078r;
        this.f88090l = f88078r;
        this.f88091m = Float.MIN_VALUE;
        this.f88092n = Float.MIN_VALUE;
        this.f88093o = null;
        this.f88094p = null;
        this.f88079a = null;
        this.f88080b = t10;
        this.f88081c = t11;
        this.f88082d = null;
        this.f88083e = null;
        this.f88084f = null;
        this.f88085g = Float.MIN_VALUE;
        this.f88086h = Float.valueOf(Float.MAX_VALUE);
    }
}

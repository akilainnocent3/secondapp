package g3;

import k.w;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class k implements i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f86010k = 10000.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f86011l = 1500.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f86012m = 200.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f86013n = 50.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f86014o = 0.2f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f86015p = 0.5f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f86016q = 0.75f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f86017r = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final double f86018s = 62.5d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final double f86019t = Double.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f86020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f86021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f86022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f86023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f86024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f86025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f86026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f86027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f86028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b.p f86029j;

    public k() {
        this.f86020a = Math.sqrt(1500.0d);
        this.f86021b = 0.5d;
        this.f86022c = false;
        this.f86028i = Double.MAX_VALUE;
        this.f86029j = new b.p();
    }

    @Override // g3.i
    @y0({y0.a.LIBRARY})
    public float a(float f10, float f11) {
        float fD = f10 - d();
        double d10 = this.f86020a;
        return (float) (((-(d10 * d10)) * ((double) fD)) - (((d10 * 2.0d) * this.f86021b) * ((double) f11)));
    }

    @Override // g3.i
    @y0({y0.a.LIBRARY})
    public boolean b(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f86024e && ((double) Math.abs(f10 - d())) < this.f86023d;
    }

    public float c() {
        return (float) this.f86021b;
    }

    public float d() {
        return (float) this.f86028i;
    }

    public float e() {
        double d10 = this.f86020a;
        return (float) (d10 * d10);
    }

    public final void f() {
        if (this.f86022c) {
            return;
        }
        if (this.f86028i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f86021b;
        if (d10 > 1.0d) {
            double d11 = this.f86020a;
            this.f86025f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f86021b;
            double d13 = this.f86020a;
            this.f86026g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f86027h = this.f86020a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f86022c = true;
    }

    public k g(@w(from = 0.0d) float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f86021b = f10;
        this.f86022c = false;
        return this;
    }

    public k h(float f10) {
        this.f86028i = f10;
        return this;
    }

    public k i(@w(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f86020a = Math.sqrt(f10);
        this.f86022c = false;
        return this;
    }

    public void j(double d10) {
        double dAbs = Math.abs(d10);
        this.f86023d = dAbs;
        this.f86024e = dAbs * 62.5d;
    }

    public b.p k(double d10, double d11, long j10) {
        double dPow;
        double dCos;
        f();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f86028i;
        double d14 = this.f86021b;
        if (d14 > 1.0d) {
            double d15 = this.f86026g;
            double d16 = this.f86025f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f86025f * d12) * d18);
            double d19 = this.f86026g;
            double dPow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f86025f;
            dCos = dPow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f86020a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            dPow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = d23 * Math.pow(2.718281828459045d, (-this.f86020a) * d12);
            double d24 = this.f86020a;
            dCos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (dPow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f86027h;
            double d26 = this.f86020a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            dPow = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f86027h * d12) * d13) + (Math.sin(this.f86027h * d12) * d27));
            double d28 = this.f86020a;
            double d29 = this.f86021b;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d30 = this.f86027h;
            double dSin = (-d30) * d13 * Math.sin(d30 * d12);
            double d31 = this.f86027h;
            dCos = ((-d28) * dPow * d29) + (dPow4 * (dSin + (d27 * d31 * Math.cos(d31 * d12))));
        }
        b.p pVar = this.f86029j;
        pVar.f86000a = (float) (dPow + this.f86028i);
        pVar.f86001b = (float) dCos;
        return pVar;
    }

    public k(float f10) {
        this.f86020a = Math.sqrt(1500.0d);
        this.f86021b = 0.5d;
        this.f86022c = false;
        this.f86028i = Double.MAX_VALUE;
        this.f86029j = new b.p();
        this.f86028i = f10;
    }
}

package jj;

import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.c
@jj.e
@yi.d
public abstract class g {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f100533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f100534b;

        public g a(double x10, double y10) {
            l0.d(jj.d.d(x10) && jj.d.d(y10));
            double d10 = this.f100533a;
            if (x10 != d10) {
                return b((y10 - this.f100534b) / (x10 - d10));
            }
            l0.d(y10 != this.f100534b);
            return new e(this.f100533a);
        }

        public g b(double slope) {
            l0.d(!Double.isNaN(slope));
            return jj.d.d(slope) ? new d(slope, this.f100534b - (this.f100533a * slope)) : new e(this.f100533a);
        }

        public b(double x10, double y10) {
            this.f100533a = x10;
            this.f100534b = y10;
        }
    }

    public static g a() {
        return c.f100535a;
    }

    public static g b(double y10) {
        l0.d(jj.d.d(y10));
        return new d(0.0d, y10);
    }

    public static b f(double x10, double y10) {
        l0.d(jj.d.d(x10) && jj.d.d(y10));
        return new b(x10, y10);
    }

    public static g i(double x10) {
        l0.d(jj.d.d(x10));
        return new e(x10);
    }

    public abstract g c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract double g();

    public abstract double h(double x10);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f100539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @zq.a
        @rj.b
        public g f100540b;

        public e(double x10) {
            this.f100539a = x10;
            this.f100540b = null;
        }

        private g j() {
            return new d(0.0d, this.f100539a, this);
        }

        @Override // jj.g
        public g c() {
            g gVar = this.f100540b;
            if (gVar != null) {
                return gVar;
            }
            g gVarJ = j();
            this.f100540b = gVarJ;
            return gVarJ;
        }

        @Override // jj.g
        public boolean d() {
            return false;
        }

        @Override // jj.g
        public boolean e() {
            return true;
        }

        @Override // jj.g
        public double g() {
            throw new IllegalStateException();
        }

        @Override // jj.g
        public double h(double x10) {
            throw new IllegalStateException();
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f100539a));
        }

        public e(double x10, g inverse) {
            this.f100539a = x10;
            this.f100540b = inverse;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f100536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f100537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @zq.a
        @rj.b
        public g f100538c;

        public d(double slope, double yIntercept) {
            this.f100536a = slope;
            this.f100537b = yIntercept;
            this.f100538c = null;
        }

        @Override // jj.g
        public g c() {
            g gVar = this.f100538c;
            if (gVar != null) {
                return gVar;
            }
            g gVarJ = j();
            this.f100538c = gVarJ;
            return gVarJ;
        }

        @Override // jj.g
        public boolean d() {
            return this.f100536a == 0.0d;
        }

        @Override // jj.g
        public boolean e() {
            return false;
        }

        @Override // jj.g
        public double g() {
            return this.f100536a;
        }

        @Override // jj.g
        public double h(double x10) {
            return (x10 * this.f100536a) + this.f100537b;
        }

        public final g j() {
            double d10 = this.f100536a;
            return d10 != 0.0d ? new d(1.0d / d10, (this.f100537b * (-1.0d)) / d10, this) : new e(this.f100537b, this);
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.f100536a), Double.valueOf(this.f100537b));
        }

        public d(double slope, double yIntercept, g inverse) {
            this.f100536a = slope;
            this.f100537b = yIntercept;
            this.f100538c = inverse;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f100535a = new c();

        @Override // jj.g
        public boolean d() {
            return false;
        }

        @Override // jj.g
        public boolean e() {
            return false;
        }

        @Override // jj.g
        public double g() {
            return Double.NaN;
        }

        @Override // jj.g
        public double h(double x10) {
            return Double.NaN;
        }

        public String toString() {
            return "NaN";
        }

        @Override // jj.g
        public g c() {
            return this;
        }
    }
}

package n0;

import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class s implements r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f115704q = 1.0E-5f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f115705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f115706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f115707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f115708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f115709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f115710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f115711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f115712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f115713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f115714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f115715k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f115717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f115718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f115719o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f115716l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f115720p = false;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f115721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f115722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f115723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f115724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f115725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f115726f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f115727g = false;

        @Override // n0.r
        public float a() {
            return this.f115724d;
        }

        @Override // n0.r
        public float b(float f10) {
            if (f10 > this.f115725e) {
                return 0.0f;
            }
            float f11 = this.f115722b + (this.f115723c * f10);
            this.f115724d = f11;
            return f11;
        }

        @Override // n0.r
        public String c(String str, float f10) {
            return this.f115725e + " " + this.f115724d;
        }

        @Override // n0.r
        public boolean d() {
            return this.f115727g;
        }

        public void e(float f10, float f11, float f12) {
            this.f115727g = false;
            this.f115721a = f11;
            this.f115722b = f12;
            this.f115726f = f10;
            float f13 = (f11 - f10) / (f12 / 2.0f);
            this.f115725e = f13;
            this.f115723c = (-f12) / f13;
        }

        @Override // n0.r
        public float getInterpolation(float f10) {
            if (f10 > this.f115725e) {
                this.f115727g = true;
                return this.f115721a;
            }
            b(f10);
            return this.f115726f + ((this.f115722b + ((this.f115723c * f10) / 2.0f)) * f10);
        }
    }

    @Override // n0.r
    public float a() {
        return this.f115716l ? -b(this.f115719o) : b(this.f115719o);
    }

    @Override // n0.r
    public float b(float f10) {
        float f11 = this.f115708d;
        if (f10 <= f11) {
            float f12 = this.f115705a;
            return f12 + (((this.f115706b - f12) * f10) / f11);
        }
        int i10 = this.f115714j;
        if (i10 == 1) {
            return 0.0f;
        }
        float f13 = f10 - f11;
        float f14 = this.f115709e;
        if (f13 < f14) {
            float f15 = this.f115706b;
            return f15 + (((this.f115707c - f15) * f13) / f14);
        }
        if (i10 == 2) {
            return 0.0f;
        }
        float f16 = f13 - f14;
        float f17 = this.f115710f;
        if (f16 >= f17) {
            return 0.0f;
        }
        float f18 = this.f115707c;
        return f18 - ((f16 * f18) / f17);
    }

    @Override // n0.r
    public String c(String str, float f10) {
        String str2 = str + " ===== " + this.f115715k + IOUtils.LINE_SEPARATOR_UNIX;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        sb2.append(this.f115716l ? "backwards" : "forward ");
        sb2.append(" time = ");
        sb2.append(f10);
        sb2.append("  stages ");
        sb2.append(this.f115714j);
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        String str3 = sb2.toString() + str + " dur " + this.f115708d + " vel " + this.f115705a + " pos " + this.f115711g + IOUtils.LINE_SEPARATOR_UNIX;
        if (this.f115714j > 1) {
            str3 = str3 + str + " dur " + this.f115709e + " vel " + this.f115706b + " pos " + this.f115712h + IOUtils.LINE_SEPARATOR_UNIX;
        }
        if (this.f115714j > 2) {
            str3 = str3 + str + " dur " + this.f115710f + " vel " + this.f115707c + " pos " + this.f115713i + IOUtils.LINE_SEPARATOR_UNIX;
        }
        float f11 = this.f115708d;
        if (f10 <= f11) {
            return str3 + str + "stage 0\n";
        }
        int i10 = this.f115714j;
        if (i10 == 1) {
            return str3 + str + "end stage 0\n";
        }
        float f12 = f10 - f11;
        float f13 = this.f115709e;
        if (f12 < f13) {
            return str3 + str + " stage 1\n";
        }
        if (i10 == 2) {
            return str3 + str + "end stage 1\n";
        }
        if (f12 - f13 < this.f115710f) {
            return str3 + str + " stage 2\n";
        }
        return str3 + str + " end stage 2\n";
    }

    @Override // n0.r
    public boolean d() {
        return a() < 1.0E-5f && Math.abs(this.f115713i - this.f115718n) < 1.0E-5f;
    }

    public final float e(float f10) {
        this.f115720p = false;
        float f11 = this.f115708d;
        if (f10 <= f11) {
            float f12 = this.f115705a;
            return (f12 * f10) + ((((this.f115706b - f12) * f10) * f10) / (f11 * 2.0f));
        }
        int i10 = this.f115714j;
        if (i10 == 1) {
            return this.f115711g;
        }
        float f13 = f10 - f11;
        float f14 = this.f115709e;
        if (f13 < f14) {
            float f15 = this.f115711g;
            float f16 = this.f115706b;
            return f15 + (f16 * f13) + ((((this.f115707c - f16) * f13) * f13) / (f14 * 2.0f));
        }
        if (i10 == 2) {
            return this.f115712h;
        }
        float f17 = f13 - f14;
        float f18 = this.f115710f;
        if (f17 > f18) {
            this.f115720p = true;
            return this.f115713i;
        }
        float f19 = this.f115712h;
        float f20 = this.f115707c;
        return (f19 + (f20 * f17)) - (((f20 * f17) * f17) / (f18 * 2.0f));
    }

    public void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f115720p = false;
        this.f115717m = f10;
        boolean z10 = f10 > f11;
        this.f115716l = z10;
        if (z10) {
            g(-f12, f10 - f11, f14, f15, f13);
        } else {
            g(f12, f11 - f10, f14, f15, f13);
        }
    }

    public final void g(float f10, float f11, float f12, float f13, float f14) {
        this.f115720p = false;
        this.f115713i = f11;
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12);
            if (fSqrt < f13) {
                this.f115715k = "backward accelerate, decelerate";
                this.f115714j = 2;
                this.f115705a = f10;
                this.f115706b = fSqrt;
                this.f115707c = 0.0f;
                float f17 = (fSqrt - f10) / f12;
                this.f115708d = f17;
                this.f115709e = fSqrt / f12;
                this.f115711g = ((f10 + fSqrt) * f17) / 2.0f;
                this.f115712h = f11;
                this.f115713i = f11;
                return;
            }
            this.f115715k = "backward accelerate cruse decelerate";
            this.f115714j = 3;
            this.f115705a = f10;
            this.f115706b = f13;
            this.f115707c = f13;
            float f18 = (f13 - f10) / f12;
            this.f115708d = f18;
            float f19 = f13 / f12;
            this.f115710f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f115709e = ((f11 - f20) - f21) / f13;
            this.f115711g = f20;
            this.f115712h = f11 - f21;
            this.f115713i = f11;
            return;
        }
        if (f16 >= f11) {
            this.f115715k = "hard stop";
            this.f115714j = 1;
            this.f115705a = f10;
            this.f115706b = 0.0f;
            this.f115711g = f11;
            this.f115708d = (2.0f * f11) / f10;
            return;
        }
        float f22 = f11 - f16;
        float f23 = f22 / f10;
        if (f23 + f15 < f14) {
            this.f115715k = "cruse decelerate";
            this.f115714j = 2;
            this.f115705a = f10;
            this.f115706b = f10;
            this.f115707c = 0.0f;
            this.f115711g = f22;
            this.f115712h = f11;
            this.f115708d = f23;
            this.f115709e = f15;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f12 * f11) + ((f10 * f10) / 2.0f));
        float f24 = (fSqrt2 - f10) / f12;
        this.f115708d = f24;
        float f25 = fSqrt2 / f12;
        this.f115709e = f25;
        if (fSqrt2 < f13) {
            this.f115715k = "accelerate decelerate";
            this.f115714j = 2;
            this.f115705a = f10;
            this.f115706b = fSqrt2;
            this.f115707c = 0.0f;
            this.f115708d = f24;
            this.f115709e = f25;
            this.f115711g = ((f10 + fSqrt2) * f24) / 2.0f;
            this.f115712h = f11;
            return;
        }
        this.f115715k = "accelerate cruse decelerate";
        this.f115714j = 3;
        this.f115705a = f10;
        this.f115706b = f13;
        this.f115707c = f13;
        float f26 = (f13 - f10) / f12;
        this.f115708d = f26;
        float f27 = f13 / f12;
        this.f115710f = f27;
        float f28 = ((f10 + f13) * f26) / 2.0f;
        float f29 = (f27 * f13) / 2.0f;
        this.f115709e = ((f11 - f28) - f29) / f13;
        this.f115711g = f28;
        this.f115712h = f11 - f29;
        this.f115713i = f11;
    }

    @Override // n0.r
    public float getInterpolation(float f10) {
        float fE = e(f10);
        this.f115718n = fE;
        this.f115719o = f10;
        return this.f115716l ? this.f115717m - fE : this.f115717m + fE;
    }
}

package k0;

import java.util.Set;
import n0.a0;
import n0.w;
import p0.v;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f implements w {
    public static final int A = 0;
    public static final int B = 0;
    public static final int C = -1;
    public static final int D = -1;
    public static final int E = -2;
    public static final int F = Integer.MIN_VALUE;
    public static final int G = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f101586m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f101587n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f101588o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f101589p = -2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f101590q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f101591r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f101592s = -3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f101593t = -4;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f101594u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f101595v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f101596w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f101597x = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f101598y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f101599z = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v f101600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f101601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f101602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f101603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f101604l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f101605n = -2;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f101606o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f101607p = -3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f101608a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f101609b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f101610c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f101611d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f101612e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f101613f = Float.NaN;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f101614g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f101615h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f101616i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f101617j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f101618k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f101619l = -3;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f101620m = -1;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f101621a = 4;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f101622b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f101623c = 1.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f101624d = Float.NaN;
    }

    public f() {
        this.f101600h = new v();
        this.f101601i = new a();
        this.f101602j = new b();
    }

    public float A(int i10) {
        switch (i10) {
            case 303:
                return this.f101600h.f120305p;
            case 304:
                return this.f101600h.f120300k;
            case 305:
                return this.f101600h.f120301l;
            case 306:
                return this.f101600h.f120302m;
            case 307:
            default:
                return Float.NaN;
            case 308:
                return this.f101600h.f120297h;
            case 309:
                return this.f101600h.f120298i;
            case 310:
                return this.f101600h.f120299j;
            case 311:
                return this.f101600h.f120303n;
            case 312:
                return this.f101600h.f120304o;
            case 313:
                return this.f101600h.f120295f;
            case 314:
                return this.f101600h.f120296g;
            case 315:
                return this.f101603k;
            case 316:
                return this.f101604l;
        }
    }

    public int B() {
        return this.f101602j.f101621a;
    }

    public v C() {
        return this.f101600h;
    }

    public int D() {
        v vVar = this.f101600h;
        return vVar.f120293d - vVar.f120291b;
    }

    public int E() {
        return this.f101600h.f120291b;
    }

    public int F() {
        return this.f101600h.f120292c;
    }

    public void G(int i10, int i11, int i12, int i13) {
        H(i10, i11, i12, i13);
    }

    public void H(int i10, int i11, int i12, int i13) {
        if (this.f101600h == null) {
            this.f101600h = new v((s0.e) null);
        }
        v vVar = this.f101600h;
        vVar.f120292c = i11;
        vVar.f120291b = i10;
        vVar.f120293d = i12;
        vVar.f120294e = i13;
    }

    public void I(String str, int i10, float f10) {
        this.f101600h.x(str, i10, f10);
    }

    public void J(String str, int i10, int i11) {
        this.f101600h.y(str, i10, i11);
    }

    public void K(String str, int i10, String str2) {
        this.f101600h.z(str, i10, str2);
    }

    public void L(String str, int i10, boolean z10) {
        this.f101600h.A(str, i10, z10);
    }

    public void M(k0.a aVar, float[] fArr) {
        this.f101600h.x(aVar.f101471b, 901, fArr[0]);
    }

    public void N(float f10) {
        this.f101600h.f120295f = f10;
    }

    public void O(float f10) {
        this.f101600h.f120296g = f10;
    }

    public void P(float f10) {
        this.f101600h.f120297h = f10;
    }

    public void Q(float f10) {
        this.f101600h.f120298i = f10;
    }

    public void R(float f10) {
        this.f101600h.f120299j = f10;
    }

    public void S(float f10) {
        this.f101600h.f120303n = f10;
    }

    public void T(float f10) {
        this.f101600h.f120304o = f10;
    }

    public void U(float f10) {
        this.f101600h.f120300k = f10;
    }

    public void V(float f10) {
        this.f101600h.f120301l = f10;
    }

    public void W(float f10) {
        this.f101600h.f120302m = f10;
    }

    public boolean X(int i10, float f10) {
        switch (i10) {
            case 303:
                this.f101600h.f120305p = f10;
                return true;
            case 304:
                this.f101600h.f120300k = f10;
                return true;
            case 305:
                this.f101600h.f120301l = f10;
                return true;
            case 306:
                this.f101600h.f120302m = f10;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.f101600h.f120297h = f10;
                return true;
            case 309:
                this.f101600h.f120298i = f10;
                return true;
            case 310:
                this.f101600h.f120299j = f10;
                return true;
            case 311:
                this.f101600h.f120303n = f10;
                return true;
            case 312:
                this.f101600h.f120304o = f10;
                return true;
            case 313:
                this.f101600h.f120295f = f10;
                return true;
            case 314:
                this.f101600h.f120296g = f10;
                return true;
            case 315:
                this.f101603k = f10;
                return true;
            case 316:
                this.f101604l = f10;
                return true;
        }
    }

    public boolean Y(int i10, float f10) {
        switch (i10) {
            case 600:
                this.f101601i.f101613f = f10;
                return true;
            case 601:
                this.f101601i.f101615h = f10;
                return true;
            case 602:
                this.f101601i.f101616i = f10;
                return true;
            default:
                return false;
        }
    }

    public boolean Z(int i10, int i11) {
        switch (i10) {
            case 606:
                this.f101601i.f101609b = i11;
                return true;
            case 607:
                this.f101601i.f101611d = i11;
                return true;
            case 608:
                this.f101601i.f101612e = i11;
                return true;
            case 609:
                this.f101601i.f101614g = i11;
                return true;
            case 610:
                this.f101601i.f101617j = i11;
                return true;
            case 611:
                this.f101601i.f101619l = i11;
                return true;
            case 612:
                this.f101601i.f101620m = i11;
                return true;
            default:
                return false;
        }
    }

    @Override // n0.w
    public boolean a(int i10, int i11) {
        if (X(i10, i11)) {
            return true;
        }
        return Z(i10, i11);
    }

    public boolean a0(int i10, String str) {
        if (i10 == 603) {
            this.f101601i.f101610c = str;
            return true;
        }
        if (i10 != 604) {
            return false;
        }
        this.f101601i.f101618k = str;
        return true;
    }

    @Override // n0.w
    public boolean b(int i10, float f10) {
        if (X(i10, f10)) {
            return true;
        }
        return Y(i10, f10);
    }

    public void b0(int i10) {
        this.f101602j.f101621a = i10;
    }

    @Override // n0.w
    public boolean c(int i10, boolean z10) {
        return false;
    }

    public void c0(w wVar) {
        if (this.f101600h.m() != null) {
            this.f101600h.m().g(wVar);
        }
    }

    @Override // n0.w
    public boolean d(int i10, String str) {
        if (i10 != 605) {
            return a0(i10, str);
        }
        this.f101601i.f101608a = str;
        return true;
    }

    @Override // n0.w
    public int e(String str) {
        int iA = n0.v.a(str);
        return iA != -1 ? iA : a0.a(str);
    }

    public f f(int i10) {
        return null;
    }

    public float g() {
        return this.f101600h.f120305p;
    }

    public int h() {
        return this.f101600h.f120294e;
    }

    public k0.b i(String str) {
        return this.f101600h.h(str);
    }

    public Set<String> j() {
        return this.f101600h.i();
    }

    public int k() {
        v vVar = this.f101600h;
        return vVar.f120294e - vVar.f120292c;
    }

    public int l() {
        return this.f101600h.f120291b;
    }

    public String m() {
        return this.f101600h.l();
    }

    public f n() {
        return null;
    }

    public float o() {
        return this.f101600h.f120295f;
    }

    public float p() {
        return this.f101600h.f120296g;
    }

    public int q() {
        return this.f101600h.f120293d;
    }

    public float r() {
        return this.f101600h.f120297h;
    }

    public float s() {
        return this.f101600h.f120298i;
    }

    public float t() {
        return this.f101600h.f120299j;
    }

    public String toString() {
        return this.f101600h.f120291b + ", " + this.f101600h.f120292c + ", " + this.f101600h.f120293d + ", " + this.f101600h.f120294e;
    }

    public float u() {
        return this.f101600h.f120303n;
    }

    public float v() {
        return this.f101600h.f120304o;
    }

    public int w() {
        return this.f101600h.f120292c;
    }

    public float x() {
        return this.f101600h.f120300k;
    }

    public float y() {
        return this.f101600h.f120301l;
    }

    public float z() {
        return this.f101600h.f120302m;
    }

    public f(v vVar) {
        this.f101600h = new v();
        this.f101601i = new a();
        this.f101602j = new b();
        this.f101600h = vVar;
    }
}

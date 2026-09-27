package j0;

import com.ironsource.C4235d4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final c J = new c(androidx.constraintlayout.widget.g.W1);
    public static int K = Integer.MIN_VALUE;
    public static Map<EnumC0931c, String> L;
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String[] G;
    public boolean H;
    public boolean I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f99229b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f99230c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f99231d = new d(e.LEFT);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f99232e = new d(e.RIGHT);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f99233f = new g(h.TOP);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f99234g = new g(h.BOTTOM);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f99235h = new d(e.START);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f99236i = new d(e.END);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f99237j = new g(h.BASELINE);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f99238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f99239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f99240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f99241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f99242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f99243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f99244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f99245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f99246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f99247t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f99248u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f99249v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EnumC0931c f99250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public EnumC0931c f99251x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f99252y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f99253z;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f99254a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f99256c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f99255b = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f99257d = Integer.MIN_VALUE;

        public a(f fVar) {
            this.f99254a = fVar;
        }

        public void a(StringBuilder sb2) {
            if (this.f99255b != null) {
                sb2.append(this.f99254a.toString().toLowerCase());
                sb2.append(":");
                sb2.append(this);
                sb2.append(",\n");
            }
        }

        public String b() {
            return c.this.f99228a;
        }

        public c c() {
            return c.this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(C4235d4.j.f61460d);
            if (this.f99255b != null) {
                sb2.append("'");
                sb2.append(this.f99255b.b());
                sb2.append("',");
                sb2.append("'");
                sb2.append(this.f99255b.f99254a.toString().toLowerCase());
                sb2.append("'");
            }
            if (this.f99256c != 0) {
                sb2.append(",");
                sb2.append(this.f99256c);
            }
            if (this.f99257d != Integer.MIN_VALUE) {
                if (this.f99256c == 0) {
                    sb2.append(",0,");
                    sb2.append(this.f99257d);
                } else {
                    sb2.append(",");
                    sb2.append(this.f99257d);
                }
            }
            sb2.append(C4235d4.j.f61462e);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        SPREAD,
        WRAP,
        PERCENT,
        RATIO,
        RESOLVED
    }

    /* JADX INFO: renamed from: j0.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum EnumC0931c {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends a {
        public d(e eVar) {
            super(f.valueOf(eVar.name()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum e {
        LEFT,
        RIGHT,
        START,
        END
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum f {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        START,
        END,
        BASELINE
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class g extends a {
        public g(h hVar) {
            super(f.valueOf(hVar.name()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum h {
        TOP,
        BOTTOM,
        BASELINE
    }

    static {
        HashMap map = new HashMap();
        L = map;
        map.put(EnumC0931c.SPREAD, "spread");
        L.put(EnumC0931c.SPREAD_INSIDE, "spread_inside");
        L.put(EnumC0931c.PACKED, "packed");
    }

    public c(String str) {
        int i10 = K;
        this.f99238k = i10;
        this.f99239l = i10;
        this.f99240m = Float.NaN;
        this.f99241n = Float.NaN;
        this.f99242o = null;
        this.f99243p = null;
        this.f99244q = Integer.MIN_VALUE;
        this.f99245r = Float.NaN;
        this.f99246s = Integer.MIN_VALUE;
        this.f99247t = Integer.MIN_VALUE;
        this.f99248u = Float.NaN;
        this.f99249v = Float.NaN;
        this.f99250w = null;
        this.f99251x = null;
        this.f99252y = null;
        this.f99253z = null;
        this.A = i10;
        this.B = i10;
        this.C = i10;
        this.D = i10;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = null;
        this.H = false;
        this.I = false;
        this.f99228a = str;
    }

    public EnumC0931c A() {
        return this.f99251x;
    }

    public void A0(int i10) {
        this.A = i10;
    }

    public float B() {
        return this.f99248u;
    }

    public void B0(int i10) {
        this.C = i10;
    }

    public int C() {
        return this.f99238k;
    }

    public void C0(float f10) {
        this.E = f10;
    }

    public b D() {
        return this.f99252y;
    }

    public int E() {
        return this.A;
    }

    public int F() {
        return this.C;
    }

    public float G() {
        return this.E;
    }

    public boolean H() {
        return this.I;
    }

    public boolean I() {
        return this.H;
    }

    public void J(g gVar) {
        K(gVar, 0);
    }

    public void K(g gVar, int i10) {
        L(gVar, i10, Integer.MIN_VALUE);
    }

    public void L(g gVar, int i10, int i11) {
        g gVar2 = this.f99237j;
        gVar2.f99255b = gVar;
        gVar2.f99256c = i10;
        gVar2.f99257d = i11;
    }

    public void M(g gVar) {
        N(gVar, 0);
    }

    public void N(g gVar, int i10) {
        O(gVar, i10, Integer.MIN_VALUE);
    }

    public void O(g gVar, int i10, int i11) {
        g gVar2 = this.f99234g;
        gVar2.f99255b = gVar;
        gVar2.f99256c = i10;
        gVar2.f99257d = i11;
    }

    public void P(d dVar) {
        Q(dVar, 0);
    }

    public void Q(d dVar, int i10) {
        R(dVar, i10, Integer.MIN_VALUE);
    }

    public void R(d dVar, int i10, int i11) {
        d dVar2 = this.f99236i;
        dVar2.f99255b = dVar;
        dVar2.f99256c = i10;
        dVar2.f99257d = i11;
    }

    public void S(d dVar) {
        T(dVar, 0);
    }

    public void T(d dVar, int i10) {
        U(dVar, i10, Integer.MIN_VALUE);
    }

    public void U(d dVar, int i10, int i11) {
        d dVar2 = this.f99231d;
        dVar2.f99255b = dVar;
        dVar2.f99256c = i10;
        dVar2.f99257d = i11;
    }

    public void V(d dVar) {
        W(dVar, 0);
    }

    public void W(d dVar, int i10) {
        X(dVar, i10, Integer.MIN_VALUE);
    }

    public void X(d dVar, int i10, int i11) {
        d dVar2 = this.f99232e;
        dVar2.f99255b = dVar;
        dVar2.f99256c = i10;
        dVar2.f99257d = i11;
    }

    public void Y(d dVar) {
        Z(dVar, 0);
    }

    public void Z(d dVar, int i10) {
        a0(dVar, i10, Integer.MIN_VALUE);
    }

    public void a0(d dVar, int i10, int i11) {
        d dVar2 = this.f99235h;
        dVar2.f99255b = dVar;
        dVar2.f99256c = i10;
        dVar2.f99257d = i11;
    }

    public void b(StringBuilder sb2, String str, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        sb2.append(str);
        sb2.append(":");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public void b0(g gVar) {
        c0(gVar, 0);
    }

    public String c(String[] strArr) {
        StringBuilder sb2 = new StringBuilder(C4235d4.j.f61460d);
        int i10 = 0;
        while (i10 < strArr.length) {
            sb2.append(i10 == 0 ? "'" : ",'");
            sb2.append(strArr[i10]);
            sb2.append("'");
            i10++;
        }
        sb2.append(C4235d4.j.f61462e);
        return sb2.toString();
    }

    public void c0(g gVar, int i10) {
        d0(gVar, i10, Integer.MIN_VALUE);
    }

    public g d() {
        return this.f99237j;
    }

    public void d0(g gVar, int i10, int i11) {
        g gVar2 = this.f99233f;
        gVar2.f99255b = gVar;
        gVar2.f99256c = i10;
        gVar2.f99257d = i11;
    }

    public g e() {
        return this.f99234g;
    }

    public void e0(float f10) {
        this.f99245r = f10;
    }

    public float f() {
        return this.f99245r;
    }

    public void f0(String str) {
        this.f99243p = str;
    }

    public String g() {
        return this.f99243p;
    }

    public void g0(int i10) {
        this.f99244q = i10;
    }

    public int h() {
        return this.f99244q;
    }

    public void h0(boolean z10) {
        this.I = z10;
    }

    public String i() {
        return this.f99242o;
    }

    public void i0(boolean z10) {
        this.H = z10;
    }

    public int j() {
        return this.f99246s;
    }

    public void j0(String str) {
        this.f99242o = str;
    }

    public int k() {
        return this.f99247t;
    }

    public void k0(int i10) {
        this.f99246s = i10;
    }

    public d l() {
        return this.f99236i;
    }

    public void l0(int i10) {
        this.f99247t = i10;
    }

    public int m() {
        return this.f99239l;
    }

    public void m0(int i10) {
        this.f99239l = i10;
    }

    public b n() {
        return this.f99253z;
    }

    public void n0(b bVar) {
        this.f99253z = bVar;
    }

    public int o() {
        return this.B;
    }

    public void o0(int i10) {
        this.B = i10;
    }

    public int p() {
        return this.D;
    }

    public void p0(int i10) {
        this.D = i10;
    }

    public float q() {
        return this.F;
    }

    public void q0(float f10) {
        this.F = f10;
    }

    public float r() {
        return this.f99240m;
    }

    public void r0(float f10) {
        this.f99240m = f10;
    }

    public EnumC0931c s() {
        return this.f99250w;
    }

    public void s0(EnumC0931c enumC0931c) {
        this.f99250w = enumC0931c;
    }

    public float t() {
        return this.f99249v;
    }

    public void t0(float f10) {
        this.f99249v = f10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f99228a + ":{\n");
        this.f99231d.a(sb2);
        this.f99232e.a(sb2);
        this.f99233f.a(sb2);
        this.f99234g.a(sb2);
        this.f99235h.a(sb2);
        this.f99236i.a(sb2);
        this.f99237j.a(sb2);
        if (this.f99238k != K) {
            sb2.append("width:");
            sb2.append(this.f99238k);
            sb2.append(",\n");
        }
        if (this.f99239l != K) {
            sb2.append("height:");
            sb2.append(this.f99239l);
            sb2.append(",\n");
        }
        b(sb2, "horizontalBias", this.f99240m);
        b(sb2, "verticalBias", this.f99241n);
        if (this.f99242o != null) {
            sb2.append("dimensionRatio:'");
            sb2.append(this.f99242o);
            sb2.append("',\n");
        }
        if (this.f99243p != null && (!Float.isNaN(this.f99245r) || this.f99244q != Integer.MIN_VALUE)) {
            sb2.append("circular:['");
            sb2.append(this.f99243p);
            sb2.append("'");
            if (!Float.isNaN(this.f99245r)) {
                sb2.append(",");
                sb2.append(this.f99245r);
            }
            if (this.f99244q != Integer.MIN_VALUE) {
                if (Float.isNaN(this.f99245r)) {
                    sb2.append(",0,");
                    sb2.append(this.f99244q);
                } else {
                    sb2.append(",");
                    sb2.append(this.f99244q);
                }
            }
            sb2.append("],\n");
        }
        b(sb2, "verticalWeight", this.f99248u);
        b(sb2, "horizontalWeight", this.f99249v);
        if (this.f99250w != null) {
            sb2.append("horizontalChainStyle:'");
            sb2.append(L.get(this.f99250w));
            sb2.append("',\n");
        }
        if (this.f99251x != null) {
            sb2.append("verticalChainStyle:'");
            sb2.append(L.get(this.f99251x));
            sb2.append("',\n");
        }
        if (this.f99252y != null) {
            int i10 = this.A;
            int i11 = K;
            if (i10 == i11 && this.C == i11) {
                sb2.append("width:'");
                sb2.append(this.f99252y.toString().toLowerCase());
                sb2.append("',\n");
            } else {
                sb2.append("width:{value:'");
                sb2.append(this.f99252y.toString().toLowerCase());
                sb2.append("'");
                if (this.A != K) {
                    sb2.append(",max:");
                    sb2.append(this.A);
                }
                if (this.C != K) {
                    sb2.append(",min:");
                    sb2.append(this.C);
                }
                sb2.append("},\n");
            }
        }
        if (this.f99253z != null) {
            int i12 = this.B;
            int i13 = K;
            if (i12 == i13 && this.D == i13) {
                sb2.append("height:'");
                sb2.append(this.f99253z.toString().toLowerCase());
                sb2.append("',\n");
            } else {
                sb2.append("height:{value:'");
                sb2.append(this.f99253z.toString().toLowerCase());
                sb2.append("'");
                if (this.B != K) {
                    sb2.append(",max:");
                    sb2.append(this.B);
                }
                if (this.D != K) {
                    sb2.append(",min:");
                    sb2.append(this.D);
                }
                sb2.append("},\n");
            }
        }
        if (!Double.isNaN(this.E)) {
            sb2.append("width:'");
            sb2.append((int) this.E);
            sb2.append("%',\n");
        }
        if (!Double.isNaN(this.F)) {
            sb2.append("height:'");
            sb2.append((int) this.F);
            sb2.append("%',\n");
        }
        if (this.G != null) {
            sb2.append("referenceIds:");
            sb2.append(c(this.G));
            sb2.append(",\n");
        }
        if (this.H) {
            sb2.append("constrainedWidth:");
            sb2.append(this.H);
            sb2.append(",\n");
        }
        if (this.I) {
            sb2.append("constrainedHeight:");
            sb2.append(this.I);
            sb2.append(",\n");
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public d u() {
        return this.f99231d;
    }

    public void u0(String[] strArr) {
        this.G = strArr;
    }

    public String[] v() {
        return this.G;
    }

    public void v0(float f10) {
        this.f99241n = f10;
    }

    public d w() {
        return this.f99232e;
    }

    public void w0(EnumC0931c enumC0931c) {
        this.f99251x = enumC0931c;
    }

    public d x() {
        return this.f99235h;
    }

    public void x0(float f10) {
        this.f99248u = f10;
    }

    public g y() {
        return this.f99233f;
    }

    public void y0(int i10) {
        this.f99238k = i10;
    }

    public float z() {
        return this.f99241n;
    }

    public void z0(b bVar) {
        this.f99252y = bVar;
    }
}

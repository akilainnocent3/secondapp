package l0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import n0.o;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class g extends b {
    public static final String R = "KeyTrigger";
    public static final String S = "viewTransitionOnCross";
    public static final String T = "viewTransitionOnPositiveCross";
    public static final String U = "viewTransitionOnNegativeCross";
    public static final String V = "postLayout";
    public static final String W = "triggerSlack";
    public static final String X = "triggerCollisionView";
    public static final String Y = "triggerCollisionId";
    public static final String Z = "triggerID";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f103265a0 = "positiveCross";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f103266b0 = "negativeCross";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f103267c0 = "triggerReceiver";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f103268d0 = "CROSS";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f103269e0 = 301;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f103270f0 = 302;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f103271g0 = 303;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f103272h0 = 304;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f103273i0 = 305;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f103274j0 = 306;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f103275k0 = 307;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f103276l0 = 308;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f103277m0 = 309;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f103278n0 = 310;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f103279o0 = 311;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f103280p0 = 312;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f103281q0 = 5;
    public int A;
    public String B;
    public String C;
    public int D;
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public n0.e P;
    public n0.e Q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f103282y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f103283z = null;

    public g() {
        int i10 = b.f103235m;
        this.A = i10;
        this.B = null;
        this.C = null;
        this.D = i10;
        this.E = i10;
        this.F = 0.1f;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = Float.NaN;
        this.L = false;
        this.M = i10;
        this.N = i10;
        this.O = i10;
        this.P = new n0.e();
        this.Q = new n0.e();
        this.f103250k = 5;
        this.f103251l = new HashMap<>();
    }

    @Override // l0.b, n0.w
    public boolean a(int i10, int i11) {
        if (i10 == 307) {
            this.E = i11;
            return true;
        }
        if (i10 == 308) {
            this.D = u(Integer.valueOf(i11));
            return true;
        }
        if (i10 == 311) {
            this.A = i11;
            return true;
        }
        switch (i10) {
            case 301:
                this.O = i11;
                return true;
            case 302:
                this.N = i11;
                return true;
            case 303:
                this.M = i11;
                return true;
            default:
                return super.a(i10, i11);
        }
    }

    @Override // l0.b, n0.w
    public boolean b(int i10, float f10) {
        if (i10 != 305) {
            return super.b(i10, f10);
        }
        this.F = f10;
        return true;
    }

    @Override // l0.b, n0.w
    public boolean c(int i10, boolean z10) {
        if (i10 != 304) {
            return super.c(i10, z10);
        }
        this.L = z10;
        return true;
    }

    @Override // l0.b, n0.w
    public boolean d(int i10, String str) {
        if (i10 == 309) {
            this.C = str;
            return true;
        }
        if (i10 == 310) {
            this.B = str;
            return true;
        }
        if (i10 != 312) {
            return super.d(i10, str);
        }
        this.f103283z = str;
        return true;
    }

    @Override // n0.w
    public int e(String str) {
        str.getClass();
        switch (str) {
            case "positiveCross":
                return 309;
            case "viewTransitionOnPositiveCross":
                return 302;
            case "triggerCollisionId":
                return 307;
            case "triggerID":
                return 308;
            case "negativeCross":
                return 310;
            case "triggerCollisionView":
                return 306;
            case "viewTransitionOnNegativeCross":
                return 303;
            case "triggerSlack":
                return 305;
            case "viewTransitionOnCross":
                return 301;
            case "postLayout":
                return 304;
            case "triggerReceiver":
                return 311;
            default:
                return -1;
        }
    }

    @Override // l0.b
    /* JADX INFO: renamed from: g */
    public b clone() {
        return new g().h(this);
    }

    @Override // l0.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public g h(b bVar) {
        super.h(bVar);
        g gVar = (g) bVar;
        this.f103282y = gVar.f103282y;
        this.f103283z = gVar.f103283z;
        this.A = gVar.A;
        this.B = gVar.B;
        this.C = gVar.C;
        this.D = gVar.D;
        this.E = gVar.E;
        this.F = gVar.F;
        this.G = gVar.G;
        this.H = gVar.H;
        this.I = gVar.I;
        this.J = gVar.J;
        this.K = gVar.K;
        this.L = gVar.L;
        this.P = gVar.P;
        this.Q = gVar.Q;
        return this;
    }

    public final void x(String str, k0.f fVar) {
        boolean z10 = str.length() == 1;
        if (!z10) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f103251l.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z10 || lowerCase.matches(str)) {
                k0.b bVar = this.f103251l.get(str2);
                if (bVar != null) {
                    bVar.a(fVar);
                }
            }
        }
    }

    @Override // l0.b
    public void f(HashMap<String, o> map) {
    }

    @Override // l0.b
    public void i(HashSet<String> hashSet) {
    }

    public void v(float f10, k0.f fVar) {
    }
}

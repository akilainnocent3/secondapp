package s0;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import ew.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p0.v;
import t0.p;
import vb.q;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class e {
    public static float A1 = 0.5f;
    public static final boolean U0 = false;
    public static final boolean V0 = false;
    public static final int W0 = 1;
    public static final int X0 = 2;
    public static final boolean Y0 = false;
    public static final int Z0 = 0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int f128198a1 = 1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final int f128199b1 = 2;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f128200c1 = 3;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final int f128201d1 = 4;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final int f128202e1 = -1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final int f128203f1 = 0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int f128204g1 = 1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f128205h1 = 2;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f128206i1 = 0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final int f128207j1 = 4;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final int f128208k1 = 8;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final int f128209l1 = 0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final int f128210m1 = 1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final int f128211n1 = 2;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final int f128212o1 = 0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f128213p1 = 1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final int f128214q1 = 2;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final int f128215r1 = 3;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final int f128216s1 = -2;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final int f128217t1 = 0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final int f128218u1 = 1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final int f128219v1 = 2;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final int f128220w1 = 3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f128221x1 = 4;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f128222y1 = 0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final int f128223z1 = 1;
    public int A;
    public int A0;
    public float B;
    public int B0;
    public int C;
    public boolean C0;
    public int D;
    public boolean D0;
    public float E;
    public boolean E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public boolean G0;
    public int H;
    public boolean H0;
    public float I;
    public boolean I0;
    public int[] J;
    public int J0;
    public float K;
    public int K0;
    public boolean L;
    public boolean L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public float[] N0;
    public int O;
    public e[] O0;
    public int P;
    public e[] P0;
    public d Q;
    public e Q0;
    public d R;
    public e R0;
    public d S;
    public int S0;
    public d T;
    public int T0;
    public d U;
    public d V;
    public d W;
    public d X;
    public d[] Y;
    public ArrayList<d> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f128224a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean[] f128225a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p[] f128226b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public b[] f128227b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t0.c f128228c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public e f128229c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t0.c f128230d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f128231d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0.l f128232e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f128233e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0.n f128234f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f128235f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean[] f128236g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f128237g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f128238h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f128239h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f128240i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f128241i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f128242j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f128243j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f128244k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f128245k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f128246l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f128247l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f128248m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f128249m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v f128250n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f128251n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f128252o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f128253o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f128254p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f128255p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f128256q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f128257q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f128258r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f128259r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f128260s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Object f128261s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f128262t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f128263t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f128264u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f128265u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f128266v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f128267v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f128268w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f128269w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f128270x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f128271x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f128272y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f128273y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f128274z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f128275z0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128276a;

        static {
            int[] iArr = new int[d.a.values().length];
            f128276a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f128276a[d.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f128276a[d.a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f128276a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f128276a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f128276a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f128276a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f128276a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f128276a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        this.f128224a = false;
        this.f128226b = new p[2];
        this.f128232e = null;
        this.f128234f = null;
        this.f128236g = new boolean[]{true, true};
        this.f128238h = false;
        this.f128240i = true;
        this.f128242j = false;
        this.f128244k = true;
        this.f128246l = -1;
        this.f128248m = -1;
        this.f128250n = new v(this);
        this.f128254p = false;
        this.f128256q = false;
        this.f128258r = false;
        this.f128260s = false;
        this.f128262t = -1;
        this.f128264u = -1;
        this.f128266v = 0;
        this.f128268w = 0;
        this.f128270x = 0;
        this.f128272y = new int[2];
        this.f128274z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = Float.NaN;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new d(this, d.a.LEFT);
        this.R = new d(this, d.a.TOP);
        this.S = new d(this, d.a.RIGHT);
        this.T = new d(this, d.a.BOTTOM);
        this.U = new d(this, d.a.BASELINE);
        this.V = new d(this, d.a.CENTER_X);
        this.W = new d(this, d.a.CENTER_Y);
        d dVar = new d(this, d.a.CENTER);
        this.X = dVar;
        this.Y = new d[]{this.Q, this.S, this.R, this.T, this.U, dVar};
        this.Z = new ArrayList<>();
        this.f128225a0 = new boolean[2];
        b bVar = b.FIXED;
        this.f128227b0 = new b[]{bVar, bVar};
        this.f128229c0 = null;
        this.f128231d0 = 0;
        this.f128233e0 = 0;
        this.f128235f0 = 0.0f;
        this.f128237g0 = -1;
        this.f128239h0 = 0;
        this.f128241i0 = 0;
        this.f128243j0 = 0;
        this.f128245k0 = 0;
        this.f128247l0 = 0;
        this.f128249m0 = 0;
        this.f128251n0 = 0;
        float f10 = A1;
        this.f128257q0 = f10;
        this.f128259r0 = f10;
        this.f128263t0 = 0;
        this.f128265u0 = 0;
        this.f128267v0 = false;
        this.f128269w0 = null;
        this.f128271x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new e[]{null, null};
        this.P0 = new e[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        d();
    }

    public float A() {
        return this.f128235f0;
    }

    public boolean A0(int i10) {
        return this.f128225a0[i10];
    }

    public void A1(boolean z10) {
        this.G = z10;
    }

    public int B() {
        return this.f128237g0;
    }

    public boolean B0() {
        d dVar = this.Q;
        d dVar2 = dVar.f128184f;
        if (dVar2 != null && dVar2.f128184f == dVar) {
            return true;
        }
        d dVar3 = this.S;
        d dVar4 = dVar3.f128184f;
        return dVar4 != null && dVar4.f128184f == dVar3;
    }

    public void B1(float f10) {
        this.f128257q0 = f10;
    }

    public boolean C() {
        return this.L;
    }

    public boolean C0() {
        return this.M;
    }

    public void C1(int i10) {
        this.J0 = i10;
    }

    public int D() {
        if (this.f128265u0 == 8) {
            return 0;
        }
        return this.f128233e0;
    }

    public boolean D0() {
        d dVar = this.R;
        d dVar2 = dVar.f128184f;
        if (dVar2 != null && dVar2.f128184f == dVar) {
            return true;
        }
        d dVar3 = this.T;
        d dVar4 = dVar3.f128184f;
        return dVar4 != null && dVar4.f128184f == dVar3;
    }

    public void D1(int i10, int i11) {
        this.f128239h0 = i10;
        int i12 = i11 - i10;
        this.f128231d0 = i12;
        int i13 = this.f128253o0;
        if (i12 < i13) {
            this.f128231d0 = i13;
        }
    }

    public float E() {
        return this.f128257q0;
    }

    public boolean E0() {
        return this.N;
    }

    public void E1(b bVar) {
        this.f128227b0[0] = bVar;
    }

    public e F() {
        if (!B0()) {
            return null;
        }
        e eVar = this;
        e eVar2 = null;
        while (eVar2 == null && eVar != null) {
            d dVarR = eVar.r(d.a.LEFT);
            d dVarK = dVarR == null ? null : dVarR.k();
            e eVarI = dVarK == null ? null : dVarK.i();
            if (eVarI == U()) {
                return eVar;
            }
            d dVarK2 = eVarI == null ? null : eVarI.r(d.a.RIGHT).k();
            if (dVarK2 == null || dVarK2.i() == eVar) {
                eVar = eVarI;
            } else {
                eVar2 = eVar;
            }
        }
        return eVar2;
    }

    public boolean F0() {
        return this.f128240i && this.f128265u0 != 8;
    }

    public void F1(int i10, int i11, int i12, float f10) {
        this.f128268w = i10;
        this.f128274z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.A = i12;
        this.B = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f128268w = 2;
    }

    public int G() {
        return this.J0;
    }

    public boolean G0() {
        if (this.f128254p) {
            return true;
        }
        return this.Q.o() && this.S.o();
    }

    public void G1(float f10) {
        this.N0[0] = f10;
    }

    public b H() {
        return this.f128227b0[0];
    }

    public boolean H0() {
        if (this.f128256q) {
            return true;
        }
        return this.R.o() && this.T.o();
    }

    public void H1(int i10, boolean z10) {
        this.f128225a0[i10] = z10;
    }

    public int I() {
        d dVar = this.Q;
        int i10 = dVar != null ? dVar.f128185g : 0;
        d dVar2 = this.S;
        return dVar2 != null ? i10 + dVar2.f128185g : i10;
    }

    public boolean I0() {
        return this.f128229c0 == null;
    }

    public void I1(boolean z10) {
        this.M = z10;
    }

    public int J() {
        return this.O;
    }

    public boolean J0() {
        return this.f128270x == 0 && this.f128235f0 == 0.0f && this.C == 0 && this.D == 0 && this.f128227b0[1] == b.MATCH_CONSTRAINT;
    }

    public void J1(boolean z10) {
        this.N = z10;
    }

    public int K() {
        return this.P;
    }

    public boolean K0() {
        return this.f128268w == 0 && this.f128235f0 == 0.0f && this.f128274z == 0 && this.A == 0 && this.f128227b0[0] == b.MATCH_CONSTRAINT;
    }

    public void K1(int i10, int i11) {
        this.O = i10;
        this.P = i11;
        O1(false);
    }

    public int L() {
        return o0();
    }

    public boolean L0() {
        return this.f128260s;
    }

    public void L1(int i10, int i11) {
        if (i11 == 0) {
            d2(i10);
        } else if (i11 == 1) {
            z1(i10);
        }
    }

    public int M(int i10) {
        if (i10 == 0) {
            return m0();
        }
        if (i10 == 1) {
            return D();
        }
        return 0;
    }

    public boolean M0() {
        return this.F;
    }

    public void M1(int i10) {
        this.J[1] = i10;
    }

    public int N() {
        return this.J[1];
    }

    public void N0() {
        this.f128258r = true;
    }

    public void N1(int i10) {
        this.J[0] = i10;
    }

    public int O() {
        return this.J[0];
    }

    public void O0() {
        this.f128260s = true;
    }

    public void O1(boolean z10) {
        this.f128240i = z10;
    }

    public int P() {
        return this.f128255p0;
    }

    public boolean P0(int i10) {
        char c10 = i10 == 0 ? (char) 1 : (char) 0;
        b[] bVarArr = this.f128227b0;
        b bVar = bVarArr[i10];
        b bVar2 = bVarArr[c10];
        b bVar3 = b.MATCH_CONSTRAINT;
        return bVar == bVar3 && bVar2 == bVar3;
    }

    public void P1(int i10) {
        if (i10 < 0) {
            this.f128255p0 = 0;
        } else {
            this.f128255p0 = i10;
        }
    }

    public int Q() {
        return this.f128253o0;
    }

    public boolean Q0() {
        b[] bVarArr = this.f128227b0;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public void Q1(int i10) {
        if (i10 < 0) {
            this.f128253o0 = 0;
        } else {
            this.f128253o0 = i10;
        }
    }

    public e R(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.T).f128184f) != null && dVar2.f128184f == dVar) {
                return dVar2.f128182d;
            }
            return null;
        }
        d dVar3 = this.S;
        d dVar4 = dVar3.f128184f;
        if (dVar4 == null || dVar4.f128184f != dVar3) {
            return null;
        }
        return dVar4.f128182d;
    }

    public void R0() {
        this.Q.x();
        this.R.x();
        this.S.x();
        this.T.x();
        this.U.x();
        this.V.x();
        this.W.x();
        this.X.x();
        this.f128229c0 = null;
        this.K = Float.NaN;
        this.f128231d0 = 0;
        this.f128233e0 = 0;
        this.f128235f0 = 0.0f;
        this.f128237g0 = -1;
        this.f128239h0 = 0;
        this.f128241i0 = 0;
        this.f128247l0 = 0;
        this.f128249m0 = 0;
        this.f128251n0 = 0;
        this.f128253o0 = 0;
        this.f128255p0 = 0;
        float f10 = A1;
        this.f128257q0 = f10;
        this.f128259r0 = f10;
        b[] bVarArr = this.f128227b0;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f128261s0 = null;
        this.f128263t0 = 0;
        this.f128265u0 = 0;
        this.f128271x0 = null;
        this.G0 = false;
        this.H0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = false;
        float[] fArr = this.N0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f128262t = -1;
        this.f128264u = -1;
        int[] iArr = this.J;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f128268w = 0;
        this.f128270x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.f128274z = 0;
        this.C = 0;
        this.f128238h = false;
        this.H = -1;
        this.I = 1.0f;
        this.I0 = false;
        boolean[] zArr = this.f128236g;
        zArr[0] = true;
        zArr[1] = true;
        this.N = false;
        boolean[] zArr2 = this.f128225a0;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f128240i = true;
        int[] iArr2 = this.f128272y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f128246l = -1;
        this.f128248m = -1;
    }

    public void R1(int i10, int i11) {
        this.f128247l0 = i10;
        this.f128249m0 = i11;
    }

    public int S() {
        int iMax = this.f128233e0;
        if (this.f128227b0[1] == b.MATCH_CONSTRAINT) {
            if (this.f128270x == 1) {
                iMax = Math.max(this.C, iMax);
            } else {
                iMax = this.C;
                if (iMax > 0) {
                    this.f128233e0 = iMax;
                } else {
                    iMax = 0;
                }
            }
            int i10 = this.D;
            if (i10 > 0 && i10 < iMax) {
                return i10;
            }
        }
        return iMax;
    }

    public void S0() {
        U0();
        W1(A1);
        B1(A1);
    }

    public void S1(int i10, int i11) {
        this.f128239h0 = i10;
        this.f128241i0 = i11;
    }

    public int T() {
        int i10 = this.f128231d0;
        int iMax = 0;
        if (this.f128227b0[0] != b.MATCH_CONSTRAINT) {
            return i10;
        }
        if (this.f128268w == 1) {
            iMax = Math.max(this.f128274z, i10);
        } else {
            int i11 = this.f128274z;
            if (i11 > 0) {
                this.f128231d0 = i11;
                iMax = i11;
            }
        }
        int i12 = this.A;
        return (i12 <= 0 || i12 >= iMax) ? iMax : i12;
    }

    public void T0(d dVar) {
        if (U() != null && (U() instanceof f) && ((f) U()).L2()) {
            return;
        }
        d dVarR = r(d.a.LEFT);
        d dVarR2 = r(d.a.RIGHT);
        d dVarR3 = r(d.a.TOP);
        d dVarR4 = r(d.a.BOTTOM);
        d dVarR5 = r(d.a.CENTER);
        d dVarR6 = r(d.a.CENTER_X);
        d dVarR7 = r(d.a.CENTER_Y);
        if (dVar == dVarR5) {
            if (dVarR.p() && dVarR2.p() && dVarR.k() == dVarR2.k()) {
                dVarR.x();
                dVarR2.x();
            }
            if (dVarR3.p() && dVarR4.p() && dVarR3.k() == dVarR4.k()) {
                dVarR3.x();
                dVarR4.x();
            }
            this.f128257q0 = 0.5f;
            this.f128259r0 = 0.5f;
        } else if (dVar == dVarR6) {
            if (dVarR.p() && dVarR2.p() && dVarR.k().i() == dVarR2.k().i()) {
                dVarR.x();
                dVarR2.x();
            }
            this.f128257q0 = 0.5f;
        } else if (dVar == dVarR7) {
            if (dVarR3.p() && dVarR4.p() && dVarR3.k().i() == dVarR4.k().i()) {
                dVarR3.x();
                dVarR4.x();
            }
            this.f128259r0 = 0.5f;
        } else if (dVar == dVarR || dVar == dVarR2) {
            if (dVarR.p() && dVarR.k() == dVarR2.k()) {
                dVarR5.x();
            }
        } else if ((dVar == dVarR3 || dVar == dVarR4) && dVarR3.p() && dVarR3.k() == dVarR4.k()) {
            dVarR5.x();
        }
        dVar.x();
    }

    public void T1(e eVar) {
        this.f128229c0 = eVar;
    }

    public e U() {
        return this.f128229c0;
    }

    public void U0() {
        e eVarU = U();
        if (eVarU != null && (eVarU instanceof f) && ((f) U()).L2()) {
            return;
        }
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Z.get(i10).x();
        }
    }

    public void U1(int i10, int i11) {
        if (i11 == 0) {
            this.f128243j0 = i10;
        } else if (i11 == 1) {
            this.f128245k0 = i10;
        }
    }

    public e V(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.R).f128184f) != null && dVar2.f128184f == dVar) {
                return dVar2.f128182d;
            }
            return null;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f128184f;
        if (dVar4 == null || dVar4.f128184f != dVar3) {
            return null;
        }
        return dVar4.f128182d;
    }

    public void V0() {
        this.f128254p = false;
        this.f128256q = false;
        this.f128258r = false;
        this.f128260s = false;
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.Z.get(i10).y();
        }
    }

    public void V1(String str) {
        this.f128271x0 = str;
    }

    public int W(int i10) {
        if (i10 == 0) {
            return this.f128243j0;
        }
        if (i10 == 1) {
            return this.f128245k0;
        }
        return 0;
    }

    public void W0(i0.c cVar) {
        this.Q.z(cVar);
        this.R.z(cVar);
        this.S.z(cVar);
        this.T.z(cVar);
        this.U.z(cVar);
        this.X.z(cVar);
        this.V.z(cVar);
        this.W.z(cVar);
    }

    public void W1(float f10) {
        this.f128259r0 = f10;
    }

    public int X() {
        return o0() + this.f128231d0;
    }

    public void X0() {
        this.f128258r = false;
        this.f128260s = false;
    }

    public void X1(int i10) {
        this.K0 = i10;
    }

    public int Y() {
        return this.f128239h0 + this.f128247l0;
    }

    public StringBuilder Y0(StringBuilder sb2) {
        sb2.append("{\n");
        Z0(sb2, "left", this.Q);
        Z0(sb2, "top", this.R);
        Z0(sb2, "right", this.S);
        Z0(sb2, "bottom", this.T);
        Z0(sb2, "baseline", this.U);
        Z0(sb2, "centerX", this.V);
        Z0(sb2, "centerY", this.W);
        d1(sb2, this.X, this.K);
        f1(sb2, "width", this.f128231d0, this.f128253o0, this.J[0], this.f128246l, this.f128274z, this.f128268w, this.B, this.N0[0]);
        f1(sb2, "height", this.f128233e0, this.f128255p0, this.J[1], this.f128248m, this.C, this.f128270x, this.E, this.N0[1]);
        e1(sb2, "dimensionRatio", this.f128235f0, this.f128237g0);
        a1(sb2, "horizontalBias", this.f128257q0, A1);
        a1(sb2, "verticalBias", this.f128259r0, A1);
        sb2.append("}\n");
        return sb2;
    }

    public void Y1(int i10, int i11) {
        this.f128241i0 = i10;
        int i12 = i11 - i10;
        this.f128233e0 = i12;
        int i13 = this.f128255p0;
        if (i12 < i13) {
            this.f128233e0 = i13;
        }
    }

    public int Z() {
        return this.f128241i0 + this.f128249m0;
    }

    public final void Z0(StringBuilder sb2, String str, d dVar) {
        if (dVar.f128184f == null) {
            return;
        }
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f128184f);
        sb2.append("',");
        sb2.append(dVar.f128185g);
        sb2.append(",");
        sb2.append(dVar.f128186h);
        sb2.append(",");
        sb2.append(" ] ,\n");
    }

    public void Z1(b bVar) {
        this.f128227b0[1] = bVar;
    }

    public p a0(int i10) {
        if (i10 == 0) {
            return this.f128232e;
        }
        if (i10 == 1) {
            return this.f128234f;
        }
        return null;
    }

    public final void a1(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public void a2(int i10, int i11, int i12, float f10) {
        this.f128270x = i10;
        this.C = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.D = i12;
        this.E = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f128270x = 2;
    }

    public void b0(StringBuilder sb2) {
        sb2.append(q.a.f140822e + this.f128252o + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f128231d0);
        sb2.append(sb3.toString());
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb2.append("    actualHeight:" + this.f128233e0);
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb2.append("    actualLeft:" + this.f128239h0);
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb2.append("    actualTop:" + this.f128241i0);
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        d0(sb2, "left", this.Q);
        d0(sb2, "top", this.R);
        d0(sb2, "right", this.S);
        d0(sb2, "bottom", this.T);
        d0(sb2, "baseline", this.U);
        d0(sb2, "centerX", this.V);
        d0(sb2, "centerY", this.W);
        c0(sb2, "    width", this.f128231d0, this.f128253o0, this.J[0], this.f128246l, this.f128274z, this.f128268w, this.B, this.f128227b0[0], this.N0[0]);
        c0(sb2, "    height", this.f128233e0, this.f128255p0, this.J[1], this.f128248m, this.C, this.f128270x, this.E, this.f128227b0[1], this.N0[1]);
        e1(sb2, "    dimensionRatio", this.f128235f0, this.f128237g0);
        a1(sb2, "    horizontalBias", this.f128257q0, A1);
        a1(sb2, "    verticalBias", this.f128259r0, A1);
        b1(sb2, "    horizontalChainStyle", this.J0, 0);
        b1(sb2, "    verticalChainStyle", this.K0, 0);
        sb2.append("  }");
    }

    public final void b1(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public void b2(float f10) {
        this.N0[1] = f10;
    }

    public final void c0(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, b bVar, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        c1(sb2, "      behavior", bVar.toString(), b.FIXED.toString());
        b1(sb2, "      size", i10, 0);
        b1(sb2, "      min", i11, 0);
        b1(sb2, "      max", i12, Integer.MAX_VALUE);
        b1(sb2, "      matchMin", i14, 0);
        b1(sb2, "      matchDef", i15, 0);
        a1(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public final void c1(StringBuilder sb2, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(str2);
        sb2.append(",\n");
    }

    public void c2(int i10) {
        this.f128265u0 = i10;
    }

    public final void d() {
        this.Z.add(this.Q);
        this.Z.add(this.R);
        this.Z.add(this.S);
        this.Z.add(this.T);
        this.Z.add(this.V);
        this.Z.add(this.W);
        this.Z.add(this.X);
        this.Z.add(this.U);
    }

    public final void d0(StringBuilder sb2, String str, d dVar) {
        if (dVar.f128184f == null) {
            return;
        }
        sb2.append(b0.f81731a);
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f128184f);
        sb2.append("'");
        if (dVar.f128186h != Integer.MIN_VALUE || dVar.f128185g != 0) {
            sb2.append(",");
            sb2.append(dVar.f128185g);
            if (dVar.f128186h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f128186h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public final void d1(StringBuilder sb2, d dVar, float f10) {
        if (dVar.f128184f == null || Float.isNaN(f10)) {
            return;
        }
        sb2.append("circle : [ '");
        sb2.append(dVar.f128184f);
        sb2.append("',");
        sb2.append(dVar.f128185g);
        sb2.append(",");
        sb2.append(f10);
        sb2.append(",");
        sb2.append(" ] ,\n");
    }

    public void d2(int i10) {
        this.f128231d0 = i10;
        int i11 = this.f128253o0;
        if (i10 < i11) {
            this.f128231d0 = i11;
        }
    }

    public void e(f fVar, i0.e eVar, HashSet<e> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, eVar, this);
            hashSet.remove(this);
            g(eVar, fVar.T2(64));
        }
        if (i10 == 0) {
            HashSet<d> hashSetE = this.Q.e();
            if (hashSetE != null) {
                Iterator<d> it = hashSetE.iterator();
                while (it.hasNext()) {
                    it.next().f128182d.e(fVar, eVar, hashSet, i10, true);
                }
            }
            HashSet<d> hashSetE2 = this.S.e();
            if (hashSetE2 != null) {
                Iterator<d> it2 = hashSetE2.iterator();
                while (it2.hasNext()) {
                    it2.next().f128182d.e(fVar, eVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSetE3 = this.R.e();
        if (hashSetE3 != null) {
            Iterator<d> it3 = hashSetE3.iterator();
            while (it3.hasNext()) {
                it3.next().f128182d.e(fVar, eVar, hashSet, i10, true);
            }
        }
        HashSet<d> hashSetE4 = this.T.e();
        if (hashSetE4 != null) {
            Iterator<d> it4 = hashSetE4.iterator();
            while (it4.hasNext()) {
                it4.next().f128182d.e(fVar, eVar, hashSet, i10, true);
            }
        }
        HashSet<d> hashSetE5 = this.U.e();
        if (hashSetE5 != null) {
            Iterator<d> it5 = hashSetE5.iterator();
            while (it5.hasNext()) {
                it5.next().f128182d.e(fVar, eVar, hashSet, i10, true);
            }
        }
    }

    public int e0() {
        return p0();
    }

    public final void e1(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f10);
        sb2.append(",");
        sb2.append(i10);
        sb2.append("");
        sb2.append("],\n");
    }

    public void e2(boolean z10) {
        this.F = z10;
    }

    public boolean f() {
        return (this instanceof n) || (this instanceof h);
    }

    public String f0() {
        return this.f128271x0;
    }

    public final void f1(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        b1(sb2, "size", i10, Integer.MIN_VALUE);
        b1(sb2, "min", i11, 0);
        b1(sb2, "max", i12, Integer.MAX_VALUE);
        b1(sb2, "matchMin", i14, 0);
        b1(sb2, "matchDef", i15, 0);
        b1(sb2, "matchPercent", i15, 1);
        a1(sb2, "matchConstraintPercent", f10, 1.0f);
        a1(sb2, "weight", f11, 1.0f);
        b1(sb2, "override", i13, 1);
        sb2.append("},\n");
    }

    public void f2(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f128266v = i10;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:194:0x02fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:199:0x0303  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:203:0x030d  */
    /* JADX WARN: Code duplicated, block: B:206:0x0319  */
    /* JADX WARN: Code duplicated, block: B:209:0x0320  */
    /* JADX WARN: Code duplicated, block: B:211:0x0324  */
    /* JADX WARN: Code duplicated, block: B:214:0x033f  */
    /* JADX WARN: Code duplicated, block: B:235:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:250:0x0439  */
    /* JADX WARN: Code duplicated, block: B:267:0x048b  */
    /* JADX WARN: Code duplicated, block: B:270:0x049b  */
    /* JADX WARN: Code duplicated, block: B:271:0x049d  */
    /* JADX WARN: Code duplicated, block: B:273:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:310:0x0578  */
    /* JADX WARN: Code duplicated, block: B:312:0x057f  */
    /* JADX WARN: Code duplicated, block: B:314:0x0586  */
    /* JADX WARN: Code duplicated, block: B:315:0x0595  */
    /* JADX WARN: Code duplicated, block: B:316:0x0598  */
    /* JADX WARN: Code duplicated, block: B:319:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:322:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public void g(i0.e eVar, boolean z10) {
        boolean z11;
        boolean z12;
        e eVar2;
        e eVar3;
        boolean zB0;
        boolean zD0;
        int i10;
        i0.i iVar;
        int i11;
        int i12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        b bVar;
        b bVar2;
        boolean z15;
        i0.i iVar2;
        int i15;
        boolean z16;
        boolean z17;
        boolean z18;
        i0.i iVar3;
        i0.i iVar4;
        i0.i iVar5;
        int i16;
        char c10;
        int i17;
        int i18;
        int i19;
        i0.e eVar4;
        i0.f fVar;
        boolean z19;
        t0.n nVar;
        t0.l lVar;
        int i20;
        int i21;
        int i22;
        t0.l lVar2;
        t0.n nVar2;
        i0.e eVar5 = eVar;
        i0.i iVarS = eVar5.s(this.Q);
        i0.i iVarS2 = eVar5.s(this.S);
        i0.i iVarS3 = eVar5.s(this.R);
        i0.i iVarS4 = eVar5.s(this.T);
        i0.i iVarS5 = eVar5.s(this.U);
        e eVar6 = this.f128229c0;
        if (eVar6 == null) {
            z11 = false;
            z12 = false;
        } else {
            z12 = eVar6 != null && eVar6.f128227b0[0] == b.WRAP_CONTENT;
            z11 = eVar6 != null && eVar6.f128227b0[1] == b.WRAP_CONTENT;
            int i23 = this.f128266v;
            if (i23 == 1) {
                z11 = false;
            } else if (i23 == 2) {
                z12 = false;
            } else if (i23 == 3) {
                z11 = false;
                z12 = false;
            }
        }
        if (this.f128265u0 == 8 && !this.f128267v0 && !s0()) {
            boolean[] zArr = this.f128225a0;
            if (!zArr[0] && !zArr[1]) {
                return;
            }
        }
        boolean z20 = this.f128254p;
        if (z20 || this.f128256q) {
            if (z20) {
                eVar5.f(iVarS, this.f128239h0);
                eVar5.f(iVarS2, this.f128239h0 + this.f128231d0);
                if (z12 && (eVar3 = this.f128229c0) != null) {
                    if (this.f128244k) {
                        f fVar2 = (f) eVar3;
                        fVar2.v2(this.Q);
                        fVar2.u2(this.S);
                    } else {
                        eVar5.h(eVar5.s(eVar3.S), iVarS2, 0, 5);
                    }
                }
            }
            if (this.f128256q) {
                eVar5.f(iVarS3, this.f128241i0);
                eVar5.f(iVarS4, this.f128241i0 + this.f128233e0);
                if (this.U.n()) {
                    eVar5.f(iVarS5, this.f128241i0 + this.f128251n0);
                }
                if (z11 && (eVar2 = this.f128229c0) != null) {
                    if (this.f128244k) {
                        f fVar3 = (f) eVar2;
                        fVar3.A2(this.R);
                        fVar3.z2(this.T);
                    } else {
                        eVar5.h(eVar5.s(eVar2.T), iVarS4, 0, 5);
                    }
                }
            }
            if (this.f128254p && this.f128256q) {
                this.f128254p = false;
                this.f128256q = false;
                return;
            }
        }
        i0.f fVar4 = i0.e.C;
        if (fVar4 != null) {
            fVar4.F++;
        }
        if (z10 && (lVar2 = this.f128232e) != null && (nVar2 = this.f128234f) != null) {
            t0.f fVar5 = lVar2.f135964h;
            if (fVar5.f135903j && lVar2.f135965i.f135903j && nVar2.f135964h.f135903j && nVar2.f135965i.f135903j) {
                if (fVar4 != null) {
                    fVar4.f90220w++;
                }
                eVar5.f(iVarS, fVar5.f135900g);
                eVar5.f(iVarS2, this.f128232e.f135965i.f135900g);
                eVar5.f(iVarS3, this.f128234f.f135964h.f135900g);
                eVar5.f(iVarS4, this.f128234f.f135965i.f135900g);
                eVar5.f(iVarS5, this.f128234f.f135939k.f135900g);
                if (this.f128229c0 != null) {
                    if (z12 && this.f128236g[0] && !B0()) {
                        eVar5.h(eVar5.s(this.f128229c0.S), iVarS2, 0, 8);
                    }
                    if (z11 && this.f128236g[1] && !D0()) {
                        eVar5.h(eVar5.s(this.f128229c0.T), iVarS4, 0, 8);
                    }
                }
                this.f128254p = false;
                this.f128256q = false;
                return;
            }
        }
        if (fVar4 != null) {
            fVar4.f90221x++;
        }
        if (this.f128229c0 != null) {
            if (x0(0)) {
                ((f) this.f128229c0).r2(this, 0);
                zB0 = true;
                i22 = 1;
            } else {
                zB0 = B0();
                i22 = 1;
            }
            if (x0(i22)) {
                ((f) this.f128229c0).r2(this, i22);
                zD0 = true;
            } else {
                zD0 = D0();
            }
            if (!zB0 && z12 && this.f128265u0 != 8 && this.Q.f128184f == null && this.S.f128184f == null) {
                eVar5.h(eVar5.s(this.f128229c0.S), iVarS2, 0, 1);
            }
            if (!zD0 && z11 && this.f128265u0 != 8 && this.R.f128184f == null && this.T.f128184f == null && this.U == null) {
                eVar5.h(eVar5.s(this.f128229c0.T), iVarS4, 0, 1);
            }
        } else {
            zB0 = false;
            zD0 = false;
        }
        int i24 = this.f128231d0;
        int i25 = this.f128253o0;
        if (i24 >= i25) {
            i25 = i24;
        }
        int i26 = this.f128233e0;
        int i27 = this.f128255p0;
        if (i26 >= i27) {
            i27 = i26;
        }
        b[] bVarArr = this.f128227b0;
        b bVar3 = bVarArr[0];
        i0.i iVar6 = iVarS4;
        b bVar4 = b.MATCH_CONSTRAINT;
        boolean z21 = bVar3 != bVar4;
        b bVar5 = bVarArr[1];
        boolean z22 = zB0;
        boolean z23 = bVar5 != bVar4;
        boolean z24 = zD0;
        int i28 = this.f128237g0;
        this.H = i28;
        int i29 = i27;
        float f10 = this.f128235f0;
        this.I = f10;
        int i30 = this.f128268w;
        int i31 = this.f128270x;
        if (f10 > 0.0f) {
            i10 = i25;
            if (this.f128265u0 != 8) {
                i11 = (bVar3 == bVar4 && i30 == 0) ? 3 : i30;
                int i32 = (bVar5 == bVar4 && i31 == 0) ? 3 : i31;
                if (bVar3 == bVar4 && bVar5 == bVar4) {
                    iVar = iVarS2;
                    i21 = 3;
                    if (i11 == 3 && i32 == 3) {
                        i2(z12, z11, z21, z23);
                    }
                    i29 = i29;
                    z13 = true;
                    i12 = i32;
                    i13 = i10;
                    int[] iArr = this.f128272y;
                    iArr[0] = i11;
                    iArr[1] = i12;
                    this.f128238h = z13;
                    if (z13) {
                        int i33 = this.H;
                        i14 = -1;
                        boolean z25 = i33 != 0 || i33 == -1;
                        if (z13 || !((i20 = this.H) == 1 || i20 == i14)) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        bVar = this.f128227b0[0];
                        bVar2 = b.WRAP_CONTENT;
                        if (bVar == bVar2 || !(this instanceof f)) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        if (z15) {
                            i13 = 0;
                        }
                        boolean z26 = !this.X.p();
                        boolean[] zArr2 = this.f128225a0;
                        boolean z27 = zArr2[0];
                        boolean z28 = zArr2[1];
                        if (this.f128262t != 2 || this.f128254p) {
                            z18 = z12;
                            iVar2 = iVarS3;
                            z17 = z22;
                            z16 = z24;
                            i15 = i11;
                        } else {
                            if (z10 && (lVar = this.f128232e) != null) {
                                t0.f fVar6 = lVar.f135964h;
                                if (fVar6.f135903j && lVar.f135965i.f135903j) {
                                    if (z10) {
                                        eVar5.f(iVarS, fVar6.f135900g);
                                        i0.i iVar7 = iVar;
                                        eVar5.f(iVar7, this.f128232e.f135965i.f135900g);
                                        if (this.f128229c0 != null && z12 && this.f128236g[0] && !B0()) {
                                            eVar5.h(eVar5.s(this.f128229c0.S), iVar7, 0, 8);
                                        }
                                        iVar = iVar7;
                                    }
                                    z18 = z12;
                                    iVar2 = iVarS3;
                                    z17 = z22;
                                    z16 = z24;
                                    i15 = i11;
                                }
                            }
                            i0.i iVar8 = iVar;
                            e eVar7 = this.f128229c0;
                            i0.i iVarS6 = eVar7 != null ? eVar5.s(eVar7.S) : null;
                            e eVar8 = this.f128229c0;
                            i0.i iVarS7 = eVar8 != null ? eVar5.s(eVar8.Q) : null;
                            boolean z29 = this.f128236g[0];
                            b[] bVarArr2 = this.f128227b0;
                            b bVar6 = bVarArr2[0];
                            d dVar = this.Q;
                            i15 = i11;
                            d dVar2 = this.S;
                            z13 = z13;
                            z18 = z12;
                            int i34 = this.f128239h0;
                            boolean z30 = z25;
                            i0.i iVar9 = iVarS7;
                            int i35 = this.f128253o0;
                            int i36 = this.J[0];
                            float f11 = this.f128257q0;
                            boolean z31 = bVarArr2[1] == bVar4;
                            iVarS = iVarS;
                            iVar6 = iVar6;
                            bVar4 = bVar4;
                            z11 = z11;
                            z17 = z22;
                            z16 = z24;
                            bVar2 = bVar2;
                            iVar = iVar8;
                            iVar2 = iVarS3;
                            eVar5 = eVar;
                            i(eVar5, true, z18, z11, z29, iVar9, iVarS6, bVar6, z15, dVar, dVar2, i34, i13, i35, i36, f11, z30, z31, z17, z16, z27, i15, i12, this.f128274z, this.A, this.B, z26);
                        }
                        if (z10 || (nVar = this.f128234f) == null) {
                            iVar3 = iVar2;
                            iVar4 = iVar6;
                            iVar5 = r24;
                            i16 = 0;
                            c10 = 1;
                            i17 = 8;
                            i18 = 1;
                        } else {
                            t0.f fVar7 = nVar.f135964h;
                            if (fVar7.f135903j && nVar.f135965i.f135903j) {
                                int i37 = fVar7.f135900g;
                                iVar3 = iVar2;
                                eVar5.f(iVar3, i37);
                                iVar4 = iVar6;
                                eVar5.f(iVar4, this.f128234f.f135965i.f135900g);
                                iVar5 = iVarS5;
                                eVar5.f(iVar5, this.f128234f.f135939k.f135900g);
                                e eVar9 = this.f128229c0;
                                if (eVar9 == null || z16 || !z11) {
                                    i16 = 0;
                                    c10 = 1;
                                } else {
                                    c10 = 1;
                                    if (this.f128236g[1]) {
                                        i16 = 0;
                                        i17 = 8;
                                        eVar5.h(eVar5.s(eVar9.T), iVar4, 0, 8);
                                    } else {
                                        i16 = 0;
                                    }
                                    i18 = i16;
                                }
                                i17 = 8;
                                i18 = i16;
                            } else {
                                iVar3 = iVar2;
                                iVar4 = iVar6;
                                iVar5 = r24;
                                i16 = 0;
                                c10 = 1;
                                i17 = 8;
                                i18 = 1;
                            }
                        }
                        if (this.f128264u == 2) {
                            i19 = i16;
                        } else {
                            i19 = i18;
                        }
                        if (i19 == 0 && !this.f128256q) {
                            boolean z32 = (this.f128227b0[c10] == bVar2 && (this instanceof f)) ? c10 : i16;
                            int i38 = z32 != 0 ? i16 : i29;
                            e eVar10 = this.f128229c0;
                            i0.i iVarS8 = eVar10 != null ? eVar5.s(eVar10.T) : null;
                            e eVar11 = this.f128229c0;
                            i0.i iVarS9 = eVar11 != null ? eVar5.s(eVar11.R) : null;
                            if (this.f128251n0 > 0 || this.f128265u0 == i17) {
                                z19 = z26;
                                d dVar3 = this.U;
                                if (dVar3.f128184f != null) {
                                    eVar5.e(iVar5, iVar3, t(), i17);
                                    eVar5.e(iVar5, eVar5.s(this.U.f128184f), this.U.g(), i17);
                                    if (z11) {
                                        eVar5.h(iVarS8, eVar5.s(this.T), i16, 5);
                                    }
                                    z19 = i16;
                                } else if (this.f128265u0 == i17) {
                                    eVar5.e(iVar5, iVar3, dVar3.g(), i17);
                                    z19 = z26;
                                } else {
                                    eVar5.e(iVar5, iVar3, t(), i17);
                                    z19 = z26;
                                }
                            }
                            z19 = z26;
                            boolean z33 = this.f128236g[c10];
                            b[] bVarArr3 = this.f128227b0;
                            int i39 = i16;
                            char c11 = c10;
                            i(eVar, false, z11, z18, z33, iVarS9, iVarS8, bVarArr3[c10], z32, this.R, this.T, this.f128241i0, i38, this.f128255p0, this.J[c11], this.f128259r0, z14, bVarArr3[i39] == bVar4 ? c11 : i39, z16, z17, z28, i12, i15, this.C, this.D, this.E, z19);
                        }
                        if (!z13) {
                            eVar4 = eVar;
                        } else if (this.H == 1) {
                            eVar.k(iVar4, iVar3, iVar, iVarS, this.I, 8);
                            eVar4 = eVar;
                        } else {
                            eVar.k(iVar, iVarS, iVar4, iVar3, this.I, 8);
                            eVar4 = eVar;
                        }
                        if (this.X.p()) {
                            eVar4.b(this, this.X.k().i(), (float) Math.toRadians(this.K + 90.0f), this.X.g());
                        }
                        this.f128254p = false;
                        this.f128256q = false;
                        fVar = i0.e.C;
                        if (fVar != null) {
                            fVar.S = eVar4.K();
                            i0.e.C.T = eVar4.L();
                        }
                    }
                    i14 = -1;
                    if (z13) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    bVar = this.f128227b0[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        i13 = 0;
                    }
                    boolean z210 = !this.X.p();
                    boolean[] zArr3 = this.f128225a0;
                    boolean z211 = zArr3[0];
                    boolean z212 = zArr3[1];
                    if (this.f128262t != 2) {
                        z18 = z12;
                        iVar2 = iVarS3;
                        z17 = z22;
                        z16 = z24;
                        i15 = i11;
                    } else {
                        z18 = z12;
                        iVar2 = iVarS3;
                        z17 = z22;
                        z16 = z24;
                        i15 = i11;
                    }
                    if (z10) {
                        iVar3 = iVar2;
                        iVar4 = iVar6;
                        iVar5 = r24;
                        i16 = 0;
                        c10 = 1;
                        i17 = 8;
                        i18 = 1;
                    } else {
                        iVar3 = iVar2;
                        iVar4 = iVar6;
                        iVar5 = r24;
                        i16 = 0;
                        c10 = 1;
                        i17 = 8;
                        i18 = 1;
                    }
                    if (this.f128264u == 2) {
                        i19 = i16;
                    } else {
                        i19 = i18;
                    }
                    if (i19 == 0) {
                    }
                    if (!z13) {
                        eVar4 = eVar;
                    } else if (this.H == 1) {
                        eVar.k(iVar4, iVar3, iVar, iVarS, this.I, 8);
                        eVar4 = eVar;
                    } else {
                        eVar.k(iVar, iVarS, iVar4, iVar3, this.I, 8);
                        eVar4 = eVar;
                    }
                    if (this.X.p()) {
                        eVar4.b(this, this.X.k().i(), (float) Math.toRadians(this.K + 90.0f), this.X.g());
                    }
                    this.f128254p = false;
                    this.f128256q = false;
                    fVar = i0.e.C;
                    if (fVar != null) {
                        fVar.S = eVar4.K();
                        i0.e.C.T = eVar4.L();
                    }
                }
                iVar = iVarS2;
                i21 = 3;
                if (bVar3 == bVar4 && i11 == i21) {
                    this.H = 0;
                    int i40 = (int) (i26 * f10);
                    if (bVar5 != bVar4) {
                        i11 = 4;
                        i12 = i32;
                        i13 = i40;
                    } else {
                        iVar6 = iVar6;
                        i29 = i29;
                        i12 = i32;
                        i13 = i40;
                        z13 = true;
                    }
                } else {
                    if (bVar5 == bVar4 && i32 == i21) {
                        this.H = 1;
                        if (i28 == -1) {
                            this.I = 1.0f / f10;
                        }
                        i29 = (int) (this.I * i24);
                        if (bVar3 != bVar4) {
                            iVar6 = iVar6;
                            i13 = i10;
                            z13 = false;
                            i12 = 4;
                        }
                    } else {
                        i29 = i29;
                    }
                    z13 = true;
                    i12 = i32;
                    i13 = i10;
                }
                int[] iArr2 = this.f128272y;
                iArr2[0] = i11;
                iArr2[1] = i12;
                this.f128238h = z13;
                if (z13) {
                    int i310 = this.H;
                    i14 = -1;
                    if (i310 != 0) {
                    }
                    if (z13) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    bVar = this.f128227b0[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        i13 = 0;
                    }
                    boolean z213 = !this.X.p();
                    boolean[] zArr4 = this.f128225a0;
                    boolean z214 = zArr4[0];
                    boolean z215 = zArr4[1];
                    if (this.f128262t != 2) {
                        z18 = z12;
                        iVar2 = iVarS3;
                        z17 = z22;
                        z16 = z24;
                        i15 = i11;
                    } else {
                        z18 = z12;
                        iVar2 = iVarS3;
                        z17 = z22;
                        z16 = z24;
                        i15 = i11;
                    }
                    if (z10) {
                        iVar3 = iVar2;
                        iVar4 = iVar6;
                        iVar5 = r24;
                        i16 = 0;
                        c10 = 1;
                        i17 = 8;
                        i18 = 1;
                    } else {
                        iVar3 = iVar2;
                        iVar4 = iVar6;
                        iVar5 = r24;
                        i16 = 0;
                        c10 = 1;
                        i17 = 8;
                        i18 = 1;
                    }
                    if (this.f128264u == 2) {
                        i19 = i16;
                    } else {
                        i19 = i18;
                    }
                    if (i19 == 0) {
                    }
                    if (!z13) {
                        eVar4 = eVar;
                    } else if (this.H == 1) {
                        eVar.k(iVar4, iVar3, iVar, iVarS, this.I, 8);
                        eVar4 = eVar;
                    } else {
                        eVar.k(iVar, iVarS, iVar4, iVar3, this.I, 8);
                        eVar4 = eVar;
                    }
                    if (this.X.p()) {
                        eVar4.b(this, this.X.k().i(), (float) Math.toRadians(this.K + 90.0f), this.X.g());
                    }
                    this.f128254p = false;
                    this.f128256q = false;
                    fVar = i0.e.C;
                    if (fVar != null) {
                        fVar.S = eVar4.K();
                        i0.e.C.T = eVar4.L();
                    }
                }
                i14 = -1;
                if (z13) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                bVar = this.f128227b0[0];
                bVar2 = b.WRAP_CONTENT;
                if (bVar == bVar2) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                    i13 = 0;
                }
                boolean z216 = !this.X.p();
                boolean[] zArr5 = this.f128225a0;
                boolean z217 = zArr5[0];
                boolean z218 = zArr5[1];
                if (this.f128262t != 2) {
                    z18 = z12;
                    iVar2 = iVarS3;
                    z17 = z22;
                    z16 = z24;
                    i15 = i11;
                } else {
                    z18 = z12;
                    iVar2 = iVarS3;
                    z17 = z22;
                    z16 = z24;
                    i15 = i11;
                }
                if (z10) {
                    iVar3 = iVar2;
                    iVar4 = iVar6;
                    iVar5 = r24;
                    i16 = 0;
                    c10 = 1;
                    i17 = 8;
                    i18 = 1;
                } else {
                    iVar3 = iVar2;
                    iVar4 = iVar6;
                    iVar5 = r24;
                    i16 = 0;
                    c10 = 1;
                    i17 = 8;
                    i18 = 1;
                }
                if (this.f128264u == 2) {
                    i19 = i16;
                } else {
                    i19 = i18;
                }
                if (i19 == 0) {
                }
                if (!z13) {
                    eVar4 = eVar;
                } else if (this.H == 1) {
                    eVar.k(iVar4, iVar3, iVar, iVarS, this.I, 8);
                    eVar4 = eVar;
                } else {
                    eVar.k(iVar, iVarS, iVar4, iVar3, this.I, 8);
                    eVar4 = eVar;
                }
                if (this.X.p()) {
                    eVar4.b(this, this.X.k().i(), (float) Math.toRadians(this.K + 90.0f), this.X.g());
                }
                this.f128254p = false;
                this.f128256q = false;
                fVar = i0.e.C;
                if (fVar != null) {
                    fVar.S = eVar4.K();
                    i0.e.C.T = eVar4.L();
                }
            }
            z13 = false;
            int[] iArr3 = this.f128272y;
            iArr3[0] = i11;
            iArr3[1] = i12;
            this.f128238h = z13;
            if (z13) {
                int i311 = this.H;
                i14 = -1;
                if (i311 != 0) {
                }
                if (z13) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                bVar = this.f128227b0[0];
                bVar2 = b.WRAP_CONTENT;
                if (bVar == bVar2) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                if (z15) {
                    i13 = 0;
                }
                boolean z219 = !this.X.p();
                boolean[] zArr6 = this.f128225a0;
                boolean z2110 = zArr6[0];
                boolean z2111 = zArr6[1];
                if (this.f128262t != 2) {
                    z18 = z12;
                    iVar2 = iVarS3;
                    z17 = z22;
                    z16 = z24;
                    i15 = i11;
                } else {
                    z18 = z12;
                    iVar2 = iVarS3;
                    z17 = z22;
                    z16 = z24;
                    i15 = i11;
                }
                if (z10) {
                    iVar3 = iVar2;
                    iVar4 = iVar6;
                    iVar5 = r24;
                    i16 = 0;
                    c10 = 1;
                    i17 = 8;
                    i18 = 1;
                } else {
                    iVar3 = iVar2;
                    iVar4 = iVar6;
                    iVar5 = r24;
                    i16 = 0;
                    c10 = 1;
                    i17 = 8;
                    i18 = 1;
                }
                if (this.f128264u == 2) {
                    i19 = i16;
                } else {
                    i19 = i18;
                }
                if (i19 == 0) {
                }
                if (!z13) {
                    eVar4 = eVar;
                } else if (this.H == 1) {
                    eVar.k(iVar4, iVar3, iVar, iVarS, this.I, 8);
                    eVar4 = eVar;
                } else {
                    eVar.k(iVar, iVarS, iVar4, iVar3, this.I, 8);
                    eVar4 = eVar;
                }
                if (this.X.p()) {
                    eVar4.b(this, this.X.k().i(), (float) Math.toRadians(this.K + 90.0f), this.X.g());
                }
                this.f128254p = false;
                this.f128256q = false;
                fVar = i0.e.C;
                if (fVar != null) {
                    fVar.S = eVar4.K();
                    i0.e.C.T = eVar4.L();
                }
            }
            i14 = -1;
            if (z13) {
                z14 = false;
            } else {
                z14 = false;
            }
            bVar = this.f128227b0[0];
            bVar2 = b.WRAP_CONTENT;
            if (bVar == bVar2) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (z15) {
                i13 = 0;
            }
            boolean z2112 = !this.X.p();
            boolean[] zArr7 = this.f128225a0;
            boolean z2113 = zArr7[0];
            boolean z2114 = zArr7[1];
            if (this.f128262t != 2) {
                z18 = z12;
                iVar2 = iVarS3;
                z17 = z22;
                z16 = z24;
                i15 = i11;
            } else {
                z18 = z12;
                iVar2 = iVarS3;
                z17 = z22;
                z16 = z24;
                i15 = i11;
            }
            if (z10) {
                iVar3 = iVar2;
                iVar4 = iVar6;
                iVar5 = r24;
                i16 = 0;
                c10 = 1;
                i17 = 8;
                i18 = 1;
            } else {
                iVar3 = iVar2;
                iVar4 = iVar6;
                iVar5 = r24;
                i16 = 0;
                c10 = 1;
                i17 = 8;
                i18 = 1;
            }
            if (this.f128264u == 2) {
                i19 = i16;
            } else {
                i19 = i18;
            }
            if (i19 == 0) {
            }
            if (!z13) {
                eVar4 = eVar;
            } else if (this.H == 1) {
                eVar.k(iVar4, iVar3, iVar, iVarS, this.I, 8);
                eVar4 = eVar;
            } else {
                eVar.k(iVar, iVarS, iVar4, iVar3, this.I, 8);
                eVar4 = eVar;
            }
            if (this.X.p()) {
                eVar4.b(this, this.X.k().i(), (float) Math.toRadians(this.K + 90.0f), this.X.g());
            }
            this.f128254p = false;
            this.f128256q = false;
            fVar = i0.e.C;
            if (fVar != null) {
                fVar.S = eVar4.K();
                i0.e.C.T = eVar4.L();
            }
        }
        i10 = i25;
        iVar = iVarS2;
        i11 = i30;
        i12 = i31;
        i13 = i10;
        z13 = false;
        int[] iArr4 = this.f128272y;
        iArr4[0] = i11;
        iArr4[1] = i12;
        this.f128238h = z13;
        if (z13) {
            int i312 = this.H;
            i14 = -1;
            if (i312 != 0) {
            }
            if (z13) {
                z14 = false;
            } else {
                z14 = false;
            }
            bVar = this.f128227b0[0];
            bVar2 = b.WRAP_CONTENT;
            if (bVar == bVar2) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (z15) {
                i13 = 0;
            }
            boolean z2115 = !this.X.p();
            boolean[] zArr8 = this.f128225a0;
            boolean z2116 = zArr8[0];
            boolean z2117 = zArr8[1];
            if (this.f128262t != 2) {
                z18 = z12;
                iVar2 = iVarS3;
                z17 = z22;
                z16 = z24;
                i15 = i11;
            } else {
                z18 = z12;
                iVar2 = iVarS3;
                z17 = z22;
                z16 = z24;
                i15 = i11;
            }
            if (z10) {
                iVar3 = iVar2;
                iVar4 = iVar6;
                iVar5 = r24;
                i16 = 0;
                c10 = 1;
                i17 = 8;
                i18 = 1;
            } else {
                iVar3 = iVar2;
                iVar4 = iVar6;
                iVar5 = r24;
                i16 = 0;
                c10 = 1;
                i17 = 8;
                i18 = 1;
            }
            if (this.f128264u == 2) {
                i19 = i16;
            } else {
                i19 = i18;
            }
            if (i19 == 0) {
            }
            if (!z13) {
                eVar4 = eVar;
            } else if (this.H == 1) {
                eVar.k(iVar4, iVar3, iVar, iVarS, this.I, 8);
                eVar4 = eVar;
            } else {
                eVar.k(iVar, iVarS, iVar4, iVar3, this.I, 8);
                eVar4 = eVar;
            }
            if (this.X.p()) {
                eVar4.b(this, this.X.k().i(), (float) Math.toRadians(this.K + 90.0f), this.X.g());
            }
            this.f128254p = false;
            this.f128256q = false;
            fVar = i0.e.C;
            if (fVar != null) {
                fVar.S = eVar4.K();
                i0.e.C.T = eVar4.L();
            }
        }
        i14 = -1;
        if (z13) {
            z14 = false;
        } else {
            z14 = false;
        }
        bVar = this.f128227b0[0];
        bVar2 = b.WRAP_CONTENT;
        if (bVar == bVar2) {
            z15 = false;
        } else {
            z15 = false;
        }
        if (z15) {
            i13 = 0;
        }
        boolean z2118 = !this.X.p();
        boolean[] zArr9 = this.f128225a0;
        boolean z2119 = zArr9[0];
        boolean z21110 = zArr9[1];
        if (this.f128262t != 2) {
            z18 = z12;
            iVar2 = iVarS3;
            z17 = z22;
            z16 = z24;
            i15 = i11;
        } else {
            z18 = z12;
            iVar2 = iVarS3;
            z17 = z22;
            z16 = z24;
            i15 = i11;
        }
        if (z10) {
            iVar3 = iVar2;
            iVar4 = iVar6;
            iVar5 = r24;
            i16 = 0;
            c10 = 1;
            i17 = 8;
            i18 = 1;
        } else {
            iVar3 = iVar2;
            iVar4 = iVar6;
            iVar5 = r24;
            i16 = 0;
            c10 = 1;
            i17 = 8;
            i18 = 1;
        }
        if (this.f128264u == 2) {
            i19 = i16;
        } else {
            i19 = i18;
        }
        if (i19 == 0) {
        }
        if (!z13) {
            eVar4 = eVar;
        } else if (this.H == 1) {
            eVar.k(iVar4, iVar3, iVar, iVarS, this.I, 8);
            eVar4 = eVar;
        } else {
            eVar.k(iVar, iVarS, iVar4, iVar3, this.I, 8);
            eVar4 = eVar;
        }
        if (this.X.p()) {
            eVar4.b(this, this.X.k().i(), (float) Math.toRadians(this.K + 90.0f), this.X.g());
        }
        this.f128254p = false;
        this.f128256q = false;
        fVar = i0.e.C;
        if (fVar != null) {
            fVar.S = eVar4.K();
            i0.e.C.T = eVar4.L();
        }
    }

    public float g0() {
        return this.f128259r0;
    }

    public void g1(boolean z10) {
        this.f128267v0 = z10;
    }

    public void g2(int i10) {
        this.f128239h0 = i10;
    }

    public boolean h() {
        return this.f128265u0 != 8;
    }

    public e h0() {
        if (!D0()) {
            return null;
        }
        e eVar = this;
        e eVar2 = null;
        while (eVar2 == null && eVar != null) {
            d dVarR = eVar.r(d.a.TOP);
            d dVarK = dVarR == null ? null : dVarR.k();
            e eVarI = dVarK == null ? null : dVarK.i();
            if (eVarI == U()) {
                return eVar;
            }
            d dVarK2 = eVarI == null ? null : eVarI.r(d.a.BOTTOM).k();
            if (dVarK2 == null || dVarK2.i() == eVar) {
                eVar = eVarI;
            } else {
                eVar2 = eVar;
            }
        }
        return eVar2;
    }

    public void h1(int i10) {
        this.f128251n0 = i10;
        this.L = i10 > 0;
    }

    public void h2(int i10) {
        this.f128241i0 = i10;
    }

    /* JADX WARN: Code duplicated, block: B:306:0x0498 A[PHI: r7
      0x0498: PHI (r7v15 int) = (r7v14 int), (r7v19 int), (r7v19 int), (r7v19 int) binds: [B:299:0x0488, B:301:0x048e, B:302:0x0490, B:304:0x0494] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:368:0x0542  */
    public final void i(i0.e eVar, boolean z10, boolean z11, boolean z12, boolean z13, i0.i iVar, i0.i iVar2, b bVar, boolean z14, d dVar, d dVar2, int i10, int i11, int i12, int i13, float f10, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, int i15, int i16, int i17, float f11, boolean z20) {
        boolean z21;
        boolean z22;
        boolean z23;
        int iMin;
        int i18;
        i0.i iVar3;
        boolean z24;
        boolean z25;
        int i19;
        int i20;
        i0.i iVarS;
        i0.i iVarS2;
        boolean z26;
        d dVar3;
        int i21;
        int i22;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        i0.i iVar4;
        e eVar2;
        boolean z31;
        int iMin2;
        int i23;
        boolean z32;
        int i24;
        int i25;
        int i26;
        boolean z33;
        int i27;
        int i28;
        int i29;
        boolean z34;
        e eVar3;
        int i30;
        e eVar4;
        eVar = eVar;
        i0.i iVarS3 = eVar.s(dVar);
        i0.i iVarS4 = eVar.s(dVar2);
        i0.i iVarS5 = eVar.s(dVar.k());
        i0.i iVarS6 = eVar.s(dVar2.k());
        if (i0.e.J() != null) {
            i0.e.J().C++;
        }
        boolean zP = dVar.p();
        boolean zP2 = dVar2.p();
        boolean zP3 = this.X.p();
        int i31 = zP2 ? (zP ? 1 : 0) + 1 : zP ? 1 : 0;
        if (zP3) {
            i31++;
        }
        int i32 = z15 ? 3 : i14;
        i0.i iVar5 = iVarS6;
        int iOrdinal = bVar.ordinal();
        boolean z35 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i32 == 4) ? false : true;
        int i33 = this.f128246l;
        if (i33 == -1 || !z10) {
            i33 = i11;
            z21 = z35;
        } else {
            this.f128246l = -1;
            z21 = false;
        }
        int i34 = this.f128248m;
        if (i34 == -1 || z10) {
            z22 = z21;
        } else {
            this.f128248m = -1;
            i33 = i34;
            z22 = false;
        }
        int i35 = i33;
        if (this.f128265u0 == 8) {
            z23 = false;
            iMin = 0;
        } else {
            z23 = z22;
            iMin = i35;
        }
        if (z20) {
            if (!zP && !zP2 && !zP3) {
                eVar.f(iVarS3, i10);
            } else if (zP && !zP2) {
                i18 = 8;
                eVar.e(iVarS3, iVarS5, dVar.g(), 8);
            }
            i18 = 8;
        } else {
            i18 = 8;
        }
        if (z23 == 0) {
            if (z14) {
                eVar.e(iVarS4, iVarS3, 0, 3);
                if (i12 > 0) {
                    eVar.h(iVarS4, iVarS3, i12, 8);
                }
                if (i13 < Integer.MAX_VALUE) {
                    eVar.j(iVarS4, iVarS3, i13, 8);
                }
            } else {
                eVar.e(iVarS4, iVarS3, iMin, i18);
            }
            i20 = i17;
            iVar3 = iVarS4;
            i31 = i31 == true ? 1 : 0;
            iVar5 = iVar5;
            z24 = z23;
            z25 = z13;
            i19 = i16;
        } else if (i31 == 2 || z15 || !(i32 == 1 || i32 == 0)) {
            int i36 = i16 == -2 ? iMin : i16;
            int i37 = i17 == -2 ? iMin : i17;
            if (iMin > 0 && i32 != 1) {
                iMin = 0;
            }
            if (i36 > 0) {
                eVar.h(iVarS4, iVarS3, i36, 8);
                iMin = Math.max(iMin, i36);
            }
            if (i37 > 0) {
                if (!z11 || i32 != 1) {
                    eVar.j(iVarS4, iVarS3, i37, 8);
                }
                iMin = Math.min(iMin, i37);
            }
            if (i32 == 1) {
                if (z11) {
                    eVar.e(iVarS4, iVarS3, iMin, 8);
                } else if (z17) {
                    eVar.e(iVarS4, iVarS3, iMin, 5);
                    eVar.j(iVarS4, iVarS3, iMin, 8);
                } else {
                    eVar.e(iVarS4, iVarS3, iMin, 5);
                    eVar.j(iVarS4, iVarS3, iMin, 8);
                }
                iVar3 = iVarS4;
                iVar5 = iVar5;
                z24 = z23;
                z25 = z13;
                i19 = i36;
                i20 = i37;
                i31 = i31 == true ? 1 : 0;
            } else {
                if (i32 == 2) {
                    d.a aVarL = dVar.l();
                    d.a aVar = d.a.TOP;
                    if (aVarL == aVar || dVar.l() == d.a.BOTTOM) {
                        iVarS = eVar.s(this.f128229c0.r(aVar));
                        iVarS2 = eVar.s(this.f128229c0.r(d.a.BOTTOM));
                    } else {
                        iVarS = eVar.s(this.f128229c0.r(d.a.LEFT));
                        iVarS2 = eVar.s(this.f128229c0.r(d.a.RIGHT));
                    }
                    i0.i iVar6 = iVarS2;
                    iVar3 = iVarS4;
                    eVar.d(eVar.t().n(iVar3, iVarS3, iVar6, iVarS, f11));
                    if (z11) {
                        z23 = false;
                    }
                    z25 = z13;
                    z24 = z23;
                } else {
                    iVar3 = iVarS4;
                    z24 = z23;
                    z25 = true;
                }
                i19 = i36;
                i20 = i37;
            }
        } else {
            int iMax = Math.max(i16, iMin);
            if (i17 > 0) {
                iMax = Math.min(i17, iMax);
            }
            eVar.e(iVarS4, iVarS3, iMax, 8);
            i19 = i16;
            i20 = i17;
            iVar3 = iVarS4;
            i31 = i31 == true ? 1 : 0;
            iVar5 = iVar5;
            z24 = false;
            z25 = z13;
        }
        if (!z20 || z17) {
            if (i31 < 2 && z11 && z25) {
                eVar.h(iVarS3, iVar, 0, 8);
                boolean z36 = z10 || this.U.f128184f == null;
                if (z10 || (dVar3 = this.U.f128184f) == null) {
                    z26 = z36;
                } else {
                    e eVar5 = dVar3.f128182d;
                    if (eVar5.f128235f0 != 0.0f) {
                        b[] bVarArr = eVar5.f128227b0;
                        b bVar2 = bVarArr[0];
                        b bVar3 = b.MATCH_CONSTRAINT;
                        if (bVar2 == bVar3 && bVarArr[1] == bVar3) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                    } else {
                        z26 = false;
                    }
                }
                if (z26) {
                    eVar.h(iVar2, iVar3, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (!zP && !zP2 && !zP3) {
            i24 = 5;
            z31 = z11;
            i30 = i24;
        } else if (!zP || zP2) {
            if (zP || !zP2) {
                if (zP && zP2) {
                    e eVar6 = dVar.f128184f.f128182d;
                    e eVar7 = dVar2.f128184f.f128182d;
                    e eVarU = U();
                    int i38 = 6;
                    if (z24) {
                        if (i32 == 0) {
                            if (i20 != 0 || i19 != 0) {
                                z29 = false;
                                i29 = 5;
                                i21 = 5;
                                z34 = true;
                                z28 = true;
                            } else if (iVarS5.f90254h && iVar5.f90254h) {
                                eVar.e(iVarS3, iVarS5, dVar.g(), 8);
                                eVar.e(iVar3, iVar5, -dVar2.g(), 8);
                                return;
                            } else {
                                z34 = false;
                                z28 = false;
                                i29 = 8;
                                i21 = 8;
                                z29 = true;
                            }
                            if ((eVar6 instanceof s0.a) || (eVar7 instanceof s0.a)) {
                                i21 = 4;
                            }
                            z27 = z34;
                            i22 = i29;
                            iVarS5 = iVarS5;
                            i38 = 6;
                        } else {
                            if (i32 == 2) {
                                i21 = ((eVar6 instanceof s0.a) || (eVar7 instanceof s0.a)) ? 4 : 5;
                                i22 = 5;
                            } else if (i32 == 1) {
                                iVarS3 = iVarS3;
                                iVar5 = iVar5;
                                iVarS5 = iVarS5;
                                i38 = 6;
                                i21 = 4;
                                i22 = 8;
                            } else if (i32 == 3) {
                                if (this.H == -1) {
                                    if (z18) {
                                        eVar = eVar;
                                        iVarS3 = iVarS3;
                                        iVar5 = iVar5;
                                        iVarS5 = iVarS5;
                                        i38 = z11 ? 5 : 4;
                                    } else {
                                        eVar = eVar;
                                        iVarS3 = iVarS3;
                                        iVar5 = iVar5;
                                        iVarS5 = iVarS5;
                                        i38 = 8;
                                    }
                                    i21 = 5;
                                    i22 = 8;
                                } else {
                                    if (z15) {
                                        if (i15 == 2 || i15 == 1) {
                                            i27 = 5;
                                            i28 = 4;
                                        } else {
                                            i27 = 8;
                                            i28 = 5;
                                        }
                                        i22 = i27;
                                        i21 = i28;
                                    } else {
                                        if (i20 > 0) {
                                            i21 = 5;
                                        } else if (i20 != 0 || i19 != 0) {
                                            i21 = 4;
                                        } else if (z18) {
                                            i22 = (eVar6 == eVarU || eVar7 == eVarU) ? 5 : 4;
                                            i21 = 4;
                                        } else {
                                            i21 = 8;
                                        }
                                        i22 = 5;
                                    }
                                    z27 = true;
                                    z28 = true;
                                    z29 = true;
                                    eVar = eVar;
                                }
                                z27 = true;
                                z28 = true;
                                z29 = true;
                            } else {
                                eVar = eVar;
                                iVarS3 = iVarS3;
                                iVar5 = iVar5;
                                iVarS5 = iVarS5;
                                i38 = 6;
                                i21 = 4;
                                i22 = 5;
                                z27 = false;
                                z28 = false;
                                z29 = false;
                            }
                            z27 = true;
                            z28 = true;
                            z29 = false;
                        }
                    } else {
                        if (iVarS5.f90254h && iVar5.f90254h) {
                            i0.i iVar7 = iVar5;
                            eVar.c(iVarS3, iVarS5, dVar.g(), f10, iVar7, iVar3, dVar2.g(), 8);
                            if (z11 && z25) {
                                int iG = dVar2.f128184f != null ? dVar2.g() : 0;
                                if (iVar7 != iVar2) {
                                    eVar.h(iVar2, iVar3, iG, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        eVar = eVar;
                        iVarS3 = iVarS3;
                        iVar5 = iVar5;
                        iVarS5 = iVarS5;
                        i38 = 6;
                        i21 = 4;
                        i22 = 5;
                        z27 = true;
                        z28 = true;
                        z29 = false;
                    }
                    if (z28 && iVarS5 == iVar5 && eVar6 != eVarU) {
                        z28 = false;
                        z30 = false;
                    } else {
                        z30 = true;
                    }
                    if (z27) {
                        if (z24 || z16 || z18 || iVarS5 != iVar || iVar5 != iVar2) {
                            i26 = i38;
                            z33 = z11;
                        } else {
                            i26 = 8;
                            z33 = false;
                            i22 = 8;
                            z30 = false;
                        }
                        iVar4 = iVar;
                        z11 = z33;
                        eVar2 = eVar7;
                        i0.i iVar8 = iVar3;
                        eVar.c(iVarS3, iVarS5, dVar.g(), f10, iVar5, iVar8, dVar2.g(), i26);
                        iVar5 = iVar5;
                        iVar3 = iVar8;
                    } else {
                        iVar5 = iVar5;
                        iVar4 = iVar;
                        eVar2 = eVar7;
                    }
                    z31 = z11;
                    if (this.f128265u0 == 8 && !dVar2.n()) {
                        return;
                    }
                    if (z28) {
                        int i39 = (!z31 || iVarS5 == iVar5 || z24 || !((eVar6 instanceof s0.a) || (eVar2 instanceof s0.a))) ? i22 : 6;
                        eVar.h(iVarS3, iVarS5, dVar.g(), i39);
                        eVar.j(iVar3, iVar5, -dVar2.g(), i39);
                        i22 = i39;
                    }
                    if (!z31 || !z19 || (eVar6 instanceof s0.a) || (eVar2 instanceof s0.a) || eVar2 == eVarU) {
                        iMin2 = i21;
                        i23 = i22;
                        z32 = z30;
                    } else {
                        iMin2 = 6;
                        i23 = 6;
                        z32 = true;
                    }
                    if (z32) {
                        if (z29 && (!z18 || z12)) {
                            if (eVar6 != eVarU && eVar2 != eVarU) {
                                i38 = iMin2;
                            }
                            if ((eVar6 instanceof h) || (eVar2 instanceof h)) {
                                i38 = 5;
                            }
                            if ((eVar6 instanceof s0.a) || (eVar2 instanceof s0.a)) {
                                i38 = 5;
                            }
                            iMin2 = Math.max(z18 ? 5 : i38, iMin2);
                        }
                        if (z31) {
                            iMin2 = Math.min(i23, iMin2);
                            if (z15 && !z18 && (eVar6 == eVarU || eVar2 == eVarU)) {
                                i25 = 4;
                            } else {
                                i25 = iMin2;
                            }
                        } else {
                            i25 = iMin2;
                        }
                        eVar.e(iVarS3, iVarS5, dVar.g(), i25);
                        eVar.e(iVar3, iVar5, -dVar2.g(), i25);
                    }
                    if (z31) {
                        int iG2 = iVar4 == iVarS5 ? dVar.g() : 0;
                        if (iVarS5 != iVar4) {
                            eVar.h(iVarS3, iVar4, iG2, 5);
                        }
                    }
                    if (!z31 || !z24 || i12 != 0 || i19 != 0) {
                        i24 = 5;
                    } else if (z24 && i32 == 3) {
                        eVar.h(iVar3, iVarS3, 0, 8);
                        i24 = 5;
                    } else {
                        i24 = 5;
                        eVar.h(iVar3, iVarS3, 0, 5);
                    }
                }
                i30 = i24;
            } else {
                eVar.e(iVar3, iVar5, -dVar2.g(), 8);
                if (z11) {
                    if (this.f128242j && iVarS3.f90254h && (eVar3 = this.f128229c0) != null) {
                        f fVar = (f) eVar3;
                        if (z10) {
                            fVar.v2(dVar);
                        } else {
                            fVar.A2(dVar);
                        }
                    } else {
                        i24 = 5;
                        eVar.h(iVarS3, iVar, 0, 5);
                    }
                }
                z31 = z11;
                i30 = i24;
            }
            i24 = 5;
            z31 = z11;
            i30 = i24;
        } else {
            i0.i iVar9 = iVar5;
            i30 = (z11 && (dVar.f128184f.f128182d instanceof s0.a)) ? 8 : 5;
            iVar5 = iVar9;
            z31 = z11;
        }
        if (z31 && z25) {
            int iG3 = dVar2.f128184f != null ? dVar2.g() : 0;
            if (iVar5 != iVar2) {
                if (!this.f128242j || !iVar3.f90254h || (eVar4 = this.f128229c0) == null) {
                    eVar.h(iVar2, iVar3, iG3, i30);
                    return;
                }
                f fVar2 = (f) eVar4;
                if (z10) {
                    fVar2.u2(dVar2);
                } else {
                    fVar2.z2(dVar2);
                }
            }
        }
    }

    public int i0() {
        return this.K0;
    }

    public void i1(Object obj) {
        this.f128261s0 = obj;
    }

    public void i2(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.H == -1) {
            if (z12 && !z13) {
                this.H = 0;
            } else if (!z12 && z13) {
                this.H = 1;
                if (this.f128237g0 == -1) {
                    this.I = 1.0f / this.I;
                }
            }
        }
        if (this.H == 0 && (!this.R.p() || !this.T.p())) {
            this.H = 1;
        } else if (this.H == 1 && (!this.Q.p() || !this.S.p())) {
            this.H = 0;
        }
        if (this.H == -1 && (!this.R.p() || !this.T.p() || !this.Q.p() || !this.S.p())) {
            if (this.R.p() && this.T.p()) {
                this.H = 0;
            } else if (this.Q.p() && this.S.p()) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
        if (this.H == -1) {
            int i10 = this.f128274z;
            if (i10 > 0 && this.C == 0) {
                this.H = 0;
            } else {
                if (i10 != 0 || this.C <= 0) {
                    return;
                }
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
    }

    public void j(d.a aVar, e eVar, d.a aVar2) {
        k(aVar, eVar, aVar2, 0);
    }

    public b j0() {
        return this.f128227b0[1];
    }

    public void j1(int i10) {
        if (i10 >= 0) {
            this.f128263t0 = i10;
        } else {
            this.f128263t0 = 0;
        }
    }

    public void j2(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean zM = z10 & this.f128232e.m();
        boolean zM2 = z11 & this.f128234f.m();
        t0.l lVar = this.f128232e;
        int i12 = lVar.f135964h.f135900g;
        t0.n nVar = this.f128234f;
        int i13 = nVar.f135964h.f135900g;
        int i14 = lVar.f135965i.f135900g;
        int i15 = nVar.f135965i.f135900g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (zM) {
            this.f128239h0 = i12;
        }
        if (zM2) {
            this.f128241i0 = i13;
        }
        if (this.f128265u0 == 8) {
            this.f128231d0 = 0;
            this.f128233e0 = 0;
            return;
        }
        if (zM) {
            if (this.f128227b0[0] == b.FIXED && i17 < (i11 = this.f128231d0)) {
                i17 = i11;
            }
            this.f128231d0 = i17;
            int i19 = this.f128253o0;
            if (i17 < i19) {
                this.f128231d0 = i19;
            }
        }
        if (zM2) {
            if (this.f128227b0[1] == b.FIXED && i18 < (i10 = this.f128233e0)) {
                i18 = i10;
            }
            this.f128233e0 = i18;
            int i20 = this.f128255p0;
            if (i18 < i20) {
                this.f128233e0 = i20;
            }
        }
    }

    public void k(d.a aVar, e eVar, d.a aVar2, int i10) {
        d.a aVar3;
        d.a aVar4;
        boolean z10;
        d.a aVar5 = d.a.CENTER;
        if (aVar == aVar5) {
            if (aVar2 != aVar5) {
                d.a aVar6 = d.a.LEFT;
                if (aVar2 == aVar6 || aVar2 == d.a.RIGHT) {
                    k(aVar6, eVar, aVar2, 0);
                    k(d.a.RIGHT, eVar, aVar2, 0);
                    r(aVar5).a(eVar.r(aVar2), 0);
                    return;
                }
                d.a aVar7 = d.a.TOP;
                if (aVar2 == aVar7 || aVar2 == d.a.BOTTOM) {
                    k(aVar7, eVar, aVar2, 0);
                    k(d.a.BOTTOM, eVar, aVar2, 0);
                    r(aVar5).a(eVar.r(aVar2), 0);
                    return;
                }
                return;
            }
            d.a aVar8 = d.a.LEFT;
            d dVarR = r(aVar8);
            d.a aVar9 = d.a.RIGHT;
            d dVarR2 = r(aVar9);
            d.a aVar10 = d.a.TOP;
            d dVarR3 = r(aVar10);
            d.a aVar11 = d.a.BOTTOM;
            d dVarR4 = r(aVar11);
            boolean z11 = true;
            if ((dVarR == null || !dVarR.p()) && (dVarR2 == null || !dVarR2.p())) {
                k(aVar8, eVar, aVar8, 0);
                k(aVar9, eVar, aVar9, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((dVarR3 == null || !dVarR3.p()) && (dVarR4 == null || !dVarR4.p())) {
                k(aVar10, eVar, aVar10, 0);
                k(aVar11, eVar, aVar11, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                r(aVar5).a(eVar.r(aVar5), 0);
                return;
            }
            if (z10) {
                d.a aVar12 = d.a.CENTER_X;
                r(aVar12).a(eVar.r(aVar12), 0);
                return;
            } else {
                if (z11) {
                    d.a aVar13 = d.a.CENTER_Y;
                    r(aVar13).a(eVar.r(aVar13), 0);
                    return;
                }
                return;
            }
        }
        d.a aVar14 = d.a.CENTER_X;
        if (aVar == aVar14 && (aVar2 == (aVar4 = d.a.LEFT) || aVar2 == d.a.RIGHT)) {
            d dVarR5 = r(aVar4);
            d dVarR6 = eVar.r(aVar2);
            d dVarR7 = r(d.a.RIGHT);
            dVarR5.a(dVarR6, 0);
            dVarR7.a(dVarR6, 0);
            r(aVar14).a(dVarR6, 0);
            return;
        }
        d.a aVar15 = d.a.CENTER_Y;
        if (aVar == aVar15 && (aVar2 == (aVar3 = d.a.TOP) || aVar2 == d.a.BOTTOM)) {
            d dVarR8 = eVar.r(aVar2);
            r(aVar3).a(dVarR8, 0);
            r(d.a.BOTTOM).a(dVarR8, 0);
            r(aVar15).a(dVarR8, 0);
            return;
        }
        if (aVar == aVar14 && aVar2 == aVar14) {
            d.a aVar16 = d.a.LEFT;
            r(aVar16).a(eVar.r(aVar16), 0);
            d.a aVar17 = d.a.RIGHT;
            r(aVar17).a(eVar.r(aVar17), 0);
            r(aVar14).a(eVar.r(aVar2), 0);
            return;
        }
        if (aVar == aVar15 && aVar2 == aVar15) {
            d.a aVar18 = d.a.TOP;
            r(aVar18).a(eVar.r(aVar18), 0);
            d.a aVar19 = d.a.BOTTOM;
            r(aVar19).a(eVar.r(aVar19), 0);
            r(aVar15).a(eVar.r(aVar2), 0);
            return;
        }
        d dVarR9 = r(aVar);
        d dVarR10 = eVar.r(aVar2);
        if (dVarR9.v(dVarR10)) {
            d.a aVar20 = d.a.BASELINE;
            if (aVar == aVar20) {
                d dVarR11 = r(d.a.TOP);
                d dVarR12 = r(d.a.BOTTOM);
                if (dVarR11 != null) {
                    dVarR11.x();
                }
                if (dVarR12 != null) {
                    dVarR12.x();
                }
            } else if (aVar == d.a.TOP || aVar == d.a.BOTTOM) {
                d dVarR13 = r(aVar20);
                if (dVarR13 != null) {
                    dVarR13.x();
                }
                d dVarR14 = r(aVar5);
                if (dVarR14.k() != dVarR10) {
                    dVarR14.x();
                }
                d dVarH = r(aVar).h();
                d dVarR15 = r(aVar15);
                if (dVarR15.p()) {
                    dVarH.x();
                    dVarR15.x();
                }
            } else if (aVar == d.a.LEFT || aVar == d.a.RIGHT) {
                d dVarR16 = r(aVar5);
                if (dVarR16.k() != dVarR10) {
                    dVarR16.x();
                }
                d dVarH2 = r(aVar).h();
                d dVarR17 = r(aVar14);
                if (dVarR17.p()) {
                    dVarH2.x();
                    dVarR17.x();
                }
            }
            dVarR9.a(dVarR10, i10);
        }
    }

    public int k0() {
        int i10 = this.Q != null ? this.R.f128185g : 0;
        return this.S != null ? i10 + this.T.f128185g : i10;
    }

    public void k1(String str) {
        this.f128269w0 = str;
    }

    public void k2(i0.e eVar, boolean z10) {
        t0.n nVar;
        t0.l lVar;
        int iM = eVar.M(this.Q);
        int iM2 = eVar.M(this.R);
        int iM3 = eVar.M(this.S);
        int iM4 = eVar.M(this.T);
        if (z10 && (lVar = this.f128232e) != null) {
            t0.f fVar = lVar.f135964h;
            if (fVar.f135903j) {
                t0.f fVar2 = lVar.f135965i;
                if (fVar2.f135903j) {
                    iM = fVar.f135900g;
                    iM3 = fVar2.f135900g;
                }
            }
        }
        if (z10 && (nVar = this.f128234f) != null) {
            t0.f fVar3 = nVar.f135964h;
            if (fVar3.f135903j) {
                t0.f fVar4 = nVar.f135965i;
                if (fVar4.f135903j) {
                    iM2 = fVar3.f135900g;
                    iM4 = fVar4.f135900g;
                }
            }
        }
        int i10 = iM4 - iM2;
        if (iM3 - iM < 0 || i10 < 0 || iM == Integer.MIN_VALUE || iM == Integer.MAX_VALUE || iM2 == Integer.MIN_VALUE || iM2 == Integer.MAX_VALUE || iM3 == Integer.MIN_VALUE || iM3 == Integer.MAX_VALUE || iM4 == Integer.MIN_VALUE || iM4 == Integer.MAX_VALUE) {
            iM = 0;
            iM4 = 0;
            iM2 = 0;
            iM3 = 0;
        }
        w1(iM, iM2, iM3, iM4);
    }

    public void l(d dVar, d dVar2, int i10) {
        if (dVar.i() == this) {
            k(dVar.l(), dVar2.i(), dVar2.l(), i10);
        }
    }

    public int l0() {
        return this.f128265u0;
    }

    public void l1(i0.e eVar, String str) {
        this.f128269w0 = str;
        i0.i iVarS = eVar.s(this.Q);
        i0.i iVarS2 = eVar.s(this.R);
        i0.i iVarS3 = eVar.s(this.S);
        i0.i iVarS4 = eVar.s(this.T);
        iVarS.j(str + ".left");
        iVarS2.j(str + ".top");
        iVarS3.j(str + ".right");
        iVarS4.j(str + ".bottom");
        eVar.s(this.U).j(str + ".baseline");
    }

    public void m(e eVar, float f10, int i10) {
        d.a aVar = d.a.CENTER;
        v0(aVar, eVar, aVar, i10, 0);
        this.K = f10;
    }

    public int m0() {
        if (this.f128265u0 == 8) {
            return 0;
        }
        return this.f128231d0;
    }

    public void m1(int i10, int i11) {
        this.f128231d0 = i10;
        int i12 = this.f128253o0;
        if (i10 < i12) {
            this.f128231d0 = i12;
        }
        this.f128233e0 = i11;
        int i13 = this.f128255p0;
        if (i11 < i13) {
            this.f128233e0 = i13;
        }
    }

    public void n(e eVar, HashMap<e, e> map) {
        this.f128262t = eVar.f128262t;
        this.f128264u = eVar.f128264u;
        this.f128268w = eVar.f128268w;
        this.f128270x = eVar.f128270x;
        int[] iArr = this.f128272y;
        int[] iArr2 = eVar.f128272y;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f128274z = eVar.f128274z;
        this.A = eVar.A;
        this.C = eVar.C;
        this.D = eVar.D;
        this.E = eVar.E;
        this.F = eVar.F;
        this.G = eVar.G;
        this.H = eVar.H;
        this.I = eVar.I;
        int[] iArr3 = eVar.J;
        this.J = Arrays.copyOf(iArr3, iArr3.length);
        this.K = eVar.K;
        this.L = eVar.L;
        this.M = eVar.M;
        this.Q.x();
        this.R.x();
        this.S.x();
        this.T.x();
        this.U.x();
        this.V.x();
        this.W.x();
        this.X.x();
        this.f128227b0 = (b[]) Arrays.copyOf(this.f128227b0, 2);
        this.f128229c0 = this.f128229c0 == null ? null : map.get(eVar.f128229c0);
        this.f128231d0 = eVar.f128231d0;
        this.f128233e0 = eVar.f128233e0;
        this.f128235f0 = eVar.f128235f0;
        this.f128237g0 = eVar.f128237g0;
        this.f128239h0 = eVar.f128239h0;
        this.f128241i0 = eVar.f128241i0;
        this.f128243j0 = eVar.f128243j0;
        this.f128245k0 = eVar.f128245k0;
        this.f128247l0 = eVar.f128247l0;
        this.f128249m0 = eVar.f128249m0;
        this.f128251n0 = eVar.f128251n0;
        this.f128253o0 = eVar.f128253o0;
        this.f128255p0 = eVar.f128255p0;
        this.f128257q0 = eVar.f128257q0;
        this.f128259r0 = eVar.f128259r0;
        this.f128261s0 = eVar.f128261s0;
        this.f128263t0 = eVar.f128263t0;
        this.f128265u0 = eVar.f128265u0;
        this.f128267v0 = eVar.f128267v0;
        this.f128269w0 = eVar.f128269w0;
        this.f128271x0 = eVar.f128271x0;
        this.f128273y0 = eVar.f128273y0;
        this.f128275z0 = eVar.f128275z0;
        this.A0 = eVar.A0;
        this.B0 = eVar.B0;
        this.C0 = eVar.C0;
        this.D0 = eVar.D0;
        this.E0 = eVar.E0;
        this.F0 = eVar.F0;
        this.G0 = eVar.G0;
        this.H0 = eVar.H0;
        this.J0 = eVar.J0;
        this.K0 = eVar.K0;
        this.L0 = eVar.L0;
        this.M0 = eVar.M0;
        float[] fArr = this.N0;
        float[] fArr2 = eVar.N0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        e[] eVarArr = this.O0;
        e[] eVarArr2 = eVar.O0;
        eVarArr[0] = eVarArr2[0];
        eVarArr[1] = eVarArr2[1];
        e[] eVarArr3 = this.P0;
        e[] eVarArr4 = eVar.P0;
        eVarArr3[0] = eVarArr4[0];
        eVarArr3[1] = eVarArr4[1];
        e eVar2 = eVar.Q0;
        this.Q0 = eVar2 == null ? null : map.get(eVar2);
        e eVar3 = eVar.R0;
        this.R0 = eVar3 != null ? map.get(eVar3) : null;
    }

    public int n0() {
        return this.f128266v;
    }

    public void n1(float f10, int i10) {
        this.f128235f0 = f10;
        this.f128237g0 = i10;
    }

    public void o(i0.e eVar) {
        eVar.s(this.Q);
        eVar.s(this.R);
        eVar.s(this.S);
        eVar.s(this.T);
        if (this.f128251n0 > 0) {
            eVar.s(this.U);
        }
    }

    public int o0() {
        e eVar = this.f128229c0;
        return (eVar == null || !(eVar instanceof f)) ? this.f128239h0 : ((f) eVar).J1 + this.f128239h0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public void o1(String str) {
        float fAbs;
        int i10 = 0;
        if (str == null || str.length() == 0) {
            this.f128235f0 = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i11 = 0;
        int i12 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase(l3.a.T4)) {
                i11 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i12 = i11;
            i11 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i11);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i10;
                }
            } else {
                String strSubstring3 = str.substring(i11, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i10;
                } else {
                    float f10 = Float.parseFloat(strSubstring3);
                    float f11 = Float.parseFloat(strSubstring4);
                    if (f10 <= 0.0f || f11 <= 0.0f) {
                        fAbs = i10;
                    } else {
                        fAbs = i12 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i10 = (fAbs > i10 ? 1 : (fAbs == i10 ? 0 : -1));
        if (i10 > 0) {
            this.f128235f0 = fAbs;
            this.f128237g0 = i12;
        }
    }

    public void p() {
        this.f128240i = true;
    }

    public int p0() {
        e eVar = this.f128229c0;
        return (eVar == null || !(eVar instanceof f)) ? this.f128241i0 : ((f) eVar).K1 + this.f128241i0;
    }

    public void p1(int i10) {
        if (this.L) {
            int i11 = i10 - this.f128251n0;
            int i12 = this.f128233e0 + i11;
            this.f128241i0 = i11;
            this.R.A(i11);
            this.T.A(i12);
            this.U.A(i10);
            this.f128256q = true;
        }
    }

    public void q() {
        if (this.f128232e == null) {
            this.f128232e = new t0.l(this);
        }
        if (this.f128234f == null) {
            this.f128234f = new t0.n(this);
        }
    }

    public boolean q0() {
        return this.L;
    }

    public void q1(int i10, int i11, int i12, int i13, int i14, int i15) {
        w1(i10, i11, i12, i13);
        h1(i14);
        if (i15 == 0) {
            this.f128254p = true;
            this.f128256q = false;
        } else if (i15 == 1) {
            this.f128254p = false;
            this.f128256q = true;
        } else if (i15 == 2) {
            this.f128254p = true;
            this.f128256q = true;
        } else {
            this.f128254p = false;
            this.f128256q = false;
        }
    }

    public d r(d.a aVar) {
        switch (a.f128276a[aVar.ordinal()]) {
            case 1:
                return this.Q;
            case 2:
                return this.R;
            case 3:
                return this.S;
            case 4:
                return this.T;
            case 5:
                return this.U;
            case 6:
                return this.X;
            case 7:
                return this.V;
            case 8:
                return this.W;
            case 9:
                return null;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public boolean r0(int i10) {
        if (i10 == 0) {
            return (this.Q.f128184f != null ? 1 : 0) + (this.S.f128184f != null ? 1 : 0) < 2;
        }
        return ((this.R.f128184f != null ? 1 : 0) + (this.T.f128184f != null ? 1 : 0)) + (this.U.f128184f != null ? 1 : 0) < 2;
    }

    public void r1(int i10, int i11) {
        if (this.f128254p) {
            return;
        }
        this.Q.A(i10);
        this.S.A(i11);
        this.f128239h0 = i10;
        this.f128231d0 = i11 - i10;
        this.f128254p = true;
    }

    public ArrayList<d> s() {
        return this.Z;
    }

    public boolean s0() {
        int size = this.Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.Z.get(i10).n()) {
                return true;
            }
        }
        return false;
    }

    public void s1(int i10) {
        this.Q.A(i10);
        this.f128239h0 = i10;
    }

    public int t() {
        return this.f128251n0;
    }

    public boolean t0() {
        return (this.f128246l == -1 && this.f128248m == -1) ? false : true;
    }

    public void t1(int i10) {
        this.R.A(i10);
        this.f128241i0 = i10;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f128271x0 != null) {
            str = "type: " + this.f128271x0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f128269w0 != null) {
            str2 = "id: " + this.f128269w0 + " ";
        }
        sb2.append(str2);
        sb2.append(gi.j.f86770c);
        sb2.append(this.f128239h0);
        sb2.append(", ");
        sb2.append(this.f128241i0);
        sb2.append(") - (");
        sb2.append(this.f128231d0);
        sb2.append(" x ");
        sb2.append(this.f128233e0);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }

    public float u(int i10) {
        if (i10 == 0) {
            return this.f128257q0;
        }
        if (i10 == 1) {
            return this.f128259r0;
        }
        return -1.0f;
    }

    public boolean u0(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.Q.f128184f;
            return dVar3 != null && dVar3.o() && (dVar2 = this.S.f128184f) != null && dVar2.o() && (this.S.f128184f.f() - this.S.g()) - (this.Q.f128184f.f() + this.Q.g()) >= i11;
        }
        d dVar4 = this.R.f128184f;
        if (dVar4 != null && dVar4.o() && (dVar = this.T.f128184f) != null && dVar.o() && (this.T.f128184f.f() - this.T.g()) - (this.R.f128184f.f() + this.R.g()) >= i11) {
            return true;
        }
        return false;
    }

    public void u1(int i10, int i11) {
        if (this.f128256q) {
            return;
        }
        this.R.A(i10);
        this.T.A(i11);
        this.f128241i0 = i10;
        this.f128233e0 = i11 - i10;
        if (this.L) {
            this.U.A(i10 + this.f128251n0);
        }
        this.f128256q = true;
    }

    public int v() {
        return p0() + this.f128233e0;
    }

    public void v0(d.a aVar, e eVar, d.a aVar2, int i10, int i11) {
        r(aVar).b(eVar.r(aVar2), i10, i11, true);
    }

    public void v1(int i10, int i11, int i12) {
        if (i12 == 0) {
            D1(i10, i11);
        } else if (i12 == 1) {
            Y1(i10, i11);
        }
    }

    public Object w() {
        return this.f128261s0;
    }

    public boolean w0() {
        return this.f128267v0;
    }

    public void w1(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f128239h0 = i10;
        this.f128241i0 = i11;
        if (this.f128265u0 == 8) {
            this.f128231d0 = 0;
            this.f128233e0 = 0;
            return;
        }
        b[] bVarArr = this.f128227b0;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f128231d0)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f128233e0)) {
            i17 = i14;
        }
        this.f128231d0 = i16;
        this.f128233e0 = i17;
        int i18 = this.f128255p0;
        if (i17 < i18) {
            this.f128233e0 = i18;
        }
        int i19 = this.f128253o0;
        if (i16 < i19) {
            this.f128231d0 = i19;
        }
        int i20 = this.A;
        if (i20 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f128231d0 = Math.min(this.f128231d0, i20);
        }
        int i21 = this.D;
        if (i21 > 0 && this.f128227b0[1] == b.MATCH_CONSTRAINT) {
            this.f128233e0 = Math.min(this.f128233e0, i21);
        }
        int i22 = this.f128231d0;
        if (i16 != i22) {
            this.f128246l = i22;
        }
        int i23 = this.f128233e0;
        if (i17 != i23) {
            this.f128248m = i23;
        }
    }

    public int x() {
        return this.f128263t0;
    }

    public final boolean x0(int i10) {
        d dVar;
        d dVar2;
        int i11 = i10 * 2;
        d[] dVarArr = this.Y;
        d dVar3 = dVarArr[i11];
        d dVar4 = dVar3.f128184f;
        return (dVar4 == null || dVar4.f128184f == dVar3 || (dVar2 = (dVar = dVarArr[i11 + 1]).f128184f) == null || dVar2.f128184f != dVar) ? false : true;
    }

    public void x1(d.a aVar, int i10) {
        int i11 = a.f128276a[aVar.ordinal()];
        if (i11 == 1) {
            this.Q.f128186h = i10;
            return;
        }
        if (i11 == 2) {
            this.R.f128186h = i10;
            return;
        }
        if (i11 == 3) {
            this.S.f128186h = i10;
        } else if (i11 == 4) {
            this.T.f128186h = i10;
        } else {
            if (i11 != 5) {
                return;
            }
            this.U.f128186h = i10;
        }
    }

    public String y() {
        return this.f128269w0;
    }

    public boolean y0() {
        return this.G;
    }

    public void y1(boolean z10) {
        this.L = z10;
    }

    public b z(int i10) {
        if (i10 == 0) {
            return H();
        }
        if (i10 == 1) {
            return j0();
        }
        return null;
    }

    public boolean z0() {
        return this.f128258r;
    }

    public void z1(int i10) {
        this.f128233e0 = i10;
        int i11 = this.f128255p0;
        if (i10 < i11) {
            this.f128233e0 = i11;
        }
    }

    public e(String str) {
        this.f128224a = false;
        this.f128226b = new p[2];
        this.f128232e = null;
        this.f128234f = null;
        this.f128236g = new boolean[]{true, true};
        this.f128238h = false;
        this.f128240i = true;
        this.f128242j = false;
        this.f128244k = true;
        this.f128246l = -1;
        this.f128248m = -1;
        this.f128250n = new v(this);
        this.f128254p = false;
        this.f128256q = false;
        this.f128258r = false;
        this.f128260s = false;
        this.f128262t = -1;
        this.f128264u = -1;
        this.f128266v = 0;
        this.f128268w = 0;
        this.f128270x = 0;
        this.f128272y = new int[2];
        this.f128274z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = Float.NaN;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new d(this, d.a.LEFT);
        this.R = new d(this, d.a.TOP);
        this.S = new d(this, d.a.RIGHT);
        this.T = new d(this, d.a.BOTTOM);
        this.U = new d(this, d.a.BASELINE);
        this.V = new d(this, d.a.CENTER_X);
        this.W = new d(this, d.a.CENTER_Y);
        d dVar = new d(this, d.a.CENTER);
        this.X = dVar;
        this.Y = new d[]{this.Q, this.S, this.R, this.T, this.U, dVar};
        this.Z = new ArrayList<>();
        this.f128225a0 = new boolean[2];
        b bVar = b.FIXED;
        this.f128227b0 = new b[]{bVar, bVar};
        this.f128229c0 = null;
        this.f128231d0 = 0;
        this.f128233e0 = 0;
        this.f128235f0 = 0.0f;
        this.f128237g0 = -1;
        this.f128239h0 = 0;
        this.f128241i0 = 0;
        this.f128243j0 = 0;
        this.f128245k0 = 0;
        this.f128247l0 = 0;
        this.f128249m0 = 0;
        this.f128251n0 = 0;
        float f10 = A1;
        this.f128257q0 = f10;
        this.f128259r0 = f10;
        this.f128263t0 = 0;
        this.f128265u0 = 0;
        this.f128267v0 = false;
        this.f128269w0 = null;
        this.f128271x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new e[]{null, null};
        this.P0 = new e[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        d();
        k1(str);
    }

    public e(int i10, int i11, int i12, int i13) {
        this.f128224a = false;
        this.f128226b = new p[2];
        this.f128232e = null;
        this.f128234f = null;
        this.f128236g = new boolean[]{true, true};
        this.f128238h = false;
        this.f128240i = true;
        this.f128242j = false;
        this.f128244k = true;
        this.f128246l = -1;
        this.f128248m = -1;
        this.f128250n = new v(this);
        this.f128254p = false;
        this.f128256q = false;
        this.f128258r = false;
        this.f128260s = false;
        this.f128262t = -1;
        this.f128264u = -1;
        this.f128266v = 0;
        this.f128268w = 0;
        this.f128270x = 0;
        this.f128272y = new int[2];
        this.f128274z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = Float.NaN;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new d(this, d.a.LEFT);
        this.R = new d(this, d.a.TOP);
        this.S = new d(this, d.a.RIGHT);
        this.T = new d(this, d.a.BOTTOM);
        this.U = new d(this, d.a.BASELINE);
        this.V = new d(this, d.a.CENTER_X);
        this.W = new d(this, d.a.CENTER_Y);
        d dVar = new d(this, d.a.CENTER);
        this.X = dVar;
        this.Y = new d[]{this.Q, this.S, this.R, this.T, this.U, dVar};
        this.Z = new ArrayList<>();
        this.f128225a0 = new boolean[2];
        b bVar = b.FIXED;
        this.f128227b0 = new b[]{bVar, bVar};
        this.f128229c0 = null;
        this.f128235f0 = 0.0f;
        this.f128237g0 = -1;
        this.f128243j0 = 0;
        this.f128245k0 = 0;
        this.f128247l0 = 0;
        this.f128249m0 = 0;
        this.f128251n0 = 0;
        float f10 = A1;
        this.f128257q0 = f10;
        this.f128259r0 = f10;
        this.f128263t0 = 0;
        this.f128265u0 = 0;
        this.f128267v0 = false;
        this.f128269w0 = null;
        this.f128271x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new e[]{null, null};
        this.P0 = new e[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        this.f128239h0 = i10;
        this.f128241i0 = i11;
        this.f128231d0 = i12;
        this.f128233e0 = i13;
        d();
    }

    public e(String str, int i10, int i11, int i12, int i13) {
        this(i10, i11, i12, i13);
        k1(str);
    }

    public e(int i10, int i11) {
        this(0, 0, i10, i11);
    }

    public e(String str, int i10, int i11) {
        this(i10, i11);
        k1(str);
    }
}

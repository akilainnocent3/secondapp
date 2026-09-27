package l0;

import java.util.HashMap;
import java.util.HashSet;
import n0.b0;
import n0.o;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class e extends b {
    public static final String L = "KeyPosition";
    public static final float M = 20.0f;
    public static final int N = 2;
    public static final int O = 1;
    public static final int P = 0;
    public static final int Q = 2;
    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    public float J;
    public float K;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f103261y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f103262z;

    public e() {
        int i10 = b.f103235m;
        this.f103261y = i10;
        this.f103262z = null;
        this.A = i10;
        this.B = 0;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = 0;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.f103250k = 2;
    }

    public float A() {
        return this.K;
    }

    public boolean B(int i10, int i11, n0.e eVar, n0.e eVar2, float f10, float f11) {
        x(i10, i11, eVar.a(), eVar.b(), eVar2.a(), eVar2.b());
        return Math.abs(f10 - this.J) < 20.0f && Math.abs(f11 - this.K) < 20.0f;
    }

    public void C(k0.f fVar, n0.e eVar, n0.e eVar2, float f10, float f11, String[] strArr, float[] fArr) {
        int i10 = this.I;
        if (i10 == 1) {
            E(eVar, eVar2, f10, f11, strArr, fArr);
        } else if (i10 != 2) {
            D(eVar, eVar2, f10, f11, strArr, fArr);
        } else {
            F(fVar, eVar, eVar2, f10, f11, strArr, fArr);
        }
    }

    public void D(n0.e eVar, n0.e eVar2, float f10, float f11, String[] strArr, float[] fArr) {
        float fA = eVar.a();
        float fB = eVar.b();
        float fA2 = eVar2.a() - fA;
        float fB2 = eVar2.b() - fB;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f10 - fA) / fA2;
            strArr[1] = "percentY";
            fArr[1] = (f11 - fB) / fB2;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = (f10 - fA) / fA2;
            fArr[1] = (f11 - fB) / fB2;
        } else {
            fArr[1] = (f10 - fA) / fA2;
            fArr[0] = (f11 - fB) / fB2;
        }
    }

    public void E(n0.e eVar, n0.e eVar2, float f10, float f11, String[] strArr, float[] fArr) {
        float fA = eVar.a();
        float fB = eVar.b();
        float fA2 = eVar2.a() - fA;
        float fB2 = eVar2.b() - fB;
        float fHypot = (float) Math.hypot(fA2, fB2);
        if (fHypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f12 = fA2 / fHypot;
        float f13 = fB2 / fHypot;
        float f14 = f11 - fB;
        float f15 = f10 - fA;
        float f16 = ((f12 * f14) - (f15 * f13)) / fHypot;
        float f17 = ((f12 * f15) + (f13 * f14)) / fHypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f17;
                fArr[1] = f16;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f17;
        fArr[1] = f16;
    }

    public void F(k0.f fVar, n0.e eVar, n0.e eVar2, float f10, float f11, String[] strArr, float[] fArr) {
        eVar.a();
        eVar.b();
        eVar2.a();
        eVar2.b();
        k0.f fVarN = fVar.n();
        int iD = fVarN.D();
        int iK = fVarN.k();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = f10 / iD;
            strArr[1] = "percentY";
            fArr[1] = f11 / iK;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = f10 / iD;
            fArr[1] = f11 / iK;
        } else {
            fArr[1] = f10 / iD;
            fArr[0] = f11 / iK;
        }
    }

    @Override // l0.b, n0.w
    public boolean a(int i10, int i11) {
        if (i10 == 100) {
            this.f103247h = i11;
            return true;
        }
        if (i10 == 508) {
            this.f103261y = i11;
            return true;
        }
        if (i10 != 510) {
            return super.a(i10, i11);
        }
        this.I = i11;
        return true;
    }

    @Override // l0.b, n0.w
    public boolean b(int i10, float f10) {
        switch (i10) {
            case 503:
                this.C = f10;
                return true;
            case 504:
                this.D = f10;
                return true;
            case 505:
                this.C = f10;
                this.D = f10;
                return true;
            case 506:
                this.E = f10;
                return true;
            case 507:
                this.F = f10;
                return true;
            default:
                return super.b(i10, f10);
        }
    }

    @Override // l0.b, n0.w
    public boolean d(int i10, String str) {
        if (i10 != 501) {
            return super.d(i10, str);
        }
        this.f103262z = str.toString();
        return true;
    }

    @Override // n0.w
    public int e(String str) {
        return b0.a(str);
    }

    @Override // l0.b
    /* JADX INFO: renamed from: g */
    public b clone() {
        return new e().h(this);
    }

    @Override // l0.b
    public b h(b bVar) {
        super.h(bVar);
        e eVar = (e) bVar;
        this.f103262z = eVar.f103262z;
        this.A = eVar.A;
        this.B = eVar.B;
        this.C = eVar.C;
        this.D = Float.NaN;
        this.E = eVar.E;
        this.F = eVar.F;
        this.G = eVar.G;
        this.H = eVar.H;
        this.J = eVar.J;
        this.K = eVar.K;
        return this;
    }

    public final void v(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float f16 = Float.isNaN(this.E) ? 0.0f : this.E;
        float f17 = Float.isNaN(this.H) ? 0.0f : this.H;
        float f18 = Float.isNaN(this.F) ? 0.0f : this.F;
        this.J = (int) (f10 + (f16 * f14) + ((Float.isNaN(this.G) ? 0.0f : this.G) * f15));
        this.K = (int) (f11 + (f14 * f17) + (f15 * f18));
    }

    public final void w(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float f16 = this.E;
        float f17 = this.F;
        this.J = f10 + (f14 * f16) + ((-f15) * f17);
        this.K = f11 + (f15 * f16) + (f14 * f17);
    }

    public void x(int i10, int i11, float f10, float f11, float f12, float f13) {
        int i12 = this.I;
        if (i12 == 1) {
            w(f10, f11, f12, f13);
        } else if (i12 != 2) {
            v(f10, f11, f12, f13);
        } else {
            y(i10, i11);
        }
    }

    public final void y(int i10, int i11) {
        float f10 = this.E;
        float f11 = 0;
        this.J = (i10 * f10) + f11;
        this.K = (i11 * f10) + f11;
    }

    public float z() {
        return this.J;
    }

    @Override // l0.b
    public void f(HashMap<String, o> map) {
    }

    @Override // l0.b
    public void i(HashSet<String> hashSet) {
    }
}

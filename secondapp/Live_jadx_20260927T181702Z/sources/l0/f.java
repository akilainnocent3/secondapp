package l0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import n0.e0;
import n0.o;
import n0.t;
import n0.y;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f extends b {
    public static final String Q = "KeyTimeCycle";
    public static final String R = "KeyTimeCycle";
    public static final int S = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f103263y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f103264z = -1;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public float I = Float.NaN;
    public float J = Float.NaN;
    public float K = Float.NaN;
    public float L = Float.NaN;
    public int M = 0;
    public String N = null;
    public float O = Float.NaN;
    public float P = 0.0f;

    public f() {
        this.f103250k = 3;
        this.f103251l = new HashMap<>();
    }

    @Override // l0.b, n0.w
    public boolean a(int i10, int i11) {
        if (i10 == 100) {
            this.f103247h = i11;
            return true;
        }
        if (i10 != 421) {
            return super.a(i10, i11);
        }
        this.M = i11;
        return true;
    }

    @Override // l0.b, n0.w
    public boolean b(int i10, float f10) {
        if (i10 == 315) {
            this.L = t(Float.valueOf(f10));
            return true;
        }
        if (i10 == 401) {
            this.f103264z = u(Float.valueOf(f10));
            return true;
        }
        if (i10 == 403) {
            this.A = f10;
            return true;
        }
        if (i10 == 416) {
            this.F = t(Float.valueOf(f10));
            return true;
        }
        if (i10 == 423) {
            this.O = t(Float.valueOf(f10));
            return true;
        }
        if (i10 == 424) {
            this.P = t(Float.valueOf(f10));
            return true;
        }
        switch (i10) {
            case 304:
                this.I = t(Float.valueOf(f10));
                return true;
            case 305:
                this.J = t(Float.valueOf(f10));
                return true;
            case 306:
                this.K = t(Float.valueOf(f10));
                return true;
            case 307:
                this.B = t(Float.valueOf(f10));
                return true;
            case 308:
                this.D = t(Float.valueOf(f10));
                return true;
            case 309:
                this.E = t(Float.valueOf(f10));
                return true;
            case 310:
                this.C = t(Float.valueOf(f10));
                return true;
            case 311:
                this.G = t(Float.valueOf(f10));
                return true;
            case 312:
                this.H = t(Float.valueOf(f10));
                return true;
            default:
                return super.b(i10, f10);
        }
    }

    @Override // l0.b, n0.w
    public boolean c(int i10, boolean z10) {
        return super.c(i10, z10);
    }

    @Override // l0.b, n0.w
    public boolean d(int i10, String str) {
        if (i10 == 420) {
            this.f103263y = str;
            return true;
        }
        if (i10 != 421) {
            return super.d(i10, str);
        }
        this.M = 7;
        this.N = str;
        return true;
    }

    @Override // n0.w
    public int e(String str) {
        return y.a(str);
    }

    @Override // l0.b
    /* JADX INFO: renamed from: g */
    public b clone() {
        return new f().h(this);
    }

    @Override // l0.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.A)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.B)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("translationZ");
        }
        if (this.f103251l.size() > 0) {
            Iterator<String> it = this.f103251l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void v(HashMap<String, t> map) {
        for (String str : map.keySet()) {
            t tVar = map.get(str);
            if (tVar != null) {
                byte b10 = 7;
                if (!str.startsWith("CUSTOM")) {
                    switch (str.hashCode()) {
                        case -1249320806:
                            b10 = str.equals("rotationX") ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            b10 = str.equals("rotationY") ? (byte) 1 : (byte) -1;
                            break;
                        case -1249320804:
                            b10 = str.equals("rotationZ") ? (byte) 2 : (byte) -1;
                            break;
                        case -1225497657:
                            b10 = str.equals("translationX") ? (byte) 3 : (byte) -1;
                            break;
                        case -1225497656:
                            b10 = str.equals("translationY") ? (byte) 4 : (byte) -1;
                            break;
                        case -1225497655:
                            b10 = str.equals("translationZ") ? (byte) 5 : (byte) -1;
                            break;
                        case -1001078227:
                            b10 = str.equals("progress") ? (byte) 6 : (byte) -1;
                            break;
                        case -908189618:
                            if (!str.equals("scaleX")) {
                                b10 = -1;
                            }
                            break;
                        case -908189617:
                            b10 = str.equals("scaleY") ? (byte) 8 : (byte) -1;
                            break;
                        case -4379043:
                            b10 = str.equals("elevation") ? (byte) 9 : (byte) -1;
                            break;
                        case 92909918:
                            b10 = str.equals("alpha") ? (byte) 10 : (byte) -1;
                            break;
                        case 803192288:
                            b10 = str.equals("pathRotate") ? zi.c.f161635m : (byte) -1;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        case 0:
                            if (!Float.isNaN(this.D)) {
                                tVar.c(this.f103247h, this.D, this.O, this.M, this.P);
                            }
                            break;
                        case 1:
                            if (!Float.isNaN(this.E)) {
                                tVar.c(this.f103247h, this.E, this.O, this.M, this.P);
                            }
                            break;
                        case 2:
                            if (!Float.isNaN(this.C)) {
                                tVar.c(this.f103247h, this.C, this.O, this.M, this.P);
                            }
                            break;
                        case 3:
                            if (!Float.isNaN(this.I)) {
                                tVar.c(this.f103247h, this.I, this.O, this.M, this.P);
                            }
                            break;
                        case 4:
                            if (!Float.isNaN(this.J)) {
                                tVar.c(this.f103247h, this.J, this.O, this.M, this.P);
                            }
                            break;
                        case 5:
                            if (!Float.isNaN(this.K)) {
                                tVar.c(this.f103247h, this.K, this.O, this.M, this.P);
                            }
                            break;
                        case 6:
                            if (!Float.isNaN(this.L)) {
                                tVar.c(this.f103247h, this.L, this.O, this.M, this.P);
                            }
                            break;
                        case 7:
                            if (!Float.isNaN(this.G)) {
                                tVar.c(this.f103247h, this.G, this.O, this.M, this.P);
                            }
                            break;
                        case 8:
                            if (!Float.isNaN(this.H)) {
                                tVar.c(this.f103247h, this.H, this.O, this.M, this.P);
                            }
                            break;
                        case 9:
                            if (!Float.isNaN(this.K)) {
                                tVar.c(this.f103247h, this.K, this.O, this.M, this.P);
                            }
                            break;
                        case 10:
                            if (!Float.isNaN(this.A)) {
                                tVar.c(this.f103247h, this.A, this.O, this.M, this.P);
                            }
                            break;
                        case 11:
                            if (!Float.isNaN(this.F)) {
                                tVar.c(this.f103247h, this.F, this.O, this.M, this.P);
                            }
                            break;
                        default:
                            e0.f("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    k0.b bVar = this.f103251l.get(str.substring(7));
                    if (bVar != null) {
                        ((t.b) tVar).g(this.f103247h, bVar, this.O, this.M, this.P);
                    }
                }
            }
        }
    }

    @Override // l0.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public f h(b bVar) {
        super.h(bVar);
        f fVar = (f) bVar;
        this.f103263y = fVar.f103263y;
        this.f103264z = fVar.f103264z;
        this.M = fVar.M;
        this.O = fVar.O;
        this.P = fVar.P;
        this.L = fVar.L;
        this.A = fVar.A;
        this.B = fVar.B;
        this.C = fVar.C;
        this.F = fVar.F;
        this.D = fVar.D;
        this.E = fVar.E;
        this.G = fVar.G;
        this.H = fVar.H;
        this.I = fVar.I;
        this.J = fVar.J;
        this.K = fVar.K;
        return this;
    }

    @Override // l0.b
    public void f(HashMap<String, o> map) {
    }
}

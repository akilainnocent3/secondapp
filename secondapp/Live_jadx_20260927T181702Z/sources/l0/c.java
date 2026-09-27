package l0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import n0.o;
import n0.v;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c extends b {
    public static final String P = "KeyAttribute";
    public static final String Q = "KeyAttributes";
    public static final boolean R = false;
    public static final int S = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f103252y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f103253z = -1;
    public int A = 0;
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
    public float M = Float.NaN;
    public float N = Float.NaN;
    public float O = Float.NaN;

    public c() {
        this.f103250k = 1;
        this.f103251l = new HashMap<>();
    }

    @Override // l0.b, n0.w
    public boolean a(int i10, int i11) {
        if (i10 == 100) {
            this.f103247h = i11;
            return true;
        }
        if (i10 == 301) {
            this.f103253z = i11;
            return true;
        }
        if (i10 == 302) {
            this.A = i11;
            return true;
        }
        if (a(i10, i11)) {
            return true;
        }
        return super.a(i10, i11);
    }

    @Override // l0.b, n0.w
    public boolean b(int i10, float f10) {
        if (i10 == 100) {
            this.I = f10;
            return true;
        }
        switch (i10) {
            case 303:
                this.B = f10;
                return true;
            case 304:
                this.L = f10;
                return true;
            case 305:
                this.M = f10;
                return true;
            case 306:
                this.N = f10;
                return true;
            case 307:
                this.C = f10;
                return true;
            case 308:
                this.E = f10;
                return true;
            case 309:
                this.F = f10;
                return true;
            case 310:
                this.D = f10;
                return true;
            case 311:
                this.J = f10;
                return true;
            case 312:
                this.K = f10;
                return true;
            case 313:
                this.G = f10;
                return true;
            case 314:
                this.H = f10;
                return true;
            case 315:
                this.O = f10;
                return true;
            case 316:
                this.I = f10;
                return true;
            default:
                return super.b(i10, f10);
        }
    }

    @Override // l0.b, n0.w
    public boolean d(int i10, String str) {
        if (i10 == 101) {
            this.f103249j = str;
            return true;
        }
        if (i10 != 317) {
            return super.d(i10, str);
        }
        this.f103252y = str;
        return true;
    }

    @Override // n0.w
    public int e(String str) {
        return v.a(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l0.b
    public void f(HashMap<String, o> map) {
        for (String str : map.keySet()) {
            o oVar = map.get(str);
            if (oVar != null) {
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
                        case -987906986:
                            if (!str.equals("pivotX")) {
                                b10 = -1;
                            }
                            break;
                        case -987906985:
                            b10 = str.equals("pivotY") ? (byte) 8 : (byte) -1;
                            break;
                        case -908189618:
                            b10 = str.equals("scaleX") ? (byte) 9 : (byte) -1;
                            break;
                        case -908189617:
                            b10 = str.equals("scaleY") ? (byte) 10 : (byte) -1;
                            break;
                        case -4379043:
                            b10 = str.equals("elevation") ? zi.c.f161635m : (byte) -1;
                            break;
                        case 92909918:
                            b10 = str.equals("alpha") ? zi.c.f161636n : (byte) -1;
                            break;
                        case 803192288:
                            b10 = str.equals("pathRotate") ? (byte) 13 : (byte) -1;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        case 0:
                            if (!Float.isNaN(this.E)) {
                                oVar.g(this.f103247h, this.E);
                            }
                            break;
                        case 1:
                            if (!Float.isNaN(this.F)) {
                                oVar.g(this.f103247h, this.F);
                            }
                            break;
                        case 2:
                            if (!Float.isNaN(this.D)) {
                                oVar.g(this.f103247h, this.D);
                            }
                            break;
                        case 3:
                            if (!Float.isNaN(this.L)) {
                                oVar.g(this.f103247h, this.L);
                            }
                            break;
                        case 4:
                            if (!Float.isNaN(this.M)) {
                                oVar.g(this.f103247h, this.M);
                            }
                            break;
                        case 5:
                            if (!Float.isNaN(this.N)) {
                                oVar.g(this.f103247h, this.N);
                            }
                            break;
                        case 6:
                            if (!Float.isNaN(this.O)) {
                                oVar.g(this.f103247h, this.O);
                            }
                            break;
                        case 7:
                            if (!Float.isNaN(this.E)) {
                                oVar.g(this.f103247h, this.G);
                            }
                            break;
                        case 8:
                            if (!Float.isNaN(this.F)) {
                                oVar.g(this.f103247h, this.H);
                            }
                            break;
                        case 9:
                            if (!Float.isNaN(this.J)) {
                                oVar.g(this.f103247h, this.J);
                            }
                            break;
                        case 10:
                            if (!Float.isNaN(this.K)) {
                                oVar.g(this.f103247h, this.K);
                            }
                            break;
                        case 11:
                            if (!Float.isNaN(this.C)) {
                                oVar.g(this.f103247h, this.C);
                            }
                            break;
                        case 12:
                            if (!Float.isNaN(this.B)) {
                                oVar.g(this.f103247h, this.B);
                            }
                            break;
                        case 13:
                            if (!Float.isNaN(this.I)) {
                                oVar.g(this.f103247h, this.I);
                            }
                            break;
                        default:
                            System.err.println("not supported by KeyAttributes " + str);
                            break;
                    }
                } else {
                    k0.b bVar = this.f103251l.get(str.substring(7));
                    if (bVar != null) {
                        ((o.c) oVar).k(this.f103247h, bVar);
                    }
                }
            }
        }
    }

    @Override // l0.b
    /* JADX INFO: renamed from: g */
    public b clone() {
        return null;
    }

    @Override // l0.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.B)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("progress");
        }
        if (this.f103251l.size() > 0) {
            Iterator<String> it = this.f103251l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // l0.b
    public void q(HashMap<String, Integer> map) {
        if (!Float.isNaN(this.B)) {
            map.put("alpha", Integer.valueOf(this.f103253z));
        }
        if (!Float.isNaN(this.C)) {
            map.put("elevation", Integer.valueOf(this.f103253z));
        }
        if (!Float.isNaN(this.D)) {
            map.put("rotationZ", Integer.valueOf(this.f103253z));
        }
        if (!Float.isNaN(this.E)) {
            map.put("rotationX", Integer.valueOf(this.f103253z));
        }
        if (!Float.isNaN(this.F)) {
            map.put("rotationY", Integer.valueOf(this.f103253z));
        }
        if (!Float.isNaN(this.G)) {
            map.put("pivotX", Integer.valueOf(this.f103253z));
        }
        if (!Float.isNaN(this.H)) {
            map.put("pivotY", Integer.valueOf(this.f103253z));
        }
        if (!Float.isNaN(this.L)) {
            map.put("translationX", Integer.valueOf(this.f103253z));
        }
        if (!Float.isNaN(this.M)) {
            map.put("translationY", Integer.valueOf(this.f103253z));
        }
        if (!Float.isNaN(this.N)) {
            map.put("translationZ", Integer.valueOf(this.f103253z));
        }
        if (!Float.isNaN(this.I)) {
            map.put("pathRotate", Integer.valueOf(this.f103253z));
        }
        if (!Float.isNaN(this.J)) {
            map.put("scaleX", Integer.valueOf(this.f103253z));
        }
        if (!Float.isNaN(this.K)) {
            map.put("scaleY", Integer.valueOf(this.f103253z));
        }
        if (!Float.isNaN(this.O)) {
            map.put("progress", Integer.valueOf(this.f103253z));
        }
        if (this.f103251l.size() > 0) {
            Iterator<String> it = this.f103251l.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.f103253z));
            }
        }
    }

    public int v() {
        return this.f103253z;
    }

    public final float w(int i10) {
        if (i10 == 100) {
            return this.f103247h;
        }
        switch (i10) {
            case 303:
                return this.B;
            case 304:
                return this.L;
            case 305:
                return this.M;
            case 306:
                return this.N;
            case 307:
                return this.C;
            case 308:
                return this.E;
            case 309:
                return this.F;
            case 310:
                return this.D;
            case 311:
                return this.J;
            case 312:
                return this.K;
            case 313:
                return this.G;
            case 314:
                return this.H;
            case 315:
                return this.O;
            case 316:
                return this.I;
            default:
                return Float.NaN;
        }
    }

    public void x() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        System.out.println(" ------------- " + this.f103247h + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            int iA = v.a(strArr[i10]);
            System.out.println(strArr[i10] + ":" + w(iA));
        }
    }
}

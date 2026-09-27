package l0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import n0.e0;
import n0.h;
import n0.o;
import n0.w;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d extends b {
    public static final String R = "KeyCycle";
    public static final String S = "KeyCycle";
    public static final String T = "wavePeriod";
    public static final String U = "waveOffset";
    public static final String V = "wavePhase";
    public static final String W = "waveShape";
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f103254a0 = 3;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f103255b0 = 4;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f103256c0 = 5;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f103257d0 = 6;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f103258e0 = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f103259y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f103260z = 0;
    public int A = -1;
    public String B = null;
    public float C = Float.NaN;
    public float D = 0.0f;
    public float E = 0.0f;
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
    public float P = Float.NaN;
    public float Q = Float.NaN;

    public d() {
        this.f103250k = 4;
        this.f103251l = new HashMap<>();
    }

    @Override // l0.b, n0.w
    public boolean a(int i10, int i11) {
        if (i10 == 401) {
            this.f103260z = i11;
            return true;
        }
        if (i10 == 421) {
            this.A = i11;
            return true;
        }
        if (b(i10, i11)) {
            return true;
        }
        return super.a(i10, i11);
    }

    @Override // l0.b, n0.w
    public boolean b(int i10, float f10) {
        if (i10 == 315) {
            this.F = f10;
            return true;
        }
        if (i10 == 403) {
            this.G = f10;
            return true;
        }
        if (i10 == 416) {
            this.J = f10;
            return true;
        }
        switch (i10) {
            case 304:
                this.O = f10;
                return true;
            case 305:
                this.P = f10;
                return true;
            case 306:
                this.Q = f10;
                return true;
            case 307:
                this.H = f10;
                return true;
            case 308:
                this.K = f10;
                return true;
            case 309:
                this.L = f10;
                return true;
            case 310:
                this.I = f10;
                return true;
            case 311:
                this.M = f10;
                return true;
            case 312:
                this.N = f10;
                return true;
            default:
                switch (i10) {
                    case 423:
                        this.C = f10;
                        return true;
                    case w.c.f115839v /* 424 */:
                        this.D = f10;
                        return true;
                    case w.c.f115840w /* 425 */:
                        this.E = f10;
                        return true;
                    default:
                        return super.b(i10, f10);
                }
        }
    }

    @Override // l0.b, n0.w
    public boolean d(int i10, String str) {
        if (i10 == 420) {
            this.f103259y = str;
            return true;
        }
        if (i10 != 422) {
            return super.d(i10, str);
        }
        this.B = str;
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // n0.w
    public int e(String str) {
        byte b10;
        str.getClass();
        switch (str.hashCode()) {
            case -1581616630:
                b10 = !str.equals(w.c.P) ? (byte) -1 : (byte) 0;
                break;
            case -1310311125:
                b10 = !str.equals("easing") ? (byte) -1 : (byte) 1;
                break;
            case -1249320806:
                b10 = !str.equals("rotationX") ? (byte) -1 : (byte) 2;
                break;
            case -1249320805:
                b10 = !str.equals("rotationY") ? (byte) -1 : (byte) 3;
                break;
            case -1249320804:
                b10 = !str.equals("rotationZ") ? (byte) -1 : (byte) 4;
                break;
            case -1225497657:
                b10 = !str.equals("translationX") ? (byte) -1 : (byte) 5;
                break;
            case -1225497656:
                b10 = !str.equals("translationY") ? (byte) -1 : (byte) 6;
                break;
            case -1225497655:
                b10 = !str.equals("translationZ") ? (byte) -1 : (byte) 7;
                break;
            case -1019779949:
                b10 = !str.equals("offset") ? (byte) -1 : (byte) 8;
                break;
            case -1001078227:
                b10 = !str.equals("progress") ? (byte) -1 : (byte) 9;
                break;
            case -991726143:
                b10 = !str.equals(w.c.Q) ? (byte) -1 : (byte) 10;
                break;
            case -987906986:
                b10 = !str.equals("pivotX") ? (byte) -1 : zi.c.f161635m;
                break;
            case -987906985:
                b10 = !str.equals("pivotY") ? (byte) -1 : zi.c.f161636n;
                break;
            case -908189618:
                b10 = !str.equals("scaleX") ? (byte) -1 : (byte) 13;
                break;
            case -908189617:
                b10 = !str.equals("scaleY") ? (byte) -1 : zi.c.f161638p;
                break;
            case 92909918:
                b10 = !str.equals("alpha") ? (byte) -1 : zi.c.f161639q;
                break;
            case 106629499:
                b10 = !str.equals(w.c.S) ? (byte) -1 : zi.c.f161640r;
                break;
            case 579057826:
                b10 = !str.equals("curveFit") ? (byte) -1 : (byte) 17;
                break;
            case 803192288:
                b10 = !str.equals("pathRotate") ? (byte) -1 : zi.c.f161643u;
                break;
            case 1532805160:
                b10 = !str.equals("waveShape") ? (byte) -1 : (byte) 19;
                break;
            case 1941332754:
                b10 = !str.equals("visibility") ? (byte) -1 : zi.c.f161646x;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return 422;
            case 1:
                return 420;
            case 2:
                return 308;
            case 3:
                return 309;
            case 4:
                return 310;
            case 5:
                return 304;
            case 6:
                return 305;
            case 7:
                return 306;
            case 8:
                return w.c.f115839v;
            case 9:
                return 315;
            case 10:
                return 423;
            case 11:
                return 313;
            case 12:
                return 314;
            case 13:
                return 311;
            case 14:
                return 312;
            case 15:
                return 403;
            case 16:
                return w.c.f115840w;
            case 17:
                return 401;
            case 18:
                return 416;
            case 19:
                return 421;
            case 20:
                return 402;
            default:
                return -1;
        }
    }

    @Override // l0.b
    /* JADX INFO: renamed from: g */
    public b clone() {
        return null;
    }

    @Override // l0.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.G)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("translationZ");
        }
        if (this.f103251l.size() > 0) {
            Iterator<String> it = this.f103251l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public void v(HashMap<String, h> map) {
        h hVar;
        h hVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                k0.b bVar = this.f103251l.get(str.substring(7));
                if (bVar != null && bVar.m() == 901 && (hVar = map.get(str)) != null) {
                    hVar.g(this.f103247h, this.A, this.B, -1, this.C, this.D, this.E / 360.0f, bVar.n(), bVar);
                }
            } else {
                float fX = x(str);
                if (!Float.isNaN(fX) && (hVar2 = map.get(str)) != null) {
                    hVar2.f(this.f103247h, this.A, this.B, -1, this.C, this.D, this.E / 360.0f, fX);
                }
            }
        }
    }

    public void w() {
        System.out.println("MotionKeyCycle{mWaveShape=" + this.A + ", mWavePeriod=" + this.C + ", mWaveOffset=" + this.D + ", mWavePhase=" + this.E + ", mRotation=" + this.I + fw.b.f85383j);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public float x(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    b10 = 0;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b10 = 1;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    b10 = 2;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b10 = 3;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b10 = 4;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b10 = 5;
                }
                break;
            case -1019779949:
                if (str.equals("offset")) {
                    b10 = 6;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    b10 = 7;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 8;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = 9;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b10 = 10;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = zi.c.f161635m;
                }
                break;
            case 106629499:
                if (str.equals(w.c.S)) {
                    b10 = zi.c.f161636n;
                }
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    b10 = 13;
                }
                break;
        }
        switch (b10) {
            case 0:
                return this.K;
            case 1:
                return this.L;
            case 2:
                return this.I;
            case 3:
                return this.O;
            case 4:
                return this.P;
            case 5:
                return this.Q;
            case 6:
                return this.D;
            case 7:
                return this.F;
            case 8:
                return this.M;
            case 9:
                return this.N;
            case 10:
                return this.H;
            case 11:
                return this.G;
            case 12:
                return this.E;
            case 13:
                return this.J;
            default:
                return Float.NaN;
        }
    }

    public void y() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        e0.c(" ------------- " + this.f103247h + " -------------");
        e0.c("MotionKeyCycle{Shape=" + this.A + ", Period=" + this.C + ", Offset=" + this.D + ", Phase=" + this.E + fw.b.f85383j);
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            e0.c(strArr[i10] + ":" + x(strArr[i10]));
        }
    }

    @Override // l0.b
    public void f(HashMap<String, o> map) {
    }
}

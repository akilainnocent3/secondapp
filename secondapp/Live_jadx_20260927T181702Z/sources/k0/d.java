package k0;

import com.ironsource.C4235d4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import n0.e0;
import n0.m;
import n0.o;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d implements Comparable<d> {
    public static final String E = "MotionPaths";
    public static final boolean F = false;
    public static final int G = 1;
    public static final int H = 2;
    public static String[] I = {C4235d4.i.L, "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f101538d;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n0.d f101551q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f101553s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f101554t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f101555u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f101556v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f101557w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f101536b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f101537c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f101539e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f101540f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f101541g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f101542h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f101543i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f101544j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f101545k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f101546l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f101547m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f101548n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f101549o = 0.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f101550p = 0.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f101552r = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f101558x = Float.NaN;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f101559y = Float.NaN;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f101560z = -1;
    public LinkedHashMap<String, b> A = new LinkedHashMap<>();
    public int B = 0;
    public double[] C = new double[18];
    public double[] D = new double[18];

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(HashMap<String, o> map, int i10) {
        for (String str : map.keySet()) {
            o oVar = map.get(str);
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
                case -1001078227:
                    if (str.equals("progress")) {
                        b10 = 6;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        b10 = 7;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        b10 = 8;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b10 = 9;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b10 = 10;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b10 = zi.c.f161635m;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        b10 = zi.c.f161636n;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    oVar.g(i10, Float.isNaN(this.f101542h) ? 0.0f : this.f101542h);
                    break;
                case 1:
                    oVar.g(i10, Float.isNaN(this.f101543i) ? 0.0f : this.f101543i);
                    break;
                case 2:
                    oVar.g(i10, Float.isNaN(this.f101541g) ? 0.0f : this.f101541g);
                    break;
                case 3:
                    oVar.g(i10, Float.isNaN(this.f101548n) ? 0.0f : this.f101548n);
                    break;
                case 4:
                    oVar.g(i10, Float.isNaN(this.f101549o) ? 0.0f : this.f101549o);
                    break;
                case 5:
                    oVar.g(i10, Float.isNaN(this.f101550p) ? 0.0f : this.f101550p);
                    break;
                case 6:
                    oVar.g(i10, Float.isNaN(this.f101559y) ? 0.0f : this.f101559y);
                    break;
                case 7:
                    oVar.g(i10, Float.isNaN(this.f101546l) ? 0.0f : this.f101546l);
                    break;
                case 8:
                    oVar.g(i10, Float.isNaN(this.f101547m) ? 0.0f : this.f101547m);
                    break;
                case 9:
                    oVar.g(i10, Float.isNaN(this.f101544j) ? 1.0f : this.f101544j);
                    break;
                case 10:
                    oVar.g(i10, Float.isNaN(this.f101545k) ? 1.0f : this.f101545k);
                    break;
                case 11:
                    oVar.g(i10, Float.isNaN(this.f101536b) ? 1.0f : this.f101536b);
                    break;
                case 12:
                    oVar.g(i10, Float.isNaN(this.f101558x) ? 0.0f : this.f101558x);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.A.containsKey(str2)) {
                            b bVar = this.A.get(str2);
                            if (oVar instanceof o.c) {
                                ((o.c) oVar).k(i10, bVar);
                            } else {
                                e0.f("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + bVar.n() + oVar);
                            }
                        }
                    } else {
                        e0.f("MotionPaths", "UNKNOWN spline " + str);
                    }
                    break;
            }
        }
    }

    public void b(f fVar) {
        this.f101538d = fVar.B();
        this.f101536b = fVar.B() != 4 ? 0.0f : fVar.g();
        this.f101539e = false;
        this.f101541g = fVar.t();
        this.f101542h = fVar.r();
        this.f101543i = fVar.s();
        this.f101544j = fVar.u();
        this.f101545k = fVar.v();
        this.f101546l = fVar.o();
        this.f101547m = fVar.p();
        this.f101548n = fVar.x();
        this.f101549o = fVar.y();
        this.f101550p = fVar.z();
        for (String str : fVar.j()) {
            b bVarI = fVar.i(str);
            if (bVarI != null && bVarI.q()) {
                this.A.put(str, bVarI);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        return Float.compare(this.f101553s, dVar.f101553s);
    }

    public final boolean d(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    public void e(d dVar, HashSet<String> hashSet) {
        if (d(this.f101536b, dVar.f101536b)) {
            hashSet.add("alpha");
        }
        if (d(this.f101540f, dVar.f101540f)) {
            hashSet.add("translationZ");
        }
        int i10 = this.f101538d;
        int i11 = dVar.f101538d;
        if (i10 != i11 && this.f101537c == 0 && (i10 == 4 || i11 == 4)) {
            hashSet.add("alpha");
        }
        if (d(this.f101541g, dVar.f101541g)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f101558x) || !Float.isNaN(dVar.f101558x)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f101559y) || !Float.isNaN(dVar.f101559y)) {
            hashSet.add("progress");
        }
        if (d(this.f101542h, dVar.f101542h)) {
            hashSet.add("rotationX");
        }
        if (d(this.f101543i, dVar.f101543i)) {
            hashSet.add("rotationY");
        }
        if (d(this.f101546l, dVar.f101546l)) {
            hashSet.add("pivotX");
        }
        if (d(this.f101547m, dVar.f101547m)) {
            hashSet.add("pivotY");
        }
        if (d(this.f101544j, dVar.f101544j)) {
            hashSet.add("scaleX");
        }
        if (d(this.f101545k, dVar.f101545k)) {
            hashSet.add("scaleY");
        }
        if (d(this.f101548n, dVar.f101548n)) {
            hashSet.add("translationX");
        }
        if (d(this.f101549o, dVar.f101549o)) {
            hashSet.add("translationY");
        }
        if (d(this.f101550p, dVar.f101550p)) {
            hashSet.add("translationZ");
        }
        if (d(this.f101540f, dVar.f101540f)) {
            hashSet.add("elevation");
        }
    }

    public void f(d dVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | d(this.f101553s, dVar.f101553s);
        zArr[1] = zArr[1] | d(this.f101554t, dVar.f101554t);
        zArr[2] = zArr[2] | d(this.f101555u, dVar.f101555u);
        zArr[3] = zArr[3] | d(this.f101556v, dVar.f101556v);
        zArr[4] = d(this.f101557w, dVar.f101557w) | zArr[4];
    }

    public void g(double[] dArr, int[] iArr) {
        int i10 = 0;
        float[] fArr = {this.f101553s, this.f101554t, this.f101555u, this.f101556v, this.f101557w, this.f101536b, this.f101540f, this.f101541g, this.f101542h, this.f101543i, this.f101544j, this.f101545k, this.f101546l, this.f101547m, this.f101548n, this.f101549o, this.f101550p, this.f101558x};
        for (int i11 : iArr) {
            if (i11 < 18) {
                dArr[i10] = fArr[i11];
                i10++;
            }
        }
    }

    public int h(String str, double[] dArr, int i10) {
        b bVar = this.A.get(str);
        if (bVar.r() == 1) {
            dArr[i10] = bVar.n();
            return 1;
        }
        int iR = bVar.r();
        float[] fArr = new float[iR];
        bVar.o(fArr);
        int i11 = 0;
        while (i11 < iR) {
            dArr[i10] = fArr[i11];
            i11++;
            i10++;
        }
        return iR;
    }

    public int i(String str) {
        return this.A.get(str).r();
    }

    public boolean j(String str) {
        return this.A.containsKey(str);
    }

    public void k(float f10, float f11, float f12, float f13) {
        this.f101554t = f10;
        this.f101555u = f11;
        this.f101556v = f12;
        this.f101557w = f13;
    }

    public void l(f fVar) {
        k(fVar.E(), fVar.F(), fVar.D(), fVar.k());
        b(fVar);
    }

    public void m(m mVar, f fVar, int i10, float f10) {
        k(mVar.f115669b, mVar.f115671d, mVar.b(), mVar.a());
        b(fVar);
        this.f101546l = Float.NaN;
        this.f101547m = Float.NaN;
        if (i10 == 1) {
            this.f101541g = f10 - 90.0f;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f101541g = f10 + 90.0f;
        }
    }
}

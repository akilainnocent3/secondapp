package w0;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import com.ironsource.C4235d4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class n implements Comparable<n> {
    public static final String E = "MotionPaths";
    public static final boolean F = false;
    public static final int G = 1;
    public static final int H = 2;
    public static String[] I = {C4235d4.i.L, "x", "y", "width", "height", "pathRotate"};
    public float A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f141896d;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n0.d f141913u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f141915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f141916x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f141917y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f141918z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f141894b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f141895c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedHashMap<String, androidx.constraintlayout.widget.b> f141897e = new LinkedHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f141898f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double[] f141899g = new double[18];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double[] f141900h = new double[18];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f141901i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f141902j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f141903k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f141904l = 0.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f141905m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f141906n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f141907o = 1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f141908p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f141909q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f141910r = 0.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f141911s = 0.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f141912t = 0.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f141914v = 0;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public int D = -1;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(HashMap<String, v0.d> map, int i10) {
        for (String str : map.keySet()) {
            v0.d dVar = map.get(str);
            if (dVar != null) {
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
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b10 = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b10 = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b10 = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b10 = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b10 = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b10 = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals(f.f141743l)) {
                            b10 = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals(f.f141744m)) {
                            b10 = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals(f.f141740i)) {
                            b10 = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b10 = zi.c.f161635m;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b10 = zi.c.f161636n;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b10 = 13;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        dVar.g(i10, Float.isNaN(this.f141905m) ? 0.0f : this.f141905m);
                        break;
                    case 1:
                        dVar.g(i10, Float.isNaN(this.f141894b) ? 0.0f : this.f141894b);
                        break;
                    case 2:
                        dVar.g(i10, Float.isNaN(this.f141910r) ? 0.0f : this.f141910r);
                        break;
                    case 3:
                        dVar.g(i10, Float.isNaN(this.f141911s) ? 0.0f : this.f141911s);
                        break;
                    case 4:
                        dVar.g(i10, Float.isNaN(this.f141912t) ? 0.0f : this.f141912t);
                        break;
                    case 5:
                        dVar.g(i10, Float.isNaN(this.C) ? 0.0f : this.C);
                        break;
                    case 6:
                        dVar.g(i10, Float.isNaN(this.f141906n) ? 1.0f : this.f141906n);
                        break;
                    case 7:
                        dVar.g(i10, Float.isNaN(this.f141907o) ? 1.0f : this.f141907o);
                        break;
                    case 8:
                        dVar.g(i10, Float.isNaN(this.f141908p) ? 0.0f : this.f141908p);
                        break;
                    case 9:
                        dVar.g(i10, Float.isNaN(this.f141909q) ? 0.0f : this.f141909q);
                        break;
                    case 10:
                        dVar.g(i10, Float.isNaN(this.f141904l) ? 0.0f : this.f141904l);
                        break;
                    case 11:
                        dVar.g(i10, Float.isNaN(this.f141903k) ? 0.0f : this.f141903k);
                        break;
                    case 12:
                        dVar.g(i10, Float.isNaN(this.B) ? 0.0f : this.B);
                        break;
                    case 13:
                        dVar.g(i10, Float.isNaN(this.f141901i) ? 1.0f : this.f141901i);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            if (this.f141897e.containsKey(str2)) {
                                androidx.constraintlayout.widget.b bVar = this.f141897e.get(str2);
                                if (dVar instanceof v0.d.b) {
                                    ((v0.d.b) dVar).n(i10, bVar);
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + bVar.k() + dVar);
                                }
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline " + str);
                        }
                        break;
                }
            }
        }
    }

    public void b(View view) {
        this.f141896d = view.getVisibility();
        this.f141901i = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f141902j = false;
        this.f141903k = view.getElevation();
        this.f141904l = view.getRotation();
        this.f141905m = view.getRotationX();
        this.f141894b = view.getRotationY();
        this.f141906n = view.getScaleX();
        this.f141907o = view.getScaleY();
        this.f141908p = view.getPivotX();
        this.f141909q = view.getPivotY();
        this.f141910r = view.getTranslationX();
        this.f141911s = view.getTranslationY();
        this.f141912t = view.getTranslationZ();
    }

    public void c(androidx.constraintlayout.widget.g.a aVar) {
        androidx.constraintlayout.widget.g.d dVar = aVar.f8046c;
        int i10 = dVar.f8174c;
        this.f141895c = i10;
        int i11 = dVar.f8173b;
        this.f141896d = i11;
        this.f141901i = (i11 == 0 || i10 != 0) ? dVar.f8175d : 0.0f;
        androidx.constraintlayout.widget.g.e eVar = aVar.f8049f;
        this.f141902j = eVar.f8201m;
        this.f141903k = eVar.f8202n;
        this.f141904l = eVar.f8190b;
        this.f141905m = eVar.f8191c;
        this.f141894b = eVar.f8192d;
        this.f141906n = eVar.f8193e;
        this.f141907o = eVar.f8194f;
        this.f141908p = eVar.f8195g;
        this.f141909q = eVar.f8196h;
        this.f141910r = eVar.f8198j;
        this.f141911s = eVar.f8199k;
        this.f141912t = eVar.f8200l;
        this.f141913u = n0.d.c(aVar.f8047d.f8161d);
        androidx.constraintlayout.widget.g.c cVar = aVar.f8047d;
        this.B = cVar.f8166i;
        this.f141914v = cVar.f8163f;
        this.D = cVar.f8159b;
        this.C = aVar.f8046c.f8176e;
        for (String str : aVar.f8050g.keySet()) {
            androidx.constraintlayout.widget.b bVar = aVar.f8050g.get(str);
            if (bVar.n()) {
                this.f141897e.put(str, bVar);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return Float.compare(this.f141915w, nVar.f141915w);
    }

    public final boolean e(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    public void f(n nVar, HashSet<String> hashSet) {
        if (e(this.f141901i, nVar.f141901i)) {
            hashSet.add("alpha");
        }
        if (e(this.f141903k, nVar.f141903k)) {
            hashSet.add("elevation");
        }
        int i10 = this.f141896d;
        int i11 = nVar.f141896d;
        if (i10 != i11 && this.f141895c == 0 && (i10 == 0 || i11 == 0)) {
            hashSet.add("alpha");
        }
        if (e(this.f141904l, nVar.f141904l)) {
            hashSet.add(f.f141740i);
        }
        if (!Float.isNaN(this.B) || !Float.isNaN(nVar.B)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.C) || !Float.isNaN(nVar.C)) {
            hashSet.add("progress");
        }
        if (e(this.f141905m, nVar.f141905m)) {
            hashSet.add("rotationX");
        }
        if (e(this.f141894b, nVar.f141894b)) {
            hashSet.add("rotationY");
        }
        if (e(this.f141908p, nVar.f141908p)) {
            hashSet.add(f.f141743l);
        }
        if (e(this.f141909q, nVar.f141909q)) {
            hashSet.add(f.f141744m);
        }
        if (e(this.f141906n, nVar.f141906n)) {
            hashSet.add("scaleX");
        }
        if (e(this.f141907o, nVar.f141907o)) {
            hashSet.add("scaleY");
        }
        if (e(this.f141910r, nVar.f141910r)) {
            hashSet.add("translationX");
        }
        if (e(this.f141911s, nVar.f141911s)) {
            hashSet.add("translationY");
        }
        if (e(this.f141912t, nVar.f141912t)) {
            hashSet.add("translationZ");
        }
    }

    public void g(n nVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | e(this.f141915w, nVar.f141915w);
        zArr[1] = zArr[1] | e(this.f141916x, nVar.f141916x);
        zArr[2] = zArr[2] | e(this.f141917y, nVar.f141917y);
        zArr[3] = zArr[3] | e(this.f141918z, nVar.f141918z);
        zArr[4] = e(this.A, nVar.A) | zArr[4];
    }

    public void h(double[] dArr, int[] iArr) {
        int i10 = 0;
        float[] fArr = {this.f141915w, this.f141916x, this.f141917y, this.f141918z, this.A, this.f141901i, this.f141903k, this.f141904l, this.f141905m, this.f141894b, this.f141906n, this.f141907o, this.f141908p, this.f141909q, this.f141910r, this.f141911s, this.f141912t, this.B};
        for (int i11 : iArr) {
            if (i11 < 18) {
                dArr[i10] = fArr[i11];
                i10++;
            }
        }
    }

    public int i(String str, double[] dArr, int i10) {
        androidx.constraintlayout.widget.b bVar = this.f141897e.get(str);
        if (bVar.p() == 1) {
            dArr[i10] = bVar.k();
            return 1;
        }
        int iP = bVar.p();
        float[] fArr = new float[iP];
        bVar.l(fArr);
        int i11 = 0;
        while (i11 < iP) {
            dArr[i10] = fArr[i11];
            i11++;
            i10++;
        }
        return iP;
    }

    public int j(String str) {
        return this.f141897e.get(str).p();
    }

    public boolean k(String str) {
        return this.f141897e.containsKey(str);
    }

    public void l(float f10, float f11, float f12, float f13) {
        this.f141916x = f10;
        this.f141917y = f11;
        this.f141918z = f12;
        this.A = f13;
    }

    public void m(Rect rect, View view, int i10, float f10) {
        l(rect.left, rect.top, rect.width(), rect.height());
        b(view);
        this.f141908p = Float.NaN;
        this.f141909q = Float.NaN;
        if (i10 == 1) {
            this.f141904l = f10 - 90.0f;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f141904l = f10 + 90.0f;
        }
    }

    public void n(Rect rect, androidx.constraintlayout.widget.g gVar, int i10, int i11) {
        l(rect.left, rect.top, rect.width(), rect.height());
        c(gVar.q0(i11));
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                }
            }
            float f10 = this.f141904l + 90.0f;
            this.f141904l = f10;
            if (f10 > 180.0f) {
                this.f141904l = f10 - 360.0f;
                return;
            }
            return;
        }
        this.f141904l -= 90.0f;
    }

    public void o(View view) {
        l(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        b(view);
    }
}

package n0;

import com.ironsource.C4235d4;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f115591h = "KeyCycleOscillator";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n0.b f115592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f115593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f115594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f115595d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f115596e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f115597f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<e> f115598g = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Comparator<e> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(e eVar, e eVar2) {
            return Integer.compare(eVar.f115622a, eVar2.f115622a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends h {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f115600i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f115601j;

        public b(String str) {
            this.f115600i = str;
            this.f115601j = y.a(str);
        }

        @Override // n0.h
        public void h(k0.f fVar, float f10) {
            fVar.b(this.f115601j, a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f115602q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f115603r = "CycleOscillator";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f115604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l f115605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f115606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f115607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f115608e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float[] f115609f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double[] f115610g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float[] f115611h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float[] f115612i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float[] f115613j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float[] f115614k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f115615l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public n0.b f115616m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public double[] f115617n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public double[] f115618o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f115619p;

        public c(int i10, String str, int i11, int i12) {
            l lVar = new l();
            this.f115605b = lVar;
            this.f115606c = 0;
            this.f115607d = 1;
            this.f115608e = 2;
            this.f115615l = i10;
            this.f115604a = i11;
            lVar.g(i10, str);
            this.f115609f = new float[i12];
            this.f115610g = new double[i12];
            this.f115611h = new float[i12];
            this.f115612i = new float[i12];
            this.f115613j = new float[i12];
            this.f115614k = new float[i12];
        }

        public double a() {
            return this.f115617n[1];
        }

        public double b(float f10) {
            n0.b bVar = this.f115616m;
            if (bVar != null) {
                double d10 = f10;
                bVar.g(d10, this.f115618o);
                this.f115616m.d(d10, this.f115617n);
            } else {
                double[] dArr = this.f115618o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d11 = f10;
            double dE = this.f115605b.e(d11, this.f115617n[1]);
            double d12 = this.f115605b.d(d11, this.f115617n[1], this.f115618o[1]);
            double[] dArr2 = this.f115618o;
            return dArr2[0] + (dE * dArr2[2]) + (d12 * this.f115617n[2]);
        }

        public double c(float f10) {
            n0.b bVar = this.f115616m;
            if (bVar != null) {
                bVar.d(f10, this.f115617n);
            } else {
                double[] dArr = this.f115617n;
                dArr[0] = this.f115612i[0];
                dArr[1] = this.f115613j[0];
                dArr[2] = this.f115609f[0];
            }
            double[] dArr2 = this.f115617n;
            return dArr2[0] + (this.f115605b.e(f10, dArr2[1]) * this.f115617n[2]);
        }

        public void d(int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f115610g[i10] = ((double) i11) / 100.0d;
            this.f115611h[i10] = f10;
            this.f115612i[i10] = f11;
            this.f115613j[i10] = f12;
            this.f115609f[i10] = f13;
        }

        public void e(float f10) {
            this.f115619p = f10;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f115610g.length, 3);
            float[] fArr = this.f115609f;
            this.f115617n = new double[fArr.length + 2];
            this.f115618o = new double[fArr.length + 2];
            if (this.f115610g[0] > 0.0d) {
                this.f115605b.a(0.0d, this.f115611h[0]);
            }
            double[] dArr2 = this.f115610g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f115605b.a(1.0d, this.f115611h[length]);
            }
            for (int i10 = 0; i10 < dArr.length; i10++) {
                double[] dArr3 = dArr[i10];
                dArr3[0] = this.f115612i[i10];
                dArr3[1] = this.f115613j[i10];
                dArr3[2] = this.f115609f[i10];
                this.f115605b.a(this.f115610g[i10], this.f115611h[i10]);
            }
            this.f115605b.f();
            double[] dArr4 = this.f115610g;
            if (dArr4.length > 1) {
                this.f115616m = n0.b.a(0, dArr4, dArr);
            } else {
                this.f115616m = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends h {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f115620i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f115621j;

        public d(String str) {
            this.f115620i = str;
            this.f115621j = y.a(str);
        }

        @Override // n0.h
        public void h(k0.f fVar, float f10) {
            fVar.b(this.f115621j, a(f10));
        }

        public void l(k0.f fVar, float f10, double d10, double d11) {
            fVar.R(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f115623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f115624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f115625d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f115626e;

        public e(int i10, float f10, float f11, float f12, float f13) {
            this.f115622a = i10;
            this.f115623b = f13;
            this.f115624c = f11;
            this.f115625d = f10;
            this.f115626e = f12;
        }
    }

    public static h d(String str) {
        return str.equals("pathRotate") ? new d(str) : new b(str);
    }

    public float a(float f10) {
        return (float) this.f115593b.c(f10);
    }

    public n0.b b() {
        return this.f115592a;
    }

    public float c(float f10) {
        return (float) this.f115593b.b(f10);
    }

    public void f(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13) {
        this.f115598g.add(new e(i10, f10, f11, f12, f13));
        if (i12 != -1) {
            this.f115597f = i12;
        }
        this.f115595d = i11;
        this.f115596e = str;
    }

    public void g(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13, Object obj) {
        this.f115598g.add(new e(i10, f10, f11, f12, f13));
        if (i12 != -1) {
            this.f115597f = i12;
        }
        this.f115595d = i11;
        e(obj);
        this.f115596e = str;
    }

    public void i(String str) {
        this.f115594c = str;
    }

    public void j(float f10) {
        int size = this.f115598g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f115598g, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f115593b = new c(this.f115595d, this.f115596e, this.f115597f, size);
        int i10 = 0;
        for (e eVar : this.f115598g) {
            float f11 = eVar.f115625d;
            dArr[i10] = ((double) f11) * 0.01d;
            double[] dArr3 = dArr2[i10];
            float f12 = eVar.f115623b;
            dArr3[0] = f12;
            float f13 = eVar.f115624c;
            dArr3[1] = f13;
            float f14 = eVar.f115626e;
            dArr3[2] = f14;
            this.f115593b.d(i10, eVar.f115622a, f11, f13, f14, f12);
            i10++;
        }
        this.f115593b.e(f10);
        this.f115592a = n0.b.a(0, dArr, dArr2);
    }

    public boolean k() {
        return this.f115597f == 1;
    }

    public String toString() {
        String str = this.f115594c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (e eVar : this.f115598g) {
            str = str + C4235d4.j.f61460d + eVar.f115622a + " , " + decimalFormat.format(eVar.f115623b) + "] ";
        }
        return str;
    }

    public void e(Object obj) {
    }

    public void h(k0.f fVar, float f10) {
    }
}

package n0;

import com.ironsource.C4235d4;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f115676f = "SplineSet";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n0.b f115677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f115678b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f115679c = new float[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f115680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f115681e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f115682g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f115683h;

        public a(String str, long j10) {
            this.f115682g = str;
            this.f115683h = j10;
        }

        @Override // n0.o
        public void h(w wVar, float f10) {
            wVar.b(wVar.e(this.f115682g), a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f115684g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public i.a f115685h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float[] f115686i;

        public b(String str, i.a aVar) {
            this.f115684g = str.split(",")[1];
            this.f115685h = aVar;
        }

        @Override // n0.o
        public void g(int i10, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // n0.o
        public void j(int i10) {
            int iF = this.f115685h.f();
            int iH = this.f115685h.g(0).h();
            double[] dArr = new double[iF];
            this.f115686i = new float[iH];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iF, iH);
            for (int i11 = 0; i11 < iF; i11++) {
                int iD = this.f115685h.d(i11);
                k0.a aVarG = this.f115685h.g(i11);
                dArr[i11] = ((double) iD) * 0.01d;
                aVarG.e(this.f115686i);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f115686i;
                    if (i12 < fArr.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
            }
            this.f115677a = n0.b.a(i10, dArr, dArr2);
        }

        public void k(int i10, k0.a aVar) {
            this.f115685h.a(i10, aVar);
        }

        public void l(p0.v vVar, float f10) {
            this.f115677a.e(f10, this.f115686i);
            vVar.B(this.f115685h.g(0), this.f115686i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f115687g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public i.b f115688h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float[] f115689i;

        public c(String str, i.b bVar) {
            this.f115687g = str.split(",")[1];
            this.f115688h = bVar;
        }

        @Override // n0.o
        public void g(int i10, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // n0.o
        public void h(w wVar, float f10) {
            l((k0.f) wVar, f10);
        }

        @Override // n0.o
        public void j(int i10) {
            int iF = this.f115688h.f();
            int iR = this.f115688h.g(0).r();
            double[] dArr = new double[iF];
            this.f115689i = new float[iR];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iF, iR);
            for (int i11 = 0; i11 < iF; i11++) {
                int iD = this.f115688h.d(i11);
                k0.b bVarG = this.f115688h.g(i11);
                dArr[i11] = ((double) iD) * 0.01d;
                bVarG.o(this.f115689i);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f115689i;
                    if (i12 < fArr.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
            }
            this.f115677a = n0.b.a(i10, dArr, dArr2);
        }

        public void k(int i10, k0.b bVar) {
            this.f115688h.a(i10, bVar);
        }

        public void l(k0.f fVar, float f10) {
            this.f115677a.e(f10, this.f115689i);
            this.f115688h.g(0).w(fVar, this.f115689i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {
        public static void a(int[] iArr, float[] fArr, int i10, int i11) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i11;
            iArr2[1] = i10;
            int i12 = 2;
            while (i12 > 0) {
                int i13 = iArr2[i12 - 1];
                int i14 = i12 - 2;
                int i15 = iArr2[i14];
                if (i13 < i15) {
                    int iB = b(iArr, fArr, i13, i15);
                    iArr2[i14] = iB - 1;
                    iArr2[i12 - 1] = i13;
                    int i16 = i12 + 1;
                    iArr2[i12] = i15;
                    i12 += 2;
                    iArr2[i16] = iB + 1;
                } else {
                    i12 = i14;
                }
            }
        }

        public static int b(int[] iArr, float[] fArr, int i10, int i11) {
            int i12 = iArr[i11];
            int i13 = i10;
            while (i10 < i11) {
                if (iArr[i10] <= i12) {
                    c(iArr, fArr, i13, i10);
                    i13++;
                }
                i10++;
            }
            c(iArr, fArr, i13, i11);
            return i13;
        }

        public static void c(int[] iArr, float[] fArr, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float f10 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = f10;
        }
    }

    public static o d(String str, i.a aVar) {
        return new b(str, aVar);
    }

    public static o e(String str, i.b bVar) {
        return new c(str, bVar);
    }

    public static o f(String str, long j10) {
        return new a(str, j10);
    }

    public float a(float f10) {
        return (float) this.f115677a.c(f10, 0);
    }

    public n0.b b() {
        return this.f115677a;
    }

    public float c(float f10) {
        return (float) this.f115677a.f(f10, 0);
    }

    public void g(int i10, float f10) {
        int[] iArr = this.f115678b;
        if (iArr.length < this.f115680d + 1) {
            this.f115678b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f115679c;
            this.f115679c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f115678b;
        int i11 = this.f115680d;
        iArr2[i11] = i10;
        this.f115679c[i11] = f10;
        this.f115680d = i11 + 1;
    }

    public void h(w wVar, float f10) {
        wVar.b(v.a(this.f115681e), a(f10));
    }

    public void i(String str) {
        this.f115681e = str;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    public void j(int i10) {
        int i11 = this.f115680d;
        if (i11 == 0) {
            return;
        }
        d.a(this.f115678b, this.f115679c, 0, i11 - 1);
        int i12 = 1;
        for (int i13 = 1; i13 < this.f115680d; i13++) {
            int[] iArr = this.f115678b;
            if (iArr[i13 - 1] != iArr[i13]) {
                i12++;
            }
        }
        double[] dArr = new double[i12];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i12, 1);
        int i14 = 0;
        for (int i15 = 0; i15 < this.f115680d; i15++) {
            if (i15 > 0) {
                int[] iArr2 = this.f115678b;
                if (iArr2[i15] != iArr2[i15 - 1]) {
                    dArr[i14] = ((double) this.f115678b[i15]) * 0.01d;
                    dArr2[i14][0] = this.f115679c[i15];
                    i14++;
                }
            } else {
                dArr[i14] = ((double) this.f115678b[i15]) * 0.01d;
                dArr2[i14][0] = this.f115679c[i15];
                i14++;
            }
        }
        this.f115677a = n0.b.a(i10, dArr, dArr2);
    }

    public String toString() {
        String str = this.f115681e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f115680d; i10++) {
            str = str + C4235d4.j.f61460d + this.f115678b[i10] + " , " + decimalFormat.format(this.f115679c[i10]) + "] ";
        }
        return str;
    }
}

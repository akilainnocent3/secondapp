package n0;

import com.ironsource.C4235d4;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f115728k = "SplineSet";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f115729l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f115730m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f115731n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static float f115732o = 6.2831855f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n0.b f115733a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f115737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f115738f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f115741i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f115734b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f115735c = new int[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[][] f115736d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f115739g = new float[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f115740h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f115742j = Float.NaN;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f115743p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public i.a f115744q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public i.c f115745r = new i.c();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float[] f115746s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float[] f115747t;

        public a(String str, i.a aVar) {
            this.f115743p = str.split(",")[1];
            this.f115744q = aVar;
        }

        @Override // n0.t
        public void c(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // n0.t
        public void f(int i10) {
            int iF = this.f115744q.f();
            int iH = this.f115744q.g(0).h();
            double[] dArr = new double[iF];
            int i11 = iH + 2;
            this.f115746s = new float[i11];
            this.f115747t = new float[iH];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iF, i11);
            for (int i12 = 0; i12 < iF; i12++) {
                int iD = this.f115744q.d(i12);
                k0.a aVarG = this.f115744q.g(i12);
                float[] fArrG = this.f115745r.g(i12);
                dArr[i12] = ((double) iD) * 0.01d;
                aVarG.e(this.f115746s);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f115746s;
                    if (i13 < fArr.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iH] = fArrG[0];
                dArr3[iH + 1] = fArrG[1];
            }
            this.f115733a = n0.b.a(i10, dArr, dArr2);
        }

        public void g(int i10, k0.a aVar, float f10, int i11, float f11) {
            this.f115744q.a(i10, aVar);
            this.f115745r.a(i10, new float[]{f10, f11});
            this.f115734b = Math.max(this.f115734b, i11);
        }

        public boolean h(k0.f fVar, float f10, long j10, g gVar) {
            this.f115733a.e(f10, this.f115746s);
            float[] fArr = this.f115746s;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f115741i;
            if (Float.isNaN(this.f115742j)) {
                float fA = gVar.a(fVar, this.f115743p, 0);
                this.f115742j = fA;
                if (Float.isNaN(fA)) {
                    this.f115742j = 0.0f;
                }
            }
            float f13 = (float) ((((double) this.f115742j) + ((j11 * 1.0E-9d) * ((double) f11))) % 1.0d);
            this.f115742j = f13;
            this.f115741i = j10;
            float fA2 = a(f13);
            this.f115740h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f115747t;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f115740h;
                float f14 = this.f115746s[i10];
                this.f115740h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * fA2) + f12;
                i10++;
            }
            fVar.M(this.f115744q.g(0), this.f115747t);
            if (f11 != 0.0f) {
                this.f115740h = true;
            }
            return this.f115740h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f115748p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public i.b f115749q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public i.c f115750r = new i.c();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float[] f115751s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float[] f115752t;

        public b(String str, i.b bVar) {
            this.f115748p = str.split(",")[1];
            this.f115749q = bVar;
        }

        @Override // n0.t
        public void c(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // n0.t
        public void f(int i10) {
            int iF = this.f115749q.f();
            int iR = this.f115749q.g(0).r();
            double[] dArr = new double[iF];
            int i11 = iR + 2;
            this.f115751s = new float[i11];
            this.f115752t = new float[iR];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iF, i11);
            for (int i12 = 0; i12 < iF; i12++) {
                int iD = this.f115749q.d(i12);
                k0.b bVarG = this.f115749q.g(i12);
                float[] fArrG = this.f115750r.g(i12);
                dArr[i12] = ((double) iD) * 0.01d;
                bVarG.o(this.f115751s);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f115751s;
                    if (i13 < fArr.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iR] = fArrG[0];
                dArr3[iR + 1] = fArrG[1];
            }
            this.f115733a = n0.b.a(i10, dArr, dArr2);
        }

        public void g(int i10, k0.b bVar, float f10, int i11, float f11) {
            this.f115749q.a(i10, bVar);
            this.f115750r.a(i10, new float[]{f10, f11});
            this.f115734b = Math.max(this.f115734b, i11);
        }

        public boolean h(k0.f fVar, float f10, long j10, g gVar) {
            this.f115733a.e(f10, this.f115751s);
            float[] fArr = this.f115751s;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f115741i;
            if (Float.isNaN(this.f115742j)) {
                float fA = gVar.a(fVar, this.f115748p, 0);
                this.f115742j = fA;
                if (Float.isNaN(fA)) {
                    this.f115742j = 0.0f;
                }
            }
            float f13 = (float) ((((double) this.f115742j) + ((j11 * 1.0E-9d) * ((double) f11))) % 1.0d);
            this.f115742j = f13;
            this.f115741i = j10;
            float fA2 = a(f13);
            this.f115740h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f115752t;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f115740h;
                float f14 = this.f115751s[i10];
                this.f115740h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * fA2) + f12;
                i10++;
            }
            this.f115749q.g(0).w(fVar, this.f115752t);
            if (f11 != 0.0f) {
                this.f115740h = true;
            }
            return this.f115740h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {
        public static void a(int[] iArr, float[][] fArr, int i10, int i11) {
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

        public static int b(int[] iArr, float[][] fArr, int i10, int i11) {
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

        public static void c(int[] iArr, float[][] fArr, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float[] fArr2 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = fArr2;
        }
    }

    public float a(float f10) {
        float fAbs;
        switch (this.f115734b) {
            case 1:
                return Math.signum(f10 * f115732o);
            case 2:
                fAbs = Math.abs(f10);
                break;
            case 3:
                return (((f10 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f10 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f10 * f115732o);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f10 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f10 * f115732o);
        }
        return 1.0f - fAbs;
    }

    public n0.b b() {
        return this.f115733a;
    }

    public void c(int i10, float f10, float f11, int i11, float f12) {
        int[] iArr = this.f115735c;
        int i12 = this.f115737e;
        iArr[i12] = i10;
        float[] fArr = this.f115736d[i12];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        this.f115734b = Math.max(this.f115734b, i11);
        this.f115737e++;
    }

    public void d(long j10) {
        this.f115741i = j10;
    }

    public void e(String str) {
        this.f115738f = str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    public void f(int i10) {
        int i11 = this.f115737e;
        if (i11 == 0) {
            System.err.println("Error no points added to " + this.f115738f);
            return;
        }
        c.a(this.f115735c, this.f115736d, 0, i11 - 1);
        int i12 = 1;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f115735c;
            if (i12 >= iArr.length) {
                break;
            }
            if (iArr[i12] != iArr[i12 - 1]) {
                i13++;
            }
            i12++;
        }
        if (i13 == 0) {
            i13 = 1;
        }
        double[] dArr = new double[i13];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i13, 3);
        int i14 = 0;
        for (int i15 = 0; i15 < this.f115737e; i15++) {
            if (i15 > 0) {
                int[] iArr2 = this.f115735c;
                if (iArr2[i15] != iArr2[i15 - 1]) {
                    dArr[i14] = ((double) this.f115735c[i15]) * 0.01d;
                    double[] dArr3 = dArr2[i14];
                    float[] fArr = this.f115736d[i15];
                    dArr3[0] = fArr[0];
                    dArr3[1] = fArr[1];
                    dArr3[2] = fArr[2];
                    i14++;
                }
            } else {
                dArr[i14] = ((double) this.f115735c[i15]) * 0.01d;
                double[] dArr4 = dArr2[i14];
                float[] fArr2 = this.f115736d[i15];
                dArr4[0] = fArr2[0];
                dArr4[1] = fArr2[1];
                dArr4[2] = fArr2[2];
                i14++;
            }
        }
        this.f115733a = n0.b.a(i10, dArr, dArr2);
    }

    public String toString() {
        String str = this.f115738f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f115737e; i10++) {
            str = str + C4235d4.j.f61460d + this.f115735c[i10] + " , " + decimalFormat.format(this.f115736d[i10]) + "] ";
        }
        return str;
    }
}

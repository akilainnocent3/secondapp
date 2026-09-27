package n0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f115753m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f115754n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f115755o = 10;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f115756p = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f115757a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f115758b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f115759c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f115760d = new int[10];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f115761e = new float[10];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f115762f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f115763g = new int[5];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f115764h = new String[5];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f115765i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f115766j = new int[4];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f115767k = new boolean[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f115768l = 0;

    public void a(int i10, float f10) {
        int i11 = this.f115762f;
        int[] iArr = this.f115760d;
        if (i11 >= iArr.length) {
            this.f115760d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f115761e;
            this.f115761e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f115760d;
        int i12 = this.f115762f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f115761e;
        this.f115762f = i12 + 1;
        fArr2[i12] = f10;
    }

    public void b(int i10, int i11) {
        int i12 = this.f115759c;
        int[] iArr = this.f115757a;
        if (i12 >= iArr.length) {
            this.f115757a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f115758b;
            this.f115758b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f115757a;
        int i13 = this.f115759c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f115758b;
        this.f115759c = i13 + 1;
        iArr4[i13] = i11;
    }

    public void c(int i10, String str) {
        int i11 = this.f115765i;
        int[] iArr = this.f115763g;
        if (i11 >= iArr.length) {
            this.f115763g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f115764h;
            this.f115764h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f115763g;
        int i12 = this.f115765i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f115764h;
        this.f115765i = i12 + 1;
        strArr2[i12] = str;
    }

    public void d(int i10, boolean z10) {
        int i11 = this.f115768l;
        int[] iArr = this.f115766j;
        if (i11 >= iArr.length) {
            this.f115766j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f115767k;
            this.f115767k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f115766j;
        int i12 = this.f115768l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f115767k;
        this.f115768l = i12 + 1;
        zArr2[i12] = z10;
    }

    public void e(int i10, String str) {
        if (str != null) {
            c(i10, str);
        }
    }

    public void f(u uVar) {
        for (int i10 = 0; i10 < this.f115759c; i10++) {
            uVar.b(this.f115757a[i10], this.f115758b[i10]);
        }
        for (int i11 = 0; i11 < this.f115762f; i11++) {
            uVar.a(this.f115760d[i11], this.f115761e[i11]);
        }
        for (int i12 = 0; i12 < this.f115765i; i12++) {
            uVar.c(this.f115763g[i12], this.f115764h[i12]);
        }
        for (int i13 = 0; i13 < this.f115768l; i13++) {
            uVar.d(this.f115766j[i13], this.f115767k[i13]);
        }
    }

    public void g(w wVar) {
        for (int i10 = 0; i10 < this.f115759c; i10++) {
            wVar.a(this.f115757a[i10], this.f115758b[i10]);
        }
        for (int i11 = 0; i11 < this.f115762f; i11++) {
            wVar.b(this.f115760d[i11], this.f115761e[i11]);
        }
        for (int i12 = 0; i12 < this.f115765i; i12++) {
            wVar.d(this.f115763g[i12], this.f115764h[i12]);
        }
        for (int i13 = 0; i13 < this.f115768l; i13++) {
            wVar.c(this.f115766j[i13], this.f115767k[i13]);
        }
    }

    public void h() {
        this.f115768l = 0;
        this.f115765i = 0;
        this.f115762f = 0;
        this.f115759c = 0;
    }

    public int i(int i10) {
        for (int i11 = 0; i11 < this.f115759c; i11++) {
            if (this.f115757a[i11] == i10) {
                return this.f115758b[i11];
            }
        }
        return -1;
    }

    public String toString() {
        return "TypedBundle{mCountInt=" + this.f115759c + ", mCountFloat=" + this.f115762f + ", mCountString=" + this.f115765i + ", mCountBoolean=" + this.f115768l + fw.b.f85383j;
    }
}

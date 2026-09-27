package r0;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f123396l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f123397m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f123398n = 50;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f123399o = 50;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f123400p = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f123401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f123402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f123403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f123404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f123405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f123406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f123407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f123408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f123409i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean[][] f123410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[][] f123411k;

    public c() {
    }

    public final void a() {
        for (int i10 = 0; i10 < this.f123403c; i10++) {
            if (m(i10) == -1) {
                int iF = f();
                int iG = g(iF);
                int iE = e(iF);
                if (iF == -1) {
                    return;
                } else {
                    b(i10, iG, iE, 1, 1);
                }
            }
        }
    }

    public final void b(int i10, int i11, int i12, int i13, int i14) {
        int[] iArr = this.f123411k[i10];
        iArr[0] = i12;
        iArr[1] = i11;
        iArr[2] = (i12 + i14) - 1;
        iArr[3] = (i11 + i13) - 1;
    }

    public int c(int i10) {
        int[][] iArr = this.f123411k;
        if (iArr == null || i10 >= iArr.length) {
            return 0;
        }
        return iArr[i10][3];
    }

    public final void d(boolean z10) {
        int[][] iArrN;
        int[][] iArrN2;
        if (z10) {
            for (int i10 = 0; i10 < this.f123410j.length; i10++) {
                int i11 = 0;
                while (true) {
                    boolean[][] zArr = this.f123410j;
                    if (i11 < zArr[0].length) {
                        zArr[i10][i11] = true;
                        i11++;
                    }
                }
            }
            for (int i12 = 0; i12 < this.f123411k.length; i12++) {
                int i13 = 0;
                while (true) {
                    int[][] iArr = this.f123411k;
                    if (i13 < iArr[0].length) {
                        iArr[i12][i13] = -1;
                        i13++;
                    }
                }
            }
        }
        this.f123409i = 0;
        String str = this.f123407g;
        if (str != null && !str.trim().isEmpty() && (iArrN2 = n(this.f123407g)) != null) {
            h(iArrN2);
        }
        String str2 = this.f123406f;
        if (str2 != null && !str2.trim().isEmpty() && (iArrN = n(this.f123406f)) != null) {
            i(iArrN);
        }
        a();
    }

    public final int e(int i10) {
        return this.f123408h == 1 ? i10 / this.f123401a : i10 % this.f123404d;
    }

    public final int f() {
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            i10 = this.f123409i;
            if (i10 >= this.f123401a * this.f123404d) {
                return -1;
            }
            int iG = g(i10);
            int iE = e(this.f123409i);
            boolean[] zArr = this.f123410j[iG];
            if (zArr[iE]) {
                zArr[iE] = false;
                z10 = true;
            }
            this.f123409i++;
        }
        return i10;
    }

    public final int g(int i10) {
        return this.f123408h == 1 ? i10 % this.f123401a : i10 / this.f123404d;
    }

    public final void h(int[][] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iG = g(iArr[i10][0]);
            int iE = e(iArr[i10][0]);
            int[] iArr2 = iArr[i10];
            if (!k(iG, iE, iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void i(int[][] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iG = g(iArr[i10][0]);
            int iE = e(iArr[i10][0]);
            int[] iArr2 = iArr[i10];
            if (!k(iG, iE, iArr2[1], iArr2[2])) {
                return;
            }
            int[] iArr3 = iArr[i10];
            b(i10, iG, iE, iArr3[1], iArr3[2]);
        }
    }

    public final void j() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f123401a, this.f123404d);
        this.f123410j = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i10 = this.f123403c;
        if (i10 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, 4);
            this.f123411k = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean k(int i10, int i11, int i12, int i13) {
        for (int i14 = i10; i14 < i10 + i12; i14++) {
            for (int i15 = i11; i15 < i11 + i13; i15++) {
                boolean[][] zArr = this.f123410j;
                if (i14 < zArr.length && i15 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i14];
                    if (zArr2[i15]) {
                        zArr2[i15] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean l(CharSequence charSequence) {
        return charSequence != null;
    }

    public int m(int i10) {
        int[][] iArr = this.f123411k;
        if (iArr == null || i10 >= iArr.length) {
            return 0;
        }
        return iArr[i10][0];
    }

    public final int[][] n(String str) {
        if (!l(str)) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].trim().split(":");
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i10][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i10][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i10][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    public int o(int i10) {
        int[][] iArr = this.f123411k;
        if (iArr == null || i10 >= iArr.length) {
            return 0;
        }
        return iArr[i10][2];
    }

    public void p(int i10) {
        if (i10 <= 50 && this.f123405e != i10) {
            this.f123405e = i10;
            x();
        }
    }

    public void q(int i10) {
        if (i10 > this.f123401a * this.f123404d) {
            return;
        }
        this.f123403c = i10;
    }

    public void r(int i10) {
        if ((i10 == 0 || i10 == 1) && this.f123408h != i10) {
            this.f123408h = i10;
        }
    }

    public void s(int i10) {
        if (i10 <= 50 && this.f123402b != i10) {
            this.f123402b = i10;
            x();
        }
    }

    public void t(String str) {
        String str2 = this.f123407g;
        if (str2 == null || !str2.equals(str)) {
            this.f123407g = str;
        }
    }

    public void u(CharSequence charSequence) {
        String str = this.f123406f;
        if (str == null || !str.equals(charSequence.toString())) {
            this.f123406f = charSequence.toString();
        }
    }

    public void v() {
        boolean[][] zArr;
        int[][] iArr = this.f123411k;
        boolean z10 = false;
        if (iArr != null && iArr.length == this.f123403c && (zArr = this.f123410j) != null && zArr.length == this.f123401a && zArr[0].length == this.f123404d) {
            z10 = true;
        }
        if (!z10) {
            j();
        }
        d(z10);
    }

    public int w(int i10) {
        int[][] iArr = this.f123411k;
        if (iArr == null || i10 >= iArr.length) {
            return 0;
        }
        return iArr[i10][1];
    }

    public final void x() {
        int i10;
        int i11 = this.f123402b;
        if (i11 != 0 && (i10 = this.f123405e) != 0) {
            this.f123401a = i11;
            this.f123404d = i10;
            return;
        }
        int i12 = this.f123405e;
        if (i12 > 0) {
            this.f123404d = i12;
            this.f123401a = ((this.f123403c + i12) - 1) / i12;
        } else if (i11 > 0) {
            this.f123401a = i11;
            this.f123404d = ((this.f123403c + i11) - 1) / i11;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f123403c) + 1.5d);
            this.f123401a = iSqrt;
            this.f123404d = ((this.f123403c + iSqrt) - 1) / iSqrt;
        }
    }

    public c(int i10, int i11) {
        this.f123402b = i10;
        this.f123405e = i11;
        if (i10 > 50) {
            this.f123402b = 3;
        }
        if (i11 > 50) {
            this.f123405e = 3;
        }
        x();
        j();
    }

    public c(int i10, int i11, int i12) {
        this.f123402b = i10;
        this.f123405e = i11;
        this.f123403c = i12;
        if (i10 > 50) {
            this.f123402b = 3;
        }
        if (i11 > 50) {
            this.f123405e = 3;
        }
        x();
        int i13 = this.f123401a;
        int i14 = this.f123404d;
        if (i12 > i13 * i14 || i12 < 1) {
            this.f123403c = i13 * i14;
        }
        j();
        d(false);
    }
}

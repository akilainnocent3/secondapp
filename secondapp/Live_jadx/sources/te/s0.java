package te;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class s0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f136819w = 65;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f136820x = 400;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f136821y = 4000;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f136822z = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f136825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f136826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f136827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f136828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f136829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f136830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f136831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f136832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f136833k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f136834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f136835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f136836n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f136837o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f136838p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f136839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f136840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f136841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f136842t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f136843u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f136844v;

    public s0(int i10, int i11, float f10, float f11, int i12) {
        this.f136823a = i10;
        this.f136824b = i11;
        this.f136825c = f10;
        this.f136826d = f11;
        this.f136827e = i10 / i12;
        this.f136828f = i10 / 400;
        int i13 = i10 / 65;
        this.f136829g = i13;
        int i14 = i13 * 2;
        this.f136830h = i14;
        this.f136831i = new short[i14];
        this.f136832j = new short[i14 * i11];
        this.f136834l = new short[i14 * i11];
        this.f136836n = new short[i14 * i11];
    }

    public static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f136835m == i10) {
            return;
        }
        int i13 = this.f136823a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        o(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f136837o;
            if (i15 >= i16 - 1) {
                u(i16 - 1);
                return;
            }
            while (true) {
                i11 = this.f136838p;
                int i17 = (i11 + 1) * i14;
                i12 = this.f136839q;
                if (i17 <= i12 * i13) {
                    break;
                }
                this.f136834l = f(this.f136834l, this.f136835m, 1);
                int i18 = 0;
                while (true) {
                    int i19 = this.f136824b;
                    if (i18 < i19) {
                        this.f136834l[(this.f136835m * i19) + i18] = n(this.f136836n, (i19 * i15) + i18, i13, i14);
                        i18++;
                    }
                }
                this.f136839q++;
                this.f136835m++;
            }
            int i20 = i11 + 1;
            this.f136838p = i20;
            if (i20 == i13) {
                this.f136838p = 0;
                eh.a.i(i12 == i14);
                this.f136839q = 0;
            }
            i15++;
        }
    }

    public final void b(float f10) {
        int iW;
        int i10 = this.f136833k;
        if (i10 < this.f136830h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f136840r > 0) {
                iW = c(i11);
            } else {
                int iG = g(this.f136832j, i11);
                iW = ((double) f10) > 1.0d ? iG + w(this.f136832j, i11, f10, iG) : m(this.f136832j, i11, f10, iG);
            }
            i11 += iW;
        } while (this.f136830h + i11 <= i10);
        v(i11);
    }

    public final int c(int i10) {
        int iMin = Math.min(this.f136830h, this.f136840r);
        d(this.f136832j, i10, iMin);
        this.f136840r -= iMin;
        return iMin;
    }

    public final void d(short[] sArr, int i10, int i11) {
        short[] sArrF = f(this.f136834l, this.f136835m, i11);
        this.f136834l = sArrF;
        int i12 = this.f136824b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f136835m * i12, i12 * i11);
        this.f136835m += i11;
    }

    public final void e(short[] sArr, int i10, int i11) {
        int i12 = this.f136830h / i11;
        int i13 = this.f136824b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f136831i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f136824b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int g(short[] sArr, int i10) {
        int iH;
        int i11 = this.f136823a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.f136824b == 1 && i12 == 1) {
            iH = h(sArr, i10, this.f136828f, this.f136829g);
        } else {
            e(sArr, i10, i12);
            int iH2 = h(this.f136831i, 0, this.f136828f / i12, this.f136829g / i12);
            if (i12 != 1) {
                int i13 = iH2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f136828f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f136829g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f136824b == 1) {
                    iH = h(sArr, i10, i15, i16);
                } else {
                    e(sArr, i10, 1);
                    iH = h(this.f136831i, 0, i15, i16);
                }
            } else {
                iH = iH2;
            }
        }
        int i19 = q(this.f136843u, this.f136844v) ? this.f136841s : iH;
        this.f136842t = this.f136843u;
        this.f136841s = iH;
        return i19;
    }

    public final int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f136824b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f136843u = i15 / i16;
        this.f136844v = i17 / i14;
        return i16;
    }

    public void i() {
        this.f136833k = 0;
        this.f136835m = 0;
        this.f136837o = 0;
        this.f136838p = 0;
        this.f136839q = 0;
        this.f136840r = 0;
        this.f136841s = 0;
        this.f136842t = 0;
        this.f136843u = 0;
        this.f136844v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f136824b, this.f136835m);
        shortBuffer.put(this.f136834l, 0, this.f136824b * iMin);
        int i10 = this.f136835m - iMin;
        this.f136835m = i10;
        short[] sArr = this.f136834l;
        int i11 = this.f136824b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f136835m * this.f136824b * 2;
    }

    public int l() {
        return this.f136833k * this.f136824b * 2;
    }

    public final int m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f136840r = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrF = f(this.f136834l, this.f136835m, i13);
        this.f136834l = sArrF;
        int i14 = this.f136824b;
        System.arraycopy(sArr, i10 * i14, sArrF, this.f136835m * i14, i14 * i11);
        p(i12, this.f136824b, this.f136834l, this.f136835m + i11, sArr, i10 + i11, sArr, i10);
        this.f136835m += i13;
        return i12;
    }

    public final short n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f136824b];
        int i13 = this.f136839q * i11;
        int i14 = this.f136838p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    public final void o(int i10) {
        int i11 = this.f136835m - i10;
        short[] sArrF = f(this.f136836n, this.f136837o, i11);
        this.f136836n = sArrF;
        short[] sArr = this.f136834l;
        int i12 = this.f136824b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f136837o * i12, i12 * i11);
        this.f136835m = i10;
        this.f136837o += i11;
    }

    public final boolean q(int i10, int i11) {
        return i10 != 0 && this.f136841s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f136842t * 3;
    }

    public final void r() {
        int i10 = this.f136835m;
        float f10 = this.f136825c;
        float f11 = this.f136826d;
        float f12 = f10 / f11;
        float f13 = this.f136827e * f11;
        double d10 = f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(f12);
        } else {
            d(this.f136832j, 0, this.f136833k);
            this.f136833k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    public void s() {
        int i10;
        int i11 = this.f136833k;
        float f10 = this.f136825c;
        float f11 = this.f136826d;
        int i12 = this.f136835m + ((int) ((((i11 / (f10 / f11)) + this.f136837o) / (this.f136827e * f11)) + 0.5f));
        this.f136832j = f(this.f136832j, i11, (this.f136830h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f136830h;
            int i14 = this.f136824b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f136832j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f136833k += i10 * 2;
        r();
        if (this.f136835m > i12) {
            this.f136835m = i12;
        }
        this.f136833k = 0;
        this.f136840r = 0;
        this.f136837o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f136824b;
        int i11 = iRemaining / i10;
        short[] sArrF = f(this.f136832j, this.f136833k, i11);
        this.f136832j = sArrF;
        shortBuffer.get(sArrF, this.f136833k * this.f136824b, ((i10 * i11) * 2) / 2);
        this.f136833k += i11;
        r();
    }

    public final void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f136836n;
        int i11 = this.f136824b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f136837o - i10) * i11);
        this.f136837o -= i10;
    }

    public final void v(int i10) {
        int i11 = this.f136833k - i10;
        short[] sArr = this.f136832j;
        int i12 = this.f136824b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f136833k = i11;
    }

    public final int w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f136840r = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] sArrF = f(this.f136834l, this.f136835m, i12);
        this.f136834l = sArrF;
        p(i12, this.f136824b, sArrF, this.f136835m, sArr, i10, sArr, i10 + i11);
        this.f136835m += i12;
        return i12;
    }
}

package defpackage;

import java.util.Arrays;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
public final class aw0 extends r5c {
    public final double[] a;
    public final a[] b;

    public static class a {
        public static final double[] s = new double[91];
        public double[] a;
        public double b;
        public double c;
        public double d;
        public double e;
        public double f;
        public double g;
        public double h;
        public double i;
        public double j;
        public double k;
        public double l;
        public double m;
        public double n;
        public double o;
        public double p;
        public boolean q;
        public boolean r;

        public final double a() {
            double d = this.j * this.p;
            double dHypot = this.n / Math.hypot(d, (-this.k) * this.o);
            return this.q ? (-d) * dHypot : d * dHypot;
        }

        public final double b() {
            double d = this.j * this.p;
            double d2 = (-this.k) * this.o;
            double dHypot = this.n / Math.hypot(d, d2);
            return this.q ? (-d2) * dHypot : d2 * dHypot;
        }

        public final double c(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.e;
            return ((this.f - d3) * d2) + d3;
        }

        public final double d(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.g;
            return ((this.h - d3) * d2) + d3;
        }

        public final double e() {
            return (this.j * this.o) + this.l;
        }

        public final double f() {
            return (this.k * this.p) + this.m;
        }

        public final void g(double d) {
            double d2 = (this.q ? this.d - d : d - this.c) * this.i;
            double d3 = 0.0d;
            if (d2 > 0.0d) {
                d3 = 1.0d;
                if (d2 < 1.0d) {
                    double[] dArr = this.a;
                    double length = d2 * ((double) (dArr.length - 1));
                    int i = (int) length;
                    double d4 = dArr[i];
                    d3 = ((dArr[i + 1] - d4) * (length - ((double) i))) + d4;
                }
            }
            double d5 = d3 * 1.5707963267948966d;
            this.o = Math.sin(d5);
            this.p = Math.cos(d5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [aw0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [aw0] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r21v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public aw0(int[] iArr, double[] dArr, double[][] dArr2) {
        ?? r6;
        ?? r5;
        double d;
        boolean z;
        double[] dArr3;
        boolean z2;
        ?? r7;
        double[] dArr4 = dArr;
        ?? obj = new Object();
        obj.a = dArr4;
        boolean z3 = true;
        obj.b = new a[dArr4.length - 1];
        char c = 0;
        int i = 0;
        boolean z4 = true;
        ?? r8 = 1;
        ?? r0 = obj;
        while (true) {
            a[] aVarArr = r0.b;
            if (i >= aVarArr.length) {
                return;
            }
            int i2 = iArr[i];
            if (i2 == 0) {
                r6 = 3;
                r5 = z4;
            } else if (i2 == z3) {
                r7 = z3;
                r6 = r7;
                r5 = r7;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (z4 != z3) {
                            r7 = z3;
                        }
                        r6 = r7;
                        r5 = r7;
                    } else if (i2 == 4) {
                        r6 = 4;
                        r5 = z4;
                    } else if (i2 == 5) {
                        r6 = 5;
                        r5 = z4;
                    }
                }
                r5 = z4;
                r6 = r8;
                r7 = 2;
                r6 = r7;
                r5 = r7;
            }
            double d2 = dArr4[i];
            int i3 = i + 1;
            double d3 = dArr4[i3];
            double[] dArr5 = dArr2[i];
            double d4 = dArr5[c];
            boolean z5 = z3;
            int i4 = i;
            double d5 = dArr5[z5 ? 1 : 0];
            double[] dArr6 = dArr2[i3];
            ?? r21 = c;
            double d6 = dArr6[r21 == true ? 1 : 0];
            double d7 = dArr6[z5 ? 1 : 0];
            a aVar = new a();
            aVar.r = r21;
            ?? r13 = r5;
            double d8 = d6 - d4;
            double d9 = d7 - d5;
            boolean z6 = z5 ? 1 : 0;
            if (r6 != z6) {
                if (r6 == 4) {
                    z2 = d9 > 0.0d;
                    aVar.q = z2;
                } else if (r6 != 5) {
                    z2 = false;
                    aVar.q = false;
                } else {
                    z2 = d9 < 0.0d;
                    aVar.q = z2;
                }
                d = d2;
                z = z2;
                z6 = true;
            } else {
                aVar.q = z6;
                d = d2;
                z = z6 ? 1 : 0;
            }
            aVar.c = d;
            aVar.d = d3;
            double d10 = d3 - d;
            double d11 = 1.0d / d10;
            aVar.i = d11;
            if (3 == r6) {
                aVar.r = z6;
            } else {
                if (Math.abs(d8) < 0.001d || Math.abs(d9) < 0.001d) {
                    z6 = true;
                } else {
                    double[] dArr7 = new double[HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS];
                    aVar.a = dArr7;
                    aVar.j = ((double) (z ? -1 : 1)) * d8;
                    aVar.k = d9 * ((double) (z ? 1 : -1));
                    aVar.l = z ? d6 : d4;
                    aVar.m = z ? d5 : d7;
                    double d12 = d5 - d7;
                    double dHypot = 0.0d;
                    double d13 = 0.0d;
                    double d14 = 0.0d;
                    int i5 = 0;
                    while (true) {
                        dArr3 = a.s;
                        if (i5 >= 91) {
                            break;
                        }
                        double[] dArr8 = dArr7;
                        double radians = Math.toRadians((((double) i5) * 90.0d) / 90.0d);
                        double dSin = Math.sin(radians) * d8;
                        double dCos = Math.cos(radians) * d12;
                        if (i5 > 0) {
                            dHypot += Math.hypot(dSin - d13, dCos - d14);
                            dArr3[i5] = dHypot;
                        }
                        i5++;
                        d14 = dCos;
                        d13 = dSin;
                        dArr7 = dArr8;
                    }
                    double[] dArr9 = dArr7;
                    aVar.b = dHypot;
                    for (int i6 = 0; i6 < 91; i6++) {
                        dArr3[i6] = dArr3[i6] / dHypot;
                    }
                    for (int i7 = 0; i7 < 101; i7++) {
                        double d15 = ((double) i7) / 100.0d;
                        int iBinarySearch = Arrays.binarySearch(dArr3, d15);
                        if (iBinarySearch >= 0) {
                            dArr9[i7] = ((double) iBinarySearch) / 90.0d;
                        } else if (iBinarySearch == -1) {
                            dArr9[i7] = 0.0d;
                        } else {
                            int i8 = -iBinarySearch;
                            int i9 = i8 - 2;
                            double d16 = dArr3[i9];
                            dArr9[i7] = (((d15 - d16) / (dArr3[i8 - 1] - d16)) + ((double) i9)) / 90.0d;
                        }
                    }
                    aVar.n = aVar.b * aVar.i;
                    z6 = true;
                }
                aVarArr[i4] = aVar;
                r0 = this;
                dArr4 = dArr;
                z3 = z6;
                i = i3;
                z4 = r13 == true ? 1 : 0;
                c = 0;
                r8 = r6;
            }
            aVar.r = z6;
            aVar.e = d4;
            aVar.f = d6;
            aVar.g = d5;
            aVar.h = d7;
            double dHypot2 = Math.hypot(d9, d8);
            aVar.b = dHypot2;
            aVar.n = dHypot2 * d11;
            aVar.l = d8 / d10;
            aVar.m = d9 / d10;
            aVarArr[i4] = aVar;
            r0 = this;
            dArr4 = dArr;
            z3 = z6;
            i = i3;
            z4 = r13 == true ? 1 : 0;
            c = 0;
            r8 = r6;
        }
    }

    @Override // defpackage.r5c
    public final double b(double d) {
        a[] aVarArr = this.b;
        a aVar = aVarArr[0];
        double d2 = aVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (aVar.r) {
                return (d3 * aVarArr[0].l) + aVar.c(d2);
            }
            aVar.g(d2);
            return (aVarArr[0].a() * d3) + aVarArr[0].e();
        }
        if (d > aVarArr[aVarArr.length - 1].d) {
            double d4 = aVarArr[aVarArr.length - 1].d;
            double d5 = d - d4;
            int length = aVarArr.length - 1;
            return (d5 * aVarArr[length].l) + aVarArr[length].c(d4);
        }
        for (int i = 0; i < aVarArr.length; i++) {
            a aVar2 = aVarArr[i];
            if (d <= aVar2.d) {
                if (aVar2.r) {
                    return aVar2.c(d);
                }
                aVar2.g(d);
                return aVarArr[i].e();
            }
        }
        return Double.NaN;
    }

    @Override // defpackage.r5c
    public final void c(double d, double[] dArr) {
        a[] aVarArr = this.b;
        a aVar = aVarArr[0];
        double d2 = aVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (aVar.r) {
                double dC = aVar.c(d2);
                a aVar2 = aVarArr[0];
                dArr[0] = (aVar2.l * d3) + dC;
                dArr[1] = (d3 * aVarArr[0].m) + aVar2.d(d2);
                return;
            }
            aVar.g(d2);
            dArr[0] = (aVarArr[0].a() * d3) + aVarArr[0].e();
            dArr[1] = (aVarArr[0].b() * d3) + aVarArr[0].f();
            return;
        }
        if (d <= aVarArr[aVarArr.length - 1].d) {
            for (int i = 0; i < aVarArr.length; i++) {
                a aVar3 = aVarArr[i];
                if (d <= aVar3.d) {
                    if (aVar3.r) {
                        dArr[0] = aVar3.c(d);
                        dArr[1] = aVarArr[i].d(d);
                        return;
                    } else {
                        aVar3.g(d);
                        dArr[0] = aVarArr[i].e();
                        dArr[1] = aVarArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = aVarArr[aVarArr.length - 1].d;
        double d5 = d - d4;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (aVar4.r) {
            double dC2 = aVar4.c(d4);
            a aVar5 = aVarArr[length];
            dArr[0] = (aVar5.l * d5) + dC2;
            dArr[1] = (d5 * aVarArr[length].m) + aVar5.d(d4);
            return;
        }
        aVar4.g(d);
        dArr[0] = (aVarArr[length].a() * d5) + aVarArr[length].e();
        dArr[1] = (aVarArr[length].b() * d5) + aVarArr[length].f();
    }

    @Override // defpackage.r5c
    public final void d(double d, float[] fArr) {
        a[] aVarArr = this.b;
        a aVar = aVarArr[0];
        double d2 = aVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (aVar.r) {
                double dC = aVar.c(d2);
                a aVar2 = aVarArr[0];
                fArr[0] = (float) ((aVar2.l * d3) + dC);
                fArr[1] = (float) ((d3 * aVarArr[0].m) + aVar2.d(d2));
                return;
            }
            aVar.g(d2);
            fArr[0] = (float) ((aVarArr[0].a() * d3) + aVarArr[0].e());
            fArr[1] = (float) ((aVarArr[0].b() * d3) + aVarArr[0].f());
            return;
        }
        if (d <= aVarArr[aVarArr.length - 1].d) {
            for (int i = 0; i < aVarArr.length; i++) {
                a aVar3 = aVarArr[i];
                if (d <= aVar3.d) {
                    if (aVar3.r) {
                        fArr[0] = (float) aVar3.c(d);
                        fArr[1] = (float) aVarArr[i].d(d);
                        return;
                    } else {
                        aVar3.g(d);
                        fArr[0] = (float) aVarArr[i].e();
                        fArr[1] = (float) aVarArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = aVarArr[aVarArr.length - 1].d;
        double d5 = d - d4;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (!aVar4.r) {
            aVar4.g(d);
            fArr[0] = (float) aVarArr[length].e();
            fArr[1] = (float) aVarArr[length].f();
        } else {
            double dC2 = aVar4.c(d4);
            a aVar5 = aVarArr[length];
            fArr[0] = (float) ((aVar5.l * d5) + dC2);
            fArr[1] = (float) ((d5 * aVarArr[length].m) + aVar5.d(d4));
        }
    }

    @Override // defpackage.r5c
    public final double e(double d) {
        a[] aVarArr = this.b;
        double d2 = aVarArr[0].c;
        if (d < d2) {
            d = d2;
        }
        if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        for (int i = 0; i < aVarArr.length; i++) {
            a aVar = aVarArr[i];
            if (d <= aVar.d) {
                if (aVar.r) {
                    return aVar.l;
                }
                aVar.g(d);
                return aVarArr[i].a();
            }
        }
        return Double.NaN;
    }

    @Override // defpackage.r5c
    public final void f(double d, double[] dArr) {
        a[] aVarArr = this.b;
        double d2 = aVarArr[0].c;
        if (d < d2) {
            d = d2;
        } else if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        for (int i = 0; i < aVarArr.length; i++) {
            a aVar = aVarArr[i];
            if (d <= aVar.d) {
                if (aVar.r) {
                    dArr[0] = aVar.l;
                    dArr[1] = aVar.m;
                    return;
                } else {
                    aVar.g(d);
                    dArr[0] = aVarArr[i].a();
                    dArr[1] = aVarArr[i].b();
                    return;
                }
            }
        }
    }

    @Override // defpackage.r5c
    public final double[] g() {
        return this.a;
    }
}

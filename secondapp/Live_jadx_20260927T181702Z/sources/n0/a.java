package n0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f115502g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f115503h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f115504i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f115505j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f115506k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f115507l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f115508m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f115509n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f115510o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f115511p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f115512q = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f115513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1058a[] f115514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f115515f = true;

    /* JADX INFO: renamed from: n0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C1058a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f115516s = "Arc";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static double[] f115517t = new double[91];

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final double f115518u = 0.001d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double[] f115519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f115520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f115521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f115522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f115523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f115524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double f115525g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f115526h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public double f115527i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double f115528j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public double f115529k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public double f115530l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public double f115531m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public double f115532n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public double f115533o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public double f115534p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f115535q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f115536r;

        public C1058a(int i10, double d10, double d11, double d12, double d13, double d14, double d15) {
            this.f115536r = false;
            double d16 = d14 - d12;
            double d17 = d15 - d13;
            if (i10 == 1) {
                this.f115535q = true;
            } else if (i10 == 4) {
                this.f115535q = d17 > 0.0d;
            } else if (i10 != 5) {
                this.f115535q = false;
            } else {
                this.f115535q = d17 < 0.0d;
            }
            this.f115521c = d10;
            this.f115522d = d11;
            this.f115527i = 1.0d / (d11 - d10);
            if (3 == i10) {
                this.f115536r = true;
            }
            if (!this.f115536r && Math.abs(d16) >= 0.001d && Math.abs(d17) >= 0.001d) {
                this.f115519a = new double[101];
                boolean z10 = this.f115535q;
                this.f115528j = d16 * ((double) (z10 ? -1 : 1));
                this.f115529k = d17 * ((double) (z10 ? 1 : -1));
                this.f115530l = z10 ? d14 : d12;
                this.f115531m = z10 ? d13 : d15;
                a(d12, d13, d14, d15);
                this.f115532n = this.f115520b * this.f115527i;
                return;
            }
            this.f115536r = true;
            this.f115523e = d12;
            this.f115524f = d14;
            this.f115525g = d13;
            this.f115526h = d15;
            double dHypot = Math.hypot(d17, d16);
            this.f115520b = dHypot;
            this.f115532n = dHypot * this.f115527i;
            double d18 = this.f115522d;
            double d19 = this.f115521c;
            this.f115530l = d16 / (d18 - d19);
            this.f115531m = d17 / (d18 - d19);
        }

        public final void a(double d10, double d11, double d12, double d13) {
            double d14 = d12 - d10;
            double d15 = d11 - d13;
            int i10 = 0;
            double dHypot = 0.0d;
            double d16 = 0.0d;
            double d17 = 0.0d;
            while (true) {
                double[] dArr = f115517t;
                if (i10 >= dArr.length) {
                    break;
                }
                int i11 = i10;
                double radians = Math.toRadians((((double) i10) * 90.0d) / ((double) (dArr.length - 1)));
                double dSin = Math.sin(radians) * d14;
                double dCos = Math.cos(radians) * d15;
                if (i11 > 0) {
                    dHypot += Math.hypot(dSin - d16, dCos - d17);
                    f115517t[i11] = dHypot;
                }
                i10 = i11 + 1;
                d16 = dSin;
                d17 = dCos;
            }
            this.f115520b = dHypot;
            int i12 = 0;
            while (true) {
                double[] dArr2 = f115517t;
                if (i12 >= dArr2.length) {
                    break;
                }
                dArr2[i12] = dArr2[i12] / dHypot;
                i12++;
            }
            int i13 = 0;
            while (true) {
                double[] dArr3 = this.f115519a;
                if (i13 >= dArr3.length) {
                    return;
                }
                double length = ((double) i13) / ((double) (dArr3.length - 1));
                int iBinarySearch = Arrays.binarySearch(f115517t, length);
                if (iBinarySearch >= 0) {
                    this.f115519a[i13] = ((double) iBinarySearch) / ((double) (f115517t.length - 1));
                } else if (iBinarySearch == -1) {
                    this.f115519a[i13] = 0.0d;
                } else {
                    int i14 = -iBinarySearch;
                    int i15 = i14 - 2;
                    double[] dArr4 = f115517t;
                    double d18 = dArr4[i15];
                    this.f115519a[i13] = (((double) i15) + ((length - d18) / (dArr4[i14 - 1] - d18))) / ((double) (dArr4.length - 1));
                }
                i13++;
            }
        }

        public double b() {
            double d10 = this.f115528j * this.f115534p;
            double dHypot = this.f115532n / Math.hypot(d10, (-this.f115529k) * this.f115533o);
            return this.f115535q ? (-d10) * dHypot : d10 * dHypot;
        }

        public double c() {
            double d10 = this.f115528j * this.f115534p;
            double d11 = (-this.f115529k) * this.f115533o;
            double dHypot = this.f115532n / Math.hypot(d10, d11);
            return this.f115535q ? (-d11) * dHypot : d11 * dHypot;
        }

        public double d(double d10) {
            return this.f115530l;
        }

        public double e(double d10) {
            return this.f115531m;
        }

        public double f(double d10) {
            double d11 = (d10 - this.f115521c) * this.f115527i;
            double d12 = this.f115523e;
            return d12 + (d11 * (this.f115524f - d12));
        }

        public double g(double d10) {
            double d11 = (d10 - this.f115521c) * this.f115527i;
            double d12 = this.f115525g;
            return d12 + (d11 * (this.f115526h - d12));
        }

        public double h() {
            return this.f115530l + (this.f115528j * this.f115533o);
        }

        public double i() {
            return this.f115531m + (this.f115529k * this.f115534p);
        }

        public double j(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f115519a;
            double length = d10 * ((double) (dArr.length - 1));
            int i10 = (int) length;
            double d11 = length - ((double) i10);
            double d12 = dArr[i10];
            return d12 + (d11 * (dArr[i10 + 1] - d12));
        }

        public void k(double d10) {
            double dJ = j((this.f115535q ? this.f115522d - d10 : d10 - this.f115521c) * this.f115527i) * 1.5707963267948966d;
            this.f115533o = Math.sin(dJ);
            this.f115534p = Math.cos(dJ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    public a(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f115513d = dArr;
        this.f115514e = new C1058a[dArr.length - 1];
        int i10 = 1;
        int i11 = 1;
        int i12 = 0;
        while (true) {
            C1058a[] c1058aArr = this.f115514e;
            if (i12 >= c1058aArr.length) {
                return;
            }
            int i13 = iArr[i12];
            int i14 = 3;
            if (i13 != 0) {
                if (i13 == 1) {
                    i10 = 1;
                    i14 = i10;
                } else {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            i14 = 4;
                            if (i13 != 4) {
                                i14 = 5;
                                if (i13 != 5) {
                                    i14 = i11;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                i10 = 1;
                            }
                            i14 = i10;
                        }
                    }
                    i10 = 2;
                    i14 = i10;
                }
            }
            double d10 = dArr[i12];
            int i15 = i12 + 1;
            double d11 = dArr[i15];
            double[] dArr3 = dArr2[i12];
            double d12 = dArr3[0];
            double d13 = dArr3[1];
            double[] dArr4 = dArr2[i15];
            c1058aArr[i12] = new C1058a(i14, d10, d11, d12, d13, dArr4[0], dArr4[1]);
            i12 = i15;
            i11 = i14;
        }
    }

    @Override // n0.b
    public double c(double d10, int i10) {
        double dG;
        double dE;
        double dI;
        double dC;
        double dG2;
        double dE2;
        int i11 = 0;
        if (this.f115515f) {
            C1058a[] c1058aArr = this.f115514e;
            C1058a c1058a = c1058aArr[0];
            double d11 = c1058a.f115521c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (c1058a.f115536r) {
                    if (i10 == 0) {
                        dG2 = c1058a.f(d11);
                        dE2 = this.f115514e[0].d(d11);
                    } else {
                        dG2 = c1058a.g(d11);
                        dE2 = this.f115514e[0].e(d11);
                    }
                    return dG2 + (d12 * dE2);
                }
                c1058a.k(d11);
                if (i10 == 0) {
                    dI = this.f115514e[0].h();
                    dC = this.f115514e[0].b();
                } else {
                    dI = this.f115514e[0].i();
                    dC = this.f115514e[0].c();
                }
                return dI + (d12 * dC);
            }
            if (d10 > c1058aArr[c1058aArr.length - 1].f115522d) {
                double d13 = c1058aArr[c1058aArr.length - 1].f115522d;
                double d14 = d10 - d13;
                int length = c1058aArr.length - 1;
                if (i10 == 0) {
                    dG = c1058aArr[length].f(d13);
                    dE = this.f115514e[length].d(d13);
                } else {
                    dG = c1058aArr[length].g(d13);
                    dE = this.f115514e[length].e(d13);
                }
                return dG + (d14 * dE);
            }
        } else {
            C1058a[] c1058aArr2 = this.f115514e;
            double d15 = c1058aArr2[0].f115521c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > c1058aArr2[c1058aArr2.length - 1].f115522d) {
                d10 = c1058aArr2[c1058aArr2.length - 1].f115522d;
            }
        }
        while (true) {
            C1058a[] c1058aArr3 = this.f115514e;
            if (i11 >= c1058aArr3.length) {
                return Double.NaN;
            }
            C1058a c1058a2 = c1058aArr3[i11];
            if (d10 <= c1058a2.f115522d) {
                if (c1058a2.f115536r) {
                    return i10 == 0 ? c1058a2.f(d10) : c1058a2.g(d10);
                }
                c1058a2.k(d10);
                return i10 == 0 ? this.f115514e[i11].h() : this.f115514e[i11].i();
            }
            i11++;
        }
    }

    @Override // n0.b
    public void d(double d10, double[] dArr) {
        if (this.f115515f) {
            C1058a[] c1058aArr = this.f115514e;
            C1058a c1058a = c1058aArr[0];
            double d11 = c1058a.f115521c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (c1058a.f115536r) {
                    dArr[0] = c1058a.f(d11) + (this.f115514e[0].d(d11) * d12);
                    dArr[1] = this.f115514e[0].g(d11) + (d12 * this.f115514e[0].e(d11));
                    return;
                } else {
                    c1058a.k(d11);
                    dArr[0] = this.f115514e[0].h() + (this.f115514e[0].b() * d12);
                    dArr[1] = this.f115514e[0].i() + (d12 * this.f115514e[0].c());
                    return;
                }
            }
            if (d10 > c1058aArr[c1058aArr.length - 1].f115522d) {
                double d13 = c1058aArr[c1058aArr.length - 1].f115522d;
                double d14 = d10 - d13;
                int length = c1058aArr.length - 1;
                C1058a c1058a2 = c1058aArr[length];
                if (c1058a2.f115536r) {
                    dArr[0] = c1058a2.f(d13) + (this.f115514e[length].d(d13) * d14);
                    dArr[1] = this.f115514e[length].g(d13) + (d14 * this.f115514e[length].e(d13));
                    return;
                } else {
                    c1058a2.k(d10);
                    dArr[0] = this.f115514e[length].h() + (this.f115514e[length].b() * d14);
                    dArr[1] = this.f115514e[length].i() + (d14 * this.f115514e[length].c());
                    return;
                }
            }
        } else {
            C1058a[] c1058aArr2 = this.f115514e;
            double d15 = c1058aArr2[0].f115521c;
            if (d10 < d15) {
                d10 = d15;
            }
            if (d10 > c1058aArr2[c1058aArr2.length - 1].f115522d) {
                d10 = c1058aArr2[c1058aArr2.length - 1].f115522d;
            }
        }
        int i10 = 0;
        while (true) {
            C1058a[] c1058aArr3 = this.f115514e;
            if (i10 >= c1058aArr3.length) {
                return;
            }
            C1058a c1058a3 = c1058aArr3[i10];
            if (d10 <= c1058a3.f115522d) {
                if (c1058a3.f115536r) {
                    dArr[0] = c1058a3.f(d10);
                    dArr[1] = this.f115514e[i10].g(d10);
                    return;
                } else {
                    c1058a3.k(d10);
                    dArr[0] = this.f115514e[i10].h();
                    dArr[1] = this.f115514e[i10].i();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // n0.b
    public void e(double d10, float[] fArr) {
        if (this.f115515f) {
            C1058a[] c1058aArr = this.f115514e;
            C1058a c1058a = c1058aArr[0];
            double d11 = c1058a.f115521c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (c1058a.f115536r) {
                    fArr[0] = (float) (c1058a.f(d11) + (this.f115514e[0].d(d11) * d12));
                    fArr[1] = (float) (this.f115514e[0].g(d11) + (d12 * this.f115514e[0].e(d11)));
                    return;
                } else {
                    c1058a.k(d11);
                    fArr[0] = (float) (this.f115514e[0].h() + (this.f115514e[0].b() * d12));
                    fArr[1] = (float) (this.f115514e[0].i() + (d12 * this.f115514e[0].c()));
                    return;
                }
            }
            if (d10 > c1058aArr[c1058aArr.length - 1].f115522d) {
                double d13 = c1058aArr[c1058aArr.length - 1].f115522d;
                double d14 = d10 - d13;
                int length = c1058aArr.length - 1;
                C1058a c1058a2 = c1058aArr[length];
                if (c1058a2.f115536r) {
                    fArr[0] = (float) (c1058a2.f(d13) + (this.f115514e[length].d(d13) * d14));
                    fArr[1] = (float) (this.f115514e[length].g(d13) + (d14 * this.f115514e[length].e(d13)));
                    return;
                } else {
                    c1058a2.k(d10);
                    fArr[0] = (float) this.f115514e[length].h();
                    fArr[1] = (float) this.f115514e[length].i();
                    return;
                }
            }
        } else {
            C1058a[] c1058aArr2 = this.f115514e;
            double d15 = c1058aArr2[0].f115521c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > c1058aArr2[c1058aArr2.length - 1].f115522d) {
                d10 = c1058aArr2[c1058aArr2.length - 1].f115522d;
            }
        }
        int i10 = 0;
        while (true) {
            C1058a[] c1058aArr3 = this.f115514e;
            if (i10 >= c1058aArr3.length) {
                return;
            }
            C1058a c1058a3 = c1058aArr3[i10];
            if (d10 <= c1058a3.f115522d) {
                if (c1058a3.f115536r) {
                    fArr[0] = (float) c1058a3.f(d10);
                    fArr[1] = (float) this.f115514e[i10].g(d10);
                    return;
                } else {
                    c1058a3.k(d10);
                    fArr[0] = (float) this.f115514e[i10].h();
                    fArr[1] = (float) this.f115514e[i10].i();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // n0.b
    public double f(double d10, int i10) {
        C1058a[] c1058aArr = this.f115514e;
        int i11 = 0;
        double d11 = c1058aArr[0].f115521c;
        if (d10 < d11) {
            d10 = d11;
        }
        if (d10 > c1058aArr[c1058aArr.length - 1].f115522d) {
            d10 = c1058aArr[c1058aArr.length - 1].f115522d;
        }
        while (true) {
            C1058a[] c1058aArr2 = this.f115514e;
            if (i11 >= c1058aArr2.length) {
                return Double.NaN;
            }
            C1058a c1058a = c1058aArr2[i11];
            if (d10 <= c1058a.f115522d) {
                if (c1058a.f115536r) {
                    return i10 == 0 ? c1058a.d(d10) : c1058a.e(d10);
                }
                c1058a.k(d10);
                return i10 == 0 ? this.f115514e[i11].b() : this.f115514e[i11].c();
            }
            i11++;
        }
    }

    @Override // n0.b
    public void g(double d10, double[] dArr) {
        C1058a[] c1058aArr = this.f115514e;
        double d11 = c1058aArr[0].f115521c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > c1058aArr[c1058aArr.length - 1].f115522d) {
            d10 = c1058aArr[c1058aArr.length - 1].f115522d;
        }
        int i10 = 0;
        while (true) {
            C1058a[] c1058aArr2 = this.f115514e;
            if (i10 >= c1058aArr2.length) {
                return;
            }
            C1058a c1058a = c1058aArr2[i10];
            if (d10 <= c1058a.f115522d) {
                if (c1058a.f115536r) {
                    dArr[0] = c1058a.d(d10);
                    dArr[1] = this.f115514e[i10].e(d10);
                    return;
                } else {
                    c1058a.k(d10);
                    dArr[0] = this.f115514e[i10].b();
                    dArr[1] = this.f115514e[i10].c();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // n0.b
    public double[] h() {
        return this.f115513d;
    }
}

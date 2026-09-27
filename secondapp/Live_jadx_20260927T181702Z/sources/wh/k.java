package wh;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function<l, t6> f143123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function<l, Double> f143124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f143125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function<l, k> f143126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function<l, k> f143127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f143128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function<l, u6> f143129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Function<l, Double> f143130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap<l, m> f143131j;

    public k(@NonNull String str, @NonNull Function<l, t6> function, @NonNull Function<l, Double> function2, boolean z10, @Nullable Function<l, k> function3, @Nullable Function<l, k> function4, @Nullable e eVar, @Nullable Function<l, u6> function5) {
        this.f143131j = new HashMap<>();
        this.f143122a = str;
        this.f143123b = function;
        this.f143124c = function2;
        this.f143125d = z10;
        this.f143126e = function3;
        this.f143127f = function4;
        this.f143128g = eVar;
        this.f143129h = function5;
        this.f143130i = null;
    }

    public static double c(double d10) {
        if (!l(d10) || k(d10)) {
            return d10;
        }
        return 49.0d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0045 A[RETURN] */
    public static double d(double d10, double d11) {
        double d12 = d.d(d10, d11);
        double dB = d.b(d10, d11);
        double dE = d.e(d12, d10);
        double dE2 = d.e(dB, d10);
        if (!l(d10)) {
            if (dE2 >= d11 || dE2 >= dE) {
                return dB;
            }
            return d12;
        }
        boolean z10 = Math.abs(dE - dE2) < 0.1d && dE < d11 && dE2 < d11;
        if (dE >= d11 || dE >= dE2 || z10) {
            return d12;
        }
        return dB;
    }

    @NonNull
    public static k e(@NonNull String str, int i10) {
        final m mVarB = m.b(i10);
        final t6 t6VarD = t6.d(i10);
        return f(str, new Function() { // from class: wh.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return k.b(t6VarD, (l) obj);
            }
        }, new Function() { // from class: wh.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(mVarB.e());
            }
        });
    }

    @NonNull
    public static k f(@NonNull String str, @NonNull Function<l, t6> function, @NonNull Function<l, Double> function2) {
        return new k(str, function, function2, false, null, null, null, null);
    }

    @NonNull
    public static k g(@NonNull String str, @NonNull Function<l, t6> function, @NonNull Function<l, Double> function2, boolean z10) {
        return new k(str, function, function2, z10, null, null, null, null);
    }

    public static boolean k(double d10) {
        return Math.round(d10) <= 49;
    }

    public static boolean l(double d10) {
        return Math.round(d10) < 60;
    }

    public int h(@NonNull l lVar) {
        int iK = i(lVar).k();
        Function<l, Double> function = this.f143130i;
        if (function == null) {
            return iK;
        }
        return (w5.b(0, 255, (int) Math.round(((Double) function.apply(lVar)).doubleValue() * 255.0d)) << 24) | (iK & f2.z1.f82662x);
    }

    @NonNull
    public m i(@NonNull l lVar) {
        m mVar = this.f143131j.get(lVar);
        if (mVar != null) {
            return mVar;
        }
        m mVarF = ((t6) this.f143123b.apply(lVar)).f(j(lVar));
        if (this.f143131j.size() > 4) {
            this.f143131j.clear();
        }
        this.f143131j.put(lVar, mVarF);
        return mVarF;
    }

    public double j(@NonNull l lVar) {
        double d10;
        double dMax;
        double dMin;
        boolean z10 = false;
        boolean z11 = lVar.f143136e < 0.0d;
        Function<l, u6> function = this.f143129h;
        if (function == null) {
            boolean z12 = z11;
            double dDoubleValue = ((Double) this.f143124c.apply(lVar)).doubleValue();
            Function<l, k> function2 = this.f143126e;
            if (function2 == null) {
                return dDoubleValue;
            }
            double dJ = ((k) function2.apply(lVar)).j(lVar);
            double dA = this.f143128g.a(lVar.f143136e);
            if (d.e(dJ, dDoubleValue) < dA) {
                dDoubleValue = d(dJ, dA);
            }
            if (z12) {
                dDoubleValue = d(dJ, dA);
            }
            if (!this.f143125d || 50.0d > dDoubleValue || dDoubleValue >= 60.0d) {
                d10 = dDoubleValue;
            } else {
                d10 = 49.0d;
                if (d.e(49.0d, dJ) < dA) {
                    d10 = 60.0d;
                }
            }
            if (this.f143127f != null) {
                double dJ2 = ((k) this.f143126e.apply(lVar)).j(lVar);
                double dJ3 = ((k) this.f143127f.apply(lVar)).j(lVar);
                double dMax2 = Math.max(dJ2, dJ3);
                double dMin2 = Math.min(dJ2, dJ3);
                if (d.e(dMax2, d10) < dA || d.e(dMin2, d10) < dA) {
                    double dC = d.c(dMax2, dA);
                    double dA2 = d.a(dMin2, dA);
                    ArrayList arrayList = new ArrayList();
                    if (dC != -1.0d) {
                        arrayList.add(Double.valueOf(dC));
                    }
                    if (dA2 != -1.0d) {
                        arrayList.add(Double.valueOf(dA2));
                    }
                    if (l(dJ2) || l(dJ3)) {
                        if (dC == -1.0d) {
                            return 100.0d;
                        }
                        return dC;
                    }
                    if (arrayList.size() == 1) {
                        return ((Double) arrayList.get(0)).doubleValue();
                    }
                    if (dA2 == -1.0d) {
                        return 0.0d;
                    }
                    return dA2;
                }
            }
            return d10;
        }
        u6 u6Var = (u6) function.apply(lVar);
        k kVarC = u6Var.c();
        k kVarD = u6Var.d();
        double dA3 = u6Var.a();
        v6 v6VarB = u6Var.b();
        boolean zE = u6Var.e();
        double dJ4 = ((k) this.f143126e.apply(lVar)).j(lVar);
        if (v6VarB == v6.NEARER || ((v6VarB == v6.LIGHTER && !lVar.f143135d) || (v6VarB == v6.DARKER && lVar.f143135d))) {
            z10 = true;
        }
        k kVar = z10 ? kVarC : kVarD;
        k kVar2 = z10 ? kVarD : kVarC;
        boolean zEquals = this.f143122a.equals(kVar.f143122a);
        double d11 = lVar.f143135d ? 1.0d : -1.0d;
        double dA4 = kVar.f143128g.a(lVar.f143136e);
        double dA5 = kVar2.f143128g.a(lVar.f143136e);
        double dDoubleValue2 = ((Double) kVar.f143124c.apply(lVar)).doubleValue();
        if (d.e(dJ4, dDoubleValue2) < dA4) {
            dDoubleValue2 = d(dJ4, dA4);
        }
        boolean z13 = z11;
        double dDoubleValue3 = ((Double) kVar2.f143124c.apply(lVar)).doubleValue();
        if (d.e(dJ4, dDoubleValue3) < dA5) {
            dDoubleValue3 = d(dJ4, dA5);
        }
        if (z13) {
            dDoubleValue2 = d(dJ4, dA4);
            dDoubleValue3 = d(dJ4, dA5);
        }
        if ((dDoubleValue3 - dDoubleValue2) * d11 < dA3) {
            double d12 = dA3 * d11;
            double dA6 = w5.a(0.0d, 100.0d, dDoubleValue2 + d12);
            if ((dA6 - dDoubleValue2) * d11 < dA3) {
                dDoubleValue2 = w5.a(0.0d, 100.0d, dA6 - d12);
            }
            dDoubleValue3 = dA6;
        }
        if (50.0d > dDoubleValue2 || dDoubleValue2 >= 60.0d) {
            if (50.0d > dDoubleValue3 || dDoubleValue3 >= 60.0d) {
                dMax = dDoubleValue3;
            } else if (!zE) {
                dMax = d11 > 0.0d ? 60.0d : 49.0d;
            } else if (d11 > 0.0d) {
                dMax = Math.max(dDoubleValue3, (dA3 * d11) + 60.0d);
                dDoubleValue2 = 60.0d;
            } else {
                dMin = Math.min(dDoubleValue3, (dA3 * d11) + 49.0d);
                dMax = dMin;
                dDoubleValue2 = 49.0d;
            }
        } else if (d11 > 0.0d) {
            dMax = Math.max(dDoubleValue3, (dA3 * d11) + 60.0d);
            dDoubleValue2 = 60.0d;
        } else {
            dMin = Math.min(dDoubleValue3, (dA3 * d11) + 49.0d);
            dMax = dMin;
            dDoubleValue2 = 49.0d;
        }
        return zEquals ? dDoubleValue2 : dMax;
    }

    public k(@NonNull String str, @NonNull Function<l, t6> function, @NonNull Function<l, Double> function2, boolean z10, @Nullable Function<l, k> function3, @Nullable Function<l, k> function4, @Nullable e eVar, @Nullable Function<l, u6> function5, @Nullable Function<l, Double> function6) {
        this.f143131j = new HashMap<>();
        this.f143122a = str;
        this.f143123b = function;
        this.f143124c = function2;
        this.f143125d = z10;
        this.f143126e = function3;
        this.f143127f = function4;
        this.f143128g = eVar;
        this.f143129h = function5;
        this.f143130i = function6;
    }

    public static /* synthetic */ t6 b(t6 t6Var, l lVar) {
        return t6Var;
    }
}

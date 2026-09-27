package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rf f40805a = new rf();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40806a;

        static {
            int[] iArr = new int[qf.b.values().length];
            try {
                iArr[qf.b.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qf.b.ASPECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qf.b.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40806a = iArr;
        }
    }

    public final n6 a(qf qfVar, c6 c6Var, int i10, int i11) {
        dr.z0 z0VarA;
        Integer numP = qfVar.p();
        int iA = numP != null ? c6Var.a(numP.intValue()) : i10;
        Integer numI = qfVar.i();
        int iA2 = numI != null ? c6Var.a(numI.intValue()) : i11;
        if (iA2 == 0 || iA == 0) {
            return a(qfVar, i10, i11);
        }
        float f10 = iA / iA2;
        float f11 = i10;
        float f12 = i11;
        if (f10 > f11 / f12) {
            z0VarA = dr.v1.a(Integer.valueOf(i10), Integer.valueOf((int) (f11 / f10)));
        } else {
            z0VarA = dr.v1.a(Integer.valueOf((int) (f12 * f10)), Integer.valueOf(i11));
        }
        return new n6(((Number) z0VarA.d()).intValue(), ((Number) z0VarA.g()).intValue());
    }

    public final n6 b(qf qfVar, c6 densityProvider, int i10, int i11) {
        kotlin.jvm.internal.m0.p(qfVar, "<this>");
        kotlin.jvm.internal.m0.p(densityProvider, "densityProvider");
        int i12 = a.f40806a[qfVar.h().ordinal()];
        if (i12 == 1) {
            return a(qfVar, i10, i11);
        }
        if (i12 == 2) {
            return a(qfVar, densityProvider, i10, i11);
        }
        if (i12 == 3) {
            return c(qfVar, densityProvider, i10, i11);
        }
        throw new dr.o0();
    }

    public final n6 c(qf qfVar, c6 c6Var, int i10, int i11) {
        Integer numP = qfVar.p();
        if (numP != null) {
            i10 = c6Var.a(numP.intValue());
        }
        Integer numI = qfVar.i();
        if (numI != null) {
            i11 = c6Var.a(numI.intValue());
        }
        return new n6(i10, i11);
    }

    public final n6 a(qf qfVar, int i10, int i11) {
        return new n6(i10, i11);
    }
}

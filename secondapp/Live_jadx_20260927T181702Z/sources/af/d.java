package af;

import eh.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4890a = "CeaUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4891b = 1195456820;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4892c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4893d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f4894e = 181;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f4895f = 49;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f4896g = 47;

    public static void a(long j10, t0 t0Var, g0[] g0VarArr) {
        while (true) {
            if (t0Var.a() <= 1) {
                return;
            }
            int iC = c(t0Var);
            int iC2 = c(t0Var);
            int iF = t0Var.f() + iC2;
            if (iC2 == -1 || iC2 > t0Var.a()) {
                eh.h0.n("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iF = t0Var.g();
            } else if (iC == 4 && iC2 >= 8) {
                int iL = t0Var.L();
                int iR = t0Var.R();
                int iS = iR == 49 ? t0Var.s() : 0;
                int iL2 = t0Var.L();
                if (iR == 47) {
                    t0Var.Z(1);
                }
                boolean z10 = iL == 181 && (iR == 49 || iR == 47) && iL2 == 3;
                if (iR == 49) {
                    z10 &= iS == 1195456820;
                }
                if (z10) {
                    b(j10, t0Var, g0VarArr);
                }
            }
            t0Var.Y(iF);
        }
    }

    public static void b(long j10, t0 t0Var, g0[] g0VarArr) {
        long j11;
        int iL = t0Var.L();
        if ((iL & 64) != 0) {
            t0Var.Z(1);
            int i10 = (iL & 31) * 3;
            int iF = t0Var.f();
            int length = g0VarArr.length;
            int i11 = 0;
            while (i11 < length) {
                g0 g0Var = g0VarArr[i11];
                t0Var.Y(iF);
                g0Var.f(t0Var, i10);
                if (j10 != -9223372036854775807L) {
                    j11 = j10;
                    g0Var.b(j11, 1, i10, 0, null);
                } else {
                    j11 = j10;
                }
                i11++;
                j10 = j11;
            }
        }
    }

    public static int c(t0 t0Var) {
        int i10 = 0;
        while (t0Var.a() != 0) {
            int iL = t0Var.L();
            i10 += iL;
            if (iL != 255) {
                return i10;
            }
        }
        return -1;
    }
}

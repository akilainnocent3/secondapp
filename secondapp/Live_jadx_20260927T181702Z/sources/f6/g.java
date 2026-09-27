package f6;

import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f83467a = "CeaUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f83468b = 1195456820;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83469c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f83470d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f83471e = 181;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f83472f = 49;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f83473g = 47;

    public static void a(long j10, x4.v0 v0Var, f1[] f1VarArr) {
        while (true) {
            if (v0Var.a() <= 1) {
                return;
            }
            int iC = c(v0Var);
            int iC2 = c(v0Var);
            int iG = v0Var.g() + iC2;
            if (iC2 == -1 || iC2 > v0Var.a()) {
                x4.d0.n("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iG = v0Var.j();
            } else if (iC == 4 && iC2 >= 8) {
                int iU = v0Var.U();
                int iC0 = v0Var.c0();
                int iB = iC0 == 49 ? v0Var.B() : 0;
                int iU2 = v0Var.U();
                if (iC0 == 47) {
                    v0Var.l0(1);
                }
                boolean z10 = iU == 181 && (iC0 == 49 || iC0 == 47) && iU2 == 3;
                if (iC0 == 49) {
                    z10 &= iB == 1195456820;
                }
                if (z10) {
                    b(j10, v0Var, f1VarArr);
                }
            }
            v0Var.j0(iG);
        }
    }

    public static void b(long j10, x4.v0 v0Var, f1[] f1VarArr) {
        int iU = v0Var.U();
        if ((iU & 64) != 0) {
            v0Var.l0(1);
            int i10 = (iU & 31) * 3;
            int iG = v0Var.g();
            for (f1 f1Var : f1VarArr) {
                v0Var.j0(iG);
                f1Var.f(v0Var, i10);
                zi.l0.g0(j10 != -9223372036854775807L);
                f1Var.b(j10, 1, i10, 0, null);
            }
        }
    }

    public static int c(x4.v0 v0Var) {
        int i10 = 0;
        while (v0Var.a() != 0) {
            int iU = v0Var.U();
            i10 += iU;
            if (iU != 255) {
                return i10;
            }
        }
        return -1;
    }
}

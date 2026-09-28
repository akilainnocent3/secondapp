package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class j {
    public static final /* synthetic */ int a = 0;

    public static final long a(y740 y740Var, rl5 rl5Var, int i, long j, long j2) {
        long j3;
        rl5 rl5Var2;
        rl5Var.getClass();
        int i2 = i;
        long j4 = i2;
        l.b(rl5Var.d(), 0L, j4);
        boolean z = y740Var.c;
        lb5 lb5Var = y740Var.b;
        if (z) {
            ib5.a("closed");
            return 0L;
        }
        rl5 rl5Var3 = rl5Var;
        long j5 = j;
        while (true) {
            long jA = b.a(lb5Var, rl5Var3, j5, j2, i2);
            long j6 = j5;
            long j7 = -1;
            if (jA != -1) {
                return jA;
            }
            long j8 = lb5Var.b;
            long j9 = (j8 - j4) + 1;
            if (j9 < j2) {
                if (j8 < j2) {
                    j3 = -1;
                    rl5Var2 = rl5Var;
                } else {
                    int iMax = (int) Math.max(1L, (j8 - j2) + 1);
                    int iMin = ((int) Math.min(j4, (lb5Var.b - j6) + 1)) - 1;
                    if (iMax <= iMin) {
                        while (true) {
                            j3 = j7;
                            rl5Var2 = rl5Var;
                            if (lb5Var.F(iMin, rl5Var2, lb5Var.b - ((long) iMin))) {
                                break;
                            }
                            if (iMin == iMax) {
                                return j3;
                            }
                            iMin--;
                            j7 = j3;
                        }
                    }
                }
                if (y740Var.a.read(lb5Var, 8192L) == j3) {
                    return j3;
                }
                long jMax = Math.max(j6, j9);
                rl5Var3 = rl5Var2;
                j5 = jMax;
                i2 = i;
            }
            return -1L;
        }
    }
}

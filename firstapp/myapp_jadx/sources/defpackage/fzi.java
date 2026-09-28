package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes8.dex */
public final class fzi extends jui {
    public static final rl5 c;
    public final lb5 b;

    static {
        rl5 rl5Var = rl5.d;
        c = rl5.a.b("0021F904");
    }

    public fzi(cc5 cc5Var) {
        super(cc5Var);
        this.b = new lb5();
    }

    public final boolean d(long j) {
        lb5 lb5Var = this.b;
        long j2 = lb5Var.b;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return super.read(lb5Var, j3) == j3;
    }

    @Override // defpackage.jui, defpackage.zpa0
    public final long read(lb5 lb5Var, long j) throws EOFException {
        long j2;
        long j3;
        d(j);
        lb5 lb5Var2 = this.b;
        long j4 = 0;
        if (lb5Var2.b == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j5 = 0;
        while (true) {
            long jO = -1;
            while (true) {
                rl5 rl5Var = c;
                jO = this.b.o(rl5Var.a[0], jO + 1, Long.MAX_VALUE);
                if (jO == -1) {
                    j2 = j4;
                    break;
                }
                j2 = j4;
                if (d(rl5Var.a.length) && lb5Var2.F(rl5Var.d(), rl5Var, jO)) {
                    break;
                }
                j4 = j2;
            }
            if (jO == -1) {
                break;
            }
            long j6 = lb5Var2.read(lb5Var, jO + 4);
            if (j6 < j2) {
                j6 = j2;
            }
            j5 += j6;
            if (d(5L) && lb5Var2.m(4L) == 0) {
                byte bM = lb5Var2.m(2L);
                nah0.a aVar = nah0.b;
                if ((((bM & 255) << 8) | (lb5Var2.m(1L) & 255)) < 2) {
                    lb5Var.d0(lb5Var2.m(j2));
                    lb5Var.d0(10);
                    lb5Var.d0(0);
                    lb5Var2.skip(3L);
                }
            }
            j4 = 0;
        }
        if (j5 < j) {
            long j7 = lb5Var2.read(lb5Var, j - j5);
            j3 = 0;
            if (j7 < 0) {
                j7 = 0;
            }
            j5 += j7;
        } else {
            j3 = 0;
        }
        if (j5 == j3) {
            return -1L;
        }
        return j5;
    }
}

package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class sth extends jui {
    public final long b;
    public final boolean c;
    public long d;

    public sth(zpa0 zpa0Var, long j, boolean z) {
        super(zpa0Var);
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.jui, defpackage.zpa0
    public final long read(lb5 lb5Var, long j) throws IOException {
        lb5Var.getClass();
        long j2 = this.d;
        long j3 = this.b;
        if (j2 > j3) {
            j = 0;
        } else if (this.c) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long j5 = super.read(lb5Var, j);
        if (j5 != -1) {
            this.d += j5;
        }
        long j6 = this.d;
        if ((j6 >= j3 || j5 != -1) && j6 <= j3) {
            return j5;
        }
        if (j5 > 0 && j6 > j3) {
            long j7 = lb5Var.b - (j6 - j3);
            lb5 lb5Var2 = new lb5();
            lb5Var2.R0(lb5Var);
            lb5Var.write(lb5Var2, j7);
            lb5Var2.d();
        }
        StringBuilder sbA = q6a0.a(j3, "expected ", " bytes but got ");
        sbA.append(this.d);
        throw new IOException(sbA.toString());
    }
}

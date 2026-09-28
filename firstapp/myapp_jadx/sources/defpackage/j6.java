package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j6 extends h6 {
    public static j6 d;
    public static final lg50 e = lg50.b;
    public static final lg50 f = lg50.a;
    public ukf0 c;

    @Override // defpackage.h6
    public final int[] a(int i) {
        int iD;
        if (c().length() > 0 && i < c().length()) {
            ukf0 ukf0Var = this.c;
            lg50 lg50Var = e;
            if (i < 0) {
                if (ukf0Var == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                iD = ukf0Var.b.d(0);
            } else {
                if (ukf0Var == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                int iD2 = ukf0Var.b.d(i);
                iD = e(iD2, lg50Var) == i ? iD2 : iD2 + 1;
            }
            ukf0 ukf0Var2 = this.c;
            if (ukf0Var2 == null) {
                Intrinsics.n("layoutResult");
                throw null;
            }
            if (iD < ukf0Var2.b.f) {
                return b(e(iD, lg50Var), e(iD, f) + 1);
            }
        }
        return null;
    }

    @Override // defpackage.h6
    public final int[] d(int i) {
        int iD;
        if (c().length() > 0 && i > 0) {
            int length = c().length();
            ukf0 ukf0Var = this.c;
            lg50 lg50Var = f;
            if (i > length) {
                if (ukf0Var == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                iD = ukf0Var.b.d(c().length());
            } else {
                if (ukf0Var == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                int iD2 = ukf0Var.b.d(i);
                iD = e(iD2, lg50Var) + 1 == i ? iD2 : iD2 - 1;
            }
            if (iD >= 0) {
                return b(e(iD, e), e(iD, lg50Var) + 1);
            }
        }
        return null;
    }

    public final int e(int i, lg50 lg50Var) {
        ukf0 ukf0Var = this.c;
        if (ukf0Var == null) {
            Intrinsics.n("layoutResult");
            throw null;
        }
        int i2 = ukf0Var.i(i);
        ukf0 ukf0Var2 = this.c;
        if (ukf0Var2 == null) {
            Intrinsics.n("layoutResult");
            throw null;
        }
        lg50 lg50VarJ = ukf0Var2.j(i2);
        ukf0 ukf0Var3 = this.c;
        if (lg50Var != lg50VarJ) {
            if (ukf0Var3 != null) {
                return ukf0Var3.i(i);
            }
            Intrinsics.n("layoutResult");
            throw null;
        }
        if (ukf0Var3 != null) {
            return ukf0Var3.b.c(i, false) - 1;
        }
        Intrinsics.n("layoutResult");
        throw null;
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k6 extends h6 {
    public static k6 e;
    public static final lg50 f = lg50.b;
    public static final lg50 g = lg50.a;
    public ukf0 c;
    public bb80 d;

    @Override // defpackage.h6
    public final int[] a(int i) {
        int iE;
        if (c().length() > 0 && i < c().length()) {
            try {
                bb80 bb80Var = this.d;
                if (bb80Var == null) {
                    Intrinsics.n("node");
                    throw null;
                }
                lk40 lk40VarG = bb80Var.g();
                int iRound = Math.round(lk40VarG.d - lk40VarG.b);
                if (i <= 0) {
                    i = 0;
                }
                ukf0 ukf0Var = this.c;
                if (ukf0Var == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                int iD = ukf0Var.b.d(i);
                ukf0 ukf0Var2 = this.c;
                if (ukf0Var2 == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                float f2 = ukf0Var2.b.f(iD) + iRound;
                ukf0 ukf0Var3 = this.c;
                if (ukf0Var3 == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                zjw zjwVar = ukf0Var3.b;
                float f3 = zjwVar.f(zjwVar.f - 1);
                ukf0 ukf0Var4 = this.c;
                if (f2 < f3) {
                    if (ukf0Var4 == null) {
                        Intrinsics.n("layoutResult");
                        throw null;
                    }
                    iE = ukf0Var4.b.e(f2);
                } else {
                    if (ukf0Var4 == null) {
                        Intrinsics.n("layoutResult");
                        throw null;
                    }
                    iE = ukf0Var4.b.f;
                }
                return b(i, e(iE - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.h6
    public final int[] d(int i) {
        int iE;
        if (c().length() > 0 && i > 0) {
            try {
                bb80 bb80Var = this.d;
                if (bb80Var == null) {
                    Intrinsics.n("node");
                    throw null;
                }
                lk40 lk40VarG = bb80Var.g();
                int iRound = Math.round(lk40VarG.d - lk40VarG.b);
                int length = c().length();
                if (length <= i) {
                    i = length;
                }
                ukf0 ukf0Var = this.c;
                if (ukf0Var == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                int iD = ukf0Var.b.d(i);
                ukf0 ukf0Var2 = this.c;
                if (ukf0Var2 == null) {
                    Intrinsics.n("layoutResult");
                    throw null;
                }
                float f2 = ukf0Var2.b.f(iD) - iRound;
                if (f2 > 0.0f) {
                    ukf0 ukf0Var3 = this.c;
                    if (ukf0Var3 == null) {
                        Intrinsics.n("layoutResult");
                        throw null;
                    }
                    iE = ukf0Var3.b.e(f2);
                } else {
                    iE = 0;
                }
                if (i == c().length() && iE < iD) {
                    iE++;
                }
                return b(e(iE, f), i);
            } catch (IllegalStateException unused) {
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

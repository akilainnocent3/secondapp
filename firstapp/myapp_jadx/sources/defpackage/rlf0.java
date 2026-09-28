package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rlf0 {
    public static void a(tcf tcfVar, ukf0 ukf0Var, long j) {
        zjw zjwVar = ukf0Var.b;
        long jC = j58.m;
        tkf0 tkf0Var = ukf0Var.a;
        ora0 ora0Var = tkf0Var.b.a;
        ix80 ix80Var = ora0Var.n;
        yef0 yef0Var = ora0Var.m;
        wcf wcfVar = ora0Var.p;
        qc6.b bVarF1 = tcfVar.F1();
        long jD = bVarF1.d();
        bVarF1.a().p();
        try {
            rc6 rc6Var = bVarF1.a;
            rc6Var.i(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            if (ukf0Var.f() && tkf0Var.f != 3) {
                long j2 = ukf0Var.c;
                rc6.c(rc6Var, (int) (j2 >> 32), (int) (j2 & 4294967295L), 16);
            }
            imf0 imf0Var = tkf0Var.b;
            ya5 ya5VarE = imf0Var.a.a.e();
            if (ya5VarE == null || jC != 16) {
                lc6 lc6VarA = tcfVar.F1().a();
                if (jC == 16) {
                    jC = imf0Var.c();
                }
                zjwVar.i(lc6VarA, gff0.a(Float.NaN, jC), ix80Var, yef0Var, wcfVar);
            } else {
                gy9.a(zjwVar, tcfVar.F1().a(), ya5VarE, Float.isNaN(Float.NaN) ? imf0Var.a.a.a() : Float.NaN, ix80Var, yef0Var, wcfVar);
            }
        } finally {
            hrh.a(bVarF1, jD);
        }
    }
}

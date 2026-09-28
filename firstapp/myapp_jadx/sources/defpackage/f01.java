package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface f01 {

    public static final class a implements f01 {
        public static final a a = new a();

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.f01
        public final Object a(m9n m9nVar, nan nanVar, x1b x1bVar) {
            e01 e01Var;
            if (x1bVar instanceof e01) {
                e01Var = (e01) x1bVar;
                int i = e01Var.d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    e01Var.d = i - Integer.MIN_VALUE;
                } else {
                    e01Var = new e01(this, x1bVar);
                }
            } else {
                e01Var = new e01(this, x1bVar);
            }
            Object objB = e01Var.b;
            Object obj = y5b.a;
            int i2 = e01Var.d;
            if (i2 == 0) {
                uj50.b(objB);
                e01Var.a = nanVar;
                e01Var.d = 1;
                objB = m9nVar.b(nanVar, e01Var);
                if (objB == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nanVar = e01Var.a;
                uj50.b(objB);
            }
            dbn dbnVar = (dbn) objB;
            if (dbnVar instanceof dfe0) {
                dfe0 dfe0Var = (dfe0) dbnVar;
                return new b01.b.d(z9n.a(dfe0Var.a, nanVar.a, 1), dfe0Var);
            }
            if (!(dbnVar instanceof tcg)) {
                uhc.a();
                return null;
            }
            tcg tcgVar = (tcg) dbnVar;
            u7n u7nVar = tcgVar.a;
            return new b01.b.C0106b(u7nVar != null ? z9n.a(u7nVar, nanVar.a, 1) : null, tcgVar);
        }
    }

    Object a(m9n m9nVar, nan nanVar, x1b x1bVar);
}

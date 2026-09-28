package defpackage;

import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class pg10 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ng10 ng10Var, lx20 lx20Var, x1b x1bVar) {
        og10 og10Var;
        if (x1bVar instanceof og10) {
            og10Var = (og10) x1bVar;
            int i = og10Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                og10Var.b = i - Integer.MIN_VALUE;
            } else {
                og10Var = new og10(x1bVar);
            }
        } else {
            og10Var = new og10(x1bVar);
        }
        Object objC = og10Var.a;
        Object obj = y5b.a;
        int i2 = og10Var.b;
        try {
            if (i2 == 0) {
                uj50.b(objC);
                Set set = ng10Var.b;
                og10Var.b = 1;
                objC = lx20Var.c(set, og10Var);
                if (objC == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objC);
            }
            return (aty) objC;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            itf0.a.d("Failed to process 1UP promo bet success", new Object[0]);
            return new aty(0);
        }
    }
}

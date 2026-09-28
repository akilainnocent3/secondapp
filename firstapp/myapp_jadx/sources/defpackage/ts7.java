package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ts7 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(fr70 fr70Var, float f, xi0 xi0Var, x1b x1bVar) {
        fp70 fp70Var;
        aq40 aq40Var;
        if (x1bVar instanceof fp70) {
            fp70Var = (fp70) x1bVar;
            int i = fp70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fp70Var.c = i - Integer.MIN_VALUE;
            } else {
                fp70Var = new fp70(x1bVar);
            }
        } else {
            fp70Var = new fp70(x1bVar);
        }
        Object obj = fp70Var.b;
        Object obj2 = y5b.a;
        int i2 = fp70Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            aq40 aq40Var2 = new aq40();
            Function2<? super tp70, ? super v1b<? super Unit>, ? extends Object> hp70Var = new hp70(f, xi0Var, aq40Var2, null);
            fp70Var.a = aq40Var2;
            fp70Var.c = 1;
            if (fr70Var.b(huw.a, hp70Var, fp70Var) == obj2) {
                return obj2;
            }
            aq40Var = aq40Var2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aq40Var = fp70Var.a;
            uj50.b(obj);
        }
        return new Float(aq40Var.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(fr70 fr70Var, float f, x1b x1bVar) {
        ip70 ip70Var;
        aq40 aq40Var;
        if (x1bVar instanceof ip70) {
            ip70Var = (ip70) x1bVar;
            int i = ip70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ip70Var.c = i - Integer.MIN_VALUE;
            } else {
                ip70Var = new ip70(x1bVar);
            }
        } else {
            ip70Var = new ip70(x1bVar);
        }
        Object obj = ip70Var.b;
        Object obj2 = y5b.a;
        int i2 = ip70Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            aq40 aq40Var2 = new aq40();
            Function2<? super tp70, ? super v1b<? super Unit>, ? extends Object> jp70Var = new jp70(aq40Var2, f, null);
            ip70Var.a = aq40Var2;
            ip70Var.c = 1;
            if (fr70Var.b(huw.a, jp70Var, ip70Var) == obj2) {
                return obj2;
            }
            aq40Var = aq40Var2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aq40Var = ip70Var.a;
            uj50.b(obj);
        }
        return new Float(aq40Var.a);
    }
}

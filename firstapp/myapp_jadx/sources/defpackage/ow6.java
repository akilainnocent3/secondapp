package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ow6 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(wgz wgzVar, Function2 function2, x1b x1bVar) {
        jw6 jw6Var;
        if (x1bVar instanceof jw6) {
            jw6Var = (jw6) x1bVar;
            int i = jw6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jw6Var.c = i - Integer.MIN_VALUE;
            } else {
                jw6Var = new jw6(this, x1bVar);
            }
        } else {
            jw6Var = new jw6(this, x1bVar);
        }
        Object obj = jw6Var.a;
        y5b y5bVar = y5b.a;
        int i2 = jw6Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
        } else {
            uj50.b(obj);
            nw6 nw6Var = new nw6(function2, this, null);
            jw6Var.c = 1;
            ok10.b(wgzVar, null, nw6Var, jw6Var);
        }
    }
}

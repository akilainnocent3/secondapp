package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ryj0 {
    public final k15 a;

    public ryj0(k15 k15Var) {
        this.a = k15Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, List list, String str2, List list2, int i, x1b x1bVar) {
        qyj0 qyj0Var;
        if (x1bVar instanceof qyj0) {
            qyj0Var = (qyj0) x1bVar;
            int i2 = qyj0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qyj0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                qyj0Var = new qyj0(this, x1bVar);
            }
        } else {
            qyj0Var = new qyj0(this, x1bVar);
        }
        qyj0 qyj0Var2 = qyj0Var;
        Object obj = qyj0Var2.a;
        y5b y5bVar = y5b.a;
        int i3 = qyj0Var2.c;
        if (i3 == 0) {
            uj50.b(obj);
            qyj0Var2.c = 1;
            Object objA = this.a.a(str, list, str2, list2, i, qyj0Var2);
            return objA == y5bVar ? y5bVar : objA;
        }
        if (i3 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

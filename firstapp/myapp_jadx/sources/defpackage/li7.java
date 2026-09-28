package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class li7 {
    public final u4k a;
    public final jrm b;

    public li7(u4k u4kVar, jrm jrmVar) {
        jrmVar.getClass();
        this.a = u4kVar;
        this.b = jrmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, x1b x1bVar) {
        ki7 ki7Var;
        if (x1bVar instanceof ki7) {
            ki7Var = (ki7) x1bVar;
            int i = ki7Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ki7Var.c = i - Integer.MIN_VALUE;
            } else {
                ki7Var = new ki7(this, x1bVar);
            }
        } else {
            ki7Var = new ki7(this, x1bVar);
        }
        Object objA = ki7Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ki7Var.c;
        if (i2 == 0) {
            uj50.b(objA);
            ki7Var.c = 1;
            objA = this.a.a(list, ki7Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        j8s j8sVar = (j8s) objA;
        boolean z = j8sVar instanceof j8s.c;
        String str = z ? ((j8s.c) j8sVar).b : null;
        boolean z2 = z && ((j8s.c) j8sVar).c;
        boolean z3 = z && ((j8s.c) j8sVar).f;
        this.b.k0(j8sVar);
        return new e08(j8sVar, str, z2, z3);
    }
}

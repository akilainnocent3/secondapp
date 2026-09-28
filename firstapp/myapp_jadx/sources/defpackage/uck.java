package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class uck {
    public final x9f0 a;

    public uck(x9f0 x9f0Var) {
        x9f0Var.getClass();
        this.a = x9f0Var;
    }

    public static /* synthetic */ Object b(uck uckVar, String str, String str2, String str3, tje0 tje0Var, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        return uckVar.a(str, str2, 10, str3, tje0Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, String str2, int i, String str3, x1b x1bVar) {
        tck tckVar;
        if (x1bVar instanceof tck) {
            tckVar = (tck) x1bVar;
            int i2 = tckVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tckVar.c = i2 - Integer.MIN_VALUE;
            } else {
                tckVar = new tck(this, x1bVar);
            }
        } else {
            tckVar = new tck(this, x1bVar);
        }
        tck tckVar2 = tckVar;
        Object obj = tckVar2.a;
        y5b y5bVar = y5b.a;
        int i3 = tckVar2.c;
        if (i3 == 0) {
            uj50.b(obj);
            tckVar2.c = 1;
            Object objE = this.a.e(str, str2, i, str3, tckVar2);
            return objE == y5bVar ? y5bVar : objE;
        }
        if (i3 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

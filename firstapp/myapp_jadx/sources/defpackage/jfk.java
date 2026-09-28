package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class jfk {
    public final x9f0 a;

    public jfk(x9f0 x9f0Var) {
        x9f0Var.getClass();
        this.a = x9f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        ifk ifkVar;
        if (x1bVar instanceof ifk) {
            ifkVar = (ifk) x1bVar;
            int i = ifkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ifkVar.c = i - Integer.MIN_VALUE;
            } else {
                ifkVar = new ifk(this, x1bVar);
            }
        } else {
            ifkVar = new ifk(this, x1bVar);
        }
        Object obj = ifkVar.a;
        y5b y5bVar = y5b.a;
        int i2 = ifkVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            ifkVar.c = 1;
            Object objC = this.a.c(str, ifkVar);
            return objC == y5bVar ? y5bVar : objC;
        }
        if (i2 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

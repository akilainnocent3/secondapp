package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class dfk {
    public final lx70 a;

    public dfk(lx70 lx70Var) {
        this.a = lx70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        cfk cfkVar;
        if (x1bVar instanceof cfk) {
            cfkVar = (cfk) x1bVar;
            int i = cfkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cfkVar.c = i - Integer.MIN_VALUE;
            } else {
                cfkVar = new cfk(this, x1bVar);
            }
        } else {
            cfkVar = new cfk(this, x1bVar);
        }
        Object obj = cfkVar.a;
        y5b y5bVar = y5b.a;
        int i2 = cfkVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            cfkVar.c = 1;
            Object objC = this.a.c(cfkVar);
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

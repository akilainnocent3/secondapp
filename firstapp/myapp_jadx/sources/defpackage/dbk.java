package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class dbk {
    public final d100 a;

    public dbk(d100 d100Var) {
        d100Var.getClass();
        this.a = d100Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(x1b x1bVar) {
        bbk bbkVar;
        d100 d100Var = this.a;
        if (x1bVar instanceof bbk) {
            bbkVar = (bbk) x1bVar;
            int i = bbkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bbkVar.c = i - Integer.MIN_VALUE;
            } else {
                bbkVar = new bbk(this, x1bVar);
            }
        } else {
            bbkVar = new bbk(this, x1bVar);
        }
        Object objA = bbkVar.a;
        y5b y5bVar = y5b.a;
        int i2 = bbkVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                n1i n1iVar = new n1i(d100Var.q(), d100Var.z(), new cbk(3, null));
                bbkVar.c = 1;
                objA = s0i.a(n1iVar, bbkVar);
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
            return (f810) objA;
        } catch (Exception e) {
            itf0.a.f(e, "Error fetching PixBtg deposit polling config, using defaults", new Object[0]);
            return f810.c;
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class hhk {
    public final psm a;
    public final yqm b;

    public hhk(yqm yqmVar, psm psmVar) {
        psmVar.getClass();
        yqmVar.getClass();
        this.a = psmVar;
        this.b = yqmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Enum a(x1b x1bVar) {
        fhk fhkVar;
        if (x1bVar instanceof fhk) {
            fhkVar = (fhk) x1bVar;
            int i = fhkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fhkVar.c = i - Integer.MIN_VALUE;
            } else {
                fhkVar = new fhk(this, x1bVar);
            }
        } else {
            fhkVar = new fhk(this, x1bVar);
        }
        Object objC = fhkVar.a;
        y5b y5bVar = y5b.a;
        int i2 = fhkVar.c;
        if (i2 == 0) {
            uj50.b(objC);
            if (this.a.x()) {
                ghk ghkVar = new ghk(this, null);
                fhkVar.c = 1;
                objC = vxf0.c(8000L, ghkVar, fhkVar);
                if (objC == y5bVar) {
                    return y5bVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objC);
        lk50 lk50Var = (lk50) objC;
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar != null) {
            return (xcj) cVar.a;
        }
        return null;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class afy {
    public final xaq a;
    public final jey b;

    public afy(xaq xaqVar, jey jeyVar) {
        this.a = xaqVar;
        this.b = jeyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        qey qeyVar;
        if (x1bVar instanceof qey) {
            qeyVar = (qey) x1bVar;
            int i = qeyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qeyVar.c = i - Integer.MIN_VALUE;
            } else {
                qeyVar = new qey(this, x1bVar);
            }
        } else {
            qeyVar = new qey(this, x1bVar);
        }
        Object objP = qeyVar.a;
        y5b y5bVar = y5b.a;
        int i2 = qeyVar.c;
        if (i2 == 0) {
            uj50.b(objP);
            yzh yzhVarA = bm50.a(new pey(new or60(new waq(this.a, null))));
            qeyVar.c = 1;
            objP = bm50.p(yzhVarA, qeyVar);
            if (objP == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objP);
        }
        return bm50.i((lk50) objP);
    }
}

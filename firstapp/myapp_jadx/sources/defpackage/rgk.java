package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class rgk {
    public final krx a;

    public rgk(krx krxVar) {
        krxVar.getClass();
        this.a = krxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        qgk qgkVar;
        if (x1bVar instanceof qgk) {
            qgkVar = (qgk) x1bVar;
            int i = qgkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qgkVar.c = i - Integer.MIN_VALUE;
            } else {
                qgkVar = new qgk(this, x1bVar);
            }
        } else {
            qgkVar = new qgk(this, x1bVar);
        }
        Object obj = qgkVar.a;
        y5b y5bVar = y5b.a;
        int i2 = qgkVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            qgkVar.c = 1;
            Object objB = this.a.b(str, qgkVar);
            return objB == y5bVar ? y5bVar : objB;
        }
        if (i2 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

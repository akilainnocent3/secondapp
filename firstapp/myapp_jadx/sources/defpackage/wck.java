package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class wck {
    public final krx a;

    public wck(krx krxVar) {
        krxVar.getClass();
        this.a = krxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        vck vckVar;
        if (x1bVar instanceof vck) {
            vckVar = (vck) x1bVar;
            int i = vckVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vckVar.c = i - Integer.MIN_VALUE;
            } else {
                vckVar = new vck(this, x1bVar);
            }
        } else {
            vckVar = new vck(this, x1bVar);
        }
        Object obj = vckVar.a;
        y5b y5bVar = y5b.a;
        int i2 = vckVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            vckVar.c = 1;
            Object objA = this.a.a(str, vckVar);
            return objA == y5bVar ? y5bVar : objA;
        }
        if (i2 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

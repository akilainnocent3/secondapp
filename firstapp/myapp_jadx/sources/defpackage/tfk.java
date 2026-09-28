package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class tfk {
    public final uh80 a;

    public tfk(uh80 uh80Var) {
        this.a = uh80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        sfk sfkVar;
        if (x1bVar instanceof sfk) {
            sfkVar = (sfk) x1bVar;
            int i = sfkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sfkVar.c = i - Integer.MIN_VALUE;
            } else {
                sfkVar = new sfk(this, x1bVar);
            }
        } else {
            sfkVar = new sfk(this, x1bVar);
        }
        Object obj = sfkVar.a;
        y5b y5bVar = y5b.a;
        int i2 = sfkVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            sfkVar.c = 1;
            Object objA = this.a.a(str, sfkVar);
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

package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class vfk {
    public final uh80 a;

    public vfk(uh80 uh80Var) {
        this.a = uh80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        ufk ufkVar;
        if (x1bVar instanceof ufk) {
            ufkVar = (ufk) x1bVar;
            int i = ufkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ufkVar.c = i - Integer.MIN_VALUE;
            } else {
                ufkVar = new ufk(this, x1bVar);
            }
        } else {
            ufkVar = new ufk(this, x1bVar);
        }
        Object obj = ufkVar.a;
        y5b y5bVar = y5b.a;
        int i2 = ufkVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            ufkVar.c = 1;
            Object objB = this.a.b(str, ufkVar);
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

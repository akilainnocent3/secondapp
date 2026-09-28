package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class xfk {
    public final lx70 a;

    public xfk(lx70 lx70Var) {
        this.a = lx70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        wfk wfkVar;
        if (x1bVar instanceof wfk) {
            wfkVar = (wfk) x1bVar;
            int i = wfkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wfkVar.c = i - Integer.MIN_VALUE;
            } else {
                wfkVar = new wfk(this, x1bVar);
            }
        } else {
            wfkVar = new wfk(this, x1bVar);
        }
        Object obj = wfkVar.a;
        y5b y5bVar = y5b.a;
        int i2 = wfkVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            wfkVar.c = 1;
            Object objD = this.a.d(wfkVar);
            return objD == y5bVar ? y5bVar : objD;
        }
        if (i2 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

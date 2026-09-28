package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class nfk {
    public final x9f0 a;

    public nfk(x9f0 x9f0Var) {
        x9f0Var.getClass();
        this.a = x9f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        mfk mfkVar;
        if (x1bVar instanceof mfk) {
            mfkVar = (mfk) x1bVar;
            int i = mfkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mfkVar.c = i - Integer.MIN_VALUE;
            } else {
                mfkVar = new mfk(this, x1bVar);
            }
        } else {
            mfkVar = new mfk(this, x1bVar);
        }
        Object obj = mfkVar.a;
        y5b y5bVar = y5b.a;
        int i2 = mfkVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            mfkVar.c = 1;
            Object objB = this.a.b(str, mfkVar);
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

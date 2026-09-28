package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class zi7 {
    public final sr10 a;

    public zi7(sr10 sr10Var) {
        sr10Var.getClass();
        this.a = sr10Var;
    }

    public static /* synthetic */ Object b(zi7 zi7Var, int i, String str, Long l, tje0 tje0Var, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            l = null;
        }
        return zi7Var.a(1, i, str, l, tje0Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(int i, int i2, String str, Long l, x1b x1bVar) {
        yi7 yi7Var;
        Object bVar;
        if (x1bVar instanceof yi7) {
            yi7Var = (yi7) x1bVar;
            int i3 = yi7Var.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yi7Var.c = i3 - Integer.MIN_VALUE;
            } else {
                yi7Var = new yi7(this, x1bVar);
            }
        } else {
            yi7Var = new yi7(this, x1bVar);
        }
        yi7 yi7Var2 = yi7Var;
        Object objT = yi7Var2.a;
        y5b y5bVar = y5b.a;
        int i4 = yi7Var2.c;
        try {
            if (i4 == 0) {
                uj50.b(objT);
                zi50.a aVar = zi50.b;
                sr10 sr10Var = this.a;
                yi7Var2.c = 1;
                objT = sr10Var.t(i, i2, str, l, yi7Var2);
                if (objT == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i4 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objT);
            }
            bVar = (wi7) objT;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object wi7Var = new wi7("NONE");
        if (bVar instanceof zi50.b) {
            bVar = wi7Var;
        }
        return ((wi7) bVar).a.equals("INSUFFICIENT_FUNDS") ? xi7.a.a : xi7.b.a;
    }
}

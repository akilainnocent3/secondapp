package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class w9f0 implements q9f0 {
    public final u7f0 a;

    public w9f0(u7f0 u7f0Var) {
        this.a = u7f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.q9f0
    public final Object a(int i, x1b x1bVar, String str, String str2) {
        u9f0 u9f0Var;
        if (x1bVar instanceof u9f0) {
            u9f0Var = (u9f0) x1bVar;
            int i2 = u9f0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u9f0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                u9f0Var = new u9f0(this, x1bVar);
            }
        } else {
            u9f0Var = new u9f0(this, x1bVar);
        }
        Object obj = u9f0Var.a;
        y5b y5bVar = y5b.a;
        int i3 = u9f0Var.c;
        if (i3 == 0) {
            uj50.b(obj);
            u9f0Var.c = 1;
            Object objB = this.a.b(str, str2, i, u9f0Var);
            return objB == y5bVar ? y5bVar : objB;
        }
        if (i3 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.q9f0
    public final Object b(String str, x1b x1bVar) {
        v9f0 v9f0Var;
        if (x1bVar instanceof v9f0) {
            v9f0Var = (v9f0) x1bVar;
            int i = v9f0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v9f0Var.c = i - Integer.MIN_VALUE;
            } else {
                v9f0Var = new v9f0(this, x1bVar);
            }
        } else {
            v9f0Var = new v9f0(this, x1bVar);
        }
        Object obj = v9f0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = v9f0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            v9f0Var.c = 1;
            Object objA = this.a.a(str, v9f0Var);
            return objA == y5bVar ? y5bVar : objA;
        }
        if (i2 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.q9f0
    public final Object c(String str, x1b x1bVar) {
        t9f0 t9f0Var;
        if (x1bVar instanceof t9f0) {
            t9f0Var = (t9f0) x1bVar;
            int i = t9f0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t9f0Var.c = i - Integer.MIN_VALUE;
            } else {
                t9f0Var = new t9f0(this, x1bVar);
            }
        } else {
            t9f0Var = new t9f0(this, x1bVar);
        }
        Object obj = t9f0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = t9f0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            t9f0Var.c = 1;
            Object objE = this.a.e(str, t9f0Var);
            return objE == y5bVar ? y5bVar : objE;
        }
        if (i2 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.q9f0
    public final Object d(String str, String str2, int i, String str3, x1b x1bVar) {
        r9f0 r9f0Var;
        if (x1bVar instanceof r9f0) {
            r9f0Var = (r9f0) x1bVar;
            int i2 = r9f0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r9f0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                r9f0Var = new r9f0(this, x1bVar);
            }
        } else {
            r9f0Var = new r9f0(this, x1bVar);
        }
        r9f0 r9f0Var2 = r9f0Var;
        Object obj = r9f0Var2.a;
        y5b y5bVar = y5b.a;
        int i3 = r9f0Var2.c;
        if (i3 == 0) {
            uj50.b(obj);
            r9f0Var2.c = 1;
            Object objD = this.a.d(str, str2, i, str3, r9f0Var2);
            return objD == y5bVar ? y5bVar : objD;
        }
        if (i3 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.q9f0
    public final Object e(String str, String str2, int i, String str3, x1b x1bVar) {
        s9f0 s9f0Var;
        if (x1bVar instanceof s9f0) {
            s9f0Var = (s9f0) x1bVar;
            int i2 = s9f0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s9f0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                s9f0Var = new s9f0(this, x1bVar);
            }
        } else {
            s9f0Var = new s9f0(this, x1bVar);
        }
        s9f0 s9f0Var2 = s9f0Var;
        Object obj = s9f0Var2.a;
        y5b y5bVar = y5b.a;
        int i3 = s9f0Var2.c;
        if (i3 == 0) {
            uj50.b(obj);
            s9f0Var2.c = 1;
            Object objC = this.a.c(str, str2, i, str3, s9f0Var2);
            return objC == y5bVar ? y5bVar : objC;
        }
        if (i3 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

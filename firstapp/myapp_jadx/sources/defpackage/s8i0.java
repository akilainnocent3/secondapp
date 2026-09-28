package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s8i0 {
    public final v8i0 a;
    public final r8i0.c b;
    public final cyb c;
    public final npe0 d;

    public s8i0(v8i0 v8i0Var, r8i0.c cVar, cyb cybVar) {
        v8i0Var.getClass();
        cVar.getClass();
        cybVar.getClass();
        this.a = v8i0Var;
        this.b = cVar;
        this.c = cybVar;
        this.d = new npe0();
    }

    public final j8i0 a(dq7 dq7Var, String str) {
        j8i0 j8i0Var;
        j8i0 j8i0VarC;
        synchronized (this.d) {
            try {
                v8i0 v8i0Var = this.a;
                v8i0Var.getClass();
                j8i0Var = (j8i0) v8i0Var.a.get(str);
                if (dq7Var.h(j8i0Var)) {
                    Object obj = this.b;
                    if (obj instanceof r8i0.e) {
                        j8i0Var.getClass();
                        ((r8i0.e) obj).d(j8i0Var);
                    }
                    j8i0Var.getClass();
                } else {
                    dsw dswVar = new dsw(this.c);
                    dswVar.a.put(r8i0.b, str);
                    r8i0.c cVar = this.b;
                    cVar.getClass();
                    try {
                        try {
                            j8i0VarC = cVar.b(dq7Var, dswVar);
                        } catch (AbstractMethodError unused) {
                            j8i0VarC = cVar.c(tgp.b(dq7Var));
                        }
                    } catch (AbstractMethodError unused2) {
                        j8i0VarC = cVar.a(tgp.b(dq7Var), dswVar);
                    }
                    j8i0Var = j8i0VarC;
                    v8i0 v8i0Var2 = this.a;
                    v8i0Var2.getClass();
                    j8i0Var.getClass();
                    j8i0 j8i0Var2 = (j8i0) v8i0Var2.a.put(str, j8i0Var);
                    if (j8i0Var2 != null) {
                        j8i0Var2.clear$lifecycle_viewmodel_release();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j8i0Var;
    }
}

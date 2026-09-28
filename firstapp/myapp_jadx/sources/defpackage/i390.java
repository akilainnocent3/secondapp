package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class i390 {
    public final sr10 a;
    public jvd0 b;
    public jvd0 c;
    public jvd0 d;

    public i390(sr10 sr10Var) {
        sr10Var.getClass();
        this.a = sr10Var;
    }

    public final synchronized c9p a(et7 et7Var) {
        jvd0 jvd0Var = this.d;
        if (jvd0Var != null && jvd0Var.isActive()) {
            return jvd0Var;
        }
        jvd0 jvd0VarC = ej5.c(et7Var, null, null, new f390(this, null), 3);
        this.d = jvd0VarC;
        return jvd0VarC;
    }

    public final synchronized c9p b(et7 et7Var, log0 log0Var) {
        log0Var.getClass();
        jvd0 jvd0Var = this.b;
        if (jvd0Var != null && jvd0Var.isActive()) {
            return jvd0Var;
        }
        jvd0 jvd0VarC = ej5.c(et7Var, null, null, new g390(log0Var, this, null), 3);
        this.b = jvd0VarC;
        return jvd0VarC;
    }

    public final synchronized c9p c(et7 et7Var, log0 log0Var) {
        log0Var.getClass();
        jvd0 jvd0Var = this.c;
        if (jvd0Var != null && jvd0Var.isActive()) {
            return jvd0Var;
        }
        jvd0 jvd0VarC = ej5.c(et7Var, null, null, new h390(log0Var, this, null), 3);
        this.c = jvd0VarC;
        return jvd0VarC;
    }
}

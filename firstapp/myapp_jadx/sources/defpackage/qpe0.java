package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qpe0 {
    public final jwd0 a;
    public final Object b = new Object();

    public qpe0(jwd0 jwd0Var) {
        this.a = jwd0Var;
    }

    public final boolean a(ivj0 ivj0Var) {
        boolean zContainsKey;
        synchronized (this.b) {
            zContainsKey = this.a.a.containsKey(ivj0Var);
        }
        return zContainsKey;
    }

    public final iwd0 b(ivj0 ivj0Var) {
        iwd0 iwd0VarA;
        ivj0Var.getClass();
        synchronized (this.b) {
            iwd0VarA = this.a.a(ivj0Var);
        }
        return iwd0VarA;
    }

    public final List<iwd0> c(String str) {
        List<iwd0> listB;
        str.getClass();
        synchronized (this.b) {
            listB = this.a.b(str);
        }
        return listB;
    }

    public final iwd0 d(ivj0 ivj0Var) {
        iwd0 iwd0VarC;
        synchronized (this.b) {
            iwd0VarC = this.a.c(ivj0Var);
        }
        return iwd0VarC;
    }
}

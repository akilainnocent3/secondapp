package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hqe0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ iqe0 b;

    public hqe0(iqe0 iqe0Var, String str) {
        this.b = iqe0Var;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        owj0 owj0Var;
        yy20 yy20Var = this.b.a.f;
        String str = this.a;
        synchronized (yy20Var.k) {
            try {
                ayj0 ayj0VarC = yy20Var.c(str);
                owj0Var = ayj0VarC != null ? ayj0VarC.a : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (owj0Var == null || !owj0Var.c()) {
            return;
        }
        synchronized (this.b.c) {
            this.b.f.put(jxj0.a(owj0Var), owj0Var);
            iqe0 iqe0Var = this.b;
            this.b.i.put(jxj0.a(owj0Var), quj0.a(iqe0Var.v, owj0Var, iqe0Var.b.b(), this.b));
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mf6 implements Runnable {
    public final /* synthetic */ qf6 a;

    @Override // java.lang.Runnable
    public final void run() {
        qf6 qf6Var = this.a;
        synchronized (qf6Var.a) {
            if (qf6Var.b.isEmpty()) {
                return;
            }
            try {
                qf6Var.o(qf6Var.b);
                qf6Var.b.clear();
            } catch (Throwable th) {
                qf6Var.b.clear();
                throw th;
            }
        }
    }
}

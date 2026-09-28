package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class lyf0<T> implements Runnable {
    public final qis<T> a;
    public final bc6 b;

    public lyf0(qis qisVar, bc6 bc6Var) {
        qisVar.getClass();
        this.a = qisVar;
        this.b = bc6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t;
        qis<T> qisVar = this.a;
        boolean zIsCancelled = qisVar.isCancelled();
        bc6 bc6Var = this.b;
        if (zIsCancelled) {
            bc6Var.cancel(null);
            return;
        }
        try {
            zi50.a aVar = zi50.b;
            boolean z = false;
            while (true) {
                try {
                    t = qisVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            bc6Var.resumeWith(t);
        } catch (ExecutionException e) {
            zi50.a aVar2 = zi50.b;
            Throwable cause = e.getCause();
            cause.getClass();
            bc6Var.resumeWith(new zi50.b(cause));
        }
    }
}

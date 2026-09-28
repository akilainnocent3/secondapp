package defpackage;

import androidx.work.d;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class gyj0 {
    public static final String a = jgt.g("WorkerWrapper");

    public static final Object a(qis qisVar, d dVar, tje0 tje0Var) {
        V v;
        try {
            if (!qisVar.isDone()) {
                bc6 bc6Var = new bc6(1, yzo.b(tje0Var));
                bc6Var.q();
                qisVar.k(new lyf0(qisVar, bc6Var), kqe.a);
                bc6Var.t(new d8g(1, dVar, qisVar));
                Object objO = bc6Var.o();
                y5b y5bVar = y5b.a;
                return objO;
            }
            boolean z = false;
            while (true) {
                try {
                    v = qisVar.get();
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
            return v;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}

package defpackage;

import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class myf0<T> implements Runnable {
    public final qis<T> a;
    public final bc6 b;

    public myf0(qis qisVar, bc6 bc6Var) {
        qisVar.getClass();
        this.a = qisVar;
        this.b = bc6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qis<T> qisVar = this.a;
        boolean zIsCancelled = qisVar.isCancelled();
        bc6 bc6Var = this.b;
        if (zIsCancelled) {
            bc6Var.cancel(null);
            return;
        }
        try {
            zi50.a aVar = zi50.b;
            bc6Var.resumeWith(v4.f(qisVar));
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                Intrinsics.l();
            }
            zi50.a aVar2 = zi50.b;
            bc6Var.resumeWith(uj50.a(cause));
        }
    }
}
